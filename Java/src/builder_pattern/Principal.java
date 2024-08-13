package builder_pattern;

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        cliente.setNome("Fernando");
        cliente.setTelefone("(44)9 9999-9999");
        
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(1);
        vendedor.setNome("João");
        
        Produto produto1 = new Produto();
        produto1.setQuantidade(2);
        produto1.setNome("Caneta Bic");
        produto1.setValor(1.25);
        
        Produto produto2 = new Produto();
        produto2.setQuantidade(1);
        produto2.setNome("Borracha Chamex");
        produto2.setValor(1.50);
        
        Produto produto3 = new Produto();
        produto3.setQuantidade(1);
        produto3.setNome("Caderno Dragonball");
        produto3.setValor(9.11);
        
        Produto produto4 = new Produto();
        produto4.setQuantidade(1);
        produto4.setNome("Lapizeira da Bulma");
        produto4.setValor(3.75);
        
        Produto produto5 = new Produto();
        produto5.setQuantidade(1);
        produto5.setNome("Oculos do Mestre Kame");
        produto5.setValor(199.00);
        
        Pedido pedido = new Pedido();
        pedido.setNumeroPedido("00001");
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setProdutos(new ArrayList<>());
        pedido.getProdutos().add(produto1);
        pedido.getProdutos().add(produto2);
        pedido.getProdutos().add(produto3);
        pedido.getProdutos().add(produto4);
        pedido.getProdutos().add(produto5);
        pedido.informacoes();

    
    /*
    Pedido pedido = new PedidoBuilder()
                        .setPedido("00002")
                        .setCliente(2, "Luiz Fernando", "(44)8 8888-8888")
                        .setVendedor(2,"José Silva")
                        .setProduto("Lapis 2B", 1, 1.19)
                        .setProduto("Borracha Branca", 1, 1.59)
                        .setProduto("Caderno 10 Matérias", 1, 9.20)
                        .setProduto("Caneta Esferográfica", 1, 1.75)
                        .setProduto("Corretivo", 1, 4.49)
                        .builder();
    
    pedido.informacoes();

    */
    }
    
}
