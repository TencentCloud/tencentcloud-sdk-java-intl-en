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

public class EventContent extends AbstractModel {

    /**
    * Event handler. The caller must call ConfirmEvents to acknowledge the message has been received. Confirmed Valid Time is 30 seconds. After expiration, the event can be retrieved again.
    */
    @SerializedName("EventHandle")
    @Expose
    private String EventHandle;

    /**
    * <b>Supported event types:</b>
<li>NewFileUpload: Video upload completed;</li>
<li>ProcedureStateChanged: Task flow status change.</li>
<li>FileDeleted: Video deletion completed;</li>
<li>RestoreMediaComplete: Video retrieval completion;</li>
<li>PullComplete: Video conversion pull completed.</li>
<li>EditMediaComplete: Video editing completed;</li>
<li>SplitMediaComplete: Video splitting completed;</li>
<li>ComposeMediaComplete: Media file creation completion;</li>
<li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li>
<li>RemoveWatermark: Intelligent watermark removal completion.</li>
<li>RebuildMediaComplete: Audio and video quality rebirth completion event (This is not recommended).</li>
<li>ReviewAudioVideoComplete: Audio/video moderation completed;</li>
<li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li>
<li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion.</li>
<li>DescribeFileAttributesComplete: File attribute acquisition completion.</li>
<li>QualityInspectComplete: Audio and video quality inspection completed;</li>
<li>QualityEnhanceComplete: Audio and video quality rebirth task completion;</li>
<li>PersistenceComplete: Edit completed.</li>
<li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completed.</li>
<li>ProcessMediaByMPSComplete: MPS video processing is completed.</li>
<li>AigcImageTaskComplete: AIGC image generation task complete.</li>
<li>AigcVideoTaskComplete: AIGC video generation task completed.</li>
<b>Event types compatible with the 2017 version:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: Video splicing completion.</li>
<li>ClipComplete: Video editing completed;</li>
<li>CreateImageSpriteComplete: Video thumbnail capture completion.</li>
<li>CreateSnapshotByTimeOffsetComplete: Video screenshot by time point.</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Video upload completion event. Valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileUploadEvent")
    @Expose
    private FileUploadTask FileUploadEvent;

    /**
    * Task flow status change event. Valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcedureStateChangeEvent")
    @Expose
    private ProcedureTask ProcedureStateChangeEvent;

    /**
    * File deletion event. Valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileDeleteEvent")
    @Expose
    private FileDeleteTask FileDeleteEvent;

    /**
    * Video pull completion event. Valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PullCompleteEvent")
    @Expose
    private PullUploadTask PullCompleteEvent;

    /**
    * Video editing completion event. Valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EditMediaCompleteEvent")
    @Expose
    private EditMediaTask EditMediaCompleteEvent;

    /**
    * Video splitting completion event. Valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SplitMediaCompleteEvent")
    @Expose
    private SplitMediaTask SplitMediaCompleteEvent;

    /**
    * Media file creation task completion event. Valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComposeMediaCompleteEvent")
    @Expose
    private ComposeMediaTask ComposeMediaCompleteEvent;

    /**
    * Video editing completion event. Valid when the event type is ClipComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClipCompleteEvent")
    @Expose
    private ClipTask2017 ClipCompleteEvent;

    /**
    * Video transcoding completion event, valid when the event type is TranscodeComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeCompleteEvent")
    @Expose
    private TranscodeTask2017 TranscodeCompleteEvent;

    /**
    * Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateImageSpriteCompleteEvent")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent;

    /**
    * Video splicing completion event. Valid when the event type is ConcatComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConcatCompleteEvent")
    @Expose
    private ConcatTask2017 ConcatCompleteEvent;

    /**
    * Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetCompleteEvent")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent;

    /**
    * WeChat Publishing Completion Event. Valid when the event type is WechatPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatPublishCompleteEvent")
    @Expose
    private WechatPublishTask WechatPublishCompleteEvent;

    /**
    * WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatMiniProgramPublishCompleteEvent")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent;

    /**
    * Intelligent Watermark Removal Completion Event is valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemoveWatermarkCompleteEvent")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkCompleteEvent;

    /**
    * Video retrieval completion event. Valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RestoreMediaCompleteEvent")
    @Expose
    private RestoreMediaTask RestoreMediaCompleteEvent;

    /**
    * Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RebuildMediaCompleteEvent")
    @Expose
    private RebuildMediaTask RebuildMediaCompleteEvent;

    /**
    * Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtractTraceWatermarkCompleteEvent")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent;

    /**
    * Copyright watermark extraction completion event. Valid when the event type is ExtractCopyRightWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtractCopyRightWatermarkCompleteEvent")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent;

    /**
    * Audio/video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReviewAudioVideoCompleteEvent")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoCompleteEvent;

    /**
    * This field is invalid.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReduceMediaBitrateCompleteEvent")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent;

    /**
    * File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DescribeFileAttributesCompleteEvent")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesCompleteEvent;

    /**
    * Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityInspectCompleteEvent")
    @Expose
    private QualityInspectTask QualityInspectCompleteEvent;

    /**
    * Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityEnhanceCompleteEvent")
    @Expose
    private QualityEnhanceTask QualityEnhanceCompleteEvent;

    /**
    * MediaCastStatus changed event, valid when the event type is MediaCastStatusChanged.
Pay attention to: this field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MediaCastStatusChangedEvent")
    @Expose
    private MediaCastEvent MediaCastStatusChangedEvent;

    /**
    * Editing solidification completion event. Valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersistenceCompleteEvent")
    @Expose
    private PersistenceCompleteTask PersistenceCompleteEvent;

    /**
    * Adaptive bitrate task information, valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingCompleteEvent")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent;

    /**
    * MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.
    */
    @SerializedName("ProcessMediaByMPSCompleteEvent")
    @Expose
    private ProcessMediaByMPS ProcessMediaByMPSCompleteEvent;

