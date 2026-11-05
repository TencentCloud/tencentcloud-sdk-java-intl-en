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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRuleGroupMeta extends AbstractModel {

    /**
    * Managed rule group description. For output usage only.
    */
    @SerializedName("GroupDetail")
    @Expose
    private String GroupDetail;

    /**
    * Managed rule group name. Output parameter only.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Rule information of all sub-rules in the current managed rule group. Output parameter only.
    */
    @SerializedName("RuleDetails")
    @Expose
    private ManagedRuleDetail [] RuleDetails;

    /**
     * Get Managed rule group description. For output usage only. 
     * @return GroupDetail Managed rule group description. For output usage only.
     */
    public String getGroupDetail() {
        return this.GroupDetail;
    }

    /**
     * Set Managed rule group description. For output usage only.
     * @param GroupDetail Managed rule group description. For output usage only.
     */
    public void setGroupDetail(String GroupDetail) {
        this.GroupDetail = GroupDetail;
    }

    /**
     * Get Managed rule group name. Output parameter only. 
     * @return GroupName Managed rule group name. Output parameter only.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Managed rule group name. Output parameter only.
     * @param GroupName Managed rule group name. Output parameter only.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Rule information of all sub-rules in the current managed rule group. Output parameter only. 
     * @return RuleDetails Rule information of all sub-rules in the current managed rule group. Output parameter only.
     */
    public ManagedRuleDetail [] getRuleDetails() {
        return this.RuleDetails;
    }

    /**
     * Set Rule information of all sub-rules in the current managed rule group. Output parameter only.
     * @param RuleDetails Rule information of all sub-rules in the current managed rule group. Output parameter only.
     */
    public void setRuleDetails(ManagedRuleDetail [] RuleDetails) {
        this.RuleDetails = RuleDetails;
    }

    public ManagedRuleGroupMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleGroupMeta(ManagedRuleGroupMeta source) {
        if (source.GroupDetail != null) {
            this.GroupDetail = new String(source.GroupDetail);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.RuleDetails != null) {
            this.RuleDetails = new ManagedRuleDetail[source.RuleDetails.length];
            for (int i = 0; i < source.RuleDetails.length; i++) {
                this.RuleDetails[i] = new ManagedRuleDetail(source.RuleDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupDetail", this.GroupDetail);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "RuleDetails.", this.RuleDetails);

    }
}

