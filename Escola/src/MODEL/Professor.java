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
public class Professor extends Pessoa implements Comparable<Professor>{
    private double Salario;

    public Professor() {
    }

    public Professor(int id, String nome, String CPF, String nacimento, String Sex, String Celular, String email, String Endereco, int NumCasa, String Diciplina,double Salario) {
        super(id, nome, CPF, nacimento, Sex, Celular, email, Endereco, NumCasa, Diciplina);
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return super.toString()+";"+Salario;
    }

    
   
    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    

    


    @Override
    public int compareTo(Professor professor) {
    if(this.getSalario() < professor.getSalario()){
        return -1;
    }
    
    if(this.getSalario() > professor.getSalario()){
        return 1;
    }
        return 0;
    }
    
    
    
}
