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
    * The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
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
    * ACL rule-based matching type (PREFIXED: prefix match, PRESET: PRESET policy).
    */
    @SerializedName("PatternType")
    @Expose
    private String PatternType;

    /**
    * Specifies whether to read the simplified ACL rule. default value is false, which means not to read the simplified ACL rule.
    */
    @SerializedName("IsSimplified")
    @Expose
    private Boolean IsSimplified;

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
     * Get ACL rule-based matching type (PREFIXED: prefix match, PRESET: PRESET policy). 
     * @return PatternType ACL rule-based matching type (PREFIXED: prefix match, PRESET: PRESET policy).
     */
    public String getPatternType() {
        return this.PatternType;
    }

    /**
     * Set ACL rule-based matching type (PREFIXED: prefix match, PRESET: PRESET policy).
     * @param PatternType ACL rule-based matching type (PREFIXED: prefix match, PRESET: PRESET policy).
     */
    public void setPatternType(String PatternType) {
        this.PatternType = PatternType;
    }

    /**
     * Get Specifies whether to read the simplified ACL rule. default value is false, which means not to read the simplified ACL rule. 
     * @return IsSimplified Specifies whether to read the simplified ACL rule. default value is false, which means not to read the simplified ACL rule.
     */
    public Boolean getIsSimplified() {
        return this.IsSimplified;
    }

    /**
     * Set Specifies whether to read the simplified ACL rule. default value is false, which means not to read the simplified ACL rule.
     * @param IsSimplified Specifies whether to read the simplified ACL rule. default value is false, which means not to read the simplified ACL rule.
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

