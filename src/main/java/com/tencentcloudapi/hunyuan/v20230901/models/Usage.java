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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Usage extends AbstractModel {

    /**
    * Input Token quantity.
    */
    @SerializedName("PromptTokens")
    @Expose
    private Long PromptTokens;

    /**
    * Output Token quantity.
    */
    @SerializedName("CompletionTokens")
    @Expose
    private Long CompletionTokens;

    /**
    * Total Token quantity.
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * Details of the input token.
    */
    @SerializedName("PromptTokensDetails")
    @Expose
    private PromptTokensDetails PromptTokensDetails;

    /**
     * Get Input Token quantity. 
     * @return PromptTokens Input Token quantity.
     */
    public Long getPromptTokens() {
        return this.PromptTokens;
    }

    /**
     * Set Input Token quantity.
     * @param PromptTokens Input Token quantity.
     */
    public void setPromptTokens(Long PromptTokens) {
        this.PromptTokens = PromptTokens;
    }

    /**
     * Get Output Token quantity. 
     * @return CompletionTokens Output Token quantity.
     */
    public Long getCompletionTokens() {
        return this.CompletionTokens;
    }

    /**
     * Set Output Token quantity.
     * @param CompletionTokens Output Token quantity.
     */
    public void setCompletionTokens(Long CompletionTokens) {
        this.CompletionTokens = CompletionTokens;
    }

    /**
     * Get Total Token quantity. 
     * @return TotalTokens Total Token quantity.
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set Total Token quantity.
     * @param TotalTokens Total Token quantity.
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get Details of the input token. 
     * @return PromptTokensDetails Details of the input token.
     */
    public PromptTokensDetails getPromptTokensDetails() {
        return this.PromptTokensDetails;
    }

    /**
     * Set Details of the input token.
     * @param PromptTokensDetails Details of the input token.
     */
    public void setPromptTokensDetails(PromptTokensDetails PromptTokensDetails) {
        this.PromptTokensDetails = PromptTokensDetails;
    }

    public Usage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Usage(Usage source) {
        if (source.PromptTokens != null) {
            this.PromptTokens = new Long(source.PromptTokens);
        }
        if (source.CompletionTokens != null) {
            this.CompletionTokens = new Long(source.CompletionTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.PromptTokensDetails != null) {
            this.PromptTokensDetails = new PromptTokensDetails(source.PromptTokensDetails);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptTokens", this.PromptTokens);
        this.setParamSimple(map, prefix + "CompletionTokens", this.CompletionTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamObj(map, prefix + "PromptTokensDetails.", this.PromptTokensDetails);

    }
}

