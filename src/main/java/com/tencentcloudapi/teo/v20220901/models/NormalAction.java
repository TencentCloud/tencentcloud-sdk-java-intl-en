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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormalAction extends AbstractModel {

    /**
    * Feature name. For details, see [DescribeRulesSetting](https://intl.cloud.tencent.com/document/product/1552/80618?from_cn_redirect=1) API
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Parameter
    */
    @SerializedName("Parameters")
    @Expose
    private RuleNormalActionParams [] Parameters;

    /**
     * Get Feature name. For details, see [DescribeRulesSetting](https://intl.cloud.tencent.com/document/product/1552/80618?from_cn_redirect=1) API 
     * @return Action Feature name. For details, see [DescribeRulesSetting](https://intl.cloud.tencent.com/document/product/1552/80618?from_cn_redirect=1) API
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Feature name. For details, see [DescribeRulesSetting](https://intl.cloud.tencent.com/document/product/1552/80618?from_cn_redirect=1) API
     * @param Action Feature name. For details, see [DescribeRulesSetting](https://intl.cloud.tencent.com/document/product/1552/80618?from_cn_redirect=1) API
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Parameter 
     * @return Parameters Parameter
     */
    public RuleNormalActionParams [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set Parameter
     * @param Parameters Parameter
     */
    public void setParameters(RuleNormalActionParams [] Parameters) {
        this.Parameters = Parameters;
    }

    public NormalAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalAction(NormalAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Parameters != null) {
            this.Parameters = new RuleNormalActionParams[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new RuleNormalActionParams(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