    /**
    * AIGC image generation task info. Valid only when EventType is AigcImageTaskComplete.
    */
    @SerializedName("AigcImageCompleteEvent")
    @Expose
    private AigcImageTask AigcImageCompleteEvent;

    /**
    * AIGC video task info. Valid only when EventType is AigcVideoTaskComplete.
    */
    @SerializedName("AigcVideoCompleteEvent")
    @Expose
    private AigcVideoTask AigcVideoCompleteEvent;

    /**
    * Extract digital watermark information. Valid at that time only when EventType is ExtractBlindWatermarkComplete.
    */
    @SerializedName("ExtractBlindWatermarkComplete")
    @Expose
    private ExtractBlindWatermarkTask ExtractBlindWatermarkComplete;

    /**
    * AIGC scenario-based image generation task info, valid only when EventType is SceneAigcImageCompleteEvent.
    */
    @SerializedName("SceneAigcImageCompleteEvent")
    @Expose
    private SceneAigcImageTask SceneAigcImageCompleteEvent;

    /**
    * Image asynchronous task processing info, valid only when EventType is ProcessImageAsyncCompleteEvent.
    */
    @SerializedName("ProcessImageAsyncCompleteEvent")
    @Expose
    private ProcessImageAsyncTask ProcessImageAsyncCompleteEvent;

    /**
     * Get Event handler. The caller must call ConfirmEvents to acknowledge the message has been received. Confirmed Valid Time is 30 seconds. After expiration, the event can be retrieved again. 
     * @return EventHandle Event handler. The caller must call ConfirmEvents to acknowledge the message has been received. Confirmed Valid Time is 30 seconds. After expiration, the event can be retrieved again.
     */
    public String getEventHandle() {
        return this.EventHandle;
    }

    /**
     * Set Event handler. The caller must call ConfirmEvents to acknowledge the message has been received. Confirmed Valid Time is 30 seconds. After expiration, the event can be retrieved again.
     * @param EventHandle Event handler. The caller must call ConfirmEvents to acknowledge the message has been received. Confirmed Valid Time is 30 seconds. After expiration, the event can be retrieved again.
     */
    public void setEventHandle(String EventHandle) {
        this.EventHandle = EventHandle;
    }

