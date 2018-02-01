package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
/**
 * Paralelo Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class Paralelo{

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
    //@NotNull
    @ManyToOne 
    @JoinColumn(name="calendario_espol_id", foreignKey = @ForeignKey(name = "paralelo_calendario_espol_fkey"))
    private CalendarioEspol calendarioEspol;
    
    //@NotNull
    @ManyToOne 
    @JoinColumn(name="materia_id", foreignKey = @ForeignKey(name = "paralelo_materia_fkey"))
    private Materia materia;
    
    //@NotNull
    @ManyToOne 
    @JoinColumn(name="profesor_id", foreignKey = @ForeignKey(name = "paralelo_profesor_fkey"))
    private Profesor profesor;
	
    @Column(length=5)
    private String horaInicio;

	@Column(length=2)
    private Integer duracionHoras;

}
