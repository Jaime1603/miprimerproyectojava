package vista;

import modelo.Estudiante;

import java.util.Scanner;

public class UsaEstudiantesTecnologia {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("---Bienvenido---");

        System.out.println("Ingresela cantidad de estudiantes ");
        int contador = scanner.nextInt();
        Estudiante[] estudiantes = new Estudiante[contador];
        for (int i = 0 ; i < contador ; i++){
            int codigo;
            while (true) {
                System.out.println("Ingrese el codigo de estudiante " + (i + 1)  + ":");
                codigo = scanner.nextInt();
                if (codigo > 21000){
                    break;
                }else {
                    System.out.println("Codigo invalido. intentelo de nuevo: ");
                }
            }
            scanner.nextLine();
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            double notaDesarrollo;
            while (true){
                System.out.println("Ingrese la nota de desarrollo del estudiante " + (i+1) + ":");
                notaDesarrollo = scanner.nextDouble();
                if (notaDesarrollo > 5.0 || notaDesarrollo < 0.0){
                    System.out.println("Nota Invalida. Ingrese de nuevo");
                }else{
                    break;
                }
            }
            double notaMate;
            while (true){
                System.out.println("Ingrese la nota de matematicas del estudiante " + (i+1) + ":");
                notaMate = scanner.nextDouble();
                if (notaMate > 5.0 || notaMate < 0.0){
                    System.out.println("Nota Invalida. Ingrese de nuevo: ");
                }else{
                    break;
                }
            }
            estudiantes[i] = new Estudiante(codigo, nombre, notaDesarrollo, notaMate);
            }
        System.out.println("---INFORMACIÓN DE LOS ESTUDIANTES---");
        for (int i = 0 ; i < contador ; i++){
            System.out.println(estudiantes[i].toString());
        }
        }



}