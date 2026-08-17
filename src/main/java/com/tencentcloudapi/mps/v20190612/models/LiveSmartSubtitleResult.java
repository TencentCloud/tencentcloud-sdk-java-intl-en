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
    * Start PTS time of a translated recording clip, in seconds.
    */
    @SerializedName("StartPTSTime")
    @Expose
    private Float StartPTSTime;

    /**
    * End PTS time of a translated recording clip, in seconds.
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
    * 
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
     * Get Start PTS time of a translated recording clip, in seconds. 
     * @return StartPTSTime Start PTS time of a translated recording clip, in seconds.
     */
    public Float getStartPTSTime() {
        return this.StartPTSTime;
    }

    /**
     * Set Start PTS time of a translated recording clip, in seconds.
     * @param StartPTSTime Start PTS time of a translated recording clip, in seconds.
     */
    public void setStartPTSTime(Float StartPTSTime) {
        this.StartPTSTime = StartPTSTime;
    }

    /**
     * Get End PTS time of a translated recording clip, in seconds. 
     * @return EndPTSTime End PTS time of a translated recording clip, in seconds.
     */
    public Float getEndPTSTime() {
        return this.EndPTSTime;
    }

    /**
     * Set End PTS time of a translated recording clip, in seconds.
     * @param EndPTSTime End PTS time of a translated recording clip, in seconds.
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
     * Get  
     * @return UserId 
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 
     * @param UserId 
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

