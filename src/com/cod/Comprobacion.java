package com.cod;

public class Comprobacion {
    private static Comprobacion instance=null;
    String user = "";
    String ip = "127.0.0.2";

   public Comprobacion() {
        user = "anonymous@danielcastelao.org";
    }
public static Comprobacion getInstance(){
       if (instance==null) {instance= new Comprobacion(); }
       return instance;}

   Comprobacion(String parametro1) {
        this.user = parametro1;
    }

    public boolean con() {
        if (user != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}

