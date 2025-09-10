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

public class AILatencyDetail extends AbstractModel {

    /**
    * Dialog ID.
    */
    @SerializedName("RoundId")
    @Expose
    private String RoundId;

    /**
    * Specifies the asr latency in milliseconds.
    */
    @SerializedName("ASRLatency")
    @Expose
    private Long ASRLatency;

    /**
    * Specifies the tts delay in milliseconds.
    */
    @SerializedName("TTSLatency")
    @Expose
    private Long TTSLatency;

    /**
    * llm latency (ms).
    */
    @SerializedName("LLMLatency")
    @Expose
    private Long LLMLatency;

    /**
    * llm first token latency (ms).
    */
    @SerializedName("LLMFirstTokenLatency")
    @Expose
    private Long LLMFirstTokenLatency;

    /**
    * End-To-End delay (ms).
    */
    @SerializedName("ETELatency")
    @Expose
    private Long ETELatency;

    /**
     * Get Dialog ID. 
     * @return RoundId Dialog ID.
     */
    public String getRoundId() {
        return this.RoundId;
    }

    /**
     * Set Dialog ID.
     * @param RoundId Dialog ID.
     */
    public void setRoundId(String RoundId) {
        this.RoundId = RoundId;
    }

    /**
     * Get Specifies the asr latency in milliseconds. 
     * @return ASRLatency Specifies the asr latency in milliseconds.
     */
    public Long getASRLatency() {
        return this.ASRLatency;
    }

    /**
     * Set Specifies the asr latency in milliseconds.
     * @param ASRLatency Specifies the asr latency in milliseconds.
     */
    public void setASRLatency(Long ASRLatency) {
        this.ASRLatency = ASRLatency;
    }

    /**
     * Get Specifies the tts delay in milliseconds. 
     * @return TTSLatency Specifies the tts delay in milliseconds.
     */
    public Long getTTSLatency() {
        return this.TTSLatency;
    }

    /**
     * Set Specifies the tts delay in milliseconds.
     * @param TTSLatency Specifies the tts delay in milliseconds.
     */
    public void setTTSLatency(Long TTSLatency) {
        this.TTSLatency = TTSLatency;
    }

    /**
     * Get llm latency (ms). 
     * @return LLMLatency llm latency (ms).
     */
    public Long getLLMLatency() {
        return this.LLMLatency;
    }

    /**
     * Set llm latency (ms).
     * @param LLMLatency llm latency (ms).
     */
    public void setLLMLatency(Long LLMLatency) {
        this.LLMLatency = LLMLatency;
    }

    /**
     * Get llm first token latency (ms). 
     * @return LLMFirstTokenLatency llm first token latency (ms).
     */
    public Long getLLMFirstTokenLatency() {
        return this.LLMFirstTokenLatency;
    }

    /**
     * Set llm first token latency (ms).
     * @param LLMFirstTokenLatency llm first token latency (ms).
     */
    public void setLLMFirstTokenLatency(Long LLMFirstTokenLatency) {
        this.LLMFirstTokenLatency = LLMFirstTokenLatency;
    }

    /**
     * Get End-To-End delay (ms). 
     * @return ETELatency End-To-End delay (ms).
     */
    public Long getETELatency() {
        return this.ETELatency;
    }

    /**
     * Set End-To-End delay (ms).
     * @param ETELatency End-To-End delay (ms).
     */
    public void setETELatency(Long ETELatency) {
        this.ETELatency = ETELatency;
    }

    public AILatencyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AILatencyDetail(AILatencyDetail source) {
        if (source.RoundId != null) {
            this.RoundId = new String(source.RoundId);
        }
        if (source.ASRLatency != null) {
            this.ASRLatency = new Long(source.ASRLatency);
        }
        if (source.TTSLatency != null) {
            this.TTSLatency = new Long(source.TTSLatency);
        }
        if (source.LLMLatency != null) {
            this.LLMLatency = new Long(source.LLMLatency);
        }
        if (source.LLMFirstTokenLatency != null) {
            this.LLMFirstTokenLatency = new Long(source.LLMFirstTokenLatency);
        }
        if (source.ETELatency != null) {
            this.ETELatency = new Long(source.ETELatency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoundId", this.RoundId);
        this.setParamSimple(map, prefix + "ASRLatency", this.ASRLatency);
        this.setParamSimple(map, prefix + "TTSLatency", this.TTSLatency);
        this.setParamSimple(map, prefix + "LLMLatency", this.LLMLatency);
        this.setParamSimple(map, prefix + "LLMFirstTokenLatency", this.LLMFirstTokenLatency);
        this.setParamSimple(map, prefix + "ETELatency", this.ETELatency);

    }
}

