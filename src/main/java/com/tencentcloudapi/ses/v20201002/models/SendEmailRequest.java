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
    * <p>Sender's email address. If no alias is used, enter the sender's email address directly, for example: noreply@mail.qcloud.com. To use a sender alias, follow this format (note that a space must be used between the alias and the email address): alias+space+&lt;email address&gt;. The alias cannot contain a colon (:).</p>
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * <p>Email Subject</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * <p>Recipient email address, supports up to 50 recipients in mass sending. Note: The email content displays all recipient addresses. For non-mass sending, call the API multiple times to send.<br>At least one of the three parameters Destination/Cc/Bcc must exist.</p>
    */
    @SerializedName("Destination")
    @Expose
    private String [] Destination;

    /**
    * <p>The "reply" email address of the mail. Can be filled with a mailbox address where you can receive emails, which can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p>
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * <p>Email address of CC recipients, supports up to 20 carbon copies.</p>
    */
    @SerializedName("Cc")
    @Expose
    private String [] Cc;

    /**
    * <p>Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.</p>
    */
    @SerializedName("Bcc")
    @Expose
    private String [] Bcc;

    /**
    * <p>Fill in the template parameters when sending with a template.</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote>
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * <p>Abandoned</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration require the use of this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote>
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * <p>To send an attachment, fill in the relevant parameters. The Tencent Cloud API request supports a maximum of 8M request packet. The attachment content is expected to expand by 1.5 times after Base64 encoding. The total size of all attachments should not exceed 4M. The API will return an error if the overall request exceeds 8M.</p>
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai 11: indonesian.
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * <p>Mail trigger type 0: Non-trigger class, default type, select this type for marketing email, non-instant mail. 1: Trigger class, instant delivery mail such as verification code. If the mail exceeds a certain size, the system will automatically select a non-trigger type channel.</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * <p>Message-Id field in the smtp header</p>
    */
    @SerializedName("SmtpMessageId")
    @Expose
    private String SmtpMessageId;

    /**
    * <p>Other fields that can be set in the smtp header</p>
    */
    @SerializedName("SmtpHeaders")
    @Expose
    private String SmtpHeaders;

    /**
    * <p>The from field in the smtp header. The domain name should be consistent with the FromEmailAddress.</p>
    */
    @SerializedName("HeaderFrom")
    @Expose
    private String HeaderFrom;

    /**
     * Get <p>Sender's email address. If no alias is used, enter the sender's email address directly, for example: noreply@mail.qcloud.com. To use a sender alias, follow this format (note that a space must be used between the alias and the email address): alias+space+&lt;email address&gt;. The alias cannot contain a colon (:).</p> 
     * @return FromEmailAddress <p>Sender's email address. If no alias is used, enter the sender's email address directly, for example: noreply@mail.qcloud.com. To use a sender alias, follow this format (note that a space must be used between the alias and the email address): alias+space+&lt;email address&gt;. The alias cannot contain a colon (:).</p>
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set <p>Sender's email address. If no alias is used, enter the sender's email address directly, for example: noreply@mail.qcloud.com. To use a sender alias, follow this format (note that a space must be used between the alias and the email address): alias+space+&lt;email address&gt;. The alias cannot contain a colon (:).</p>
     * @param FromEmailAddress <p>Sender's email address. If no alias is used, enter the sender's email address directly, for example: noreply@mail.qcloud.com. To use a sender alias, follow this format (note that a space must be used between the alias and the email address): alias+space+&lt;email address&gt;. The alias cannot contain a colon (:).</p>
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get <p>Email Subject</p> 
     * @return Subject <p>Email Subject</p>
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set <p>Email Subject</p>
     * @param Subject <p>Email Subject</p>
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get <p>Recipient email address, supports up to 50 recipients in mass sending. Note: The email content displays all recipient addresses. For non-mass sending, call the API multiple times to send.<br>At least one of the three parameters Destination/Cc/Bcc must exist.</p> 
     * @return Destination <p>Recipient email address, supports up to 50 recipients in mass sending. Note: The email content displays all recipient addresses. For non-mass sending, call the API multiple times to send.<br>At least one of the three parameters Destination/Cc/Bcc must exist.</p>
     */
    public String [] getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>Recipient email address, supports up to 50 recipients in mass sending. Note: The email content displays all recipient addresses. For non-mass sending, call the API multiple times to send.<br>At least one of the three parameters Destination/Cc/Bcc must exist.</p>
     * @param Destination <p>Recipient email address, supports up to 50 recipients in mass sending. Note: The email content displays all recipient addresses. For non-mass sending, call the API multiple times to send.<br>At least one of the three parameters Destination/Cc/Bcc must exist.</p>
     */
    public void setDestination(String [] Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>The "reply" email address of the mail. Can be filled with a mailbox address where you can receive emails, which can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p> 
     * @return ReplyToAddresses <p>The "reply" email address of the mail. Can be filled with a mailbox address where you can receive emails, which can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p>
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set <p>The "reply" email address of the mail. Can be filled with a mailbox address where you can receive emails, which can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p>
     * @param ReplyToAddresses <p>The "reply" email address of the mail. Can be filled with a mailbox address where you can receive emails, which can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p>
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get <p>Email address of CC recipients, supports up to 20 carbon copies.</p> 
     * @return Cc <p>Email address of CC recipients, supports up to 20 carbon copies.</p>
     */
    public String [] getCc() {
        return this.Cc;
    }

    /**
     * Set <p>Email address of CC recipients, supports up to 20 carbon copies.</p>
     * @param Cc <p>Email address of CC recipients, supports up to 20 carbon copies.</p>
     */
    public void setCc(String [] Cc) {
        this.Cc = Cc;
    }

    /**
     * Get <p>Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.</p> 
     * @return Bcc <p>Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.</p>
     */
    public String [] getBcc() {
        return this.Bcc;
    }

    /**
     * Set <p>Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.</p>
     * @param Bcc <p>Bcc email address, supports up to 20 carbon copies. Bcc and Destination must be unique.</p>
     */
    public void setBcc(String [] Bcc) {
        this.Bcc = Bcc;
    }

    /**
     * Get <p>Fill in the template parameters when sending with a template.</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote> 
     * @return Template <p>Fill in the template parameters when sending with a template.</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote>
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>Fill in the template parameters when sending with a template.</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote>
     * @param Template <p>Fill in the template parameters when sending with a template.</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote>
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get <p>Abandoned</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration require the use of this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote> 
     * @return Simple <p>Abandoned</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration require the use of this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote>
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set <p>Abandoned</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration require the use of this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote>
     * @param Simple <p>Abandoned</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration require the use of this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote>
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get <p>To send an attachment, fill in the relevant parameters. The Tencent Cloud API request supports a maximum of 8M request packet. The attachment content is expected to expand by 1.5 times after Base64 encoding. The total size of all attachments should not exceed 4M. The API will return an error if the overall request exceeds 8M.</p> 
     * @return Attachments <p>To send an attachment, fill in the relevant parameters. The Tencent Cloud API request supports a maximum of 8M request packet. The attachment content is expected to expand by 1.5 times after Base64 encoding. The total size of all attachments should not exceed 4M. The API will return an error if the overall request exceeds 8M.</p>
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set <p>To send an attachment, fill in the relevant parameters. The Tencent Cloud API request supports a maximum of 8M request packet. The attachment content is expected to expand by 1.5 times after Base64 encoding. The total size of all attachments should not exceed 4M. The API will return an error if the overall request exceeds 8M.</p>
     * @param Attachments <p>To send an attachment, fill in the relevant parameters. The Tencent Cloud API request supports a maximum of 8M request packet. The attachment content is expected to expand by 1.5 times after Base64 encoding. The total size of all attachments should not exceed 4M. The API will return an error if the overall request exceeds 8M.</p>
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai 11: indonesian. 
     * @return Unsubscribe Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai 11: indonesian.
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai 11: indonesian.
     * @param Unsubscribe Unsubscription link options 0: do not add unsubscription link 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai 11: indonesian.
     */
    public void setUnsubscribe(String Unsubscribe) {
        this.Unsubscribe = Unsubscribe;
    }

    /**
     * Get <p>Mail trigger type 0: Non-trigger class, default type, select this type for marketing email, non-instant mail. 1: Trigger class, instant delivery mail such as verification code. If the mail exceeds a certain size, the system will automatically select a non-trigger type channel.</p> 
     * @return TriggerType <p>Mail trigger type 0: Non-trigger class, default type, select this type for marketing email, non-instant mail. 1: Trigger class, instant delivery mail such as verification code. If the mail exceeds a certain size, the system will automatically select a non-trigger type channel.</p>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Mail trigger type 0: Non-trigger class, default type, select this type for marketing email, non-instant mail. 1: Trigger class, instant delivery mail such as verification code. If the mail exceeds a certain size, the system will automatically select a non-trigger type channel.</p>
     * @param TriggerType <p>Mail trigger type 0: Non-trigger class, default type, select this type for marketing email, non-instant mail. 1: Trigger class, instant delivery mail such as verification code. If the mail exceeds a certain size, the system will automatically select a non-trigger type channel.</p>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Message-Id field in the smtp header</p> 
     * @return SmtpMessageId <p>Message-Id field in the smtp header</p>
     */
    public String getSmtpMessageId() {
        return this.SmtpMessageId;
    }

    /**
     * Set <p>Message-Id field in the smtp header</p>
     * @param SmtpMessageId <p>Message-Id field in the smtp header</p>
     */
    public void setSmtpMessageId(String SmtpMessageId) {
        this.SmtpMessageId = SmtpMessageId;
    }

    /**
     * Get <p>Other fields that can be set in the smtp header</p> 
     * @return SmtpHeaders <p>Other fields that can be set in the smtp header</p>
     */
    public String getSmtpHeaders() {
        return this.SmtpHeaders;
    }

    /**
     * Set <p>Other fields that can be set in the smtp header</p>
     * @param SmtpHeaders <p>Other fields that can be set in the smtp header</p>
     */
    public void setSmtpHeaders(String SmtpHeaders) {
        this.SmtpHeaders = SmtpHeaders;
    }

    /**
     * Get <p>The from field in the smtp header. The domain name should be consistent with the FromEmailAddress.</p> 
     * @return HeaderFrom <p>The from field in the smtp header. The domain name should be consistent with the FromEmailAddress.</p>
     */
    public String getHeaderFrom() {
        return this.HeaderFrom;
    }

    /**
     * Set <p>The from field in the smtp header. The domain name should be consistent with the FromEmailAddress.</p>
     * @param HeaderFrom <p>The from field in the smtp header. The domain name should be consistent with the FromEmailAddress.</p>
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

