package it.alfasoft;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//value="jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1"/>
@Entity
@Table (name = "authors")
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_author")
    private Long id;

    @Column(name = "name_author")
    private String name;

    @Column(name = "surname_author")
    private String surname;

    @ManyToMany(mappedBy="authors")
    private Set<Book> books = new HashSet<>();

    public Author() {

    }

    public Author (String name, String surname) {

        this.name = name;
        this.surname = surname;
    }

    public Author(String name, String surname, Book[] books) {

        this.name = name;
        this.surname = surname;
        this.books.addAll(Arrays.asList(books));
    }

    public Set<Book> getBook() {
        return books;
    }

    public void setBook(Set<Book> book) {
        this.books = book;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) && Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }
}
