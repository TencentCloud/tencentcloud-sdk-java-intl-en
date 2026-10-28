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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenUsage extends AbstractModel {

    /**
    * <p>Number of completion tokens</p>
    */
    @SerializedName("CompletionTokens")
    @Expose
    private Long CompletionTokens;

    /**
    * <p>Model name</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>prompt token count</p>
    */
    @SerializedName("PromptTokens")
    @Expose
    private Long PromptTokens;

    /**
    * <p>Total token count</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get <p>Number of completion tokens</p> 
     * @return CompletionTokens <p>Number of completion tokens</p>
     */
    public Long getCompletionTokens() {
        return this.CompletionTokens;
    }

    /**
     * Set <p>Number of completion tokens</p>
     * @param CompletionTokens <p>Number of completion tokens</p>
     */
    public void setCompletionTokens(Long CompletionTokens) {
        this.CompletionTokens = CompletionTokens;
    }

    /**
     * Get <p>Model name</p> 
     * @return ModelName <p>Model name</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name</p>
     * @param ModelName <p>Model name</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>prompt token count</p> 
     * @return PromptTokens <p>prompt token count</p>
     */
    public Long getPromptTokens() {
        return this.PromptTokens;
    }

    /**
     * Set <p>prompt token count</p>
     * @param PromptTokens <p>prompt token count</p>
     */
    public void setPromptTokens(Long PromptTokens) {
        this.PromptTokens = PromptTokens;
    }

    /**
     * Get <p>Total token count</p> 
     * @return TotalTokens <p>Total token count</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>Total token count</p>
     * @param TotalTokens <p>Total token count</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public TokenUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenUsage(TokenUsage source) {
        if (source.CompletionTokens != null) {
            this.CompletionTokens = new Long(source.CompletionTokens);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.PromptTokens != null) {
            this.PromptTokens = new Long(source.PromptTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompletionTokens", this.CompletionTokens);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "PromptTokens", this.PromptTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

