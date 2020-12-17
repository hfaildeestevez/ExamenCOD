package com.cod;

public class Main {
    public static void main(String[] args) {
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

    public static boolean verConexion1(String user) {
        Comprobacion obx1 = new Comprobacion(user);
        System.out.println("Conectando a " + obx1.ip + ", con el usuario " + user);
        return obx1.con();
    }

    public static boolean verConexion2() {
        Comprobacion obx2 = new Comprobacion();
        System.out.println("Conectando a " + obx2.ip + ", con el usuario " + obx2.user);
        return obx2.con();
    }
}
