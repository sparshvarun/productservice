package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Getter
@Setter
public class Batch {
    @Id
    private Long id;
    private String name;
    private Integer strength;

    @ManyToOne()

    private Instructor instructor;
}
