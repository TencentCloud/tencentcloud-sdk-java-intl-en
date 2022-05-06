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

public class BatchSendEmailRequest extends AbstractModel{

    /**
    * Sender address. Enter a sender address, for example, noreply@mail.qcloud.com. To display the sender name, enter the address in the following format:
Sender <email address>, for example:
Tencent Cloud team <noreply@mail.qcloud.com>
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * Recipient group ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * Email subject
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Task type. `1`: immediate; `2`: scheduled; `3`: recurring
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will be sent to Tencent Cloud.
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * Template when emails are sent using a template
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * Email content when emails are sent by calling the API. This parameter is currently unavailable.
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * Attachment parameters to set when you need to send attachments. This parameter is currently unavailable.
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * Parameter required for a recurring sending task
    */
    @SerializedName("CycleParam")
    @Expose
    private CycleEmailParam CycleParam;

    /**
    * Parameter required for a scheduled sending task
    */
    @SerializedName("TimedParam")
    @Expose
    private TimedEmailParam TimedParam;

    /**
    * Unsubscribe option. `1`: provides an unsubscribe link; `0`: does not provide an unsubscribe link
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * Whether to add an ad tag. `0`: Add no tag; `1`: Add before the subject; `2`: Add after the subject.
    */
    @SerializedName("ADLocation")
    @Expose
    private Long ADLocation;

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
     * Get Recipient group ID 
     * @return ReceiverId Recipient group ID
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set Recipient group ID
     * @param ReceiverId Recipient group ID
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get Email subject 
     * @return Subject Email subject
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Email subject
     * @param Subject Email subject
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get Task type. `1`: immediate; `2`: scheduled; `3`: recurring 
     * @return TaskType Task type. `1`: immediate; `2`: scheduled; `3`: recurring
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. `1`: immediate; `2`: scheduled; `3`: recurring
     * @param TaskType Task type. `1`: immediate; `2`: scheduled; `3`: recurring
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will be sent to Tencent Cloud. 
     * @return ReplyToAddresses Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will be sent to Tencent Cloud.
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will be sent to Tencent Cloud.
     * @param ReplyToAddresses Reply-to address. You can enter a valid personal email address that can receive emails. If this parameter is left empty, reply emails will be sent to Tencent Cloud.
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get Template when emails are sent using a template 
     * @return Template Template when emails are sent using a template
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set Template when emails are sent using a template
     * @param Template Template when emails are sent using a template
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get Email content when emails are sent by calling the API. This parameter is currently unavailable. 
     * @return Simple Email content when emails are sent by calling the API. This parameter is currently unavailable.
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set Email content when emails are sent by calling the API. This parameter is currently unavailable.
     * @param Simple Email content when emails are sent by calling the API. This parameter is currently unavailable.
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get Attachment parameters to set when you need to send attachments. This parameter is currently unavailable. 
     * @return Attachments Attachment parameters to set when you need to send attachments. This parameter is currently unavailable.
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set Attachment parameters to set when you need to send attachments. This parameter is currently unavailable.
     * @param Attachments Attachment parameters to set when you need to send attachments. This parameter is currently unavailable.
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get Parameter required for a recurring sending task 
     * @return CycleParam Parameter required for a recurring sending task
     */
    public CycleEmailParam getCycleParam() {
        return this.CycleParam;
    }

    /**
     * Set Parameter required for a recurring sending task
     * @param CycleParam Parameter required for a recurring sending task
     */
    public void setCycleParam(CycleEmailParam CycleParam) {
        this.CycleParam = CycleParam;
    }

    /**
     * Get Parameter required for a scheduled sending task 
     * @return TimedParam Parameter required for a scheduled sending task
     */
    public TimedEmailParam getTimedParam() {
        return this.TimedParam;
    }

    /**
     * Set Parameter required for a scheduled sending task
     * @param TimedParam Parameter required for a scheduled sending task
     */
    public void setTimedParam(TimedEmailParam TimedParam) {
        this.TimedParam = TimedParam;
    }

    /**
     * Get Unsubscribe option. `1`: provides an unsubscribe link; `0`: does not provide an unsubscribe link 
     * @return Unsubscribe Unsubscribe option. `1`: provides an unsubscribe link; `0`: does not provide an unsubscribe link
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set Unsubscribe option. `1`: provides an unsubscribe link; `0`: does not provide an unsubscribe link
     * @param Unsubscribe Unsubscribe option. `1`: provides an unsubscribe link; `0`: does not provide an unsubscribe link
     */
    public void setUnsubscribe(String Unsubscribe) {
        this.Unsubscribe = Unsubscribe;
    }

    /**
     * Get Whether to add an ad tag. `0`: Add no tag; `1`: Add before the subject; `2`: Add after the subject. 
     * @return ADLocation Whether to add an ad tag. `0`: Add no tag; `1`: Add before the subject; `2`: Add after the subject.
     */
    public Long getADLocation() {
        return this.ADLocation;
    }

    /**
     * Set Whether to add an ad tag. `0`: Add no tag; `1`: Add before the subject; `2`: Add after the subject.
     * @param ADLocation Whether to add an ad tag. `0`: Add no tag; `1`: Add before the subject; `2`: Add after the subject.
     */
    public void setADLocation(Long ADLocation) {
        this.ADLocation = ADLocation;
    }

    public BatchSendEmailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSendEmailRequest(BatchSendEmailRequest source) {
        if (source.FromEmailAddress != null) {
            this.FromEmailAddress = new String(source.FromEmailAddress);
        }
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
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
        if (source.CycleParam != null) {
            this.CycleParam = new CycleEmailParam(source.CycleParam);
        }
        if (source.TimedParam != null) {
            this.TimedParam = new TimedEmailParam(source.TimedParam);
        }
        if (source.Unsubscribe != null) {
            this.Unsubscribe = new String(source.Unsubscribe);
        }
        if (source.ADLocation != null) {
            this.ADLocation = new Long(source.ADLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ReplyToAddresses", this.ReplyToAddresses);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Simple.", this.Simple);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);
        this.setParamObj(map, prefix + "CycleParam.", this.CycleParam);
        this.setParamObj(map, prefix + "TimedParam.", this.TimedParam);
        this.setParamSimple(map, prefix + "Unsubscribe", this.Unsubscribe);
        this.setParamSimple(map, prefix + "ADLocation", this.ADLocation);

    }
}

