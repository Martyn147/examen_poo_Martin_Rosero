package Paquete; /*
  * Creado por: Martin Rosero
  * Version 1.0
  * Creado el: 11 / 07 / 2022
*/

import Paquete.Registros.Datos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Archivo archivo = new Archivo("","",0,""); //Creamos el objeto para la clase Paquete.Archivo

        archivo.crearArchivo(); //LLamamos a la funcion para crear un archivo txt

        //Variables necesarias
        Scanner in = new Scanner(System.in);
        boolean var = false, esc = false;
        int menu = 0;
        String autor;
        String titulo;
        int anioSalida;
        String descGuit;

        int auxRock = 0, auxDatos = 0;

        //Menu para el ingreso de datos
        System.out.println("----------Ingreso de Clientes y Registros----------");
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1) Ingreso de datos");
        System.out.println("2) Ingreso de dinero");
        System.out.println("3) Retiro de dinero");
        System.out.println("4) Transaccion a otra cuenta");
        System.out.println("5) Salir");
        System.out.println("----------------------------------------");

        while (esc == false) {

            System.out.println("Ingrese el numero de la opcion deseada: ");
            menu = in.nextInt();
            switch (menu) {

                case 1: //Datos
                    System.out.println("Usted ha seleccionado Ingreso de datos");
                    System.out.println("Ingrese su nombre");
                    titulo = in.next();
                    System.out.println("Ingrese su apellido");
                    autor = in.next();
                    System.out.println("Ingrese su cedula");
                    anioSalida = in.nextInt();

                    auxRock++;

                    Datos IngDatos = new Datos(autor,titulo,anioSalida); //Creacion del objeto de la clase respectiva


                    //Set a la clase de Archivos
                    archivo.setAnioSalida(anioSalida);
                    archivo.setAutor(autor);
                    archivo.setGenero("El ingreso de sus datos");
                    archivo.setTitulo(titulo);

                    //Escribimos el archivo
                    archivo.escArchivo();

                    break;

                case 2: //Ingreso
                    System.out.println("Usted ha seleccionado Ingreso de dinero");
                    System.out.println("Ingrese Nombre");
                    titulo = in.next();
                    System.out.println("Ingrese correo");
                    autor =in.next();
                    System.out.println("Ingrese cantidad de dinero solo en enteros");
                    anioSalida = in.nextInt();

                    auxRock++;

                    Datos IngDinero = new Datos(autor,titulo,anioSalida);//Creacion del objeto de la clase respectiva

                    //Set a la clase de Archivos
                    archivo.setAnioSalida(anioSalida);
                    archivo.setAutor(autor);
                    archivo.setGenero("Ingreso de dinero");
                    archivo.setTitulo(titulo);

                    //Escribimos el archivo
                    archivo.escArchivo();
                    break;

                case 3: //Retiro
                    System.out.println("Usted ha seleccionado Retiro de dinero");
                    System.out.println("Ingrese su nombre");
                    titulo = in.next();
                    System.out.println("Ingrese su correo");
                    autor = in.next();
                    System.out.println("Ingrese ");
                    anioSalida = in.nextInt();

                    auxRock++;

                    Datos IngRetiro = new Datos(autor,titulo,anioSalida);//Creacion del objeto de la clase respectiva

                    archivo.setAnioSalida(anioSalida);
                    archivo.setAutor(autor);
                    archivo.setGenero("Retiro de dinero");
                    archivo.setTitulo(titulo);

                    archivo.escArchivo();
                    break;

                case 4: //Transaciones
                    System.out.println("Usted ha seleccionado Transaccion a otra cuenta");
                    System.out.println("Ingrese su nombre");
                    titulo =in.next();
                    System.out.println("Ingrese el nombre del beneficiario");
                    autor = in.next();
                    System.out.println("Ingrese la cantidad de dinero");
                    anioSalida = in.nextInt();

                    auxRock++;

                    Datos TrancDinero = new Datos(autor,titulo,anioSalida);

                    archivo.setAnioSalida(anioSalida);
                    archivo.setAutor(autor);
                    archivo.setGenero("Romantico");
                    archivo.setTitulo(titulo);

                    archivo.escArchivo();
                    break;

                case 5:  //Salir del bucle
                    System.out.println("Gracias por Preferirnos");
                    esc = true;
                    break;

                default: //Mensaje de error
                    System.out.println("La opcion seleccionada es incorrecta, Ingrese un valor valido");

            }
        }


    }
}
