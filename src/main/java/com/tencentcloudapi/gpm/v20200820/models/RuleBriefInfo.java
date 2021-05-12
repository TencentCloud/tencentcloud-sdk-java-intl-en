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

public class RuleBriefInfo extends AbstractModel{

    /**
    * Rule name. It supports [a-zA-Z\d-\.]*.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * The associated match
    */
    @SerializedName("MatchCodeList")
    @Expose
    private StringKV [] MatchCodeList;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * RuleCode
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
     * Get Rule name. It supports [a-zA-Z\d-\.]*. 
     * @return RuleName Rule name. It supports [a-zA-Z\d-\.]*.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. It supports [a-zA-Z\d-\.]*.
     * @param RuleName Rule name. It supports [a-zA-Z\d-\.]*.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get The associated match 
     * @return MatchCodeList The associated match
     */
    public StringKV [] getMatchCodeList() {
        return this.MatchCodeList;
    }

    /**
     * Set The associated match
     * @param MatchCodeList The associated match
     */
    public void setMatchCodeList(StringKV [] MatchCodeList) {
        this.MatchCodeList = MatchCodeList;
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

    public RuleBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleBriefInfo(RuleBriefInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MatchCodeList != null) {
            this.MatchCodeList = new StringKV[source.MatchCodeList.length];
            for (int i = 0; i < source.MatchCodeList.length; i++) {
                this.MatchCodeList[i] = new StringKV(source.MatchCodeList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "MatchCodeList.", this.MatchCodeList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);

    }
}

