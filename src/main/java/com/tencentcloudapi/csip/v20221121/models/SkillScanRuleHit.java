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

public class SkillScanRuleHit extends AbstractModel {

    /**
    * Fusion rule number (9xxxx) can be cross-referenced with RuleCatalog.
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Current description of the specific detection for the matched rule, including file location, behavioral features, risks, etc.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Fusion rule number (9xxxx) can be cross-referenced with RuleCatalog. 
     * @return RuleID Fusion rule number (9xxxx) can be cross-referenced with RuleCatalog.
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Fusion rule number (9xxxx) can be cross-referenced with RuleCatalog.
     * @param RuleID Fusion rule number (9xxxx) can be cross-referenced with RuleCatalog.
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Current description of the specific detection for the matched rule, including file location, behavioral features, risks, etc. 
     * @return Description Current description of the specific detection for the matched rule, including file location, behavioral features, risks, etc.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Current description of the specific detection for the matched rule, including file location, behavioral features, risks, etc.
     * @param Description Current description of the specific detection for the matched rule, including file location, behavioral features, risks, etc.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public SkillScanRuleHit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanRuleHit(SkillScanRuleHit source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

