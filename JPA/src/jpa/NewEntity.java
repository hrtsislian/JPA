package jpa;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewEntity implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
  @Column(length = 100)
  private String name;

  public String getName() {
   return name;
  } 
  public void setName(String name) { 
    this.name = name; 
  } 
  public Long getId() { 
    return id; 
  }
  public void setId(Long id) { 
    this.id = id; 
  } 

  @Override public int hashCode() {
    int hash = 7; 
    hash = 59 * hash + Objects.hashCode(this.id); 
    hash = 59 * hash + Objects.hashCode(this.name); 
    return hash; 
  } 
  @Override public boolean equals(Object obj) {
    if (obj == null) {
     return false; 
    } 
    if (getClass() != obj.getClass()) { 
      return false; 
    } 
  final NewEntity other = (NewEntity) obj;
    if (!Objects.equals(this.id, other.id)) { 
      return false; 
    } 
    if (!Objects.equals(this.name, other.name)) {
     return false;
    } 
    return true; 
  } 
  @Override public String toString() {
    return "jpa.NewEntity[ id=" + id + " ]"; 
  } 
}