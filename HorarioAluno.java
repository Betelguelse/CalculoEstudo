import java.util.Scanner;

public class HorarioAluno {
    public static void main(String[] args) throws Exception {
        int horas = 0;
        int minutos = 0;
        int pausa = 0;
        int materias = 0;
        int aulas = 0;
        int intervalo = 15;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de horas totais disponiveis: ");
        horas = ler.nextInt();
        minutos += horas * 60;

        System.out.println("Digite a quantidade de minutos além das horas: ");
        minutos += ler.nextInt();   

        System.out.println("Digite o número de matérias: ");
        materias = ler.nextInt();

        pausa = materias;
        pausa *= 15;
        minutos -= pausa;
        intervalo = minutos%materias;
        aulas = (minutos - intervalo)/ materias;
            
    
        System.out.println("Quantidade de minutos para cada disciplina: " + aulas);
        System.out.println("O tempo restante em minutos será: " + intervalo);

        ler.close();
    }
}
