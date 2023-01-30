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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyK8sApiAbnormalRuleStatusRequest extends AbstractModel{

    /**
    * Rule ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Status (true: Enable; false: Disable)
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get Rule ID 
     * @return RuleID Rule ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID
     * @param RuleID Rule ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Status (true: Enable; false: Disable) 
     * @return Status Status (true: Enable; false: Disable)
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Status (true: Enable; false: Disable)
     * @param Status Status (true: Enable; false: Disable)
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public ModifyK8sApiAbnormalRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyK8sApiAbnormalRuleStatusRequest(ModifyK8sApiAbnormalRuleStatusRequest source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

