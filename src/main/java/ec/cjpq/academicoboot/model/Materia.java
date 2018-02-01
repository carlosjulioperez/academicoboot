package ec.cjpq.academicoboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
/**
 * Materia Entity
 * @author carper CARLOS JULIO PEREZ QUIZHPE carlosjulioperez@gmail.com claro 099 3208265
 * 2018-ene-31
 */
public class Materia{

   //public static final String SEQUENCE_NAME = "Materia_id_seq";

   //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
   //@SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
   private long id;

   @Column(length=100)
   private String descripcion;

}
