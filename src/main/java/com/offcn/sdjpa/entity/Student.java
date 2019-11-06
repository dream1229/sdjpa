package com.offcn.sdjpa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stu")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键自增
    private Integer id;
    private  String name;

}
