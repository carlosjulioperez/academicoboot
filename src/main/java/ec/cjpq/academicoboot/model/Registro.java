package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;

import lombok.Data;

@Data
@Entity
/**
 * Registro Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class Registro{

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
    @ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "registro_alumno_fkey"))
    private Alumno alumno;
    
    @ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "registro_paralelo_fkey"))
    private Paralelo paralelo;
    
    private Date fechaRegistro;

    private Boolean estadoRegistro;

}
