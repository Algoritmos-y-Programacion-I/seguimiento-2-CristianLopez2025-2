package model;


public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private Cuenta cuenta[10];



    public Cliente(String nombre, int edad, String cedula){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    // Getters
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCedula(){
        return cedula;
    }

    // Setters

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public void setCedula(String nuevaCedula){
        cedula = nuevaCedula;
    }

     /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue los parametros y retorno que sean pertinentes.
     * Agregue la logica necesaria.
     */
    public void getCuentasList() {

        private Tipocuenta[10] = cuentas;
    
    }

}
