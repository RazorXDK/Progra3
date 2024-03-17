/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORM;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "ArbolBinario", catalog = "Prueba", schema = "POSTGRES")
@NamedQueries({
    @NamedQuery(name = "ArbolBinario.findAll", query = "SELECT a FROM ArbolBinario a")})
public class ArbolBinario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Estado", nullable = false)
    private Integer estado;
    @Column(name = "Dato")
    private Character dato;
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private int id;

    public ArbolBinario() {
    }

    public ArbolBinario(Integer estado) {
        this.estado = estado;
    }

    public ArbolBinario(Integer estado, int id) {
        this.estado = estado;
        this.id = id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Character getDato() {
        return dato;
    }

    public void setDato(Character dato) {
        this.dato = dato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estado != null ? estado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArbolBinario)) {
            return false;
        }
        ArbolBinario other = (ArbolBinario) object;
        if ((this.estado == null && other.estado != null) || (this.estado != null && !this.estado.equals(other.estado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.ArbolBinario[ estado=" + estado + " ]";
    }
    
}
