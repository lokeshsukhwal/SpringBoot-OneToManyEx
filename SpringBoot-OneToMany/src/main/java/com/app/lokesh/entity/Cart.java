package com.app.lokesh.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Cart {
	@Id
	private Integer cart_Id;
	private String cart_Name;
	
	@OneToMany
	@JoinColumn(name = "itemFK")
	private List<Items> items;
}
