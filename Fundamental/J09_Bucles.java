//-----------BUCLES-----------
public class J09_Bucles {
    public static void main(String[] args) {
        // Bucle for
        // for (initialization; condition; update){code} (IDENTICO A C++)
        System.out.println("FOR");
        // for (initialization; condition; update){code}
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hello C++ " + i);
        }

        System.out.println("WHILE");
        double num = 8.4;
        System.out.println("Escribe un numero: ");
        while (num >= 3.5) {
            num = num / 2.0;
        }
        System.out.println(num);

        System.out.println("DO-WHILE");
        int sum = 0;
        int number = 1;
        do {
            sum = sum + number;
            number = number + 2;
            System.out.println("Sum is: " + sum);
            System.out.println("Num is: " + number);
        } while (number < 50);
        // NOTA: no te olvides ");" al final del do-while

        System.out.println("Final Sum: " + sum);

        System.out.println("BREAK");
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("CONTINUE");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Array con bucles");
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
        System.out.println("Array con bucles anidados( matrix)");
        int[][] numeros = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };

        for( int i = 0;i<3;i++){  
            for (int j = 0; j <3; j++) { 
                System.out.print(numeros[i][j] + " ");
                }
            System.out.println();
        }
    }
}