package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;

import lombok.Data;

@Data
@Entity
/**
 * Profesor Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class Profesor{

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
    @OneToMany(mappedBy = "profesor")
    private List<Paralelo>paralelos;

    @Column(length=100)
    private String apellido;

    @Column(length=100)
    private String nombre;

    @ManyToOne 
    @JoinColumn(name="nivel_academico_id", foreignKey = @ForeignKey(name = "profesor_nivel_academico_fkey"))
    private NivelAcademico nivelAcademico;

}
