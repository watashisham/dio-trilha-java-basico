import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executando repetidas vezes até alguém atender
            System.out.println("telefone tocando");
        
        }while(tocando());

        System.out.println("Alô !!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1; // se o valor aleatorio for igual a UM ele atendeu
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu; // negacao ou seja, não está mais tocando
    }
}
