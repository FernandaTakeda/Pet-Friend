package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import model.Cliente;

public class Cadastro {
    ArrayList<Cliente> listaClientes = new ArrayList();
    
    public static boolean validaCPF(String cpf){
        if (cpf.equals("00000000000") || cpf.equals("11111111111") || 
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
           (cpf.length() != 11))
                return(false);

        char dig10, dig11;
        int sm, i, a, numero, peso;

        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                numero = (int)(cpf.charAt(i) - 48);
                sm = sm + (numero * peso);
                peso = peso - 1;
            }

            a = 11 - (sm % 11);
            if ((a == 10) || (a == 11))
                dig10 = '0';
            else dig10 = (char)(a + 48);
                    sm = 0;
                    peso = 11;
                for(i=0; i<10; i++) {
                    numero = (int)(cpf.charAt(i) - 48);
                    sm = sm + (numero * peso);
                    peso = peso - 1;
                }

            a = 11 - (sm % 11);
            if ((a == 10) || (a == 11))
                 dig11 = '0';
            else dig11 = (char)(a + 48);

            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                 return(true);
            else return(false);
            
        } catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    public void validaCamposCliente(String nome, String cpf, int telefone, String senha){
        System.out.println(listaClientes.toString());
                
        try {
            if(nome.length()!=0 && cpf.length()!=0 && senha.length()!=0 && telefone != 0){
                if (validaCPF(cpf)==true) {  
                }else{
                    throw new Excecao("CPF inserido está inválido!");
                }
            }else{
                throw new Excecao("Há campos não preenchidos");
            }
            
        } catch (Excecao e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cadastraCliente(String nome, String cpf, int telefone, String senha){
        Cliente cliente = new Cliente(nome,cpf,telefone,senha);
        listaClientes.add(cliente);
        
        String arquivoCliente = "cliente.ser";
        
        try {
            FileOutputStream arquivo = new FileOutputStream(arquivoCliente);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            out.writeObject(listaClientes);
            out.close();
            arquivo.close();
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro no cadastramento!", "Erro", JOptionPane.ERROR_MESSAGE);
            listaClientes.remove(cliente);
        }
    }
}
