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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AILatencyStatistics extends AbstractModel {

    /**
    * Specifies the asr latency statistics.
    */
    @SerializedName("ASRLatency")
    @Expose
    private AILatencyStatisticsInfo ASRLatency;

    /**
    * Specifies the statistics of tts delay.
    */
    @SerializedName("TTSLatency")
    @Expose
    private AILatencyStatisticsInfo TTSLatency;

    /**
    * llm latency statistics.
    */
    @SerializedName("LLMLatency")
    @Expose
    private AILatencyStatisticsInfo LLMLatency;

    /**
    * Specifies the end-to-end latency statistics.
    */
    @SerializedName("ETELatency")
    @Expose
    private AILatencyStatisticsInfo ETELatency;

    /**
     * Get Specifies the asr latency statistics. 
     * @return ASRLatency Specifies the asr latency statistics.
     */
    public AILatencyStatisticsInfo getASRLatency() {
        return this.ASRLatency;
    }

    /**
     * Set Specifies the asr latency statistics.
     * @param ASRLatency Specifies the asr latency statistics.
     */
    public void setASRLatency(AILatencyStatisticsInfo ASRLatency) {
        this.ASRLatency = ASRLatency;
    }

    /**
     * Get Specifies the statistics of tts delay. 
     * @return TTSLatency Specifies the statistics of tts delay.
     */
    public AILatencyStatisticsInfo getTTSLatency() {
        return this.TTSLatency;
    }

    /**
     * Set Specifies the statistics of tts delay.
     * @param TTSLatency Specifies the statistics of tts delay.
     */
    public void setTTSLatency(AILatencyStatisticsInfo TTSLatency) {
        this.TTSLatency = TTSLatency;
    }

    /**
     * Get llm latency statistics. 
     * @return LLMLatency llm latency statistics.
     */
    public AILatencyStatisticsInfo getLLMLatency() {
        return this.LLMLatency;
    }

    /**
     * Set llm latency statistics.
     * @param LLMLatency llm latency statistics.
     */
    public void setLLMLatency(AILatencyStatisticsInfo LLMLatency) {
        this.LLMLatency = LLMLatency;
    }

    /**
     * Get Specifies the end-to-end latency statistics. 
     * @return ETELatency Specifies the end-to-end latency statistics.
     */
    public AILatencyStatisticsInfo getETELatency() {
        return this.ETELatency;
    }

    /**
     * Set Specifies the end-to-end latency statistics.
     * @param ETELatency Specifies the end-to-end latency statistics.
     */
    public void setETELatency(AILatencyStatisticsInfo ETELatency) {
        this.ETELatency = ETELatency;
    }

    public AILatencyStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AILatencyStatistics(AILatencyStatistics source) {
        if (source.ASRLatency != null) {
            this.ASRLatency = new AILatencyStatisticsInfo(source.ASRLatency);
        }
        if (source.TTSLatency != null) {
            this.TTSLatency = new AILatencyStatisticsInfo(source.TTSLatency);
        }
        if (source.LLMLatency != null) {
            this.LLMLatency = new AILatencyStatisticsInfo(source.LLMLatency);
        }
        if (source.ETELatency != null) {
            this.ETELatency = new AILatencyStatisticsInfo(source.ETELatency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ASRLatency.", this.ASRLatency);
        this.setParamObj(map, prefix + "TTSLatency.", this.TTSLatency);
        this.setParamObj(map, prefix + "LLMLatency.", this.LLMLatency);
        this.setParamObj(map, prefix + "ETELatency.", this.ETELatency);

    }
}