    /**
     * Get <b>Supported event types:</b>
<li>NewFileUpload: Video upload completed;</li>
<li>ProcedureStateChanged: Task flow status change.</li>
<li>FileDeleted: Video deletion completed;</li>
<li>RestoreMediaComplete: Video retrieval completion;</li>
<li>PullComplete: Video conversion pull completed.</li>
<li>EditMediaComplete: Video editing completed;</li>
<li>SplitMediaComplete: Video splitting completed;</li>
<li>ComposeMediaComplete: Media file creation completion;</li>
<li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li>
<li>RemoveWatermark: Intelligent watermark removal completion.</li>
<li>RebuildMediaComplete: Audio and video quality rebirth completion event (This is not recommended).</li>
<li>ReviewAudioVideoComplete: Audio/video moderation completed;</li>
<li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li>
<li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion.</li>
<li>DescribeFileAttributesComplete: File attribute acquisition completion.</li>
<li>QualityInspectComplete: Audio and video quality inspection completed;</li>
<li>QualityEnhanceComplete: Audio and video quality rebirth task completion;</li>
<li>PersistenceComplete: Edit completed.</li>
<li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completed.</li>
<li>ProcessMediaByMPSComplete: MPS video processing is completed.</li>
<li>AigcImageTaskComplete: AIGC image generation task complete.</li>
<li>AigcVideoTaskComplete: AIGC video generation task completed.</li>
<b>Event types compatible with the 2017 version:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: Video splicing completion.</li>
<li>ClipComplete: Video editing completed;</li>
<li>CreateImageSpriteComplete: Video thumbnail capture completion.</li>
<li>CreateSnapshotByTimeOffsetComplete: Video screenshot by time point.</li> 
     * @return EventType <b>Supported event types:</b>
<li>NewFileUpload: Video upload completed;</li>
<li>ProcedureStateChanged: Task flow status change.</li>
<li>FileDeleted: Video deletion completed;</li>
<li>RestoreMediaComplete: Video retrieval completion;</li>
<li>PullComplete: Video conversion pull completed.</li>
<li>EditMediaComplete: Video editing completed;</li>
<li>SplitMediaComplete: Video splitting completed;</li>
<li>ComposeMediaComplete: Media file creation completion;</li>
<li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li>
<li>RemoveWatermark: Intelligent watermark removal completion.</li>
<li>RebuildMediaComplete: Audio and video quality rebirth completion event (This is not recommended).</li>
<li>ReviewAudioVideoComplete: Audio/video moderation completed;</li>
<li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li>
<li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion.</li>
<li>DescribeFileAttributesComplete: File attribute acquisition completion.</li>
<li>QualityInspectComplete: Audio and video quality inspection completed;</li>
<li>QualityEnhanceComplete: Audio and video quality rebirth task completion;</li>
<li>PersistenceComplete: Edit completed.</li>
<li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completed.</li>
<li>ProcessMediaByMPSComplete: MPS video processing is completed.</li>
<li>AigcImageTaskComplete: AIGC image generation task complete.</li>
<li>AigcVideoTaskComplete: AIGC video generation task completed.</li>
<b>Event types compatible with the 2017 version:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: Video splicing completion.</li>
<li>ClipComplete: Video editing completed;</li>
<li>CreateImageSpriteComplete: Video thumbnail capture completion.</li>
<li>CreateSnapshotByTimeOffsetComplete: Video screenshot by time point.</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <b>Supported event types:</b>
<li>NewFileUpload: Video upload completed;</li>
<li>ProcedureStateChanged: Task flow status change.</li>
<li>FileDeleted: Video deletion completed;</li>
<li>RestoreMediaComplete: Video retrieval completion;</li>
<li>PullComplete: Video conversion pull completed.</li>
<li>EditMediaComplete: Video editing completed;</li>
<li>SplitMediaComplete: Video splitting completed;</li>
<li>ComposeMediaComplete: Media file creation completion;</li>
<li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li>
<li>RemoveWatermark: Intelligent watermark removal completion.</li>
<li>RebuildMediaComplete: Audio and video quality rebirth completion event (This is not recommended).</li>
<li>ReviewAudioVideoComplete: Audio/video moderation completed;</li>
<li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li>
<li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion.</li>
<li>DescribeFileAttributesComplete: File attribute acquisition completion.</li>
<li>QualityInspectComplete: Audio and video quality inspection completed;</li>
<li>QualityEnhanceComplete: Audio and video quality rebirth task completion;</li>
<li>PersistenceComplete: Edit completed.</li>
<li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completed.</li>
<li>ProcessMediaByMPSComplete: MPS video processing is completed.</li>
<li>AigcImageTaskComplete: AIGC image generation task complete.</li>
<li>AigcVideoTaskComplete: AIGC video generation task completed.</li>
<b>Event types compatible with the 2017 version:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: Video splicing completion.</li>
<li>ClipComplete: Video editing completed;</li>
<li>CreateImageSpriteComplete: Video thumbnail capture completion.</li>
<li>CreateSnapshotByTimeOffsetComplete: Video screenshot by time point.</li>
     * @param EventType <b>Supported event types:</b>
<li>NewFileUpload: Video upload completed;</li>
<li>ProcedureStateChanged: Task flow status change.</li>
<li>FileDeleted: Video deletion completed;</li>
<li>RestoreMediaComplete: Video retrieval completion;</li>
<li>PullComplete: Video conversion pull completed.</li>
<li>EditMediaComplete: Video editing completed;</li>
<li>SplitMediaComplete: Video splitting completed;</li>
<li>ComposeMediaComplete: Media file creation completion;</li>
<li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li>
<li>RemoveWatermark: Intelligent watermark removal completion.</li>
<li>RebuildMediaComplete: Audio and video quality rebirth completion event (This is not recommended).</li>
<li>ReviewAudioVideoComplete: Audio/video moderation completed;</li>
<li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li>
<li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion.</li>
<li>DescribeFileAttributesComplete: File attribute acquisition completion.</li>
<li>QualityInspectComplete: Audio and video quality inspection completed;</li>
<li>QualityEnhanceComplete: Audio and video quality rebirth task completion;</li>
<li>PersistenceComplete: Edit completed.</li>
<li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completed.</li>
<li>ProcessMediaByMPSComplete: MPS video processing is completed.</li>
<li>AigcImageTaskComplete: AIGC image generation task complete.</li>
<li>AigcVideoTaskComplete: AIGC video generation task completed.</li>
<b>Event types compatible with the 2017 version:</b>
<li>TranscodeComplete: video transcoding completion;</li>
<li>ConcatComplete: Video splicing completion.</li>
<li>ClipComplete: Video editing completed;</li>
<li>CreateImageSpriteComplete: Video thumbnail capture completion.</li>
<li>CreateSnapshotByTimeOffsetComplete: Video screenshot by time point.</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Video upload completion event. Valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileUploadEvent Video upload completion event. Valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FileUploadTask getFileUploadEvent() {
        return this.FileUploadEvent;
    }

    /**
     * Set Video upload completion event. Valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileUploadEvent Video upload completion event. Valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileUploadEvent(FileUploadTask FileUploadEvent) {
        this.FileUploadEvent = FileUploadEvent;
    }

    /**
     * Get Task flow status change event. Valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcedureStateChangeEvent Task flow status change event. Valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcedureTask getProcedureStateChangeEvent() {
        return this.ProcedureStateChangeEvent;
    }

    /**
     * Set Task flow status change event. Valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcedureStateChangeEvent Task flow status change event. Valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcedureStateChangeEvent(ProcedureTask ProcedureStateChangeEvent) {
        this.ProcedureStateChangeEvent = ProcedureStateChangeEvent;
    }

    /**
     * Get File deletion event. Valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileDeleteEvent File deletion event. Valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FileDeleteTask getFileDeleteEvent() {
        return this.FileDeleteEvent;
    }

    /**
     * Set File deletion event. Valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileDeleteEvent File deletion event. Valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileDeleteEvent(FileDeleteTask FileDeleteEvent) {
        this.FileDeleteEvent = FileDeleteEvent;
    }

    /**
     * Get Video pull completion event. Valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PullCompleteEvent Video pull completion event. Valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PullUploadTask getPullCompleteEvent() {
        return this.PullCompleteEvent;
    }

    /**
     * Set Video pull completion event. Valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PullCompleteEvent Video pull completion event. Valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPullCompleteEvent(PullUploadTask PullCompleteEvent) {
        this.PullCompleteEvent = PullCompleteEvent;
    }

    /**
     * Get Video editing completion event. Valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EditMediaCompleteEvent Video editing completion event. Valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EditMediaTask getEditMediaCompleteEvent() {
        return this.EditMediaCompleteEvent;
    }

    /**
     * Set Video editing completion event. Valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EditMediaCompleteEvent Video editing completion event. Valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEditMediaCompleteEvent(EditMediaTask EditMediaCompleteEvent) {
        this.EditMediaCompleteEvent = EditMediaCompleteEvent;
    }

    /**
     * Get Video splitting completion event. Valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SplitMediaCompleteEvent Video splitting completion event. Valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SplitMediaTask getSplitMediaCompleteEvent() {
        return this.SplitMediaCompleteEvent;
    }

    /**
     * Set Video splitting completion event. Valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SplitMediaCompleteEvent Video splitting completion event. Valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSplitMediaCompleteEvent(SplitMediaTask SplitMediaCompleteEvent) {
        this.SplitMediaCompleteEvent = SplitMediaCompleteEvent;
    }

    /**
     * Get Media file creation task completion event. Valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComposeMediaCompleteEvent Media file creation task completion event. Valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComposeMediaTask getComposeMediaCompleteEvent() {
        return this.ComposeMediaCompleteEvent;
    }

    /**
     * Set Media file creation task completion event. Valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComposeMediaCompleteEvent Media file creation task completion event. Valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComposeMediaCompleteEvent(ComposeMediaTask ComposeMediaCompleteEvent) {
        this.ComposeMediaCompleteEvent = ComposeMediaCompleteEvent;
    }

    /**
     * Get Video editing completion event. Valid when the event type is ClipComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClipCompleteEvent Video editing completion event. Valid when the event type is ClipComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClipTask2017 getClipCompleteEvent() {
        return this.ClipCompleteEvent;
    }

    /**
     * Set Video editing completion event. Valid when the event type is ClipComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClipCompleteEvent Video editing completion event. Valid when the event type is ClipComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClipCompleteEvent(ClipTask2017 ClipCompleteEvent) {
        this.ClipCompleteEvent = ClipCompleteEvent;
    }

    /**
     * Get Video transcoding completion event, valid when the event type is TranscodeComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeCompleteEvent Video transcoding completion event, valid when the event type is TranscodeComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TranscodeTask2017 getTranscodeCompleteEvent() {
        return this.TranscodeCompleteEvent;
    }

    /**
     * Set Video transcoding completion event, valid when the event type is TranscodeComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeCompleteEvent Video transcoding completion event, valid when the event type is TranscodeComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeCompleteEvent(TranscodeTask2017 TranscodeCompleteEvent) {
        this.TranscodeCompleteEvent = TranscodeCompleteEvent;
    }

    /**
     * Get Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateImageSpriteCompleteEvent Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteCompleteEvent() {
        return this.CreateImageSpriteCompleteEvent;
    }

    /**
     * Set Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateImageSpriteCompleteEvent Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateImageSpriteCompleteEvent(CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent) {
        this.CreateImageSpriteCompleteEvent = CreateImageSpriteCompleteEvent;
    }

    /**
     * Get Video splicing completion event. Valid when the event type is ConcatComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConcatCompleteEvent Video splicing completion event. Valid when the event type is ConcatComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConcatTask2017 getConcatCompleteEvent() {
        return this.ConcatCompleteEvent;
    }

    /**
     * Set Video splicing completion event. Valid when the event type is ConcatComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConcatCompleteEvent Video splicing completion event. Valid when the event type is ConcatComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConcatCompleteEvent(ConcatTask2017 ConcatCompleteEvent) {
        this.ConcatCompleteEvent = ConcatCompleteEvent;
    }

    /**
     * Get Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotByTimeOffsetCompleteEvent Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetCompleteEvent() {
        return this.SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Set Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SnapshotByTimeOffsetCompleteEvent Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotByTimeOffsetCompleteEvent(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent) {
        this.SnapshotByTimeOffsetCompleteEvent = SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Get WeChat Publishing Completion Event. Valid when the event type is WechatPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WechatPublishCompleteEvent WeChat Publishing Completion Event. Valid when the event type is WechatPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WechatPublishTask getWechatPublishCompleteEvent() {
        return this.WechatPublishCompleteEvent;
    }

    /**
     * Set WeChat Publishing Completion Event. Valid when the event type is WechatPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WechatPublishCompleteEvent WeChat Publishing Completion Event. Valid when the event type is WechatPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatPublishCompleteEvent(WechatPublishTask WechatPublishCompleteEvent) {
        this.WechatPublishCompleteEvent = WechatPublishCompleteEvent;
    }

    /**
     * Get WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WechatMiniProgramPublishCompleteEvent WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishCompleteEvent() {
        return this.WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Set WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WechatMiniProgramPublishCompleteEvent WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatMiniProgramPublishCompleteEvent(WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent) {
        this.WechatMiniProgramPublishCompleteEvent = WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Get Intelligent Watermark Removal Completion Event is valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemoveWatermarkCompleteEvent Intelligent Watermark Removal Completion Event is valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RemoveWatermarkTask getRemoveWatermarkCompleteEvent() {
        return this.RemoveWatermarkCompleteEvent;
    }

    /**
     * Set Intelligent Watermark Removal Completion Event is valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemoveWatermarkCompleteEvent Intelligent Watermark Removal Completion Event is valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemoveWatermarkCompleteEvent(RemoveWatermarkTask RemoveWatermarkCompleteEvent) {
        this.RemoveWatermarkCompleteEvent = RemoveWatermarkCompleteEvent;
    }

    /**
     * Get Video retrieval completion event. Valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RestoreMediaCompleteEvent Video retrieval completion event. Valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RestoreMediaTask getRestoreMediaCompleteEvent() {
        return this.RestoreMediaCompleteEvent;
    }

    /**
     * Set Video retrieval completion event. Valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RestoreMediaCompleteEvent Video retrieval completion event. Valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRestoreMediaCompleteEvent(RestoreMediaTask RestoreMediaCompleteEvent) {
        this.RestoreMediaCompleteEvent = RestoreMediaCompleteEvent;
    }

    /**
     * Get Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RebuildMediaCompleteEvent Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildMediaTask getRebuildMediaCompleteEvent() {
        return this.RebuildMediaCompleteEvent;
    }

    /**
     * Set Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RebuildMediaCompleteEvent Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRebuildMediaCompleteEvent(RebuildMediaTask RebuildMediaCompleteEvent) {
        this.RebuildMediaCompleteEvent = RebuildMediaCompleteEvent;
    }

    /**
     * Get Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtractTraceWatermarkCompleteEvent Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkCompleteEvent() {
        return this.ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Set Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtractTraceWatermarkCompleteEvent Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtractTraceWatermarkCompleteEvent(ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent) {
        this.ExtractTraceWatermarkCompleteEvent = ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Get Copyright watermark extraction completion event. Valid when the event type is ExtractCopyRightWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtractCopyRightWatermarkCompleteEvent Copyright watermark extraction completion event. Valid when the event type is ExtractCopyRightWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkCompleteEvent() {
        return this.ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Set Copyright watermark extraction completion event. Valid when the event type is ExtractCopyRightWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtractCopyRightWatermarkCompleteEvent Copyright watermark extraction completion event. Valid when the event type is ExtractCopyRightWatermarkComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtractCopyRightWatermarkCompleteEvent(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent) {
        this.ExtractCopyRightWatermarkCompleteEvent = ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Get Audio/video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReviewAudioVideoCompleteEvent Audio/video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReviewAudioVideoTask getReviewAudioVideoCompleteEvent() {
        return this.ReviewAudioVideoCompleteEvent;
    }

    /**
     * Set Audio/video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReviewAudioVideoCompleteEvent Audio/video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReviewAudioVideoCompleteEvent(ReviewAudioVideoTask ReviewAudioVideoCompleteEvent) {
        this.ReviewAudioVideoCompleteEvent = ReviewAudioVideoCompleteEvent;
    }

    /**
     * Get This field is invalid.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReduceMediaBitrateCompleteEvent This field is invalid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateCompleteEvent() {
        return this.ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Set This field is invalid.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReduceMediaBitrateCompleteEvent This field is invalid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReduceMediaBitrateCompleteEvent(ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent) {
        this.ReduceMediaBitrateCompleteEvent = ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Get File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DescribeFileAttributesCompleteEvent File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribeFileAttributesTask getDescribeFileAttributesCompleteEvent() {
        return this.DescribeFileAttributesCompleteEvent;
    }

    /**
     * Set File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DescribeFileAttributesCompleteEvent File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescribeFileAttributesCompleteEvent(DescribeFileAttributesTask DescribeFileAttributesCompleteEvent) {
        this.DescribeFileAttributesCompleteEvent = DescribeFileAttributesCompleteEvent;
    }

    /**
     * Get Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityInspectCompleteEvent Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityInspectTask getQualityInspectCompleteEvent() {
        return this.QualityInspectCompleteEvent;
    }

    /**
     * Set Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityInspectCompleteEvent Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityInspectCompleteEvent(QualityInspectTask QualityInspectCompleteEvent) {
        this.QualityInspectCompleteEvent = QualityInspectCompleteEvent;
    }

    /**
     * Get Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityEnhanceCompleteEvent Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityEnhanceTask getQualityEnhanceCompleteEvent() {
        return this.QualityEnhanceCompleteEvent;
    }

    /**
     * Set Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityEnhanceCompleteEvent Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityEnhanceCompleteEvent(QualityEnhanceTask QualityEnhanceCompleteEvent) {
        this.QualityEnhanceCompleteEvent = QualityEnhanceCompleteEvent;
    }

    /**
     * Get MediaCastStatus changed event, valid when the event type is MediaCastStatusChanged.
Pay attention to: this field may return null, indicating that no valid value can be obtained. 
     * @return MediaCastStatusChangedEvent MediaCastStatus changed event, valid when the event type is MediaCastStatusChanged.
Pay attention to: this field may return null, indicating that no valid value can be obtained.
     */
    public MediaCastEvent getMediaCastStatusChangedEvent() {
        return this.MediaCastStatusChangedEvent;
    }

