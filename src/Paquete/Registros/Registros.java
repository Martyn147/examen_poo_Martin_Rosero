//SUPERCLASE DE REGISTROS
package Paquete.Registros;

public class Registros {

    //Atriburos

    private String Autor;
    private String Titulo;
    private int anioSalida;

    //Fin Atributos

    //Constructores

    public Registros(String autor, String titulo, int anioSalida) {
        Autor = autor;
        Titulo = titulo;
        this.anioSalida = anioSalida;
    }

    //Fin Constructores

    //Sett y Gett

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


    //Fin Sett y Gett

    //Metodos

    public void Escucharse(){
        System.out.println("Pueden escucharse");
    }

    //Fin Metodos

}
