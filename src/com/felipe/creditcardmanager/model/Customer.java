package com.felipe.creditcardmanager.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um cliente do sistema bancário.
 * Cada cliente pode possuir múltiplos cartões de crédito.
 */
public class Customer {
    //contador compartilhado entre todos os clientes,usado pra gerar IDs únicos automaticamnete;
    private static int nextId = 1;

    private String name;
    private int id;

    //cliente pode ter múltiplos cartões;lista começa vazia e cresce conforme cartões são adicionados;
    private List<Card> cards = new ArrayList<>();


    /**
     * Cria um novo cliente com o nome informado.
     * O id é gerado automaticamente pela classe e não pode ser definido manualmente.
     *
     * @param name o nome do cliente
     */
    public Customer(String name){
        this.name = name;

        //pega o valor atual antes de incrementar, pra IDs começarem em 1;
        this.id = nextId;
        nextId++;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    /**
     * Retorna a lista de cartões deste cliente.
     */
    public List<Card> getCards() {
        return cards;
    }
}