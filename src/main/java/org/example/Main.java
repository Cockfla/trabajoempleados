package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            EmpleadoIndefinido empleadoIndefinido = new EmpleadoIndefinido("Juan", "Perez", 300000, 18);
            EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal("Maria", "Gomez", 250000, 4,true,false);

            empleadoIndefinido.Informacion();
            System.out.println("Finiquito: $" + empleadoIndefinido.pagarFiniquito() );
            System.out.println("Días de vacaciones: " +empleadoIndefinido.darVacaciones());
            System.out.println("****************************");
            empleadoTemporal.extenderContrato(3);
            empleadoTemporal.Informacion();
            System.out.println("Días de vacaciones: " + empleadoTemporal.darVacaciones());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }}