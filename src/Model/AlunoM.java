/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wellington
 */
public class AlunoM {

    

    
    private int IdAluno;
    private String AlunoNome;
    private int RaAluno;
    private int CpfAluno;
    private String RgAluno;
    private int TelefoneAluno;
    private String EndRua;
    private int EndNumero;
    private String EndComplemento;
    private String EndBairro;
    private String EndCidade;
    private String EndEstado; 
    
    
    public AlunoM() {
        
    }
    
    public AlunoM(int IdAluno, String AlunoNome, int RaAluno, int TelefoneAluno, String EndRua, int EndNumero, String EndBairro) {
        this.IdAluno = IdAluno;
        this.AlunoNome = AlunoNome;
        this.RaAluno = RaAluno;
        this.TelefoneAluno = TelefoneAluno;
        this.EndRua = EndRua;
        this.EndNumero = EndNumero;
        this.EndBairro = EndBairro;
    }
    

    public int getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(int IdAluno) {
        this.IdAluno = IdAluno;
    }

    public String getAlunoNome() {
        return AlunoNome;
    }

    public void setAlunoNome(String AlunoNome) {
        this.AlunoNome = AlunoNome;
    }

    public int getRaAluno() {
        return RaAluno;
    }

    public void setRaAluno(int RaAluno) {
        this.RaAluno = RaAluno;
    }

    public int getCpfAluno() {
        return CpfAluno;
    }

    public void setCpfAluno(int CpfAluno) {
        this.CpfAluno = CpfAluno;
    }

    public String getRgAluno() {
        return RgAluno;
    }

    public void setRgAluno(String RgAluno) {
        this.RgAluno = RgAluno;
    }

    public int getTelefoneAluno() {
        return TelefoneAluno;
    }

    public void setTelefoneAluno(int TelefoneAluno) {
        this.TelefoneAluno = TelefoneAluno;
    }

    public String getEndRua() {
        return EndRua;
    }

    public void setEndRua(String EndRua) {
        this.EndRua = EndRua;
    }

    public int getEndNumero() {
        return EndNumero;
    }

    public void setEndNumero(int EndNumero) {
        this.EndNumero = EndNumero;
    }

    public String getEndComplemento() {
        return EndComplemento;
    }

    public void setEndComplemento(String EndComplemento) {
        this.EndComplemento = EndComplemento;
    }

    public String getEndBairro() {
        return EndBairro;
    }

    public void setEndBairro(String EndBairro) {
        this.EndBairro = EndBairro;
    }

    public String getEndCidade() {
        return EndCidade;
    }

    public void setEndCidade(String EndCidade) {
        this.EndCidade = EndCidade;
    }

    public String getEndEstado() {
        return EndEstado;
    }

    public void setEndEstado(String EndEstado) {
        this.EndEstado = EndEstado;
    }
    
}
