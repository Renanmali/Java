// Para	 cada	 produto	 informado	 (nome,	 preço	 e	 quantidade),	 escreva	 o	 nome	 do	 produto	
// comprado	 e	 o	 valor	 total	 a	 ser	 pago,	 considerando	 que	 são	 oferecidos	 descontos	 pelo	
// número	de	unidades	compradas,	segundo	a	tabela	abaixo:	
// a. Até	10	unidades: valor	total
// b. de	11 a	20	unidades: 10%	de	desconto
// c. de	21	a	50	unidades: 20%	de	desconto
// d. acima	de	50	unidades: 25%	de	desconto

import java.util.Scanner;

public class Produto{
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            double preço, quantidade;
            String nome;
            System.out.printf("Escreva o nome do produto:  ");
            nome = teclado.nextLine();
            System.out.printf("Escreva o preço do produto:  ");
            preço = teclado.nextDouble();
            System.out.printf("Escreva a quantidade de produto comprada:  ");
            quantidade = teclado.nextDouble();
            
            //Comparando a quantidade para dar os descontos possíveis//
            if(quantidade <=10 ){
                preço = quantidade*preço;
                System.out.println("Produto: " + nome);
                System.out.println("O total a ser pago é de: R$" + preço);
            }

            else if(quantidade>=11 && quantidade<=20){
                preço = quantidade*preço*0.9d;
                System.out.println("Produto: " + nome);
                System.out.println("O total a ser pago com os descontos é de: R$" + preço);
            }

            else if(quantidade>=21 && quantidade<=50){
                preço = quantidade*preço*0.8d;
                System.out.println("Produto: " + nome);
                System.out.println("O total a ser pago com os descontos é de: R$" + preço);

            }
            
            else if(quantidade>50){
                preço = quantidade*preço*0.75d;
                System.out.println("Produto: " + nome);
                System.out.println("O total a ser pago com os descontos é de: R$" + preço);

            }


        }

    }
}