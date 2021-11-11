import java.util.Scanner;

public class Questao5{
    public static void main(String[] args){
        String sexo;
        double pesoideal, altura;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sexo:");
        sexo = scan.nextLine();
        System.out.println("Altura em metros:");
        altura = scan.nextDouble();
        if(sexo == "M" || sexo == "m"){
            pesoideal = (72.7*altura)-58;
            System.out.println("Peso ideal: "+ pesoideal);
        }
        else if(sexo == "F" || sexo == "f"){
            pesoideal = (66.1*altura)-44.7;
            System.out.println("Peso ideal: " + pesoideal);
        }
        else{
            System.out.println("Invalido\n");
        }

    }
}