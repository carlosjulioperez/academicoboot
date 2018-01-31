package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
/**
 * Profesor Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class Profesor{

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
    @Column(length=100)
    private String apellido;

    @Column(length=100)
    private String nombre;

    @ManyToOne
    private NivelAcademico nivelAcademico;

}
