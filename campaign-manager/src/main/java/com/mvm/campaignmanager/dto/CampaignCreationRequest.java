package com.mvm.campaignmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampaignCreationRequest {

    private Long campaignId;
    private  String campaignName;
    private String filterCondition;

}
