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

public class DescribeAclRuleRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ACL rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * ACL rule matching type
    */
    @SerializedName("PatternType")
    @Expose
    private String PatternType;

    /**
    * Whether to read simplified ACL rules
    */
    @SerializedName("IsSimplified")
    @Expose
    private Boolean IsSimplified;

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
     * Get ACL rule name 
     * @return RuleName ACL rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set ACL rule name
     * @param RuleName ACL rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get ACL rule matching type 
     * @return PatternType ACL rule matching type
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set ACL rule matching type
     * @param PatternType ACL rule matching type
     */
    public void setPatternType(String PatternType) {
        this.PatternType = PatternType;
    }

    /**
     * Get Whether to read simplified ACL rules 
     * @return IsSimplified Whether to read simplified ACL rules
     */
    public Boolean getIsSimplified() {
        return this.IsSimplified;
    }

    /**
     * Set Whether to read simplified ACL rules
     * @param IsSimplified Whether to read simplified ACL rules
     */
    public void setIsSimplified(Boolean IsSimplified) {
        this.IsSimplified = IsSimplified;
    }

    public DescribeAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAclRuleRequest(DescribeAclRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.PatternType != null) {
            this.PatternType = new String(source.PatternType);
        }
        if (source.IsSimplified != null) {
            this.IsSimplified = new Boolean(source.IsSimplified);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "PatternType", this.PatternType);
        this.setParamSimple(map, prefix + "IsSimplified", this.IsSimplified);

    }
}

