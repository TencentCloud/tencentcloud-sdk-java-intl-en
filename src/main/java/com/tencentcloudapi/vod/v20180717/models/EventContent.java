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
    * <p>Event handler. The caller must call ConfirmEvents to acknowledge that the message has been received. The confirmation is valid for 30 seconds. After expiration, the event can be retrieved again.</p>
    */
    @SerializedName("EventHandle")
    @Expose
    private String EventHandle;

    /**
    * <p><b>Supported event types:</b></p><li>NewFileUpload: video upload completed;</li><li>ProcedureStateChanged: task flow status change;</li><li>FileDeleted: video deletion completed;</li><li>RestoreMediaComplete: video retrieval completion;</li><li>PullComplete: video pull completion;</li><li>EditMediaComplete: video editing completed;</li><li>SplitMediaComplete: video splitting completed;</li><li>ComposeMediaComplete: media file creation completion;</li><li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li><li>RemoveWatermark: intelligent watermark removal completion.</li><li>RebuildMediaComplete: audio and video quality rebirth completion event (not recommended).</li><li>ReviewAudioVideoComplete: audio/video moderation completed;</li><li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li><li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion;</li><li>DescribeFileAttributesComplete: file attribute acquisition completion;</li><li>QualityInspectComplete: audio and video quality detection completed;</li><li>QualityEnhanceComplete: audio and video quality rebirth task completion;</li><li>PersistenceComplete: edit persistence completion;</li><li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completion.</li><li>ProcessMediaByMPSComplete: MPS video processing completed.</li><li>AigcImageTaskComplete: AIGC image generation task completed.</li><li>AigcVideoTaskComplete: AIGC video generation task completed.</li><li>AigcHunyuan3DTaskComplete: AIGC Hunyuan 3D task completed.</li><li>DescribeAigcFaceInfoAsyncComplete: asynchronously fetch AIGC face information task completed.</li><b>Event types compatible with the 2017 version:</b><li>TranscodeComplete: video transcoding completion;</li><li>ConcatComplete: video splicing completion;</li><li>ClipComplete: video editing completed;</li><li>CreateImageSpriteComplete: Video thumbnail capture completion;</li><li>CreateSnapshotByTimeOffsetComplete: video screenshot by time point.</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>Video upload completion event. Valid when the event type is NewFileUpload.</p>
    */
    @SerializedName("FileUploadEvent")
    @Expose
    private FileUploadTask FileUploadEvent;

    /**
    * <p>Task flow status change event. Valid when the event type is ProcedureStateChanged.</p>
    */
    @SerializedName("ProcedureStateChangeEvent")
    @Expose
    private ProcedureTask ProcedureStateChangeEvent;

    /**
    * <p>File deletion event. Valid when the event type is FileDeleted.</p>
    */
    @SerializedName("FileDeleteEvent")
    @Expose
    private FileDeleteTask FileDeleteEvent;

    /**
    * <p>Video pull completion event. Valid when the event type is PullComplete.</p>
    */
    @SerializedName("PullCompleteEvent")
    @Expose
    private PullUploadTask PullCompleteEvent;

    /**
    * <p>Video editing completion event. Valid when the event type is EditMediaComplete.</p>
    */
    @SerializedName("EditMediaCompleteEvent")
    @Expose
    private EditMediaTask EditMediaCompleteEvent;

    /**
    * <p>Video splitting completion event. Valid when the event type is SplitMediaComplete.</p>
    */
    @SerializedName("SplitMediaCompleteEvent")
    @Expose
    private SplitMediaTask SplitMediaCompleteEvent;

    /**
    * <p>Media file creation task completion event. Valid when the event type is ComposeMediaComplete.</p>
    */
    @SerializedName("ComposeMediaCompleteEvent")
    @Expose
    private ComposeMediaTask ComposeMediaCompleteEvent;

    /**
    * <p>Video editing completion event. Valid when the event type is ClipComplete.</p>
    */
    @SerializedName("ClipCompleteEvent")
    @Expose
    private ClipTask2017 ClipCompleteEvent;

    /**
    * <p>Video transcoding completion event. Valid when the event type is TranscodeComplete.</p>
    */
    @SerializedName("TranscodeCompleteEvent")
    @Expose
    private TranscodeTask2017 TranscodeCompleteEvent;

    /**
    * <p>Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.</p>
    */
    @SerializedName("CreateImageSpriteCompleteEvent")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent;

    /**
    * <p>Video splicing completion event. Valid when the event type is ConcatComplete.</p>
    */
    @SerializedName("ConcatCompleteEvent")
    @Expose
    private ConcatTask2017 ConcatCompleteEvent;

    /**
    * <p>Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.</p>
    */
    @SerializedName("SnapshotByTimeOffsetCompleteEvent")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent;

    /**
    * <p>WeChat Publishing Completion Event, valid when the event type is WechatPublishComplete.</p>
    */
    @SerializedName("WechatPublishCompleteEvent")
    @Expose
    private WechatPublishTask WechatPublishCompleteEvent;

    /**
    * <p>WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.</p>
    */
    @SerializedName("WechatMiniProgramPublishCompleteEvent")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent;

    /**
    * <p>Intelligent Watermark Removal Completion Event, valid when the event type is RemoveWatermark.</p>
    */
    @SerializedName("RemoveWatermarkCompleteEvent")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkCompleteEvent;

    /**
    * <p>Video retrieval completion event. Valid when the event type is RestoreMediaComplete.</p>
    */
    @SerializedName("RestoreMediaCompleteEvent")
    @Expose
    private RestoreMediaTask RestoreMediaCompleteEvent;

    /**
    * <p>Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.</p>
    */
    @SerializedName("RebuildMediaCompleteEvent")
    @Expose
    private RebuildMediaTask RebuildMediaCompleteEvent;

    /**
    * <p>Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.</p>
    */
    @SerializedName("ExtractTraceWatermarkCompleteEvent")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent;

    /**
    * <p>Copyright watermark extraction completion event, valid when the event type is ExtractCopyRightWatermarkComplete.</p>
    */
    @SerializedName("ExtractCopyRightWatermarkCompleteEvent")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent;

    /**
    * <p>Audio/Video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.</p>
    */
    @SerializedName("ReviewAudioVideoCompleteEvent")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoCompleteEvent;

    /**
    * <p>This field is invalid.</p>
    */
    @SerializedName("ReduceMediaBitrateCompleteEvent")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent;

    /**
    * <p>File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.</p>
    */
    @SerializedName("DescribeFileAttributesCompleteEvent")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesCompleteEvent;

    /**
    * <p>Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.</p>
    */
    @SerializedName("QualityInspectCompleteEvent")
    @Expose
    private QualityInspectTask QualityInspectCompleteEvent;

    /**
    * <p>Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.</p>
    */
    @SerializedName("QualityEnhanceCompleteEvent")
    @Expose
    private QualityEnhanceTask QualityEnhanceCompleteEvent;

    /**
    * <p>Media forwarding status change event, valid when the event type is MediaCastStatusChanged.</p>
    */
    @SerializedName("MediaCastStatusChangedEvent")
    @Expose
    private MediaCastEvent MediaCastStatusChangedEvent;

    /**
    * <p>Editing solidification completion event. Valid when the event type is PersistenceComplete.</p>
    */
    @SerializedName("PersistenceCompleteEvent")
    @Expose
    private PersistenceCompleteTask PersistenceCompleteEvent;

    /**
    * <p>Adaptive bitrate task information. It is valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.</p>
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingCompleteEvent")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent;

    /**
    * <p>MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.</p>
    */
    @SerializedName("ProcessMediaByMPSCompleteEvent")
    @Expose
    private ProcessMediaByMPS ProcessMediaByMPSCompleteEvent;

    /**
    * <p>AIGC image generation task info, valid only when EventType is AigcImageTaskComplete.</p>
    */
    @SerializedName("AigcImageCompleteEvent")
    @Expose
    private AigcImageTask AigcImageCompleteEvent;

    /**
    * <p>Information of the AIGC video generation task. Valid only when EventType is AigcVideoTaskComplete.</p>
    */
    @SerializedName("AigcVideoCompleteEvent")
    @Expose
    private AigcVideoTask AigcVideoCompleteEvent;

    /**
    * <p>Extract digital watermark information. Valid only when EventType is ExtractBlindWatermarkComplete.</p>
    */
    @SerializedName("ExtractBlindWatermarkComplete")
    @Expose
    private ExtractBlindWatermarkTask ExtractBlindWatermarkComplete;

    /**
    * <p>AIGC scenario-based image generation task info. Valid only when EventType is SceneAigcImageCompleteEvent.</p>
    */
    @SerializedName("SceneAigcImageCompleteEvent")
    @Expose
    private SceneAigcImageTask SceneAigcImageCompleteEvent;

    /**
    * <p>Image asynchronous task processing information. Valid only when EventType is ProcessImageAsyncCompleteEvent.</p>
    */
    @SerializedName("ProcessImageAsyncCompleteEvent")
    @Expose
    private ProcessImageAsyncTask ProcessImageAsyncCompleteEvent;

    /**
    * <p>AIGC custom entity information, this field has a value only when EventType is CreateAigcAdvancedCustomElementCompleteEvent.</p>
    */
    @SerializedName("CreateAigcAdvancedCustomElementCompleteEvent")
    @Expose
    private CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementCompleteEvent;

    /**
    * <p>AIGC custom tone information. This field has a value only when EventType is CreateAigcCustomVoiceCompleteEvent.</p>
    */
    @SerializedName("CreateAigcCustomVoiceCompleteEvent")
    @Expose
    private CreateAigcCustomVoiceTask CreateAigcCustomVoiceCompleteEvent;

    /**
    * <p>Asynchronously fetch AIGC face information. This field has a value only when EventType is DescribeAigcFaceInfoAsyncComplete.</p>
    */
    @SerializedName("DescribeAigcFaceInfoAsyncCompleteEvent")
    @Expose
    private DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncCompleteEvent;

    /**
    * <p>AIGC Hunyuan 3D task info, this field has a value only when EventType is AigcHunyuan3DTaskComplete.</p>
    */
    @SerializedName("AigcHunyuan3DCompleteEvent")
    @Expose
    private AigcHunyuan3DTask AigcHunyuan3DCompleteEvent;

    /**
     * Get <p>Event handler. The caller must call ConfirmEvents to acknowledge that the message has been received. The confirmation is valid for 30 seconds. After expiration, the event can be retrieved again.</p> 
     * @return EventHandle <p>Event handler. The caller must call ConfirmEvents to acknowledge that the message has been received. The confirmation is valid for 30 seconds. After expiration, the event can be retrieved again.</p>
     */
    public String getEventHandle() {
        return this.EventHandle;
    }

    /**
     * Set <p>Event handler. The caller must call ConfirmEvents to acknowledge that the message has been received. The confirmation is valid for 30 seconds. After expiration, the event can be retrieved again.</p>
     * @param EventHandle <p>Event handler. The caller must call ConfirmEvents to acknowledge that the message has been received. The confirmation is valid for 30 seconds. After expiration, the event can be retrieved again.</p>
     */
    public void setEventHandle(String EventHandle) {
        this.EventHandle = EventHandle;
    }

    /**
     * Get <p><b>Supported event types:</b></p><li>NewFileUpload: video upload completed;</li><li>ProcedureStateChanged: task flow status change;</li><li>FileDeleted: video deletion completed;</li><li>RestoreMediaComplete: video retrieval completion;</li><li>PullComplete: video pull completion;</li><li>EditMediaComplete: video editing completed;</li><li>SplitMediaComplete: video splitting completed;</li><li>ComposeMediaComplete: media file creation completion;</li><li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li><li>RemoveWatermark: intelligent watermark removal completion.</li><li>RebuildMediaComplete: audio and video quality rebirth completion event (not recommended).</li><li>ReviewAudioVideoComplete: audio/video moderation completed;</li><li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li><li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion;</li><li>DescribeFileAttributesComplete: file attribute acquisition completion;</li><li>QualityInspectComplete: audio and video quality detection completed;</li><li>QualityEnhanceComplete: audio and video quality rebirth task completion;</li><li>PersistenceComplete: edit persistence completion;</li><li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completion.</li><li>ProcessMediaByMPSComplete: MPS video processing completed.</li><li>AigcImageTaskComplete: AIGC image generation task completed.</li><li>AigcVideoTaskComplete: AIGC video generation task completed.</li><li>AigcHunyuan3DTaskComplete: AIGC Hunyuan 3D task completed.</li><li>DescribeAigcFaceInfoAsyncComplete: asynchronously fetch AIGC face information task completed.</li><b>Event types compatible with the 2017 version:</b><li>TranscodeComplete: video transcoding completion;</li><li>ConcatComplete: video splicing completion;</li><li>ClipComplete: video editing completed;</li><li>CreateImageSpriteComplete: Video thumbnail capture completion;</li><li>CreateSnapshotByTimeOffsetComplete: video screenshot by time point.</li> 
     * @return EventType <p><b>Supported event types:</b></p><li>NewFileUpload: video upload completed;</li><li>ProcedureStateChanged: task flow status change;</li><li>FileDeleted: video deletion completed;</li><li>RestoreMediaComplete: video retrieval completion;</li><li>PullComplete: video pull completion;</li><li>EditMediaComplete: video editing completed;</li><li>SplitMediaComplete: video splitting completed;</li><li>ComposeMediaComplete: media file creation completion;</li><li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li><li>RemoveWatermark: intelligent watermark removal completion.</li><li>RebuildMediaComplete: audio and video quality rebirth completion event (not recommended).</li><li>ReviewAudioVideoComplete: audio/video moderation completed;</li><li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li><li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion;</li><li>DescribeFileAttributesComplete: file attribute acquisition completion;</li><li>QualityInspectComplete: audio and video quality detection completed;</li><li>QualityEnhanceComplete: audio and video quality rebirth task completion;</li><li>PersistenceComplete: edit persistence completion;</li><li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completion.</li><li>ProcessMediaByMPSComplete: MPS video processing completed.</li><li>AigcImageTaskComplete: AIGC image generation task completed.</li><li>AigcVideoTaskComplete: AIGC video generation task completed.</li><li>AigcHunyuan3DTaskComplete: AIGC Hunyuan 3D task completed.</li><li>DescribeAigcFaceInfoAsyncComplete: asynchronously fetch AIGC face information task completed.</li><b>Event types compatible with the 2017 version:</b><li>TranscodeComplete: video transcoding completion;</li><li>ConcatComplete: video splicing completion;</li><li>ClipComplete: video editing completed;</li><li>CreateImageSpriteComplete: Video thumbnail capture completion;</li><li>CreateSnapshotByTimeOffsetComplete: video screenshot by time point.</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p><b>Supported event types:</b></p><li>NewFileUpload: video upload completed;</li><li>ProcedureStateChanged: task flow status change;</li><li>FileDeleted: video deletion completed;</li><li>RestoreMediaComplete: video retrieval completion;</li><li>PullComplete: video pull completion;</li><li>EditMediaComplete: video editing completed;</li><li>SplitMediaComplete: video splitting completed;</li><li>ComposeMediaComplete: media file creation completion;</li><li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li><li>RemoveWatermark: intelligent watermark removal completion.</li><li>RebuildMediaComplete: audio and video quality rebirth completion event (not recommended).</li><li>ReviewAudioVideoComplete: audio/video moderation completed;</li><li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li><li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion;</li><li>DescribeFileAttributesComplete: file attribute acquisition completion;</li><li>QualityInspectComplete: audio and video quality detection completed;</li><li>QualityEnhanceComplete: audio and video quality rebirth task completion;</li><li>PersistenceComplete: edit persistence completion;</li><li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completion.</li><li>ProcessMediaByMPSComplete: MPS video processing completed.</li><li>AigcImageTaskComplete: AIGC image generation task completed.</li><li>AigcVideoTaskComplete: AIGC video generation task completed.</li><li>AigcHunyuan3DTaskComplete: AIGC Hunyuan 3D task completed.</li><li>DescribeAigcFaceInfoAsyncComplete: asynchronously fetch AIGC face information task completed.</li><b>Event types compatible with the 2017 version:</b><li>TranscodeComplete: video transcoding completion;</li><li>ConcatComplete: video splicing completion;</li><li>ClipComplete: video editing completed;</li><li>CreateImageSpriteComplete: Video thumbnail capture completion;</li><li>CreateSnapshotByTimeOffsetComplete: video screenshot by time point.</li>
     * @param EventType <p><b>Supported event types:</b></p><li>NewFileUpload: video upload completed;</li><li>ProcedureStateChanged: task flow status change;</li><li>FileDeleted: video deletion completed;</li><li>RestoreMediaComplete: video retrieval completion;</li><li>PullComplete: video pull completion;</li><li>EditMediaComplete: video editing completed;</li><li>SplitMediaComplete: video splitting completed;</li><li>ComposeMediaComplete: media file creation completion;</li><li>WechatMiniProgramPublishComplete: WeChat Mini Program Publishing Completed.</li><li>RemoveWatermark: intelligent watermark removal completion.</li><li>RebuildMediaComplete: audio and video quality rebirth completion event (not recommended).</li><li>ReviewAudioVideoComplete: audio/video moderation completed;</li><li>ExtractTraceWatermarkComplete: Traceability watermark extraction completed;</li><li>ExtractCopyRightWatermarkComplete: Extracting copyright watermark completion;</li><li>DescribeFileAttributesComplete: file attribute acquisition completion;</li><li>QualityInspectComplete: audio and video quality detection completed;</li><li>QualityEnhanceComplete: audio and video quality rebirth task completion;</li><li>PersistenceComplete: edit persistence completion;</li><li>ComplexAdaptiveDynamicStreamingComplete: complex adaptive bitstream task completion.</li><li>ProcessMediaByMPSComplete: MPS video processing completed.</li><li>AigcImageTaskComplete: AIGC image generation task completed.</li><li>AigcVideoTaskComplete: AIGC video generation task completed.</li><li>AigcHunyuan3DTaskComplete: AIGC Hunyuan 3D task completed.</li><li>DescribeAigcFaceInfoAsyncComplete: asynchronously fetch AIGC face information task completed.</li><b>Event types compatible with the 2017 version:</b><li>TranscodeComplete: video transcoding completion;</li><li>ConcatComplete: video splicing completion;</li><li>ClipComplete: video editing completed;</li><li>CreateImageSpriteComplete: Video thumbnail capture completion;</li><li>CreateSnapshotByTimeOffsetComplete: video screenshot by time point.</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>Video upload completion event. Valid when the event type is NewFileUpload.</p> 
     * @return FileUploadEvent <p>Video upload completion event. Valid when the event type is NewFileUpload.</p>
     */
    public FileUploadTask getFileUploadEvent() {
        return this.FileUploadEvent;
    }

    /**
     * Set <p>Video upload completion event. Valid when the event type is NewFileUpload.</p>
     * @param FileUploadEvent <p>Video upload completion event. Valid when the event type is NewFileUpload.</p>
     */
    public void setFileUploadEvent(FileUploadTask FileUploadEvent) {
        this.FileUploadEvent = FileUploadEvent;
    }

    /**
     * Get <p>Task flow status change event. Valid when the event type is ProcedureStateChanged.</p> 
     * @return ProcedureStateChangeEvent <p>Task flow status change event. Valid when the event type is ProcedureStateChanged.</p>
     */
    public ProcedureTask getProcedureStateChangeEvent() {
        return this.ProcedureStateChangeEvent;
    }

    /**
     * Set <p>Task flow status change event. Valid when the event type is ProcedureStateChanged.</p>
     * @param ProcedureStateChangeEvent <p>Task flow status change event. Valid when the event type is ProcedureStateChanged.</p>
     */
    public void setProcedureStateChangeEvent(ProcedureTask ProcedureStateChangeEvent) {
        this.ProcedureStateChangeEvent = ProcedureStateChangeEvent;
    }

    /**
     * Get <p>File deletion event. Valid when the event type is FileDeleted.</p> 
     * @return FileDeleteEvent <p>File deletion event. Valid when the event type is FileDeleted.</p>
     */
    public FileDeleteTask getFileDeleteEvent() {
        return this.FileDeleteEvent;
    }

    /**
     * Set <p>File deletion event. Valid when the event type is FileDeleted.</p>
     * @param FileDeleteEvent <p>File deletion event. Valid when the event type is FileDeleted.</p>
     */
    public void setFileDeleteEvent(FileDeleteTask FileDeleteEvent) {
        this.FileDeleteEvent = FileDeleteEvent;
    }

    /**
     * Get <p>Video pull completion event. Valid when the event type is PullComplete.</p> 
     * @return PullCompleteEvent <p>Video pull completion event. Valid when the event type is PullComplete.</p>
     */
    public PullUploadTask getPullCompleteEvent() {
        return this.PullCompleteEvent;
    }

    /**
     * Set <p>Video pull completion event. Valid when the event type is PullComplete.</p>
     * @param PullCompleteEvent <p>Video pull completion event. Valid when the event type is PullComplete.</p>
     */
    public void setPullCompleteEvent(PullUploadTask PullCompleteEvent) {
        this.PullCompleteEvent = PullCompleteEvent;
    }

    /**
     * Get <p>Video editing completion event. Valid when the event type is EditMediaComplete.</p> 
     * @return EditMediaCompleteEvent <p>Video editing completion event. Valid when the event type is EditMediaComplete.</p>
     */
    public EditMediaTask getEditMediaCompleteEvent() {
        return this.EditMediaCompleteEvent;
    }

    /**
     * Set <p>Video editing completion event. Valid when the event type is EditMediaComplete.</p>
     * @param EditMediaCompleteEvent <p>Video editing completion event. Valid when the event type is EditMediaComplete.</p>
     */
    public void setEditMediaCompleteEvent(EditMediaTask EditMediaCompleteEvent) {
        this.EditMediaCompleteEvent = EditMediaCompleteEvent;
    }

    /**
     * Get <p>Video splitting completion event. Valid when the event type is SplitMediaComplete.</p> 
     * @return SplitMediaCompleteEvent <p>Video splitting completion event. Valid when the event type is SplitMediaComplete.</p>
     */
    public SplitMediaTask getSplitMediaCompleteEvent() {
        return this.SplitMediaCompleteEvent;
    }

    /**
     * Set <p>Video splitting completion event. Valid when the event type is SplitMediaComplete.</p>
     * @param SplitMediaCompleteEvent <p>Video splitting completion event. Valid when the event type is SplitMediaComplete.</p>
     */
    public void setSplitMediaCompleteEvent(SplitMediaTask SplitMediaCompleteEvent) {
        this.SplitMediaCompleteEvent = SplitMediaCompleteEvent;
    }

    /**
     * Get <p>Media file creation task completion event. Valid when the event type is ComposeMediaComplete.</p> 
     * @return ComposeMediaCompleteEvent <p>Media file creation task completion event. Valid when the event type is ComposeMediaComplete.</p>
     */
    public ComposeMediaTask getComposeMediaCompleteEvent() {
        return this.ComposeMediaCompleteEvent;
    }

    /**
     * Set <p>Media file creation task completion event. Valid when the event type is ComposeMediaComplete.</p>
     * @param ComposeMediaCompleteEvent <p>Media file creation task completion event. Valid when the event type is ComposeMediaComplete.</p>
     */
    public void setComposeMediaCompleteEvent(ComposeMediaTask ComposeMediaCompleteEvent) {
        this.ComposeMediaCompleteEvent = ComposeMediaCompleteEvent;
    }

    /**
     * Get <p>Video editing completion event. Valid when the event type is ClipComplete.</p> 
     * @return ClipCompleteEvent <p>Video editing completion event. Valid when the event type is ClipComplete.</p>
     */
    public ClipTask2017 getClipCompleteEvent() {
        return this.ClipCompleteEvent;
    }

    /**
     * Set <p>Video editing completion event. Valid when the event type is ClipComplete.</p>
     * @param ClipCompleteEvent <p>Video editing completion event. Valid when the event type is ClipComplete.</p>
     */
    public void setClipCompleteEvent(ClipTask2017 ClipCompleteEvent) {
        this.ClipCompleteEvent = ClipCompleteEvent;
    }

    /**
     * Get <p>Video transcoding completion event. Valid when the event type is TranscodeComplete.</p> 
     * @return TranscodeCompleteEvent <p>Video transcoding completion event. Valid when the event type is TranscodeComplete.</p>
     */
    public TranscodeTask2017 getTranscodeCompleteEvent() {
        return this.TranscodeCompleteEvent;
    }

    /**
     * Set <p>Video transcoding completion event. Valid when the event type is TranscodeComplete.</p>
     * @param TranscodeCompleteEvent <p>Video transcoding completion event. Valid when the event type is TranscodeComplete.</p>
     */
    public void setTranscodeCompleteEvent(TranscodeTask2017 TranscodeCompleteEvent) {
        this.TranscodeCompleteEvent = TranscodeCompleteEvent;
    }

    /**
     * Get <p>Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.</p> 
     * @return CreateImageSpriteCompleteEvent <p>Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.</p>
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteCompleteEvent() {
        return this.CreateImageSpriteCompleteEvent;
    }

    /**
     * Set <p>Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.</p>
     * @param CreateImageSpriteCompleteEvent <p>Video thumbnail capture completion event. Valid when the event type is CreateImageSpriteComplete.</p>
     */
    public void setCreateImageSpriteCompleteEvent(CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent) {
        this.CreateImageSpriteCompleteEvent = CreateImageSpriteCompleteEvent;
    }

    /**
     * Get <p>Video splicing completion event. Valid when the event type is ConcatComplete.</p> 
     * @return ConcatCompleteEvent <p>Video splicing completion event. Valid when the event type is ConcatComplete.</p>
     */
    public ConcatTask2017 getConcatCompleteEvent() {
        return this.ConcatCompleteEvent;
    }

    /**
     * Set <p>Video splicing completion event. Valid when the event type is ConcatComplete.</p>
     * @param ConcatCompleteEvent <p>Video splicing completion event. Valid when the event type is ConcatComplete.</p>
     */
    public void setConcatCompleteEvent(ConcatTask2017 ConcatCompleteEvent) {
        this.ConcatCompleteEvent = ConcatCompleteEvent;
    }

    /**
     * Get <p>Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.</p> 
     * @return SnapshotByTimeOffsetCompleteEvent <p>Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.</p>
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetCompleteEvent() {
        return this.SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Set <p>Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.</p>
     * @param SnapshotByTimeOffsetCompleteEvent <p>Video screenshot by time point completion event. Valid when the event type is CreateSnapshotByTimeOffsetComplete.</p>
     */
    public void setSnapshotByTimeOffsetCompleteEvent(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent) {
        this.SnapshotByTimeOffsetCompleteEvent = SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Get <p>WeChat Publishing Completion Event, valid when the event type is WechatPublishComplete.</p> 
     * @return WechatPublishCompleteEvent <p>WeChat Publishing Completion Event, valid when the event type is WechatPublishComplete.</p>
     */
    public WechatPublishTask getWechatPublishCompleteEvent() {
        return this.WechatPublishCompleteEvent;
    }

    /**
     * Set <p>WeChat Publishing Completion Event, valid when the event type is WechatPublishComplete.</p>
     * @param WechatPublishCompleteEvent <p>WeChat Publishing Completion Event, valid when the event type is WechatPublishComplete.</p>
     */
    public void setWechatPublishCompleteEvent(WechatPublishTask WechatPublishCompleteEvent) {
        this.WechatPublishCompleteEvent = WechatPublishCompleteEvent;
    }

    /**
     * Get <p>WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.</p> 
     * @return WechatMiniProgramPublishCompleteEvent <p>WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.</p>
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishCompleteEvent() {
        return this.WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Set <p>WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.</p>
     * @param WechatMiniProgramPublishCompleteEvent <p>WeChat Mini Program Publishing Task Completion Event. Valid when the event type is WechatMiniProgramPublishComplete.</p>
     */
    public void setWechatMiniProgramPublishCompleteEvent(WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent) {
        this.WechatMiniProgramPublishCompleteEvent = WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Get <p>Intelligent Watermark Removal Completion Event, valid when the event type is RemoveWatermark.</p> 
     * @return RemoveWatermarkCompleteEvent <p>Intelligent Watermark Removal Completion Event, valid when the event type is RemoveWatermark.</p>
     */
    public RemoveWatermarkTask getRemoveWatermarkCompleteEvent() {
        return this.RemoveWatermarkCompleteEvent;
    }

    /**
     * Set <p>Intelligent Watermark Removal Completion Event, valid when the event type is RemoveWatermark.</p>
     * @param RemoveWatermarkCompleteEvent <p>Intelligent Watermark Removal Completion Event, valid when the event type is RemoveWatermark.</p>
     */
    public void setRemoveWatermarkCompleteEvent(RemoveWatermarkTask RemoveWatermarkCompleteEvent) {
        this.RemoveWatermarkCompleteEvent = RemoveWatermarkCompleteEvent;
    }

    /**
     * Get <p>Video retrieval completion event. Valid when the event type is RestoreMediaComplete.</p> 
     * @return RestoreMediaCompleteEvent <p>Video retrieval completion event. Valid when the event type is RestoreMediaComplete.</p>
     */
    public RestoreMediaTask getRestoreMediaCompleteEvent() {
        return this.RestoreMediaCompleteEvent;
    }

    /**
     * Set <p>Video retrieval completion event. Valid when the event type is RestoreMediaComplete.</p>
     * @param RestoreMediaCompleteEvent <p>Video retrieval completion event. Valid when the event type is RestoreMediaComplete.</p>
     */
    public void setRestoreMediaCompleteEvent(RestoreMediaTask RestoreMediaCompleteEvent) {
        this.RestoreMediaCompleteEvent = RestoreMediaCompleteEvent;
    }

    /**
     * Get <p>Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.</p> 
     * @return RebuildMediaCompleteEvent <p>Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.</p>
     */
    public RebuildMediaTask getRebuildMediaCompleteEvent() {
        return this.RebuildMediaCompleteEvent;
    }

    /**
     * Set <p>Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.</p>
     * @param RebuildMediaCompleteEvent <p>Audio and video quality rebirth completion event. Valid when the event type is RebuildMediaComplete.</p>
     */
    public void setRebuildMediaCompleteEvent(RebuildMediaTask RebuildMediaCompleteEvent) {
        this.RebuildMediaCompleteEvent = RebuildMediaCompleteEvent;
    }

    /**
     * Get <p>Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.</p> 
     * @return ExtractTraceWatermarkCompleteEvent <p>Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.</p>
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkCompleteEvent() {
        return this.ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Set <p>Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.</p>
     * @param ExtractTraceWatermarkCompleteEvent <p>Traceability watermark extraction completion event. Valid when the event type is ExtractTraceWatermarkComplete.</p>
     */
    public void setExtractTraceWatermarkCompleteEvent(ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent) {
        this.ExtractTraceWatermarkCompleteEvent = ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Get <p>Copyright watermark extraction completion event, valid when the event type is ExtractCopyRightWatermarkComplete.</p> 
     * @return ExtractCopyRightWatermarkCompleteEvent <p>Copyright watermark extraction completion event, valid when the event type is ExtractCopyRightWatermarkComplete.</p>
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkCompleteEvent() {
        return this.ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Set <p>Copyright watermark extraction completion event, valid when the event type is ExtractCopyRightWatermarkComplete.</p>
     * @param ExtractCopyRightWatermarkCompleteEvent <p>Copyright watermark extraction completion event, valid when the event type is ExtractCopyRightWatermarkComplete.</p>
     */
    public void setExtractCopyRightWatermarkCompleteEvent(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent) {
        this.ExtractCopyRightWatermarkCompleteEvent = ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Get <p>Audio/Video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.</p> 
     * @return ReviewAudioVideoCompleteEvent <p>Audio/Video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.</p>
     */
    public ReviewAudioVideoTask getReviewAudioVideoCompleteEvent() {
        return this.ReviewAudioVideoCompleteEvent;
    }

    /**
     * Set <p>Audio/Video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.</p>
     * @param ReviewAudioVideoCompleteEvent <p>Audio/Video moderation completed event. Valid when the event type is ReviewAudioVideoComplete.</p>
     */
    public void setReviewAudioVideoCompleteEvent(ReviewAudioVideoTask ReviewAudioVideoCompleteEvent) {
        this.ReviewAudioVideoCompleteEvent = ReviewAudioVideoCompleteEvent;
    }

    /**
     * Get <p>This field is invalid.</p> 
     * @return ReduceMediaBitrateCompleteEvent <p>This field is invalid.</p>
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateCompleteEvent() {
        return this.ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Set <p>This field is invalid.</p>
     * @param ReduceMediaBitrateCompleteEvent <p>This field is invalid.</p>
     */
    public void setReduceMediaBitrateCompleteEvent(ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent) {
        this.ReduceMediaBitrateCompleteEvent = ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Get <p>File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.</p> 
     * @return DescribeFileAttributesCompleteEvent <p>File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.</p>
     */
    public DescribeFileAttributesTask getDescribeFileAttributesCompleteEvent() {
        return this.DescribeFileAttributesCompleteEvent;
    }

    /**
     * Set <p>File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.</p>
     * @param DescribeFileAttributesCompleteEvent <p>File attribute acquisition completion event. Valid when the event type is DescribeFileAttributesComplete.</p>
     */
    public void setDescribeFileAttributesCompleteEvent(DescribeFileAttributesTask DescribeFileAttributesCompleteEvent) {
        this.DescribeFileAttributesCompleteEvent = DescribeFileAttributesCompleteEvent;
    }

    /**
     * Get <p>Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.</p> 
     * @return QualityInspectCompleteEvent <p>Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.</p>
     */
    public QualityInspectTask getQualityInspectCompleteEvent() {
        return this.QualityInspectCompleteEvent;
    }

    /**
     * Set <p>Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.</p>
     * @param QualityInspectCompleteEvent <p>Audio and video quality detection completion event. Valid when the event type is QualityInspectComplete.</p>
     */
    public void setQualityInspectCompleteEvent(QualityInspectTask QualityInspectCompleteEvent) {
        this.QualityInspectCompleteEvent = QualityInspectCompleteEvent;
    }

    /**
     * Get <p>Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.</p> 
     * @return QualityEnhanceCompleteEvent <p>Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.</p>
     */
    public QualityEnhanceTask getQualityEnhanceCompleteEvent() {
        return this.QualityEnhanceCompleteEvent;
    }

    /**
     * Set <p>Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.</p>
     * @param QualityEnhanceCompleteEvent <p>Audio and video quality rebirth completion event. Valid when the event type is QualityEnhanceComplete.</p>
     */
    public void setQualityEnhanceCompleteEvent(QualityEnhanceTask QualityEnhanceCompleteEvent) {
        this.QualityEnhanceCompleteEvent = QualityEnhanceCompleteEvent;
    }

    /**
     * Get <p>Media forwarding status change event, valid when the event type is MediaCastStatusChanged.</p> 
     * @return MediaCastStatusChangedEvent <p>Media forwarding status change event, valid when the event type is MediaCastStatusChanged.</p>
     */
    public MediaCastEvent getMediaCastStatusChangedEvent() {
        return this.MediaCastStatusChangedEvent;
    }

    /**
     * Set <p>Media forwarding status change event, valid when the event type is MediaCastStatusChanged.</p>
     * @param MediaCastStatusChangedEvent <p>Media forwarding status change event, valid when the event type is MediaCastStatusChanged.</p>
     */
    public void setMediaCastStatusChangedEvent(MediaCastEvent MediaCastStatusChangedEvent) {
        this.MediaCastStatusChangedEvent = MediaCastStatusChangedEvent;
    }

    /**
     * Get <p>Editing solidification completion event. Valid when the event type is PersistenceComplete.</p> 
     * @return PersistenceCompleteEvent <p>Editing solidification completion event. Valid when the event type is PersistenceComplete.</p>
     */
    public PersistenceCompleteTask getPersistenceCompleteEvent() {
        return this.PersistenceCompleteEvent;
    }

    /**
     * Set <p>Editing solidification completion event. Valid when the event type is PersistenceComplete.</p>
     * @param PersistenceCompleteEvent <p>Editing solidification completion event. Valid when the event type is PersistenceComplete.</p>
     */
    public void setPersistenceCompleteEvent(PersistenceCompleteTask PersistenceCompleteEvent) {
        this.PersistenceCompleteEvent = PersistenceCompleteEvent;
    }

    /**
     * Get <p>Adaptive bitrate task information. It is valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.</p> 
     * @return ComplexAdaptiveDynamicStreamingCompleteEvent <p>Adaptive bitrate task information. It is valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.</p>
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingCompleteEvent() {
        return this.ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Set <p>Adaptive bitrate task information. It is valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.</p>
     * @param ComplexAdaptiveDynamicStreamingCompleteEvent <p>Adaptive bitrate task information. It is valid only when EventType is ComplexAdaptiveDynamicStreamingComplete.</p>
     */
    public void setComplexAdaptiveDynamicStreamingCompleteEvent(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent) {
        this.ComplexAdaptiveDynamicStreamingCompleteEvent = ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Get <p>MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.</p> 
     * @return ProcessMediaByMPSCompleteEvent <p>MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.</p>
     */
    public ProcessMediaByMPS getProcessMediaByMPSCompleteEvent() {
        return this.ProcessMediaByMPSCompleteEvent;
    }

    /**
     * Set <p>MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.</p>
     * @param ProcessMediaByMPSCompleteEvent <p>MPS video processing task information. Valid only when EventType is ProcessMediaByMPSComplete.</p>
     */
    public void setProcessMediaByMPSCompleteEvent(ProcessMediaByMPS ProcessMediaByMPSCompleteEvent) {
        this.ProcessMediaByMPSCompleteEvent = ProcessMediaByMPSCompleteEvent;
    }

    /**
     * Get <p>AIGC image generation task info, valid only when EventType is AigcImageTaskComplete.</p> 
     * @return AigcImageCompleteEvent <p>AIGC image generation task info, valid only when EventType is AigcImageTaskComplete.</p>
     */
    public AigcImageTask getAigcImageCompleteEvent() {
        return this.AigcImageCompleteEvent;
    }

    /**
     * Set <p>AIGC image generation task info, valid only when EventType is AigcImageTaskComplete.</p>
     * @param AigcImageCompleteEvent <p>AIGC image generation task info, valid only when EventType is AigcImageTaskComplete.</p>
     */
    public void setAigcImageCompleteEvent(AigcImageTask AigcImageCompleteEvent) {
        this.AigcImageCompleteEvent = AigcImageCompleteEvent;
    }

    /**
     * Get <p>Information of the AIGC video generation task. Valid only when EventType is AigcVideoTaskComplete.</p> 
     * @return AigcVideoCompleteEvent <p>Information of the AIGC video generation task. Valid only when EventType is AigcVideoTaskComplete.</p>
     */
    public AigcVideoTask getAigcVideoCompleteEvent() {
        return this.AigcVideoCompleteEvent;
    }

    /**
     * Set <p>Information of the AIGC video generation task. Valid only when EventType is AigcVideoTaskComplete.</p>
     * @param AigcVideoCompleteEvent <p>Information of the AIGC video generation task. Valid only when EventType is AigcVideoTaskComplete.</p>
     */
    public void setAigcVideoCompleteEvent(AigcVideoTask AigcVideoCompleteEvent) {
        this.AigcVideoCompleteEvent = AigcVideoCompleteEvent;
    }

    /**
     * Get <p>Extract digital watermark information. Valid only when EventType is ExtractBlindWatermarkComplete.</p> 
     * @return ExtractBlindWatermarkComplete <p>Extract digital watermark information. Valid only when EventType is ExtractBlindWatermarkComplete.</p>
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkComplete() {
        return this.ExtractBlindWatermarkComplete;
    }

    /**
     * Set <p>Extract digital watermark information. Valid only when EventType is ExtractBlindWatermarkComplete.</p>
     * @param ExtractBlindWatermarkComplete <p>Extract digital watermark information. Valid only when EventType is ExtractBlindWatermarkComplete.</p>
     */
    public void setExtractBlindWatermarkComplete(ExtractBlindWatermarkTask ExtractBlindWatermarkComplete) {
        this.ExtractBlindWatermarkComplete = ExtractBlindWatermarkComplete;
    }

    /**
     * Get <p>AIGC scenario-based image generation task info. Valid only when EventType is SceneAigcImageCompleteEvent.</p> 
     * @return SceneAigcImageCompleteEvent <p>AIGC scenario-based image generation task info. Valid only when EventType is SceneAigcImageCompleteEvent.</p>
     */
    public SceneAigcImageTask getSceneAigcImageCompleteEvent() {
        return this.SceneAigcImageCompleteEvent;
    }

    /**
     * Set <p>AIGC scenario-based image generation task info. Valid only when EventType is SceneAigcImageCompleteEvent.</p>
     * @param SceneAigcImageCompleteEvent <p>AIGC scenario-based image generation task info. Valid only when EventType is SceneAigcImageCompleteEvent.</p>
     */
    public void setSceneAigcImageCompleteEvent(SceneAigcImageTask SceneAigcImageCompleteEvent) {
        this.SceneAigcImageCompleteEvent = SceneAigcImageCompleteEvent;
    }

    /**
     * Get <p>Image asynchronous task processing information. Valid only when EventType is ProcessImageAsyncCompleteEvent.</p> 
     * @return ProcessImageAsyncCompleteEvent <p>Image asynchronous task processing information. Valid only when EventType is ProcessImageAsyncCompleteEvent.</p>
     */
    public ProcessImageAsyncTask getProcessImageAsyncCompleteEvent() {
        return this.ProcessImageAsyncCompleteEvent;
    }

    /**
     * Set <p>Image asynchronous task processing information. Valid only when EventType is ProcessImageAsyncCompleteEvent.</p>
     * @param ProcessImageAsyncCompleteEvent <p>Image asynchronous task processing information. Valid only when EventType is ProcessImageAsyncCompleteEvent.</p>
     */
    public void setProcessImageAsyncCompleteEvent(ProcessImageAsyncTask ProcessImageAsyncCompleteEvent) {
        this.ProcessImageAsyncCompleteEvent = ProcessImageAsyncCompleteEvent;
    }

    /**
     * Get <p>AIGC custom entity information, this field has a value only when EventType is CreateAigcAdvancedCustomElementCompleteEvent.</p> 
     * @return CreateAigcAdvancedCustomElementCompleteEvent <p>AIGC custom entity information, this field has a value only when EventType is CreateAigcAdvancedCustomElementCompleteEvent.</p>
     */
    public CreateAigcAdvancedCustomElementTask getCreateAigcAdvancedCustomElementCompleteEvent() {
        return this.CreateAigcAdvancedCustomElementCompleteEvent;
    }

    /**
     * Set <p>AIGC custom entity information, this field has a value only when EventType is CreateAigcAdvancedCustomElementCompleteEvent.</p>
     * @param CreateAigcAdvancedCustomElementCompleteEvent <p>AIGC custom entity information, this field has a value only when EventType is CreateAigcAdvancedCustomElementCompleteEvent.</p>
     */
    public void setCreateAigcAdvancedCustomElementCompleteEvent(CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementCompleteEvent) {
        this.CreateAigcAdvancedCustomElementCompleteEvent = CreateAigcAdvancedCustomElementCompleteEvent;
    }

    /**
     * Get <p>AIGC custom tone information. This field has a value only when EventType is CreateAigcCustomVoiceCompleteEvent.</p> 
     * @return CreateAigcCustomVoiceCompleteEvent <p>AIGC custom tone information. This field has a value only when EventType is CreateAigcCustomVoiceCompleteEvent.</p>
     */
    public CreateAigcCustomVoiceTask getCreateAigcCustomVoiceCompleteEvent() {
        return this.CreateAigcCustomVoiceCompleteEvent;
    }

    /**
     * Set <p>AIGC custom tone information. This field has a value only when EventType is CreateAigcCustomVoiceCompleteEvent.</p>
     * @param CreateAigcCustomVoiceCompleteEvent <p>AIGC custom tone information. This field has a value only when EventType is CreateAigcCustomVoiceCompleteEvent.</p>
     */
    public void setCreateAigcCustomVoiceCompleteEvent(CreateAigcCustomVoiceTask CreateAigcCustomVoiceCompleteEvent) {
        this.CreateAigcCustomVoiceCompleteEvent = CreateAigcCustomVoiceCompleteEvent;
    }

    /**
     * Get <p>Asynchronously fetch AIGC face information. This field has a value only when EventType is DescribeAigcFaceInfoAsyncComplete.</p> 
     * @return DescribeAigcFaceInfoAsyncCompleteEvent <p>Asynchronously fetch AIGC face information. This field has a value only when EventType is DescribeAigcFaceInfoAsyncComplete.</p>
     */
    public DescribeAigcFaceInfoAsyncTask getDescribeAigcFaceInfoAsyncCompleteEvent() {
        return this.DescribeAigcFaceInfoAsyncCompleteEvent;
    }

    /**
     * Set <p>Asynchronously fetch AIGC face information. This field has a value only when EventType is DescribeAigcFaceInfoAsyncComplete.</p>
     * @param DescribeAigcFaceInfoAsyncCompleteEvent <p>Asynchronously fetch AIGC face information. This field has a value only when EventType is DescribeAigcFaceInfoAsyncComplete.</p>
     */
    public void setDescribeAigcFaceInfoAsyncCompleteEvent(DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncCompleteEvent) {
        this.DescribeAigcFaceInfoAsyncCompleteEvent = DescribeAigcFaceInfoAsyncCompleteEvent;
    }

    /**
     * Get <p>AIGC Hunyuan 3D task info, this field has a value only when EventType is AigcHunyuan3DTaskComplete.</p> 
     * @return AigcHunyuan3DCompleteEvent <p>AIGC Hunyuan 3D task info, this field has a value only when EventType is AigcHunyuan3DTaskComplete.</p>
     */
    public AigcHunyuan3DTask getAigcHunyuan3DCompleteEvent() {
        return this.AigcHunyuan3DCompleteEvent;
    }

    /**
     * Set <p>AIGC Hunyuan 3D task info, this field has a value only when EventType is AigcHunyuan3DTaskComplete.</p>
     * @param AigcHunyuan3DCompleteEvent <p>AIGC Hunyuan 3D task info, this field has a value only when EventType is AigcHunyuan3DTaskComplete.</p>
     */
    public void setAigcHunyuan3DCompleteEvent(AigcHunyuan3DTask AigcHunyuan3DCompleteEvent) {
        this.AigcHunyuan3DCompleteEvent = AigcHunyuan3DCompleteEvent;
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
        if (source.CreateAigcAdvancedCustomElementCompleteEvent != null) {
            this.CreateAigcAdvancedCustomElementCompleteEvent = new CreateAigcAdvancedCustomElementTask(source.CreateAigcAdvancedCustomElementCompleteEvent);
        }
        if (source.CreateAigcCustomVoiceCompleteEvent != null) {
            this.CreateAigcCustomVoiceCompleteEvent = new CreateAigcCustomVoiceTask(source.CreateAigcCustomVoiceCompleteEvent);
        }
        if (source.DescribeAigcFaceInfoAsyncCompleteEvent != null) {
            this.DescribeAigcFaceInfoAsyncCompleteEvent = new DescribeAigcFaceInfoAsyncTask(source.DescribeAigcFaceInfoAsyncCompleteEvent);
        }
        if (source.AigcHunyuan3DCompleteEvent != null) {
            this.AigcHunyuan3DCompleteEvent = new AigcHunyuan3DTask(source.AigcHunyuan3DCompleteEvent);
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
        this.setParamObj(map, prefix + "CreateAigcAdvancedCustomElementCompleteEvent.", this.CreateAigcAdvancedCustomElementCompleteEvent);
        this.setParamObj(map, prefix + "CreateAigcCustomVoiceCompleteEvent.", this.CreateAigcCustomVoiceCompleteEvent);
        this.setParamObj(map, prefix + "DescribeAigcFaceInfoAsyncCompleteEvent.", this.DescribeAigcFaceInfoAsyncCompleteEvent);
        this.setParamObj(map, prefix + "AigcHunyuan3DCompleteEvent.", this.AigcHunyuan3DCompleteEvent);

    }
}

