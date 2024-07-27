package polimorfismo;
public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe Não emite Som");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
