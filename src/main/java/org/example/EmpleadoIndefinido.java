package org.example;

class EmpleadoIndefinido extends Empleado {

    public EmpleadoIndefinido(String nombre, String apellido, int salario, int tiempoContrato) {
        super(nombre, apellido, salario, tiempoContrato);
        if (getTiempoContrato() > 6) {
            sethasVacaciones(true);
        } else {
            sethasVacaciones(false);
        }

    }
@Override
    public int pagarFiniquito() {
        if (getTiempoContrato() >= 12) {
            int bono = 50000;
            int salarioybono = getSalario() + bono;
            return salarioybono * getTiempoContrato();

        }else{
            return super.pagarFiniquito();
        }
    }

    public int darVacaciones() {
        if (isHasVacaciones()) {
            return super.darVacaciones();
        } else {
            throw new Error("El empleado no tiene derecho a vacaciones.");
        }

    }
}



