import org.junit.Test;

import static org.junit.Assert.*;
import java.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ClienteTest {


    @Test
    public void CrearCuentaAhorros(){
         int IDcliente =100;
         int Numcuenta = 19587465;
        Cliente CLIENTE1 = new Cliente(IDcliente, "Juan","Jose","1010140855","Calle 24 # 40-108");
        Productos CA = new Productos(CLIENTE1,Numcuenta,0,0,0,0);
        System.out.println("Cuenta de Ahorros Creada Correctamente");
       System.out.println("ID Cliente ="+CA.IDCliente.IDCliente);
        System.out.println("Nombre " + CA.IDCliente.Nombre);
        System.out.println("Apellido " + CA.IDCliente.Apellidos);
        System.out.println("# Cuenta :" + CA.CuentaAhorro);
        assertEquals(CA.IDCliente.IDCliente,100,0);
        assertEquals(CA.CuentaAhorro,19587465,0);
    }

    @Test
    public void CrearCuentaCorriente(){
        int IDcliente =400;
        int Numcuenta = 1000957;
        Cliente CLIENTE1 = new Cliente(IDcliente, "Juan","Jose","1010140855","Calle 24 # 40-108");
        Productos CC = new Productos(CLIENTE1,0,Numcuenta,0,0,0);
        System.out.println("Cuenta Corriente Creada Correctamente");
        System.out.println("ID Cliente ="+CC.IDCliente.IDCliente);
        System.out.println("Nombre " + CC.IDCliente.Nombre);
        System.out.println("Apellido " + CC.IDCliente.Apellidos);
        System.out.println("# Cuenta :" + CC.CuentaCorriente);
        assertEquals(CC.IDCliente.IDCliente,400,0);
        assertEquals(CC.CuentaCorriente,1000957,0);
    }

}