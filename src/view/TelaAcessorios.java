package view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Compra;

public class TelaAcessorios extends javax.swing.JPanel {
    static ArrayList<Compra> carrinho = new ArrayList();
    
    public TelaAcessorios() {
        initComponents();
        invisible();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_acessorios = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_nomesPet = new javax.swing.JLabel();
        rb_cachorro = new javax.swing.JRadioButton();
        rb_gato = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rb_pequeno = new javax.swing.JRadioButton();
        rb_medio = new javax.swing.JRadioButton();
        rb_grande = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        bt_carrinho = new javax.swing.JButton();
        rb_gravatinha = new javax.swing.JRadioButton();
        rb_lacinho = new javax.swing.JRadioButton();
        rb_roupa = new javax.swing.JRadioButton();
        rb_coleira = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        lb_precoGravatinha = new javax.swing.JLabel();
        lb_precoLacinho = new javax.swing.JLabel();
        lb_precoRoupa = new javax.swing.JLabel();
        lb_precoColeira = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        bt_menu = new javax.swing.JButton();

        setBackground(new java.awt.Color(237, 189, 87));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\fmtak\\OneDrive\\Documentos\\FERNANDA\\IFSC\\2022.1\\2022.1_DOO_Fernando Weber Albiero\\NetBeans\\Pet's Friend - Logo.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pet's Friend");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(579, 459));

        lb_acessorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/acessorios.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel5.setText("R. Walmor Ribeiro, 288 - Coral, Lages - SC");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel6.setText("CEP: 88523-060 | Tefefone: (49)1111-2222");

        lb_nomesPet.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        lb_nomesPet.setText("Seu Pet:");

        rb_cachorro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_cachorro);
        rb_cachorro.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_cachorro.setText("Cachorro");

