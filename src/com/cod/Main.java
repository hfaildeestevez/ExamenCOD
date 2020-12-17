package com.cod;

public class Main {



    public static void main(String[] args) {
        /** explicamos condiciones que nos dan fallo y acierto **/
        if (verConexion1("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (verConexion2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        ;
    }
    /** Primer metodo para ver el primer usuario conectado con instancia para singleton**/
    public static boolean verConexion1(String user) {
        Comprobacion obx1 =  Comprobacion.getInstance();
        System.out.println("Conectando a " + obx1.ip + ", con el usuario " + user);
        return obx1.con();
    }
    /** Segundo metoo para ver el segundo usuario conectado con instancia para singleton**/
    public static boolean verConexion2() {
        Comprobacion obx2 =  Comprobacion.getInstance();
        System.out.println("Conectando a " + obx2.ip + ", con el usuario " + obx2.user);
        return obx2.con();
    }

}

