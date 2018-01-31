package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Materia{
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
    @Column(length=100)
    private String descripcion;

}
