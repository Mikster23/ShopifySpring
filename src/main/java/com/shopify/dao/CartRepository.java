package com.shopify.dao;

import org.springframework.data.repository.CrudRepository;

import com.shopify.domain.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {

}
