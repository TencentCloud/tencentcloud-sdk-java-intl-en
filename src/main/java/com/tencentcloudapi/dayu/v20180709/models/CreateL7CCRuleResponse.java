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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateL7CCRuleResponse extends AbstractModel{

    /**
    * Custom layer-7 CC protection rule parameters. If custom CC protection rule is not enabled, an empty array will be returned.
    */
    @SerializedName("RuleConfig")
    @Expose
    private CCRuleConfig [] RuleConfig;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Custom layer-7 CC protection rule parameters. If custom CC protection rule is not enabled, an empty array will be returned. 
     * @return RuleConfig Custom layer-7 CC protection rule parameters. If custom CC protection rule is not enabled, an empty array will be returned.
     */
    public CCRuleConfig [] getRuleConfig() {
        return this.RuleConfig;
    }

    /**
     * Set Custom layer-7 CC protection rule parameters. If custom CC protection rule is not enabled, an empty array will be returned.
     * @param RuleConfig Custom layer-7 CC protection rule parameters. If custom CC protection rule is not enabled, an empty array will be returned.
     */
    public void setRuleConfig(CCRuleConfig [] RuleConfig) {
        this.RuleConfig = RuleConfig;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleConfig.", this.RuleConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

