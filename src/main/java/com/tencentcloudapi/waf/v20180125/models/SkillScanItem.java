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

public class SkillScanItem extends AbstractModel {

    /**
    * <p>Sub-engine type: AI (AI analysis) / STATIC (static analysis)</p>
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * <p>List of rules hit by this engine</p>
    */
    @SerializedName("RuleList")
    @Expose
    private SkillScanRuleHit [] RuleList;

    /**
     * Get <p>Sub-engine type: AI (AI analysis) / STATIC (static analysis)</p> 
     * @return ScanType <p>Sub-engine type: AI (AI analysis) / STATIC (static analysis)</p>
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>Sub-engine type: AI (AI analysis) / STATIC (static analysis)</p>
     * @param ScanType <p>Sub-engine type: AI (AI analysis) / STATIC (static analysis)</p>
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>List of rules hit by this engine</p> 
     * @return RuleList <p>List of rules hit by this engine</p>
     */
    public SkillScanRuleHit [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set <p>List of rules hit by this engine</p>
     * @param RuleList <p>List of rules hit by this engine</p>
     */
    public void setRuleList(SkillScanRuleHit [] RuleList) {
        this.RuleList = RuleList;
    }

    public SkillScanItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanItem(SkillScanItem source) {
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.RuleList != null) {
            this.RuleList = new SkillScanRuleHit[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new SkillScanRuleHit(source.RuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);

    }
}

