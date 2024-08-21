package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class TelaInical extends javax.swing.JPanel {
    
    public TelaInical() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_bemVindo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bt_alimentos = new javax.swing.JButton();
        bt_saude = new javax.swing.JButton();
        bt_hospedia = new javax.swing.JButton();
        bt_acessorios = new javax.swing.JButton();
        lb_alimentos = new javax.swing.JLabel();
        lb_saude = new javax.swing.JLabel();
        lb_acessorios = new javax.swing.JLabel();
        lb_hospedia = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        bt_login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 189, 87));

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pet's Friend");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\fmtak\\OneDrive\\Documentos\\FERNANDA\\IFSC\\2022.1\\2022.1_DOO_Fernando Weber Albiero\\NetBeans\\Pet's Friend - Logo.png")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lb_bemVindo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        lb_bemVindo.setText("Bem Vindo ao Pet's Friend!");

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel1.setText("Oferecemos os melhores para o seu amiguinho:");

        bt_alimentos.setBackground(new java.awt.Color(255, 255, 255));
        bt_alimentos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_alimentos.setText("Alimentos");
        bt_alimentos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_alimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_alimentosMouseClicked(evt);
            }
        });

        bt_saude.setBackground(new java.awt.Color(255, 255, 255));
        bt_saude.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_saude.setText("Saúde");
        bt_saude.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_saude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_saudeMouseClicked(evt);
            }
        });

        bt_hospedia.setBackground(new java.awt.Color(255, 255, 255));
        bt_hospedia.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_hospedia.setText("Hospedia");
        bt_hospedia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_hospedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_hospediaMouseClicked(evt);
            }
        });

        bt_acessorios.setBackground(new java.awt.Color(255, 255, 255));
        bt_acessorios.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_acessorios.setText("Acessórios");
        bt_acessorios.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_acessorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_acessoriosMouseClicked(evt);
            }
        });

        lb_alimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alimento.png"))); // NOI18N

        lb_saude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saude.png"))); // NOI18N

        lb_acessorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/acessorios.png"))); // NOI18N

        lb_hospedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hospedia.png"))); // NOI18N

        bt_sair.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        bt_sair.setForeground(new java.awt.Color(237, 189, 87));
        bt_sair.setText("Sair");
        bt_sair.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });

        bt_login.setBackground(new java.awt.Color(255, 255, 255));
        bt_login.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(237, 189, 87));
        bt_login.setText("Login");
        bt_login.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel5.setText("R. Walmor Ribeiro, 288 - Coral, Lages - SC");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel6.setText("CEP: 88523-060 | Tefefone: (49)1111-2222");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_bemVindo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_hospedia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_hospedia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_acessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_saude, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_acessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_saude, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_bemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_saude)
                            .addComponent(bt_alimentos, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_saude, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_acessorios)
                                    .addComponent(bt_hospedia)))
                            .addComponent(lb_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_hospedia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_acessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sair)
                    .addComponent(bt_login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_alimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_alimentosMouseClicked
        Frame.telaAlimentos = new TelaAlimentos();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaInicial);
        frame.add(Frame.telaAlimentos, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_alimentosMouseClicked

    private void bt_saudeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_saudeMouseClicked
        Frame.telaSaude = new TelaSaude();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaInicial);
        frame.add(Frame.telaSaude, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_saudeMouseClicked

    private void bt_hospediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_hospediaMouseClicked
        Frame.telaHospedia = new TelaHospedia();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaInicial);
        frame.add(Frame.telaHospedia, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_hospediaMouseClicked

    private void bt_acessoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_acessoriosMouseClicked
        Frame.telaAcessorios = new TelaAcessorios();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaInicial);
        frame.add(Frame.telaAcessorios, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_acessoriosMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        Frame.telaLogin = new TelaLogin();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaInicial);
        frame.add(Frame.telaLogin, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_bt_sairMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_acessorios;
    private javax.swing.JButton bt_alimentos;
    private javax.swing.JButton bt_hospedia;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_saude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_acessorios;
    private javax.swing.JLabel lb_alimentos;
    private javax.swing.JLabel lb_bemVindo;
    private javax.swing.JLabel lb_hospedia;
    private javax.swing.JLabel lb_saude;
    // End of variables declaration//GEN-END:variables
}
