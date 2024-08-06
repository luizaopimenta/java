package factory_pattern;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog("Digite sua Mensagem");
        
        Mensagem mensagem = MensagemFactory.getMensagem(0);
        
        mensagem.enviar(texto);
        
    }
    
}
