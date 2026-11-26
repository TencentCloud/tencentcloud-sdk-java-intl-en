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

public class BotPortraitRule extends AbstractModel {

    /**
    * Feature switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Rule ID. Output only.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Rule ID of the JS challenge. All rules have no JS challenge configured by default.
    */
    @SerializedName("AlgManagedIds")
    @Expose
    private Long [] AlgManagedIds;

    /**
    * Rule ID of the digit verification code. By default, no digit verification code is configured for all rules.
    */
    @SerializedName("CapManagedIds")
    @Expose
    private Long [] CapManagedIds;

    /**
    * Rule ID for observation. By default, no rule is configured for observation.
    */
    @SerializedName("MonManagedIds")
    @Expose
    private Long [] MonManagedIds;

    /**
    * Rule ID for interception. By default, no interception is configured for all rules.
    */
    @SerializedName("DropManagedIds")
    @Expose
    private Long [] DropManagedIds;

    /**
     * Get Feature switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Feature switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Feature switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Feature switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Rule ID. Output only. 
     * @return RuleID Rule ID. Output only.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID. Output only.
     * @param RuleID Rule ID. Output only.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Rule ID of the JS challenge. All rules have no JS challenge configured by default. 
     * @return AlgManagedIds Rule ID of the JS challenge. All rules have no JS challenge configured by default.
     */
    public Long [] getAlgManagedIds() {
        return this.AlgManagedIds;
    }

    /**
     * Set Rule ID of the JS challenge. All rules have no JS challenge configured by default.
     * @param AlgManagedIds Rule ID of the JS challenge. All rules have no JS challenge configured by default.
     */
    public void setAlgManagedIds(Long [] AlgManagedIds) {
        this.AlgManagedIds = AlgManagedIds;
    }

    /**
     * Get Rule ID of the digit verification code. By default, no digit verification code is configured for all rules. 
     * @return CapManagedIds Rule ID of the digit verification code. By default, no digit verification code is configured for all rules.
     */
    public Long [] getCapManagedIds() {
        return this.CapManagedIds;
    }

    /**
     * Set Rule ID of the digit verification code. By default, no digit verification code is configured for all rules.
     * @param CapManagedIds Rule ID of the digit verification code. By default, no digit verification code is configured for all rules.
     */
    public void setCapManagedIds(Long [] CapManagedIds) {
        this.CapManagedIds = CapManagedIds;
    }

    /**
     * Get Rule ID for observation. By default, no rule is configured for observation. 
     * @return MonManagedIds Rule ID for observation. By default, no rule is configured for observation.
     */
    public Long [] getMonManagedIds() {
        return this.MonManagedIds;
    }

    /**
     * Set Rule ID for observation. By default, no rule is configured for observation.
     * @param MonManagedIds Rule ID for observation. By default, no rule is configured for observation.
     */
    public void setMonManagedIds(Long [] MonManagedIds) {
        this.MonManagedIds = MonManagedIds;
    }

    /**
     * Get Rule ID for interception. By default, no interception is configured for all rules. 
     * @return DropManagedIds Rule ID for interception. By default, no interception is configured for all rules.
     */
    public Long [] getDropManagedIds() {
        return this.DropManagedIds;
    }

    /**
     * Set Rule ID for interception. By default, no interception is configured for all rules.
     * @param DropManagedIds Rule ID for interception. By default, no interception is configured for all rules.
     */
    public void setDropManagedIds(Long [] DropManagedIds) {
        this.DropManagedIds = DropManagedIds;
    }

    public BotPortraitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotPortraitRule(BotPortraitRule source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.AlgManagedIds != null) {
            this.AlgManagedIds = new Long[source.AlgManagedIds.length];
            for (int i = 0; i < source.AlgManagedIds.length; i++) {
                this.AlgManagedIds[i] = new Long(source.AlgManagedIds[i]);
            }
        }
        if (source.CapManagedIds != null) {
            this.CapManagedIds = new Long[source.CapManagedIds.length];
            for (int i = 0; i < source.CapManagedIds.length; i++) {
                this.CapManagedIds[i] = new Long(source.CapManagedIds[i]);
            }
        }
        if (source.MonManagedIds != null) {
            this.MonManagedIds = new Long[source.MonManagedIds.length];
            for (int i = 0; i < source.MonManagedIds.length; i++) {
                this.MonManagedIds[i] = new Long(source.MonManagedIds[i]);
            }
        }
        if (source.DropManagedIds != null) {
            this.DropManagedIds = new Long[source.DropManagedIds.length];
            for (int i = 0; i < source.DropManagedIds.length; i++) {
                this.DropManagedIds[i] = new Long(source.DropManagedIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "AlgManagedIds.", this.AlgManagedIds);
        this.setParamArraySimple(map, prefix + "CapManagedIds.", this.CapManagedIds);
        this.setParamArraySimple(map, prefix + "MonManagedIds.", this.MonManagedIds);
        this.setParamArraySimple(map, prefix + "DropManagedIds.", this.DropManagedIds);

    }
}

