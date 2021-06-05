package mediators;

import entidades.Aula;
import entidades.Marcajes;
import entidades.Producto;

import java.io.File;
import java.util.ArrayList;

public class Mediator {

    private ArrayList<Aula> aulas;
    private ArrayList<Producto> productos;
    private ArrayList<Marcajes> marcajes;
    private boolean online;

    public Mediator(){

    }

    /*public Mediator(boolean online){
        this.online = online;
    }*/

    public void setOnline(){
        this.online = Menu.preguntarOffOnline();
    }

    public void iniciar(){

        if(this.online){
            //CARGAR PRODUCTOS DE LA BASE DE DATOS
        } else{
            recuperarFicheros();
        }
    }

    public void recuperarFicheros(){
        File datos = new File("src/resources/datos.txt");
        if(datos.exists()){

        }
    }

    public static boolean CompruebaIP(String IP){
        boolean res = false;

        if(IP.matches("[\\d]{3}+\\.[\\d]{1,3}+\\.[\\d]{1,3}")){
            res = true;
        }
        return res;
    }

}
