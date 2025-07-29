package models.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Departament  implements Serializable {
    private Integer id;
    private String nome;

    public Departament() {

    }

    public Departament(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departament that = (Departament) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
