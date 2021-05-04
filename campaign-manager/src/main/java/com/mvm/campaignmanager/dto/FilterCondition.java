package com.mvm.campaignmanager.dto;

import com.mvm.campaignmanager.enums.Conjunction;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class FilterCondition {
    private final String key;
    private final String value;
    private final Conjunction conjunction;
}
