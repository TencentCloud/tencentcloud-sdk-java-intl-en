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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokensUsage extends AbstractModel {

    /**
    * <p>Input token count</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>Output token count</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>Total token count, generally input + output</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get <p>Input token count</p> 
     * @return InputTokens <p>Input token count</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>Input token count</p>
     * @param InputTokens <p>Input token count</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>Output token count</p> 
     * @return OutputTokens <p>Output token count</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>Output token count</p>
     * @param OutputTokens <p>Output token count</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>Total token count, generally input + output</p> 
     * @return TotalTokens <p>Total token count, generally input + output</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>Total token count, generally input + output</p>
     * @param TotalTokens <p>Total token count, generally input + output</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public TokensUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokensUsage(TokensUsage source) {
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

