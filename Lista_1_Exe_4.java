import java.util.Scanner;
public class Lista_1_Exe_4{
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            int quantidade;
            System.out.println("Digite a quantidade de produtos que você quer incluir no seu estoque: ");
            quantidade = teclado.nextInt();
            for(int i=0; i<quantidade; i++){
                System.out.println("Qual é o produto comprado?");
                String produto = teclado.next();
                System.out.println("Qual é o preço do produto comprado?");
                Float valor = teclado.nextFloat();
                System.out.println("Qual é a quantidade comprada desse produto?");
                int quant = teclado.nextInt();
                if(quant<=10){
                    float total = valor*quant;
                    System.out.println("O valor total a ser pago por " + produto + ", é de: ");
                    System.out.printf("R$ %.2f \n", total);
                }
                else if(11<=quant && 20>= quant){
                    float total = (valor*quant)-((valor*quant)/10);
                    System.out.println("O valor total a ser pago por " + produto + ", é de: ");
                    System.out.printf("R$ %.2f \n", total);
                }
                 else if(21<=quant && 50>= quant){
                    float total = (valor*quant)-((valor*quant)/5);
                    System.out.println("O valor total a ser pago por " + produto + ", é de: ");
                    System.out.printf("R$ %.2f \n", total);
                }
                 else{
                    float total = (valor*quant)-((valor*quant)/4);
                    System.out.println("O valor total a ser pago por " + produto + ", é de: ");
                    System.out.printf("R$ %.2f \n", total);
                }
            }
        }
    }
}