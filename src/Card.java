import java.util.ArrayList;
import java.util.List;

/**
 * Representa um cartão do sistema bancário.
 * Cada cartão pode possuir múltiplas compras no cartão de crédito.
 */
public class Card {
    private static int nextNumber = 1000;
    private double creditLimit = 2000;
    private double availableLimit;
    private int number;

    //cliente pode ter múltiplas compras;lista começa vazia e cresce conforme compras são adicionadas;
    private List<Purchase> shoppingList = new ArrayList<>();


    /**
     * Cria um novo cartão.
     * O number é gerado automaticamente pela classe e não pode ser definido manualmente.
     *
     */
    public Card(){
        this.availableLimit = this.creditLimit;

        //pega o valor atual antes de incrementar, pra Numbers começarem em 1;
        this.number = nextNumber;
        nextNumber++;
    }

    /**
     * Adiciona a compra na lista de compras.
     * O limite disponível é atualizado automaticamente pelo metodo.
     *
     */
    public void addPurchase(Purchase purchase){
        if(purchase.getValue() <= availableLimit){
            shoppingList.add(purchase);
            this.availableLimit -= purchase.getValue();
        }else {
            System.out.println("Valor da compra maior do que o limite disponivel");
        }
    }

    public static int getNextNumber() {
        return nextNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getAvailableLimit() {
        return availableLimit;
    }

    public int getNumber() {
        return number;
    }

    /**
     * Retorna a lista de compras do cartão.
     */
    public List<Purchase> getShoppingList() {
        return shoppingList;
    }
}
