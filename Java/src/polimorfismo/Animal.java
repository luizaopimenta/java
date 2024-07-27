package polimorfismo;
// Classe Abistrata
public abstract class Animal {
    // Atributos de Animal
    protected String nome;
    protected float peso;
    protected int idade;
    // Métodos de Animal
    public abstract void locomover();
    public abstract void emitirSom();
    public abstract void alimentar();
           
    
}
