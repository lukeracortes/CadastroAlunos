/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Aluno;
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marlo
 */
public class DAOAluno {

    PreparedStatement pst;
    String sql;

    public void salvar(Aluno aluno) throws SQLException {
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

}
