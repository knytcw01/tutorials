package com.tutorials.hibernatetips.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder @FieldDefaults(level = AccessLevel.PRIVATE)
@Entity @Audited
public class Student extends BaseEntity{
    String name;
    @ManyToOne
    University university;
}
