/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.db;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "tipoarbol", catalog = "postgres", schema = "POSTGRES")
@NamedQueries({
    @NamedQuery(name = "Tipoarbol.findAll", query = "SELECT t FROM Tipoarbol t")})
public class Tipoarbol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoarbol", nullable = false)
    private Integer idtipoarbol;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @Column(name = "estado")
    private Integer estado;
    @OneToMany(mappedBy = "idtipoarbol")
    private List<Arbol> arbolList;

    public Tipoarbol() {
    }

    public Tipoarbol(Integer idtipoarbol) {
        this.idtipoarbol = idtipoarbol;
    }

    public Integer getIdtipoarbol() {
        return idtipoarbol;
    }

    public void setIdtipoarbol(Integer idtipoarbol) {
        this.idtipoarbol = idtipoarbol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public List<Arbol> getArbolList() {
        return arbolList;
    }

    public void setArbolList(List<Arbol> arbolList) {
        this.arbolList = arbolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoarbol != null ? idtipoarbol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoarbol)) {
            return false;
        }
        Tipoarbol other = (Tipoarbol) object;
        if ((this.idtipoarbol == null && other.idtipoarbol != null) || (this.idtipoarbol != null && !this.idtipoarbol.equals(other.idtipoarbol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gt.edu.umg.db.Tipoarbol[ idtipoarbol=" + idtipoarbol + " ]";
    }
    
}
