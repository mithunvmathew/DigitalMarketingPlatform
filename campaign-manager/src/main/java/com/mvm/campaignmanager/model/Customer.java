package com.mvm.campaignmanager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity {

    private String name;
    private String email;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    private String phone;
    private String place;
    private String profession;


}
