package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

import lombok.Data;

@Data
@Entity
/**
 * CalendarioEspol Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class CalendarioEspol{

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(length=4)
    private Integer anio;

	@Column(length=1)
    private Integer semestre;

    private Date fechaInicioVigencia;

    private Date fechaFinalVigencia;

}
