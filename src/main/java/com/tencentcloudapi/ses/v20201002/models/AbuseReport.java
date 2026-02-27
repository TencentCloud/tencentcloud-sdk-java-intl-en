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
    * Send time.
    */
    @SerializedName("DeliverTime")
    @Expose
    private String DeliverTime;

    /**
    * Sender address.
    */
    @SerializedName("OriginalMailFrom")
    @Expose
    private String OriginalMailFrom;

    /**
    * Receive email.
    */
    @SerializedName("OriginalRcptTo")
    @Expose
    private String OriginalRcptTo;

    /**
    * Sender domain name.
    */
    @SerializedName("FromDomain")
    @Expose
    private String FromDomain;

    /**
    * Complaint time.
    */
    @SerializedName("ComplainTime")
    @Expose
    private String ComplainTime;

    /**
    * Recipient domain name.
    */
    @SerializedName("Mta")
    @Expose
    private String Mta;

    /**
    * Source IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * Data time.
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * Template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * bulkId
    */
    @SerializedName("BulkId")
    @Expose
    private String BulkId;

    /**
    * Message-Id in mail.
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Complaint time.
    */
    @SerializedName("AbuseTime")
    @Expose
    private String AbuseTime;

    /**
    * Email subject.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
     * Get Send time. 
     * @return DeliverTime Send time.
     */
    public String getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * Set Send time.
     * @param DeliverTime Send time.
     */
    public void setDeliverTime(String DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * Get Sender address. 
     * @return OriginalMailFrom Sender address.
     */
    public String getOriginalMailFrom() {
        return this.OriginalMailFrom;
    }

    /**
     * Set Sender address.
     * @param OriginalMailFrom Sender address.
     */
    public void setOriginalMailFrom(String OriginalMailFrom) {
        this.OriginalMailFrom = OriginalMailFrom;
    }

    /**
     * Get Receive email. 
     * @return OriginalRcptTo Receive email.
     */
    public String getOriginalRcptTo() {
        return this.OriginalRcptTo;
    }

    /**
     * Set Receive email.
     * @param OriginalRcptTo Receive email.
     */
    public void setOriginalRcptTo(String OriginalRcptTo) {
        this.OriginalRcptTo = OriginalRcptTo;
    }

    /**
     * Get Sender domain name. 
     * @return FromDomain Sender domain name.
     */
    public String getFromDomain() {
        return this.FromDomain;
    }

    /**
     * Set Sender domain name.
     * @param FromDomain Sender domain name.
     */
    public void setFromDomain(String FromDomain) {
        this.FromDomain = FromDomain;
    }

    /**
     * Get Complaint time. 
     * @return ComplainTime Complaint time.
     */
    public String getComplainTime() {
        return this.ComplainTime;
    }

    /**
     * Set Complaint time.
     * @param ComplainTime Complaint time.
     */
    public void setComplainTime(String ComplainTime) {
        this.ComplainTime = ComplainTime;
    }

    /**
     * Get Recipient domain name. 
     * @return Mta Recipient domain name.
     */
    public String getMta() {
        return this.Mta;
    }

    /**
     * Set Recipient domain name.
     * @param Mta Recipient domain name.
     */
    public void setMta(String Mta) {
        this.Mta = Mta;
    }

    /**
     * Get Source IP 
     * @return SourceIp Source IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set Source IP
     * @param SourceIp Source IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get Data time. 
     * @return InsertTime Data time.
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Data time.
     * @param InsertTime Data time.
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get Template ID 
     * @return TemplateId Template ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID
     * @param TemplateId Template ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get bulkId 
     * @return BulkId bulkId
     */
    public String getBulkId() {
        return this.BulkId;
    }

    /**
     * Set bulkId
     * @param BulkId bulkId
     */
    public void setBulkId(String BulkId) {
        this.BulkId = BulkId;
    }

    /**
     * Get Message-Id in mail. 
     * @return MessageId Message-Id in mail.
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set Message-Id in mail.
     * @param MessageId Message-Id in mail.
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Complaint time. 
     * @return AbuseTime Complaint time.
     */
    public String getAbuseTime() {
        return this.AbuseTime;
    }

    /**
     * Set Complaint time.
     * @param AbuseTime Complaint time.
     */
    public void setAbuseTime(String AbuseTime) {
        this.AbuseTime = AbuseTime;
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

