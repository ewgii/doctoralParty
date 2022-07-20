package com.backend.application.doctoralParty.model;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


@Data
@Entity
@Table(name= "customers")
public class Customer {

    @Column(name = "customer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "date_of_birth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "date_of_creation")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfCreation;



    public String getDateOfBirth() {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(this.dateOfBirth);
    }

    public String getdateOfCreation() {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(this.dateOfCreation);
    }


}
