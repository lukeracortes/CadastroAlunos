/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteDAO;

import Model.AlunoM;
import pacoteDAO.Conexao;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class AlunoDAO {

    PreparedStatement pst;
    String sql;

    public void salvar(AlunoM aluno) throws SQLException {
        sql = "insert into alunos values (?,?, ?, ?, ?, ?, ?, ?, ?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);

        pst.setInt(1, 0);
        pst.setString(2, aluno.getAlunoNome());
        pst.setInt(3, aluno.getRaAluno());
        pst.setInt(4, aluno.getCpfAluno());
        pst.setString(5, aluno.getRgAluno());
        pst.setInt(6, aluno.getTelefoneAluno());
        pst.setString(7, aluno.getEndRua());
        pst.setInt(8, aluno.getEndNumero());
        pst.setString(9, aluno.getEndComplemento());
        pst.setString(10, aluno.getEndBairro());
        pst.setString(11, aluno.getEndCidade());
        pst.setString(12, aluno.getEndEstado());
        pst.execute();
        pst.close();
    }

    public List<AlunoM> ListaTodosAlunos() throws SQLException {
        List<AlunoM> listaAlunos;
        listaAlunos = new ArrayList<>();

        sql = "select * from alunos order by alunonome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            listaAlunos.add(
                    new AlunoM(
                            rs.getInt("idAlunos"),
                            rs.getString("AlunoNome"),
                            rs.getInt("RaAluno"),
                            rs.getInt("TelefoneAluno"),
                            rs.getString("EndRua"),
                            rs.getInt("EndNumero"),
                            rs.getString("EndBairro"),
                            rs.getInt("CpfAluno"),
                            rs.getString("RgAluno"),
                            rs.getString("EndComplemento"),
                            rs.getString("EndCidade"),
                            rs.getString("EndEstado")));
        }

        pst.close();
        return listaAlunos;

    }

    public void excluir(AlunoM aluno) throws SQLException {
        sql = "delete from alunos where idAlunos = ?";
        pst = Conexao.getInstance().prepareStatement(sql);

        pst.setInt(1, aluno.getIdAluno());
        pst.execute();
        pst.close();
    }
    
    public AlunoM buscaInt(int idAluno) throws SQLException{
        sql = "select * from alunos where idAlunos = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        AlunoM retAluno = null;
        pst.setInt(1, idAluno);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           retAluno = new AlunoM(
                            rs.getInt("idAlunos"),
                            rs.getString("AlunoNome"),
                            rs.getInt("RaAluno"),
                            rs.getInt("TelefoneAluno"),
                            rs.getString("EndRua"),
                            rs.getInt("EndNumero"),
                            rs.getString("EndBairro"),
                            rs.getInt("CpfAluno"),
                            rs.getString("RgAluno"),
                            rs.getString("EndComplemento"),
                            rs.getString("EndCidade"),
                            rs.getString("EndEstado"));
        }
        pst.close();
        return retAluno;
    }

    public void alterar(AlunoM aluno) throws SQLException {
        sql = "update alunos set AlunoNome = ?, RaAluno = ?, CpfAluno = ?, "
                + "RgAluno = ?, TelefoneAluno = ?, EndRua = ?, EndNumero = ?, "
                + "EndComplemento = ?, EndBairro = ?, EndCidade = ?, EndEstado = ?"
                + "where idAlunos = ?";
        pst = Conexao.getInstance().prepareStatement(sql);

        pst.setString(1, aluno.getAlunoNome());
        pst.setInt(2, aluno.getRaAluno());
        pst.setInt(3, aluno.getCpfAluno());
        pst.setString(4, aluno.getRgAluno());
        pst.setInt(5, aluno.getTelefoneAluno());
        pst.setString(6, aluno.getEndRua());
        pst.setInt(7, aluno.getEndNumero());
        pst.setString(8, aluno.getEndComplemento());
        pst.setString(9, aluno.getEndBairro());
        pst.setString(10, aluno.getEndCidade());
        pst.setString(11, aluno.getEndEstado());
        pst.setInt(12, aluno.getIdAluno());
        pst.execute();
        pst.close();

    }

}
