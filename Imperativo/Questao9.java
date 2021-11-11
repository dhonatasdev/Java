import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args){
        int op;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Menu de opcoes");
            System.out.println("Cadastrar atividade...........1");
            System.out.println("Atividades cadastradas........2");
            System.out.println("Remover atividades............3");
            System.out.println("Sair..........................0");
            op = scan.nextInt();
            if(op == 0){
                break;
            }
            switch (op){
                case 1:
                System.out.println("Cadastrado com sucesso"); break;
                case 2:
                System.out.println("Atividades:"); break;
                case 3:
                System.out.println("Removida com sucesso"); break;
                default: System.out.println("Invalido");
            }

        }
    }
}
