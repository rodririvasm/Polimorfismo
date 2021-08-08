package Test;

import DOmain.*;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado=new Empleado("rodrigo",15000);
        //System.out.println("Empleado: "+empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente=new Gerente("rodrigo",15000,"sistemas");
        //System.out.println("Gerente: "+gerente.obtenerDetalles());
        imprimir(gerente);
    }
    public static void imprimir(Empleado empleado){
        System.out.println("empleado: "+empleado.obtenerDetalles());
    }
}
