public class ResultadoEscolar {
    public static void main(String[] args) {
/*         int nota = 8;

        if (nota >= 7)
        System.out.println("Aprovado");

        else if(nota > 5 && nota < 7)
        System.out.println("Prova Recuperação");

        else
        System.out.println("Reprovado"); */

        int nota = 10;

        //String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";


        System.out.println(resultado);
    }
}
