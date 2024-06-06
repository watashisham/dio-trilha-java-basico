import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       /*  analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0); */
        String [] candidatos = {"FELIPE", "MARCIA", "ALINE", "JOAO", "KARINA"};
                for(String candidato: candidatos){
                    entrandoEmContato(candidato);
                }
    }           
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            //elas precisarão sofrer alterações
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
            tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas <3);
            if( atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
            else    
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }
 
        //Método auxiliar
            static boolean atender(){
                 return new Random().nextInt(3)==1;
            }

            //Imprimir a lista de candidatos
           
            static void imprimirSelecionados(){
                String [] candidatos = {"FELIPE", "MARCIA", "ALINE", "JOAO", "KARINA"};
                System.out.println("imprimindo a lista de cnaidatos informando o indice do elemento");

                //Llistagem de candidatos com índice
                for(int indice=0; indice < candidatos.length; indice++){
                    System.out.println("O candidato de nº" + (indice+1) + " é o " + candidatos[indice]);
                }
                //Abreviada listagem de candidatos
                /* for(String candidato: candidatos) {
                    System.out.println("O candidato selecionado foi" + candidato);
                } */

            }

        static void selecaoCandidatos(){
            String [] candidatos = {"FELIPE", "MARCIA", "ALINE", "JOAO", "KARINA", "ROMEU", "FABIO", "CACIO", "DURVALINO", "ZECA"};
            int candidatosSelecionados = 0;
            int candidatoAtual=0;
            double salarioBase=2000.0;
            while (candidatosSelecionados <5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candiato " + candidato + " Foi selecionado para a vaga");
                    candidatosSelecionados++;
                }
                candidatoAtual++;
            }
        }
        //Metodo que simula o valor pretendido
        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBrase = 2000.0;
        if (salarioBrase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");            
        }else if (salarioBrase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}

