package MODEL;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rrmat
 */
public class Pessoa {
    protected String nome;
    protected String CPF;
    protected String nacimento;
    protected String Sex;
    protected String Celular;
    protected String email;
    protected String Endereco;
    protected int NumCasa;
    protected String Diciplina;

    public Pessoa(String nome, String CPF, String nacimento, String Sex, String Celular, String email, String Endereco, int NumCasa, String Diciplina) {
        this.nome = nome;
        this.CPF = CPF;
        this.nacimento = nacimento;
        this.Sex = Sex;
        this.Celular = Celular;
        this.email = email;
        this.Endereco = Endereco;
        this.NumCasa = NumCasa;
        this.Diciplina = Diciplina;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNacimento() {
        return nacimento;
    }

    public void setNacimento(String nacimento) {
        this.nacimento = nacimento;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereço) {
        this.Endereco = Endereço;
    }

    public int getNumCasa() {
        return NumCasa;
    }

    public void setNumCasa(int NumCasa) {
        this.NumCasa = NumCasa;
    }

    public String getDiciplina() {
        return Diciplina;
    }

    public void setDiciplina(String Diciplina) {
        this.Diciplina = Diciplina;
    }

    @Override
    public String toString() {
        return nome +";"+ CPF +";"+ nacimento +";"+ Sex +";"+ Celular +";"+ email +";"+ Endereco + ";"+ NumCasa +";"+ Diciplina;
    }
    
}
