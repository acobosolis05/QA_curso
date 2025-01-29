package clase_19;


// Basándote en el ejercicio que ya has realizado, crea un método "esSegura()"
//  que reciba por parámetro un "String" y devuelva un booleano para comprobar
//   que la contraseña cumple con los criterios establecidos. También, crea los métodos:
//    "tieneLongitudCorrecta()", "tieneMayuscula()", "tieneMinuscula()", "tieneNumero()" 
//    y "tieneCaracterEspecial()", 
// que reciban por parámetro un "String" y devuelvan un "booleano".
public class metodoValiContra {

    public static void main(String[] args) {
        String contra = "Hola123*perro";
        
        System.out.println("La contraseña es segura: " + esSegura(contra));
        }

    public static boolean esSegura(String contra) {
        return tieneLongitudCorrecta(contra) && tieneMayuscula(contra) && tieneMinuscula(contra) && tieneNumero(contra) && tieneCaracterEspecial(contra);
        } 

    public static boolean tieneLongitudCorrecta(String contra) {
        if (contra.length() >= 8) {
            return true;
            } else {
                return false;
                }
    }

    public static boolean tieneMayuscula(String contra) {
        for (int i = 0; i < contra.length(); i++) {
            char caracter = contra.charAt(i);
            if (Character.isUpperCase(caracter)) {
                return true;
                }
                }
                return false;
    }

    public static boolean tieneMinuscula(String contra) {
        for (int i = 0; i < contra.length(); i++) {
            char caracter = contra.charAt(i);
            if (Character.isLowerCase(caracter)) {
                return true;
                }
                }
                return false;

    }

    public static boolean tieneNumero(String contra) {
        for (int i = 0; i < contra.length(); i++) {
            char caracter = contra.charAt(i);
            if (Character.isDigit(caracter)) {
                return true;
                }
                }
                return false;
    }

    public static boolean tieneCaracterEspecial(String contra){
        for (int i = 0; i < contra.length(); i++) {
            char caracter = contra.charAt(i);
            if (!Character.isLetterOrDigit(caracter)) {
                return true;
                }
                }
                return false;
    }
} 
