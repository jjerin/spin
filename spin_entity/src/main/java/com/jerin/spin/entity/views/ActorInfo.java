package com.jerin.spin.entity.views;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the actor_info database table.
 * 
 */
@Entity
@Table(name="actor_info")
@NamedQuery(name="ActorInfo.findAll", query="SELECT a FROM ActorInfo a")
public class ActorInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id //temporary fix
	@Column(name="actor_id", nullable=false)
	private int actorId;

	@Lob
	@Column(name="film_info")
	private String filmInfo;

	@Column(name="first_name", nullable=false, length=45)
	private String firstName;

	@Column(name="last_name", nullable=false, length=45)
	private String lastName;

	public ActorInfo() {
	}

	public int getActorId() {
		return this.actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFilmInfo() {
		return this.filmInfo;
	}

	public void setFilmInfo(String filmInfo) {
		this.filmInfo = filmInfo;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}