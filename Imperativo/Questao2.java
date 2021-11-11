import java.util.Scanner;

public class Questao2{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        float n1, n2, n3;
        System.out.println("Digite a primeira nota");
        n1 = scan.nextFloat();
        System.out.println("Digite a segunda nota");
        n2 = scan.nextFloat();
        System.out.println("Digite a terceira nota");
        n3 = scan.nextFloat();
        float soma;
        soma = (n1+n2+n3)/3;
        System.out.print(soma);
        
    }
}
