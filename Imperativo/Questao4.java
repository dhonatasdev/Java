import java.util.Scanner;

public class Questao4{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String nome1, nome2;
        float salario1, salario2;
        System.out.println("Digite o nome:");
        nome1 = scan.nextLine();
        System.out.println("Digite o salario");
        salario1 = scan.nextFloat();
        System.out.println("Digite o nome:");
        nome2 = scan.nextLine();
        System.out.println("Digite o salario:");
        salario2 = scan.nextFloat();
        if( salario1 > salario2){
            System.out.println("Programador " + nome1+"salario: "+ salario1);
        }
        else if (salario2 > salario1){
            System.out.println("Programador " + nome2+"salario: "+ salario2);

        }
        else{
            System.out.println("Iguais");
        }


        
        
    }
}