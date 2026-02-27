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

public class GetAbuseReportRequest extends AbstractModel {

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit quantity (default: 1000).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sender domain name.
    */
    @SerializedName("FromDomain")
    @Expose
    private String FromDomain;

    /**
    * Sender address.
    */
    @SerializedName("FromAddress")
    @Expose
    private String FromAddress;

    /**
    * Recipient domain name.
    */
    @SerializedName("Mta")
    @Expose
    private String Mta;

    /**
    * Receive email.
    */
    @SerializedName("ToAddress")
    @Expose
    private String ToAddress;

    /**
    * Template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit quantity (default: 1000). 
     * @return Limit Limit quantity (default: 1000).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit quantity (default: 1000).
     * @param Limit Limit quantity (default: 1000).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get Sender address. 
     * @return FromAddress Sender address.
     */
    public String getFromAddress() {
        return this.FromAddress;
    }

    /**
     * Set Sender address.
     * @param FromAddress Sender address.
     */
    public void setFromAddress(String FromAddress) {
        this.FromAddress = FromAddress;
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
     * Get Receive email. 
     * @return ToAddress Receive email.
     */
    public String getToAddress() {
        return this.ToAddress;
    }

    /**
     * Set Receive email.
     * @param ToAddress Receive email.
     */
    public void setToAddress(String ToAddress) {
        this.ToAddress = ToAddress;
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

    public GetAbuseReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAbuseReportRequest(GetAbuseReportRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FromDomain != null) {
            this.FromDomain = new String(source.FromDomain);
        }
        if (source.FromAddress != null) {
            this.FromAddress = new String(source.FromAddress);
        }
        if (source.Mta != null) {
            this.Mta = new String(source.Mta);
        }
        if (source.ToAddress != null) {
            this.ToAddress = new String(source.ToAddress);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FromDomain", this.FromDomain);
        this.setParamSimple(map, prefix + "FromAddress", this.FromAddress);
        this.setParamSimple(map, prefix + "Mta", this.Mta);
        this.setParamSimple(map, prefix + "ToAddress", this.ToAddress);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

