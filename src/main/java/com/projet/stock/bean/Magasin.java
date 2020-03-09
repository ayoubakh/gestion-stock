/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * @author AKH
 */
@Entity
public class Magasin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String nom;
    private int nbrMAxProduit;
    private int nbrProduit;

    public int getNbrProduit() {
        return nbrProduit;
    }

    public void setNbrProduit(int nbrProduit) {
        this.nbrProduit = nbrProduit;
    }
    
    
    @OneToMany
    private List<Produit> produitsMagasin;

    public int getNbrMAxProduit() {
        return nbrMAxProduit;
    }

    public void setNbrMAxProduit(int nbrMAxProduit) {
        this.nbrMAxProduit = nbrMAxProduit;
    }

    public List<Produit> getProduitsMagasin() {
        return produitsMagasin;
    }

    public void setProduitsMagasin(List<Produit> produitsMagasin) {
        this.produitsMagasin = produitsMagasin;
    }
    
    
    
    
    @ManyToOne
    private EntiteAdministrative entiteAdministrative;
    

    @OneToMany
    List<Stock> produitMagasin;

    public List<Stock> getProduitMagasin() {
        return produitMagasin;
    }

    public void setProduitMagasin(List<Stock> produitMagasin) {
        this.produitMagasin = produitMagasin;
    }
    
    
    
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public EntiteAdministrative getEntiteAdministrative() {
        return entiteAdministrative;
    }

    public void setEntiteAdministrative(EntiteAdministrative entiteAdministrative) {
        this.entiteAdministrative = entiteAdministrative;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Magasin)) {
            return false;
        }
        Magasin other = (Magasin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projet.stock.bean.Magasin[ id=" + id + " ]";
    }

}
