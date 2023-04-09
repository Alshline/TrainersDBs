package com.back.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Entity
@Validated
@Table(name = "materialgroups")
@NoArgsConstructor
@AllArgsConstructor
public class MaterialGroupEntity {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer group_id;

    @Getter
    @Setter
    @Column(name = "group_name")
    private String group_name;

    @Override
    public String toString() {
        return "MaterialGroupEntity{" +
                "group_id=" + group_id +
                ", group_name='" + group_name + '\'' +
                '}';
    }
}