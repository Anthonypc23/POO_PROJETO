/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import MODEL.Aluno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rrmat
 */
public class controllerAluno {
    
    private static FileWriter fw;
    private static BufferedWriter bw;
    private static FileReader fr;
    private static BufferedReader br;
    private static final String arquivo = "Aluno.txt";
    private static List<Aluno> pList = new ArrayList<Aluno>();

    public static void Casdrastra(Aluno al) {
            int last= 0,id=0;
        try {
            pList = Read();
            
            fw = new FileWriter(arquivo);
            bw = new BufferedWriter(fw);
            for (Aluno aluno : pList) {
                bw.write(aluno.toString());
                bw.newLine();
            }
            
            bw.write(al.toString());
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
     
    public static int LastID(){
     pList = Read();
        return pList.size()+1;
    }
    public static List Read() {
        try {
            pList.clear();
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                Aluno a = new Aluno();
                String[] v = line.split(";");
                a.setId(Integer.parseInt(v[0]));
                a.setNota(Double.parseDouble(v[1]));
                a.setNome(v[2]);
                a.setCPF(Long.parseLong(v[3]));
                a.setNacimento(v[4]);
                a.setSex(v[5]);
                a.setCelular(Integer.parseInt(v[6]));
                a.setEmail(v[7]);
                a.setEndereco(v[8]);
                a.setNumCasa(Integer.parseInt(v[9]));
                a.setDiciplina(v[10]);
                pList.add(a);
                line = br.readLine();
            }
            fr.close();
            br.close();


        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return pList;
    }

    public static void remover(int id) {
        pList = Read();
        pList.remove(id);
        
        try {
           fw = new FileWriter(arquivo);
            bw = new BufferedWriter(fw);
            for (Aluno aluno : pList) {
                bw.write(aluno.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static void Empty() {
        try {
            pList = new ArrayList<Aluno>();
            fw = new FileWriter(arquivo);
            bw = new BufferedWriter(fw);
            fw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(controllerProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<String[]> Listar(){
        List<String[]> lista = new ArrayList<>();        
        pList = Read();
        for (Aluno aluno :pList ) {
            lista.add(new String[]{String.valueOf(aluno.getId()),aluno.getNome(),String.valueOf(aluno.getCPF()),aluno.getNacimento(),aluno.getSex(),String.valueOf(aluno.getCelular()),aluno.getEmail(),aluno.getEndereco(),String.valueOf(aluno.getNumCasa()),aluno.getDiciplina(),String.valueOf(aluno.getNota())});
        }
        return lista;
    }

    public static void exibir() {
        for (Aluno aluno : pList) {
            System.out.println(aluno.toString());
        }
    }
}