    /**
     * Set MediaCastStatus changed event, valid when the event type is MediaCastStatusChanged.
Pay attention to: this field may return null, indicating that no valid value can be obtained.
     * @param MediaCastStatusChangedEvent MediaCastStatus changed event, valid when the event type is MediaCastStatusChanged.
Pay attention to: this field may return null, indicating that no valid value can be obtained.
     */
    public void setMediaCastStatusChangedEvent(MediaCastEvent MediaCastStatusChangedEvent) {
        this.MediaCastStatusChangedEvent = MediaCastStatusChangedEvent;
    }

    /**
     * Get Editing solidification completion event. Valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PersistenceCompleteEvent Editing solidification completion event. Valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PersistenceCompleteTask getPersistenceCompleteEvent() {
        return this.PersistenceCompleteEvent;
    }

    /**
     * Set Editing solidification completion event. Valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PersistenceCompleteEvent Editing solidification completion event. Valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPersistenceCompleteEvent(PersistenceCompleteTask PersistenceCompleteEvent) {
        this.PersistenceCompleteEvent = PersistenceCompleteEvent;
    }

    /**
     * Get Adaptive bitrate task information, valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComplexAdaptiveDynamicStreamingCompleteEvent Adaptive bitrate task information, valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingCompleteEvent() {
        return this.ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Set Adaptive bitrate task information, valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComplexAdaptiveDynamicStreamingCompleteEvent Adaptive bitrate task information, valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComplexAdaptiveDynamicStreamingCompleteEvent(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent) {
        this.ComplexAdaptiveDynamicStreamingCompleteEvent = ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Get MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete. 
     * @return ProcessMediaByMPSCompleteEvent MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.
     */
    public ProcessMediaByMPS getProcessMediaByMPSCompleteEvent() {
        return this.ProcessMediaByMPSCompleteEvent;
    }

