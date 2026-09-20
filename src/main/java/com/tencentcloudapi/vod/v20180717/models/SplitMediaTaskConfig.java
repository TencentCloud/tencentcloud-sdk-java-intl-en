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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplitMediaTaskConfig extends AbstractModel {

    /**
    * Start time offset of video splitting, in seconds.
<li>Leave it empty or set it to 0, indicating that the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of video splitting, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video lasts until the nth second of the original video and then ends;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video ends n seconds before the original video ends.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in when you want to automatically execute a task flow on the generated new video.
    */
    @SerializedName("ProcedureName")
    @Expose
    private String ProcedureName;

    /**
    * Video splitting output information.
    */
    @SerializedName("OutputConfig")
    @Expose
    private SplitMediaOutputConfig OutputConfig;

    /**
     * Get Start time offset of video splitting, in seconds.
<li>Leave it empty or set it to 0, indicating that the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li> 
     * @return StartTimeOffset Start time offset of video splitting, in seconds.
<li>Leave it empty or set it to 0, indicating that the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of video splitting, in seconds.
<li>Leave it empty or set it to 0, indicating that the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li>
     * @param StartTimeOffset Start time offset of video splitting, in seconds.
<li>Leave it empty or set it to 0, indicating that the transcoded video starts from the start position of the original video;</li>
<li>When the value is greater than 0 (assuming n), the transcoded video starts from the nth second of the original video;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of video splitting, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video lasts until the nth second of the original video and then ends;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video ends n seconds before the original video ends.</li> 
     * @return EndTimeOffset End time offset of video splitting, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video lasts until the nth second of the original video and then ends;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video ends n seconds before the original video ends.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of video splitting, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video lasts until the nth second of the original video and then ends;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video ends n seconds before the original video ends.</li>
     * @param EndTimeOffset End time offset of video splitting, in seconds.
<li>If not set or set to 0, the transcoded video will last until the end of the original video.</li>
<li>When the value is greater than 0 (assuming n), it means the transcoded video lasts until the nth second of the original video and then ends;</li>
<li>When the value is less than 0 (assuming -n), it means the transcoded video ends n seconds before the original video ends.</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in when you want to automatically execute a task flow on the generated new video. 
     * @return ProcedureName [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in when you want to automatically execute a task flow on the generated new video.
     */
    public String getProcedureName() {
        return this.ProcedureName;
    }

    /**
     * Set [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in when you want to automatically execute a task flow on the generated new video.
     * @param ProcedureName [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in when you want to automatically execute a task flow on the generated new video.
     */
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }

    /**
     * Get Video splitting output information. 
     * @return OutputConfig Video splitting output information.
     */
    public SplitMediaOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Video splitting output information.
     * @param OutputConfig Video splitting output information.
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

