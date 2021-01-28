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
sender &lt;email address&gt;. For example: 
Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * Recipient email addresses. You can send an email to up to 50 recipients at a time.
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
    * Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails.
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
    * 
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
     * Get Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format:  
sender &lt;email address&gt;. For example: 
Tencent Cloud team &lt;noreply@mail.qcloud.com&gt; 
     * @return FromEmailAddress Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format:  
sender &lt;email address&gt;. For example: 
Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format:  
sender &lt;email address&gt;. For example: 
Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;
     * @param FromEmailAddress Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format:  
sender &lt;email address&gt;. For example: 
Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get Recipient email addresses. You can send an email to up to 50 recipients at a time. 
     * @return Destination Recipient email addresses. You can send an email to up to 50 recipients at a time.
     */
    public String [] getDestination() {
        return this.Destination;
    }

    /**
     * Set Recipient email addresses. You can send an email to up to 50 recipients at a time.
     * @param Destination Recipient email addresses. You can send an email to up to 50 recipients at a time.
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
     * Get Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails. 
     * @return ReplyToAddresses Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails.
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails.
     * @param ReplyToAddresses Reply-to address. You can enter a valid personal email address that can receive emails. If this field is left empty, reply emails will be sent to Tencent Cloud. Note: the email content will display all recipient addresses. To send one-to-one emails to several recipients, please call the API multiple times to send the emails.
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
     * Get  
     * @return Attachments 
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set 
     * @param Attachments 
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
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

