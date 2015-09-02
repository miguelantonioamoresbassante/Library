package com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="BOOK")
@NamedQuery(name = "Book.findAll", query = "select o from Book o")
@XmlRootElement
public class Book {
	
	@Id
	@Column(name="TITLE", nullable=false)
//	@GeneratedValue(generator = "uuid")
//	@GenericGenerator(name="uuid", strategy="uuid2")
	private String title;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="QUANTITY")
	private int quantity;
	
			
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
