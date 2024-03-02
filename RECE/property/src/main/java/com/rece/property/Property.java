package com.rece.property;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Property {
    @Id
    private Long id;
}
