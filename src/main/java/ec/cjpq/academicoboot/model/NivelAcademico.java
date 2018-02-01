package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import lombok.Data;

@Data
@Entity
/**
 * NivelAcademico Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class NivelAcademico{

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
    @Column(length=100)
    private String descripcion;

    @OneToMany(mappedBy = "nivelAcademico")
    private List<Profesor> profesores;

}
