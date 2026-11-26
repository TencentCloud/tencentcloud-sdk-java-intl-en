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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RewriteAction extends AbstractModel {

    /**
    * Feature name. For completion specifications, call the API to [query the parameter settings of the rule engine](https://www.tencentcloud.com/document/product/1552/80618?from_cn_redirect=1).
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * parameter.
    */
    @SerializedName("Parameters")
    @Expose
    private RuleRewriteActionParams [] Parameters;

    /**
     * Get Feature name. For completion specifications, call the API to [query the parameter settings of the rule engine](https://www.tencentcloud.com/document/product/1552/80618?from_cn_redirect=1). 
     * @return Action Feature name. For completion specifications, call the API to [query the parameter settings of the rule engine](https://www.tencentcloud.com/document/product/1552/80618?from_cn_redirect=1).
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Feature name. For completion specifications, call the API to [query the parameter settings of the rule engine](https://www.tencentcloud.com/document/product/1552/80618?from_cn_redirect=1).
     * @param Action Feature name. For completion specifications, call the API to [query the parameter settings of the rule engine](https://www.tencentcloud.com/document/product/1552/80618?from_cn_redirect=1).
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get parameter. 
     * @return Parameters parameter.
     */
    public RuleRewriteActionParams [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set parameter.
     * @param Parameters parameter.
     */
    public void setParameters(RuleRewriteActionParams [] Parameters) {
        this.Parameters = Parameters;
    }

    public RewriteAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RewriteAction(RewriteAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Parameters != null) {
            this.Parameters = new RuleRewriteActionParams[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new RuleRewriteActionParams(source.Parameters[i]);
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

