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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskRuleInfo extends AbstractModel {

    /**
    * Risk Check Item ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Cloud vendor name
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * risk name
    */
    @SerializedName("RiskTitle")
    @Expose
    private String RiskTitle;

    /**
    * Check type
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * Risk level
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Risk damage
    */
    @SerializedName("RiskInfluence")
    @Expose
    private String RiskInfluence;

    /**
    * Risk remediation guide report link
    */
    @SerializedName("RiskFixAdvance")
    @Expose
    private String RiskFixAdvance;

    /**
    * Boundary control
    */
    @SerializedName("DispositionType")
    @Expose
    private String DispositionType;

    /**
     * Get Risk Check Item ID 
     * @return RuleID Risk Check Item ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Risk Check Item ID
     * @param RuleID Risk Check Item ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Cloud vendor name 
     * @return Provider Cloud vendor name
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set Cloud vendor name
     * @param Provider Cloud vendor name
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get risk name 
     * @return RiskTitle risk name
     */
    public String getRiskTitle() {
        return this.RiskTitle;
    }

    /**
     * Set risk name
     * @param RiskTitle risk name
     */
    public void setRiskTitle(String RiskTitle) {
        this.RiskTitle = RiskTitle;
    }

    /**
     * Get Check type 
     * @return CheckType Check type
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set Check type
     * @param CheckType Check type
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get Risk level 
     * @return RiskLevel Risk level
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
     * @param RiskLevel Risk level
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Risk damage 
     * @return RiskInfluence Risk damage
     */
    public String getRiskInfluence() {
        return this.RiskInfluence;
    }

    /**
     * Set Risk damage
     * @param RiskInfluence Risk damage
     */
    public void setRiskInfluence(String RiskInfluence) {
        this.RiskInfluence = RiskInfluence;
    }

    /**
     * Get Risk remediation guide report link 
     * @return RiskFixAdvance Risk remediation guide report link
     */
    public String getRiskFixAdvance() {
        return this.RiskFixAdvance;
    }

    /**
     * Set Risk remediation guide report link
     * @param RiskFixAdvance Risk remediation guide report link
     */
    public void setRiskFixAdvance(String RiskFixAdvance) {
        this.RiskFixAdvance = RiskFixAdvance;
    }

    /**
     * Get Boundary control 
     * @return DispositionType Boundary control
     */
    public String getDispositionType() {
        return this.DispositionType;
    }

    /**
     * Set Boundary control
     * @param DispositionType Boundary control
     */
    public void setDispositionType(String DispositionType) {
        this.DispositionType = DispositionType;
    }

    public RiskRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskRuleInfo(RiskRuleInfo source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.RiskTitle != null) {
            this.RiskTitle = new String(source.RiskTitle);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskInfluence != null) {
            this.RiskInfluence = new String(source.RiskInfluence);
        }
        if (source.RiskFixAdvance != null) {
            this.RiskFixAdvance = new String(source.RiskFixAdvance);
        }
        if (source.DispositionType != null) {
            this.DispositionType = new String(source.DispositionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskInfluence", this.RiskInfluence);
        this.setParamSimple(map, prefix + "RiskFixAdvance", this.RiskFixAdvance);
        this.setParamSimple(map, prefix + "DispositionType", this.DispositionType);

    }
}

