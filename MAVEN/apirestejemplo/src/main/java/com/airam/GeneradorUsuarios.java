package com.airam;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class GeneradorUsuarios {
    private static int idCounter = 1; // ID autoincremental

    public static Set<Usuario> generarUsuariosUnicos(int cantidad) {
        Faker faker = new Faker();
        Set<Usuario> usuarios = new HashSet<>();

        while (usuarios.size() < cantidad) {
            String nombre = faker.name().fullName();
            String email = faker.internet().emailAddress();
            String password = faker.internet().password(8, 16, true, true, true);
            int saldo = faker.number().numberBetween(1000, 100000);
            String id = String.valueOf(idCounter++);

            Usuario nuevoUsuario = new Usuario(nombre, email, password, saldo, id);

            // Garantizar que no haya emails duplicados
            if (!usuarios.contains(nuevoUsuario)) {
                usuarios.add(nuevoUsuario);
            }
        }

        return usuarios;
    }


    public static void guardarUsuariosEnJSON(Set<Usuario> usuarios, String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), usuarios);
            System.out.println("Usuarios guardados en: " + filePath);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Set<Usuario> usuarios = generarUsuariosUnicos(50);
        guardarUsuariosEnJSON(usuarios, "usuarios.json");
    }
}
