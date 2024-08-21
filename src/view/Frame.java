package view;
import java.awt.BorderLayout;

public class Frame extends javax.swing.JFrame {
    static TelaInical telaInicial;
    static TelaAlimentos telaAlimentos;
    static TelaSaude telaSaude;
    static TelaHospedia telaHospedia;
    static TelaAcessorios telaAcessorios;
    static TelaLogin telaLogin;
    static TelaCadastro telaCadastro;
    static TelaCarrinho telaCarrinho;
    
    public Frame() {
        initComponents();
        this.setLayout(new BorderLayout());
        
        telaInicial = new TelaInical();
        this.add(telaInicial, BorderLayout.CENTER);
        this.pack();
        
//        telaAlimentos = new TelaAlimentos();
//        this.add(telaAlimentos, BorderLayout.CENTER);
//        this.pack();
//        
//        telaHospedia = new TelaHospedia();
//        this.add(telaHospedia, BorderLayout.CENTER);
//        this.pack();
//        
//        telaAcessorios = new TelaAcessorios();
//        this.add(telaAcessorios, BorderLayout.CENTER);
//        this.pack();
//        
//        telaSaude = new TelaSaude();
//        this.add(telaSaude, BorderLayout.CENTER);
//        this.pack();
//     
//        telaLogin = new TelaLogin();
//        this.add(telaLogin, BorderLayout.CENTER);
//        this.pack();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
