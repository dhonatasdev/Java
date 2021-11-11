import java.util.Scanner;

public class Questao7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int veloz_max, veloz_moto;
        int multa = 0;
        System.out.println("Velocidade maxima:");
        veloz_max = scan.nextInt();
        System.out.println("Velocidade motorista:");
        veloz_moto = scan.nextInt();
        if(veloz_moto-veloz_max>= 31){
            multa = 200;
        }
        else if(veloz_moto-veloz_max>=11){
            multa = 100;
        }
        else if(veloz_moto-veloz_max == 10){
            multa = 50;
        }
        System.out.println("Multa: "+multa);
    }
}