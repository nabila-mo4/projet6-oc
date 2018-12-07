package org.librarypro.webapp.batch;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class Mail {
	
	private MailSender mailSender;

    public MailSender getMailSender() {
        return mailSender;
    }

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

 
    public void envoyer(String destinataire, String objet, String corps)
    {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(destinataire);
        email.setSubject(objet);
        email.setText(corps);
        mailSender.send(email);
    }





}
