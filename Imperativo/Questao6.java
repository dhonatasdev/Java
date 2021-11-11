import java.util.Scanner;

public class Questao6{
    public static void main(String[] args){
        String mes;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do mes:");
        mes = scan.nextLine();
        mes = mes.toLowerCase();
        if((mes.equals("janeiro")) || (mes.equals("marco")) || (mes.equals("maior")) || (mes.equals("julho")) || (mes.equals("agosto")) || (mes.equals("outubro")) || (mes.equals("dezembro"))){
            System.out.println("31 dias");
        }
        else if((mes.equals("fevereiro"))){
            System.out.println("28 dias");
        }
        else if((mes.equals("abril")) || (mes.equals("junho"))|| (mes.equals("setembro")) || (mes.equals("novembro"))){
            System.out.println("30 dias");
        }
        else{
            System.out.println("Invalido");
        }
    }
}