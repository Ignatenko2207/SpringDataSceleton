package info.sjd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="entity_2")
@Setter
@Getter
public class SpringEntity2 {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name = "entity_id")
	private Integer entityId;
	
	@Column(name =  "text_col")
	private String textProperty;

	@Column(name = "boolean_col")
	private Boolean booleanProperty;
	
}
