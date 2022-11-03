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
public class Aluno extends Pessoa{
    private int id;
    private double Nota;

    public Aluno(int id, double Nota, String nome, int CPF, String nacimento, String Sex, int Celular, String email, String Endereço, int NumCasa, String Diciplina) {
        super(nome, CPF, nacimento, Sex, Celular, email, Endereço, NumCasa, Diciplina);
        this.id = id;
        this.Nota = Nota;
    }

    public Aluno(int RA, double Nota) {
        this.id = id;
        this.Nota = Nota;
    }

    public Aluno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    
    }

    @Override
    public String toString() {
        return id + ";" + Nota + ";"+super.toString();
    }
    
    
    
}
