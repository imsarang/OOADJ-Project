package com.example.bookmovie.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SeatMatrix3")
public class SeatMatrix3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer S_No;
    @Column(name="A")
    private Integer A;
    @Column(name="B")
    private Integer B;
    @Column(name="C")
    private Integer C;
    @Column(name="D")
    private Integer D;
    @Column(name="E")
    private Integer E;
    
    public SeatMatrix3() {
    }

    public SeatMatrix3(Integer s_No, Integer a, Integer b, Integer c, Integer d, Integer e) {
        S_No = s_No;
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
    }

    public Integer getS_No() {
        return S_No;
    }

    public Integer getA() {
        return A;
    }

    public Integer getB() {
        return B;
    }

    public Integer getC() {
        return C;
    }

    public Integer getD() {
        return D;
    }

    public Integer getE() {
        return E;
    }

    public void setS_No(Integer s_No) {
        S_No = s_No;
    }

    public void setA(Integer a) {
        A = a;
    }

    public void setB(Integer b) {
        B = b;
    }

    public void setC(Integer c) {
        C = c;
    }

    public void setD(Integer d) {
        D = d;
    }

    public void setE(Integer e) {
        E = e;
    }

    
    
}

