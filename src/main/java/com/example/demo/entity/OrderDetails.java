package com.example.demo.entity;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="list")
public class OrderDetails 
{
	 @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
	    @Column(name="name")
		private String Name;
	    
	    @Column(name="phoneno")
		private Long PhoneNo;
	 
		@Column(name="booktitle")
		private String BookTitle;

		@Column(name="code")
		private int code;
		
		
		@Column(name="payment")
		private String Payment;
		
		@Column(name="money")
		private Double money;
		
		@OneToMany(mappedBy="book")
		private Set<Book>book;
		public Set<Book> getbook() {
			return book;
		}
		public void setBook(Set<Book> book) {
			this.book = book;
		}
		
		public OrderDetails()
		{
			
		}

		public OrderDetails(Long id, String name, Long phoneNo, String bookTitle, int code, String payment,
				Double money) {
			super();
			this.id = id;
			this.Name = name;
			this.PhoneNo = phoneNo;
			this.BookTitle = bookTitle;
			this.code = code;
			this.Payment = payment;
			this.money = money;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public Long getPhoneNo() {
			return PhoneNo;
		}

		public void setPhoneNo(Long phoneNo) {
			PhoneNo = phoneNo;
		}

		public String getBookTitle() {
			return BookTitle;
		}

		public void setBookTitle(String bookTitle) {
			BookTitle = bookTitle;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getPayment() {
			return Payment;
		}

		public void setPayment(String payment) {
			Payment = payment;
		}

		public Double getMoney() {
			return money;
		}

		public void setMoney(Double money) {
			this.money = money;
		}
}
