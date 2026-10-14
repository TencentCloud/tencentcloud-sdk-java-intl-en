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

public class LiveStreamAsrFullTextRecognitionResult extends AbstractModel {

    /**
    * Recognized text.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Start PTS time of a recognized segment, in seconds.
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * End PTS time of a recognized segment, in seconds.
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * Confidence of a recognized segment. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Recognition start UTC time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * UTC time when recognition is completed.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Steady-state tag.
    */
    @SerializedName("SteadyState")
    @Expose
    private Boolean SteadyState;

    /**
    * UserId of the websocket and trtc recognition result
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get Recognized text. 
     * @return Text Recognized text.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Recognized text.
     * @param Text Recognized text.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Start PTS time of a recognized segment, in seconds. 
     * @return StartPtsTime Start PTS time of a recognized segment, in seconds.
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set Start PTS time of a recognized segment, in seconds.
     * @param StartPtsTime Start PTS time of a recognized segment, in seconds.
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get End PTS time of a recognized segment, in seconds. 
     * @return EndPtsTime End PTS time of a recognized segment, in seconds.
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set End PTS time of a recognized segment, in seconds.
     * @param EndPtsTime End PTS time of a recognized segment, in seconds.
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get Confidence of a recognized segment. Value range: 0-100. 
     * @return Confidence Confidence of a recognized segment. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of a recognized segment. Value range: 0-100.
     * @param Confidence Confidence of a recognized segment. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Recognition start UTC time. 
     * @return StartTime Recognition start UTC time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Recognition start UTC time.
     * @param StartTime Recognition start UTC time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get UTC time when recognition is completed. 
     * @return EndTime UTC time when recognition is completed.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set UTC time when recognition is completed.
     * @param EndTime UTC time when recognition is completed.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Steady-state tag. 
     * @return SteadyState Steady-state tag.
     */
    public Boolean getSteadyState() {
        return this.SteadyState;
    }

    /**
     * Set Steady-state tag.
     * @param SteadyState Steady-state tag.
     */
    public void setSteadyState(Boolean SteadyState) {
        this.SteadyState = SteadyState;
    }

    /**
     * Get UserId of the websocket and trtc recognition result 
     * @return UserId UserId of the websocket and trtc recognition result
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set UserId of the websocket and trtc recognition result
     * @param UserId UserId of the websocket and trtc recognition result
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public LiveStreamAsrFullTextRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAsrFullTextRecognitionResult(LiveStreamAsrFullTextRecognitionResult source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SteadyState != null) {
            this.SteadyState = new Boolean(source.SteadyState);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SteadyState", this.SteadyState);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

