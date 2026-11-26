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

public class BotManagedRule extends AbstractModel {

    /**
    * Handling method after the trigger rule is triggered. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>monitor: observation.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Rule ID. Output only.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * Rule ID to allow. By default, no rule is allowed.
    */
    @SerializedName("TransManagedIds")
    @Expose
    private Long [] TransManagedIds;

    /**
    * Rule ID of the JS challenge. By default, no JS challenge is configured for all rules.
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
    * Rule ID to observe. By default, no rule is configured for observation.
    */
    @SerializedName("MonManagedIds")
    @Expose
    private Long [] MonManagedIds;

    /**
    * Rule ID to intercept. By default, no rule is intercepted.
    */
    @SerializedName("DropManagedIds")
    @Expose
    private Long [] DropManagedIds;

    /**
     * Get Handling method after the trigger rule is triggered. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>monitor: observation.</li> 
     * @return Action Handling method after the trigger rule is triggered. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>monitor: observation.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Handling method after the trigger rule is triggered. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>monitor: observation.</li>
     * @param Action Handling method after the trigger rule is triggered. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>monitor: observation.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
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
     * Get Rule ID to allow. By default, no rule is allowed. 
     * @return TransManagedIds Rule ID to allow. By default, no rule is allowed.
     */
    public Long [] getTransManagedIds() {
        return this.TransManagedIds;
    }

    /**
     * Set Rule ID to allow. By default, no rule is allowed.
     * @param TransManagedIds Rule ID to allow. By default, no rule is allowed.
     */
    public void setTransManagedIds(Long [] TransManagedIds) {
        this.TransManagedIds = TransManagedIds;
    }

    /**
     * Get Rule ID of the JS challenge. By default, no JS challenge is configured for all rules. 
     * @return AlgManagedIds Rule ID of the JS challenge. By default, no JS challenge is configured for all rules.
     */
    public Long [] getAlgManagedIds() {
        return this.AlgManagedIds;
    }

    /**
     * Set Rule ID of the JS challenge. By default, no JS challenge is configured for all rules.
     * @param AlgManagedIds Rule ID of the JS challenge. By default, no JS challenge is configured for all rules.
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
     * Get Rule ID to observe. By default, no rule is configured for observation. 
     * @return MonManagedIds Rule ID to observe. By default, no rule is configured for observation.
     */
    public Long [] getMonManagedIds() {
        return this.MonManagedIds;
    }

    /**
     * Set Rule ID to observe. By default, no rule is configured for observation.
     * @param MonManagedIds Rule ID to observe. By default, no rule is configured for observation.
     */
    public void setMonManagedIds(Long [] MonManagedIds) {
        this.MonManagedIds = MonManagedIds;
    }

    /**
     * Get Rule ID to intercept. By default, no rule is intercepted. 
     * @return DropManagedIds Rule ID to intercept. By default, no rule is intercepted.
     */
    public Long [] getDropManagedIds() {
        return this.DropManagedIds;
    }

    /**
     * Set Rule ID to intercept. By default, no rule is intercepted.
     * @param DropManagedIds Rule ID to intercept. By default, no rule is intercepted.
     */
    public void setDropManagedIds(Long [] DropManagedIds) {
        this.DropManagedIds = DropManagedIds;
    }

    public BotManagedRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagedRule(BotManagedRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.TransManagedIds != null) {
            this.TransManagedIds = new Long[source.TransManagedIds.length];
            for (int i = 0; i < source.TransManagedIds.length; i++) {
                this.TransManagedIds[i] = new Long(source.TransManagedIds[i]);
            }
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
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "TransManagedIds.", this.TransManagedIds);
        this.setParamArraySimple(map, prefix + "AlgManagedIds.", this.AlgManagedIds);
        this.setParamArraySimple(map, prefix + "CapManagedIds.", this.CapManagedIds);
        this.setParamArraySimple(map, prefix + "MonManagedIds.", this.MonManagedIds);
        this.setParamArraySimple(map, prefix + "DropManagedIds.", this.DropManagedIds);

    }
}

