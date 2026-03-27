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

public class LiveStreamTagRecognitionResult extends AbstractModel {

    /**
    * Tagging events.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Start PTS time of the recognition segment, unit: seconds.
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * Termination PTS time of the recognition segment, unit: seconds.
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * Recognition segment confidence. Range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get Tagging events. 
     * @return Id Tagging events.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Tagging events.
     * @param Id Tagging events.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Start PTS time of the recognition segment, unit: seconds. 
     * @return StartPtsTime Start PTS time of the recognition segment, unit: seconds.
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set Start PTS time of the recognition segment, unit: seconds.
     * @param StartPtsTime Start PTS time of the recognition segment, unit: seconds.
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get Termination PTS time of the recognition segment, unit: seconds. 
     * @return EndPtsTime Termination PTS time of the recognition segment, unit: seconds.
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set Termination PTS time of the recognition segment, unit: seconds.
     * @param EndPtsTime Termination PTS time of the recognition segment, unit: seconds.
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get Recognition segment confidence. Range: 0-100. 
     * @return Confidence Recognition segment confidence. Range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Recognition segment confidence. Range: 0-100.
     * @param Confidence Recognition segment confidence. Range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public LiveStreamTagRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamTagRecognitionResult(LiveStreamTagRecognitionResult source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

