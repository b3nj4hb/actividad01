package pe.edu.upeu.actividad01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="escuelas")
public class Escuela {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long idescuela;
@Column(name="nombre")
private String nombre;
}
