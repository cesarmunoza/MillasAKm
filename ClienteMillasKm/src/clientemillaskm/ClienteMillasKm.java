package clientemillaskm;
public class ClienteMillasKm {
    public static void main(String[] args) {
        System.out.println("Resultado: " + millasakilometros(1));
    }    

    private static double millasakilometros(double millas) {
        com.cesar.webservices.Convertidor_Service service = new com.cesar.webservices.Convertidor_Service();
        com.cesar.webservices.Convertidor port = service.getConvertidorPort();
        return port.millasakilometros(millas);
    }
}