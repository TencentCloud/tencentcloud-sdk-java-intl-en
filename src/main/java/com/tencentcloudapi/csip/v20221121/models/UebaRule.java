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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UebaRule extends AbstractModel {

    /**
    * Policy ID
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Policy type
System policy
custom policy
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * Policy level
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical
    */
    @SerializedName("RuleLevel")
    @Expose
    private Long RuleLevel;

    /**
    * Policy content
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * Policy switch
    */
    @SerializedName("RuleStatus")
    @Expose
    private Boolean RuleStatus;

    /**
    * Number of hits
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * Associated account Appid.
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * Multi-account, member ID
    */
    @SerializedName("MemberID")
    @Expose
    private String MemberID;

    /**
    * Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Nickname
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Custom rule specific content
    */
    @SerializedName("CustomRuleDetail")
    @Expose
    private UebaCustomRule CustomRuleDetail;

    /**
    * Cloud type
0 Tencent Cloud
aws:1
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
     * Get Policy ID 
     * @return RuleID Policy ID
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Policy ID
     * @param RuleID Policy ID
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Policy type
System policy
custom policy 
     * @return RuleType Policy type
System policy
custom policy
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Policy type
System policy
custom policy
     * @param RuleType Policy type
System policy
custom policy
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Policy level
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical 
     * @return RuleLevel Policy level
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical
     */
    public Long getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set Policy level
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical
     * @param RuleLevel Policy level
Prompt.
1: low
2: Medium risk
3: High risk
4: Critical
     */
    public void setRuleLevel(Long RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    /**
     * Get Policy content 
     * @return RuleContent Policy content
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set Policy content
     * @param RuleContent Policy content
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get Policy switch 
     * @return RuleStatus Policy switch
     */
    public Boolean getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set Policy switch
     * @param RuleStatus Policy switch
     */
    public void setRuleStatus(Boolean RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get Number of hits 
     * @return HitCount Number of hits
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set Number of hits
     * @param HitCount Number of hits
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get Associated account Appid. 
     * @return AppID Associated account Appid.
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set Associated account Appid.
     * @param AppID Associated account Appid.
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Multi-account, member ID 
     * @return MemberID Multi-account, member ID
     */
    public String getMemberID() {
        return this.MemberID;
    }

    /**
     * Set Multi-account, member ID
     * @param MemberID Multi-account, member ID
     */
    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    /**
     * Get Uin 
     * @return Uin Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Uin
     * @param Uin Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Nickname 
     * @return Nickname Nickname
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Nickname
     * @param Nickname Nickname
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Custom rule specific content 
     * @return CustomRuleDetail Custom rule specific content
     */
    public UebaCustomRule getCustomRuleDetail() {
        return this.CustomRuleDetail;
    }

    /**
     * Set Custom rule specific content
     * @param CustomRuleDetail Custom rule specific content
     */
    public void setCustomRuleDetail(UebaCustomRule CustomRuleDetail) {
        this.CustomRuleDetail = CustomRuleDetail;
    }

    /**
     * Get Cloud type
0 Tencent Cloud
aws:1 
     * @return CloudType Cloud type
0 Tencent Cloud
aws:1
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud type
0 Tencent Cloud
aws:1
     * @param CloudType Cloud type
0 Tencent Cloud
aws:1
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public UebaRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaRule(UebaRule source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.RuleLevel != null) {
            this.RuleLevel = new Long(source.RuleLevel);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new Boolean(source.RuleStatus);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.MemberID != null) {
            this.MemberID = new String(source.MemberID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.CustomRuleDetail != null) {
            this.CustomRuleDetail = new UebaCustomRule(source.CustomRuleDetail);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "MemberID", this.MemberID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamObj(map, prefix + "CustomRuleDetail.", this.CustomRuleDetail);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

