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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiLeakageItem extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Status value
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Action
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Match condition
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Strategies")
    @Expose
    private DescribeAntiInfoLeakRulesStrategyItem [] Strategies;

    /**
    * Matched URL

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * Modification time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Status value 
     * @return Status Status value
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value
     * @param Status Status value
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Action 
     * @return Action Action
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action
     * @param Action Action
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Match condition
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Strategies Match condition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribeAntiInfoLeakRulesStrategyItem [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set Match condition
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Strategies Match condition
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategies(DescribeAntiInfoLeakRulesStrategyItem [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get Matched URL

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uri Matched URL

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set Matched URL

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uri Matched URL

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get Modification time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Modification time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Modification time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public DescribeAntiLeakageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiLeakageItem(DescribeAntiLeakageItem source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Strategies != null) {
            this.Strategies = new DescribeAntiInfoLeakRulesStrategyItem[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new DescribeAntiInfoLeakRulesStrategyItem(source.Strategies[i]);
            }
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

