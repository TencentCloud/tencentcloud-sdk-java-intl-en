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

public class LiveStreamAsrWordsRecognitionResult extends AbstractModel {

    /**
    * Speech keyword.
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * Start PTS time of recognized segment in seconds.
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * End PTS time of recognized segment in seconds.
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * Confidence of recognized segment. Value range: 0–100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get Speech keyword. 
     * @return Word Speech keyword.
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set Speech keyword.
     * @param Word Speech keyword.
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get Start PTS time of recognized segment in seconds. 
     * @return StartPtsTime Start PTS time of recognized segment in seconds.
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set Start PTS time of recognized segment in seconds.
     * @param StartPtsTime Start PTS time of recognized segment in seconds.
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get End PTS time of recognized segment in seconds. 
     * @return EndPtsTime End PTS time of recognized segment in seconds.
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set End PTS time of recognized segment in seconds.
     * @param EndPtsTime End PTS time of recognized segment in seconds.
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get Confidence of recognized segment. Value range: 0–100. 
     * @return Confidence Confidence of recognized segment. Value range: 0–100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of recognized segment. Value range: 0–100.
     * @param Confidence Confidence of recognized segment. Value range: 0–100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public LiveStreamAsrWordsRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAsrWordsRecognitionResult(LiveStreamAsrWordsRecognitionResult source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.StartPtsTime != null) {
            this.StartPtsTime = new Float(source.StartPtsTime);
        }
        if (source.EndPtsTime != null) {
            this.EndPtsTime = new Float(source.EndPtsTime);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

