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

public class ReduceMediaBitrateMediaProcessTaskResult extends AbstractModel {

    /**
    * The task type. Valid values:
<li>Transcode</li>
<li>AdaptiveDynamicStreaming</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The result of a transcoding task. This parameter is valid if `Type` is `Transcode`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeTask")
    @Expose
    private ReduceMediaBitrateTranscodeResult TranscodeTask;

    /**
    * The result of an adaptive bitrate task. This parameter is valid if `Type` is `AdaptiveDynamicStreaming`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private ReduceMediaBitrateAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
     * Get The task type. Valid values:
<li>Transcode</li>
<li>AdaptiveDynamicStreaming</li> 
     * @return Type The task type. Valid values:
<li>Transcode</li>
<li>AdaptiveDynamicStreaming</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The task type. Valid values:
<li>Transcode</li>
<li>AdaptiveDynamicStreaming</li>
     * @param Type The task type. Valid values:
<li>Transcode</li>
<li>AdaptiveDynamicStreaming</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The result of a transcoding task. This parameter is valid if `Type` is `Transcode`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeTask The result of a transcoding task. This parameter is valid if `Type` is `Transcode`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReduceMediaBitrateTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set The result of a transcoding task. This parameter is valid if `Type` is `Transcode`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeTask The result of a transcoding task. This parameter is valid if `Type` is `Transcode`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeTask(ReduceMediaBitrateTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get The result of an adaptive bitrate task. This parameter is valid if `Type` is `AdaptiveDynamicStreaming`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdaptiveDynamicStreamingTask The result of an adaptive bitrate task. This parameter is valid if `Type` is `AdaptiveDynamicStreaming`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReduceMediaBitrateAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set The result of an adaptive bitrate task. This parameter is valid if `Type` is `AdaptiveDynamicStreaming`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdaptiveDynamicStreamingTask The result of an adaptive bitrate task. This parameter is valid if `Type` is `AdaptiveDynamicStreaming`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdaptiveDynamicStreamingTask(ReduceMediaBitrateAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    public ReduceMediaBitrateMediaProcessTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReduceMediaBitrateMediaProcessTaskResult(ReduceMediaBitrateMediaProcessTaskResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new ReduceMediaBitrateTranscodeResult(source.TranscodeTask);
        }
        if (source.AdaptiveDynamicStreamingTask != null) {
            this.AdaptiveDynamicStreamingTask = new ReduceMediaBitrateAdaptiveDynamicStreamingResult(source.AdaptiveDynamicStreamingTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingTask.", this.AdaptiveDynamicStreamingTask);

    }
}

