/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.DadoEstatistico;
import View.TelaConversor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalvan
 */
public class ControladorConversor {
        ////singleton
    private static ControladorConversor instance;
    private ControladorConversor() {

    }
    
    public static ControladorConversor getInstance() {
        if (instance == null) {
            instance = new ControladorConversor();
        }
        return instance;
    }
    ////end singleton
    
    List<DadoEstatistico> linhas = new ArrayList<>();
    TelaConversor tela;
    
    public void converterInserir(String entrada){
        JOptionPane.showMessageDialog (tela, "entrada: " +entrada);
    }

    public List<DadoEstatistico> getLinhas () {
        return linhas;
    }

    public void addLinha (DadoEstatistico linha){
        linhas.add (linha);
        
    }
    
    
}
