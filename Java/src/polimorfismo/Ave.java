package polimorfismo;
public class Ave extends Animal{
    private String corPena;
    
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
