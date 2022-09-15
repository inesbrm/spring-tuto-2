package com.example.springtuto2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class DonneeConcernee {
    @Id
    private int rowIndex;

    public String Ref;
    public String Category;
    public String Desc;
    public String DureeConserv;
    public Boolean CollectDirect;
    public String DescCollectDirect;
    public Boolean CollectIndirect;
    public String DescCollectIndirect;
    public String SortDonne = "Suppression";
    public String DureeArchivage;
    public String ModeArchivage;
    public String FinaliteArchivage;
    public String LieuArchivage;

    public DonneeConcernee(int rowIndex, String ref, String category, String desc, String dureeConserv, Boolean collectDirect, String descCollectDirect, Boolean collectIndirect, String descCollectIndirect, String sortDonne, String dureeArchivage, String modeArchivage, String finaliteArchivage, String lieuArchivage) {
        this.rowIndex = rowIndex;
        Ref = ref;
        Category = category;
        Desc = desc;
        DureeConserv = dureeConserv;
        CollectDirect = collectDirect;
        DescCollectDirect = descCollectDirect;
        CollectIndirect = collectIndirect;
        DescCollectIndirect = descCollectIndirect;
        SortDonne = sortDonne;
        DureeArchivage = dureeArchivage;
        ModeArchivage = modeArchivage;
        FinaliteArchivage = finaliteArchivage;
        LieuArchivage = lieuArchivage;
    }

    public DonneeConcernee() {
    }

    @Override
    public String toString() {
        return "DonneeConcernee{" +
                "rowIndex=" + rowIndex +
                ", Ref='" + Ref + '\'' +
                ", Category='" + Category + '\'' +
                ", Desc='" + Desc + '\'' +
                ", DureeConserv='" + DureeConserv + '\'' +
                ", CollectDirect=" + CollectDirect +
                ", DescCollectDirect='" + DescCollectDirect + '\'' +
                ", CollectIndirect=" + CollectIndirect +
                ", DescCollectIndirect='" + DescCollectIndirect + '\'' +
                ", SortDonne='" + SortDonne + '\'' +
                ", DureeArchivage='" + DureeArchivage + '\'' +
                ", ModeArchivage='" + ModeArchivage + '\'' +
                ", FinaliteArchivage='" + FinaliteArchivage + '\'' +
                ", LieuArchivage='" + LieuArchivage + '\'' +
                '}';
    }

}
