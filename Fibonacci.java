import java.util.*;
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de elementos da sequência Fibonacci: ");
        int numElementos = scanner.nextInt();
        
        long[] fibonacciArray = construirSequenciaFibonacci(numElementos);
        
        System.out.println("Sequência Fibonacci até o " + numElementos + "º elemento:");
        for (int i = 0; i < numElementos; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
    
    public static long[] construirSequenciaFibonacci(int numElementos) {
        long[] fibonacciArray = new long[numElementos];
        
        if (numElementos >= 1) {
            fibonacciArray[0] = 0; // Primeiro elemento da sequência Fibonacci
        }
        if (numElementos >= 2) {
            fibonacciArray[1] = 1; // Segundo elemento da sequência Fibonacci
        }
        for (int i = 2; i < numElementos; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        
        return fibonacciArray;
    }
}
