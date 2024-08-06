package factory_pattern;

public class MensagemFactory {

    public static Mensagem getMensagem(int i){
        if(i == 1){
            return new MensagemSMS();
        }
        return new MensagemEmail();
    }
    
}
