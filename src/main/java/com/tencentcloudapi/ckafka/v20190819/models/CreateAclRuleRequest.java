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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAclRuleRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ACL resource type. Currently, the only valid value is `Topic`.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Matching type. Valid values: `PREFIXED`(match by prefix), `PRESET` (match by preset policy).
    */
    @SerializedName("PatternType")
    @Expose
    private String PatternType;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * ACL rule list
    */
    @SerializedName("RuleList")
    @Expose
    private AclRuleInfo [] RuleList;

    /**
    * Prefix value for prefix match
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * A parameter used to specify whether the preset ACL rule is applied to new topics
    */
    @SerializedName("IsApplied")
    @Expose
    private Long IsApplied;

    /**
    * Remarks for ACL rules
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ACL resource type. Currently, the only valid value is `Topic`. 
     * @return ResourceType ACL resource type. Currently, the only valid value is `Topic`.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set ACL resource type. Currently, the only valid value is `Topic`.
     * @param ResourceType ACL resource type. Currently, the only valid value is `Topic`.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Matching type. Valid values: `PREFIXED`(match by prefix), `PRESET` (match by preset policy). 
     * @return PatternType Matching type. Valid values: `PREFIXED`(match by prefix), `PRESET` (match by preset policy).
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set Matching type. Valid values: `PREFIXED`(match by prefix), `PRESET` (match by preset policy).
     * @param PatternType Matching type. Valid values: `PREFIXED`(match by prefix), `PRESET` (match by preset policy).
     */
    public void setPatternType(String PatternType) {
        this.PatternType = PatternType;
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
     * Get ACL rule list 
     * @return RuleList ACL rule list
     */
    public AclRuleInfo [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set ACL rule list
     * @param RuleList ACL rule list
     */
    public void setRuleList(AclRuleInfo [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * Get Prefix value for prefix match 
     * @return Pattern Prefix value for prefix match
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Prefix value for prefix match
     * @param Pattern Prefix value for prefix match
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get A parameter used to specify whether the preset ACL rule is applied to new topics 
     * @return IsApplied A parameter used to specify whether the preset ACL rule is applied to new topics
     */
    public Long getIsApplied() {
        return this.IsApplied;
    }

    /**
     * Set A parameter used to specify whether the preset ACL rule is applied to new topics
     * @param IsApplied A parameter used to specify whether the preset ACL rule is applied to new topics
     */
    public void setIsApplied(Long IsApplied) {
        this.IsApplied = IsApplied;
    }

    /**
     * Get Remarks for ACL rules 
     * @return Comment Remarks for ACL rules
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Remarks for ACL rules
     * @param Comment Remarks for ACL rules
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAclRuleRequest(CreateAclRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.PatternType != null) {
            this.PatternType = new String(source.PatternType);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleList != null) {
            this.RuleList = new AclRuleInfo[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new AclRuleInfo(source.RuleList[i]);
            }
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.IsApplied != null) {
            this.IsApplied = new Long(source.IsApplied);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "PatternType", this.PatternType);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "IsApplied", this.IsApplied);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

