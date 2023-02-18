package org.example;

public class PrintAddStatements {
    public static void main(String[] args) {
     printExtraNumberedAddStatements(22, 26);
 //  printNumberedAddStatements(21);
    }

    public static void printNumberedAddStatements(int numberOfQuestions){
        for(int i = 1; i <= numberOfQuestions; i++){
            System.out.println("add(\""+i+".\");");
        }
    }

    public static void printNonNumberedAddStatements(int numberOfQuestions){
        for(int i = 1; i <= numberOfQuestions; i++){
            System.out.println("add(\"\");");
        }
    }

    public static void printExtraNumberedAddStatements (int firstNumber, int lastNumber){
        for(int i = firstNumber; i <= lastNumber; i++){
            System.out.println("add(\""+i+".\");");
        }
    }


}