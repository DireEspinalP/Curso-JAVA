package POO;

import java.util.Scanner;

public class J05_Herencia {
    public static class Notification{
        private String message;

        public Notification(String menssage){
            this.message=menssage;
        }

        public String getMessage(){return this.message;}
        public void send(){
            System.out.println("Sending notification "+this.message );
        }
    }
    public static class EmailNotification extends Notification{
        private String recipient;
        public EmailNotification(String message, String recpient){
            super(message);
            this.recipient=recpient;
        }
        @Override
        public void send(){
            System.out.print("Emailing "+this.recipient+": "+getMessage());
        }
    }
    public static void main(String []  args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Message: ");
        String menssage=scanner.nextLine();
        System.out.print("Recipient: ");
        String recipient=scanner.nextLine();

        System.out.println("\nNotification");
        Notification obj1=new Notification(menssage);
        EmailNotification obj2=new EmailNotification(menssage, recipient);

        obj1.send();
        obj2.send();

    }
}
