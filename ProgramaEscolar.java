public class ProgramaEscolar {
    public static void main(String[] args) {
        // Declaração das variáveis
        int avaliacao1;
        int avaliacao2;
        int avaliacaoOptativa;
        double=media;
        // receber nota do aluno
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota da avaliação:");
        int avaliacao1 = scanner.nextInt();
        System.out.print("Digite a segunda nota da avaliação:");
        int avaliacao2 = scanner.nextInt();
        System.out.print("Digite a nota da optativa");
        int avaliacaoOptativa = scanner.nextInt();
        // Se o aluno não fez a optativa a nota tem que ficar -1
        int avaliacaoOptativa = 0;
        if (avaliacaoOptativa == 0) {
            avaliacaoOptativa = -1;
        }
        // Encontrar a menor nota entre as tres
        int menorAvaliacao = Math.min(Math.min(avaliacao1, avaliacao2), avaliacaoOptativa);
        //somando e tirando a menor
        int somaAvaliacoesMaiores = avaliacao1 + avaliacao2 + avaliacaoOptativa - menorAvaliacao;
        //tirando a média
        double media = somaAvaliacoesMaiores / 2.0;
        //mostrar o resultado
        if (media >= 6) {
            System.out.println("O aluno foi aprovado.");
        } else if (media >= 3 && media < 6) {
            System.out.println("O aluno ficou de recuperação.");
        } else { (media <= 3)
            System.out.println("O aluno foi reprovado.");