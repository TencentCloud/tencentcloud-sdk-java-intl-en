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

public class WebLogs extends AbstractModel{

    /**
    * Attack content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * Attack IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackIp")
    @Expose
    private String AttackIp;

    /**
    * Attack type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * uuid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Msuuid")
    @Expose
    private String Msuuid;

    /**
    * Request method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * Request URI
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * Risk grade
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Rule ID
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
    * Attack time. For consistency considerations, the original parameter `time` was renamed `AttackTime`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

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
     * Get uuid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Msuuid uuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsuuid() {
        return this.Msuuid;
    }

    /**
     * Set uuid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Msuuid uuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsuuid(String Msuuid) {
        this.Msuuid = Msuuid;
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
     * Get Rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Rule ID
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
     * Get Attack time. For consistency considerations, the original parameter `time` was renamed `AttackTime`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackTime Attack time. For consistency considerations, the original parameter `time` was renamed `AttackTime`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set Attack time. For consistency considerations, the original parameter `time` was renamed `AttackTime`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackTime Attack time. For consistency considerations, the original parameter `time` was renamed `AttackTime`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    public WebLogs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebLogs(WebLogs source) {
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.AttackIp != null) {
            this.AttackIp = new String(source.AttackIp);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Msuuid != null) {
            this.Msuuid = new String(source.Msuuid);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new String(source.RequestMethod);
        }
        if (source.RequestUri != null) {
            this.RequestUri = new String(source.RequestUri);
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
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamSimple(map, prefix + "AttackIp", this.AttackIp);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Msuuid", this.Msuuid);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamSimple(map, prefix + "RequestUri", this.RequestUri);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "SipCountryCode", this.SipCountryCode);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DisposalMethod", this.DisposalMethod);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "Ua", this.Ua);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);

    }
}

