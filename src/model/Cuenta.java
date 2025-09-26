package model;


public class Cuenta {
    private String nombre_del_banco;
    private Double saldo_actual;
    private Tipocuenta tipo;
}

public Cuenta(String nombre_del_banco, Double saldo_actual, Tipocuenta tipo){
        this.nombre_del_banco = nombre_del_banco;
        this.saldo_actual = saldo_actual;
        this.tipo = tipo;
}

// Getters

public String getnombre_del_banco() {
    return nombre_del_banco;
}

public Double getsaldoactual() {
    return saldo_actual;
}

public TipoPokemon gettipo() {
    return tipo;
}

// Setters
public void setnombre_del_banco(String nombre_del_banco) {
    this.nombre_del_banco = nombre_del_banco;
}

public void setsaldo_actual(Double saldo_actual) {
    this.saldo_actual = saldo_actual;
}

public void setType(TipoPokemon type) {
    this.tipo = tipo;
}

if saldo_actual = ()


