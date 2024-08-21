package view;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class TelaCarrinho extends javax.swing.JPanel {

    public TelaCarrinho(ArrayList carrinho) {
        initComponents();
        mostrarCarrinho();
        preco();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_menu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_carrinho = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lb_valorTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_atualizar = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();
        bt_pagar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rb_boleto = new javax.swing.JRadioButton();
        rb_cartaoCredito = new javax.swing.JRadioButton();
        rb_cartaoDebito = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(237, 189, 87));

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jLabel1.setText("Carrinho:");

        jPanel3.setBackground(new java.awt.Color(237, 197, 112));

        tb_carrinho.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        tb_carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Setor", "Produto/Serviço", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_carrinho);

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel4.setText("Total:");

        lb_valorTotal.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        lb_valorTotal.setText("valorTotal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lb_valorTotal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_valorTotal)))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho.png"))); // NOI18N

        bt_atualizar.setBackground(new java.awt.Color(255, 255, 255));
        bt_atualizar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_atualizar.setText("Atualizar");
        bt_atualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_atualizarMouseClicked(evt);
            }
        });

        bt_remover.setBackground(new java.awt.Color(255, 255, 255));
        bt_remover.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        bt_remover.setText("Remover");
        bt_remover.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerMouseClicked(evt);
            }
        });

        bt_pagar.setBackground(new java.awt.Color(255, 255, 255));
        bt_pagar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        bt_pagar.setText("Pagar");
        bt_pagar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 189, 87), null));
        bt_pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pagarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel5.setText("Pagamento:");

        rb_boleto.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_boleto);
        rb_boleto.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_boleto.setText("Boleto Bancario");

        rb_cartaoCredito.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_cartaoCredito);
        rb_cartaoCredito.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_cartaoCredito.setText("Cartão Crédito");

        rb_cartaoDebito.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb_cartaoDebito);
        rb_cartaoDebito.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        rb_cartaoDebito.setText("Cartão Débito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(rb_boleto)
                        .addGap(18, 18, 18)
                        .addComponent(rb_cartaoCredito)
                        .addGap(18, 18, 18)
                        .addComponent(rb_cartaoDebito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_atualizar)
                            .addComponent(bt_remover)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(rb_boleto)
                        .addComponent(rb_cartaoCredito)
                        .addComponent(rb_cartaoDebito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarCarrinho(){
        ((DefaultTableModel)tb_carrinho.getModel()).setRowCount(0);
        
        for(int i=0; i<TelaSaude.carrinho.size(); i++){
            ((DefaultTableModel)tb_carrinho.getModel()).addRow(new Object[]{
            TelaSaude.carrinho.get(i).getSetor(), TelaSaude.carrinho.get(i).getProdutoServico(),
            TelaSaude.carrinho.get(i).getQuantidade(), TelaSaude.carrinho.get(i).getPreco() });
        }
        
        for(int i=0; i<TelaAcessorios.carrinho.size(); i++){
            ((DefaultTableModel)tb_carrinho.getModel()).addRow(new Object[]{
            TelaAcessorios.carrinho.get(i).getSetor(), TelaAcessorios.carrinho.get(i).getProdutoServico(),
            TelaAcessorios.carrinho.get(i).getQuantidade(), TelaAcessorios.carrinho.get(i).getPreco() });
        }
        
        for(int i=0; i<TelaAlimentos.carrinho.size(); i++){
            ((DefaultTableModel)tb_carrinho.getModel()).addRow(new Object[]{
            TelaAlimentos.carrinho.get(i).getSetor(), TelaAlimentos.carrinho.get(i).getProdutoServico(),
            TelaAlimentos.carrinho.get(i).getQuantidade(), TelaAlimentos.carrinho.get(i).getPreco() });
        }
        
        for(int i=0; i<TelaHospedia.carrinho.size(); i++){
            ((DefaultTableModel)tb_carrinho.getModel()).addRow(new Object[]{
            TelaHospedia.carrinho.get(i).getSetor(), TelaHospedia.carrinho.get(i).getProdutoServico(),
            TelaHospedia.carrinho.get(i).getQuantidade(), TelaHospedia.carrinho.get(i).getPreco() });
        }
            if(TelaSaude.carrinho.isEmpty() && TelaAcessorios.carrinho.isEmpty() && 
               TelaAlimentos.carrinho.isEmpty() && TelaHospedia.carrinho.isEmpty() ){
                JOptionPane.showMessageDialog(null, "Carrinho Vazio!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
    private void preco(){
//        Double preco = 0.00;
//        for (int i = 0; i<TelaSaude.carrinho.size() || i<TelaAcessorios.carrinho.size() ||
//                        i<TelaAlimentos.carrinho.size() || i<TelaHospedia.carrinho.size(); i++) {
//            preco = preco + ((TelaSaude.carrinho.get(i).getQuantidade())*(TelaSaude.carrinho.get(i).getPreco())
//                            + (TelaAcessorios.carrinho.get(i).getQuantidade())*(TelaAcessorios.carrinho.get(i).getPreco())
//                            + (TelaAlimentos.carrinho.get(i).getQuantidade())*(TelaAlimentos.carrinho.get(i).getPreco())
//                            + (TelaHospedia.carrinho.get(i).getQuantidade())*(TelaHospedia.carrinho.get(i).getPreco())
//                            );
//        }
//        String result = String.format("%.2f", preco);
//        lb_valorTotal.setText(result);
    }
    
    private void bt_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_menuMouseClicked
        Frame.telaInicial = new TelaInical();
        JFrame frame = (JFrame)SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().remove(Frame.telaCarrinho);
        frame.add(Frame.telaInicial, BorderLayout.CENTER);
        frame.pack();
    }//GEN-LAST:event_bt_menuMouseClicked

    private void bt_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_removerMouseClicked
 
        if(tb_carrinho.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione o produto/serviço que deseja Remover", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }else{
            TelaSaude.carrinho.remove(tb_carrinho.getSelectedRow());
            TelaAcessorios.carrinho.remove(tb_carrinho.getSelectedRow());
            TelaAlimentos.carrinho.remove(tb_carrinho.getSelectedRow());
            TelaHospedia.carrinho.remove(tb_carrinho.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Produto/Serviço removido com sucesso!", "Removido", JOptionPane.INFORMATION_MESSAGE);
            mostrarCarrinho();
            preco();
        }
    }//GEN-LAST:event_bt_removerMouseClicked

    private void bt_atualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_atualizarMouseClicked
        for (int i=0; i<TelaSaude.carrinho.size(); i++) {
            TelaSaude.carrinho.get(i).setQuantidade((int)tb_carrinho.getModel().getValueAt(i, 3));
            TelaAcessorios.carrinho.get(i).setQuantidade((int)tb_carrinho.getModel().getValueAt(i, 3));
            TelaAlimentos.carrinho.get(i).setQuantidade((int)tb_carrinho.getModel().getValueAt(i, 3));
            TelaHospedia.carrinho.get(i).setQuantidade((int)tb_carrinho.getModel().getValueAt(i, 3));
        }
         for (int i=0; i<TelaAcessorios.carrinho.size(); i++) {
             TelaAcessorios.carrinho.get(i).setQuantidade((int)tb_carrinho.getModel().getValueAt(i, 3));
        }
        mostrarCarrinho();
        preco();
    }//GEN-LAST:event_bt_atualizarMouseClicked

    private void bt_pagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pagarMouseClicked
        if(rb_boleto.isSelected()){
            JOptionPane.showMessageDialog(null, "Pagamento em Boleto", "Informação", JOptionPane.INFORMATION_MESSAGE);
            ((DefaultTableModel) tb_carrinho.getModel()).setRowCount(0);
        }else{
            if(rb_cartaoCredito.isSelected()){
                JOptionPane.showMessageDialog(null, "Pagamento em Cartão de Crédito", "Informação", JOptionPane.INFORMATION_MESSAGE);
                ((DefaultTableModel) tb_carrinho.getModel()).setRowCount(0);
            }else{
                if(rb_cartaoDebito.isSelected()){
                    JOptionPane.showMessageDialog(null, "Pagamento em Cartão de Débito", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    ((DefaultTableModel) tb_carrinho.getModel()).setRowCount(0);
                }
            }
        }
    }//GEN-LAST:event_bt_pagarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JButton bt_menu;
    private javax.swing.JButton bt_pagar;
    private javax.swing.JButton bt_remover;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_valorTotal;
    private javax.swing.JRadioButton rb_boleto;
    private javax.swing.JRadioButton rb_cartaoCredito;
    private javax.swing.JRadioButton rb_cartaoDebito;
    private javax.swing.JTable tb_carrinho;
    // End of variables declaration//GEN-END:variables
}
