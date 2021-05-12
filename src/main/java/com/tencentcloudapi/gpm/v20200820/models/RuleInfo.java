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

public class RuleInfo extends AbstractModel{

    /**
    * Rule name. It supports [a-zA-Z0-9-\.]*.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Rule description
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * Rule script
    */
    @SerializedName("RuleScript")
    @Expose
    private String RuleScript;

    /**
    * Tag
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

    /**
    * The associated match
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MatchCodeList")
    @Expose
    private StringKV [] MatchCodeList;

    /**
    * RuleCode
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
    * Region
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * User AppId
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User UIN
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * User OwnerUin
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
     * Get Rule name. It supports [a-zA-Z0-9-\.]*. 
     * @return RuleName Rule name. It supports [a-zA-Z0-9-\.]*.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. It supports [a-zA-Z0-9-\.]*.
     * @param RuleName Rule name. It supports [a-zA-Z0-9-\.]*.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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
     * Get Rule description
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return RuleDesc Rule description
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set Rule description
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param RuleDesc Rule description
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get Rule script 
     * @return RuleScript Rule script
     */
    public String getRuleScript() {
        return this.RuleScript;
    }

    /**
     * Set Rule script
     * @param RuleScript Rule script
     */
    public void setRuleScript(String RuleScript) {
        this.RuleScript = RuleScript;
    }

    /**
     * Get Tag
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Tags Tag
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Tags Tag
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The associated match
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MatchCodeList The associated match
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public StringKV [] getMatchCodeList() {
        return this.MatchCodeList;
    }

    /**
     * Set The associated match
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MatchCodeList The associated match
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMatchCodeList(StringKV [] MatchCodeList) {
        this.MatchCodeList = MatchCodeList;
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

    /**
     * Get Region
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Region Region
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Region Region
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get User AppId
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return AppId User AppId
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param AppId User AppId
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User UIN
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Uin User UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Uin User UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get User OwnerUin
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return CreateUin User OwnerUin
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set User OwnerUin
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param CreateUin User OwnerUin
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    public RuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInfo(RuleInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.RuleScript != null) {
            this.RuleScript = new String(source.RuleScript);
        }
        if (source.Tags != null) {
            this.Tags = new StringKV[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKV(source.Tags[i]);
            }
        }
        if (source.MatchCodeList != null) {
            this.MatchCodeList = new StringKV[source.MatchCodeList.length];
            for (int i = 0; i < source.MatchCodeList.length; i++) {
                this.MatchCodeList[i] = new StringKV(source.MatchCodeList[i]);
            }
        }
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "RuleScript", this.RuleScript);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "MatchCodeList.", this.MatchCodeList);
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);

    }
}

