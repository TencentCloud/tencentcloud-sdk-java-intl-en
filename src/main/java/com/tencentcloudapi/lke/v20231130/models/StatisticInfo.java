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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticInfo extends AbstractModel {

    /**
    * Model name.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Time consumption of the first token.
    */
    @SerializedName("FirstTokenCost")
    @Expose
    private Long FirstTokenCost;

    /**
    * Total time consumption.
    */
    @SerializedName("TotalCost")
    @Expose
    private Long TotalCost;

    /**
    * Number of input tokens.
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * Number of output tokens.
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * Total number of tokens.
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get Model name. 
     * @return ModelName Model name.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name.
     * @param ModelName Model name.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Time consumption of the first token. 
     * @return FirstTokenCost Time consumption of the first token.
     */
    public Long getFirstTokenCost() {
        return this.FirstTokenCost;
    }

    /**
     * Set Time consumption of the first token.
     * @param FirstTokenCost Time consumption of the first token.
     */
    public void setFirstTokenCost(Long FirstTokenCost) {
        this.FirstTokenCost = FirstTokenCost;
    }

    /**
     * Get Total time consumption. 
     * @return TotalCost Total time consumption.
     */
    public Long getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Total time consumption.
     * @param TotalCost Total time consumption.
     */
    public void setTotalCost(Long TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Number of input tokens. 
     * @return InputTokens Number of input tokens.
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set Number of input tokens.
     * @param InputTokens Number of input tokens.
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get Number of output tokens. 
     * @return OutputTokens Number of output tokens.
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set Number of output tokens.
     * @param OutputTokens Number of output tokens.
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get Total number of tokens. 
     * @return TotalTokens Total number of tokens.
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set Total number of tokens.
     * @param TotalTokens Total number of tokens.
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public StatisticInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticInfo(StatisticInfo source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.FirstTokenCost != null) {
            this.FirstTokenCost = new Long(source.FirstTokenCost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Long(source.TotalCost);
        }
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
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "FirstTokenCost", this.FirstTokenCost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

