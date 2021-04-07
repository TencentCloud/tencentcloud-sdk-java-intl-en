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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleRequest extends AbstractModel{

    /**
    * RuleCode
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
    * Rule name. It can only contain numbers, letters, ".", and "-".
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule description. Up to 1024 bytes are allowed.
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * Tag. It is an array of key-value structure. Up to 50 tags can be associated.
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

    /**
     * Get RuleCode 
     * @return RuleCode RuleCode
     */
    public String getRuleCode() {
        return this.RuleCode;
    }

    /**
     * Set RuleCode
     * @param RuleCode RuleCode
     */
    public void setRuleCode(String RuleCode) {
        this.RuleCode = RuleCode;
    }

    /**
     * Get Rule name. It can only contain numbers, letters, ".", and "-". 
     * @return RuleName Rule name. It can only contain numbers, letters, ".", and "-".
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. It can only contain numbers, letters, ".", and "-".
     * @param RuleName Rule name. It can only contain numbers, letters, ".", and "-".
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule description. Up to 1024 bytes are allowed. 
     * @return RuleDesc Rule description. Up to 1024 bytes are allowed.
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set Rule description. Up to 1024 bytes are allowed.
     * @param RuleDesc Rule description. Up to 1024 bytes are allowed.
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get Tag. It is an array of key-value structure. Up to 50 tags can be associated. 
     * @return Tags Tag. It is an array of key-value structure. Up to 50 tags can be associated.
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag. It is an array of key-value structure. Up to 50 tags can be associated.
     * @param Tags Tag. It is an array of key-value structure. Up to 50 tags can be associated.
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

