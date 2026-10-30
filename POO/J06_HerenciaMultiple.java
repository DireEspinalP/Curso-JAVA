package POO;

import java.util.Scanner;

public class J06_HerenciaMultiple {
    public static class Employee{
        private String name;
        private double salary;

        public Employee(String name, double salary){
            this.name=name;
            this.salary=salary;
        }
        public String getName(){return this.name;}
        public String getDetails(){
            return getName()+" earns $"+String.format("%.2f", this.salary);
        }
        public String work(){
            return this.name+" is working";
        }
    }


    public static class Manager extends Employee{
        public int teamSize;
        public Manager(String name, double salary, int teamSize){
            super(name, salary);
            this.teamSize=teamSize;
        }
        @Override 
        public String work(){
            return getName()+ " is managing a team of "+this.teamSize;
        }
        public String getManagerDetails(){
            return  getDetails()+", Team size:"+this.teamSize;
        }
    }

    public static class Developer extends Employee{
        private String language;
        public Developer(String name, double salary, String language){
            super(name, salary);
            this.language=language;
        }
        @Override 
        public String work(){
            return getName()+" is coding in "+this.language;
        }
        public String getDeveloperDetails(){
            return getDetails()+", Language "+this.language;
        }
    }

    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        String managerName= scanner.nextLine();
        double managerSalary=scanner.nextDouble();
        int teamSize=scanner.nextInt();
        scanner.nextLine();
        String developerName=scanner.nextLine();
        String language=scanner.nextLine();

        double developerSalary=7500.0;
        Manager obj1=new Manager(managerName,managerSalary, teamSize);

        Developer obj2=new Developer(developerName, developerSalary, language);

        System.out.println("Manager: "+obj1.getManagerDetails());

        System.out.println(obj1.work());

        System.out.println("Developer: "+obj2.getDeveloperDetails());

        System.out.println(obj2.work());
    }
}
