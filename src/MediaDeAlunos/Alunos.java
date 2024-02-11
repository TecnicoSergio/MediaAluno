package MediaDeAlunos;

public class Alunos {

    float nota1;
    float nota2;
    float nota3;
    float soma;
    float media;


    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public Alunos(float nota1, float nota2, float soma, float media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.soma = soma;
        this.media = media;
    }


}
