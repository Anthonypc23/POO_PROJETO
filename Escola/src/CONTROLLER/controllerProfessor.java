/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import MODEL.Professor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import utils.Escola;

/**
 *
 * @author rrmat
 */
public class controllerProfessor implements Escola{

    private static FileWriter fw;
    private static BufferedWriter bw;
    private static FileReader fr;
    private static BufferedReader br;
    private static final String arquivo = "Professor.txt";
    private static List<Professor> pList = new ArrayList<Professor>();

    public static void Casdrastra(Professor pf) {
        int last = 0, id = 0;
        try {
            pList = Read();

            fw = new FileWriter(arquivo);
            bw = new BufferedWriter(fw);
            for (Professor professor : pList) {
                bw.write(professor.toString());
                bw.newLine();
            }

            bw.write(pf.toString());
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }

    public static int LastID() {
        pList = Read();
        return pList.size() + 1;
    }

    public static List Read() {
        try {
            pList.clear();
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                Professor p = new Professor();
                String[] v = line.split(";");
                p.setIDP(Integer.parseInt(v[0]));
                p.setNome(v[1]);
                p.setCPF(v[2]);
                p.setNacimento(v[3]);
                p.setSex(v[4]);
                p.setCelular(v[5]);
                p.setEmail(v[6]);
                p.setEndereco(v[7]);
                p.setNumCasa(Integer.parseInt(v[8]));
                p.setDiciplina(v[9]);
                p.setSalario(Double.parseDouble(v[10]));
                pList.add(p);
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
            for (Professor professor : pList) {
                bw.write(professor.toString());
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
            pList = new ArrayList<Professor>();
            fw = new FileWriter(arquivo);
            bw = new BufferedWriter(fw);
            fw.close();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(controllerProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<String[]> Listar() {
        List<String[]> lista = new ArrayList<>();
        pList = Read();
        for (Professor prof : pList) {
            lista.add(new String[]{String.valueOf(prof.getIDP()), prof.getNome(), prof.getCPF(), prof.getNacimento(), prof.getSex(), prof.getCelular(), prof.getEmail(), prof.getEndereco(), String.valueOf(prof.getNumCasa()), prof.getDiciplina(), String.valueOf(prof.getSalario())});
        }
        return lista;
    }

    public static void exibir() {
        for (Professor professor : pList) {
            System.out.println(professor.toString());
        }
    }

    public static List<String[]> ordenar() {
        pList = Read();
        Collections.sort(pList);
        List<String[]> lista = new ArrayList<>();
        for (Professor prof : pList) {
            lista.add(new String[]{String.valueOf(prof.getIDP()), prof.getNome(), prof.getCPF(), prof.getNacimento(), prof.getSex(), prof.getCelular(), prof.getEmail(), prof.getEndereco(), String.valueOf(prof.getNumCasa()), prof.getDiciplina(), String.valueOf(prof.getSalario())});
        }
        return lista;
    }
    
    
    @Override
    public List<String[]> Somarvalor(int index) {
        Professor pf;
        pList = Read();
        pf = pList.get(index);
        pf.setSalario((pf.getSalario()*0.2)+pf.getSalario());

        try {
            fw = new FileWriter(arquivo);
            bw = new BufferedWriter(fw);
             for (Professor professor : pList) {
                bw.write(professor.toString());
                bw.newLine();
            }
             bw.close();
             fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(controllerAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Listar();
    }

}
