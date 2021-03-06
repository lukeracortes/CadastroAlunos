/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import pacoteDAO.AlunoDAO;
import Model.AlunoM;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SCT 05
 */
public class AlunoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AlunoView
     */
    AlunoM aluno;
    AlunoDAO alunoDAO;
    List<AlunoM> listaAluno;

    public AlunoView() {
        initComponents();
        this.setVisible(true);

        
        alunoDAO = new AlunoDAO();
        listaAluno = new ArrayList<>();
        atualizaTabela();
        cbxEstados.removeAllItems();

    }
    
    public void preencheCombo(){
        cbxEstados.removeAllItems();
        String estados[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
            "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
        DefaultComboBoxModel dados = new DefaultComboBoxModel();
        
        for(int i =0; i < estados.length; i++){
            dados.addElement(estados[i]);
            
        }
        cbxEstados.setModel(dados);
        
    }

    public void atualizaTabela() {
        aluno = new AlunoM();
        tblAlunos.setEnabled(true);
        try {
            listaAluno = alunoDAO.ListaTodosAlunos();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);
        }

        String dados[][] = new String[listaAluno.size()][13];
        int i = 0;
        for (AlunoM aluno : listaAluno) {
            dados[i][0] = String.valueOf(aluno.getIdAluno());
            dados[i][1] = aluno.getAlunoNome();
            dados[i][2] = String.valueOf(aluno.getRaAluno());
            dados[i][3] = String.valueOf(aluno.getTelefoneAluno());
            dados[i][4] = aluno.getEndRua();
            dados[i][5] = String.valueOf(aluno.getEndNumero());
            dados[i][6] = aluno.getEndBairro();
            dados[i][7] = String.valueOf(aluno.getCpfAluno());
            dados[i][8] = aluno.getRgAluno();
            dados[i][9] = aluno.getEndComplemento();
            dados[i][10] = aluno.getEndCidade();
            dados[i][11] = aluno.getEndEstado();
            i++;
        }

        String tituloColuna[] = {"Código", "Nome", "Registro Acadêmico", "Telefone", "Rua", "Número", "Bairro", "Cpf", "RG Aluno", "Complemento Endereço", "Cidade", "Estado"};
        DefaultTableModel tabelaAluno = new DefaultTableModel();
        tabelaAluno.setDataVector(dados, tituloColuna);
        tblAlunos.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false, false, false 
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        tblAlunos.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblAlunos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(5).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(6).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(7).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(8).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(9).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(10).setPreferredWidth(150);
        tblAlunos.getColumnModel().getColumn(11).setPreferredWidth(150);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tblAlunos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tblAlunos.setRowHeight(25);
        tblAlunos.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        cbxEstados = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Alunos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Código:");

        txtCodigo.setEditable(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("RG:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Matricula:");

        jLabel6.setText("Telefone:");

        jLabel7.setText("Rua:");

        jLabel8.setText("Número:");

        jLabel9.setText("Bairro:");

        jLabel10.setText("Cidade:");

        jLabel11.setText("Estado:");

        jLabel12.setText("Complemento:");

        txtNome.setEnabled(false);

        txtRg.setEnabled(false);

        txtCpf.setEnabled(false);

        txtMatricula.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtRua.setEnabled(false);

        txtNumero.setEnabled(false);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtBairro.setEnabled(false);

        txtCidade.setEnabled(false);

        txtComplemento.setEnabled(false);

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Matrícula", "Telefone", "Rua", "Número", "Bairro"
            }
        ));
        tblAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        cbxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEstados.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatricula))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtComplemento))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha nome do aluno!!");
        } else {
            aluno = new AlunoM();
            aluno.setAlunoNome(txtNome.getText());
            aluno.setRaAluno(Integer.parseInt(txtMatricula.getText()));
            aluno.setCpfAluno(Integer.parseInt(txtCpf.getText()));
            aluno.setRgAluno(txtRg.getText());
            aluno.setTelefoneAluno(Integer.parseInt(txtTelefone.getText()));
            aluno.setEndRua(txtRua.getText());
            aluno.setEndNumero(Integer.parseInt(txtNumero.getText()));
            aluno.setEndComplemento(txtComplemento.getText());
            aluno.setEndBairro(txtBairro.getText());
            aluno.setEndCidade(txtCidade.getText());
            aluno.setEndEstado(cbxEstados.getSelectedItem().toString());
            try {
                alunoDAO.salvar(aluno);
            } catch (SQLException ex) {
                Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Aluno gravado com sucesso!");
            atualizaTabela();
            preparaSalvarCancelar();
            desativaCampos();
            limpaCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tblAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunosMouseClicked
        // TODO add your handling code here:
        String sCodigo = tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 0).toString();
        int codigo = Integer.parseInt(sCodigo);
        aluno = new AlunoM();
        try {
            aluno = alunoDAO.buscaInt(codigo);
            txtCodigo.setText(String.valueOf(aluno.getIdAluno()));
            txtNome.setText(aluno.getAlunoNome());
            txtMatricula.setText(String.valueOf(aluno.getRaAluno()));
            txtTelefone.setText(String.valueOf(aluno.getTelefoneAluno()));
            txtRua.setText(aluno.getEndRua());
            txtNumero.setText(String.valueOf(aluno.getEndNumero()));
            txtBairro.setText(aluno.getEndBairro());
            txtCpf.setText(String.valueOf(aluno.getCpfAluno()));
            txtRg.setText(aluno.getRgAluno());
            txtComplemento.setText(aluno.getEndComplemento());
            txtCidade.setText(aluno.getEndCidade());
            cbxEstados.removeAllItems();
            cbxEstados.addItem(aluno.getEndEstado());
          
            preparaAlterar();
            btnExcluir.setEnabled(true);
            /*
            txtCodigo.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 0).toString());
            txtNome.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 1).toString());
            txtMatricula.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 2).toString());
            txtTelefone.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 3).toString());
            txtRua.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 4).toString());
            txtNumero.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 5).toString());
            txtBairro.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 6).toString());
            txtCpf.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 7).toString());
            txtRg.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 8).toString());
            txtComplemento.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 9).toString());
            txtCidade.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 10).toString());
            //txtEstado.setText(tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 11).toString());
            */
        } catch (SQLException ex) {
            Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tblAlunosMouseClicked

    public void limpaCampos() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtMatricula.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtComplemento.setText("");
        cbxEstados.removeAllItems();
        preencheCombo();
    }
    
    public void preparaAlterar(){
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnSalvar.setEnabled(false);
        
        cbxEstados.setEnabled(true);
        tblAlunos.setEnabled(false);
        tblAlunos.clearSelection();
        ativaCampos();
    }
    
    public void preparaNovo(){
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        tblAlunos.setEnabled(false);
        tblAlunos.clearSelection();
    }
    
    public void preparaSalvarCancelar(){
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
        tblAlunos.setEnabled(true);
        tblAlunos.clearSelection();
        //cbxUnidade.setSelectedIndex(0);
    }
    
    public void desativaCampos(){
        txtCodigo.setEnabled(false);
        txtNome.setEnabled(false);
        txtMatricula.setEnabled(false);
        txtRg.setEnabled(false);
        txtCpf.setEnabled(false);
        txtTelefone.setEnabled(false);;
        txtRua.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtComplemento.setEnabled(false);
        cbxEstados.setEnabled(false);
        preencheCombo();
        
    }
    
     public void ativaCampos(){
        txtCodigo.setEnabled(true);
        txtNome.setEnabled(true);
        txtMatricula.setEnabled(true);
        txtRg.setEnabled(true);
        txtCpf.setEnabled(true);
        txtTelefone.setEnabled(true);;
        txtRua.setEnabled(true);
        txtNumero.setEnabled(true);
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtComplemento.setEnabled(true);
        cbxEstados.setEnabled(true);
        preencheCombo();
        
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um aluno!");
        } else {
            aluno = new AlunoM();
            aluno.setIdAluno(Integer.parseInt(txtCodigo.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir " + txtNome.getText());
            if (confirma == 0) {
                try {
                    alunoDAO.excluir(aluno);

                } catch (SQLException ex) {
                    Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);

                }
                limpaCampos();
                atualizaTabela();
                desativaCampos();
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnNovo.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCampos();
        preparaNovo();
        ativaCampos();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um Aluno");
        } else {
            aluno = new AlunoM();
            aluno.setIdAluno(Integer.parseInt(txtCodigo.getText()));
            aluno.setAlunoNome(txtNome.getText());
            aluno.setRaAluno(Integer.parseInt(txtMatricula.getText()));
            aluno.setCpfAluno(Integer.parseInt(txtCpf.getText()));
            aluno.setRgAluno(txtRg.getText());
            aluno.setTelefoneAluno(Integer.parseInt(txtTelefone.getText()));
            aluno.setEndRua(txtRua.getText());
            aluno.setEndNumero(Integer.parseInt(txtNumero.getText()));
            aluno.setEndComplemento(txtComplemento.getText());
            aluno.setEndBairro(txtBairro.getText());
            aluno.setEndCidade(txtCidade.getText());
            aluno.setEndEstado(cbxEstados.getSelectedItem().toString());
            try {
                alunoDAO.alterar(aluno);
            } catch (SQLException ex) {
                Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!");
            atualizaTabela();
            limpaCampos();
            desativaCampos();
            btnAlterar.setEnabled(false);
            btnNovo.setEnabled(true);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxEstados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private int parseInt(Object valueAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
