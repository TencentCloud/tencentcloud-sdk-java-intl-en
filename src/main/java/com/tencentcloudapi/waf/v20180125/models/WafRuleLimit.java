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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafRuleLimit extends AbstractModel {

    /**
    * Specifications of Custom CC
    */
    @SerializedName("CC")
    @Expose
    private Long CC;

    /**
    * Specifications for Custom Policy
    */
    @SerializedName("CustomRule")
    @Expose
    private Long CustomRule;

    /**
    * Specifications for Blocklist/Allowlist
    */
    @SerializedName("IPControl")
    @Expose
    private Long IPControl;

    /**
    * Specifications for Information Leakage Prevention
    */
    @SerializedName("AntiLeak")
    @Expose
    private Long AntiLeak;

    /**
    * Tamper-proof Specifications
    */
    @SerializedName("AntiTamper")
    @Expose
    private Long AntiTamper;

    /**
    * Specifications for Urgent CC
    */
    @SerializedName("AutoCC")
    @Expose
    private Long AutoCC;

    /**
    * Specifications for Region Banning
    */
    @SerializedName("AreaBan")
    @Expose
    private Long AreaBan;

    /**
    * Configure Session in Custom CC
    */
    @SerializedName("CCSession")
    @Expose
    private Long CCSession;

    /**
    * AI Specifications
    */
    @SerializedName("AI")
    @Expose
    private Long AI;

    /**
    * Specifications of Precision Allowlist
    */
    @SerializedName("CustomWhite")
    @Expose
    private Long CustomWhite;

    /**
    * API Security Specification
    */
    @SerializedName("ApiSecurity")
    @Expose
    private Long ApiSecurity;

    /**
    * Specifications for client traffic flag
    */
    @SerializedName("ClientMsg")
    @Expose
    private Long ClientMsg;

    /**
    * Specifications for Traffic Tagging
    */
    @SerializedName("TrafficMarking")
    @Expose
    private Long TrafficMarking;

    /**
     * Get Specifications of Custom CC 
     * @return CC Specifications of Custom CC
     */
    public Long getCC() {
        return this.CC;
    }

    /**
     * Set Specifications of Custom CC
     * @param CC Specifications of Custom CC
     */
    public void setCC(Long CC) {
        this.CC = CC;
    }

    /**
     * Get Specifications for Custom Policy 
     * @return CustomRule Specifications for Custom Policy
     */
    public Long getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set Specifications for Custom Policy
     * @param CustomRule Specifications for Custom Policy
     */
    public void setCustomRule(Long CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get Specifications for Blocklist/Allowlist 
     * @return IPControl Specifications for Blocklist/Allowlist
     */
    public Long getIPControl() {
        return this.IPControl;
    }

    /**
     * Set Specifications for Blocklist/Allowlist
     * @param IPControl Specifications for Blocklist/Allowlist
     */
    public void setIPControl(Long IPControl) {
        this.IPControl = IPControl;
    }

    /**
     * Get Specifications for Information Leakage Prevention 
     * @return AntiLeak Specifications for Information Leakage Prevention
     */
    public Long getAntiLeak() {
        return this.AntiLeak;
    }

    /**
     * Set Specifications for Information Leakage Prevention
     * @param AntiLeak Specifications for Information Leakage Prevention
     */
    public void setAntiLeak(Long AntiLeak) {
        this.AntiLeak = AntiLeak;
    }

    /**
     * Get Tamper-proof Specifications 
     * @return AntiTamper Tamper-proof Specifications
     */
    public Long getAntiTamper() {
        return this.AntiTamper;
    }

    /**
     * Set Tamper-proof Specifications
     * @param AntiTamper Tamper-proof Specifications
     */
    public void setAntiTamper(Long AntiTamper) {
        this.AntiTamper = AntiTamper;
    }

    /**
     * Get Specifications for Urgent CC 
     * @return AutoCC Specifications for Urgent CC
     */
    public Long getAutoCC() {
        return this.AutoCC;
    }

    /**
     * Set Specifications for Urgent CC
     * @param AutoCC Specifications for Urgent CC
     */
    public void setAutoCC(Long AutoCC) {
        this.AutoCC = AutoCC;
    }

    /**
     * Get Specifications for Region Banning 
     * @return AreaBan Specifications for Region Banning
     */
    public Long getAreaBan() {
        return this.AreaBan;
    }

    /**
     * Set Specifications for Region Banning
     * @param AreaBan Specifications for Region Banning
     */
    public void setAreaBan(Long AreaBan) {
        this.AreaBan = AreaBan;
    }

    /**
     * Get Configure Session in Custom CC 
     * @return CCSession Configure Session in Custom CC
     */
    public Long getCCSession() {
        return this.CCSession;
    }

    /**
     * Set Configure Session in Custom CC
     * @param CCSession Configure Session in Custom CC
     */
    public void setCCSession(Long CCSession) {
        this.CCSession = CCSession;
    }

    /**
     * Get AI Specifications 
     * @return AI AI Specifications
     */
    public Long getAI() {
        return this.AI;
    }

    /**
     * Set AI Specifications
     * @param AI AI Specifications
     */
    public void setAI(Long AI) {
        this.AI = AI;
    }

    /**
     * Get Specifications of Precision Allowlist 
     * @return CustomWhite Specifications of Precision Allowlist
     */
    public Long getCustomWhite() {
        return this.CustomWhite;
    }

    /**
     * Set Specifications of Precision Allowlist
     * @param CustomWhite Specifications of Precision Allowlist
     */
    public void setCustomWhite(Long CustomWhite) {
        this.CustomWhite = CustomWhite;
    }

    /**
     * Get API Security Specification 
     * @return ApiSecurity API Security Specification
     */
    public Long getApiSecurity() {
        return this.ApiSecurity;
    }

    /**
     * Set API Security Specification
     * @param ApiSecurity API Security Specification
     */
    public void setApiSecurity(Long ApiSecurity) {
        this.ApiSecurity = ApiSecurity;
    }

    /**
     * Get Specifications for client traffic flag 
     * @return ClientMsg Specifications for client traffic flag
     */
    public Long getClientMsg() {
        return this.ClientMsg;
    }

    /**
     * Set Specifications for client traffic flag
     * @param ClientMsg Specifications for client traffic flag
     */
    public void setClientMsg(Long ClientMsg) {
        this.ClientMsg = ClientMsg;
    }

    /**
     * Get Specifications for Traffic Tagging 
     * @return TrafficMarking Specifications for Traffic Tagging
     */
    public Long getTrafficMarking() {
        return this.TrafficMarking;
    }

    /**
     * Set Specifications for Traffic Tagging
     * @param TrafficMarking Specifications for Traffic Tagging
     */
    public void setTrafficMarking(Long TrafficMarking) {
        this.TrafficMarking = TrafficMarking;
    }

    public WafRuleLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafRuleLimit(WafRuleLimit source) {
        if (source.CC != null) {
            this.CC = new Long(source.CC);
        }
        if (source.CustomRule != null) {
            this.CustomRule = new Long(source.CustomRule);
        }
        if (source.IPControl != null) {
            this.IPControl = new Long(source.IPControl);
        }
        if (source.AntiLeak != null) {
            this.AntiLeak = new Long(source.AntiLeak);
        }
        if (source.AntiTamper != null) {
            this.AntiTamper = new Long(source.AntiTamper);
        }
        if (source.AutoCC != null) {
            this.AutoCC = new Long(source.AutoCC);
        }
        if (source.AreaBan != null) {
            this.AreaBan = new Long(source.AreaBan);
        }
        if (source.CCSession != null) {
            this.CCSession = new Long(source.CCSession);
        }
        if (source.AI != null) {
            this.AI = new Long(source.AI);
        }
        if (source.CustomWhite != null) {
            this.CustomWhite = new Long(source.CustomWhite);
        }
        if (source.ApiSecurity != null) {
            this.ApiSecurity = new Long(source.ApiSecurity);
        }
        if (source.ClientMsg != null) {
            this.ClientMsg = new Long(source.ClientMsg);
        }
        if (source.TrafficMarking != null) {
            this.TrafficMarking = new Long(source.TrafficMarking);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CC", this.CC);
        this.setParamSimple(map, prefix + "CustomRule", this.CustomRule);
        this.setParamSimple(map, prefix + "IPControl", this.IPControl);
        this.setParamSimple(map, prefix + "AntiLeak", this.AntiLeak);
        this.setParamSimple(map, prefix + "AntiTamper", this.AntiTamper);
        this.setParamSimple(map, prefix + "AutoCC", this.AutoCC);
        this.setParamSimple(map, prefix + "AreaBan", this.AreaBan);
        this.setParamSimple(map, prefix + "CCSession", this.CCSession);
        this.setParamSimple(map, prefix + "AI", this.AI);
        this.setParamSimple(map, prefix + "CustomWhite", this.CustomWhite);
        this.setParamSimple(map, prefix + "ApiSecurity", this.ApiSecurity);
        this.setParamSimple(map, prefix + "ClientMsg", this.ClientMsg);
        this.setParamSimple(map, prefix + "TrafficMarking", this.TrafficMarking);

    }
}

