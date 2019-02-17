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
@Table(name="entity_1")
public class SpringEntity1 {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name = "entity_id")
	private Integer entityId;
	
	@Column(name =  "text_col")
	private String textProperty;

	@Column(name = "boolean_col")
	private Boolean booleanProperty;

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getTextProperty() {
		return textProperty;
	}

	public void setTextProperty(String textProperty) {
		this.textProperty = textProperty;
	}

	public Boolean getBooleanProperty() {
		return booleanProperty;
	}

	public void setBooleanProperty(Boolean booleanProperty) {
		this.booleanProperty = booleanProperty;
	}
	
	
}
