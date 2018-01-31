package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
/**
 * Paralelo Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class Paralelo{

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
    @ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "paralelo_calendario_espol_fkey"))
    private CalendarioEspol calendarioEspol;
    
    @ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "paralelo_materia_fkey"))
    private Materia materia;
    
    @ManyToOne @JoinColumn(foreignKey = @ForeignKey(name = "paralelo_profesor_fkey"))
    private Profesor profesor;
	
    @Column(length=5)
    private String horaInicio;

	@Column(length=2)
    private Integer duracionHoras;

}
