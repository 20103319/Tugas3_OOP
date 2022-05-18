
package konversisuhu;

/**
 *
 * @20103319_MarhainiHidayati
 */
public class Suhu {
    private double hasil, C, F;

    public void setC(double nilai){

        this.C = nilai;

    }

    public void setF(double nilai){

        this.F = nilai;

    }

    public void setHasil(double hsl){

        this.hasil = hsl;

}
    public double getHasil(){

        return this.hasil;

}
    public double Conversi(String jns){

        if(jns == "C-F")    

            this.hasil=C*9/5+ 32; 

        else if(jns == "F-C")

            this.hasil= (F-32)*5/9; 

        return this.hasil;

    }
}
