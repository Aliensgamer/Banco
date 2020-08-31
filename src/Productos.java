public class Productos {
    Cliente IDCliente;
    int CuentaAhorro;
    int CuentaCorriente;
    int TCredito;
    int TDebito;
    int PrestamoBanco;

    public Productos(Cliente IDCliente, int cuentaAhorro, int cuentaCorriente, int TCredito, int TDebito, int prestamoBanco) {
        this.IDCliente = IDCliente;
        this.CuentaAhorro = cuentaAhorro;
        this.CuentaCorriente = cuentaCorriente;
        this.TCredito = TCredito;
        this.TDebito = TDebito;
        this.PrestamoBanco = prestamoBanco;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "IDCliente=" + IDCliente +
                ", CuentaAhorro=" + CuentaAhorro +
                ", CuentaCorriente=" + CuentaCorriente +
                ", TCredito=" + TCredito +
                ", TDebito=" + TDebito +
                ", PrestamoBanco=" + PrestamoBanco +
                '}';
    }
}
