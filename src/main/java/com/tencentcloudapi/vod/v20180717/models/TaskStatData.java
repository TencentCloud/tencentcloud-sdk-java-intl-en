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

public class TaskStatData extends AbstractModel {

    /**
    * Task type.
<li> Transcoding: standard transcoding.</li>
<li> Transcoding-TESHD: TSC transcoding.</li>
<li> Editing: video editing</li>
<li> Editing-TESHD: extremely fast high-definition video editing</li>
<li> AdaptiveBitrateStreaming: adaptive bitrate streaming.</li>
<li> ContentAudit: content moderation.</li>
<li>ContentRecognition: content recognition.</li>
<li> RemoveWatermark: watermark removal</li>
<li> ExtractTraceWatermark: extract watermark.</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: audio and video quality revival</li>
<li> QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcoding, including standard transcoding, top speed Codec, and video editing (not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: real-time encryption</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Statistical data overview of the number of tasks. Amount unit: seconds.
    */
    @SerializedName("Summary")
    @Expose
    private TaskStatDataItem [] Summary;

    /**
    * Details of task statistics data for varying specifications.
Transcoding specification:
<li>Remuxing: transmuxing</li>
<li>Audio: audio transcoding.</li>
<li>Standard.H264.SD: H.264 encoding for SD transcoding</li>
<li>Standard.H264.HD: H.264 encoding for high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding for full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode.</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding mode SD transcoding</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding.</li>
<li>Standard.H265.FHD: H.265 encoding for full high-definition transcoding</li>
<li>Standard.H265.2K: H.265 encoding 2K transcode.</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding SD TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding for SD video editing</li>
<li>Edit.H264.HD: H.264 encoding for high-definition video editing</li>
<li>Edit.H264.FHD: Full HD video editing with H.264 encoding</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding for 4K video editing</li>
<li>Edit.H265.SD: H.265 encoding SD video editing</li>
<li>Edit.H265.HD: H.265 encoding for high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding for SD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: H.264 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265 encoding for standard definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: H.265 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal and audio and video quality revival specifications:
<li>480P: short side ≤ 480px</li>
<li>720P: Short side ≤ 720px</li>
<li>1080P: Short side ≤ 1080px</li>
<li>2K: Short side ≤ 1440px</li>
<li>4K: short side ≤ 2160px</li>
<li>8K: short side ≤ 4320px</li>
<li>Audio: audio.</li>
Real-time transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding.</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT audio transcoding</li>
<li>JITTranscoding.Copy: remux JIT transcoding</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite.</li>
    */
    @SerializedName("Details")
    @Expose
    private SpecificationDataItem [] Details;

