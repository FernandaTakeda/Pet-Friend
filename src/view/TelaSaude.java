package view;

import controller.Excecao;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Compra;

public class TelaSaude extends javax.swing.JPanel {
     static ArrayList<Compra> carrinho = new ArrayList();

    public TelaSaude() {
        initComponents();
        invisible();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lb_saude = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rb_vacinas = new javax.swing.JRadioButton();
        rb_banho = new javax.swing.JRadioButton();
        rb_tosaNormal = new javax.swing.JRadioButton();
        rb_tosaHigienica = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        lb_precoTosaNormal = new javax.swing.JLabel();
        lb_precoBanho = new javax.swing.JLabel();
        lb_precoTosaHigienica = new javax.swing.JLabel();
        lb_precoVacinas = new javax.swing.JLabel();
        bt_carrinho = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rb_cachorro = new javax.swing.JRadioButton();
        rb_gato = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rb_pequeno = new javax.swing.JRadioButton();
        rb_medio = new javax.swing.JRadioButton();
        rb_grande = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_menu = new javax.swing.JButton();

        setBackground(new java.awt.Color(237, 189, 87));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(579, 459));

        lb_saude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saude.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel5.setText("R. Walmor Ribeiro, 288 - Coral, Lages - SC");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel6.setText("CEP: 88523-060 | Tefefone: (49)1111-2222");

