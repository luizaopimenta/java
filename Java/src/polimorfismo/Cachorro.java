package polimorfismo;
public class Cachorro extends Mamifero{
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latir");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo Ração");
    }
    
}
