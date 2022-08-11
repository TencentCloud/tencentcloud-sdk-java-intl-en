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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotPortraitRule extends AbstractModel{

    /**
    * ID of the rule being applied
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AlgManagedIds")
    @Expose
    private Long [] AlgManagedIds;

    /**
    * ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CapManagedIds")
    @Expose
    private Long [] CapManagedIds;

    /**
    * ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("MonManagedIds")
    @Expose
    private Long [] MonManagedIds;

    /**
    * ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DropManagedIds")
    @Expose
    private Long [] DropManagedIds;

    /**
    * Feature switch
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get ID of the rule being applied
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleID ID of the rule being applied
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set ID of the rule being applied
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleID ID of the rule being applied
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AlgManagedIds ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getAlgManagedIds() {
        return this.AlgManagedIds;
    }

    /**
     * Set ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AlgManagedIds ID of the rule that is set to verify requests by JavaScript challenge
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAlgManagedIds(Long [] AlgManagedIds) {
        this.AlgManagedIds = AlgManagedIds;
    }

    /**
     * Get ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CapManagedIds ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getCapManagedIds() {
        return this.CapManagedIds;
    }

    /**
     * Set ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CapManagedIds ID of the rule that is set to verify requests by CAPTCHA
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCapManagedIds(Long [] CapManagedIds) {
        this.CapManagedIds = CapManagedIds;
    }

    /**
     * Get ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return MonManagedIds ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getMonManagedIds() {
        return this.MonManagedIds;
    }

    /**
     * Set ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param MonManagedIds ID of the rule that is set to observe requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMonManagedIds(Long [] MonManagedIds) {
        this.MonManagedIds = MonManagedIds;
    }

    /**
     * Get ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DropManagedIds ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long [] getDropManagedIds() {
        return this.DropManagedIds;
    }

    /**
     * Set ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DropManagedIds ID of the rule that is set to block requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDropManagedIds(Long [] DropManagedIds) {
        this.DropManagedIds = DropManagedIds;
    }

    /**
     * Get Feature switch
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Switch Feature switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Feature switch
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Switch Feature switch
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public BotPortraitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotPortraitRule(BotPortraitRule source) {
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
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArraySimple(map, prefix + "AlgManagedIds.", this.AlgManagedIds);
        this.setParamArraySimple(map, prefix + "CapManagedIds.", this.CapManagedIds);
        this.setParamArraySimple(map, prefix + "MonManagedIds.", this.MonManagedIds);
        this.setParamArraySimple(map, prefix + "DropManagedIds.", this.DropManagedIds);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

