import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public interface Questao10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int listaNumerosSelecionados[] = new int[5];
        for(int i = 0; i<5; i++){
            System.out.println("Digite o "+ (i+1) + "° numero");
            listaNumerosSelecionados[i] = scan.nextInt();

        }
        for(int i = 0; i<5; i++){
            if(listaNumerosSelecionados[i] > 100){
                System.out.println(listaNumerosSelecionados[i]);
            }
        }
    }
}
