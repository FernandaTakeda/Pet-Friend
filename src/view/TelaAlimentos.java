package view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Compra;

public class TelaAlimentos extends javax.swing.JPanel {
    static ArrayList<Compra> carrinho = new ArrayList();
    
    public TelaAlimentos() {
        initComponents();
        invisible();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bt_alimentos1 = new javax.swing.JButton();
        bt_saude1 = new javax.swing.JButton();
        bt_hospedia1 = new javax.swing.JButton();
        bt_acessorios1 = new javax.swing.JButton();
        lb_alimentos1 = new javax.swing.JLabel();
        lb_saude1 = new javax.swing.JLabel();
        lb_acessorios1 = new javax.swing.JLabel();
        lb_hospedia1 = new javax.swing.JLabel();
        bt_sair1 = new javax.swing.JButton();
        bt_login1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_menu1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_alimentos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rb_cachorro = new javax.swing.JRadioButton();
        rb_gato = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rb_racaoFilhote = new javax.swing.JRadioButton();
        rb_racaoDiet = new javax.swing.JRadioButton();
        rb_racaoVegana = new javax.swing.JRadioButton();
        rb_racaoHipoalergenica = new javax.swing.JRadioButton();
        rb_racaoOrganica = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lb_precoVegana = new javax.swing.JLabel();
        lb_precoFilhotes = new javax.swing.JLabel();
        lb_precoDiet = new javax.swing.JLabel();
        lb_precoOrganica = new javax.swing.JLabel();
        lb_precoHipoalergenica = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bt_carrinho = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rb_pequeno = new javax.swing.JRadioButton();
        rb_medio = new javax.swing.JRadioButton();
        rb_grande = new javax.swing.JRadioButton();
        bt_menu = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(237, 189, 87));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pet's Friend");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\fmtak\\OneDrive\\Documentos\\FERNANDA\\IFSC\\2022.1\\2022.1_DOO_Fernando Weber Albiero\\NetBeans\\Pet's Friend - Logo.png")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel9.setText("Bem Vindo ao Pet's Friend!");

        jLabel10.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel10.setText("Oferecemos o melhor para o seu amiguinho:");

