package com.example.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book 
{
        @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
        
        @Column(name="image")
		private String Image;
		
		
		@Column(name="bookTitle")
		private String BookTitle;
		
		@Column(name="bookcategory")
		private String Bookcategory;
		
		@Column(name="publication")
		private String Publication;
		
		@Column(name="isbn")
		private int ISBN;
		
		@Column(name="Active")
		private String Active;
		
		@Column(name="TotalStock")
		private int TotalStock;
		
		@Column(name="bookcost")
		private BigDecimal Bookcost;
		
		@ManyToOne(targetEntity=Book.class,fetch=FetchType.EAGER)
		@JoinColumn(name="id",insertable = false,updatable = false)
		private Book book;		

		public Book()
		{
			
		}

		public Book(Long id,String image, String bookTitle, String bookcategory, String publication, int iSBN,
				String active, int totalStock, BigDecimal bookcost) {
			super();
			this.id = id;
			this.Image = image;
			this.BookTitle = bookTitle;
			this.Bookcategory = bookcategory;
			this.Publication = publication;
			this.ISBN = iSBN;
			this.Active = active;
			this.TotalStock = totalStock;
			this.Bookcost = bookcost;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		
		public String getImage() {
			return Image;
		}

		public void setImage(String image) {
			Image = image;
		}

		
		public String getBookTitle() {
			return BookTitle;
		}

		public void setBookTitle(String bookTitle) {
			BookTitle = bookTitle;
		}

		public String getBookcategory() {
			return Bookcategory;
		}

		public void setBookcategory(String bookcategory) {
			Bookcategory = bookcategory;
		}

		public String getPublication() {
			return Publication;
		}

		public void setPublication(String publication) {
			Publication = publication;
		}

		public int getISBN() {
			return ISBN;
		}

		public void setISBN(int iSBN) {
			ISBN = iSBN;
		}

		public String getActive() {
			return Active;
		}

		public void setActive(String active) {
			Active = active;
		}

		public int getTotalStock() {
			return TotalStock;
		}

		public void setTotalStock(int totalStock) {
			TotalStock = totalStock;
		}

		public BigDecimal getBookcost() {
			return Bookcost;
		}

		public void setBookcost(BigDecimal bookcost) {
			Bookcost = bookcost;
		}
}
		