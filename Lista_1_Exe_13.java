import java.util.Random;

public class Lista_1_Exe_13 {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int ordena[] = new int[100];
        int guarda = 0;
        for(int i=0; i<100; i++){
            int numero = aleatorio.nextInt(10000);
            ordena[i] = numero;    
        }
        for(int i = 0; i<100; i++){
            for(int j = 0; j<99; j++){
                if(ordena[j]>ordena[j+1]){
                    guarda = ordena[j+1];
                    ordena[j+1] = ordena[j];
                    ordena[j] = guarda;
                }
            }
        }
        for(int i = 0; i<100; i++){
            System.out.printf("%d, ", ordena[i]);
        }
    }
}
