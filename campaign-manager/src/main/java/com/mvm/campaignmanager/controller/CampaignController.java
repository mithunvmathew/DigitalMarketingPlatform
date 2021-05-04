package com.mvm.campaignmanager.controller;

import com.mvm.campaignmanager.dto.CampaignCreationRequest;
import com.mvm.campaignmanager.model.Campaign;
import com.mvm.campaignmanager.service.CampaignManger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/campaign")
public class CampaignController {

    private final CampaignManger campaignManger;

    @RolesAllowed("admin")
    @PostMapping
    public Long createCampaign(@RequestBody CampaignCreationRequest campaignCreationRequest) {
        return campaignManger.createCampaign(campaignCreationRequest);
    }

    @RolesAllowed({"user", "admin"})
    @GetMapping("/{campaignId}")
    public Campaign getCampaign(@PathVariable("campaignId") Long campaignId) {
        return campaignManger.getCampaign(campaignId).orElse(null);

    }

    @RolesAllowed({"user", "admin"})
    @GetMapping
    public List<Campaign> getAllCampaign(@RequestParam("campaignName") String campaignName) {
        if (StringUtils.isNotEmpty(campaignName)) {
            return campaignManger.getCampaignWithName(campaignName);
        }
        return campaignManger.getAllCampaigns();
    }

    @RolesAllowed("admin")
    @PutMapping
    public Long updateCampaign(@RequestBody CampaignCreationRequest campaignCreationRequest) {
        return campaignManger.updateCampaign(campaignCreationRequest);
    }

    @RolesAllowed("admin")
    @DeleteMapping("/{campaignId}")
    public void deleteCampaign(@PathVariable("campaignId") Long campaignId) {
        campaignManger.deleteCampaign(campaignId);
    }
}
