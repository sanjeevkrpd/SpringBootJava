package com.sms.studentmanagementsystem.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String studentName;

    @Min(1)
    private Integer age;

    @NotBlank
    private String fatherName;

    @NotBlank
    private String dateOfBirth;    

}
