package com.mvm.campaignmanager.repository;

import com.mvm.campaignmanager.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    List<Campaign> findAllByName(String name);

    List<Campaign> findAllByStatus(String status);
}
