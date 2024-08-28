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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineFileTamperRule extends AbstractModel {

    /**
    * Rule name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule Type. 0: System Rule; 1: User Rule
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * Rule
    */
    @SerializedName("Rule")
    @Expose
    private FileTamperRule [] Rule;

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Rule name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule Type. 0: System Rule; 1: User Rule 
     * @return RuleCategory Rule Type. 0: System Rule; 1: User Rule
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set Rule Type. 0: System Rule; 1: User Rule
     * @param RuleCategory Rule Type. 0: System Rule; 1: User Rule
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get Rule 
     * @return Rule Rule
     */
    public FileTamperRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set Rule
     * @param Rule Rule
     */
    public void setRule(FileTamperRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public MachineFileTamperRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineFileTamperRule(MachineFileTamperRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
        if (source.Rule != null) {
            this.Rule = new FileTamperRule[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new FileTamperRule(source.Rule[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

