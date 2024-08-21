package controller;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;

public class Login {
    
    public static ArrayList<Cliente> listaCliente = new ArrayList();
    
    public void desserializacao(){
        String arquivoCliente = "cliente.ser";
        
        try {
            FileInputStream arquivo = new FileInputStream(arquivoCliente);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            
            listaCliente = (ArrayList<Cliente>) in.readObject();
            in.close();
            arquivo.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na desserialização!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String login(String cpf, String senha){
      for(int i=0; i<listaCliente.size(); i++){
          Cliente cliente = listaCliente.get(i);
          try {
              if(cliente.getCpf().equalsIgnoreCase(cpf)){
                  if(cliente.getSenha().equalsIgnoreCase(senha)){
                      return cliente.getNome();
                  }else{
                      JOptionPane.showMessageDialog(null, "Senha Incorreta", "ERRO!", JOptionPane.ERROR_MESSAGE);
                      throw new Excecao("Senha Incorreta!");
                  }
              }else{
                  throw new Excecao("Este CPF não está cadastrado!!");
              }
          } catch (Excecao e) {
              JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
          }
      }
        return null;
    }
}
