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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplitMediaTaskConfig extends AbstractModel {

    /**
    * The offset time of the start of video stripping, unit: seconds. 
<li>Leave it blank or fill in 0, which means that the transcoded video starts from the starting position of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that after transcoding The video starts from the n-th second position of the original video;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video starts from the position n seconds before the end of the original video. </li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * Offset time at the end of video stripping, unit: seconds. 
<li>Leave it blank or fill it in with 0, which means that the transcoded video will continue until the end of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that the transcoded video will continue until the end of the original video. The video continues until the nth second of the original video and terminates;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video continues until n seconds before the end of the original video. </li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Task flow template name, if you want Fill in when executing the task flow on the generated new video.
    */
    @SerializedName("ProcedureName")
    @Expose
    private String ProcedureName;

    /**
    * The video is split into strips to output information.
    */
    @SerializedName("OutputConfig")
    @Expose
    private SplitMediaOutputConfig OutputConfig;

    /**
     * Get The offset time of the start of video stripping, unit: seconds. 
<li>Leave it blank or fill in 0, which means that the transcoded video starts from the starting position of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that after transcoding The video starts from the n-th second position of the original video;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video starts from the position n seconds before the end of the original video. </li> 
     * @return StartTimeOffset The offset time of the start of video stripping, unit: seconds. 
<li>Leave it blank or fill in 0, which means that the transcoded video starts from the starting position of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that after transcoding The video starts from the n-th second position of the original video;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video starts from the position n seconds before the end of the original video. </li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set The offset time of the start of video stripping, unit: seconds. 
<li>Leave it blank or fill in 0, which means that the transcoded video starts from the starting position of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that after transcoding The video starts from the n-th second position of the original video;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video starts from the position n seconds before the end of the original video. </li>
     * @param StartTimeOffset The offset time of the start of video stripping, unit: seconds. 
<li>Leave it blank or fill in 0, which means that the transcoded video starts from the starting position of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that after transcoding The video starts from the n-th second position of the original video;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video starts from the position n seconds before the end of the original video. </li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Offset time at the end of video stripping, unit: seconds. 
<li>Leave it blank or fill it in with 0, which means that the transcoded video will continue until the end of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that the transcoded video will continue until the end of the original video. The video continues until the nth second of the original video and terminates;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video continues until n seconds before the end of the original video. </li> 
     * @return EndTimeOffset Offset time at the end of video stripping, unit: seconds. 
<li>Leave it blank or fill it in with 0, which means that the transcoded video will continue until the end of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that the transcoded video will continue until the end of the original video. The video continues until the nth second of the original video and terminates;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video continues until n seconds before the end of the original video. </li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Offset time at the end of video stripping, unit: seconds. 
<li>Leave it blank or fill it in with 0, which means that the transcoded video will continue until the end of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that the transcoded video will continue until the end of the original video. The video continues until the nth second of the original video and terminates;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video continues until n seconds before the end of the original video. </li>
     * @param EndTimeOffset Offset time at the end of video stripping, unit: seconds. 
<li>Leave it blank or fill it in with 0, which means that the transcoded video will continue until the end of the original video;</li>
<li>When the value is greater than 0 (assumed to be n), it means that the transcoded video will continue until the end of the original video. The video continues until the nth second of the original video and terminates;</li>
<li>When the value is less than 0 (assumed to be -n), it means that the transcoded video continues until n seconds before the end of the original video. </li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Task flow template name, if you want Fill in when executing the task flow on the generated new video. 
     * @return ProcedureName Task flow template name, if you want Fill in when executing the task flow on the generated new video.
     */
    public String getProcedureName() {
        return this.ProcedureName;
    }

    /**
     * Set Task flow template name, if you want Fill in when executing the task flow on the generated new video.
     * @param ProcedureName Task flow template name, if you want Fill in when executing the task flow on the generated new video.
     */
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }

    /**
     * Get The video is split into strips to output information. 
     * @return OutputConfig The video is split into strips to output information.
     */
    public SplitMediaOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set The video is split into strips to output information.
     * @param OutputConfig The video is split into strips to output information.
     */
    public void setOutputConfig(SplitMediaOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    public SplitMediaTaskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplitMediaTaskConfig(SplitMediaTaskConfig source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.ProcedureName != null) {
            this.ProcedureName = new String(source.ProcedureName);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new SplitMediaOutputConfig(source.OutputConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "ProcedureName", this.ProcedureName);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);

    }
}

