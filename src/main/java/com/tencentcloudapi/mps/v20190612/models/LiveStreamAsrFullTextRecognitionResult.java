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
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("SteadyState")
    @Expose
    private Boolean SteadyState;

    /**
    * User ID in the result of recognition via WebSocket and TRTC.Note: This field may return null, indicating that no valid value can be obtained.
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

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return SteadyState 
     */
    public Boolean getSteadyState() {
        return this.SteadyState;
    }

    /**
     * Set 
     * @param SteadyState 
     */
    public void setSteadyState(Boolean SteadyState) {
        this.SteadyState = SteadyState;
    }

    /**
     * Get User ID in the result of recognition via WebSocket and TRTC.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserId User ID in the result of recognition via WebSocket and TRTC.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID in the result of recognition via WebSocket and TRTC.Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserId User ID in the result of recognition via WebSocket and TRTC.Note: This field may return null, indicating that no valid value can be obtained.
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