    /**
     * Set MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.
     * @param ProcessMediaByMPSCompleteEvent MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.
     */
    public void setProcessMediaByMPSCompleteEvent(ProcessMediaByMPS ProcessMediaByMPSCompleteEvent) {
        this.ProcessMediaByMPSCompleteEvent = ProcessMediaByMPSCompleteEvent;
    }

    /**
     * Get AIGC image generation task info. Valid only when EventType is AigcImageTaskComplete. 
     * @return AigcImageCompleteEvent AIGC image generation task info. Valid only when EventType is AigcImageTaskComplete.
     */
    public AigcImageTask getAigcImageCompleteEvent() {
        return this.AigcImageCompleteEvent;
    }

    /**
     * Set AIGC image generation task info. Valid only when EventType is AigcImageTaskComplete.
     * @param AigcImageCompleteEvent AIGC image generation task info. Valid only when EventType is AigcImageTaskComplete.
     */
    public void setAigcImageCompleteEvent(AigcImageTask AigcImageCompleteEvent) {
        this.AigcImageCompleteEvent = AigcImageCompleteEvent;
    }

    /**
     * Get AIGC video task info. Valid only when EventType is AigcVideoTaskComplete. 
     * @return AigcVideoCompleteEvent AIGC video task info. Valid only when EventType is AigcVideoTaskComplete.
     */
    public AigcVideoTask getAigcVideoCompleteEvent() {
        return this.AigcVideoCompleteEvent;
    }

