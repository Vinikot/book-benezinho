package br.com.fiap.domain.entity;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Book {

    private String name;
    private String ISBN;
    private LocalDate lancamento;
    private Set<Author> writers;

    public Book(String name, String ISBN, LocalDate lancamento, Set<Author> writers) {
        this.name = name;
        this.ISBN = ISBN;
        this.lancamento = lancamento;
        this.writers = writers;
    }

    public Book() {
        this.writers = new LinkedHashSet<>();
    }

    public Book addAuthor(Author a){
        this.writers.add(a);
        return this;
    }

    public Book removeAuthor(Author a){
        this.writers.remove(a);
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getISBN() {
        return ISBN;
    }

    public Book setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public Book setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
        return this;
    }

    public Set<Author> getWriters() {
        return Collections.unmodifiableSet(writers);
    }

}
