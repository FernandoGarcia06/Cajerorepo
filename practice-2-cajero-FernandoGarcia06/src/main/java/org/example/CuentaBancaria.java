package org.example;

public class CuentaBancaria {
    private double saldo;
    private String titular;
    private String numeroCuenta;

    public CuentaBancaria(String titular,String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }


public void depositar(double cantidad){
    if(cantidad>0){
        saldo += cantidad;
        System.out.println("Depósito exitoso. Nuevo saldo: ");    
    }else{
        System.out.println("La cantidad a depositar debe ser mayor que cero.");
    }

}

public void retirar(double cantidad){
    if(cantidad>0 && cantidad<= saldo){
        saldo -= cantidad;
        System.out.println("Retiro exitoso");
    } else{
        System.out.println("Fondos insuficientes o cantidad inválida."); 
    }
}

 public double getSaldo(){
    return saldo;
 }

 public void informacionCuenta(){
    System.out.println("Titular: " + titular);
    System.out.println("Número de Cuenta: " + numeroCuenta);
    System.out.println("Saldo: " + saldo);
 }

 
}