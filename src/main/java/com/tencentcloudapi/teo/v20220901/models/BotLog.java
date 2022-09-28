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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotLog extends AbstractModel{

    /**
    * The attack time recorded in seconds using UNIX timestamp.
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
    * The attacker IP.
    */
    @SerializedName("AttackIp")
    @Expose
    private String AttackIp;

    /**
    * The attacked domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The URI.
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * Attack type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Request method.
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * The attack content.
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * The attack level.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * The rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * The country code of the attacker IP, which is defined in ISO-3166 alpha-2. For the list of country codes, see [ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json).
    */
    @SerializedName("SipCountryCode")
    @Expose
    private String SipCountryCode;

    /**
    * The attack event ID.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * The processing method.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisposalMethod")
    @Expose
    private String DisposalMethod;

    /**
    * The HTTP log.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpLog")
    @Expose
    private String HttpLog;

    /**
    * The user agent.
    */
    @SerializedName("Ua")
    @Expose
    private String Ua;

    /**
    * The detection method.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectionMethod")
    @Expose
    private String DetectionMethod;

    /**
    * The credibility level.
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
    * The security rule information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleDetailList")
    @Expose
    private SecRuleRelatedInfo [] RuleDetailList;

    /**
    * The bot tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get The attack time recorded in seconds using UNIX timestamp. 
     * @return AttackTime The attack time recorded in seconds using UNIX timestamp.
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set The attack time recorded in seconds using UNIX timestamp.
     * @param AttackTime The attack time recorded in seconds using UNIX timestamp.
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    /**
     * Get The attacker IP. 
     * @return AttackIp The attacker IP.
     */
    public String getAttackIp() {
        return this.AttackIp;
    }

    /**
     * Set The attacker IP.
     * @param AttackIp The attacker IP.
     */
    public void setAttackIp(String AttackIp) {
        this.AttackIp = AttackIp;
    }

    /**
     * Get The attacked domain name. 
     * @return Domain The attacked domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The attacked domain name.
     * @param Domain The attacked domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The URI. 
     * @return RequestUri The URI.
     */
    public String getRequestUri() {
        return this.RequestUri;
    }

    /**
     * Set The URI.
     * @param RequestUri The URI.
     */
    public void setRequestUri(String RequestUri) {
        this.RequestUri = RequestUri;
    }

    /**
     * Get Attack type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackType Attack type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Attack type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackType Attack type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Request method. 
     * @return RequestMethod Request method.
     */
    public String getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set Request method.
     * @param RequestMethod Request method.
     */
    public void setRequestMethod(String RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get The attack content. 
     * @return AttackContent The attack content.
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set The attack content.
     * @param AttackContent The attack content.
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
    }

    /**
     * Get The attack level.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskLevel The attack level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set The attack level.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel The attack level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get The rule ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId The rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId The rule ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get The country code of the attacker IP, which is defined in ISO-3166 alpha-2. For the list of country codes, see [ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json). 
     * @return SipCountryCode The country code of the attacker IP, which is defined in ISO-3166 alpha-2. For the list of country codes, see [ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json).
     */
    public String getSipCountryCode() {
        return this.SipCountryCode;
    }

    /**
     * Set The country code of the attacker IP, which is defined in ISO-3166 alpha-2. For the list of country codes, see [ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json).
     * @param SipCountryCode The country code of the attacker IP, which is defined in ISO-3166 alpha-2. For the list of country codes, see [ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json).
     */
    public void setSipCountryCode(String SipCountryCode) {
        this.SipCountryCode = SipCountryCode;
    }

    /**
     * Get The attack event ID. 
     * @return EventId The attack event ID.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set The attack event ID.
     * @param EventId The attack event ID.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get The processing method.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisposalMethod The processing method.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDisposalMethod() {
        return this.DisposalMethod;
    }

    /**
     * Set The processing method.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisposalMethod The processing method.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisposalMethod(String DisposalMethod) {
        this.DisposalMethod = DisposalMethod;
    }

    /**
     * Get The HTTP log.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpLog The HTTP log.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpLog() {
        return this.HttpLog;
    }

    /**
     * Set The HTTP log.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpLog The HTTP log.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpLog(String HttpLog) {
        this.HttpLog = HttpLog;
    }

    /**
     * Get The user agent. 
     * @return Ua The user agent.
     */
    public String getUa() {
        return this.Ua;
    }

    /**
     * Set The user agent.
     * @param Ua The user agent.
     */
    public void setUa(String Ua) {
        this.Ua = Ua;
    }

    /**
     * Get The detection method.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetectionMethod The detection method.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDetectionMethod() {
        return this.DetectionMethod;
    }

    /**
     * Set The detection method.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetectionMethod The detection method.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetectionMethod(String DetectionMethod) {
        this.DetectionMethod = DetectionMethod;
    }

    /**
     * Get The credibility level.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Confidence The credibility level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The credibility level.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Confidence The credibility level.
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

    /**
     * Get The security rule information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleDetailList The security rule information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SecRuleRelatedInfo [] getRuleDetailList() {
        return this.RuleDetailList;
    }

    /**
     * Set The security rule information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleDetailList The security rule information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleDetailList(SecRuleRelatedInfo [] RuleDetailList) {
        this.RuleDetailList = RuleDetailList;
    }

    /**
     * Get The bot tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Label The bot tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set The bot tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Label The bot tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
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
        if (source.RuleDetailList != null) {
            this.RuleDetailList = new SecRuleRelatedInfo[source.RuleDetailList.length];
            for (int i = 0; i < source.RuleDetailList.length; i++) {
                this.RuleDetailList[i] = new SecRuleRelatedInfo(source.RuleDetailList[i]);
            }
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
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
        this.setParamArrayObj(map, prefix + "RuleDetailList.", this.RuleDetailList);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