        bt_login.setBackground(new java.awt.Color(255, 255, 255));
        bt_login.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(237, 189, 87));
        bt_login.setText("Login");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel4.setText("Para a saúde do seu pet temos:");

        jPanel2.setBackground(new java.awt.Color(237, 197, 112));

        rb_vacinas.setBackground(new java.awt.Color(237, 197, 112));
        rb_vacinas.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_vacinas.setText("Vacinas");
        rb_vacinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_vacinasMouseClicked(evt);
            }
        });

        rb_banho.setBackground(new java.awt.Color(237, 197, 112));
        rb_banho.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_banho.setText("Banho");
        rb_banho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_banhoMouseClicked(evt);
            }
        });

        rb_tosaNormal.setBackground(new java.awt.Color(237, 197, 112));
        buttonGroup3.add(rb_tosaNormal);
        rb_tosaNormal.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_tosaNormal.setText("Tosa Normal");
        rb_tosaNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_tosaNormalMouseClicked(evt);
            }
        });

        rb_tosaHigienica.setBackground(new java.awt.Color(237, 197, 112));
        buttonGroup3.add(rb_tosaHigienica);
        rb_tosaHigienica.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_tosaHigienica.setText("Tosa Higiênica");
        rb_tosaHigienica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_tosaHigienicaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel7.setText("Preço:");

        lb_precoTosaNormal.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lb_precoTosaNormal.setText("R$: 55,00");

        lb_precoBanho.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lb_precoBanho.setText("R$: 50,00");

        lb_precoTosaHigienica.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lb_precoTosaHigienica.setText("R$: 65,00");

        lb_precoVacinas.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lb_precoVacinas.setText("R$: 85,00");

        bt_carrinho.setBackground(new java.awt.Color(255, 255, 255));
        bt_carrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho.png"))); // NOI18N
        bt_carrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_carrinhoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_tosaHigienica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(lb_precoTosaHigienica))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_tosaNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_precoTosaNormal))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_banho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_precoBanho))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(rb_vacinas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_precoVacinas)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_vacinas)
                            .addComponent(lb_precoVacinas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_banho)
                            .addComponent(lb_precoBanho)))
                    .addComponent(bt_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_tosaNormal)
                    .addComponent(lb_precoTosaNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_tosaHigienica)
                    .addComponent(lb_precoTosaHigienica))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel8.setText("Seu Pet:");

        rb_cachorro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_cachorro);
        rb_cachorro.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_cachorro.setText("Cachorro");

        rb_gato.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_gato);
        rb_gato.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_gato.setText("Gato");

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel9.setText("Porte:");

        rb_pequeno.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rb_pequeno);
        rb_pequeno.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_pequeno.setText("Pequeno");
        rb_pequeno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_pequenoItemStateChanged(evt);
            }
        });

        rb_medio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rb_medio);
        rb_medio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_medio.setText("Médio");
        rb_medio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_medioItemStateChanged(evt);
            }
        });

        rb_grande.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rb_grande);
        rb_grande.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_grande.setText("Grande");
        rb_grande.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_grandeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_cachorro)
                                .addGap(18, 18, 18)
                                .addComponent(rb_gato))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_pequeno)
                                .addGap(18, 18, 18)
                                .addComponent(rb_medio)
                                .addGap(18, 18, 18)
                                .addComponent(rb_grande)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_saude, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(16, 16, 16))
                                    .addComponent(bt_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_saude, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rb_cachorro)
                            .addComponent(rb_gato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(rb_pequeno)
                            .addComponent(rb_medio)
                            .addComponent(rb_grande))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(bt_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\fmtak\\OneDrive\\Documentos\\FERNANDA\\IFSC\\2022.1\\2022.1_DOO_Fernando Weber Albiero\\NetBeans\\Pet's Friend - Logo.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pet's Friend");

        bt_menu.setBackground(new java.awt.Color(255, 255, 255));
        bt_menu.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        bt_menu.setForeground(new java.awt.Color(237, 189, 87));
        bt_menu.setText("Menu");
        bt_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_menuMouseClicked(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(bt_menu))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void invisible(){
        this.lb_precoBanho.setVisible(false);
        this.lb_precoTosaHigienica.setVisible(false);
        this.lb_precoTosaNormal.setVisible(false);
        this.lb_precoVacinas.setVisible(false);
    }
    
    private void visible(){
        this.lb_precoBanho.setVisible(true);
        this.lb_precoTosaHigienica.setVisible(true);
        this.lb_precoTosaNormal.setVisible(true);
        this.lb_precoVacinas.setVisible(true);
    }
    
    private void unselected(){
        this.rb_vacinas.setSelected(false);
        this.rb_banho.setSelected(false);
        this.rb_tosaNormal.setSelected(false);
        this.rb_tosaHigienica.setSelected(false);
    }
    private void bt_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_menuMouseClicked
        Frame.telaInicial = new TelaInical();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaSaude);
        frame.add(Frame.telaInicial, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_menuMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        Frame.telaLogin = new TelaLogin();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaSaude);
        frame.add(Frame.telaLogin, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_carrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_carrinhoMouseClicked
        Frame.telaCarrinho = new TelaCarrinho(carrinho);
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaSaude);
        frame.add(Frame.telaCarrinho, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_carrinhoMouseClicked

    private void rb_pequenoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_pequenoItemStateChanged
        if(rb_pequeno.isSelected()){
            this.lb_precoVacinas.setText("R$: 85,00");
            this.lb_precoBanho.setText("R$: 50,00");
            this.lb_precoTosaNormal.setText("R$: 55,00");
            this.lb_precoTosaHigienica.setText("R$: 65,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_pequenoItemStateChanged

    private void rb_medioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_medioItemStateChanged
        if(rb_medio.isSelected()){
            this.lb_precoVacinas.setText("R$: 95,00");
            this.lb_precoBanho.setText("R$: 60,00");
            this.lb_precoTosaNormal.setText("R$: 65,00");
            this.lb_precoTosaHigienica.setText("R$: 75,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_medioItemStateChanged

    private void rb_grandeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_grandeItemStateChanged
        if(rb_grande.isSelected()){
            this.lb_precoVacinas.setText("R$: 105,00");
            this.lb_precoBanho.setText("R$: 70,00");
            this.lb_precoTosaNormal.setText("R$: 75,00");
            this.lb_precoTosaHigienica.setText("R$: 85,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_grandeItemStateChanged

    private void rb_banhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_banhoMouseClicked
        Double precoBanho = 0.00;
        
        if(rb_pequeno.isSelected() && rb_banho.isSelected()){
            precoBanho = 50.00;
        }else{
            if(rb_medio.isSelected() && rb_banho.isSelected()){
                precoBanho = 60.00;
            }else{
                if( rb_grande.isSelected() && rb_banho.isSelected()){
                 precoBanho = 70.00;   
                }
            }
        }
        
        try {
            
        if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Banho", "Saúde", 1, precoBanho);
                carrinho.add(compra);
                    if(carrinho.isEmpty()){
                        throw new Excecao("Lista Vazia");
                    }
                System.out.println(precoBanho);
                JOptionPane.showMessageDialog(null, "Serviço adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        } 
            
        } catch (Excecao e) {
            e.printStackTrace();
        }
           
    }//GEN-LAST:event_rb_banhoMouseClicked

    private void rb_tosaHigienicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_tosaHigienicaMouseClicked
        Double precoTosaNH = 0.00;
        if(rb_pequeno.isSelected() && rb_tosaHigienica.isSelected()){
            precoTosaNH = 65.00;
        }else{
            if(rb_medio.isSelected() && rb_tosaHigienica.isSelected()){
                precoTosaNH = 75.00;
            }else{
                if( rb_grande.isSelected() && rb_tosaHigienica.isSelected()){
                    precoTosaNH = 85.00;
                }
            }
        }
        
        try {
            if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Tosa Higiênica", "Saúde", 1, precoTosaNH);
                carrinho.add(compra);
                System.out.println(precoTosaNH);
                if(carrinho.isEmpty()){
                        throw new Excecao("Lista Vazia");
                    }
                JOptionPane.showMessageDialog(null, "Serviço adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }
            
        } catch (Excecao e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_rb_tosaHigienicaMouseClicked

    private void rb_tosaNormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_tosaNormalMouseClicked
        Double precoTosaN = 0.00;
        if(rb_pequeno.isSelected() && rb_tosaNormal.isSelected()){
            precoTosaN = 55.00;
        }else{
            if(rb_medio.isSelected() && rb_tosaNormal.isSelected()){
                precoTosaN = 65.00;
            }else{
                if( rb_grande.isSelected() && rb_tosaNormal.isSelected()){
                    precoTosaN = 75.00;
                }
            }
        }
        
        try {
            
        if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Tosa Normal", "Saúde", 1, precoTosaN);
                carrinho.add(compra);
                if(carrinho.isEmpty()){
                        throw new Excecao("Lista Vazia");
                    }
                System.out.println(precoTosaN);
                JOptionPane.showMessageDialog(null, "Serviço adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }
        } catch (Excecao e) {
              e.printStackTrace();
        }
        
    }//GEN-LAST:event_rb_tosaNormalMouseClicked

    private void rb_vacinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_vacinasMouseClicked
        Double precoVacina = 0.00;

        if(rb_pequeno.isSelected() && rb_vacinas.isSelected()){
            precoVacina = 85.00;
        }else{
            if(rb_medio.isSelected() && rb_vacinas.isSelected()){
                precoVacina = 95.00;
            }else{
                if( rb_grande.isSelected() && rb_vacinas.isSelected()){
                    precoVacina = 105.00;
                }
            }
        }
        
        try {
            if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Vacinas", "Saúde", 1, precoVacina);
                carrinho.add(compra);
                 if(carrinho.isEmpty()){
                        throw new Excecao("Lista Vazia");
                    }
                System.out.println(precoVacina);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }
            
        } catch (Excecao e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_rb_vacinasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_carrinho;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_menu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_precoBanho;
    private javax.swing.JLabel lb_precoTosaHigienica;
    private javax.swing.JLabel lb_precoTosaNormal;
    private javax.swing.JLabel lb_precoVacinas;
    private javax.swing.JLabel lb_saude;
    private javax.swing.JRadioButton rb_banho;
    private javax.swing.JRadioButton rb_cachorro;
    private javax.swing.JRadioButton rb_gato;
    private javax.swing.JRadioButton rb_grande;
    private javax.swing.JRadioButton rb_medio;
    private javax.swing.JRadioButton rb_pequeno;
    private javax.swing.JRadioButton rb_tosaHigienica;
    private javax.swing.JRadioButton rb_tosaNormal;
    private javax.swing.JRadioButton rb_vacinas;
    // End of variables declaration//GEN-END:variables

}
