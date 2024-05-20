package com.hoangnd.web.model;

import com.hoangnd.web.entity.Book;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartDetailInfo {
	private Book book;
	private Integer quantity;
	
	public CartDetailInfo() {
        this.quantity = 0;
    }
    public Integer getAmount() {
        return this.book.getPrice() * this.quantity;
    }
	
}
