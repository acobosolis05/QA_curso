package com.airam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.nio.charset.StandardCharsets;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class AppTest {
    private final String BASE_URL = "https://67e45b272ae442db76d42195.mockapi.io/api/v1/usuarios";

    // agregar un usuariosn de un archivo JSON

    @Test
    public void agregarUsuario() throws IOException {
        // Leer JSON como String
        String requestBody = new String(
                Files.readAllBytes(Paths.get("C:\\Estudio\\intro_Java\\MAVEN\\apirestejemplo\\usuarios.json")),
                StandardCharsets.UTF_8);

        // Convertir JSON en lista de Maps
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> usuarios = objectMapper.readValue(requestBody,
                new TypeReference<List<Map<String, Object>>>() {
                });

        // Enviar cada usuario individualmente
        for (Map<String, Object> usuario : usuarios) {
            RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(usuario) // Enviar cada usuario correctamente
                    .when()
                    .post(BASE_URL)
                    .then()
                    .statusCode(201); // Verificar respuesta
        }
    }

    // agregar un solo usuario
    @Test
    public void agregarUsuarioNuevo() {
        String requestBody = """
                {
                    "nombre": "airam cobo",
                    "email": "airamcobo@example.com",
                    "password": "1234contra",
                    "saldo": 1000000000
                }
                """;

        given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post(BASE_URL)
                .then()
                .statusCode(201) // Verifica que el usuario se creó correctamente
                .body("nombre", equalTo("airam cobo"))
                .body("email", equalTo("airamcobo@example.com"));
    }

    // inicio de sesión
    @Test
    public void iniciarSesion() {
        given()
                .when()
                .get(BASE_URL + "?email=airamcobo@example.com&password=1234contra")
                .then()
                .statusCode(200) // Verifica que la solicitud es exitosa
                .body("size()", equalTo(1)); // Debe existir solo un usuario con esas credenciales
    }

    // eliminar un usuario
    @Test
    public void eliminarUsuario() {
        String id = "3"; // ID del usuario a eliminar

        given()
                .when()
                .delete(BASE_URL + "/" + id)
                .then()
                .statusCode(200); // Verifica que la eliminación fue exitosa (sin contenido)
    }

    // validar que no hayan correos duplicados
    @Test
    public void validarCorreosUnicos() {
        // Enviar la solicitud GET y obtener la lista de usuarios
        Response response = given()
                .when()
                .get("https://67e45b272ae442db76d42195.mockapi.io/api/v1/usuarios")
                .then()
                .statusCode(200) // Verifica que la solicitud sea exitosa
                .extract()
                .response();

        // Extraer la lista de correos electrónicos
        List<String> emails = response.jsonPath().getList("email");

        // Verificar que los correos sean únicos
        Set<String> uniqueEmails = new HashSet<>(emails);

        if (emails.size() == uniqueEmails.size()) {
            System.out.println("Todos los correos son únicos.");
        } else {
            System.out.println("Hay correos duplicados en la lista.");
        }
    }

    // validar depositar dinero
    @Test
    public void depositarDinero() {
        String id = "51"; // ID del usuario a modificar
        // Primero, obtenemos el saldo actual del usuario
        int saldoActual = given()
                .when()
                .get(BASE_URL + "/" + id)
                .then()
                .statusCode(200)
                .extract()
                .path("saldo"); // Extraemos el saldo actual

        int montoADepositar = 5000;
        int nuevoSaldo = saldoActual + montoADepositar; // Sumamos el monto al saldo actual

        String requestBody = """
                {
                    "saldo": %d
                }
                """
                .formatted(nuevoSaldo); // Usamos formatted para inyectar el nuevo saldo

        // Enviamos la actualización del saldo
        given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .patch(BASE_URL + "/" + id)
                .then()
                .statusCode(200)
                .body("saldo", equalTo(nuevoSaldo)); // Verificamos el nuevo saldo
    }

    // validar retirardinero
    @Test
    public void retirarDinero() {
        String id = "51"; // ID del usuario a modificar
        // Primero, obtenemos el saldo actual del usuario
        int saldoActual = given()
                .when()
                .get(BASE_URL + "/" + id)
                .then()
                .statusCode(200)
                .extract()
                .path("saldo"); // Extraemos el saldo actual

        int montoARetirar = 5000;
        int nuevoSaldo = saldoActual - montoARetirar; // Sumamos el monto al saldo actual

        String requestBody = """
                {
                    "saldo": %d
                }
                """
                .formatted(nuevoSaldo); // Usamos formatted para inyectar el nuevo saldo

        // Enviamos la actualización del saldo
        given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .patch(BASE_URL + "/" + id)
                .then()
                .statusCode(200)
                .body("saldo", equalTo(nuevoSaldo)); // Verificamos el nuevo saldo
    }
}