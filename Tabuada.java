// Construa a	tabela	de	multiplicação	de	números	de	1	a	10	(ex.:	1	x	1	=	1,	1	x	2	=	2,	etc.)

public class Tabuada{
    public static void main(String[] args){
        int i=1, j=1;
        while(i<=10){
            while(j<=10){
                System.out.println(i + " x " + j + " = " + i*j);
                j++;
            }
            i++;
            j = 1;
        }
    }
}