        rb_gato.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_gato);
        rb_gato.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_gato.setText("Gato");

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel4.setText("Porte:");

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

        jPanel2.setBackground(new java.awt.Color(237, 197, 112));

        bt_carrinho.setBackground(new java.awt.Color(255, 255, 255));
        bt_carrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho.png"))); // NOI18N
        bt_carrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_carrinhoMouseClicked(evt);
            }
        });

        rb_gravatinha.setBackground(new java.awt.Color(237, 197, 112));
        rb_gravatinha.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_gravatinha.setText("Gravatinha");
        rb_gravatinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_gravatinhaMouseClicked(evt);
            }
        });

        rb_lacinho.setBackground(new java.awt.Color(237, 197, 112));
        rb_lacinho.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_lacinho.setText("Lacinho");
        rb_lacinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_lacinhoMouseClicked(evt);
            }
        });

        rb_roupa.setBackground(new java.awt.Color(237, 197, 112));
        rb_roupa.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_roupa.setText("Roupa");
        rb_roupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_roupaMouseClicked(evt);
            }
        });

        rb_coleira.setBackground(new java.awt.Color(237, 197, 112));
        rb_coleira.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_coleira.setText("Coleira");
        rb_coleira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_coleiraMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel8.setText("Preço:");

        lb_precoGravatinha.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoGravatinha.setText("R$: 5,00");

        lb_precoLacinho.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoLacinho.setText("R$: 7,00");

        lb_precoRoupa.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoRoupa.setText("R$: 15,00");

        lb_precoColeira.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoColeira.setText("R$: 50,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_lacinho)
                    .addComponent(rb_gravatinha)
                    .addComponent(rb_roupa)
                    .addComponent(rb_coleira))
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lb_precoGravatinha)
                            .addComponent(lb_precoLacinho))
                        .addGap(131, 131, 131)
                        .addComponent(bt_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_precoRoupa)
                    .addComponent(lb_precoColeira))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_gravatinha)
                            .addComponent(lb_precoGravatinha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_lacinho)
                            .addComponent(lb_precoLacinho))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_roupa)
                    .addComponent(lb_precoRoupa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_coleira)
                    .addComponent(lb_precoColeira))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel7.setText("Para ficar mais estiloso:");

        bt_login.setBackground(new java.awt.Color(255, 255, 255));
        bt_login.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(237, 189, 87));
        bt_login.setText("Login");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_nomesPet)
                        .addGap(18, 18, 18)
                        .addComponent(rb_cachorro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_pequeno)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_medio)
                        .addGap(18, 18, 18)
                        .addComponent(rb_grande))
                    .addComponent(rb_gato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_acessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_acessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nomesPet)
                            .addComponent(rb_cachorro)
                            .addComponent(rb_gato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rb_pequeno)
                            .addComponent(rb_medio)
                            .addComponent(rb_grande))))
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(bt_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)))
        );

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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_menu)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void visible(){
        this.lb_precoColeira.setVisible(true);
        this.lb_precoGravatinha.setVisible(true);
        this.lb_precoLacinho.setVisible(true);
        this.lb_precoRoupa.setVisible(true);
    }
    
    private void invisible(){
        this.lb_precoColeira.setVisible(false);
        this.lb_precoGravatinha.setVisible(false);
        this.lb_precoLacinho.setVisible(false);
        this.lb_precoRoupa.setVisible(false);
    }
    
    private void unselected(){
        this.rb_coleira.setSelected(false);
        this.rb_gravatinha.setSelected(false);
        this.rb_lacinho.setSelected(false);
        this.rb_roupa.setSelected(false);
    }
    
    private void bt_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_menuMouseClicked
        Frame.telaInicial = new TelaInical();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaAcessorios);
        frame.add(Frame.telaInicial, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_menuMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        Frame.telaLogin = new TelaLogin();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaAcessorios);
        frame.add(Frame.telaLogin, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_carrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_carrinhoMouseClicked
        Frame.telaCarrinho = new TelaCarrinho(carrinho);
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaAcessorios);
        frame.add(Frame.telaCarrinho, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_carrinhoMouseClicked

    private void rb_pequenoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_pequenoItemStateChanged
        if(rb_pequeno.isSelected()){
            this.lb_precoColeira.setText("R$: 50,00");
            this.lb_precoGravatinha.setText("R$: 5,00");
            this.lb_precoLacinho.setText("R$: 7,00");
            this.lb_precoRoupa.setText("R$: 15,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_pequenoItemStateChanged

    private void rb_medioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_medioItemStateChanged
        if(rb_medio.isSelected()){
            this.lb_precoColeira.setText("R$: 55,00");
            this.lb_precoGravatinha.setText("R$: 10,00");
            this.lb_precoLacinho.setText("R$: 12,00");
            this.lb_precoRoupa.setText("R$: 20,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_medioItemStateChanged

    private void rb_grandeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_grandeItemStateChanged
        if(rb_grande.isSelected()){
            this.lb_precoColeira.setText("R$: 60,00");
            this.lb_precoGravatinha.setText("R$: 15,00");
            this.lb_precoLacinho.setText("R$: 17,00");
            this.lb_precoRoupa.setText("R$: 25,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_grandeItemStateChanged

    private void rb_gravatinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_gravatinhaMouseClicked
        Double precoGravatinha = 0.00;
        
        if(rb_pequeno.isSelected() && rb_gravatinha.isSelected()){
            precoGravatinha = 5.00;
        }else{
            if(rb_medio.isSelected() && rb_gravatinha.isSelected()){
                precoGravatinha = 10.00;
            }else{
                if(rb_grande.isSelected() && rb_gravatinha.isSelected()){
                    precoGravatinha = 15.00;
                }
            }
        }
        if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){
                Compra compra = new Compra("Gravatinha", "Acessórios", 1, precoGravatinha);
                carrinho.add(compra);
                
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }
    }//GEN-LAST:event_rb_gravatinhaMouseClicked

    private void rb_lacinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_lacinhoMouseClicked
       double precoLacinho = 0.00;
        
        if(rb_pequeno.isSelected() && rb_lacinho.isSelected()){
            precoLacinho = 7.00;
        }else{
            if(rb_medio.isSelected() && rb_lacinho.isSelected()){
                precoLacinho = 12.00;
            }else{
                if(rb_grande.isSelected() && rb_lacinho.isSelected()){
                    precoLacinho = 17.00;
                }
            }
        }
        if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){
                Compra compra = new Compra("Lacinho", "Acessórios", 1, precoLacinho);
                carrinho.add(compra);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }
    }//GEN-LAST:event_rb_lacinhoMouseClicked

    private void rb_roupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_roupaMouseClicked
        double precoRoupa = 0.00;
        
        if(rb_pequeno.isSelected() && rb_lacinho.isSelected()){
            precoRoupa = 15.00;
        }else{
            if(rb_medio.isSelected() && rb_lacinho.isSelected()){
                precoRoupa = 20.00;
            }else{
                if(rb_grande.isSelected() && rb_lacinho.isSelected()){
                    precoRoupa = 25.00;
                }
            }
        }
        if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){
                Compra compra = new Compra("Roupa", "Acessórios", 1, precoRoupa);
                carrinho.add(compra);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }
    }//GEN-LAST:event_rb_roupaMouseClicked

    private void rb_coleiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_coleiraMouseClicked
        double precoColeira = 0.00;
        
        if(rb_pequeno.isSelected() && rb_lacinho.isSelected()){
            precoColeira = 50.00;
        }else{
            if(rb_medio.isSelected() && rb_lacinho.isSelected()){
                precoColeira = 55.00;
            }else{
                if(rb_grande.isSelected() && rb_lacinho.isSelected()){
                    precoColeira = 60.00;
                }
            }
        }
        if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){
                Compra compra = new Compra("Coleira", "Acessórios", 1, precoColeira);
                carrinho.add(compra);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }
    }//GEN-LAST:event_rb_coleiraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_carrinho;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_menu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_acessorios;
    private javax.swing.JLabel lb_nomesPet;
    private javax.swing.JLabel lb_precoColeira;
    private javax.swing.JLabel lb_precoGravatinha;
    private javax.swing.JLabel lb_precoLacinho;
    private javax.swing.JLabel lb_precoRoupa;
    private javax.swing.JRadioButton rb_cachorro;
    private javax.swing.JRadioButton rb_coleira;
    private javax.swing.JRadioButton rb_gato;
    private javax.swing.JRadioButton rb_grande;
    private javax.swing.JRadioButton rb_gravatinha;
    private javax.swing.JRadioButton rb_lacinho;
    private javax.swing.JRadioButton rb_medio;
    private javax.swing.JRadioButton rb_pequeno;
    private javax.swing.JRadioButton rb_roupa;
    // End of variables declaration//GEN-END:variables
}
