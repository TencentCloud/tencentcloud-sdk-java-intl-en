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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemCompliancePack extends AbstractModel {

    /**
    * Compliance package ID.
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * Name
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Compliance package risk level 1: high-risk.
2: Medium-risk.
3: Low risk.
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Compliance package rule information.
    */
    @SerializedName("ConfigRules")
    @Expose
    private CompliancePackRuleForManage [] ConfigRules;

    /**
     * Get Compliance package ID. 
     * @return CompliancePackId Compliance package ID.
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set Compliance package ID.
     * @param CompliancePackId Compliance package ID.
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get Name 
     * @return CompliancePackName Name
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set Name
     * @param CompliancePackName Name
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Compliance package risk level 1: high-risk.
2: Medium-risk.
3: Low risk. 
     * @return RiskLevel Compliance package risk level 1: high-risk.
2: Medium-risk.
3: Low risk.
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Compliance package risk level 1: high-risk.
2: Medium-risk.
3: Low risk.
     * @param RiskLevel Compliance package risk level 1: high-risk.
2: Medium-risk.
3: Low risk.
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Compliance package rule information. 
     * @return ConfigRules Compliance package rule information.
     */
    public CompliancePackRuleForManage [] getConfigRules() {
        return this.ConfigRules;
    }

    /**
     * Set Compliance package rule information.
     * @param ConfigRules Compliance package rule information.
     */
    public void setConfigRules(CompliancePackRuleForManage [] ConfigRules) {
        this.ConfigRules = ConfigRules;
    }

    public SystemCompliancePack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemCompliancePack(SystemCompliancePack source) {
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ConfigRules != null) {
            this.ConfigRules = new CompliancePackRuleForManage[source.ConfigRules.length];
            for (int i = 0; i < source.ConfigRules.length; i++) {
                this.ConfigRules[i] = new CompliancePackRuleForManage(source.ConfigRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "ConfigRules.", this.ConfigRules);

    }
}

