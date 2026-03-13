public class Operadores {

    public static void main(String[] args ){

        int a = 10;
        int b = 5;
    

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println("Resultado: " + resultado);

        // Operadores Aritméticos
        System.out.println("Soma: " + (a + b)); // 15
        System.out.println("Subtração: " + (a - b)); // 5
        System.out.println("Multiplicação: " + (a * b)); // 50
        System.out.println("Divisão: " + (a / b)); // 2
        System.out.println("Módulo: " + (a % b)); // 0

        // Operadores de Incremento e Decremento
        a++; // a agora é 11
        b--; // b agora é 4
        System.out.println("Incremento de a: " + a); // 11
        System.out.println("Decremento de b: " + b); // 4

        // Operadores de Comparação
        System.out.println("a é igual a b? " + (a == b)); // false
        System.out.println("a é diferente de b? " + (a != b)); // true
        System.out.println("a é maior que b? " + (a > b)); // true
        System.out.println("a é menor que b? " + (a < b)); // false

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y)); // false
        System.out.println("x OR y: " + (x || y)); // true
        System.out.println("NOT x: " + (!x)); // false  
        


    }
    
}
