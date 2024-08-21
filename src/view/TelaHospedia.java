package view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Compra;

public class TelaHospedia extends javax.swing.JPanel {
    static ArrayList<Compra> carrinho = new ArrayList();

    
    public TelaHospedia() {
        initComponents();
        invisible();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lb_hospedia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bt_carrinho = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rb_matutina = new javax.swing.JRadioButton();
        rb_vespertina = new javax.swing.JRadioButton();
        rb_noturna = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        lb_precoMatutina = new javax.swing.JLabel();
        lb_precoVespertina = new javax.swing.JLabel();
        lb_precoNoturna = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rb_cachorro = new javax.swing.JRadioButton();
        rb_gato = new javax.swing.JRadioButton();
        rb_pequeno = new javax.swing.JRadioButton();
        rb_medio = new javax.swing.JRadioButton();
        rb_grande = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_menu = new javax.swing.JButton();

        setBackground(new java.awt.Color(237, 189, 87));
        setPreferredSize(new java.awt.Dimension(599, 562));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(579, 459));

        lb_hospedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hospedia.png"))); // NOI18N

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

        jPanel2.setBackground(new java.awt.Color(237, 197, 112));

        bt_carrinho.setBackground(new java.awt.Color(255, 255, 255));
        bt_carrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho.png"))); // NOI18N
        bt_carrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_carrinhoMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel8.setText("Preço:");

