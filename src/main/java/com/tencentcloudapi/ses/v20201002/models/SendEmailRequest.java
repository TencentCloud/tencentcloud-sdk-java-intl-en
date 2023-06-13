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
    * Sender address. Enter a sender address, for example, noreply@mail.qcloud.com.
To display the sender name, enter the address in the following format: 
Sender <email address>
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
    * Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will fail to be sent.
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * 
    */
    @SerializedName("Cc")
    @Expose
    private String [] Cc;

    /**
    * 
    */
    @SerializedName("Bcc")
    @Expose
    private String [] Bcc;

    /**
    * Template parameters for template-based sending. As `Simple` has been disused, `Template` is required.
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * Disused
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * Parameters for the attachments to be sent. The TencentCloud API supports a request packet of up to 8 MB in size, and the size of the attachment content will increase by 1.5 times after Base64 encoding. Therefore, you need to keep the total size of all attachments below 4 MB. If the entire request exceeds 8 MB, the API will return an error.
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * Unsubscribe link option. `0`: Do not add unsubscribe link; `1`: English `2`: Simplified Chinese; `3`: Traditional Chinese; `4`: Spanish; `5`: French; `6`: German; `7`: Japanese; `8`: Korean; `9`: Arabic; `10`: Thai
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * Email triggering type. `0` (default): non-trigger-based, suitable for marketing emails and non-immediate emails; `1`: trigger-based, suitable for immediate emails such as emails containing verification codes. If the size of an email exceeds a specified value, the system will automatically choose the non-trigger-based type.
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
     * Get Sender address. Enter a sender address, for example, noreply@mail.qcloud.com.
To display the sender name, enter the address in the following format: 
Sender <email address> 
     * @return FromEmailAddress Sender address. Enter a sender address, for example, noreply@mail.qcloud.com.
To display the sender name, enter the address in the following format: 
Sender <email address>
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set Sender address. Enter a sender address, for example, noreply@mail.qcloud.com.
To display the sender name, enter the address in the following format: 
Sender <email address>
     * @param FromEmailAddress Sender address. Enter a sender address, for example, noreply@mail.qcloud.com.
To display the sender name, enter the address in the following format: 
Sender <email address>
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
     * Get Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will fail to be sent. 
     * @return ReplyToAddresses Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will fail to be sent.
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will fail to be sent.
     * @param ReplyToAddresses Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will fail to be sent.
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get  
     * @return Cc 
     */
    public String [] getCc() {
        return this.Cc;
    }

    /**
     * Set 
     * @param Cc 
     */
    public void setCc(String [] Cc) {
        this.Cc = Cc;
    }

    /**
     * Get  
     * @return Bcc 
     */
    public String [] getBcc() {
        return this.Bcc;
    }

    /**
     * Set 
     * @param Bcc 
     */
    public void setBcc(String [] Bcc) {
        this.Bcc = Bcc;
    }

    /**
     * Get Template parameters for template-based sending. As `Simple` has been disused, `Template` is required. 
     * @return Template Template parameters for template-based sending. As `Simple` has been disused, `Template` is required.
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set Template parameters for template-based sending. As `Simple` has been disused, `Template` is required.
     * @param Template Template parameters for template-based sending. As `Simple` has been disused, `Template` is required.
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get Disused 
     * @return Simple Disused
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set Disused
     * @param Simple Disused
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get Parameters for the attachments to be sent. The TencentCloud API supports a request packet of up to 8 MB in size, and the size of the attachment content will increase by 1.5 times after Base64 encoding. Therefore, you need to keep the total size of all attachments below 4 MB. If the entire request exceeds 8 MB, the API will return an error. 
     * @return Attachments Parameters for the attachments to be sent. The TencentCloud API supports a request packet of up to 8 MB in size, and the size of the attachment content will increase by 1.5 times after Base64 encoding. Therefore, you need to keep the total size of all attachments below 4 MB. If the entire request exceeds 8 MB, the API will return an error.
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set Parameters for the attachments to be sent. The TencentCloud API supports a request packet of up to 8 MB in size, and the size of the attachment content will increase by 1.5 times after Base64 encoding. Therefore, you need to keep the total size of all attachments below 4 MB. If the entire request exceeds 8 MB, the API will return an error.
     * @param Attachments Parameters for the attachments to be sent. The TencentCloud API supports a request packet of up to 8 MB in size, and the size of the attachment content will increase by 1.5 times after Base64 encoding. Therefore, you need to keep the total size of all attachments below 4 MB. If the entire request exceeds 8 MB, the API will return an error.
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get Unsubscribe link option. `0`: Do not add unsubscribe link; `1`: English `2`: Simplified Chinese; `3`: Traditional Chinese; `4`: Spanish; `5`: French; `6`: German; `7`: Japanese; `8`: Korean; `9`: Arabic; `10`: Thai 
     * @return Unsubscribe Unsubscribe link option. `0`: Do not add unsubscribe link; `1`: English `2`: Simplified Chinese; `3`: Traditional Chinese; `4`: Spanish; `5`: French; `6`: German; `7`: Japanese; `8`: Korean; `9`: Arabic; `10`: Thai
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set Unsubscribe link option. `0`: Do not add unsubscribe link; `1`: English `2`: Simplified Chinese; `3`: Traditional Chinese; `4`: Spanish; `5`: French; `6`: German; `7`: Japanese; `8`: Korean; `9`: Arabic; `10`: Thai
     * @param Unsubscribe Unsubscribe link option. `0`: Do not add unsubscribe link; `1`: English `2`: Simplified Chinese; `3`: Traditional Chinese; `4`: Spanish; `5`: French; `6`: German; `7`: Japanese; `8`: Korean; `9`: Arabic; `10`: Thai
     */
    public void setUnsubscribe(String Unsubscribe) {
        this.Unsubscribe = Unsubscribe;
    }

    /**
     * Get Email triggering type. `0` (default): non-trigger-based, suitable for marketing emails and non-immediate emails; `1`: trigger-based, suitable for immediate emails such as emails containing verification codes. If the size of an email exceeds a specified value, the system will automatically choose the non-trigger-based type. 
     * @return TriggerType Email triggering type. `0` (default): non-trigger-based, suitable for marketing emails and non-immediate emails; `1`: trigger-based, suitable for immediate emails such as emails containing verification codes. If the size of an email exceeds a specified value, the system will automatically choose the non-trigger-based type.
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Email triggering type. `0` (default): non-trigger-based, suitable for marketing emails and non-immediate emails; `1`: trigger-based, suitable for immediate emails such as emails containing verification codes. If the size of an email exceeds a specified value, the system will automatically choose the non-trigger-based type.
     * @param TriggerType Email triggering type. `0` (default): non-trigger-based, suitable for marketing emails and non-immediate emails; `1`: trigger-based, suitable for immediate emails such as emails containing verification codes. If the size of an email exceeds a specified value, the system will automatically choose the non-trigger-based type.
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamArraySimple(map, prefix + "Destination.", this.Destination);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "ReplyToAddresses", this.ReplyToAddresses);
        this.setParamArraySimple(map, prefix + "Cc.", this.Cc);
        this.setParamArraySimple(map, prefix + "Bcc.", this.Bcc);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Simple.", this.Simple);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);
        this.setParamSimple(map, prefix + "Unsubscribe", this.Unsubscribe);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);

    }
}

