
package model;

public class Media {

    private String aluno;
    private double n1;
    private double n2;
    private double n3;

    public Media(){
        this("", 0.0, 0.0, 0.0);
    }
    
    public Media(String aluno, double n1, double n2, double n3) {
        this.aluno = aluno;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
    
    public double getMedia(){
        return ((n1+n2+n3)/3.0);
    }
    
}