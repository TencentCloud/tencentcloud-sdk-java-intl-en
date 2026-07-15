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

public class AbuseReport extends AbstractModel {

    /**
    * <p>Send time</p>
    */
    @SerializedName("DeliverTime")
    @Expose
    private String DeliverTime;

    /**
    * <p>Sender address</p>
    */
    @SerializedName("OriginalMailFrom")
    @Expose
    private String OriginalMailFrom;

    /**
    * <p>Receive email address</p>
    */
    @SerializedName("OriginalRcptTo")
    @Expose
    private String OriginalRcptTo;

    /**
    * <p>Sender domain name</p>
    */
    @SerializedName("FromDomain")
    @Expose
    private String FromDomain;

    /**
    * <p>Complaint time</p>
    */
    @SerializedName("ComplainTime")
    @Expose
    private String ComplainTime;

    /**
    * <p>Recipient domain name</p>
    */
    @SerializedName("Mta")
    @Expose
    private String Mta;

    /**
    * <p>Source ip</p>
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * <p>Data time</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * <p>Template ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>bulkId</p>
    */
    @SerializedName("BulkId")
    @Expose
    private String BulkId;

    /**
    * <p>Message-Id of the mail</p>
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * <p>Complaint time</p>
    */
    @SerializedName("AbuseTime")
    @Expose
    private String AbuseTime;

    /**
    * <p>Email Subject</p>
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
     * Get <p>Send time</p> 
     * @return DeliverTime <p>Send time</p>
     */
    public String getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * Set <p>Send time</p>
     * @param DeliverTime <p>Send time</p>
     */
    public void setDeliverTime(String DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * Get <p>Sender address</p> 
     * @return OriginalMailFrom <p>Sender address</p>
     */
    public String getOriginalMailFrom() {
        return this.OriginalMailFrom;
    }

    /**
     * Set <p>Sender address</p>
     * @param OriginalMailFrom <p>Sender address</p>
     */
    public void setOriginalMailFrom(String OriginalMailFrom) {
        this.OriginalMailFrom = OriginalMailFrom;
    }

    /**
     * Get <p>Receive email address</p> 
     * @return OriginalRcptTo <p>Receive email address</p>
     */
    public String getOriginalRcptTo() {
        return this.OriginalRcptTo;
    }

    /**
     * Set <p>Receive email address</p>
     * @param OriginalRcptTo <p>Receive email address</p>
     */
    public void setOriginalRcptTo(String OriginalRcptTo) {
        this.OriginalRcptTo = OriginalRcptTo;
    }

    /**
     * Get <p>Sender domain name</p> 
     * @return FromDomain <p>Sender domain name</p>
     */
    public String getFromDomain() {
        return this.FromDomain;
    }

    /**
     * Set <p>Sender domain name</p>
     * @param FromDomain <p>Sender domain name</p>
     */
    public void setFromDomain(String FromDomain) {
        this.FromDomain = FromDomain;
    }

    /**
     * Get <p>Complaint time</p> 
     * @return ComplainTime <p>Complaint time</p>
     */
    public String getComplainTime() {
        return this.ComplainTime;
    }

    /**
     * Set <p>Complaint time</p>
     * @param ComplainTime <p>Complaint time</p>
     */
    public void setComplainTime(String ComplainTime) {
        this.ComplainTime = ComplainTime;
    }

    /**
     * Get <p>Recipient domain name</p> 
     * @return Mta <p>Recipient domain name</p>
     */
    public String getMta() {
        return this.Mta;
    }

    /**
     * Set <p>Recipient domain name</p>
     * @param Mta <p>Recipient domain name</p>
     */
    public void setMta(String Mta) {
        this.Mta = Mta;
    }

    /**
     * Get <p>Source ip</p> 
     * @return SourceIp <p>Source ip</p>
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set <p>Source ip</p>
     * @param SourceIp <p>Source ip</p>
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get <p>Data time</p> 
     * @return InsertTime <p>Data time</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>Data time</p>
     * @param InsertTime <p>Data time</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>Template ID</p> 
     * @return TemplateId <p>Template ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Template ID</p>
     * @param TemplateId <p>Template ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>bulkId</p> 
     * @return BulkId <p>bulkId</p>
     */
    public String getBulkId() {
        return this.BulkId;
    }

    /**
     * Set <p>bulkId</p>
     * @param BulkId <p>bulkId</p>
     */
    public void setBulkId(String BulkId) {
        this.BulkId = BulkId;
    }

    /**
     * Get <p>Message-Id of the mail</p> 
     * @return MessageId <p>Message-Id of the mail</p>
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set <p>Message-Id of the mail</p>
     * @param MessageId <p>Message-Id of the mail</p>
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get <p>Complaint time</p> 
     * @return AbuseTime <p>Complaint time</p>
     */
    public String getAbuseTime() {
        return this.AbuseTime;
    }

    /**
     * Set <p>Complaint time</p>
     * @param AbuseTime <p>Complaint time</p>
     */
    public void setAbuseTime(String AbuseTime) {
        this.AbuseTime = AbuseTime;
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

    public AbuseReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbuseReport(AbuseReport source) {
        if (source.DeliverTime != null) {
            this.DeliverTime = new String(source.DeliverTime);
        }
        if (source.OriginalMailFrom != null) {
            this.OriginalMailFrom = new String(source.OriginalMailFrom);
        }
        if (source.OriginalRcptTo != null) {
            this.OriginalRcptTo = new String(source.OriginalRcptTo);
        }
        if (source.FromDomain != null) {
            this.FromDomain = new String(source.FromDomain);
        }
        if (source.ComplainTime != null) {
            this.ComplainTime = new String(source.ComplainTime);
        }
        if (source.Mta != null) {
            this.Mta = new String(source.Mta);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.BulkId != null) {
            this.BulkId = new String(source.BulkId);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.AbuseTime != null) {
            this.AbuseTime = new String(source.AbuseTime);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliverTime", this.DeliverTime);
        this.setParamSimple(map, prefix + "OriginalMailFrom", this.OriginalMailFrom);
        this.setParamSimple(map, prefix + "OriginalRcptTo", this.OriginalRcptTo);
        this.setParamSimple(map, prefix + "FromDomain", this.FromDomain);
        this.setParamSimple(map, prefix + "ComplainTime", this.ComplainTime);
        this.setParamSimple(map, prefix + "Mta", this.Mta);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "BulkId", this.BulkId);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "AbuseTime", this.AbuseTime);
        this.setParamSimple(map, prefix + "Subject", this.Subject);

    }
}