    /**
     * Set AIGC video task info. Valid only when EventType is AigcVideoTaskComplete.
     * @param AigcVideoCompleteEvent AIGC video task info. Valid only when EventType is AigcVideoTaskComplete.
     */
    public void setAigcVideoCompleteEvent(AigcVideoTask AigcVideoCompleteEvent) {
        this.AigcVideoCompleteEvent = AigcVideoCompleteEvent;
    }

    /**
     * Get Extract digital watermark information. Valid at that time only when EventType is ExtractBlindWatermarkComplete. 
     * @return ExtractBlindWatermarkComplete Extract digital watermark information. Valid at that time only when EventType is ExtractBlindWatermarkComplete.
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkComplete() {
        return this.ExtractBlindWatermarkComplete;
    }

    /**
     * Set Extract digital watermark information. Valid at that time only when EventType is ExtractBlindWatermarkComplete.
     * @param ExtractBlindWatermarkComplete Extract digital watermark information. Valid at that time only when EventType is ExtractBlindWatermarkComplete.
     */
    public void setExtractBlindWatermarkComplete(ExtractBlindWatermarkTask ExtractBlindWatermarkComplete) {
        this.ExtractBlindWatermarkComplete = ExtractBlindWatermarkComplete;
    }

    /**
     * Get AIGC scenario-based image generation task info, valid only when EventType is SceneAigcImageCompleteEvent. 
     * @return SceneAigcImageCompleteEvent AIGC scenario-based image generation task info, valid only when EventType is SceneAigcImageCompleteEvent.
     */
    public SceneAigcImageTask getSceneAigcImageCompleteEvent() {
        return this.SceneAigcImageCompleteEvent;
    }

    /**
     * Set AIGC scenario-based image generation task info, valid only when EventType is SceneAigcImageCompleteEvent.
     * @param SceneAigcImageCompleteEvent AIGC scenario-based image generation task info, valid only when EventType is SceneAigcImageCompleteEvent.
     */
    public void setSceneAigcImageCompleteEvent(SceneAigcImageTask SceneAigcImageCompleteEvent) {
        this.SceneAigcImageCompleteEvent = SceneAigcImageCompleteEvent;
    }

    /**
     * Get Image asynchronous task processing info, valid only when EventType is ProcessImageAsyncCompleteEvent. 
     * @return ProcessImageAsyncCompleteEvent Image asynchronous task processing info, valid only when EventType is ProcessImageAsyncCompleteEvent.
     */
    public ProcessImageAsyncTask getProcessImageAsyncCompleteEvent() {
        return this.ProcessImageAsyncCompleteEvent;
    }

