package ru.minpor.guarantee.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Daniil on 23.04.2016.
 */
@Entity
@Table(name = "Guarantee")
public class Guarantee {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_pk",length = 6, nullable = false)
    private long id_pk;

    @Column(name= "id",length = 6)
    private long id;

    @Column(name = "regnumber",length = 20)
    private String regNumber;

    @Column(name = "docnumber",length = 22)
    private String docNumber;

    public Guarantee() {}

    public Guarantee(String docNumber) {
        this.docNumber = docNumber;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
}
