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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotManagedRuleDetail extends AbstractModel{

    /**
    * The rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * The rule description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule type
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * The rule status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get The rule ID. 
     * @return RuleId The rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID.
     * @param RuleId The rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get The rule description. 
     * @return Description The rule description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The rule description.
     * @param Description The rule description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule type 
     * @return RuleTypeName Rule type
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set Rule type
     * @param RuleTypeName Rule type
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get The rule status. 
     * @return Status The rule status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The rule status.
     * @param Status The rule status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public BotManagedRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagedRuleDetail(BotManagedRuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

