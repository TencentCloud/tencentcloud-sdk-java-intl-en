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

public class RiskRuleItem extends AbstractModel {

    /**
    * Risk Check Item ID
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

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
    * Instance Type Name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

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
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * Risk damage
    */
    @SerializedName("RiskInfluence")
    @Expose
    private String RiskInfluence;

    /**
     * Get Risk Check Item ID 
     * @return ItemId Risk Check Item ID
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set Risk Check Item ID
     * @param ItemId Risk Check Item ID
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
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
     * Get Instance Type Name 
     * @return InstanceName Instance Type Name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance Type Name
     * @param InstanceName Instance Type Name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * @return Severity Risk level
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set Risk level
     * @param Severity Risk level
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
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

    public RiskRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskRuleItem(RiskRuleItem source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RiskTitle != null) {
            this.RiskTitle = new String(source.RiskTitle);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.RiskInfluence != null) {
            this.RiskInfluence = new String(source.RiskInfluence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RiskTitle", this.RiskTitle);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "RiskInfluence", this.RiskInfluence);

    }
}

