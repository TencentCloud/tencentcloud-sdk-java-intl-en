/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendEmailRequest extends AbstractModel {

    /**
    * Sender'S email address. when not using an alias, enter the sender's email address directly, for example: noreply@mail.qcloud.com. to enter a sender alias, follow this format (note that a space must separate the alias and email address): alias+space+<email address>. the alias cannot contain a colon (:).
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * Email subject.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Recipient email address, supports up to 50 recipients for mass sending. note: the email content will display all recipient addresses. for non-mass sending, call the API multiple times to send.
Specifies that at least one of the Destination, Cc, or Bcc parameters must exist.
    */
    @SerializedName("Destination")
    @Expose
    private String [] Destination;

    /**
    * The "reply" email address of the mail. can be filled with an email address where you can receive mail, which can be a personal mailbox. if left empty, the recipient's reply mail will fail to send.
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * Cc recipient email address, supports up to 20 carbon copies.
    */
    @SerializedName("Cc")
    @Expose
    private String [] Cc;

    /**
    * Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.
    */
    @SerializedName("Bcc")
    @Expose
    private String [] Bcc;

    /**
    * Use template for sending and fill in related parameters.
<dx-alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>.
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * This parameter has been deprecated.
<dx-alert infotype="notice" title="description"> only customers who have applied for special configuration in the past need to use this. if you have not applied for special configuration, this field does not exist.</dx-alert>.
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * When sending an attachment, fill in the related parameters. the tencent cloud API request supports a maximum of 8M request packet. the attachment content transits Base64 and is expected to expand by 1.5 times. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M.
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * Mail trigger type. 0: non-trigger class, default type, select this type for marketing emails and non-instant emails. 1: trigger class, instant delivery emails such as captcha-intl. if the mail exceeds a certain size, the system will automatically select the non-trigger class channel.
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * Message-Id field in the smtp header.
    */
    @SerializedName("SmtpMessageId")
    @Expose
    private String SmtpMessageId;

    /**
    * Other fields that can be set in the smtp header.
    */
    @SerializedName("SmtpHeaders")
    @Expose
    private String SmtpHeaders;

    /**
    * from field in the smtp header. the domain name should be consistent with FromEmailAddress.
    */
    @SerializedName("HeaderFrom")
    @Expose
    private String HeaderFrom;

    /**
     * Get Sender'S email address. when not using an alias, enter the sender's email address directly, for example: noreply@mail.qcloud.com. to enter a sender alias, follow this format (note that a space must separate the alias and email address): alias+space+<email address>. the alias cannot contain a colon (:). 
     * @return FromEmailAddress Sender'S email address. when not using an alias, enter the sender's email address directly, for example: noreply@mail.qcloud.com. to enter a sender alias, follow this format (note that a space must separate the alias and email address): alias+space+<email address>. the alias cannot contain a colon (:).
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set Sender'S email address. when not using an alias, enter the sender's email address directly, for example: noreply@mail.qcloud.com. to enter a sender alias, follow this format (note that a space must separate the alias and email address): alias+space+<email address>. the alias cannot contain a colon (:).
     * @param FromEmailAddress Sender'S email address. when not using an alias, enter the sender's email address directly, for example: noreply@mail.qcloud.com. to enter a sender alias, follow this format (note that a space must separate the alias and email address): alias+space+<email address>. the alias cannot contain a colon (:).
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get Email subject. 
     * @return Subject Email subject.
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Email subject.
     * @param Subject Email subject.
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get Recipient email address, supports up to 50 recipients for mass sending. note: the email content will display all recipient addresses. for non-mass sending, call the API multiple times to send.
Specifies that at least one of the Destination, Cc, or Bcc parameters must exist. 
     * @return Destination Recipient email address, supports up to 50 recipients for mass sending. note: the email content will display all recipient addresses. for non-mass sending, call the API multiple times to send.
Specifies that at least one of the Destination, Cc, or Bcc parameters must exist.
     */
    public String [] getDestination() {
        return this.Destination;
    }

    /**
     * Set Recipient email address, supports up to 50 recipients for mass sending. note: the email content will display all recipient addresses. for non-mass sending, call the API multiple times to send.
Specifies that at least one of the Destination, Cc, or Bcc parameters must exist.
     * @param Destination Recipient email address, supports up to 50 recipients for mass sending. note: the email content will display all recipient addresses. for non-mass sending, call the API multiple times to send.
Specifies that at least one of the Destination, Cc, or Bcc parameters must exist.
     */
    public void setDestination(String [] Destination) {
        this.Destination = Destination;
    }

    /**
     * Get The "reply" email address of the mail. can be filled with an email address where you can receive mail, which can be a personal mailbox. if left empty, the recipient's reply mail will fail to send. 
     * @return ReplyToAddresses The "reply" email address of the mail. can be filled with an email address where you can receive mail, which can be a personal mailbox. if left empty, the recipient's reply mail will fail to send.
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set The "reply" email address of the mail. can be filled with an email address where you can receive mail, which can be a personal mailbox. if left empty, the recipient's reply mail will fail to send.
     * @param ReplyToAddresses The "reply" email address of the mail. can be filled with an email address where you can receive mail, which can be a personal mailbox. if left empty, the recipient's reply mail will fail to send.
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get Cc recipient email address, supports up to 20 carbon copies. 
     * @return Cc Cc recipient email address, supports up to 20 carbon copies.
     */
    public String [] getCc() {
        return this.Cc;
    }

    /**
     * Set Cc recipient email address, supports up to 20 carbon copies.
     * @param Cc Cc recipient email address, supports up to 20 carbon copies.
     */
    public void setCc(String [] Cc) {
        this.Cc = Cc;
    }

    /**
     * Get Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique. 
     * @return Bcc Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.
     */
    public String [] getBcc() {
        return this.Bcc;
    }

    /**
     * Set Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.
     * @param Bcc Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.
     */
    public void setBcc(String [] Bcc) {
        this.Bcc = Bcc;
    }

    /**
     * Get Use template for sending and fill in related parameters.
<dx-alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>. 
     * @return Template Use template for sending and fill in related parameters.
<dx-alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>.
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set Use template for sending and fill in related parameters.
<dx-alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>.
     * @param Template Use template for sending and fill in related parameters.
<dx-alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>.
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get This parameter has been deprecated.
<dx-alert infotype="notice" title="description"> only customers who have applied for special configuration in the past need to use this. if you have not applied for special configuration, this field does not exist.</dx-alert>. 
     * @return Simple This parameter has been deprecated.
<dx-alert infotype="notice" title="description"> only customers who have applied for special configuration in the past need to use this. if you have not applied for special configuration, this field does not exist.</dx-alert>.
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set This parameter has been deprecated.
<dx-alert infotype="notice" title="description"> only customers who have applied for special configuration in the past need to use this. if you have not applied for special configuration, this field does not exist.</dx-alert>.
     * @param Simple This parameter has been deprecated.
<dx-alert infotype="notice" title="description"> only customers who have applied for special configuration in the past need to use this. if you have not applied for special configuration, this field does not exist.</dx-alert>.
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get When sending an attachment, fill in the related parameters. the tencent cloud API request supports a maximum of 8M request packet. the attachment content transits Base64 and is expected to expand by 1.5 times. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M. 
     * @return Attachments When sending an attachment, fill in the related parameters. the tencent cloud API request supports a maximum of 8M request packet. the attachment content transits Base64 and is expected to expand by 1.5 times. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M.
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set When sending an attachment, fill in the related parameters. the tencent cloud API request supports a maximum of 8M request packet. the attachment content transits Base64 and is expected to expand by 1.5 times. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M.
     * @param Attachments When sending an attachment, fill in the related parameters. the tencent cloud API request supports a maximum of 8M request packet. the attachment content transits Base64 and is expected to expand by 1.5 times. you should control the total size of all attachments within 4M. the API will return an error if the overall request exceeds 8M.
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai. 
     * @return Unsubscribe Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     * @param Unsubscribe Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     */
    public void setUnsubscribe(String Unsubscribe) {
        this.Unsubscribe = Unsubscribe;
    }

    /**
     * Get Mail trigger type. 0: non-trigger class, default type, select this type for marketing emails and non-instant emails. 1: trigger class, instant delivery emails such as captcha-intl. if the mail exceeds a certain size, the system will automatically select the non-trigger class channel. 
     * @return TriggerType Mail trigger type. 0: non-trigger class, default type, select this type for marketing emails and non-instant emails. 1: trigger class, instant delivery emails such as captcha-intl. if the mail exceeds a certain size, the system will automatically select the non-trigger class channel.
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Mail trigger type. 0: non-trigger class, default type, select this type for marketing emails and non-instant emails. 1: trigger class, instant delivery emails such as captcha-intl. if the mail exceeds a certain size, the system will automatically select the non-trigger class channel.
     * @param TriggerType Mail trigger type. 0: non-trigger class, default type, select this type for marketing emails and non-instant emails. 1: trigger class, instant delivery emails such as captcha-intl. if the mail exceeds a certain size, the system will automatically select the non-trigger class channel.
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Message-Id field in the smtp header. 
     * @return SmtpMessageId Message-Id field in the smtp header.
     */
    public String getSmtpMessageId() {
        return this.SmtpMessageId;
    }

    /**
     * Set Message-Id field in the smtp header.
     * @param SmtpMessageId Message-Id field in the smtp header.
     */
    public void setSmtpMessageId(String SmtpMessageId) {
        this.SmtpMessageId = SmtpMessageId;
    }

    /**
     * Get Other fields that can be set in the smtp header. 
     * @return SmtpHeaders Other fields that can be set in the smtp header.
     */
    public String getSmtpHeaders() {
        return this.SmtpHeaders;
    }

    /**
     * Set Other fields that can be set in the smtp header.
     * @param SmtpHeaders Other fields that can be set in the smtp header.
     */
    public void setSmtpHeaders(String SmtpHeaders) {
        this.SmtpHeaders = SmtpHeaders;
    }

    /**
     * Get from field in the smtp header. the domain name should be consistent with FromEmailAddress. 
     * @return HeaderFrom from field in the smtp header. the domain name should be consistent with FromEmailAddress.
     */
    public String getHeaderFrom() {
        return this.HeaderFrom;
    }

    /**
     * Set from field in the smtp header. the domain name should be consistent with FromEmailAddress.
     * @param HeaderFrom from field in the smtp header. the domain name should be consistent with FromEmailAddress.
     */
    public void setHeaderFrom(String HeaderFrom) {
        this.HeaderFrom = HeaderFrom;
    }

    public SendEmailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendEmailRequest(SendEmailRequest source) {
        if (source.FromEmailAddress != null) {
            this.FromEmailAddress = new String(source.FromEmailAddress);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Destination != null) {
            this.Destination = new String[source.Destination.length];
            for (int i = 0; i < source.Destination.length; i++) {
                this.Destination[i] = new String(source.Destination[i]);
            }
        }
        if (source.ReplyToAddresses != null) {
            this.ReplyToAddresses = new String(source.ReplyToAddresses);
        }
        if (source.Cc != null) {
            this.Cc = new String[source.Cc.length];
            for (int i = 0; i < source.Cc.length; i++) {
                this.Cc[i] = new String(source.Cc[i]);
            }
        }
        if (source.Bcc != null) {
            this.Bcc = new String[source.Bcc.length];
            for (int i = 0; i < source.Bcc.length; i++) {
                this.Bcc[i] = new String(source.Bcc[i]);
            }
        }
        if (source.Template != null) {
            this.Template = new Template(source.Template);
        }
        if (source.Simple != null) {
            this.Simple = new Simple(source.Simple);
        }
        if (source.Attachments != null) {
            this.Attachments = new Attachment[source.Attachments.length];
            for (int i = 0; i < source.Attachments.length; i++) {
                this.Attachments[i] = new Attachment(source.Attachments[i]);
            }
        }
        if (source.Unsubscribe != null) {
            this.Unsubscribe = new String(source.Unsubscribe);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.SmtpMessageId != null) {
            this.SmtpMessageId = new String(source.SmtpMessageId);
        }
        if (source.SmtpHeaders != null) {
            this.SmtpHeaders = new String(source.SmtpHeaders);
        }
        if (source.HeaderFrom != null) {
            this.HeaderFrom = new String(source.HeaderFrom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamArraySimple(map, prefix + "Destination.", this.Destination);
        this.setParamSimple(map, prefix + "ReplyToAddresses", this.ReplyToAddresses);
        this.setParamArraySimple(map, prefix + "Cc.", this.Cc);
        this.setParamArraySimple(map, prefix + "Bcc.", this.Bcc);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Simple.", this.Simple);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);
        this.setParamSimple(map, prefix + "Unsubscribe", this.Unsubscribe);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "SmtpMessageId", this.SmtpMessageId);
        this.setParamSimple(map, prefix + "SmtpHeaders", this.SmtpHeaders);
        this.setParamSimple(map, prefix + "HeaderFrom", this.HeaderFrom);

    }
}

