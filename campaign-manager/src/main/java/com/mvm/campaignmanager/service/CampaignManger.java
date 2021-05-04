package com.mvm.campaignmanager.service;

import com.mvm.campaignmanager.dto.CampaignCreationRequest;
import com.mvm.campaignmanager.enums.CampaignStatus;
import com.mvm.campaignmanager.exception.CampaignManagerException;
import com.mvm.campaignmanager.mapper.CampaignMapper;
import com.mvm.campaignmanager.model.Campaign;
import com.mvm.campaignmanager.repository.CampaignRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CampaignManger {

    private final CampaignRepository campaignRepository;
    private final CampaignMapper campaignMapper;

    public Long createCampaign(CampaignCreationRequest campaignCreationRequest) {

        Campaign campaign = campaignMapper.mapToEntity(campaignCreationRequest);
        campaign.setStatus(CampaignStatus.CREATED);
        return campaignRepository.save(campaign).getId();
    }

    public Optional<Campaign> getCampaign(Long campaignId) {
        return campaignRepository.findById(campaignId);
    }

    public List<Campaign> getCampaignWithName(String name) {
        return campaignRepository.findAllByName(name);
    }

    public List<Campaign> getCampaignWithStatus(CampaignStatus status) {
        return campaignRepository.findAllByName(status.name());
    }

    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    public Long updateCampaign(CampaignCreationRequest campaignCreationRequest) {
        Campaign existing = campaignRepository.findById(campaignCreationRequest
                .getCampaignId()).orElseThrow(() -> new CampaignManagerException("campaign not exist"));
        return campaignRepository.save(mergeWithExist(campaignCreationRequest, existing)).getId();
    }

    private Campaign mergeWithExist(CampaignCreationRequest campaignCreationRequest, Campaign existing) {
        existing.setCondition(campaignCreationRequest.getFilterCondition() != null ?
                campaignCreationRequest.getFilterCondition() : existing.getCondition());
        existing.setName(campaignCreationRequest.getCampaignName() != null ?
                campaignCreationRequest.getCampaignName() : existing.getName());
        return existing;
    }

    public void deleteCampaign(Long campaignId) {
        campaignRepository.deleteById(campaignId);
        log.info("Campaign id:{} deleted.", campaignId);
    }


}
