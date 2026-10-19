
package com.mycompany.polimorfismo;


public class main {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoFijo("Juan", 4500000);
        empleados[1] = new EmpleadoPorHora("Pedro", 160, 25000);

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.nombre);
            System.out.println("Sueldo: " + empleado.calcularSueldo());
            System.out.println("-------------------------");
        }
    }
}

