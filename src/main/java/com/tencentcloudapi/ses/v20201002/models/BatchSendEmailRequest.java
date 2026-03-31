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
    * <p>Sender's email address. Please fill in the sender's email address, for example: noreply@mail.qcloud.com. If you need to fill in the sender description, please enter it via<br>sender &lt;email address&gt;, for example:<br>Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;</p>
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * <p>Recipient list ID</p>
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * <p>Email Subject</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * <p>Task type 1: Send now 2: Scheduled sending 3: Cycle (frequency) sending</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>The "reply" email address of the mail. Can be filled with an email address you can receive mail, can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p>
    */
    @SerializedName("ReplyToAddresses")
    @Expose
    private String ReplyToAddresses;

    /**
    * <p>Template-related parameters to fill in when sending with a template</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote>
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * <p>Abandoned<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration need to use this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote></p>
    */
    @SerializedName("Simple")
    @Expose
    private Simple Simple;

    /**
    * <p>When you need to send an attachment, fill in the related parameters (not supported).</p>
    */
    @SerializedName("Attachments")
    @Expose
    private Attachment [] Attachments;

    /**
    * <p>Required parameter for sending tasks periodically</p>
    */
    @SerializedName("CycleParam")
    @Expose
    private CycleEmailParam CycleParam;

    /**
    * <p>Required parameter of scheduled task assignment</p>
    */
    @SerializedName("TimedParam")
    @Expose
    private TimedEmailParam TimedParam;

    /**
    * Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai. 11: indonesian.
    */
    @SerializedName("Unsubscribe")
    @Expose
    private String Unsubscribe;

    /**
    * <p>Whether to add an ad flag 0: do not add 1: add to the previous subject 2: add to the following subject</p>
    */
    @SerializedName("ADLocation")
    @Expose
    private Long ADLocation;

    /**
     * Get <p>Sender's email address. Please fill in the sender's email address, for example: noreply@mail.qcloud.com. If you need to fill in the sender description, please enter it via<br>sender &lt;email address&gt;, for example:<br>Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;</p> 
     * @return FromEmailAddress <p>Sender's email address. Please fill in the sender's email address, for example: noreply@mail.qcloud.com. If you need to fill in the sender description, please enter it via<br>sender &lt;email address&gt;, for example:<br>Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;</p>
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set <p>Sender's email address. Please fill in the sender's email address, for example: noreply@mail.qcloud.com. If you need to fill in the sender description, please enter it via<br>sender &lt;email address&gt;, for example:<br>Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;</p>
     * @param FromEmailAddress <p>Sender's email address. Please fill in the sender's email address, for example: noreply@mail.qcloud.com. If you need to fill in the sender description, please enter it via<br>sender &lt;email address&gt;, for example:<br>Tencent Cloud team &lt;noreply@mail.qcloud.com&gt;</p>
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get <p>Recipient list ID</p> 
     * @return ReceiverId <p>Recipient list ID</p>
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set <p>Recipient list ID</p>
     * @param ReceiverId <p>Recipient list ID</p>
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
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
     * Get <p>Task type 1: Send now 2: Scheduled sending 3: Cycle (frequency) sending</p> 
     * @return TaskType <p>Task type 1: Send now 2: Scheduled sending 3: Cycle (frequency) sending</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task type 1: Send now 2: Scheduled sending 3: Cycle (frequency) sending</p>
     * @param TaskType <p>Task type 1: Send now 2: Scheduled sending 3: Cycle (frequency) sending</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>The "reply" email address of the mail. Can be filled with an email address you can receive mail, can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p> 
     * @return ReplyToAddresses <p>The "reply" email address of the mail. Can be filled with an email address you can receive mail, can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p>
     */
    public String getReplyToAddresses() {
        return this.ReplyToAddresses;
    }

    /**
     * Set <p>The "reply" email address of the mail. Can be filled with an email address you can receive mail, can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p>
     * @param ReplyToAddresses <p>The "reply" email address of the mail. Can be filled with an email address you can receive mail, can be a personal mailbox. If left empty, the recipient's reply mail will fail to send.</p>
     */
    public void setReplyToAddresses(String ReplyToAddresses) {
        this.ReplyToAddresses = ReplyToAddresses;
    }

    /**
     * Get <p>Template-related parameters to fill in when sending with a template</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote> 
     * @return Template <p>Template-related parameters to fill in when sending with a template</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote>
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set <p>Template-related parameters to fill in when sending with a template</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote>
     * @param Template <p>Template-related parameters to fill in when sending with a template</p><blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Note</div>        <div class="rno-document-tip-desc"><p>This field must be specified if you have not applied for special configuration</p></div>    </div></blockquote>
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get <p>Abandoned<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration need to use this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote></p> 
     * @return Simple <p>Abandoned<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration need to use this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote></p>
     */
    public Simple getSimple() {
        return this.Simple;
    }

    /**
     * Set <p>Abandoned<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration need to use this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote></p>
     * @param Simple <p>Abandoned<blockquote class="rno-document-tips rno-document-tips-notice">    <div class="rno-document-tips-body">        <i class="rno-document-tip-icon"></i>        <div class="rno-document-tip-title">Description</div>        <div class="rno-document-tip-desc"><p>Only customers who historically applied for special configuration need to use this. If you have not applied for special configuration, this field does not exist.</p></div>    </div></blockquote></p>
     */
    public void setSimple(Simple Simple) {
        this.Simple = Simple;
    }

    /**
     * Get <p>When you need to send an attachment, fill in the related parameters (not supported).</p> 
     * @return Attachments <p>When you need to send an attachment, fill in the related parameters (not supported).</p>
     */
    public Attachment [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set <p>When you need to send an attachment, fill in the related parameters (not supported).</p>
     * @param Attachments <p>When you need to send an attachment, fill in the related parameters (not supported).</p>
     */
    public void setAttachments(Attachment [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get <p>Required parameter for sending tasks periodically</p> 
     * @return CycleParam <p>Required parameter for sending tasks periodically</p>
     */
    public CycleEmailParam getCycleParam() {
        return this.CycleParam;
    }

    /**
     * Set <p>Required parameter for sending tasks periodically</p>
     * @param CycleParam <p>Required parameter for sending tasks periodically</p>
     */
    public void setCycleParam(CycleEmailParam CycleParam) {
        this.CycleParam = CycleParam;
    }

    /**
     * Get <p>Required parameter of scheduled task assignment</p> 
     * @return TimedParam <p>Required parameter of scheduled task assignment</p>
     */
    public TimedEmailParam getTimedParam() {
        return this.TimedParam;
    }

    /**
     * Set <p>Required parameter of scheduled task assignment</p>
     * @param TimedParam <p>Required parameter of scheduled task assignment</p>
     */
    public void setTimedParam(TimedEmailParam TimedParam) {
        this.TimedParam = TimedParam;
    }

    /**
     * Get Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai. 11: indonesian. 
     * @return Unsubscribe Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai. 11: indonesian.
     */
    public String getUnsubscribe() {
        return this.Unsubscribe;
    }

    /**
     * Set Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai. 11: indonesian.
     * @param Unsubscribe Unsubscription link options 0: do not add 1: english 2: simplified chinese 3: traditional chinese 4: spanish 5: french 6: german 7: japanese 8: korean 9: arabic 10: thai. 11: indonesian.
     */
    public void setUnsubscribe(String Unsubscribe) {
        this.Unsubscribe = Unsubscribe;
    }

    /**
     * Get <p>Whether to add an ad flag 0: do not add 1: add to the previous subject 2: add to the following subject</p> 
     * @return ADLocation <p>Whether to add an ad flag 0: do not add 1: add to the previous subject 2: add to the following subject</p>
     */
    public Long getADLocation() {
        return this.ADLocation;
    }

    /**
     * Set <p>Whether to add an ad flag 0: do not add 1: add to the previous subject 2: add to the following subject</p>
     * @param ADLocation <p>Whether to add an ad flag 0: do not add 1: add to the previous subject 2: add to the following subject</p>
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

