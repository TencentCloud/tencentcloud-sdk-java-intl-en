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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCLog extends AbstractModel {

    /**
    * Attack time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
    * Attack source IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackSip")
    @Expose
    private String AttackSip;

    /**
    * Attack domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackDomain")
    @Expose
    private String AttackDomain;

    /**
    * Request URI
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * Number of hits
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * IP country/region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SipCountryCode")
    @Expose
    private String SipCountryCode;

    /**
    * Event ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Processing method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisposalMethod")
    @Expose
    private String DisposalMethod;

    /**
    * http_log
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpLog")
    @Expose
    private String HttpLog;

    /**
    * Rule number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Risk grade
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
     * Get Attack time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackTime Attack time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set Attack time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackTime Attack time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    /**
     * Get Attack source IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackSip Attack source IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackSip() {
        return this.AttackSip;
    }

    /**
     * Set Attack source IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackSip Attack source IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackSip(String AttackSip) {
        this.AttackSip = AttackSip;
    }

    /**
     * Get Attack domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackDomain Attack domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackDomain() {
        return this.AttackDomain;
    }

    /**
     * Set Attack domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackDomain Attack domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackDomain(String AttackDomain) {
        this.AttackDomain = AttackDomain;
    }

    /**
     * Get Request URI
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestUri Request URI
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRequestUri() {
        return this.RequestUri;
    }

    /**
     * Set Request URI
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestUri Request URI
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestUri(String RequestUri) {
        this.RequestUri = RequestUri;
    }

    /**
     * Get Number of hits
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HitCount Number of hits
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set Number of hits
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HitCount Number of hits
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get IP country/region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SipCountryCode IP country/region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSipCountryCode() {
        return this.SipCountryCode;
    }

    /**
     * Set IP country/region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SipCountryCode IP country/region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSipCountryCode(String SipCountryCode) {
        this.SipCountryCode = SipCountryCode;
    }

    /**
     * Get Event ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventId Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventId Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Processing method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisposalMethod Processing method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDisposalMethod() {
        return this.DisposalMethod;
    }

    /**
     * Set Processing method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisposalMethod Processing method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisposalMethod(String DisposalMethod) {
        this.DisposalMethod = DisposalMethod;
    }

    /**
     * Get http_log
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpLog http_log
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpLog() {
        return this.HttpLog;
    }

    /**
     * Set http_log
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpLog http_log
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpLog(String HttpLog) {
        this.HttpLog = HttpLog;
    }

    /**
     * Get Rule number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Rule number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Rule number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Risk grade
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskLevel Risk grade
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk grade
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel Risk grade
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    public CCLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCLog(CCLog source) {
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
        if (source.AttackSip != null) {
            this.AttackSip = new String(source.AttackSip);
        }
        if (source.AttackDomain != null) {
            this.AttackDomain = new String(source.AttackDomain);
        }
        if (source.RequestUri != null) {
            this.RequestUri = new String(source.RequestUri);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
        if (source.SipCountryCode != null) {
            this.SipCountryCode = new String(source.SipCountryCode);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.DisposalMethod != null) {
            this.DisposalMethod = new String(source.DisposalMethod);
        }
        if (source.HttpLog != null) {
            this.HttpLog = new String(source.HttpLog);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);
        this.setParamSimple(map, prefix + "AttackSip", this.AttackSip);
        this.setParamSimple(map, prefix + "AttackDomain", this.AttackDomain);
        this.setParamSimple(map, prefix + "RequestUri", this.RequestUri);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);
        this.setParamSimple(map, prefix + "SipCountryCode", this.SipCountryCode);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DisposalMethod", this.DisposalMethod);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);

    }
}

