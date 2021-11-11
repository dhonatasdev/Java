import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number;
        int qtde = 0;
        for(int i = 0; i<15; i++){
            System.out.println("Digite o "+ (i+1) + "° numero");
            number = scan.nextInt();
            if(number % 2 == 0){
                qtde++;
            }
        }
        System.out.println("Quantidade de numero pares: "+ qtde);
    }
}
