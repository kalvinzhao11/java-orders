package com.kalvinzhao.orders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue
    private long custcode;

    @Column
    private String custcisty;
    private String custcountry;
    private String custname;
    private String grade;
    private double openinggamt;
    private double paymentamt;
    private String phone;
    private double receiveamt;

    @OneToMany(mappedBy = "orders",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Order> order = new ArrayList<>();

    @ManyToOne()
    @JoinColumn(name = "agentcode", nullable = false)
    private Agent agent;

    public Customer() {
    }

    public Customer(String custcisty, String custcountry, String custname, String grade, double openinggamt, double paymentamt, String phone, double receiveamt, Agent agent) {
        this.custcisty = custcisty;
        this.custcountry = custcountry;
        this.custname = custname;
        this.grade = grade;
        this.openinggamt = openinggamt;
        this.paymentamt = paymentamt;
        this.phone = phone;
        this.receiveamt = receiveamt;
        this.agent = agent;
    }

    public long getCustcode() {
        return custcode;
    }

    public void setCustcode(long custcode) {
        this.custcode = custcode;
    }

    public String getCustcisty() {
        return custcisty;
    }

    public void setCustcisty(String custcisty) {
        this.custcisty = custcisty;
    }

    public String getCustcountry() {
        return custcountry;
    }

    public void setCustcountry(String custcountry) {
        this.custcountry = custcountry;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getOpeninggamt() {
        return openinggamt;
    }

    public void setOpeninggamt(double openinggamt) {
        this.openinggamt = openinggamt;
    }

    public double getPaymentamt() {
        return paymentamt;
    }

    public void setPaymentamt(double paymentamt) {
        this.paymentamt = paymentamt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getReceiveamt() {
        return receiveamt;
    }

    public void setReceiveamt(double receiveamt) {
        this.receiveamt = receiveamt;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
}
