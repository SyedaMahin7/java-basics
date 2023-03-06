package com.xworkz.cricket.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name ="cricket")
@NamedQuery(name = "findByName", query = "select ent from CricketEntity ent where ent.name=:nam")
public class CricketEntity {
	@Id
	@Column(name="c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="c_name")
	private String name;
	@Column(name="c_country")
	private String country;
	@Column(name="c_iplteam")
	private String iplteam;
	@Column(name="c_runs")
	private Integer runs;
	@Column(name="c_since")
	private Integer since;
	

}
