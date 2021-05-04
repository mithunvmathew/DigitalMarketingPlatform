package com.mvm.campaignmanager.exception;

public class CampaignManagerException extends RuntimeException {

    public CampaignManagerException() {
    }

    public CampaignManagerException(String message) {
        super(message);
    }

    public CampaignManagerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CampaignManagerException(Throwable cause) {
        super(cause);
    }

    public CampaignManagerException(
            String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
