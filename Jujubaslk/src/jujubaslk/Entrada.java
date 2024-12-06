package jujubaslk;

import Classes.Controle;
import Classes.Funcionario;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Entrada extends javax.swing.JFrame {

    //Objeto para execultar as funçoes de sair e salvar
    Controle C = new Controle();
    
    //Construtor que recebe um Controle
    public Entrada(Controle c) {
        initComponents();
        setLocationRelativeTo(null);
        this.C = c; //Associa o Controle recebido ao atributo da classe
    }
    
    public Entrada() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        txthoras = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        btnexibir = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        txtadms = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 43)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("CADASTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 280, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATA DE ADMISSÃO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 180, -1));
        jPanel1.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 530, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VALOR POR HORA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HORAS TRABALHADAS:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 200, -1));

        txtvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorActionPerformed(evt);
            }
        });
        jPanel1.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 220, 40));

        txthoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthorasActionPerformed(evt);
            }
        });
        jPanel1.add(txthoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 250, 40));

        btnsalvar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnsalvar.setForeground(new java.awt.Color(0, 0, 51));
        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 110, 30));

        btnexibir.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnexibir.setForeground(new java.awt.Color(0, 0, 51));
        btnexibir.setText("EXIBIR");
        btnexibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexibirActionPerformed(evt);
            }
        });
        jPanel1.add(btnexibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, 30));

        btnsair.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnsair.setForeground(new java.awt.Color(0, 0, 51));
        btnsair.setText("SAIR");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        jPanel1.add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 90, 30));

        try {
            txtadms.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("                      ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtadms, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 210, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\laila\\Downloads\\WhatsApp Image 2024-12-06 at 10.22.22.jpeg")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorActionPerformed

    private void btnexibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexibirActionPerformed
        new PanImpressao(C).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnexibirActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        try {
            //Captura e valida os campos de entrada
            String nome = txtnome.getText();
            String dataAdmissao = txtadms.getText();
            float valorHora = Float.parseFloat(txtvalor.getText());
            float horasTrabalhadas = Float.parseFloat(txthoras.getText());

            //Cria o funcionário com os dados capturados
            Funcionario funcionario = new Funcionario(nome, dataAdmissao, valorHora, horasTrabalhadas);

            //Salva o funcionário e exibe mensagens
            if (C.salvar(funcionario)) {
                JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                //Limpa os campos e coloca foco no nome
                txtnome.setText("");
                txtadms.setText("");
                txtvalor.setText("");
                txthoras.setText("");
                txtnome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar funcionário!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Os campos 'Valor por Hora' e 'Horas Trabalhadas' devem ser numéricos e estar preenchidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Data de Admissão inválida. Use o formato DD/MM/AAAA.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {// Captura e trata exceções relacionadas a dados inválidos (como nome vazio ou valores negativos)
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void txthorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthorasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexibir;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField txtadms;
    private javax.swing.JTextField txthoras;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
