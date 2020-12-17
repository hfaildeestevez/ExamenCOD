package com.cod;

public class Comprobacion {
    private static Comprobacion instance=null;
    /** Declaramos variables de la clase **/
    String user = "";
    String ip = "127.0.0.2";
    /** Declaramos constructor **/
   public Comprobacion() {
        user = "anonymous@danielcastelao.org";
    }
    /** Metodo **/
    public static Comprobacion getInstance(){
       if (instance==null) {instance= new Comprobacion(); }
       return instance;}

   Comprobacion(String parametro1) {
        this.user = parametro1;
    }
    /** Segundo Metodo **/
    public boolean con() {
        if (user != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}

