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

public class WebLogs extends AbstractModel{

    /**
    * The attack event ID.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * The attacker IP.
    */
    @SerializedName("AttackIp")
    @Expose
    private String AttackIp;

    /**
    * The attacked subdomain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The HTTP log content.
    */
    @SerializedName("HttpLog")
    @Expose
    private String HttpLog;

    /**
    * The country code of the attacker IP, which is defined in ISO-3166 alpha-2. For the list of country codes, see [ISO-3166](https://git.woa.com/edgeone/iso-3166/blob/master/all/all.json).
    */
    @SerializedName("SipCountryCode")
    @Expose
    private String SipCountryCode;

    /**
    * The attack time recorded in seconds using UNIX timestamp.
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
    * The request address.
    */
    @SerializedName("RequestUri")
    @Expose
    private String RequestUri;

    /**
    * The attack content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * The security rule information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleDetailList")
    @Expose
    private SecRuleRelatedInfo [] RuleDetailList;

    /**
    * The request type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReqMethod")
    @Expose
    private String ReqMethod;

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
     * Get The attacked subdomain name. 
     * @return Domain The attacked subdomain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The attacked subdomain name.
     * @param Domain The attacked subdomain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The HTTP log content. 
     * @return HttpLog The HTTP log content.
     */
    public String getHttpLog() {
        return this.HttpLog;
    }

    /**
     * Set The HTTP log content.
     * @param HttpLog The HTTP log content.
     */
    public void setHttpLog(String HttpLog) {
        this.HttpLog = HttpLog;
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
     * Get The request address. 
     * @return RequestUri The request address.
     */
    public String getRequestUri() {
        return this.RequestUri;
    }

    /**
     * Set The request address.
     * @param RequestUri The request address.
     */
    public void setRequestUri(String RequestUri) {
        this.RequestUri = RequestUri;
    }

    /**
     * Get The attack content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackContent The attack content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set The attack content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackContent The attack content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
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
     * Get The request type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReqMethod The request type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReqMethod() {
        return this.ReqMethod;
    }

    /**
     * Set The request type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReqMethod The request type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReqMethod(String ReqMethod) {
        this.ReqMethod = ReqMethod;
    }

    public WebLogs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebLogs(WebLogs source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.AttackIp != null) {
            this.AttackIp = new String(source.AttackIp);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.HttpLog != null) {
            this.HttpLog = new String(source.HttpLog);
        }
        if (source.SipCountryCode != null) {
            this.SipCountryCode = new String(source.SipCountryCode);
        }
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
        if (source.RequestUri != null) {
            this.RequestUri = new String(source.RequestUri);
        }
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.RuleDetailList != null) {
            this.RuleDetailList = new SecRuleRelatedInfo[source.RuleDetailList.length];
            for (int i = 0; i < source.RuleDetailList.length; i++) {
                this.RuleDetailList[i] = new SecRuleRelatedInfo(source.RuleDetailList[i]);
            }
        }
        if (source.ReqMethod != null) {
            this.ReqMethod = new String(source.ReqMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "AttackIp", this.AttackIp);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "SipCountryCode", this.SipCountryCode);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);
        this.setParamSimple(map, prefix + "RequestUri", this.RequestUri);
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamArrayObj(map, prefix + "RuleDetailList.", this.RuleDetailList);
        this.setParamSimple(map, prefix + "ReqMethod", this.ReqMethod);

    }
}

