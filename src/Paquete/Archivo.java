package Paquete;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class Archivo {

    //Atriburos

    private String Autor;
    private String Titulo;
    private int anioSalida;
    private String Genero;

    //Fin Atributos

    //Constructores

    public Archivo(String autor, String titulo, int anioSalida, String genero) {
        Autor = autor;
        Titulo = titulo;
        this.anioSalida = anioSalida;
        Genero = genero;
    }


    //Fin Constructores

    //Set y Get

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(int anioSalida) {
        this.anioSalida = anioSalida;
    }


    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }


    //Fin Set y Get

    //Funciones

    public void crearArchivo(){

        try {
            String ruta = "Registros del Banco.txt";
            String contenido = "Registro de usuarios y transacciones";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escArchivo(){

        try
        {
            String filePath = "Registros del Banco.txt";
            FileOutputStream f = new FileOutputStream(filePath, true);
            String lineToAppend = "\r\nNombre: "+Titulo+" "+ Autor+" con CI: "+anioSalida+" Realizo: "+Genero;
            byte[] byteArr = lineToAppend.getBytes(); //converting string into byte array
            f.write(byteArr);
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
