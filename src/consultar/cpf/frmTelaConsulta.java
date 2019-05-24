/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultar.cpf;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class frmTelaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form frmTelaConsulta
     */
    public frmTelaConsulta() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(161, 199, 235));

        jPanel2.setBackground(new java.awt.Color(43, 100, 153));

        btnSair.setBackground(new java.awt.Color(43, 100, 153));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("X");
        btnSair.setBorder(null);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Digite o CPF: ");

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCpf)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    int contTeclas = 0;
    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased

        // Enter para o ok do JOptionPane
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            contTeclas--;
        }
        
        // Verifica se a tecla BakeSpace foi clicada, caso seja true
        // Subtrai um valor do contTeclas
        // Caso seja false, ele continua a somar
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            // Só irá subtrair caso a variavel seja maior que zero
            if (contTeclas > 0) {
                contTeclas--;
            }
        } else {
            contTeclas++;
        }

        if (contTeclas == 11) {
            String cpfSemMask;
            cpfSemMask = txtCpf.getText();

            cpfSemMask = cpfSemMask.replace(".", "");
            cpfSemMask = cpfSemMask.replace("-", "");

            JOptionPane.showMessageDialog(null, consultarCpf(cpfSemMask));

            txtCpf.setText("");
            contTeclas = 0;
        }

    }//GEN-LAST:event_txtCpfKeyReleased

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        Color vermelho = new Color(225, 0, 0);
        btnSair.setBackground(vermelho);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        Color vermelho = new Color(43,100,153);
        btnSair.setBackground(vermelho);
    }//GEN-LAST:event_btnSairMouseExited

    public String consultarCpf(String cpf) {

        int numero, soma1 = 0, soma2 = 0, cont, digito1, digito2;
        char letra;

        //Limitando a quantidade de caracteres
        cpf = cpf.substring(0, 11);

        //Fazendo o calculo do 1 digito verificador
        cont = 10;
        for (int i = 0; i <= 8; i++) {
            //Pegando o caracter do cpf na posicao de i
            //quando for i = 0, letra vai receber o valor da 1 posicao do cpf
            //letra = cpf.charAt(0)
            letra = cpf.charAt(i);

            //Convertendo esse caracter em um valor inteiro
            numero = Character.getNumericValue(letra);

            //A primeira posicao ira multiplicar por 10, a segunda por 9...
            //Vamos pegar a multiplicacao de cada e somar
            //A*10 + B*9 + C*8 + D*7 + E*6 + F*5 + G*4 + H*3 + I*2 
            soma1 = soma1 + (numero * cont);

            cont--;
        }

        //verificando qual numero ira preencher o 1 digito verificador
        if (soma1 % 11 < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - (soma1 % 11);
        }

        //Fazendo o calculo do 2 digito verificador
        cont = 11;
        for (int i = 0; i <= 9; i++) {
            letra = cpf.charAt(i);
            numero = Character.getNumericValue(letra);

            //A*11 + B*10 + C*9 + D*8 + E*7 + F*6 + G*5 + H*4 + I*3 + J*2 
            soma2 = soma2 + (numero * cont);
            cont--;
        }

        //verificando qual numero ira preencher o 2 digito verificador
        if (soma2 % 11 < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - (soma2 % 11);
        }

        //Verificando os digitos para saber se o CPF e valido
        if (Character.toString(cpf.charAt(9)).equals(Integer.toString(digito1)) && Character.toString(cpf.charAt(10)).equals(Integer.toString(digito2))) {
            return "O CPF existe";
        } else {
            return "O CPF não existe";
        }
        
    }

    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmTelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txtCpf;
    // End of variables declaration//GEN-END:variables
}
