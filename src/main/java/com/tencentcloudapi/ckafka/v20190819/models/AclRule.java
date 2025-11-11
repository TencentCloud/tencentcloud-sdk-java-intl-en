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

public class AclRule extends AbstractModel {

    /**
    * ACL rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * The ckafka cluster instance Id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ACL rule-based matching type. currently only supports prefix match. valid values: PREFIXED.
    */
    @SerializedName("PatternType")
    @Expose
    private String PatternType;

    /**
    * Indicates the prefix value for prefix match.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Acl resource type, currently only support Topic. valid values: Topic.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Specifies the ACL information contained in the rule.
    */
    @SerializedName("AclList")
    @Expose
    private String AclList;

    /**
    * Specifies the time when the rule was created.
    */
    @SerializedName("CreateTimeStamp")
    @Expose
    private String CreateTimeStamp;

    /**
    * Specifies whether to apply the preset ACL rule to newly-added topics.
    */
    @SerializedName("IsApplied")
    @Expose
    private Long IsApplied;

    /**
    * Rule update time.
    */
    @SerializedName("UpdateTimeStamp")
    @Expose
    private String UpdateTimeStamp;

    /**
    * Specifies the remark of the rule.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * One of the displayed corresponding TopicName.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Number of topics to which the ACL rule is applied.
    */
    @SerializedName("TopicCount")
    @Expose
    private Long TopicCount;

    /**
    * Specifies the pattern type.
    */
    @SerializedName("PatternTypeTitle")
    @Expose
    private String PatternTypeTitle;

    /**
     * Get ACL rule name. 
     * @return RuleName ACL rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set ACL rule name.
     * @param RuleName ACL rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get The ckafka cluster instance Id. 
     * @return InstanceId The ckafka cluster instance Id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id.
     * @param InstanceId The ckafka cluster instance Id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ACL rule-based matching type. currently only supports prefix match. valid values: PREFIXED. 
     * @return PatternType ACL rule-based matching type. currently only supports prefix match. valid values: PREFIXED.
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set ACL rule-based matching type. currently only supports prefix match. valid values: PREFIXED.
     * @param PatternType ACL rule-based matching type. currently only supports prefix match. valid values: PREFIXED.
     */
    public void setPatternType(String PatternType) {
        this.PatternType = PatternType;
    }

    /**
     * Get Indicates the prefix value for prefix match. 
     * @return Pattern Indicates the prefix value for prefix match.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Indicates the prefix value for prefix match.
     * @param Pattern Indicates the prefix value for prefix match.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Acl resource type, currently only support Topic. valid values: Topic. 
     * @return ResourceType Acl resource type, currently only support Topic. valid values: Topic.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Acl resource type, currently only support Topic. valid values: Topic.
     * @param ResourceType Acl resource type, currently only support Topic. valid values: Topic.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Specifies the ACL information contained in the rule. 
     * @return AclList Specifies the ACL information contained in the rule.
     */
    public String getAclList() {
        return this.AclList;
    }

    /**
     * Set Specifies the ACL information contained in the rule.
     * @param AclList Specifies the ACL information contained in the rule.
     */
    public void setAclList(String AclList) {
        this.AclList = AclList;
    }

    /**
     * Get Specifies the time when the rule was created. 
     * @return CreateTimeStamp Specifies the time when the rule was created.
     */
    public String getCreateTimeStamp() {
        return this.CreateTimeStamp;
    }

    /**
     * Set Specifies the time when the rule was created.
     * @param CreateTimeStamp Specifies the time when the rule was created.
     */
    public void setCreateTimeStamp(String CreateTimeStamp) {
        this.CreateTimeStamp = CreateTimeStamp;
    }

    /**
     * Get Specifies whether to apply the preset ACL rule to newly-added topics. 
     * @return IsApplied Specifies whether to apply the preset ACL rule to newly-added topics.
     */
    public Long getIsApplied() {
        return this.IsApplied;
    }

    /**
     * Set Specifies whether to apply the preset ACL rule to newly-added topics.
     * @param IsApplied Specifies whether to apply the preset ACL rule to newly-added topics.
     */
    public void setIsApplied(Long IsApplied) {
        this.IsApplied = IsApplied;
    }

    /**
     * Get Rule update time. 
     * @return UpdateTimeStamp Rule update time.
     */
    public String getUpdateTimeStamp() {
        return this.UpdateTimeStamp;
    }

    /**
     * Set Rule update time.
     * @param UpdateTimeStamp Rule update time.
     */
    public void setUpdateTimeStamp(String UpdateTimeStamp) {
        this.UpdateTimeStamp = UpdateTimeStamp;
    }

    /**
     * Get Specifies the remark of the rule. 
     * @return Comment Specifies the remark of the rule.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Specifies the remark of the rule.
     * @param Comment Specifies the remark of the rule.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get One of the displayed corresponding TopicName. 
     * @return TopicName One of the displayed corresponding TopicName.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set One of the displayed corresponding TopicName.
     * @param TopicName One of the displayed corresponding TopicName.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Number of topics to which the ACL rule is applied. 
     * @return TopicCount Number of topics to which the ACL rule is applied.
     */
    public Long getTopicCount() {
        return this.TopicCount;
    }

    /**
     * Set Number of topics to which the ACL rule is applied.
     * @param TopicCount Number of topics to which the ACL rule is applied.
     */
    public void setTopicCount(Long TopicCount) {
        this.TopicCount = TopicCount;
    }

    /**
     * Get Specifies the pattern type. 
     * @return PatternTypeTitle Specifies the pattern type.
     */
    public String getPatternTypeTitle() {
        return this.PatternTypeTitle;
    }

    /**
     * Set Specifies the pattern type.
     * @param PatternTypeTitle Specifies the pattern type.
     */
    public void setPatternTypeTitle(String PatternTypeTitle) {
        this.PatternTypeTitle = PatternTypeTitle;
    }

    public AclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclRule(AclRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PatternType != null) {
            this.PatternType = new String(source.PatternType);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.AclList != null) {
            this.AclList = new String(source.AclList);
        }
        if (source.CreateTimeStamp != null) {
            this.CreateTimeStamp = new String(source.CreateTimeStamp);
        }
        if (source.IsApplied != null) {
            this.IsApplied = new Long(source.IsApplied);
        }
        if (source.UpdateTimeStamp != null) {
            this.UpdateTimeStamp = new String(source.UpdateTimeStamp);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicCount != null) {
            this.TopicCount = new Long(source.TopicCount);
        }
        if (source.PatternTypeTitle != null) {
            this.PatternTypeTitle = new String(source.PatternTypeTitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PatternType", this.PatternType);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "AclList", this.AclList);
        this.setParamSimple(map, prefix + "CreateTimeStamp", this.CreateTimeStamp);
        this.setParamSimple(map, prefix + "IsApplied", this.IsApplied);
        this.setParamSimple(map, prefix + "UpdateTimeStamp", this.UpdateTimeStamp);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicCount", this.TopicCount);
        this.setParamSimple(map, prefix + "PatternTypeTitle", this.PatternTypeTitle);

    }
}

