package com.mvm.campaignmanager.controller;

import com.mvm.campaignmanager.exception.CampaignManagerException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(assignableTypes = CampaignController.class)
public class ControllerExceptionHandler {

    @ExceptionHandler(CampaignManagerException.class)
    public ResponseEntity<String> handleException(CampaignManagerException exception) {
        return ResponseEntity.badRequest().body(exception.getMessage());
    }
}
