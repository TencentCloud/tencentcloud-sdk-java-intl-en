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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotLog extends AbstractModel{

    /**
    * Attack time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
    * Attack IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackIp")
    @Expose
    private String AttackIp;

    /**
    * Domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Request URI
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * Attack type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Request method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * Attack content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * Risk grade
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Rule number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

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
    * user agent
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ua")
    @Expose
    private String Ua;

    /**
    * Detection method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectionMethod")
    @Expose
    private String DetectionMethod;

    /**
    * Confidence
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Confidence")
    @Expose
    private String Confidence;

    /**
    * Maliciousness
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Maliciousness")
    @Expose
    private String Maliciousness;

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
     * Get Attack IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackIp Attack IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackIp() {
        return this.AttackIp;
    }

    /**
     * Set Attack IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackIp Attack IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackIp(String AttackIp) {
        this.AttackIp = AttackIp;
    }

    /**
     * Get Domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get Attack type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackType Attack type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Attack type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackType Attack type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Request method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RequestMethod Request method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set Request method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RequestMethod Request method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestMethod(String RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get Attack content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackContent Attack content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set Attack content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackContent Attack content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
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
     * Get user agent
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ua user agent
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUa() {
        return this.Ua;
    }

    /**
     * Set user agent
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ua user agent
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUa(String Ua) {
        this.Ua = Ua;
    }

    /**
     * Get Detection method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetectionMethod Detection method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDetectionMethod() {
        return this.DetectionMethod;
    }

    /**
     * Set Detection method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetectionMethod Detection method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetectionMethod(String DetectionMethod) {
        this.DetectionMethod = DetectionMethod;
    }

    /**
     * Get Confidence
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Confidence Confidence
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Confidence Confidence
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfidence(String Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Maliciousness
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Maliciousness Maliciousness
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMaliciousness() {
        return this.Maliciousness;
    }

    /**
     * Set Maliciousness
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Maliciousness Maliciousness
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaliciousness(String Maliciousness) {
        this.Maliciousness = Maliciousness;
    }

    public BotLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotLog(BotLog source) {
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
        if (source.AttackIp != null) {
            this.AttackIp = new String(source.AttackIp);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RequestUri != null) {
            this.RequestUri = new String(source.RequestUri);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new String(source.RequestMethod);
        }
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
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
        if (source.Ua != null) {
            this.Ua = new String(source.Ua);
        }
        if (source.DetectionMethod != null) {
            this.DetectionMethod = new String(source.DetectionMethod);
        }
        if (source.Confidence != null) {
            this.Confidence = new String(source.Confidence);
        }
        if (source.Maliciousness != null) {
            this.Maliciousness = new String(source.Maliciousness);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);
        this.setParamSimple(map, prefix + "AttackIp", this.AttackIp);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RequestUri", this.RequestUri);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "SipCountryCode", this.SipCountryCode);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DisposalMethod", this.DisposalMethod);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "Ua", this.Ua);
        this.setParamSimple(map, prefix + "DetectionMethod", this.DetectionMethod);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Maliciousness", this.Maliciousness);

    }
}

