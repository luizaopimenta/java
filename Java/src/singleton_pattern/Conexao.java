package singleton_pattern;

public class Conexao {
    
    private static Conexao con;
    
    private Conexao(){
        
    }
    
    public static synchronized Conexao getInstance(){
        if(con == null){
            con = new Conexao();
        }
        return con;
    }
    
}
