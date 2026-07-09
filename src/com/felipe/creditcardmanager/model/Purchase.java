package com.felipe.creditcardmanager.model;

import java.time.LocalDate;

/**
 * Representa uma compra realizada no cartão de credito.
 * Possui um valor, uma descrição e a data em que foi realizada.
 * Toda compra nasce como PENDING e é avaliada pelo Card (aprovada ou recusada).
 */
public class Purchase  implements Comparable<Purchase>{
    private double value;
    private String description;
    private LocalDate date;
    private PurchaseStatus status;

    /**
     * Cria uma nova compra.
     * O date é gerado automaticamente pela classe localDate.now.
     * status nasce como PENDING.
     * @param value o valor da compra.
     * @param description a descrição da compra;
     *
     */
    public Purchase(double value, String description){
        if(value < 0){
            throw new IllegalArgumentException("valores negativos são inválidos: " + value);
        }
        this.status = PurchaseStatus.PENDING;
        this.value = value;
        this.description = description;
        this.date = LocalDate.now();
    }

    /**
     * Marca a compra como aprovada.
     */
    public void approve(){
        this.status = PurchaseStatus.APPROVED;
    }

    /**
     * Marca a compra como reprovada.
     */
    public void decline(){
        this.status = PurchaseStatus.DECLINED;
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

    public PurchaseStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return getDescription() + " - R$" + getValue() + " - " +  getDate() + " - Status: " + getStatus();
    }

    // ordena por data (ordem natural do histórico de compras)
    @Override
    public int compareTo(Purchase other) {
        return this.date.compareTo(other.date);
    }
}
