package calculator.src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Operation op = new Operation();
        DecimalFormat format = new DecimalFormat("0.#");
        boolean check;
        int operation = 0;
        double number1 = 0;
        double number2 = 0;
        do {
            do {
                System.err.println("Escolha uma operação/ Choose an operation\n1) SOMA/SUM\n2) SUBTRAÇÃO/SUBTRACTION\n3) MULTIPLICAÇÃO/MULTIPLICATION\n4) DIVISÃO/DIVISION\n0) SAIR/EXIT");
                String input1 = k.nextLine();
                check = checkLetter(input1);
                if(check == true){
                    System.err.println("Contém letras ou espaço/ Contains letters or have space");
                }else{
                    operation = Integer.parseInt(input1);
                }
                } while (check);
            if (operation != 0) {
                do {
                    System.err.println("Digite o primeiro número/Enter the first number");
                    String input2 = k.nextLine();
                    check = checkLetter(input2);
                    if(check == true){
                        System.err.println("Contém letras ou espaço/ Contains letters or have space");  
                    }else{
                        number1 = Double.parseDouble(input2);
                    }
                } while (check);
        
                do {
                    System.err.println("Digite o segundo número/Enter the second number");
                    String input3 = k.nextLine();
                    check = checkLetter(input3);
                    if(check == true){
                        System.err.println("Contém letras ou espaço/ Contains letters or have space");
                    }else{
                        number2 = Double.parseDouble(input3);
                    }
                } while (check);
    
                switch (operation) {
                    case 1:
                        System.err.println("A soma do "+number1+" e "+number2+" é/The sum of "+number1+" and "+number2+" is");
                        System.err.println(format.format(op.sum(number1, number2)));
                        break;
                    case 2:
                        System.err.println("A subtração do "+number1+" e "+number2+" é/The subtraction of "+number1+" and "+number2+" is");
                        System.err.println(format.format(op.subtraction(number1, number2)));
                        break;
                    case 3:
                        System.err.println("A multiplicação do "+number1+" e "+number2+" é/The multiplication of "+number1+" and "+number2+" is");
                        System.err.println(format.format(op.multiplication(number1, number2)));
                        break;
                    case 4:
                        System.err.println("A divisão do "+number1+" e "+number2+" é/The division of "+number1+" and "+number2+" is");
                        System.err.println(format.format(op.division(number1, number2)));
                        break;
                    default:
                        break;
                }
            }
        } while (operation !=0);
        k.close();
        System.err.println("Adeus/Goodbye");
    }

    public static boolean checkLetter(String str){
        if (str.isEmpty()) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i))) {
                return true;      
            }   
        }
        return false;
    }
}
