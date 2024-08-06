package singleton_pattern;

public class Principal {
    
    public static void main(String[] args) {
        
        Conexao c1 = Conexao.getInstance();  
        Conexao c2 = Conexao.getInstance();
        Conexao c3 = Conexao.getInstance();
        Conexao c4 = Conexao.getInstance();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
    }

}
