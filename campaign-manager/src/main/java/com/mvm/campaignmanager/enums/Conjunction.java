package com.mvm.campaignmanager.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Conjunction {
    GREATERTHAN(">"),
    LESSTHAN("<"),
    EQUAL("="),
    GREATERTHANOREQUAL(">="),
    LESSTHANOREQUAL("<=");


    private final String value;
}
