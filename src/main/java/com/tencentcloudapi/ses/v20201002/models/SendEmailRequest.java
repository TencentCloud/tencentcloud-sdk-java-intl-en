/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendEmailRequest extends AbstractModel{

    /**
    * Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format: 
Sender <email address>, for example:
Tencent Cloud team <noreply@mail.qcloud.com>
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * Recipient email addresses. You can send an email to up to 50 recipients at a time. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails.
    */
    @SerializedName("Destination")
    @Expose
    private String [] Destination;

    /**
    * Email subject.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud.
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * Template when sending emails using a template.
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * Email content when sending emails by calling the API.
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * Email attachments
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
     * Get Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format: 
Sender <email address>, for example:
Tencent Cloud team <noreply@mail.qcloud.com> 
     * @return FromEmailAddress Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format: 
Sender <email address>, for example:
Tencent Cloud team <noreply@mail.qcloud.com>
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format: 
Sender <email address>, for example:
Tencent Cloud team <noreply@mail.qcloud.com>
     * @param FromEmailAddress Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format: 
Sender <email address>, for example:
Tencent Cloud team <noreply@mail.qcloud.com>
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get Recipient email addresses. You can send an email to up to 50 recipients at a time. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails. 
     * @return Destination Recipient email addresses. You can send an email to up to 50 recipients at a time. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails.
     */
    public String [] getDestination() {
        return this.Destination;
    }

    /**
     * Set Recipient email addresses. You can send an email to up to 50 recipients at a time. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails.
     * @param Destination Recipient email addresses. You can send an email to up to 50 recipients at a time. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails.
     */
    public void setDestination(String [] Destination) {
        this.Destination = Destination;
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
     * Get Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud. 
     * @return ReplyToAddresses Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud.
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud.
     * @param ReplyToAddresses Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud.
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get Template when sending emails using a template. 
     * @return Template Template when sending emails using a template.
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set Template when sending emails using a template.
     * @param Template Template when sending emails using a template.
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get Email content when sending emails by calling the API. 
     * @return Simple Email content when sending emails by calling the API.
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set Email content when sending emails by calling the API.
     * @param Simple Email content when sending emails by calling the API.
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get Email attachments 
     * @return Attachments Email attachments
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set Email attachments
     * @param Attachments Email attachments
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
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
        if (source.Destination != null) {
            this.Destination = new String[source.Destination.length];
            for (int i = 0; i < source.Destination.length; i++) {
                this.Destination[i] = new String(source.Destination[i]);
            }
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.ReplyToAddresses != null) {
            this.ReplyToAddresses = new String(source.ReplyToAddresses);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamArraySimple(map, prefix + "Destination.", this.Destination);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "ReplyToAddresses", this.ReplyToAddresses);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Simple.", this.Simple);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);

    }
}

