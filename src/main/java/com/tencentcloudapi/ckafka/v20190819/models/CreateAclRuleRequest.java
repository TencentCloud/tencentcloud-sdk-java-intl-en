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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAclRuleRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
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
    * ACL rule-based matching type. currently supports prefix match and PRESET policy. valid values: PREFIXED/PRESET.
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
    * Indicates the prefix for prefix match. this parameter is required when PatternType value is PREFIXED.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Specifies whether to apply the preset ACL rule to newly-added topics. defaults to 0, which means no. a value of 1 means yes.
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
     * Get The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
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
     * Get ACL rule-based matching type. currently supports prefix match and PRESET policy. valid values: PREFIXED/PRESET. 
     * @return PatternType ACL rule-based matching type. currently supports prefix match and PRESET policy. valid values: PREFIXED/PRESET.
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set ACL rule-based matching type. currently supports prefix match and PRESET policy. valid values: PREFIXED/PRESET.
     * @param PatternType ACL rule-based matching type. currently supports prefix match and PRESET policy. valid values: PREFIXED/PRESET.
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
     * Get Indicates the prefix for prefix match. this parameter is required when PatternType value is PREFIXED. 
     * @return Pattern Indicates the prefix for prefix match. this parameter is required when PatternType value is PREFIXED.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Indicates the prefix for prefix match. this parameter is required when PatternType value is PREFIXED.
     * @param Pattern Indicates the prefix for prefix match. this parameter is required when PatternType value is PREFIXED.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Specifies whether to apply the preset ACL rule to newly-added topics. defaults to 0, which means no. a value of 1 means yes. 
     * @return IsApplied Specifies whether to apply the preset ACL rule to newly-added topics. defaults to 0, which means no. a value of 1 means yes.
     */
    public Long getIsApplied() {
        return this.IsApplied;
    }

    /**
     * Set Specifies whether to apply the preset ACL rule to newly-added topics. defaults to 0, which means no. a value of 1 means yes.
     * @param IsApplied Specifies whether to apply the preset ACL rule to newly-added topics. defaults to 0, which means no. a value of 1 means yes.
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

