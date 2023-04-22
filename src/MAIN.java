
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author skril
 */
public class MAIN {

    public static void main(String[] args) {
        ArrayList<alumno>lista=new ArrayList();
        Scanner tcl = new Scanner(System.in);
        boolean repetir = true;
        do {
            System.out.print("------ PRACTICA FICHEROS -------\n\n1. Introducir datos\n2. Buscar por nombre\n3. Modificar \n4. Borrar por carnet\n5. Guardar Aprobados \n6. Visualizar aprobados \n7 Guardar en alumnos.dat \n0. Salir\n\nSeleccione una opcion: ");
            byte eleccion = tcl.nextByte();
            repetir = true;
            switch (eleccion) {
                case 0:
                    System.out.println("Usted ha salido del programa");
                    repetir = false;
                    break;
                case 1:
                    listaAlumno.ponerDatos(lista);
                    break;
                case 2:
                    listaAlumno.buscarAlumnoPorNombre(lista);
                    break;
                case 3:
                    listaAlumno.modificarAlumnoPorCarnet(lista);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("No has introducido ninguna de las opciones dadas");
            }
        } while (repetir);

    }

}
