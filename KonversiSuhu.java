
package konversisuhu;

/**
 *
 * @author USER
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Suhu con = new Suhu();
        con.setC(10);
        System.out.println("Suhu Celsius Ke Fahrenheit   :"+con.Conversi("C-F"));

        con.setF(45);
        System.out.println("Suhu Fahrenheit Ke Celsius   :"+con.Conversi("F-C"));
    }
    
}
