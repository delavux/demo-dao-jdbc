package models.entidades;

import java.util.Date;
import java.util.Objects;

public class Seller {
    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double Salary;

    private Departament departament;

    public Seller() {

    }

    public Seller(Integer id, String name, String email, Date birthDate, Double salary, Departament departament) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        Salary = salary;
        this.departament = departament;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", Salary=" + Salary +
                ", departament=" + departament +
                '}';
    }
}

