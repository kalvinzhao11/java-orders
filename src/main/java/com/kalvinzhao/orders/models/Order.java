package com.kalvinzhao.orders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordernum;

    @Column
    private double advanceamount;
    private double ordamount;
    private String orderdescription;

    @ManyToOne()
    @JoinColumn(name = "custcode", nullable = false)
    private Customer customer;

    @ManyToMany()
    @JoinTable(name = "orderspayments",
    joinColumns = @JoinColumn(name = "ordernum"),
    inverseJoinColumns =  @JoinColumn(name = "paymentid"))
    private Set<Payments> payment = new HashSet<>();


    public Order() {
    }

    public Order(double advanceamount, double ordamount, String orderdescription) {
        this.advanceamount = advanceamount;
        this.ordamount = ordamount;
        this.orderdescription = orderdescription;
    }

    public long getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(long ordernum) {
        this.ordernum = ordernum;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Payments> getPayment() {
        return payment;
    }

    public void setPayment(Set<Payments> payment) {
        this.payment = payment;
    }
}
