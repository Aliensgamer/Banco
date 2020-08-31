import java.util.Scanner;

public class BancoMain {

    public static void main(String [] args){
        int IDCliente, NumCuentaAhorros, NumCuentaCorriente;
        Scanner capture = new Scanner(System.in);
        System.out.println("Ingrese el Id del Cliente");
        IDCliente=capture.nextInt();
        System.out.println("Ingrese el numero de cuenta de Ahorros");
        NumCuentaAhorros = capture.nextInt();

        System.out.println("Ingrese el numero de cuenta Corriente");
        NumCuentaCorriente = capture.nextInt();

        Cliente CLIENTE1 = new Cliente(IDCliente, "Juan","Jose","1010140855","Calle 24 # 40-108");

        CLIENTE1.CrearCuentaAhorros(IDCliente,NumCuentaAhorros);
        CLIENTE1.CrearCuentaCorriente(IDCliente,NumCuentaCorriente);
    }


}
