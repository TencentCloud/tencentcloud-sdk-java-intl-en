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
<li>Transcoding: standard transcoding</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li> Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Watermark removal</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Instant encryption</li>
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
    * Task statistics data of different specifications.
Transcoding specification:
<li>Remuxing: conversion to muxing.</li>
<li>Audio: audio transcoding</li>
<li>Standard.H264.SD: H.264 encoding standard-definition transcoding</li>
<li>Standard.H264.HD: H.264 encoding high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding standard definition transcode</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding</li>
<li>Standard.H265.FHD: H.265 encoding full HD transcoding</li>
<li>Standard.H265.2K: 2K transcoding with H.265 encoding</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding type standard definition TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding type 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding type SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding type high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding type 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding standard-definition video editing</li>
<li>Edit.H264.HD: H.264 encoding high-definition video edit</li>
<li>Edit.H264.FHD: H.264 Full HD video editing</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding 4K video editing</li>
<li>Edit.H265.SD: H.265-encoded standard-definition video editing</li>
<li>Edit.H265.HD: H.265 encoding high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding type standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: Full HD extremely fast high-definition video editing with H.264 encoding</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding mode 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265-encoded standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: Full HD extremely fast high-definition video editing with H.265 encoding</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal, audio and video quality revival specification:
<li>480P: Short edge ≤ 480px</li>
<li>720P: Short edge ≤ 720px</li>
<li>1080P: Short edge ≤ 1080px</li>
<li>2K: Short edge ≤ 1440px</li>
<li>4K: Short edge ≤ 2160px</li>
<li>8K: Short edge ≤ 4320px</li>
<li>Audio: audio</li>
Instant transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding type 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT transcoding for audio</li>
<li>JITTranscoding.Copy: JIT transcoding remuxing</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite sheet</li>
    */
    @SerializedName("Details")
    @Expose
    private SpecificationDataItem [] Details;

    /**
     * Get Task type.
<li>Transcoding: standard transcoding</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li> Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Watermark removal</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Instant encryption</li> 
     * @return TaskType Task type.
<li>Transcoding: standard transcoding</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li> Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Watermark removal</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Instant encryption</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type.
<li>Transcoding: standard transcoding</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li> Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Watermark removal</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Instant encryption</li>
     * @param TaskType Task type.
<li>Transcoding: standard transcoding</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li> Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Watermark removal</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Instant encryption</li>
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
     * Get Task statistics data of different specifications.
Transcoding specification:
<li>Remuxing: conversion to muxing.</li>
<li>Audio: audio transcoding</li>
<li>Standard.H264.SD: H.264 encoding standard-definition transcoding</li>
<li>Standard.H264.HD: H.264 encoding high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding standard definition transcode</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding</li>
<li>Standard.H265.FHD: H.265 encoding full HD transcoding</li>
<li>Standard.H265.2K: 2K transcoding with H.265 encoding</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding type standard definition TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding type 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding type SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding type high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding type 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding standard-definition video editing</li>
<li>Edit.H264.HD: H.264 encoding high-definition video edit</li>
<li>Edit.H264.FHD: H.264 Full HD video editing</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding 4K video editing</li>
<li>Edit.H265.SD: H.265-encoded standard-definition video editing</li>
<li>Edit.H265.HD: H.265 encoding high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding type standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: Full HD extremely fast high-definition video editing with H.264 encoding</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding mode 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265-encoded standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: Full HD extremely fast high-definition video editing with H.265 encoding</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal, audio and video quality revival specification:
<li>480P: Short edge ≤ 480px</li>
<li>720P: Short edge ≤ 720px</li>
<li>1080P: Short edge ≤ 1080px</li>
<li>2K: Short edge ≤ 1440px</li>
<li>4K: Short edge ≤ 2160px</li>
<li>8K: Short edge ≤ 4320px</li>
<li>Audio: audio</li>
Instant transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding type 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT transcoding for audio</li>
<li>JITTranscoding.Copy: JIT transcoding remuxing</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite sheet</li> 
     * @return Details Task statistics data of different specifications.
Transcoding specification:
<li>Remuxing: conversion to muxing.</li>
<li>Audio: audio transcoding</li>
<li>Standard.H264.SD: H.264 encoding standard-definition transcoding</li>
<li>Standard.H264.HD: H.264 encoding high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding standard definition transcode</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding</li>
<li>Standard.H265.FHD: H.265 encoding full HD transcoding</li>
<li>Standard.H265.2K: 2K transcoding with H.265 encoding</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding type standard definition TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding type 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding type SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding type high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding type 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding standard-definition video editing</li>
<li>Edit.H264.HD: H.264 encoding high-definition video edit</li>
<li>Edit.H264.FHD: H.264 Full HD video editing</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding 4K video editing</li>
<li>Edit.H265.SD: H.265-encoded standard-definition video editing</li>
<li>Edit.H265.HD: H.265 encoding high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding type standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: Full HD extremely fast high-definition video editing with H.264 encoding</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding mode 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265-encoded standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: Full HD extremely fast high-definition video editing with H.265 encoding</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal, audio and video quality revival specification:
<li>480P: Short edge ≤ 480px</li>
<li>720P: Short edge ≤ 720px</li>
<li>1080P: Short edge ≤ 1080px</li>
<li>2K: Short edge ≤ 1440px</li>
<li>4K: Short edge ≤ 2160px</li>
<li>8K: Short edge ≤ 4320px</li>
<li>Audio: audio</li>
Instant transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding type 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT transcoding for audio</li>
<li>JITTranscoding.Copy: JIT transcoding remuxing</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite sheet</li>
     */
    public SpecificationDataItem [] getDetails() {
        return this.Details;
    }

    /**
     * Set Task statistics data of different specifications.
Transcoding specification:
<li>Remuxing: conversion to muxing.</li>
<li>Audio: audio transcoding</li>
<li>Standard.H264.SD: H.264 encoding standard-definition transcoding</li>
<li>Standard.H264.HD: H.264 encoding high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding standard definition transcode</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding</li>
<li>Standard.H265.FHD: H.265 encoding full HD transcoding</li>
<li>Standard.H265.2K: 2K transcoding with H.265 encoding</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding type standard definition TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding type 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding type SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding type high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding type 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding standard-definition video editing</li>
<li>Edit.H264.HD: H.264 encoding high-definition video edit</li>
<li>Edit.H264.FHD: H.264 Full HD video editing</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding 4K video editing</li>
<li>Edit.H265.SD: H.265-encoded standard-definition video editing</li>
<li>Edit.H265.HD: H.265 encoding high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding type standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: Full HD extremely fast high-definition video editing with H.264 encoding</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding mode 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265-encoded standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: Full HD extremely fast high-definition video editing with H.265 encoding</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal, audio and video quality revival specification:
<li>480P: Short edge ≤ 480px</li>
<li>720P: Short edge ≤ 720px</li>
<li>1080P: Short edge ≤ 1080px</li>
<li>2K: Short edge ≤ 1440px</li>
<li>4K: Short edge ≤ 2160px</li>
<li>8K: Short edge ≤ 4320px</li>
<li>Audio: audio</li>
Instant transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding type 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT transcoding for audio</li>
<li>JITTranscoding.Copy: JIT transcoding remuxing</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite sheet</li>
     * @param Details Task statistics data of different specifications.
Transcoding specification:
<li>Remuxing: conversion to muxing.</li>
<li>Audio: audio transcoding</li>
<li>Standard.H264.SD: H.264 encoding standard-definition transcoding</li>
<li>Standard.H264.HD: H.264 encoding high-definition transcoding</li>
<li>Standard.H264.FHD: H.264 encoding full high-definition transcoding</li>
<li>Standard.H264.2K: H.264 encoding 2K transcode</li>
<li>Standard.H264.4K: H.264 encoding 4K transcode</li>
<li>Standard.H265.SD: H.265 encoding standard definition transcode</li>
<li>Standard.H265.HD: H.265 encoding high-definition transcoding</li>
<li>Standard.H265.FHD: H.265 encoding full HD transcoding</li>
<li>Standard.H265.2K: 2K transcoding with H.265 encoding</li>
<li>Standard.H265.4K: H.265 encoding 4K transcode</li>
<li>TESHD-10.H264.SD: H.264 encoding type standard definition TSC transcoding</li>
<li>TESHD-10.H264.HD: H.264 encoding high-definition TSC transcoding</li>
<li>TESHD-10.H264.FHD: H.264 full HD TSC transcoding</li>
<li>TESHD-10.H264.2K: H.264 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H264.4K: H.264 encoding type 4K TSC transcoding</li>
<li>TESHD-10.H265.SD: H.265 encoding type SD TSC transcoding</li>
<li>TESHD-10.H265.HD: H.265 encoding type high-definition TSC transcoding</li>
<li>TESHD-10.H265.FHD: H.265 encoding full HD TSC transcoding</li>
<li>TESHD-10.H265.2K: H.265 encoding type 2K TSC transcoding</li>
<li>TESHD-10.H265.4K: H.265 encoding type 4K TSC transcoding</li>
<li>Edit.Audio: audio editing</li>
<li>Edit.H264.SD: H.264 encoding standard-definition video editing</li>
<li>Edit.H264.HD: H.264 encoding high-definition video edit</li>
<li>Edit.H264.FHD: H.264 Full HD video editing</li>
<li>Edit.H264.2K: H.264 encoding 2K video editing</li>
<li>Edit.H264.4K: H.264 encoding 4K video editing</li>
<li>Edit.H265.SD: H.265-encoded standard-definition video editing</li>
<li>Edit.H265.HD: H.265 encoding high-definition video editing</li>
<li>Edit.H265.FHD: Full HD video editing with H.265 encoding</li>
<li>Edit.H265.2K: H.265 encoding 2K video editing</li>
<li>Edit.H265.4K: H.265 encoding 4K video editing</li>
<li>Edit.TESHD-10.H264.SD: H.264 encoding type standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.HD: H.264 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.FHD: Full HD extremely fast high-definition video editing with H.264 encoding</li>
<li>Edit.TESHD-10.H264.2K: H.264 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H264.4K: H.264 encoding mode 4K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.SD: H.265-encoded standard-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.HD: H.265 encoding high-definition extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.FHD: Full HD extremely fast high-definition video editing with H.265 encoding</li>
<li>Edit.TESHD-10.H265.2K: H.265 encoding 2K extremely fast high-definition video editing</li>
<li>Edit.TESHD-10.H265.4K: H.265 encoding 4K extremely fast high-definition video editing</li>
Watermark removal, audio and video quality revival specification:
<li>480P: Short edge ≤ 480px</li>
<li>720P: Short edge ≤ 720px</li>
<li>1080P: Short edge ≤ 1080px</li>
<li>2K: Short edge ≤ 1440px</li>
<li>4K: Short edge ≤ 2160px</li>
<li>8K: Short edge ≤ 4320px</li>
<li>Audio: audio</li>
Instant transcoding specification:
<li>JITTranscoding.H264.SD: H.264 encoding standard definition JIT transcoding</li>
<li>JITTranscoding.H264.HD: H.264 encoding high-definition JIT transcoding</li>
<li>JITTranscoding.H264.FHD: H.264 encoding full HD JIT transcoding</li>
<li>JITTranscoding.H264.2K: H.264 encoding type 2K JIT transcoding</li>
<li>JITTranscoding.Audio: JIT transcoding for audio</li>
<li>JITTranscoding.Copy: JIT transcoding remuxing</li>
Video screenshot specification:
<li>SnapshotByTimeOffset: time point screenshot</li>
<li>SampleSnapshot: sampled screenshot</li>
<li>ImageSprite: sprite sheet</li>
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

