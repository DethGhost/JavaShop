package org.ua.deth.dao.interfaces;


import org.ua.deth.entitys.Cart;

public interface CartDao {
    // Create  Cart
    public void createCart(Cart cart);

    //Show cart
    public void showCart(long cartId);

    // Remove product from the cart
    public void removeProduct(long cartId, long productId);

    // Clear the cart
    public void clearCart(long cartId);

    //Update Cart
    public void updateCart(Cart cart);


}