    /**
     * Get Task type.
<li> Transcoding: standard transcoding.</li>
<li> Transcoding-TESHD: TSC transcoding.</li>
<li> Editing: video editing</li>
<li> Editing-TESHD: extremely fast high-definition video editing</li>
<li> AdaptiveBitrateStreaming: adaptive bitrate streaming.</li>
<li> ContentAudit: content moderation.</li>
<li>ContentRecognition: content recognition.</li>
<li> RemoveWatermark: watermark removal</li>
<li> ExtractTraceWatermark: extract watermark.</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: audio and video quality revival</li>
<li> QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcoding, including standard transcoding, top speed Codec, and video editing (not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: real-time encryption</li> 
     * @return TaskType Task type.
<li> Transcoding: standard transcoding.</li>
<li> Transcoding-TESHD: TSC transcoding.</li>
<li> Editing: video editing</li>
<li> Editing-TESHD: extremely fast high-definition video editing</li>
<li> AdaptiveBitrateStreaming: adaptive bitrate streaming.</li>
<li> ContentAudit: content moderation.</li>
<li>ContentRecognition: content recognition.</li>
<li> RemoveWatermark: watermark removal</li>
<li> ExtractTraceWatermark: extract watermark.</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: audio and video quality revival</li>
<li> QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcoding, including standard transcoding, top speed Codec, and video editing (not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: real-time encryption</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type.
<li> Transcoding: standard transcoding.</li>
<li> Transcoding-TESHD: TSC transcoding.</li>
<li> Editing: video editing</li>
<li> Editing-TESHD: extremely fast high-definition video editing</li>
<li> AdaptiveBitrateStreaming: adaptive bitrate streaming.</li>
<li> ContentAudit: content moderation.</li>
<li>ContentRecognition: content recognition.</li>
<li> RemoveWatermark: watermark removal</li>
<li> ExtractTraceWatermark: extract watermark.</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: audio and video quality revival</li>
<li> QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcoding, including standard transcoding, top speed Codec, and video editing (not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: real-time encryption</li>
     * @param TaskType Task type.
<li> Transcoding: standard transcoding.</li>
<li> Transcoding-TESHD: TSC transcoding.</li>
<li> Editing: video editing</li>
<li> Editing-TESHD: extremely fast high-definition video editing</li>
<li> AdaptiveBitrateStreaming: adaptive bitrate streaming.</li>
<li> ContentAudit: content moderation.</li>
<li>ContentRecognition: content recognition.</li>
<li> RemoveWatermark: watermark removal</li>
<li> ExtractTraceWatermark: extract watermark.</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: audio and video quality revival</li>
<li> QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcoding, including standard transcoding, top speed Codec, and video editing (not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: real-time encryption</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Statistical data overview of the number of tasks. Amount unit: seconds. 
     * @return Summary Statistical data overview of the number of tasks. Amount unit: seconds.
     */
    public TaskStatDataItem [] getSummary() {
        return this.Summary;
    }

    /**
     * Set Statistical data overview of the number of tasks. Amount unit: seconds.
     * @param Summary Statistical data overview of the number of tasks. Amount unit: seconds.
     */
    public void setSummary(TaskStatDataItem [] Summary) {
        this.Summary = Summary;
    }

    /**
     * Get Details of task statistics data for varying specifications.
Transcoding specification:
<li>Remuxing: transmuxing</li>
<li>Audio: audio transcoding.</li>
<li>Standard.H264.SD: H.264 encoding for SD transcoding</li>
<li>Standard.H264.HD: H.264 encoding for high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding for full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode.</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding mode SD transcoding</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding.</li>
<li>Standard.H265.FHD: H.265 encoding for full high-definition transcoding</li>
<li>Standard.H265.2K: H.265 encoding 2K transcode.</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding SD TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding for SD video editing</li>
<li>Edit.H264.HD: H.264 encoding for high-definition video editing</li>
<li>Edit.H264.FHD: Full HD video editing with H.264 encoding</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding for 4K video editing</li>
<li>Edit.H265.SD: H.265 encoding SD video editing</li>
<li>Edit.H265.HD: H.265 encoding for high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding for SD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: H.264 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265 encoding for standard definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: H.265 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal and audio and video quality revival specifications:
<li>480P: short side ≤ 480px</li>
<li>720P: Short side ≤ 720px</li>
<li>1080P: Short side ≤ 1080px</li>
<li>2K: Short side ≤ 1440px</li>
<li>4K: short side ≤ 2160px</li>
<li>8K: short side ≤ 4320px</li>
<li>Audio: audio.</li>
Real-time transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding.</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT audio transcoding</li>
<li>JITTranscoding.Copy: remux JIT transcoding</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite.</li> 
     * @return Details Details of task statistics data for varying specifications.
Transcoding specification:
<li>Remuxing: transmuxing</li>
<li>Audio: audio transcoding.</li>
<li>Standard.H264.SD: H.264 encoding for SD transcoding</li>
<li>Standard.H264.HD: H.264 encoding for high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding for full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode.</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding mode SD transcoding</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding.</li>
<li>Standard.H265.FHD: H.265 encoding for full high-definition transcoding</li>
<li>Standard.H265.2K: H.265 encoding 2K transcode.</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding SD TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding for SD video editing</li>
<li>Edit.H264.HD: H.264 encoding for high-definition video editing</li>
<li>Edit.H264.FHD: Full HD video editing with H.264 encoding</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding for 4K video editing</li>
<li>Edit.H265.SD: H.265 encoding SD video editing</li>
<li>Edit.H265.HD: H.265 encoding for high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding for SD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: H.264 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265 encoding for standard definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: H.265 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal and audio and video quality revival specifications:
<li>480P: short side ≤ 480px</li>
<li>720P: Short side ≤ 720px</li>
<li>1080P: Short side ≤ 1080px</li>
<li>2K: Short side ≤ 1440px</li>
<li>4K: short side ≤ 2160px</li>
<li>8K: short side ≤ 4320px</li>
<li>Audio: audio.</li>
Real-time transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding.</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT audio transcoding</li>
<li>JITTranscoding.Copy: remux JIT transcoding</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite.</li>
     */
    public SpecificationDataItem [] getDetails() {
        return this.Details;
    }

