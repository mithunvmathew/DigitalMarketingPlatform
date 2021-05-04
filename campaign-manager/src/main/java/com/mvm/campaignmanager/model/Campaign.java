package com.mvm.campaignmanager.model;

import com.mvm.campaignmanager.enums.CampaignStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "campaigns")
@NoArgsConstructor
@AllArgsConstructor
public class Campaign extends BaseEntity {

    @Column
    private String name;

    @Column
    private String condition;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private CampaignStatus status;


}
