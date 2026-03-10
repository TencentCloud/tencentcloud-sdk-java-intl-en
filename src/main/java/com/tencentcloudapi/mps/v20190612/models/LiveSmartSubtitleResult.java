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

public class LiveSmartSubtitleResult extends AbstractModel {

    /**
    * Recognized text.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Translate the starting PTS time of a segment, in seconds.
    */
    @SerializedName("StartPTSTime")
    @Expose
    private Float StartPTSTime;

    /**
    * End PTS time of a translated segment, in seconds.
    */
    @SerializedName("EndPTSTime")
    @Expose
    private Float EndPTSTime;

    /**
    * Translated text.
    */
    @SerializedName("Trans")
    @Expose
    private String Trans;

    /**
    * Translation started at UTC time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Translation ends at UTC time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Steady-State tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SteadyState")
    @Expose
    private Boolean SteadyState;

    /**
    * websocket and trtc real-time translation UserId.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Translate the starting PTS time of a segment, in seconds. 
     * @return StartPTSTime Translate the starting PTS time of a segment, in seconds.
     */
    public Float getStartPTSTime() {
        return this.StartPTSTime;
    }

    /**
     * Set Translate the starting PTS time of a segment, in seconds.
     * @param StartPTSTime Translate the starting PTS time of a segment, in seconds.
     */
    public void setStartPTSTime(Float StartPTSTime) {
        this.StartPTSTime = StartPTSTime;
    }

    /**
     * Get End PTS time of a translated segment, in seconds. 
     * @return EndPTSTime End PTS time of a translated segment, in seconds.
     */
    public Float getEndPTSTime() {
        return this.EndPTSTime;
    }

    /**
     * Set End PTS time of a translated segment, in seconds.
     * @param EndPTSTime End PTS time of a translated segment, in seconds.
     */
    public void setEndPTSTime(Float EndPTSTime) {
        this.EndPTSTime = EndPTSTime;
    }

    /**
     * Get Translated text. 
     * @return Trans Translated text.
     */
    public String getTrans() {
        return this.Trans;
    }

    /**
     * Set Translated text.
     * @param Trans Translated text.
     */
    public void setTrans(String Trans) {
        this.Trans = Trans;
    }

    /**
     * Get Translation started at UTC time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Translation started at UTC time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Translation started at UTC time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Translation started at UTC time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Translation ends at UTC time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Translation ends at UTC time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Translation ends at UTC time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Translation ends at UTC time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Steady-State tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SteadyState Steady-State tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSteadyState() {
        return this.SteadyState;
    }

    /**
     * Set Steady-State tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SteadyState Steady-State tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSteadyState(Boolean SteadyState) {
        this.SteadyState = SteadyState;
    }

    /**
     * Get websocket and trtc real-time translation UserId.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId websocket and trtc real-time translation UserId.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set websocket and trtc real-time translation UserId.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId websocket and trtc real-time translation UserId.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public LiveSmartSubtitleResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveSmartSubtitleResult(LiveSmartSubtitleResult source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.StartPTSTime != null) {
            this.StartPTSTime = new Float(source.StartPTSTime);
        }
        if (source.EndPTSTime != null) {
            this.EndPTSTime = new Float(source.EndPTSTime);
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
        this.setParamSimple(map, prefix + "StartPTSTime", this.StartPTSTime);
        this.setParamSimple(map, prefix + "EndPTSTime", this.EndPTSTime);
        this.setParamSimple(map, prefix + "Trans", this.Trans);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SteadyState", this.SteadyState);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

