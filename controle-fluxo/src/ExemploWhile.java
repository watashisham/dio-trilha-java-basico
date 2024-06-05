import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
           
            if(valorDoce > mesada) 
                valorDoce = mesada;
            System.out.println("Valor do Doce: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
    }
    
    //retorna um valor aleatório entre 2 e 8
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
