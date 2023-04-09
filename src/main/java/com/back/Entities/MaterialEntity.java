package com.back.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Entity
@Validated
@Table(name = "materials")
@NoArgsConstructor
@AllArgsConstructor
public class MaterialEntity {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer material_id;

    @Setter
    @Getter
    @Column(name = "material_name")
    private String material_name;

    @Setter
    @Getter
    @Column(name = "group_id")
    private String group_id;

    @Override
    public String toString() {
        return "Material{" +
                "material_id=" + material_id +
                ", material_name='" + material_name + '\'' +
                ", group_id='" + group_id + '\'' +
                '}';
    }
}