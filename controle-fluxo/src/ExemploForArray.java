public class ExemploForArray {
    public static void main(String[] args) {
        //em arrays o indice de elementos inicia em ZERO
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

/*         for (int x=0; x < alunos.length; x++){ //length = tamanho
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        } */
        // abreviacao
        for (String aluno : alunos){
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
