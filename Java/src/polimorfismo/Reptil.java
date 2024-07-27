package polimorfismo;
public class Reptil extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
