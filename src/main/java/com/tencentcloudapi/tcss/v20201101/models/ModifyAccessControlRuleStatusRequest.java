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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccessControlRuleStatusRequest extends AbstractModel {

    /**
    * Policy IDs
    */
    @SerializedName("RuleIdSet")
    @Expose
    private String [] RuleIdSet;

    /**
    * Policy switch. Valid values: `true` (on); `false` (off).
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
     * Get Policy IDs 
     * @return RuleIdSet Policy IDs
     */
    public String [] getRuleIdSet() {
        return this.RuleIdSet;
    }

    /**
     * Set Policy IDs
     * @param RuleIdSet Policy IDs
     */
    public void setRuleIdSet(String [] RuleIdSet) {
        this.RuleIdSet = RuleIdSet;
    }

    /**
     * Get Policy switch. Valid values: `true` (on); `false` (off). 
     * @return IsEnable Policy switch. Valid values: `true` (on); `false` (off).
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Policy switch. Valid values: `true` (on); `false` (off).
     * @param IsEnable Policy switch. Valid values: `true` (on); `false` (off).
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    public ModifyAccessControlRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccessControlRuleStatusRequest(ModifyAccessControlRuleStatusRequest source) {
        if (source.RuleIdSet != null) {
            this.RuleIdSet = new String[source.RuleIdSet.length];
            for (int i = 0; i < source.RuleIdSet.length; i++) {
                this.RuleIdSet[i] = new String(source.RuleIdSet[i]);
            }
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleIdSet.", this.RuleIdSet);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);

    }
}

