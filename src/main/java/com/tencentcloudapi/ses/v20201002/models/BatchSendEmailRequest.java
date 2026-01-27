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

public class BatchSendEmailRequest extends AbstractModel {

    /**
    * Sender'S email address. please fill in the sender's email address, such as noreply@mail.qcloud.com. if you need to fill in the sender's description, please follow.
Sender &lt;email address&gt; via fill in, such as:.
Tencent cloud team &lt;noreply@mail.qcloud.com&gt;.
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * Recipient list ID.
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * Email subject.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * Task type 1: send now 2: scheduled sending 3: cycle (frequency) sending.
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * The "reply" email address of the mail. can be filled with an email address you can receive mail from, can be a personal mailbox. if left empty, the recipient's reply mail will fail to send.
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * When using a template to send, fill in the related parameters of the template.
<Dx-Alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>.
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * Abandoned<Dx-Alert infotype="notice" title="description">only customers who historically applied for special configuration require the use of it. if you have not applied for special configuration, this field does not exist.</dx-alert>.
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * Send attachment when required. fill in related parameters (not supported).
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * Required parameter for sending tasks periodically.
    */
    @SerializedName("CycleParam")
    @Expose
    private CycleEmailParam CycleParam;

    /**
    * Required parameter for scheduled task assignment.
    */
    @SerializedName("TimedParam")
    @Expose
    private TimedEmailParam TimedParam;

    /**
    * Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * Whether to add an ad flag. valid values: 0 (do not add), 1 (add to the previous subject), 2 (add to the following subject).
    */
    @SerializedName("ADLocation")
    @Expose
    private Long ADLocation;

    /**
     * Get Sender'S email address. please fill in the sender's email address, such as noreply@mail.qcloud.com. if you need to fill in the sender's description, please follow.
Sender &lt;email address&gt; via fill in, such as:.
Tencent cloud team &lt;noreply@mail.qcloud.com&gt;. 
     * @return FromEmailAddress Sender'S email address. please fill in the sender's email address, such as noreply@mail.qcloud.com. if you need to fill in the sender's description, please follow.
Sender &lt;email address&gt; via fill in, such as:.
Tencent cloud team &lt;noreply@mail.qcloud.com&gt;.
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set Sender'S email address. please fill in the sender's email address, such as noreply@mail.qcloud.com. if you need to fill in the sender's description, please follow.
Sender &lt;email address&gt; via fill in, such as:.
Tencent cloud team &lt;noreply@mail.qcloud.com&gt;.
     * @param FromEmailAddress Sender'S email address. please fill in the sender's email address, such as noreply@mail.qcloud.com. if you need to fill in the sender's description, please follow.
Sender &lt;email address&gt; via fill in, such as:.
Tencent cloud team &lt;noreply@mail.qcloud.com&gt;.
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get Recipient list ID. 
     * @return ReceiverId Recipient list ID.
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set Recipient list ID.
     * @param ReceiverId Recipient list ID.
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
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
     * Get Task type 1: send now 2: scheduled sending 3: cycle (frequency) sending. 
     * @return TaskType Task type 1: send now 2: scheduled sending 3: cycle (frequency) sending.
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type 1: send now 2: scheduled sending 3: cycle (frequency) sending.
     * @param TaskType Task type 1: send now 2: scheduled sending 3: cycle (frequency) sending.
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get The "reply" email address of the mail. can be filled with an email address you can receive mail from, can be a personal mailbox. if left empty, the recipient's reply mail will fail to send. 
     * @return ReplyToAddresses The "reply" email address of the mail. can be filled with an email address you can receive mail from, can be a personal mailbox. if left empty, the recipient's reply mail will fail to send.
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set The "reply" email address of the mail. can be filled with an email address you can receive mail from, can be a personal mailbox. if left empty, the recipient's reply mail will fail to send.
     * @param ReplyToAddresses The "reply" email address of the mail. can be filled with an email address you can receive mail from, can be a personal mailbox. if left empty, the recipient's reply mail will fail to send.
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get When using a template to send, fill in the related parameters of the template.
<Dx-Alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>. 
     * @return Template When using a template to send, fill in the related parameters of the template.
<Dx-Alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>.
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set When using a template to send, fill in the related parameters of the template.
<Dx-Alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>.
     * @param Template When using a template to send, fill in the related parameters of the template.
<Dx-Alert infotype="notice" title="note">this field must be specified if you have not applied for special configuration.</dx-alert>.
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get Abandoned<Dx-Alert infotype="notice" title="description">only customers who historically applied for special configuration require the use of it. if you have not applied for special configuration, this field does not exist.</dx-alert>. 
     * @return Simple Abandoned<Dx-Alert infotype="notice" title="description">only customers who historically applied for special configuration require the use of it. if you have not applied for special configuration, this field does not exist.</dx-alert>.
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set Abandoned<Dx-Alert infotype="notice" title="description">only customers who historically applied for special configuration require the use of it. if you have not applied for special configuration, this field does not exist.</dx-alert>.
     * @param Simple Abandoned<Dx-Alert infotype="notice" title="description">only customers who historically applied for special configuration require the use of it. if you have not applied for special configuration, this field does not exist.</dx-alert>.
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get Send attachment when required. fill in related parameters (not supported). 
     * @return Attachments Send attachment when required. fill in related parameters (not supported).
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set Send attachment when required. fill in related parameters (not supported).
     * @param Attachments Send attachment when required. fill in related parameters (not supported).
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get Required parameter for sending tasks periodically. 
     * @return CycleParam Required parameter for sending tasks periodically.
     */
    public CycleEmailParam getCycleParam() {
        return this.CycleParam;
    }

    /**
     * Set Required parameter for sending tasks periodically.
     * @param CycleParam Required parameter for sending tasks periodically.
     */
    public void setCycleParam(CycleEmailParam CycleParam) {
        this.CycleParam = CycleParam;
    }

    /**
     * Get Required parameter for scheduled task assignment. 
     * @return TimedParam Required parameter for scheduled task assignment.
     */
    public TimedEmailParam getTimedParam() {
        return this.TimedParam;
    }

    /**
     * Set Required parameter for scheduled task assignment.
     * @param TimedParam Required parameter for scheduled task assignment.
     */
    public void setTimedParam(TimedEmailParam TimedParam) {
        this.TimedParam = TimedParam;
    }

    /**
     * Get Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai. 
     * @return Unsubscribe Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     * @param Unsubscribe Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai.
     */
    public void setUnsubscribe(String Unsubscribe) {
        this.Unsubscribe = Unsubscribe;
    }

    /**
     * Get Whether to add an ad flag. valid values: 0 (do not add), 1 (add to the previous subject), 2 (add to the following subject). 
     * @return ADLocation Whether to add an ad flag. valid values: 0 (do not add), 1 (add to the previous subject), 2 (add to the following subject).
     */
    public Long getADLocation() {
        return this.ADLocation;
    }

    /**
     * Set Whether to add an ad flag. valid values: 0 (do not add), 1 (add to the previous subject), 2 (add to the following subject).
     * @param ADLocation Whether to add an ad flag. valid values: 0 (do not add), 1 (add to the previous subject), 2 (add to the following subject).
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

