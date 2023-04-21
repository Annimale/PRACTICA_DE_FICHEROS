
import java.util.ArrayList;
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

    ArrayList<alumno> listaAlumnito = new ArrayList();

    public static void ponerDatos() {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Introduzca el carnet");
        String carnet = tcl.nextLine();
        System.out.println("Introduzca su nombre");
        String nombre = tcl.nextLine();
        System.out.println("Introduzca su apellido");
        String apellidos = tcl.nextLine();
        System.out.println("Introduzca su primera nota");
        double nota1 = tcl.nextInt();
        System.out.println("Introduzca su segunda nota");
        double nota2 = tcl.nextInt();
        System.out.println("Introduzca su tercera nota");
        double nota3 = tcl.nextInt();

        alumno alu = new alumno(carnet, nombre, apellidos, nota1, nota2, nota3);

    }

}
