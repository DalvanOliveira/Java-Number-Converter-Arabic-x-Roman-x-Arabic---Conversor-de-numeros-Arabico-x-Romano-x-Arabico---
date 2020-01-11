/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Dalvan
 */
public class DadoEstatistico {
    private String numeroArabico;
    private String algRomano;
    private String I;
    private String V;
    private String X;
    private String L;

    public String getNumeroArabico () {
        return numeroArabico;
    }

    public void setNumeroArabico (String numeroArabico) {
        this.numeroArabico = numeroArabico;
    }

    public String getAlgRomano () {
        return algRomano;
    }

    public void setAlgRomano (String algRomano) {
        this.algRomano = algRomano;
    }

    public String getI () {
        return I;
    }

    public void setI (String I) {
        this.I = I;
    }

    public String getV () {
        return V;
    }

    public void setV (String V) {
        this.V = V;
    }

    public String getX () {
        return X;
    }

    public void setX (String X) {
        this.X = X;
    }

    public String getL () {
        return L;
    }

    public void setL (String L) {
        this.L = L;
    }

    public String getC () {
        return C;
    }

    public void setC (String C) {
        this.C = C;
    }

    public String getD () {
        return D;
    }

    public DadoEstatistico (String numeroArabico, String algRomano, String I, String V, String X, String L, String C, String D, String M) {
        this.numeroArabico = numeroArabico;
        this.algRomano = algRomano;
        this.I = I;
        this.V = V;
        this.X = X;
        this.L = L;
        this.C = C;
        this.D = D;
        this.M = M;
    }

    public void setD (String D) {
        this.D = D;
    }

    public String getM () {
        return M;
    }

    public void setM (String M) {
        this.M = M;
    }
    private String C;
    private String D;
    private String M;  
}