        bt_alimentos1.setBackground(new java.awt.Color(255, 255, 255));
        bt_alimentos1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_alimentos1.setText("Alimentos");
        bt_alimentos1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));

        bt_saude1.setBackground(new java.awt.Color(255, 255, 255));
        bt_saude1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_saude1.setText("Saúde");
        bt_saude1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));

        bt_hospedia1.setBackground(new java.awt.Color(255, 255, 255));
        bt_hospedia1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_hospedia1.setText("Hospedia");
        bt_hospedia1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));

        bt_acessorios1.setBackground(new java.awt.Color(255, 255, 255));
        bt_acessorios1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_acessorios1.setText("Acessórios");
        bt_acessorios1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));

        lb_alimentos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alimento.png"))); // NOI18N

        lb_saude1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saude.png"))); // NOI18N

        lb_acessorios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/acessorios.png"))); // NOI18N

        lb_hospedia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hospedia.png"))); // NOI18N

        bt_sair1.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        bt_sair1.setForeground(new java.awt.Color(237, 189, 87));
        bt_sair1.setText("Sair");
        bt_sair1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));

        bt_login1.setBackground(new java.awt.Color(255, 255, 255));
        bt_login1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        bt_login1.setForeground(new java.awt.Color(237, 189, 87));
        bt_login1.setText("Login");

        jLabel11.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel11.setText("R. Walmor Ribeiro, 288 - Coral, Lages - SC");

        jLabel12.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel12.setText("CEP: 88523-060 | Tefefone: (49)1111-2222");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt_hospedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_alimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_alimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_hospedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_acessorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_saude1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_acessorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_saude1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bt_sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_saude1)
                            .addComponent(bt_alimentos1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lb_saude1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bt_acessorios1)
                                    .addComponent(bt_hospedia1)))
                            .addComponent(lb_alimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_hospedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_acessorios1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_sair1)
                    .addComponent(bt_login1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)))
        );

        lb_menu1.setBackground(new java.awt.Color(255, 255, 255));
        lb_menu1.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 24)); // NOI18N
        lb_menu1.setForeground(new java.awt.Color(255, 255, 255));
        lb_menu1.setText("Menu");
        lb_menu1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lb_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(237, 189, 87));
        setPreferredSize(new java.awt.Dimension(599, 562));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\fmtak\\OneDrive\\Documentos\\FERNANDA\\IFSC\\2022.1\\2022.1_DOO_Fernando Weber Albiero\\NetBeans\\Pet's Friend - Logo.png")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pet's Friend");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(579, 459));

        lb_alimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alimento.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel5.setText("R. Walmor Ribeiro, 288 - Coral, Lages - SC");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel6.setText("CEP: 88523-060 | Tefefone: (49)1111-2222");

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

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel4.setText("Seu Pet:");

        rb_cachorro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_cachorro);
        rb_cachorro.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_cachorro.setText("Cachorro");

        rb_gato.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_gato);
        rb_gato.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_gato.setText("Gato");

        jPanel2.setBackground(new java.awt.Color(237, 197, 112));

        rb_racaoFilhote.setBackground(new java.awt.Color(237, 197, 112));
        rb_racaoFilhote.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_racaoFilhote.setText("Para filhotes");
        rb_racaoFilhote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_racaoFilhoteMouseClicked(evt);
            }
        });

        rb_racaoDiet.setBackground(new java.awt.Color(237, 197, 112));
        rb_racaoDiet.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_racaoDiet.setText("Ração Diet");
        rb_racaoDiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_racaoDietMouseClicked(evt);
            }
        });

        rb_racaoVegana.setBackground(new java.awt.Color(237, 197, 112));
        rb_racaoVegana.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_racaoVegana.setText("Ração Vegana");
        rb_racaoVegana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_racaoVeganaMouseClicked(evt);
            }
        });

        rb_racaoHipoalergenica.setBackground(new java.awt.Color(237, 197, 112));
        rb_racaoHipoalergenica.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_racaoHipoalergenica.setText("Ração Hipoalergênica");
        rb_racaoHipoalergenica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_racaoHipoalergenicaMouseClicked(evt);
            }
        });

        rb_racaoOrganica.setBackground(new java.awt.Color(237, 197, 112));
        rb_racaoOrganica.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        rb_racaoOrganica.setText("Ração Orgânica");
        rb_racaoOrganica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_racaoOrganicaMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel3.setText("Preço:");

        lb_precoVegana.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoVegana.setText("R$: 30,00");

        lb_precoFilhotes.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoFilhotes.setText("R$: 50,00");

        lb_precoDiet.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoDiet.setText("R$: 45,00");

        lb_precoOrganica.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoOrganica.setText("R$: 30,00");

        lb_precoHipoalergenica.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 13)); // NOI18N
        lb_precoHipoalergenica.setText("R$: 55,00");

        jLabel21.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel21.setText("Ração 900g:");

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_racaoVegana)
                            .addComponent(rb_racaoOrganica)
                            .addComponent(rb_racaoDiet)
                            .addComponent(rb_racaoFilhote)
                            .addComponent(rb_racaoHipoalergenica)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_precoHipoalergenica)
                            .addComponent(lb_precoOrganica)
                            .addComponent(lb_precoVegana)
                            .addComponent(lb_precoDiet)
                            .addComponent(lb_precoFilhotes))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lb_precoFilhotes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_precoDiet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_precoVegana))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rb_racaoFilhote)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_racaoDiet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_racaoVegana)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rb_racaoOrganica)
                                    .addComponent(lb_precoOrganica))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rb_racaoHipoalergenica)
                                    .addComponent(lb_precoHipoalergenica))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel2.setText("Porte:");

        jLabel16.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel16.setText("Oferecemos os melhores para o seu amiguinho:");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb_cachorro)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_gato))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb_pequeno)
                                        .addGap(22, 22, 22)
                                        .addComponent(rb_medio)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_grande)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(lb_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
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
                    .addComponent(lb_alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rb_cachorro)
                            .addComponent(rb_gato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rb_pequeno)
                            .addComponent(rb_medio)
                            .addComponent(rb_grande))))
                .addGap(8, 8, 8)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bt_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_menu))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void invisible(){
        this.lb_precoDiet.setVisible(false);
        this.lb_precoFilhotes.setVisible(false);
        this.lb_precoHipoalergenica.setVisible(false);
        this.lb_precoOrganica.setVisible(false);
        this.lb_precoVegana.setVisible(false);
    }
    
    private void visible(){
        this.lb_precoDiet.setVisible(true);
        this.lb_precoFilhotes.setVisible(true);
        this.lb_precoHipoalergenica.setVisible(true);
        this.lb_precoOrganica.setVisible(true);
        this.lb_precoVegana.setVisible(true);
    }
    
    private void unselected(){
        this.rb_racaoDiet.setSelected(false);
        this.rb_racaoFilhote.setSelected(false);
        this.rb_racaoHipoalergenica.setSelected(false);
        this.rb_racaoOrganica.setSelected(false);
        this.rb_racaoVegana.setSelected(false);
    }
    
    private void bt_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_menuMouseClicked
        Frame.telaInicial = new TelaInical();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaAlimentos);
        frame.add(Frame.telaInicial, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_menuMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        Frame.telaLogin = new TelaLogin();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaAlimentos);
        frame.add(Frame.telaLogin, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_carrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_carrinhoMouseClicked
        Frame.telaCarrinho = new TelaCarrinho(carrinho);
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaAlimentos);
        frame.add(Frame.telaCarrinho, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_carrinhoMouseClicked

    private void rb_pequenoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_pequenoItemStateChanged
        if(rb_pequeno.isSelected()){
            this.lb_precoDiet.setText("R$: 45,00");
            this.lb_precoFilhotes.setText("R$: 50,00");
            this.lb_precoHipoalergenica.setText("R$: 55,00");
            this.lb_precoOrganica.setText("R$: 30,00");
            this.lb_precoVegana.setText("R$: 30,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_pequenoItemStateChanged

    private void rb_medioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_medioItemStateChanged
        if(rb_medio.isSelected()){
            this.lb_precoDiet.setText("R$: 55,00");
            this.lb_precoFilhotes.setText("R$: 60,00");
            this.lb_precoHipoalergenica.setText("R$: 65,00");
            this.lb_precoOrganica.setText("R$: 40,00");
            this.lb_precoVegana.setText("R$: 40,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_medioItemStateChanged

    private void rb_grandeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_grandeItemStateChanged
        if(rb_grande.isSelected()){
            this.lb_precoDiet.setText("R$: 70,00");
            this.lb_precoFilhotes.setText("R$: 75,00");
            this.lb_precoHipoalergenica.setText("R$: 90,00");
            this.lb_precoOrganica.setText("R$: 55,00");
            this.lb_precoVegana.setText("R$: 55,00");
            visible();
        }else{
            unselected();
        }
    }//GEN-LAST:event_rb_grandeItemStateChanged

    private void rb_racaoFilhoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_racaoFilhoteMouseClicked
        Double precoRfilhote = 0.00;
        
        if(rb_pequeno.isSelected() && rb_racaoFilhote.isSelected()){
            precoRfilhote = 50.00;
        }else{
            if(rb_medio.isSelected() && rb_racaoFilhote.isSelected()){
                precoRfilhote = 60.00;
            }else{
                if( rb_grande.isSelected() && rb_racaoFilhote.isSelected()){
                 precoRfilhote = 75.00;   
                }
            }
        }
         if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Ração para Filhotes", "Alimento", 1, precoRfilhote);
                carrinho.add(compra);
                System.out.println(precoRfilhote);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }    
        
    }//GEN-LAST:event_rb_racaoFilhoteMouseClicked

    private void rb_racaoDietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_racaoDietMouseClicked
        Double precoRdiet = 0.00;
        
        if(rb_pequeno.isSelected() && rb_racaoDiet.isSelected()){
            precoRdiet = 45.00;
        }else{
            if(rb_medio.isSelected() && rb_racaoDiet.isSelected()){
                precoRdiet = 55.00;
            }else{
                if( rb_grande.isSelected() && rb_racaoDiet.isSelected()){
                 precoRdiet = 70.00;   
                }
            }
        }
         if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Ração Diet", "Alimento", 1, precoRdiet);
                carrinho.add(compra);
                System.out.println(precoRdiet);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }    
    }//GEN-LAST:event_rb_racaoDietMouseClicked

    private void rb_racaoVeganaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_racaoVeganaMouseClicked
         Double precoRvegana = 0.00;
        
        if(rb_pequeno.isSelected() && rb_racaoVegana.isSelected()){
            precoRvegana = 30.00;
        }else{
            if(rb_medio.isSelected() && rb_racaoVegana.isSelected()){
                precoRvegana = 40.00;
            }else{
                if( rb_grande.isSelected() && rb_racaoVegana.isSelected()){
                 precoRvegana = 55.00;   
                }
            }
        }
         if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Ração Vegana", "Alimento", 1, precoRvegana);
                carrinho.add(compra);
                System.out.println(precoRvegana);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }    
    }//GEN-LAST:event_rb_racaoVeganaMouseClicked

    private void rb_racaoOrganicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_racaoOrganicaMouseClicked
        Double precoRorganica = 0.00;
        
        if(rb_pequeno.isSelected() && rb_racaoOrganica.isSelected()){
            precoRorganica = 30.00;
        }else{
            if(rb_medio.isSelected() && rb_racaoOrganica.isSelected()){
                precoRorganica = 40.00;
            }else{
                if( rb_grande.isSelected() && rb_racaoOrganica.isSelected()){
                 precoRorganica = 55.00;   
                }
            }
        }
         if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Ração Orgânica", "Alimento", 1, precoRorganica);
                carrinho.add(compra);
                System.out.println(precoRorganica);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }    
    }//GEN-LAST:event_rb_racaoOrganicaMouseClicked

    private void rb_racaoHipoalergenicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_racaoHipoalergenicaMouseClicked
        Double precoRhipoalergenica = 0.00;
        
        if(rb_pequeno.isSelected() && rb_racaoHipoalergenica.isSelected()){
            precoRhipoalergenica = 55.00;
        }else{
            if(rb_medio.isSelected() && rb_racaoHipoalergenica.isSelected()){
                precoRhipoalergenica = 65.00;
            }else{
                if( rb_grande.isSelected() && rb_racaoHipoalergenica.isSelected()){
                 precoRhipoalergenica = 90.00;   
                }
            }
        }
         if(rb_cachorro.isSelected() || rb_gato.isSelected()){
            if(rb_pequeno.isSelected() || rb_medio.isSelected() || rb_grande.isSelected()){

                Compra compra = new Compra("Ração Hipoalergênica", "Alimento", 1, precoRhipoalergenica);
                carrinho.add(compra);
                System.out.println(precoRhipoalergenica);
                JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com Sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione o Porte do seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
                unselected();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione primeiro o seu Pet", "ERRO!", JOptionPane.ERROR_MESSAGE);
            unselected();
        }    
    }//GEN-LAST:event_rb_racaoHipoalergenicaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_acessorios1;
    private javax.swing.JButton bt_alimentos1;
    private javax.swing.JButton bt_carrinho;
    private javax.swing.JButton bt_hospedia1;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_login1;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_sair1;
    private javax.swing.JButton bt_saude1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_acessorios1;
    private javax.swing.JLabel lb_alimentos;
    private javax.swing.JLabel lb_alimentos1;
    private javax.swing.JLabel lb_hospedia1;
    private javax.swing.JLabel lb_menu1;
    private javax.swing.JLabel lb_precoDiet;
    private javax.swing.JLabel lb_precoFilhotes;
    private javax.swing.JLabel lb_precoHipoalergenica;
    private javax.swing.JLabel lb_precoOrganica;
    private javax.swing.JLabel lb_precoVegana;
    private javax.swing.JLabel lb_saude1;
    private javax.swing.JRadioButton rb_cachorro;
    private javax.swing.JRadioButton rb_gato;
    private javax.swing.JRadioButton rb_grande;
    private javax.swing.JRadioButton rb_medio;
    private javax.swing.JRadioButton rb_pequeno;
    private javax.swing.JRadioButton rb_racaoDiet;
    private javax.swing.JRadioButton rb_racaoFilhote;
    private javax.swing.JRadioButton rb_racaoHipoalergenica;
    private javax.swing.JRadioButton rb_racaoOrganica;
    private javax.swing.JRadioButton rb_racaoVegana;
    // End of variables declaration//GEN-END:variables
}
