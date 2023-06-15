package Ex1;


public class ProdutoPronto {
    Produtos produto1 = new Produtos("avon",30.00);
    Produtos produto2 = new Produtos("Avon",40.00);
    Produtos produto3 = new Produtos("Nivea",100.00);

    public void lógica(){
        if (produto1.preco() < produto2.preco() && produto1.preco() > produto3.preco()){
            System.out.println("O produto mais barato é o PRODUTO 1");
        } else if (produto2.preco() < produto1.preco() && produto2.preco() < produto3.preco()) {
            System.out.println("O produto mais barato é o PRODUTO 2");
        } else {
            System.out.println("O produto mais barato é o PRODUTO 3");
        }
    }
    }