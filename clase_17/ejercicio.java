package clase_17;

import java.util.Scanner;



public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String[] nombreAlumno = new String[40];
        double[] notaAlumno = new double[40];
        int contAlumnos = 0;

        do {
            System.out.println("MENÚ");
            System.out.println("1. Registro de alumnos");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                
                    System.out.println("Ingrese el nombre del alumno");
                    nombreAlumno[contAlumnos] = sc.nextLine();
                    System.out.println("Ingrese la nota del alumno");
                    notaAlumno[contAlumnos] = sc.nextDouble();
                    contAlumnos++;
                    
                    break;
                case 2:
                if (contAlumnos == 0) {
                    System.out.println("No hay alumnos registrados");
                } else {
                    System.out.println("Alumnos registrados:");
                    for (int i = 0; i < contAlumnos; i++) {
                        System.out.println((i + 1) + "- " + nombreAlumno[i] + " - " + notaAlumno[i]);
                    }
                    }

                    break;

                case 3:
                    if (contAlumnos == 0) {
                        System.out.println("No hay alumnos registrados");
                    } else {
                        double suma = 0;
                        for (int i = 0; i < contAlumnos; i++) {
                            suma += notaAlumno[i];
                        }

                        double promedio = suma / contAlumnos;
                        System.out.println("El promedio de las notas de los alumnos registrados es: " + promedio);
                    }
                case 4:
                    if (contAlumnos == 0) {
                        System.out.println("No hay alumnos registrados");
                    } else {
                        System.out.println("Ingrese el nombre del alumno");
                        String nombreABuscar = sc.nextLine();
                        boolean seEncontro = false;
                        for (int i = 0; i < contAlumnos; i++) {
                            if(nombreABuscar.equalsIgnoreCase(nombreAlumno[i])){
                                System.out.println("La nota del alumno " + nombreAlumno[i] + " es: " + notaAlumno[i]);
                                seEncontro = true;
                            }
                        }
                        if (seEncontro == false) {
                            System.out.println("El alumno no se encontró");
                        }
                    }
                    break;

                case 5:
                    int indiceA=-1;
                    if (contAlumnos == 0) {
                        System.out.println("No hay alumnos registrados");
                    } else {
                        System.out.println("Ingrese el nombre del alumno a modificar");
                        String nombreABuscar = sc.nextLine();
                        boolean seEncontro = false;
                        for (int i = 0; i < contAlumnos; i++) {
                            if(nombreABuscar.equalsIgnoreCase(nombreAlumno[i])){

                                seEncontro = true;
                                indiceA=i;
                            }
                        }
                        if (seEncontro == false) {
                            System.out.println("El alumno no se encontró");
                        }else{
                            System.out.println("Ingrese la nueva nota del alumno (0.0-10.0): ");
                            double nuevanota = sc.nextDouble();
                            notaAlumno[indiceA]=nuevanota;
                        }
                        
                    }
                    break;

                case 6:
                    
                    boolean alumnoEncontrado = false;
                    if(contAlumnos != 0){
                        System.out.println("Ingrese el Nombre del alumno a eliminar: ");
                        String nombreAEliminar = sc.nextLine();
                    for (int i = 0; i < contAlumnos; i++) {
                        if(nombreAEliminar.equalsIgnoreCase(nombreAlumno[i]))
                        {
                            alumnoEncontrado = true;
                            nombreAlumno[i] = "";
                            notaAlumno[i] = 0;
                            System.out.println("Se ha eliminado el alumno de nombre" + " " + nombreAEliminar);

                        }
                    
                    }
                    if (alumnoEncontrado != true) {
                        System.out.println("El alumno no fue encontrado");
                    }
                        
                    }else{
                        System.out.println("No hay alumnos en la lista");
                    }
                    break;
                
                default:
                System.out.println("Opción no válida");
                    break;
            }


        } while (opcion != 7);

        System.out.println("Gracias, hasta nunca");
        sc.close();
    }
}