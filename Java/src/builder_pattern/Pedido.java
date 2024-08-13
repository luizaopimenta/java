package builder_pattern;

import java.util.List;
import javax.swing.JOptionPane;

public class Pedido {

    private String numeroPedido;
    
    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;
    
    public double getValorTotal(){
        double total = 0;
        for(Produto produto : produtos){
            total += (produto.getValor() * produto.getQuantidade() );
        }
        return total;
    }
    
    public int getTotalProdutos(){
        int total = 0;
        for(Produto produto : produtos){
            total += produto.getQuantidade();
        }
        return total;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void informacoes(){
        JOptionPane.showMessageDialog(null,  
                "Nº Pedido: " + this.numeroPedido 
                + "\n Cliente: " + this.cliente.getNome() 
                + "\n Vendedor: " + this.vendedor.getNome() 
                + "\n Valor Total:" + this.getValorTotal() );
    }
    
}
