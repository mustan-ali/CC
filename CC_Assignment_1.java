import java.util.Scanner;

public class CC_Assignment_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String str = input.nextLine();

        char[] arr = new char[str.length() + 10];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < str.length()) {
                arr[i] = str.charAt(i);
            } else {
                arr[i] = ' ';
            }
        }

        while (index < str.length()) {

            while (arr[index] == ' ' || arr[index] == '\t') {
                index++;
            }

            if (arr[index] == '>') {
                if (arr[index + 1] == '=' && arr[index + 2] == ' ') {
                    System.out.println(">= RELOP GE");
                    index += 3;
                } else if (arr[index + 1] == ' ') {
                    System.out.println("> RELOP GT");
                    index += 2;
                } else {
                    while (index < arr.length && (arr[index] != ' ' && arr[index] != '\t')) {
                        System.out.print(arr[index]);
                        index++;
                    }
                    System.out.println(" Error Unrecognized Lexeme");
                }
            }

            else if (arr[index] == '<') {
                if (arr[index + 1] == '>' && arr[index + 2] == ' ') {
                    System.out.println("<> RELOP NE");
                    index += 3;
                } else if (arr[index + 1] == '=' && arr[index + 2] == ' ') {
                    System.out.println("<= RELOP LE");
                    index += 3;
                } else if (arr[index + 1] == ' ') {
                    System.out.println("< RELOP LT");
                    index += 2;
                } else {
                    while (index < arr.length && (arr[index] != ' ' && arr[index] != '\t')) {
                        System.out.print(arr[index]);
                        index++;
                    }
                    System.out.println(" Error Unrecognized Lexeme");
                }
            }

            else if (arr[index] == '=' && arr[index + 1] == '=' && arr[index + 2] == ' ') {
                System.out.println("== RELOP EQ");
                index += 3;
            }

            else {
                while (index < arr.length && (arr[index] != ' ' && arr[index] != '\t')) {
                    System.out.print(arr[index]);
                    index++;
                }
                System.out.println(" Error Unrecognized Lexeme");
            }
        }
    }
}
