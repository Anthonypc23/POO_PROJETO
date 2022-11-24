package utils;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

/**
 * Classe para validar os campos e dados do sistema
 * @author Anthony
 */
public class Check {
    
    ArrayList <String> msgErro = new ArrayList<>();
    
  
    
    /**
     * Método verifica se o campo foi preenchido
     * @param txt string a ser verificada
     */
    public void ValidVoid (JTextField txt){
        if(txt.getText().trim().equals("")){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }
    }

   
    
    /**
     * Método verifica se o campo foi selecionado
     * @param i int a ser verificado
     */
    public void ValidCBO(int i){
        if(i == 0){
         msgErro.add("Você não selecionou uma disciplina");   
        }
    }
    
    /**
     * Método verifica a mensagem de erro
     */
    public void clearMSG(){
        this.msgErro.clear();
    }
    
    /**
     * Método mostra a mensagem de erro
     * @return String retorna a mensagem
     */
    public String getMsgErro(){
        String erros = "";
        for(String msg : msgErro){
            erros += msg + "\n";
        }
        
        if(!erros.equals("")){
            clearMSG();
        }
        
        return erros;
    }
    
    /**
     * 
     * @return boolean true: se tem erro | false: se não tem erro
     */
    public boolean temErro(){
        if(msgErro.size()>0){
            return true;
        }else
            
        return false; 
    }
}
