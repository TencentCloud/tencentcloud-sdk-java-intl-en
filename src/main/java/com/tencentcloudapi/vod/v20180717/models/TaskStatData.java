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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatData extends AbstractModel{

    /**
    * The task type.
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: Top Speed Codec transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: Top Speed Codec editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li> ContentRecognition: Content recognition</li>
<li>RemoveWatermark: Watermark removal</li>
<li> ExtractTraceWatermark: Digital watermark extraction</li>
<li> AddTraceWatermark: Digital watermarking</li>
<li>Transcode: Transcoding, including general transcoding, Top Speed Codec transcoding, and video editing. This value is not recommended.</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task statistics overview (usage unit: second).
    */
    @SerializedName("Summary")
    @Expose
    private TaskStatDataItem [] Summary;

    /**
    * The detailed statistics of different tasks.
Transcoding:
<li>Remuxing</li>
<li>Audio</li>
<li>Standard.H264.SD</li>
<li>Standard.H264.HD</li>
<li>Standard.H264.FHD</li>
<li>Standard.H264.2K</li>
<li>Standard.H264.4K</li>
<li>Standard.H265.SD</li>
<li>Standard.H265.HD</li>
<li>Standard.H265.FHD</li>
<li>Standard.H265.2K</li>
<li>Standard.H265.4K</li>
<li>TESHD-10.H264.SD</li>
<li>TESHD-10.H264.HD</li>
<li>TESHD-10.H264.FHD</li>
<li>TESHD-10.H264.2K</li>
<li>TESHD-10.H264.4K</li>
<li>TESHD-10.H265.SD</li>
<li>TESHD-10.H265.HD</li>
<li>TESHD-10.H265.FHD</li>
<li>TESHD-10.H265.2K</li>
<li>TESHD-10.H265.4K</li>
<li>Edit.Audio</li>
<li>Edit.H264.SD</li>
<li>Edit.H264.HD</li>
<li>Edit.H264.FHD</li>
<li>Edit.H264.2K</li>
<li>Edit.H264.4K</li>
<li>Edit.H265.SD</li>
<li>Edit.H265.HD</li>
<li>Edit.H265.FHD</li>
<li>Edit.H265.2K</li>
<li>Edit.H265.4K</li>
<li>Edit.TESHD-10.H264.SD</li>
<li>Edit.TESHD-10.H264.HD</li>
<li>Edit.TESHD-10.H264.FHD</li>
<li>Edit.TESHD-10.H264.2K</li>
<li>Edit.TESHD-10.H264.4K</li>
<li>Edit.TESHD-10.H265.SD</li>
<li>Edit.TESHD-10.H265.HD</li>
<li>Edit.TESHD-10.H265.FHD</li>
<li>Edit.TESHD-10.H265.2K</li>
<li>Edit.TESHD-10.H265.4K</li>
Watermark removal:
<li>480P: 640 x 480 and below</li>
<li>720P: 1280 x 720 and below</li>
<li>1080P: 1920 x 1080 and below</li>
<li>2K: 2560 x 1440 and below</li>
<li>4K: 3840 x 2160 and below</li>
<li>8K: 7680 x 4320 and below</li>
    */
    @SerializedName("Details")
    @Expose
    private SpecificationDataItem [] Details;

    /**
     * Get The task type.
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: Top Speed Codec transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: Top Speed Codec editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li> ContentRecognition: Content recognition</li>
<li>RemoveWatermark: Watermark removal</li>
<li> ExtractTraceWatermark: Digital watermark extraction</li>
<li> AddTraceWatermark: Digital watermarking</li>
<li>Transcode: Transcoding, including general transcoding, Top Speed Codec transcoding, and video editing. This value is not recommended.</li> 
     * @return TaskType The task type.
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: Top Speed Codec transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: Top Speed Codec editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li> ContentRecognition: Content recognition</li>
<li>RemoveWatermark: Watermark removal</li>
<li> ExtractTraceWatermark: Digital watermark extraction</li>
<li> AddTraceWatermark: Digital watermarking</li>
<li>Transcode: Transcoding, including general transcoding, Top Speed Codec transcoding, and video editing. This value is not recommended.</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set The task type.
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: Top Speed Codec transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: Top Speed Codec editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li> ContentRecognition: Content recognition</li>
<li>RemoveWatermark: Watermark removal</li>
<li> ExtractTraceWatermark: Digital watermark extraction</li>
<li> AddTraceWatermark: Digital watermarking</li>
<li>Transcode: Transcoding, including general transcoding, Top Speed Codec transcoding, and video editing. This value is not recommended.</li>
     * @param TaskType The task type.
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: Top Speed Codec transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: Top Speed Codec editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li> ContentRecognition: Content recognition</li>
<li>RemoveWatermark: Watermark removal</li>
<li> ExtractTraceWatermark: Digital watermark extraction</li>
<li> AddTraceWatermark: Digital watermarking</li>
<li>Transcode: Transcoding, including general transcoding, Top Speed Codec transcoding, and video editing. This value is not recommended.</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task statistics overview (usage unit: second). 
     * @return Summary Task statistics overview (usage unit: second).
     */
    public TaskStatDataItem [] getSummary() {
        return this.Summary;
    }

    /**
     * Set Task statistics overview (usage unit: second).
     * @param Summary Task statistics overview (usage unit: second).
     */
    public void setSummary(TaskStatDataItem [] Summary) {
        this.Summary = Summary;
    }

    /**
     * Get The detailed statistics of different tasks.
Transcoding:
<li>Remuxing</li>
<li>Audio</li>
<li>Standard.H264.SD</li>
<li>Standard.H264.HD</li>
<li>Standard.H264.FHD</li>
<li>Standard.H264.2K</li>
<li>Standard.H264.4K</li>
<li>Standard.H265.SD</li>
<li>Standard.H265.HD</li>
<li>Standard.H265.FHD</li>
<li>Standard.H265.2K</li>
<li>Standard.H265.4K</li>
<li>TESHD-10.H264.SD</li>
<li>TESHD-10.H264.HD</li>
<li>TESHD-10.H264.FHD</li>
<li>TESHD-10.H264.2K</li>
<li>TESHD-10.H264.4K</li>
<li>TESHD-10.H265.SD</li>
<li>TESHD-10.H265.HD</li>
<li>TESHD-10.H265.FHD</li>
<li>TESHD-10.H265.2K</li>
<li>TESHD-10.H265.4K</li>
<li>Edit.Audio</li>
<li>Edit.H264.SD</li>
<li>Edit.H264.HD</li>
<li>Edit.H264.FHD</li>
<li>Edit.H264.2K</li>
<li>Edit.H264.4K</li>
<li>Edit.H265.SD</li>
<li>Edit.H265.HD</li>
<li>Edit.H265.FHD</li>
<li>Edit.H265.2K</li>
<li>Edit.H265.4K</li>
<li>Edit.TESHD-10.H264.SD</li>
<li>Edit.TESHD-10.H264.HD</li>
<li>Edit.TESHD-10.H264.FHD</li>
<li>Edit.TESHD-10.H264.2K</li>
<li>Edit.TESHD-10.H264.4K</li>
<li>Edit.TESHD-10.H265.SD</li>
<li>Edit.TESHD-10.H265.HD</li>
<li>Edit.TESHD-10.H265.FHD</li>
<li>Edit.TESHD-10.H265.2K</li>
<li>Edit.TESHD-10.H265.4K</li>
Watermark removal:
<li>480P: 640 x 480 and below</li>
<li>720P: 1280 x 720 and below</li>
<li>1080P: 1920 x 1080 and below</li>
<li>2K: 2560 x 1440 and below</li>
<li>4K: 3840 x 2160 and below</li>
<li>8K: 7680 x 4320 and below</li> 
     * @return Details The detailed statistics of different tasks.
Transcoding:
<li>Remuxing</li>
<li>Audio</li>
<li>Standard.H264.SD</li>
<li>Standard.H264.HD</li>
<li>Standard.H264.FHD</li>
<li>Standard.H264.2K</li>
<li>Standard.H264.4K</li>
<li>Standard.H265.SD</li>
<li>Standard.H265.HD</li>
<li>Standard.H265.FHD</li>
<li>Standard.H265.2K</li>
<li>Standard.H265.4K</li>
<li>TESHD-10.H264.SD</li>
<li>TESHD-10.H264.HD</li>
<li>TESHD-10.H264.FHD</li>
<li>TESHD-10.H264.2K</li>
<li>TESHD-10.H264.4K</li>
<li>TESHD-10.H265.SD</li>
<li>TESHD-10.H265.HD</li>
<li>TESHD-10.H265.FHD</li>
<li>TESHD-10.H265.2K</li>
<li>TESHD-10.H265.4K</li>
<li>Edit.Audio</li>
<li>Edit.H264.SD</li>
<li>Edit.H264.HD</li>
<li>Edit.H264.FHD</li>
<li>Edit.H264.2K</li>
<li>Edit.H264.4K</li>
<li>Edit.H265.SD</li>
<li>Edit.H265.HD</li>
<li>Edit.H265.FHD</li>
<li>Edit.H265.2K</li>
<li>Edit.H265.4K</li>
<li>Edit.TESHD-10.H264.SD</li>
<li>Edit.TESHD-10.H264.HD</li>
<li>Edit.TESHD-10.H264.FHD</li>
<li>Edit.TESHD-10.H264.2K</li>
<li>Edit.TESHD-10.H264.4K</li>
<li>Edit.TESHD-10.H265.SD</li>
<li>Edit.TESHD-10.H265.HD</li>
<li>Edit.TESHD-10.H265.FHD</li>
<li>Edit.TESHD-10.H265.2K</li>
<li>Edit.TESHD-10.H265.4K</li>
Watermark removal:
<li>480P: 640 x 480 and below</li>
<li>720P: 1280 x 720 and below</li>
<li>1080P: 1920 x 1080 and below</li>
<li>2K: 2560 x 1440 and below</li>
<li>4K: 3840 x 2160 and below</li>
<li>8K: 7680 x 4320 and below</li>
     */
    public SpecificationDataItem [] getDetails() {
        return this.Details;
    }

    /**
     * Set The detailed statistics of different tasks.
Transcoding:
<li>Remuxing</li>
<li>Audio</li>
<li>Standard.H264.SD</li>
<li>Standard.H264.HD</li>
<li>Standard.H264.FHD</li>
<li>Standard.H264.2K</li>
<li>Standard.H264.4K</li>
<li>Standard.H265.SD</li>
<li>Standard.H265.HD</li>
<li>Standard.H265.FHD</li>
<li>Standard.H265.2K</li>
<li>Standard.H265.4K</li>
<li>TESHD-10.H264.SD</li>
<li>TESHD-10.H264.HD</li>
<li>TESHD-10.H264.FHD</li>
<li>TESHD-10.H264.2K</li>
<li>TESHD-10.H264.4K</li>
<li>TESHD-10.H265.SD</li>
<li>TESHD-10.H265.HD</li>
<li>TESHD-10.H265.FHD</li>
<li>TESHD-10.H265.2K</li>
<li>TESHD-10.H265.4K</li>
<li>Edit.Audio</li>
<li>Edit.H264.SD</li>
<li>Edit.H264.HD</li>
<li>Edit.H264.FHD</li>
<li>Edit.H264.2K</li>
<li>Edit.H264.4K</li>
<li>Edit.H265.SD</li>
<li>Edit.H265.HD</li>
<li>Edit.H265.FHD</li>
<li>Edit.H265.2K</li>
<li>Edit.H265.4K</li>
<li>Edit.TESHD-10.H264.SD</li>
<li>Edit.TESHD-10.H264.HD</li>
<li>Edit.TESHD-10.H264.FHD</li>
<li>Edit.TESHD-10.H264.2K</li>
<li>Edit.TESHD-10.H264.4K</li>
<li>Edit.TESHD-10.H265.SD</li>
<li>Edit.TESHD-10.H265.HD</li>
<li>Edit.TESHD-10.H265.FHD</li>
<li>Edit.TESHD-10.H265.2K</li>
<li>Edit.TESHD-10.H265.4K</li>
Watermark removal:
<li>480P: 640 x 480 and below</li>
<li>720P: 1280 x 720 and below</li>
<li>1080P: 1920 x 1080 and below</li>
<li>2K: 2560 x 1440 and below</li>
<li>4K: 3840 x 2160 and below</li>
<li>8K: 7680 x 4320 and below</li>
     * @param Details The detailed statistics of different tasks.
Transcoding:
<li>Remuxing</li>
<li>Audio</li>
<li>Standard.H264.SD</li>
<li>Standard.H264.HD</li>
<li>Standard.H264.FHD</li>
<li>Standard.H264.2K</li>
<li>Standard.H264.4K</li>
<li>Standard.H265.SD</li>
<li>Standard.H265.HD</li>
<li>Standard.H265.FHD</li>
<li>Standard.H265.2K</li>
<li>Standard.H265.4K</li>
<li>TESHD-10.H264.SD</li>
<li>TESHD-10.H264.HD</li>
<li>TESHD-10.H264.FHD</li>
<li>TESHD-10.H264.2K</li>
<li>TESHD-10.H264.4K</li>
<li>TESHD-10.H265.SD</li>
<li>TESHD-10.H265.HD</li>
<li>TESHD-10.H265.FHD</li>
<li>TESHD-10.H265.2K</li>
<li>TESHD-10.H265.4K</li>
<li>Edit.Audio</li>
<li>Edit.H264.SD</li>
<li>Edit.H264.HD</li>
<li>Edit.H264.FHD</li>
<li>Edit.H264.2K</li>
<li>Edit.H264.4K</li>
<li>Edit.H265.SD</li>
<li>Edit.H265.HD</li>
<li>Edit.H265.FHD</li>
<li>Edit.H265.2K</li>
<li>Edit.H265.4K</li>
<li>Edit.TESHD-10.H264.SD</li>
<li>Edit.TESHD-10.H264.HD</li>
<li>Edit.TESHD-10.H264.FHD</li>
<li>Edit.TESHD-10.H264.2K</li>
<li>Edit.TESHD-10.H264.4K</li>
<li>Edit.TESHD-10.H265.SD</li>
<li>Edit.TESHD-10.H265.HD</li>
<li>Edit.TESHD-10.H265.FHD</li>
<li>Edit.TESHD-10.H265.2K</li>
<li>Edit.TESHD-10.H265.4K</li>
Watermark removal:
<li>480P: 640 x 480 and below</li>
<li>720P: 1280 x 720 and below</li>
<li>1080P: 1920 x 1080 and below</li>
<li>2K: 2560 x 1440 and below</li>
<li>4K: 3840 x 2160 and below</li>
<li>8K: 7680 x 4320 and below</li>
     */
    public void setDetails(SpecificationDataItem [] Details) {
        this.Details = Details;
    }

    public TaskStatData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatData(TaskStatData source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Summary != null) {
            this.Summary = new TaskStatDataItem[source.Summary.length];
            for (int i = 0; i < source.Summary.length; i++) {
                this.Summary[i] = new TaskStatDataItem(source.Summary[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new SpecificationDataItem[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new SpecificationDataItem(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "Summary.", this.Summary);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

