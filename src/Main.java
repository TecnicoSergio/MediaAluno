import java.util.Scanner;
import MediaDeAlunos.Alunos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        float nota1, nota2, nota3;
        float media, i, contAluno = 0;

        for(i = 0; i < 3; i++){

            contAluno++;

            System.out.println("Aluno" + contAluno + ", digite sua 1° nota");
            nota1 = ent.nextFloat();

            System.out.println("Aluno" + contAluno + ", digite sua 2° nota");
            nota2 = ent.nextFloat();

            System.out.println("Aluno" + contAluno + ", digite sua 3° nota");
            nota3 = ent.nextFloat();

            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A media do aluno " + contAluno + "é " + media);

            if( (media >= 0) && (media <4) ) {
                System.out.println("NOTA E ");
            }else if(media < 5){
                System.out.println("Nota D");
            }else if(media <7){
                System.out.println("Nota C");
            }else if(media< 8){
                System.out.println("Nota B");
            }else if(media <=10){
                System.out.println("Nota A");
            }
        }

    }
}