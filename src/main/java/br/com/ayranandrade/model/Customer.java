package br.com.ayranandrade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Ayran
 */
@Entity
@Table(name="customer")
public class Customer
{
    @Id
    @GeneratedValue
    @Column(name="id_customer")
    private Long id;
    @Column(name="nm_customer",length=60,nullable=false)
    @NotNull
    @Size(min=3,max=60)
    private String name;
    @Column(name="qt_age",nullable = false)
    @NotNull
    @Min(12)
    @Max(100)
    private Integer age;
    @Column(name="id_rg",nullable = false,length = 14)
    @NotNull
    @Size(min=9,max=14)
    private String rg;
    @Column(name="nm_address",nullable = false,length = 100)
    @NotNull
    @Size(min=10,max=100)
    private String address;
    @Column(name="id_cep",length = 10,nullable = false)
    @NotNull
    @Size(min=8,max=10)
    private String cep;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}