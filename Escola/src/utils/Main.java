/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utils;

import CONTROLLER.controllerAluno;
import CONTROLLER.controllerProfessor;
import MODEL.Aluno;
import MODEL.Professor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rrmat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//          controllerAluno.Empty();
//        int id = controllerProfessor.LastID();
        controllerProfessor.Casdrastra(new Professor(controllerProfessor.LastID(),"Anthony", 386420154, "02/06/2002", "LGBT",933689547, "anthony.toninho@traicao.com", "Av Traino Putero Santos", 487, "TI", 100184));
        controllerProfessor.Casdrastra(new Professor(controllerProfessor.LastID(),"Wallace", 1, "02/06/2022", "Masculino", 933689584, "wallace@gmail.com", "Rua Suvaco da cobra", 73, "Matematica", 4878.45));
        controllerProfessor.Casdrastra(new Professor(controllerProfessor.LastID(),"Henry", 2, "02/06/2022", "Trans", 933689584, "henry.mentiroso@gmail.com", "Av Da Traição", 73, "Matematica", 4878.45));
        controllerProfessor.Casdrastra(new Professor(controllerProfessor.LastID(),"Eric", 3, "02/06/2022", "Feminino", 933689584, "c4.lancaperfume@gmail.com", "Rua Do Pó", 73, "Matematica", 4878.45));
        controllerProfessor.Casdrastra(new Professor(controllerProfessor.LastID(),"Guilherme", 3, "02/06/2022", "Pansexual", 933689584, "guilherme.remedio@gmail.com", "Rua Dos Remédios", 73, "Matematica", 4878.45));
//        controllerProfessor.remover();
//          controllerAluno.Casdrastra(new Aluno(controllerAluno.LastID(), 5.4, "Erick", 485684488, "02/15/16", "masculino", 933689584, "tony@gmail.com", "rua mendoça", 488, "Quimica"));
//          controllerAluno.Casdrastra(new Aluno(controllerAluno.LastID(), 5.4, "Erick", 485684488, "02/15/16", "masculino", 933689584, "tony@gmail.com", "rua mendoça", 488, "Quimica"));
//          controllerAluno.Casdrastra(new Aluno(controllerAluno.LastID(), 5.4, "Erick", 485684488, "02/15/16", "masculino", 933689584, "tony@gmail.com", "rua mendoça", 488, "Quimica"));
//          controllerAluno.Casdrastra(new Aluno(controllerAluno.LastID(), 5.4, "Erick", 485684488, "02/15/16", "masculino", 933689584, "tony@gmail.com", "rua mendoça", 488, "Quimica"));
//          controllerAluno.Casdrastra(new Aluno(controllerAluno.LastID(), 5.4, "Erick", 485684488, "02/15/16", "masculino", 933689584, "tony@gmail.com", "rua mendoça", 488, "Quimica"));
//          controllerAluno.Casdrastra(new Aluno(controllerAluno.LastID(), 5.4, "Erick", 485684488, "02/15/16", "masculino", 933689584, "tony@gmail.com", "rua mendoça", 488, "Quimica"));
//          controllerAluno.Casdrastra(new Aluno(controllerAluno.LastID(), 5.4, "Erick", 485684488, "02/15/16", "masculino", 933689584, "tony@gmail.com", "rua mendoça", 488, "Quimica"));
           controllerAluno.remover(5);
    }

}
