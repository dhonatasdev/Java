import java.util.Scanner;
public class Questao3{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = 0, idade, soma = 0;
        while(n != 3){
           System.out.print("Digite a ");
           System.out.print(n+1);
           System.out.println("° idade");
            idade = scan.nextInt();
            if(idade > 15){
                soma += idade;
            }
            n++;
        }
        System.out.print("A soma da idade eh: ");
        System.out.print(soma);

    }
}