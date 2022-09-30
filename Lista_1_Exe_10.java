import java.util.Scanner;

public class Lista_1_Exe_10 {
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.println("Qual o capital que será ivestido por mês? ");
            double capital = teclado.nextDouble();
            System.out.println("DIgite qual a taxa de juros mensal? ");
            double taxa = teclado.nextDouble();
            for (int i=0; i<12; i++){
                double juros, receita, novo_capital;
                juros = (capital*taxa)/100;
                receita = capital + juros;
                novo_capital = receita + capital; 
                System.out.println(receita);
            }
        }
    }    
}
