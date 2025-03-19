/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlaybackInfo extends AbstractModel {

    /**
    * Program duration, in milliseconds, valid for live broadcast.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Program startup method, live broadcast only supports Absolute, on-demand also supports Relative.
    */
    @SerializedName("TransitionType")
    @Expose
    private String TransitionType;

    /**
    * Unix timestamp, the start execution time of the program in the Absolute scenario.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * It is related to the insertion order of the selected program, divided into After and Before.
    */
    @SerializedName("RelativePosition")
    @Expose
    private String RelativePosition;

    /**
    * The selected insertion reference program id.
    */
    @SerializedName("RelativeProgramId")
    @Expose
    private String RelativeProgramId;

    /**
    * Spacer configuration.
    */
    @SerializedName("ClipRangeConf")
    @Expose
    private ClipRangeInfo ClipRangeConf;

    /**
    * RelativeProgramName.
    */
    @SerializedName("RelativeProgramName")
    @Expose
    private String RelativeProgramName;

    /**
     * Get Program duration, in milliseconds, valid for live broadcast. 
     * @return Duration Program duration, in milliseconds, valid for live broadcast.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Program duration, in milliseconds, valid for live broadcast.
     * @param Duration Program duration, in milliseconds, valid for live broadcast.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Program startup method, live broadcast only supports Absolute, on-demand also supports Relative. 
     * @return TransitionType Program startup method, live broadcast only supports Absolute, on-demand also supports Relative.
     */
    public String getTransitionType() {
        return this.TransitionType;
    }

    /**
     * Set Program startup method, live broadcast only supports Absolute, on-demand also supports Relative.
     * @param TransitionType Program startup method, live broadcast only supports Absolute, on-demand also supports Relative.
     */
    public void setTransitionType(String TransitionType) {
        this.TransitionType = TransitionType;
    }

    /**
     * Get Unix timestamp, the start execution time of the program in the Absolute scenario. 
     * @return StartTime Unix timestamp, the start execution time of the program in the Absolute scenario.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Unix timestamp, the start execution time of the program in the Absolute scenario.
     * @param StartTime Unix timestamp, the start execution time of the program in the Absolute scenario.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get It is related to the insertion order of the selected program, divided into After and Before. 
     * @return RelativePosition It is related to the insertion order of the selected program, divided into After and Before.
     */
    public String getRelativePosition() {
        return this.RelativePosition;
    }

    /**
     * Set It is related to the insertion order of the selected program, divided into After and Before.
     * @param RelativePosition It is related to the insertion order of the selected program, divided into After and Before.
     */
    public void setRelativePosition(String RelativePosition) {
        this.RelativePosition = RelativePosition;
    }

    /**
     * Get The selected insertion reference program id. 
     * @return RelativeProgramId The selected insertion reference program id.
     */
    public String getRelativeProgramId() {
        return this.RelativeProgramId;
    }

    /**
     * Set The selected insertion reference program id.
     * @param RelativeProgramId The selected insertion reference program id.
     */
    public void setRelativeProgramId(String RelativeProgramId) {
        this.RelativeProgramId = RelativeProgramId;
    }

    /**
     * Get Spacer configuration. 
     * @return ClipRangeConf Spacer configuration.
     */
    public ClipRangeInfo getClipRangeConf() {
        return this.ClipRangeConf;
    }

    /**
     * Set Spacer configuration.
     * @param ClipRangeConf Spacer configuration.
     */
    public void setClipRangeConf(ClipRangeInfo ClipRangeConf) {
        this.ClipRangeConf = ClipRangeConf;
    }

    /**
     * Get RelativeProgramName. 
     * @return RelativeProgramName RelativeProgramName.
     */
    public String getRelativeProgramName() {
        return this.RelativeProgramName;
    }

    /**
     * Set RelativeProgramName.
     * @param RelativeProgramName RelativeProgramName.
     */
    public void setRelativeProgramName(String RelativeProgramName) {
        this.RelativeProgramName = RelativeProgramName;
    }

    public PlaybackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlaybackInfo(PlaybackInfo source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.TransitionType != null) {
            this.TransitionType = new String(source.TransitionType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.RelativePosition != null) {
            this.RelativePosition = new String(source.RelativePosition);
        }
        if (source.RelativeProgramId != null) {
            this.RelativeProgramId = new String(source.RelativeProgramId);
        }
        if (source.ClipRangeConf != null) {
            this.ClipRangeConf = new ClipRangeInfo(source.ClipRangeConf);
        }
        if (source.RelativeProgramName != null) {
            this.RelativeProgramName = new String(source.RelativeProgramName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "TransitionType", this.TransitionType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RelativePosition", this.RelativePosition);
        this.setParamSimple(map, prefix + "RelativeProgramId", this.RelativeProgramId);
        this.setParamObj(map, prefix + "ClipRangeConf.", this.ClipRangeConf);
        this.setParamSimple(map, prefix + "RelativeProgramName", this.RelativeProgramName);

    }
}

