package com.kdanwoo.jpademo.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") //@OneToMany(mappedBy = "{주인 Entity의 Field Name}")
    private List<Order> orders = new ArrayList<>();


}
