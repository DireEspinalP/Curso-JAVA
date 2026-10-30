package POO;
import java.util.Scanner;
public class J03_SetGet {
    public static class Temperature{
        private double celsius;
        private boolean valid;

        public Temperature(double celsius){
            this.celsius=celsius;
        }

        public double getCelsius(){ return this.celsius;}
        public boolean isValid(){ return this.valid;}
        public boolean setCelsius(){
            if(this.celsius>=-273.15){
                this.valid=true;

            }
            else{
                this.valid=false;
            }
            return this.valid;
        }
        public double getFahrenheit(){
            return (this.celsius*9/5)+32;
        }
    }
    public static void main(String [] args){
        System.out.println("Conversion de Temperatura");
        Scanner scanner= new Scanner(System.in);
        System.out.print("Grados celius: ");
        double celsius=scanner.nextDouble();

        Temperature obj = new Temperature(celsius);
        obj.setCelsius();
        System.out.printf("Es valido?: %10b\n",obj.isValid());
        double fahr=obj.getFahrenheit();
        System.out.printf("Fahrenheit: %10.2f%n", fahr);
    }
}
