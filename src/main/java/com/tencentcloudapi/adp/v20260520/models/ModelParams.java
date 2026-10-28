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

public class ModelParams extends AbstractModel {

    /**
    * <p>Whether deep thinking is enabled</p>
    */
    @SerializedName("DeepThinking")
    @Expose
    private String DeepThinking;

    /**
    * <p>Frequency penalty</p>
    */
    @SerializedName("FrequencyPenalty")
    @Expose
    private Float FrequencyPenalty;

    /**
    * <p>Maximum output length</p>
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * <p>Existence penalty</p>
    */
    @SerializedName("PresencePenalty")
    @Expose
    private Float PresencePenalty;

    /**
    * <p>Deep thinking effect</p>
    */
    @SerializedName("ReasoningEffort")
    @Expose
    private String ReasoningEffort;

    /**
    * <p>Repetition penalty</p>
    */
    @SerializedName("RepetitionPenalty")
    @Expose
    private Float RepetitionPenalty;

    /**
    * <p>Output format (text, json_object)</p>
    */
    @SerializedName("ReplyFormat")
    @Expose
    private String ReplyFormat;

    /**
    * <p>Random seed</p>
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
    * <p>Stop sequence</p>
    */
    @SerializedName("StopSequenceList")
    @Expose
    private String [] StopSequenceList;

    /**
    * <p>Temperature</p>
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * <p>top_p</p>
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * <p>top_k</p>
    */
    @SerializedName("TopK")
    @Expose
    private Long TopK;

    /**
     * Get <p>Whether deep thinking is enabled</p> 
     * @return DeepThinking <p>Whether deep thinking is enabled</p>
     */
    public String getDeepThinking() {
        return this.DeepThinking;
    }

    /**
     * Set <p>Whether deep thinking is enabled</p>
     * @param DeepThinking <p>Whether deep thinking is enabled</p>
     */
    public void setDeepThinking(String DeepThinking) {
        this.DeepThinking = DeepThinking;
    }

    /**
     * Get <p>Frequency penalty</p> 
     * @return FrequencyPenalty <p>Frequency penalty</p>
     */
    public Float getFrequencyPenalty() {
        return this.FrequencyPenalty;
    }

    /**
     * Set <p>Frequency penalty</p>
     * @param FrequencyPenalty <p>Frequency penalty</p>
     */
    public void setFrequencyPenalty(Float FrequencyPenalty) {
        this.FrequencyPenalty = FrequencyPenalty;
    }

    /**
     * Get <p>Maximum output length</p> 
     * @return MaxTokens <p>Maximum output length</p>
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set <p>Maximum output length</p>
     * @param MaxTokens <p>Maximum output length</p>
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get <p>Existence penalty</p> 
     * @return PresencePenalty <p>Existence penalty</p>
     */
    public Float getPresencePenalty() {
        return this.PresencePenalty;
    }

    /**
     * Set <p>Existence penalty</p>
     * @param PresencePenalty <p>Existence penalty</p>
     */
    public void setPresencePenalty(Float PresencePenalty) {
        this.PresencePenalty = PresencePenalty;
    }

    /**
     * Get <p>Deep thinking effect</p> 
     * @return ReasoningEffort <p>Deep thinking effect</p>
     */
    public String getReasoningEffort() {
        return this.ReasoningEffort;
    }

    /**
     * Set <p>Deep thinking effect</p>
     * @param ReasoningEffort <p>Deep thinking effect</p>
     */
    public void setReasoningEffort(String ReasoningEffort) {
        this.ReasoningEffort = ReasoningEffort;
    }

    /**
     * Get <p>Repetition penalty</p> 
     * @return RepetitionPenalty <p>Repetition penalty</p>
     */
    public Float getRepetitionPenalty() {
        return this.RepetitionPenalty;
    }

    /**
     * Set <p>Repetition penalty</p>
     * @param RepetitionPenalty <p>Repetition penalty</p>
     */
    public void setRepetitionPenalty(Float RepetitionPenalty) {
        this.RepetitionPenalty = RepetitionPenalty;
    }

    /**
     * Get <p>Output format (text, json_object)</p> 
     * @return ReplyFormat <p>Output format (text, json_object)</p>
     */
    public String getReplyFormat() {
        return this.ReplyFormat;
    }

    /**
     * Set <p>Output format (text, json_object)</p>
     * @param ReplyFormat <p>Output format (text, json_object)</p>
     */
    public void setReplyFormat(String ReplyFormat) {
        this.ReplyFormat = ReplyFormat;
    }

    /**
     * Get <p>Random seed</p> 
     * @return Seed <p>Random seed</p>
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set <p>Random seed</p>
     * @param Seed <p>Random seed</p>
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    /**
     * Get <p>Stop sequence</p> 
     * @return StopSequenceList <p>Stop sequence</p>
     */
    public String [] getStopSequenceList() {
        return this.StopSequenceList;
    }

    /**
     * Set <p>Stop sequence</p>
     * @param StopSequenceList <p>Stop sequence</p>
     */
    public void setStopSequenceList(String [] StopSequenceList) {
        this.StopSequenceList = StopSequenceList;
    }

    /**
     * Get <p>Temperature</p> 
     * @return Temperature <p>Temperature</p>
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>Temperature</p>
     * @param Temperature <p>Temperature</p>
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>top_p</p> 
     * @return TopP <p>top_p</p>
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set <p>top_p</p>
     * @param TopP <p>top_p</p>
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get <p>top_k</p> 
     * @return TopK <p>top_k</p>
     */
    public Long getTopK() {
        return this.TopK;
    }

    /**
     * Set <p>top_k</p>
     * @param TopK <p>top_k</p>
     */
    public void setTopK(Long TopK) {
        this.TopK = TopK;
    }

    public ModelParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelParams(ModelParams source) {
        if (source.DeepThinking != null) {
            this.DeepThinking = new String(source.DeepThinking);
        }
        if (source.FrequencyPenalty != null) {
            this.FrequencyPenalty = new Float(source.FrequencyPenalty);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.PresencePenalty != null) {
            this.PresencePenalty = new Float(source.PresencePenalty);
        }
        if (source.ReasoningEffort != null) {
            this.ReasoningEffort = new String(source.ReasoningEffort);
        }
        if (source.RepetitionPenalty != null) {
            this.RepetitionPenalty = new Float(source.RepetitionPenalty);
        }
        if (source.ReplyFormat != null) {
            this.ReplyFormat = new String(source.ReplyFormat);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
        if (source.StopSequenceList != null) {
            this.StopSequenceList = new String[source.StopSequenceList.length];
            for (int i = 0; i < source.StopSequenceList.length; i++) {
                this.StopSequenceList[i] = new String(source.StopSequenceList[i]);
            }
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.TopK != null) {
            this.TopK = new Long(source.TopK);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeepThinking", this.DeepThinking);
        this.setParamSimple(map, prefix + "FrequencyPenalty", this.FrequencyPenalty);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamSimple(map, prefix + "PresencePenalty", this.PresencePenalty);
        this.setParamSimple(map, prefix + "ReasoningEffort", this.ReasoningEffort);
        this.setParamSimple(map, prefix + "RepetitionPenalty", this.RepetitionPenalty);
        this.setParamSimple(map, prefix + "ReplyFormat", this.ReplyFormat);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamArraySimple(map, prefix + "StopSequenceList.", this.StopSequenceList);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "TopK", this.TopK);

    }
}

