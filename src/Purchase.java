import java.time.LocalDate;

/**
 * Representa uma compra realizada no cartão de credito.
 * Possui um valor, uma descrição e a data em que foi realizada.
 */
public class Purchase {
    private double value;
    private String description;
    private LocalDate date;

    /**
     * Cria uma nova compra.
     * O date é gerado automaticamente pela classe localDate.now.
     * @param value o valor da compra.
     * @param description a descrição da compra;
     *
     */
    public Purchase(double value, String description){
        if(value < 0){
            throw new IllegalArgumentException("valores negativos são inválidos" + value);
        }
        this.value = value;
        this.description = description;
        this.date = LocalDate.now();
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }
}
