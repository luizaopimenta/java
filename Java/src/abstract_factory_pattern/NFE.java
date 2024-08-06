package abstract_factory_pattern;

public class NFE {

private String uf;
public NFE(String uf){
    this.uf = uf;
}

public double calcularImposto(){
    if(uf.equalsIgnoreCase("PR")){
        return 12;
    }else if(uf.equalsIgnoreCase("RJ")){
        return 20;
    }else{
        return 10;
    }
}
}
