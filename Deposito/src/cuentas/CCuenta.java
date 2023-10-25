package cuentas;

public class CCuenta {


private String nombre;
private String cuenta;
private double saldo;
private double tipoInterés;

public CCuenta()
{
}

public CCuenta(String nom, String cue, double sal, double tipo)
{
nombre =nom;
cuenta=cue;
saldo=sal;
}

public double estado()
{
return saldo;
}
/**
* 
* @param cantidad Es el dinero a ingresar en la cuenta
* @throws Exception Lanza este error si la cantida recibida es negativa
*/
public void ingresar(double cantidad) throws Exception
{
if (cantidad<0)
throw new Exception("No se puede ingresar una cantidad negativa");
saldo = saldo + cantidad;
}
/**
* 
* @param cantidad Es el dinero a quitar de la cuenta
* @throws Exception Lanza este error si la cantidad a retirar es negativa o es superios al dinero que hay en la cuenta
*/
public void retirar(double cantidad) throws Exception
{
if (cantidad <= 0)
throw new Exception ("No se puede retirar una cantidad negativa");
if (estado()< cantidad)
throw new Exception ("No se hay suficiente saldo");
saldo = saldo - cantidad;
}

/**
* @return the cuenta
*/
public String getCuenta() {
return cuenta;
}

/**
* @return the nombre
*/
public String getNombre() {
return nombre;
}

/**
* @return the saldo
*/
public double getSaldo() {
return saldo;
}

/**
* @return the tipoInterés
*/
public double getTipoInterés() {
return tipoInterés;
}

/**
* @param cuenta the cuenta to set
*/
public void setCuenta(String cuenta) {
this.cuenta = cuenta;
}

/**
* @param nombre the nombre to set
*/
public void setNombre(String nombre) {
this.nombre = nombre;
}

/**
* @param saldo the saldo to set
*/
public void setSaldo(double saldo) {
this.saldo = saldo;
}

/**
* @param tipoInterés the tipoInterés to set
*/
public void setTipoInterés(double tipoInterés) {
this.tipoInterés = tipoInterés;
}
}