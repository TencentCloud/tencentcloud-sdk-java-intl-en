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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityRuleIdRequest extends AbstractModel{

    /**
    * Array of rule IDs.
    */
    @SerializedName("RuleIdList")
    @Expose
    private Long [] RuleIdList;

    /**
    * Rule type. Values:
<li>`waf`: Web managed rules</li>
<li>`acl`: Custom rules</li>
<li>`rate`: Rate limiting rules</li>
<li>`bot`: Bot managed rules</li>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * The subdomain name/layer-4 proxy.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
     * Get Array of rule IDs. 
     * @return RuleIdList Array of rule IDs.
     */
    public Long [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set Array of rule IDs.
     * @param RuleIdList Array of rule IDs.
     */
    public void setRuleIdList(Long [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get Rule type. Values:
<li>`waf`: Web managed rules</li>
<li>`acl`: Custom rules</li>
<li>`rate`: Rate limiting rules</li>
<li>`bot`: Bot managed rules</li> 
     * @return RuleType Rule type. Values:
<li>`waf`: Web managed rules</li>
<li>`acl`: Custom rules</li>
<li>`rate`: Rate limiting rules</li>
<li>`bot`: Bot managed rules</li>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type. Values:
<li>`waf`: Web managed rules</li>
<li>`acl`: Custom rules</li>
<li>`rate`: Rate limiting rules</li>
<li>`bot`: Bot managed rules</li>
     * @param RuleType Rule type. Values:
<li>`waf`: Web managed rules</li>
<li>`acl`: Custom rules</li>
<li>`rate`: Rate limiting rules</li>
<li>`bot`: Bot managed rules</li>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get The subdomain name/layer-4 proxy. 
     * @return Entity The subdomain name/layer-4 proxy.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set The subdomain name/layer-4 proxy.
     * @param Entity The subdomain name/layer-4 proxy.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    public DescribeSecurityRuleIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityRuleIdRequest(DescribeSecurityRuleIdRequest source) {
        if (source.RuleIdList != null) {
            this.RuleIdList = new Long[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new Long(source.RuleIdList[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Entity", this.Entity);

    }
}