    /**
     * Set Image asynchronous task processing info, valid only when EventType is ProcessImageAsyncCompleteEvent.
     * @param ProcessImageAsyncCompleteEvent Image asynchronous task processing info, valid only when EventType is ProcessImageAsyncCompleteEvent.
     */
    public void setProcessImageAsyncCompleteEvent(ProcessImageAsyncTask ProcessImageAsyncCompleteEvent) {
        this.ProcessImageAsyncCompleteEvent = ProcessImageAsyncCompleteEvent;
    }

    public EventContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventContent(EventContent source) {
        if (source.EventHandle != null) {
            this.EventHandle = new String(source.EventHandle);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.FileUploadEvent != null) {
            this.FileUploadEvent = new FileUploadTask(source.FileUploadEvent);
        }
        if (source.ProcedureStateChangeEvent != null) {
            this.ProcedureStateChangeEvent = new ProcedureTask(source.ProcedureStateChangeEvent);
        }
        if (source.FileDeleteEvent != null) {
            this.FileDeleteEvent = new FileDeleteTask(source.FileDeleteEvent);
        }
        if (source.PullCompleteEvent != null) {
            this.PullCompleteEvent = new PullUploadTask(source.PullCompleteEvent);
        }
        if (source.EditMediaCompleteEvent != null) {
            this.EditMediaCompleteEvent = new EditMediaTask(source.EditMediaCompleteEvent);
        }
        if (source.SplitMediaCompleteEvent != null) {
            this.SplitMediaCompleteEvent = new SplitMediaTask(source.SplitMediaCompleteEvent);
        }
        if (source.ComposeMediaCompleteEvent != null) {
            this.ComposeMediaCompleteEvent = new ComposeMediaTask(source.ComposeMediaCompleteEvent);
        }
        if (source.ClipCompleteEvent != null) {
            this.ClipCompleteEvent = new ClipTask2017(source.ClipCompleteEvent);
        }
        if (source.TranscodeCompleteEvent != null) {
            this.TranscodeCompleteEvent = new TranscodeTask2017(source.TranscodeCompleteEvent);
        }
        if (source.CreateImageSpriteCompleteEvent != null) {
            this.CreateImageSpriteCompleteEvent = new CreateImageSpriteTask2017(source.CreateImageSpriteCompleteEvent);
        }
        if (source.ConcatCompleteEvent != null) {
            this.ConcatCompleteEvent = new ConcatTask2017(source.ConcatCompleteEvent);
        }
        if (source.SnapshotByTimeOffsetCompleteEvent != null) {
            this.SnapshotByTimeOffsetCompleteEvent = new SnapshotByTimeOffsetTask2017(source.SnapshotByTimeOffsetCompleteEvent);
        }
        if (source.WechatPublishCompleteEvent != null) {
            this.WechatPublishCompleteEvent = new WechatPublishTask(source.WechatPublishCompleteEvent);
        }
        if (source.WechatMiniProgramPublishCompleteEvent != null) {
            this.WechatMiniProgramPublishCompleteEvent = new WechatMiniProgramPublishTask(source.WechatMiniProgramPublishCompleteEvent);
        }
        if (source.RemoveWatermarkCompleteEvent != null) {
            this.RemoveWatermarkCompleteEvent = new RemoveWatermarkTask(source.RemoveWatermarkCompleteEvent);
        }
        if (source.RestoreMediaCompleteEvent != null) {
            this.RestoreMediaCompleteEvent = new RestoreMediaTask(source.RestoreMediaCompleteEvent);
        }
        if (source.RebuildMediaCompleteEvent != null) {
            this.RebuildMediaCompleteEvent = new RebuildMediaTask(source.RebuildMediaCompleteEvent);
        }
        if (source.ExtractTraceWatermarkCompleteEvent != null) {
            this.ExtractTraceWatermarkCompleteEvent = new ExtractTraceWatermarkTask(source.ExtractTraceWatermarkCompleteEvent);
        }
        if (source.ExtractCopyRightWatermarkCompleteEvent != null) {
            this.ExtractCopyRightWatermarkCompleteEvent = new ExtractCopyRightWatermarkTask(source.ExtractCopyRightWatermarkCompleteEvent);
        }
        if (source.ReviewAudioVideoCompleteEvent != null) {
            this.ReviewAudioVideoCompleteEvent = new ReviewAudioVideoTask(source.ReviewAudioVideoCompleteEvent);
        }
        if (source.ReduceMediaBitrateCompleteEvent != null) {
            this.ReduceMediaBitrateCompleteEvent = new ReduceMediaBitrateTask(source.ReduceMediaBitrateCompleteEvent);
        }
        if (source.DescribeFileAttributesCompleteEvent != null) {
            this.DescribeFileAttributesCompleteEvent = new DescribeFileAttributesTask(source.DescribeFileAttributesCompleteEvent);
        }
        if (source.QualityInspectCompleteEvent != null) {
            this.QualityInspectCompleteEvent = new QualityInspectTask(source.QualityInspectCompleteEvent);
        }
        if (source.QualityEnhanceCompleteEvent != null) {
            this.QualityEnhanceCompleteEvent = new QualityEnhanceTask(source.QualityEnhanceCompleteEvent);
        }
        if (source.MediaCastStatusChangedEvent != null) {
            this.MediaCastStatusChangedEvent = new MediaCastEvent(source.MediaCastStatusChangedEvent);
        }
        if (source.PersistenceCompleteEvent != null) {
            this.PersistenceCompleteEvent = new PersistenceCompleteTask(source.PersistenceCompleteEvent);
        }
        if (source.ComplexAdaptiveDynamicStreamingCompleteEvent != null) {
            this.ComplexAdaptiveDynamicStreamingCompleteEvent = new ComplexAdaptiveDynamicStreamingTask(source.ComplexAdaptiveDynamicStreamingCompleteEvent);
        }
        if (source.ProcessMediaByMPSCompleteEvent != null) {
            this.ProcessMediaByMPSCompleteEvent = new ProcessMediaByMPS(source.ProcessMediaByMPSCompleteEvent);
        }
        if (source.AigcImageCompleteEvent != null) {
            this.AigcImageCompleteEvent = new AigcImageTask(source.AigcImageCompleteEvent);
        }
        if (source.AigcVideoCompleteEvent != null) {
            this.AigcVideoCompleteEvent = new AigcVideoTask(source.AigcVideoCompleteEvent);
        }
        if (source.ExtractBlindWatermarkComplete != null) {
            this.ExtractBlindWatermarkComplete = new ExtractBlindWatermarkTask(source.ExtractBlindWatermarkComplete);
        }
        if (source.SceneAigcImageCompleteEvent != null) {
            this.SceneAigcImageCompleteEvent = new SceneAigcImageTask(source.SceneAigcImageCompleteEvent);
        }
        if (source.ProcessImageAsyncCompleteEvent != null) {
            this.ProcessImageAsyncCompleteEvent = new ProcessImageAsyncTask(source.ProcessImageAsyncCompleteEvent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventHandle", this.EventHandle);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "FileUploadEvent.", this.FileUploadEvent);
        this.setParamObj(map, prefix + "ProcedureStateChangeEvent.", this.ProcedureStateChangeEvent);
        this.setParamObj(map, prefix + "FileDeleteEvent.", this.FileDeleteEvent);
        this.setParamObj(map, prefix + "PullCompleteEvent.", this.PullCompleteEvent);
        this.setParamObj(map, prefix + "EditMediaCompleteEvent.", this.EditMediaCompleteEvent);
        this.setParamObj(map, prefix + "SplitMediaCompleteEvent.", this.SplitMediaCompleteEvent);
        this.setParamObj(map, prefix + "ComposeMediaCompleteEvent.", this.ComposeMediaCompleteEvent);
        this.setParamObj(map, prefix + "ClipCompleteEvent.", this.ClipCompleteEvent);
        this.setParamObj(map, prefix + "TranscodeCompleteEvent.", this.TranscodeCompleteEvent);
        this.setParamObj(map, prefix + "CreateImageSpriteCompleteEvent.", this.CreateImageSpriteCompleteEvent);
        this.setParamObj(map, prefix + "ConcatCompleteEvent.", this.ConcatCompleteEvent);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetCompleteEvent.", this.SnapshotByTimeOffsetCompleteEvent);
        this.setParamObj(map, prefix + "WechatPublishCompleteEvent.", this.WechatPublishCompleteEvent);
        this.setParamObj(map, prefix + "WechatMiniProgramPublishCompleteEvent.", this.WechatMiniProgramPublishCompleteEvent);
        this.setParamObj(map, prefix + "RemoveWatermarkCompleteEvent.", this.RemoveWatermarkCompleteEvent);
        this.setParamObj(map, prefix + "RestoreMediaCompleteEvent.", this.RestoreMediaCompleteEvent);
        this.setParamObj(map, prefix + "RebuildMediaCompleteEvent.", this.RebuildMediaCompleteEvent);
        this.setParamObj(map, prefix + "ExtractTraceWatermarkCompleteEvent.", this.ExtractTraceWatermarkCompleteEvent);
        this.setParamObj(map, prefix + "ExtractCopyRightWatermarkCompleteEvent.", this.ExtractCopyRightWatermarkCompleteEvent);
        this.setParamObj(map, prefix + "ReviewAudioVideoCompleteEvent.", this.ReviewAudioVideoCompleteEvent);
        this.setParamObj(map, prefix + "ReduceMediaBitrateCompleteEvent.", this.ReduceMediaBitrateCompleteEvent);
        this.setParamObj(map, prefix + "DescribeFileAttributesCompleteEvent.", this.DescribeFileAttributesCompleteEvent);
        this.setParamObj(map, prefix + "QualityInspectCompleteEvent.", this.QualityInspectCompleteEvent);
        this.setParamObj(map, prefix + "QualityEnhanceCompleteEvent.", this.QualityEnhanceCompleteEvent);
        this.setParamObj(map, prefix + "MediaCastStatusChangedEvent.", this.MediaCastStatusChangedEvent);
        this.setParamObj(map, prefix + "PersistenceCompleteEvent.", this.PersistenceCompleteEvent);
        this.setParamObj(map, prefix + "ComplexAdaptiveDynamicStreamingCompleteEvent.", this.ComplexAdaptiveDynamicStreamingCompleteEvent);
        this.setParamObj(map, prefix + "ProcessMediaByMPSCompleteEvent.", this.ProcessMediaByMPSCompleteEvent);
        this.setParamObj(map, prefix + "AigcImageCompleteEvent.", this.AigcImageCompleteEvent);
        this.setParamObj(map, prefix + "AigcVideoCompleteEvent.", this.AigcVideoCompleteEvent);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkComplete.", this.ExtractBlindWatermarkComplete);
        this.setParamObj(map, prefix + "SceneAigcImageCompleteEvent.", this.SceneAigcImageCompleteEvent);
        this.setParamObj(map, prefix + "ProcessImageAsyncCompleteEvent.", this.ProcessImageAsyncCompleteEvent);

    }
}

