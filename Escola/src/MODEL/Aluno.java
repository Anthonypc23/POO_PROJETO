/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author rrmat
 */
public class Aluno extends Pessoa implements Comparable<Aluno> {

    private double Nota;

    public Aluno(int id,double Nota,String nome, String CPF, String nacimento, String Sex, String Celular, String email, String Endereco, int NumCasa, String Diciplina) {
        super(id, nome, CPF, nacimento, Sex, Celular, email, Endereco, NumCasa, Diciplina);
        this.Nota = Nota;
    }

   

    public Aluno(int RA, double Nota) {
        this.id = id;
        this.Nota = Nota;
    }

    public Aluno() {
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;

    }

    @Override
    public String toString() {
        return id + ";" + Nota + ";" + super.toString();
    }

    @Override
    public int compareTo(Aluno aluno) {
        if (this.getId() < aluno.getNota()) {
            return -1;
        }
        if (this.getId() > aluno.getNota()) {
            return 1;
        }
        return 0;
    }
    
    

}
