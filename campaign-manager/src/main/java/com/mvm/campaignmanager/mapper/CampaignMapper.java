package com.mvm.campaignmanager.mapper;

import com.mvm.campaignmanager.dto.CampaignCreationRequest;
import com.mvm.campaignmanager.model.Campaign;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CampaignMapper {

    @Mapping(source = "campaignName", target = "name")
    @Mapping(source = "campaignId", target = "id")
    @Mapping(source = "filterCondition", target = "condition")
    Campaign mapToEntity(CampaignCreationRequest campaignCreationRequest);
}
