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

public class LiveStreamTransTextRecognitionResult extends AbstractModel {

    /**
    * The text transcript.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The PTS (seconds) of the start of a segment.
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * The PTS (seconds) of the end of a segment.
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * The confidence score for a segment. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The translation.
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
    * Translation start UTC time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Translation end UTC time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Steady state marker.
    */
    @SerializedName("SteadyState")
    @Expose
    private Boolean SteadyState;

    /**
    * User ID in the result of real-time translation via WebSocket and TRTC.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get The text transcript. 
     * @return Text The text transcript.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The text transcript.
     * @param Text The text transcript.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The PTS (seconds) of the start of a segment. 
     * @return StartPtsTime The PTS (seconds) of the start of a segment.
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set The PTS (seconds) of the start of a segment.
     * @param StartPtsTime The PTS (seconds) of the start of a segment.
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get The PTS (seconds) of the end of a segment. 
     * @return EndPtsTime The PTS (seconds) of the end of a segment.
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set The PTS (seconds) of the end of a segment.
     * @param EndPtsTime The PTS (seconds) of the end of a segment.
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get The confidence score for a segment. Value range: 0-100. 
     * @return Confidence The confidence score for a segment. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score for a segment. Value range: 0-100.
     * @param Confidence The confidence score for a segment. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The translation. 
     * @return Trans The translation.
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set The translation.
     * @param Trans The translation.
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    /**
     * Get Translation start UTC time. 
     * @return StartTime Translation start UTC time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Translation start UTC time.
     * @param StartTime Translation start UTC time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Translation end UTC time. 
     * @return EndTime Translation end UTC time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Translation end UTC time.
     * @param EndTime Translation end UTC time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Steady state marker. 
     * @return SteadyState Steady state marker.
     */
    public Boolean getSteadyState() {
        return this.SteadyState;
    }

    /**
     * Set Steady state marker.
     * @param SteadyState Steady state marker.
     */
    public void setSteadyState(Boolean SteadyState) {
        this.SteadyState = SteadyState;
    }

    /**
     * Get User ID in the result of real-time translation via WebSocket and TRTC.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserId User ID in the result of real-time translation via WebSocket and TRTC.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID in the result of real-time translation via WebSocket and TRTC.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserId User ID in the result of real-time translation via WebSocket and TRTC.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public LiveStreamTransTextRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamTransTextRecognitionResult(LiveStreamTransTextRecognitionResult source) {
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
        if (source.Trans != null) {
            this.Trans = new String(source.Trans);
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
        this.setParamSimple(map, prefix + "Trans", this.Trans);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SteadyState", this.SteadyState);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

