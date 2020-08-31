import java.*;
import java.util.Scanner;

public class Cliente {
    int IDCliente, NumCuenta;
    String Nombre, Apellidos, Celular, Direccion;



    public Cliente(int IDCliente, String nombre, String apellidos, String celular, String direccion) {
        this.IDCliente = IDCliente;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Celular = celular;
        this.Direccion = direccion;

    }






    public void CrearCuentaAhorros(int IDcliente, int NumCuenta){
        Cliente CLIENTE1 = new Cliente(IDcliente, "Juan","Jose","1010140855","Calle 24 # 40-108");
        Productos CA = new Productos(CLIENTE1,NumCuenta,0,0,0,0);
        System.out.println("Cuenta de Ahorros Creada Correctamente");
        System.out.println("ID Cliente ="+CA.IDCliente.IDCliente);
        System.out.println("Nombre " + CA.IDCliente.Nombre);
        System.out.println("Apellido " + CA.IDCliente.Apellidos);
        System.out.println("# Cuenta :" + CA.CuentaAhorro);

    }

    public void CrearCuentaCorriente(int IDcliente, int NumCuenta){
        Cliente CLIENTE2 = new Cliente(IDcliente, "Juan","Jose","1010140855","Calle 24 # 40-108");
        Productos CC = new Productos(CLIENTE2,0,NumCuenta,0,0,0);
        System.out.println("Cuenta Corriente Creada Correctamente");
        System.out.println("ID Cliente ="+CC.IDCliente.IDCliente);
        System.out.println("Nombre " + CC.IDCliente.Nombre);
        System.out.println("Apellido " + CC.IDCliente.Apellidos);
        System.out.println("# Cuenta :" + CC.CuentaCorriente);

    }








}
