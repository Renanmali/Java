import java.util.Scanner;

public class Lista_1_Exe_6 {
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.println("Digite um número inteiro qualquer: ");
            String numero = teclado.next();
            int quantidade = numero.length();
            System.out.println("A quantidade de dígitos do número informado é: " + quantidade);
        }
    }
}