        rb_matutina.setBackground(new java.awt.Color(237, 197, 112));
        rb_matutina.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_matutina.setText("Matutina");
        rb_matutina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_matutinaMouseClicked(evt);
            }
        });

        rb_vespertina.setBackground(new java.awt.Color(237, 197, 112));
        rb_vespertina.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_vespertina.setText("Vespertina");
        rb_vespertina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_vespertinaMouseClicked(evt);
            }
        });

        rb_noturna.setBackground(new java.awt.Color(237, 197, 112));
        rb_noturna.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_noturna.setText("Noturna");
        rb_noturna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_noturnaMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel9.setText("Estadia:");

        lb_precoMatutina.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoMatutina.setText("R$: 30,00");

        lb_precoVespertina.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoVespertina.setText("R$: 40,00");

        lb_precoNoturna.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoNoturna.setText("R$: 50,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_precoMatutina))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rb_noturna)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lb_precoNoturna))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rb_vespertina)
                                            .addComponent(rb_matutina))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lb_precoVespertina)))))
                        .addGap(123, 123, 123)))
                .addComponent(bt_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_matutina)
                            .addComponent(lb_precoMatutina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_precoVespertina)
                            .addComponent(rb_vespertina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_precoNoturna)
                            .addComponent(rb_noturna))))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel1.setText("Seu Pet:");

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel4.setText("Porte:");

        rb_cachorro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_cachorro);
        rb_cachorro.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_cachorro.setText("Cachorro");

        rb_gato.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_gato);
        rb_gato.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_gato.setText("Gato");

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

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel7.setText("Para se sentir como se estivesse em casa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
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
                        .addComponent(lb_hospedia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_hospedia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(rb_cachorro)
                            .addComponent(rb_gato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rb_pequeno)
                            .addComponent(rb_medio)
                            .addComponent(rb_grande))))
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(bt_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_menu))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void invisible(){
        this.lb_precoMatutina.setVisible(false);
        this.lb_precoVespertina.setVisible(false);
        this.lb_precoNoturna.setVisible(false);
    }
    
    private void visible(){
        this.lb_precoMatutina.setVisible(true);
        this.lb_precoVespertina.setVisible(true);
        this.lb_precoNoturna.setVisible(true);
    }
    
    private void unselected(){
        this.rb_matutina.setSelected(false);
        this.rb_vespertina.setSelected(false);
        this.rb_noturna.setSelected(false);
    }
    
    private void bt_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_menuMouseClicked
        Frame.telaInicial = new TelaInical();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaHospedia);
        frame.add(Frame.telaInicial, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_menuMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        Frame.telaLogin = new TelaLogin();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaHospedia);
        frame.add(Frame.telaLogin, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_carrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_carrinhoMouseClicked
        Frame.telaCarrinho = new TelaCarrinho(carrinho);
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaHospedia);
        frame.add(Frame.telaCarrinho, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_carrinhoMouseClicked

    private void rb_pequenoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_pequenoItemStateChanged
        if(rb_pequeno.isSelected()){
            this.lb_precoMatutina.setText("R$: 30,00");
            this.lb_precoVespertina.setText("R$: 40,00");
            this.lb_precoNoturna.setText("R$: 50,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_pequenoItemStateChanged

    private void rb_medioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_medioItemStateChanged
        if(rb_medio.isSelected()){
            this.lb_precoMatutina.setText("R$: 35,00");
            this.lb_precoVespertina.setText("R$: 45,00");
            this.lb_precoNoturna.setText("R$: 55,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_medioItemStateChanged

    private void rb_grandeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_grandeItemStateChanged
       if(rb_grande.isSelected()){
           this.lb_precoMatutina.setText("R$: 45,00");
            this.lb_precoVespertina.setText("R$: 55,00");
            this.lb_precoNoturna.setText("R$: 65,00");
            visible();
       }else{
           unselected();
       }
    }//GEN-LAST:event_rb_grandeItemStateChanged

    private void rb_matutinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_matutinaMouseClicked
        Double precoMatutina = 0.00;
        
        if(rb_pequeno.isSelected() && rb_matutina.isSelected()){
            precoMatutina = 30.00;
        }else{
            if(rb_medio.isSelected() && rb_matutina.isSelected()){
                precoMatutina = 35.00;
            }else{
                if( rb_grande.isSelected() && rb_matutina.isSelected()){
                 precoMatutina = 40.00;   
                }
            }
        }
         if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Periodo Matutino", "Hospedia", 1, precoMatutina);
                carrinho.add(compra);
                System.out.println(precoMatutina);
                JOptionPane.showMessageDialog(null, "Serviço adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }    
    }//GEN-LAST:event_rb_matutinaMouseClicked

    private void rb_vespertinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_vespertinaMouseClicked
        Double precoVespertino = 0.00;
        
        if(rb_pequeno.isSelected() && rb_vespertina.isSelected()){
            precoVespertino = 40.00;
        }else{
            if(rb_medio.isSelected() && rb_vespertina.isSelected()){
                precoVespertino = 45.00;
            }else{
                if( rb_grande.isSelected() && rb_vespertina.isSelected()){
                 precoVespertino = 55.00;   
                }
            }
        }
         if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Periodo Vespertino", "Hospedia", 1, precoVespertino);
                carrinho.add(compra);
                System.out.println(precoVespertino);
                JOptionPane.showMessageDialog(null, "Serviço adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }    
    }//GEN-LAST:event_rb_vespertinaMouseClicked

    private void rb_noturnaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_noturnaMouseClicked
        Double precoNoturno = 0.00;
        
        if(rb_pequeno.isSelected() && rb_noturna.isSelected()){
            precoNoturno = 50.00;
        }else{
            if(rb_medio.isSelected() && rb_noturna.isSelected()){
                precoNoturno = 55.00;
            }else{
                if( rb_grande.isSelected() && rb_noturna.isSelected()){
                 precoNoturno = 65.00;   
                }
            }
        }
         if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Periodo Noturno", "Hospedia", 1, precoNoturno);
                carrinho.add(compra);
                System.out.println(precoNoturno);
                JOptionPane.showMessageDialog(null, "Serviço adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }    
    }//GEN-LAST:event_rb_noturnaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_carrinho;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_menu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel lb_hospedia;
    private javax.swing.JLabel lb_precoMatutina;
    private javax.swing.JLabel lb_precoNoturna;
    private javax.swing.JLabel lb_precoVespertina;
    private javax.swing.JRadioButton rb_cachorro;
    private javax.swing.JRadioButton rb_gato;
    private javax.swing.JRadioButton rb_grande;
    private javax.swing.JRadioButton rb_matutina;
    private javax.swing.JRadioButton rb_medio;
    private javax.swing.JRadioButton rb_noturna;
    private javax.swing.JRadioButton rb_pequeno;
    private javax.swing.JRadioButton rb_vespertina;
    // End of variables declaration//GEN-END:variables
}
