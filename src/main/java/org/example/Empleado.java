package org.example;

 class Empleado {
    private String nombre;
    private String apellido;
    private int salario;
    private int tiempoContrato;
    private int diasVacaciones;
    private boolean hasVacaciones;

    public Empleado(String nombre, String apellido,int salario, int tiempoContrato){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
        this.tiempoContrato=tiempoContrato;
        this.diasVacaciones=diasVacaciones;
        this.hasVacaciones=hasVacaciones;

    }
    public void Informacion(){
        System.out.println("Nombre :"+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Salario: $"+salario);
        System.out.println("Tiempo de Contrato: "+tiempoContrato);
    }
    //GETTER AND SETTERS
    public void setNombre(String newnombre){
        nombre=newnombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void  setApellido(String newapellido){
        apellido=newapellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setSalario(int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return salario;
    }
    public void setTiempoContrato(int tiempoContrato){
        this.tiempoContrato=tiempoContrato;
    }
    public int getTiempoContrato(){
        return tiempoContrato;
    }

     public void setDiasVacaciones(int diasVacaciones) {
         this.diasVacaciones = diasVacaciones;
     }

     public int getDiasVacaciones() {
         return diasVacaciones;
     }

     public void sethasVacaciones(boolean hasVacaciones){
         this.hasVacaciones=hasVacaciones;
    }

     public boolean isHasVacaciones() {
         return hasVacaciones;
     }
     //FIN GETTER AND SETTERS

     public int pagarFiniquito(){
        int saldoFiniquito=salario*tiempoContrato;
        return saldoFiniquito;
    }
     public int darVacaciones() {
         return 2 * tiempoContrato;



     }
}
