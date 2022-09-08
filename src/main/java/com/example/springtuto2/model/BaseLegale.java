package com.example.springtuto2.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BaseLegale {
    private Long id;
    private String Ref;
    private String name;
    private String desc;
    private String supportConsentement;
    private String descConsentement;

    public BaseLegale(String ref, String name, String desc, String supportConsentement, String descConsentement) {
        Ref = ref;
        this.name = name;
        this.desc = desc;
        this.supportConsentement = supportConsentement;
        this.descConsentement = descConsentement;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getRef() {
        return Ref;
    }

    public void setRef(String ref) {
        Ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSupportConsentement() {
        return supportConsentement;
    }

    public void setSupportConsentement(String supportConsentement) {
        this.supportConsentement = supportConsentement;
    }

    public String getDescConsentement() {
        return descConsentement;
    }

    public void setDescConsentement(String descConsentement) {
        this.descConsentement = descConsentement;
    }

    @Override
    public String toString() {
        return "BaseLegale{" +
                "id=" + id +
                ", Ref='" + Ref + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", supportConsentement='" + supportConsentement + '\'' +
                ", descConsentement='" + descConsentement + '\'' +
                '}';
    }
}
