package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.Order;

import java.util.List;

public interface OrderDao {

    // Create order
    public void createOrder(Order order);

    //Show all order
    public List<Order> showOrders();

    //Show order by ID
    public Order showOrderById(long orderId);

    //Remove order
    public void removeOrder(long orderId);

    //uodate
    public void updateOrder(Order order);


}
