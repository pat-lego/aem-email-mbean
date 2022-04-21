package com.adobe.aem.core.email;

import java.util.List;

import com.adobe.aem.core.email.exceptions.EmailException;

public interface EmailService {

    public void sendEmail(List<String> recipients, List<String> ccRecipients, String subject, String from, String msg) throws EmailException;
    
}