    /**
     * Set Details of task statistics data for varying specifications.
Transcoding specification:
<li>Remuxing: transmuxing</li>
<li>Audio: audio transcoding.</li>
<li>Standard.H264.SD: H.264 encoding for SD transcoding</li>
<li>Standard.H264.HD: H.264 encoding for high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding for full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode.</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding mode SD transcoding</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding.</li>
<li>Standard.H265.FHD: H.265 encoding for full high-definition transcoding</li>
<li>Standard.H265.2K: H.265 encoding 2K transcode.</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding SD TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding for SD video editing</li>
<li>Edit.H264.HD: H.264 encoding for high-definition video editing</li>
<li>Edit.H264.FHD: Full HD video editing with H.264 encoding</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding for 4K video editing</li>
<li>Edit.H265.SD: H.265 encoding SD video editing</li>
<li>Edit.H265.HD: H.265 encoding for high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding for SD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: H.264 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265 encoding for standard definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: H.265 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal and audio and video quality revival specifications:
<li>480P: short side ≤ 480px</li>
<li>720P: Short side ≤ 720px</li>
<li>1080P: Short side ≤ 1080px</li>
<li>2K: Short side ≤ 1440px</li>
<li>4K: short side ≤ 2160px</li>
<li>8K: short side ≤ 4320px</li>
<li>Audio: audio.</li>
Real-time transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding.</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT audio transcoding</li>
<li>JITTranscoding.Copy: remux JIT transcoding</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite.</li>
     * @param Details Details of task statistics data for varying specifications.
Transcoding specification:
<li>Remuxing: transmuxing</li>
<li>Audio: audio transcoding.</li>
<li>Standard.H264.SD: H.264 encoding for SD transcoding</li>
<li>Standard.H264.HD: H.264 encoding for high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding for full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode.</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding mode SD transcoding</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding.</li>
<li>Standard.H265.FHD: H.265 encoding for full high-definition transcoding</li>
<li>Standard.H265.2K: H.265 encoding 2K transcode.</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding SD TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding for SD video editing</li>
<li>Edit.H264.HD: H.264 encoding for high-definition video editing</li>
<li>Edit.H264.FHD: Full HD video editing with H.264 encoding</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding for 4K video editing</li>
<li>Edit.H265.SD: H.265 encoding SD video editing</li>
<li>Edit.H265.HD: H.265 encoding for high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding for SD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: H.264 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265 encoding for standard definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: H.265 encoding full HD extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal and audio and video quality revival specifications:
<li>480P: short side ≤ 480px</li>
<li>720P: Short side ≤ 720px</li>
<li>1080P: Short side ≤ 1080px</li>
<li>2K: Short side ≤ 1440px</li>
<li>4K: short side ≤ 2160px</li>
<li>8K: short side ≤ 4320px</li>
<li>Audio: audio.</li>
Real-time transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding.</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT audio transcoding</li>
<li>JITTranscoding.Copy: remux JIT transcoding</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot.</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite.</li>
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

