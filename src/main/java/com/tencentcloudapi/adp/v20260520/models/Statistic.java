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

public class Statistic extends AbstractModel {

    /**
    * <p>Time to first token</p>
    */
    @SerializedName("FirstTokenCostMs")
    @Expose
    private Long FirstTokenCostMs;

    /**
    * <p>Input token count</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>Model name</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Output token count</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>Total reasoning time</p>
    */
    @SerializedName("TotalCostMs")
    @Expose
    private Long TotalCostMs;

    /**
    * <p>Total input and output tokens</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get <p>Time to first token</p> 
     * @return FirstTokenCostMs <p>Time to first token</p>
     */
    public Long getFirstTokenCostMs() {
        return this.FirstTokenCostMs;
    }

    /**
     * Set <p>Time to first token</p>
     * @param FirstTokenCostMs <p>Time to first token</p>
     */
    public void setFirstTokenCostMs(Long FirstTokenCostMs) {
        this.FirstTokenCostMs = FirstTokenCostMs;
    }

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
     * Get <p>Total reasoning time</p> 
     * @return TotalCostMs <p>Total reasoning time</p>
     */
    public Long getTotalCostMs() {
        return this.TotalCostMs;
    }

    /**
     * Set <p>Total reasoning time</p>
     * @param TotalCostMs <p>Total reasoning time</p>
     */
    public void setTotalCostMs(Long TotalCostMs) {
        this.TotalCostMs = TotalCostMs;
    }

    /**
     * Get <p>Total input and output tokens</p> 
     * @return TotalTokens <p>Total input and output tokens</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>Total input and output tokens</p>
     * @param TotalTokens <p>Total input and output tokens</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public Statistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Statistic(Statistic source) {
        if (source.FirstTokenCostMs != null) {
            this.FirstTokenCostMs = new Long(source.FirstTokenCostMs);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.TotalCostMs != null) {
            this.TotalCostMs = new Long(source.TotalCostMs);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstTokenCostMs", this.FirstTokenCostMs);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalCostMs", this.TotalCostMs);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

