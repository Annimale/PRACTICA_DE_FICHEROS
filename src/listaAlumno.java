
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
public class listaAlumno {

    // ArrayList<alumno> listaAlumnito = new ArrayList();
    public static void ponerDatos(ArrayList<alumno> alumnos) {
        Scanner scanner = new Scanner(System.in);
        
        String carnet = "";
        do {
            System.out.print("Ingrese el carnet del alumno: ");
            carnet = scanner.nextLine();
            if (carnet.isEmpty()) {
                System.out.println("Error: el carnet no puede estar vacio.");
            }
        } while (carnet.isEmpty());
        
        String nombre = "";
        do {
            System.out.print("Ingrese el nombre del alumno: ");
            nombre = scanner.nextLine();
            if (nombre.isEmpty()) {
                System.out.println("Error: el nombre no puede estar vacio.");
            }
        } while (nombre.isEmpty());
        
        String apellidos = "";
        do {
            System.out.print("Ingrese los apellidos del alumno: ");
            apellidos = scanner.nextLine();
            if (apellidos.isEmpty()) {
                System.out.println("Error: los apellidos no pueden estar vacios.");
            }
        } while (apellidos.isEmpty());
        
        double nota1 = 0;
        boolean nota1Valida = false;
        do {
            try {
                System.out.print("Ingrese la nota 1 del alumno: ");
                nota1 = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea después de leer el double
                nota1Valida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: la nota debe ser un numero.");
                scanner.nextLine(); // Consumir el valor incorrecto ingresado por el usuario
            }
        } while (!nota1Valida);
        
        double nota2 = 0;
        boolean nota2Valida = false;
        do {
            try {
                System.out.print("Ingrese la nota 2 del alumno: ");
                nota2 = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea después de leer el double
                nota2Valida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: la nota debe ser un numero.");
                scanner.nextLine(); // Consumir el valor incorrecto ingresado por el usuario
            }
        } while (!nota2Valida);
        
        double nota3 = 0;
        boolean nota3Valida = false;
        do {
            try {
                System.out.print("Ingrese la nota 3 del alumno: ");
                nota3 = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea después de leer el double
                nota3Valida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: la nota debe ser un numero.");
                scanner.nextLine(); // Consumir el valor incorrecto ingresado por el usuario
            }
        } while (!nota3Valida);
        
        alumno alumno = new alumno(carnet, nombre, apellidos, nota1, nota2, nota3);
        alumnos.add(alumno);
        System.out.println("Alumno agregado correctamente.");
    }
    
    public static void llenarArchivo(ArrayList<alumno> lista) {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
            salida.writeObject(lista);
            salida.close();
            System.out.println("El archivo se ha guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
    
    public static void buscarAlumnoPorNombre(ArrayList<alumno> alumnos) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombre = scanner.nextLine();
        
        boolean encontrado = false;
        
        for (int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i);
            if (alumnos.get(i).getNombre().equals(nombre)) {
                System.out.println(alumnos.get(i).toString());
                encontrado = true;
                
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún alumno con ese nombre.");
        }
    }

    public static void modificarAlumnoPorCarnet(ArrayList<alumno> alumnos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el carnet del alumno que deseas modificar: ");
        String carnete = scanner.nextLine();
        
        boolean encontrado = false;
        for (alumno alumno : alumnos) {
            if (alumno.getCarnet().equalsIgnoreCase(carnete)) {
                String carnet = "";
                do {
                    System.out.print("Ingrese el carnet del alumno: ");
                    carnet = scanner.nextLine();
                    alumno.setCarnet(carnet);
                    if (carnet.isEmpty()) {
                        System.out.println("Error: el carnet no puede estar vacio.");
                    }
                } while (carnet.isEmpty());
                
                String nombre = "";
                do {
                    System.out.print("Ingrese el nombre del alumno: ");
                    nombre = scanner.nextLine();
                    alumno.setNombre(nombre);
                    if (nombre.isEmpty()) {
                        System.out.println("Error: el nombre no puede estar vacio.");
                    }
                } while (nombre.isEmpty());
                
                String apellidos = "";
                do {
                    System.out.print("Ingrese los apellidos del alumno: ");
                    apellidos = scanner.nextLine();
                    alumno.setApellidos(apellidos);
                    if (apellidos.isEmpty()) {
                        System.out.println("Error: los apellidos no pueden estar vacios.");
                    }
                } while (apellidos.isEmpty());
                
                double nota1 = 0;
                boolean nota1Valida = false;
                do {
                    try {
                        System.out.print("Ingrese la nota 1 del alumno: ");
                        nota1 = scanner.nextDouble();
                        scanner.nextLine();
                        alumno.setNota1(nota1);                        // Consumir el salto de línea después de leer el double
                        nota1Valida = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: la nota debe ser un numero.");
                        scanner.nextLine(); // Consumir el valor incorrecto ingresado por el usuario
                    }
                } while (!nota1Valida);
                
                double nota2 = 0;
                boolean nota2Valida = false;
                do {
                    try {
                        System.out.print("Ingrese la nota 2 del alumno: ");
                        nota2 = scanner.nextDouble();
                        scanner.nextLine();
                        alumno.setNota2(nota2); // Consumir el salto de línea después de leer el double
                        nota2Valida = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: la nota debe ser un numero.");
                        scanner.nextLine(); // Consumir el valor incorrecto ingresado por el usuario
                    }
                } while (!nota2Valida);
                
                double nota3 = 0;
                boolean nota3Valida = false;
                do {
                    try {
                        System.out.print("Ingrese la nota 3 del alumno: ");
                        nota3 = scanner.nextDouble();
                        scanner.nextLine();
                        alumno.setNota3(nota3);// Consumir el salto de línea después de leer el double
                        nota3Valida = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Error: la nota debe ser un numero.");
                        scanner.nextLine(); // Consumir el valor incorrecto ingresado por el usuario
                    }
                } while (!nota3Valida);
                
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró un alumno con el carnet " + carnete);
        }
    }
    public static ArrayList<alumno> pasarALista() {
    ArrayList<alumno> listaAlumnos = new ArrayList();
    try {
        FileInputStream fis = new FileInputStream("alumnos.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boolean eof = false;
        while (!eof) {
            try {
                alumno alumno = (alumno) ois.readObject();
                listaAlumnos.add(alumno);
            } catch (EOFException e) {
                eof = true;
            }
        }
        ois.close();
        fis.close();
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }
    return listaAlumnos;
}
public static void pasarFichero5(ArrayList<alumno> lista) {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("alumnos5.dat"));
        for (alumno alumno : lista) {
            if (alumno.calcularMedia() > 5) {
                writer.write(alumno.getCarnet() + " " + alumno.calcularMedia()+"\n");
                writer.newLine();
            }
        }
        writer.close();
        System.out.println("Archivo alumnos5.dat creado exitosamente.");
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo.");
        e.printStackTrace();
    }
}
public static void visualizarFichero5() {
    try {
        BufferedReader br = new BufferedReader(new FileReader("alumnos5.dat"));
        String linea = br.readLine();
        System.out.println("Listado de alumnos con nota media mayor a 5:");
        while (linea != null) {
            String[] campos = linea.split(",");
            String carnet = campos[0];
            double notaMedia = alumno.calcularMedia(Double.parseDouble(campos[1]), Double.parseDouble(campos[2]), Double.parseDouble(campos[3]));
            if (notaMedia > 5) {
                System.out.println("Carnet: " + carnet + ", Nota media: " + notaMedia);
            }
            linea = br.readLine();
        }
        br.close();
    } catch (IOException e) {
        System.out.println("Error al leer el archivo");
    }
}


    
}
