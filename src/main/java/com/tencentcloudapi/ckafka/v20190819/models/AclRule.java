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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclRule extends AbstractModel {

    /**
    * ACL rule name.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Instance ID.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Matching type. Currently, only prefix match is supported. Enumerated value list: PREFIXED
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("PatternType")
    @Expose
    private String PatternType;

    /**
    * Prefix value for prefix match.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * ACL resource type. Only “Topic” is supported. Enumerated value list: Topic.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * ACL information contained in the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("AclList")
    @Expose
    private String AclList;

    /**
    * Creation time of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTimeStamp")
    @Expose
    private String CreateTimeStamp;

    /**
    * A parameter used to specify whether the preset ACL rule is applied to new topics.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("IsApplied")
    @Expose
    private Long IsApplied;

    /**
    * Rule update time.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTimeStamp")
    @Expose
    private String UpdateTimeStamp;

    /**
    * Remarks of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * One of the corresponding topic names that is displayed.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * The number of topics that apply this ACL rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicCount")
    @Expose
    private Long TopicCount;

    /**
    * Name of rule type.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PatternTypeTitle")
    @Expose
    private String PatternTypeTitle;

    /**
     * Get ACL rule name.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return RuleName ACL rule name.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set ACL rule name.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param RuleName ACL rule name.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Instance ID.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Matching type. Currently, only prefix match is supported. Enumerated value list: PREFIXED
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return PatternType Matching type. Currently, only prefix match is supported. Enumerated value list: PREFIXED
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set Matching type. Currently, only prefix match is supported. Enumerated value list: PREFIXED
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param PatternType Matching type. Currently, only prefix match is supported. Enumerated value list: PREFIXED
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setPatternType(String PatternType) {
        this.PatternType = PatternType;
    }

    /**
     * Get Prefix value for prefix match.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Pattern Prefix value for prefix match.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Prefix value for prefix match.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Pattern Prefix value for prefix match.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get ACL resource type. Only “Topic” is supported. Enumerated value list: Topic.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ResourceType ACL resource type. Only “Topic” is supported. Enumerated value list: Topic.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set ACL resource type. Only “Topic” is supported. Enumerated value list: Topic.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ResourceType ACL resource type. Only “Topic” is supported. Enumerated value list: Topic.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get ACL information contained in the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return AclList ACL information contained in the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getAclList() {
        return this.AclList;
    }

    /**
     * Set ACL information contained in the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param AclList ACL information contained in the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setAclList(String AclList) {
        this.AclList = AclList;
    }

    /**
     * Get Creation time of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return CreateTimeStamp Creation time of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getCreateTimeStamp() {
        return this.CreateTimeStamp;
    }

    /**
     * Set Creation time of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param CreateTimeStamp Creation time of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setCreateTimeStamp(String CreateTimeStamp) {
        this.CreateTimeStamp = CreateTimeStamp;
    }

    /**
     * Get A parameter used to specify whether the preset ACL rule is applied to new topics.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return IsApplied A parameter used to specify whether the preset ACL rule is applied to new topics.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getIsApplied() {
        return this.IsApplied;
    }

    /**
     * Set A parameter used to specify whether the preset ACL rule is applied to new topics.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param IsApplied A parameter used to specify whether the preset ACL rule is applied to new topics.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setIsApplied(Long IsApplied) {
        this.IsApplied = IsApplied;
    }

    /**
     * Get Rule update time.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return UpdateTimeStamp Rule update time.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getUpdateTimeStamp() {
        return this.UpdateTimeStamp;
    }

    /**
     * Set Rule update time.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param UpdateTimeStamp Rule update time.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setUpdateTimeStamp(String UpdateTimeStamp) {
        this.UpdateTimeStamp = UpdateTimeStamp;
    }

    /**
     * Get Remarks of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Comment Remarks of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Remarks of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Comment Remarks of the rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get One of the corresponding topic names that is displayed.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TopicName One of the corresponding topic names that is displayed.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set One of the corresponding topic names that is displayed.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TopicName One of the corresponding topic names that is displayed.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get The number of topics that apply this ACL rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TopicCount The number of topics that apply this ACL rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getTopicCount() {
        return this.TopicCount;
    }

    /**
     * Set The number of topics that apply this ACL rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TopicCount The number of topics that apply this ACL rule.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTopicCount(Long TopicCount) {
        this.TopicCount = TopicCount;
    }

    /**
     * Get Name of rule type.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PatternTypeTitle Name of rule type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPatternTypeTitle() {
        return this.PatternTypeTitle;
    }

    /**
     * Set Name of rule type.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PatternTypeTitle Name of rule type.
Note: this field may return `null`, indicating that no valid values can be obtained.
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

