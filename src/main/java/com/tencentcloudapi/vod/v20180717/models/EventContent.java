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
    * 
    */
    @SerializedName("EventHandle")
    @Expose
    private String EventHandle;

    /**
    * 
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 
    */
    @SerializedName("FileUploadEvent")
    @Expose
    private FileUploadTask FileUploadEvent;

    /**
    * 
    */
    @SerializedName("ProcedureStateChangeEvent")
    @Expose
    private ProcedureTask ProcedureStateChangeEvent;

    /**
    * 
    */
    @SerializedName("FileDeleteEvent")
    @Expose
    private FileDeleteTask FileDeleteEvent;

    /**
    * 
    */
    @SerializedName("PullCompleteEvent")
    @Expose
    private PullUploadTask PullCompleteEvent;

    /**
    * 
    */
    @SerializedName("EditMediaCompleteEvent")
    @Expose
    private EditMediaTask EditMediaCompleteEvent;

    /**
    * 
    */
    @SerializedName("SplitMediaCompleteEvent")
    @Expose
    private SplitMediaTask SplitMediaCompleteEvent;

    /**
    * 
    */
    @SerializedName("ComposeMediaCompleteEvent")
    @Expose
    private ComposeMediaTask ComposeMediaCompleteEvent;

    /**
    * 
    */
    @SerializedName("ClipCompleteEvent")
    @Expose
    private ClipTask2017 ClipCompleteEvent;

    /**
    * 
    */
    @SerializedName("TranscodeCompleteEvent")
    @Expose
    private TranscodeTask2017 TranscodeCompleteEvent;

    /**
    * 
    */
    @SerializedName("CreateImageSpriteCompleteEvent")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent;

    /**
    * 
    */
    @SerializedName("ConcatCompleteEvent")
    @Expose
    private ConcatTask2017 ConcatCompleteEvent;

    /**
    * 
    */
    @SerializedName("SnapshotByTimeOffsetCompleteEvent")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent;

    /**
    * 
    */
    @SerializedName("WechatPublishCompleteEvent")
    @Expose
    private WechatPublishTask WechatPublishCompleteEvent;

    /**
    * 
    */
    @SerializedName("WechatMiniProgramPublishCompleteEvent")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent;

    /**
    * 
    */
    @SerializedName("RemoveWatermarkCompleteEvent")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkCompleteEvent;

    /**
    * 
    */
    @SerializedName("RestoreMediaCompleteEvent")
    @Expose
    private RestoreMediaTask RestoreMediaCompleteEvent;

    /**
    * 
    */
    @SerializedName("RebuildMediaCompleteEvent")
    @Expose
    private RebuildMediaTask RebuildMediaCompleteEvent;

    /**
    * 
    */
    @SerializedName("ExtractTraceWatermarkCompleteEvent")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent;

    /**
    * 
    */
    @SerializedName("ExtractCopyRightWatermarkCompleteEvent")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent;

    /**
    * 
    */
    @SerializedName("ReviewAudioVideoCompleteEvent")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoCompleteEvent;

    /**
    * 
    */
    @SerializedName("ReduceMediaBitrateCompleteEvent")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent;

    /**
    * 
    */
    @SerializedName("DescribeFileAttributesCompleteEvent")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesCompleteEvent;

    /**
    * 
    */
    @SerializedName("QualityInspectCompleteEvent")
    @Expose
    private QualityInspectTask QualityInspectCompleteEvent;

    /**
    * 
    */
    @SerializedName("QualityEnhanceCompleteEvent")
    @Expose
    private QualityEnhanceTask QualityEnhanceCompleteEvent;

    /**
    * 
    */
    @SerializedName("MediaCastStatusChangedEvent")
    @Expose
    private MediaCastEvent MediaCastStatusChangedEvent;

    /**
    * 
    */
    @SerializedName("PersistenceCompleteEvent")
    @Expose
    private PersistenceCompleteTask PersistenceCompleteEvent;

    /**
    * 
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingCompleteEvent")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent;

    /**
    * 
    */
    @SerializedName("ProcessMediaByMPSCompleteEvent")
    @Expose
    private ProcessMediaByMPS ProcessMediaByMPSCompleteEvent;

    /**
    * 
    */
    @SerializedName("AigcImageCompleteEvent")
    @Expose
    private AigcImageTask AigcImageCompleteEvent;

    /**
    * 
    */
    @SerializedName("AigcVideoCompleteEvent")
    @Expose
    private AigcVideoTask AigcVideoCompleteEvent;

    /**
    * 
    */
    @SerializedName("ExtractBlindWatermarkComplete")
    @Expose
    private ExtractBlindWatermarkTask ExtractBlindWatermarkComplete;

    /**
    * 
    */
    @SerializedName("SceneAigcImageCompleteEvent")
    @Expose
    private SceneAigcImageTask SceneAigcImageCompleteEvent;

    /**
    * 
    */
    @SerializedName("ProcessImageAsyncCompleteEvent")
    @Expose
    private ProcessImageAsyncTask ProcessImageAsyncCompleteEvent;

    /**
    * 
    */
    @SerializedName("CreateAigcAdvancedCustomElementCompleteEvent")
    @Expose
    private CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementCompleteEvent;

    /**
    * 
    */
    @SerializedName("CreateAigcCustomVoiceCompleteEvent")
    @Expose
    private CreateAigcCustomVoiceTask CreateAigcCustomVoiceCompleteEvent;

    /**
    * 
    */
    @SerializedName("DescribeAigcFaceInfoAsyncCompleteEvent")
    @Expose
    private DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncCompleteEvent;

    /**
    * 
    */
    @SerializedName("AigcHunyuan3DCompleteEvent")
    @Expose
    private AigcHunyuan3DTask AigcHunyuan3DCompleteEvent;

    /**
     * Get  
     * @return EventHandle 
     */
    public String getEventHandle() {
        return this.EventHandle;
    }

    /**
     * Set 
     * @param EventHandle 
     */
    public void setEventHandle(String EventHandle) {
        this.EventHandle = EventHandle;
    }

    /**
     * Get  
     * @return EventType 
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 
     * @param EventType 
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get  
     * @return FileUploadEvent 
     */
    public FileUploadTask getFileUploadEvent() {
        return this.FileUploadEvent;
    }

    /**
     * Set 
     * @param FileUploadEvent 
     */
    public void setFileUploadEvent(FileUploadTask FileUploadEvent) {
        this.FileUploadEvent = FileUploadEvent;
    }

    /**
     * Get  
     * @return ProcedureStateChangeEvent 
     */
    public ProcedureTask getProcedureStateChangeEvent() {
        return this.ProcedureStateChangeEvent;
    }

    /**
     * Set 
     * @param ProcedureStateChangeEvent 
     */
    public void setProcedureStateChangeEvent(ProcedureTask ProcedureStateChangeEvent) {
        this.ProcedureStateChangeEvent = ProcedureStateChangeEvent;
    }

    /**
     * Get  
     * @return FileDeleteEvent 
     */
    public FileDeleteTask getFileDeleteEvent() {
        return this.FileDeleteEvent;
    }

    /**
     * Set 
     * @param FileDeleteEvent 
     */
    public void setFileDeleteEvent(FileDeleteTask FileDeleteEvent) {
        this.FileDeleteEvent = FileDeleteEvent;
    }

    /**
     * Get  
     * @return PullCompleteEvent 
     */
    public PullUploadTask getPullCompleteEvent() {
        return this.PullCompleteEvent;
    }

    /**
     * Set 
     * @param PullCompleteEvent 
     */
    public void setPullCompleteEvent(PullUploadTask PullCompleteEvent) {
        this.PullCompleteEvent = PullCompleteEvent;
    }

    /**
     * Get  
     * @return EditMediaCompleteEvent 
     */
    public EditMediaTask getEditMediaCompleteEvent() {
        return this.EditMediaCompleteEvent;
    }

    /**
     * Set 
     * @param EditMediaCompleteEvent 
     */
    public void setEditMediaCompleteEvent(EditMediaTask EditMediaCompleteEvent) {
        this.EditMediaCompleteEvent = EditMediaCompleteEvent;
    }

    /**
     * Get  
     * @return SplitMediaCompleteEvent 
     */
    public SplitMediaTask getSplitMediaCompleteEvent() {
        return this.SplitMediaCompleteEvent;
    }

    /**
     * Set 
     * @param SplitMediaCompleteEvent 
     */
    public void setSplitMediaCompleteEvent(SplitMediaTask SplitMediaCompleteEvent) {
        this.SplitMediaCompleteEvent = SplitMediaCompleteEvent;
    }

    /**
     * Get  
     * @return ComposeMediaCompleteEvent 
     */
    public ComposeMediaTask getComposeMediaCompleteEvent() {
        return this.ComposeMediaCompleteEvent;
    }

    /**
     * Set 
     * @param ComposeMediaCompleteEvent 
     */
    public void setComposeMediaCompleteEvent(ComposeMediaTask ComposeMediaCompleteEvent) {
        this.ComposeMediaCompleteEvent = ComposeMediaCompleteEvent;
    }

    /**
     * Get  
     * @return ClipCompleteEvent 
     */
    public ClipTask2017 getClipCompleteEvent() {
        return this.ClipCompleteEvent;
    }

    /**
     * Set 
     * @param ClipCompleteEvent 
     */
    public void setClipCompleteEvent(ClipTask2017 ClipCompleteEvent) {
        this.ClipCompleteEvent = ClipCompleteEvent;
    }

    /**
     * Get  
     * @return TranscodeCompleteEvent 
     */
    public TranscodeTask2017 getTranscodeCompleteEvent() {
        return this.TranscodeCompleteEvent;
    }

    /**
     * Set 
     * @param TranscodeCompleteEvent 
     */
    public void setTranscodeCompleteEvent(TranscodeTask2017 TranscodeCompleteEvent) {
        this.TranscodeCompleteEvent = TranscodeCompleteEvent;
    }

    /**
     * Get  
     * @return CreateImageSpriteCompleteEvent 
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteCompleteEvent() {
        return this.CreateImageSpriteCompleteEvent;
    }

    /**
     * Set 
     * @param CreateImageSpriteCompleteEvent 
     */
    public void setCreateImageSpriteCompleteEvent(CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent) {
        this.CreateImageSpriteCompleteEvent = CreateImageSpriteCompleteEvent;
    }

    /**
     * Get  
     * @return ConcatCompleteEvent 
     */
    public ConcatTask2017 getConcatCompleteEvent() {
        return this.ConcatCompleteEvent;
    }

    /**
     * Set 
     * @param ConcatCompleteEvent 
     */
    public void setConcatCompleteEvent(ConcatTask2017 ConcatCompleteEvent) {
        this.ConcatCompleteEvent = ConcatCompleteEvent;
    }

    /**
     * Get  
     * @return SnapshotByTimeOffsetCompleteEvent 
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetCompleteEvent() {
        return this.SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Set 
     * @param SnapshotByTimeOffsetCompleteEvent 
     */
    public void setSnapshotByTimeOffsetCompleteEvent(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent) {
        this.SnapshotByTimeOffsetCompleteEvent = SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Get  
     * @return WechatPublishCompleteEvent 
     */
    public WechatPublishTask getWechatPublishCompleteEvent() {
        return this.WechatPublishCompleteEvent;
    }

    /**
     * Set 
     * @param WechatPublishCompleteEvent 
     */
    public void setWechatPublishCompleteEvent(WechatPublishTask WechatPublishCompleteEvent) {
        this.WechatPublishCompleteEvent = WechatPublishCompleteEvent;
    }

    /**
     * Get  
     * @return WechatMiniProgramPublishCompleteEvent 
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishCompleteEvent() {
        return this.WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Set 
     * @param WechatMiniProgramPublishCompleteEvent 
     */
    public void setWechatMiniProgramPublishCompleteEvent(WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent) {
        this.WechatMiniProgramPublishCompleteEvent = WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Get  
     * @return RemoveWatermarkCompleteEvent 
     */
    public RemoveWatermarkTask getRemoveWatermarkCompleteEvent() {
        return this.RemoveWatermarkCompleteEvent;
    }

    /**
     * Set 
     * @param RemoveWatermarkCompleteEvent 
     */
    public void setRemoveWatermarkCompleteEvent(RemoveWatermarkTask RemoveWatermarkCompleteEvent) {
        this.RemoveWatermarkCompleteEvent = RemoveWatermarkCompleteEvent;
    }

    /**
     * Get  
     * @return RestoreMediaCompleteEvent 
     */
    public RestoreMediaTask getRestoreMediaCompleteEvent() {
        return this.RestoreMediaCompleteEvent;
    }

    /**
     * Set 
     * @param RestoreMediaCompleteEvent 
     */
    public void setRestoreMediaCompleteEvent(RestoreMediaTask RestoreMediaCompleteEvent) {
        this.RestoreMediaCompleteEvent = RestoreMediaCompleteEvent;
    }

    /**
     * Get  
     * @return RebuildMediaCompleteEvent 
     */
    public RebuildMediaTask getRebuildMediaCompleteEvent() {
        return this.RebuildMediaCompleteEvent;
    }

    /**
     * Set 
     * @param RebuildMediaCompleteEvent 
     */
    public void setRebuildMediaCompleteEvent(RebuildMediaTask RebuildMediaCompleteEvent) {
        this.RebuildMediaCompleteEvent = RebuildMediaCompleteEvent;
    }

    /**
     * Get  
     * @return ExtractTraceWatermarkCompleteEvent 
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkCompleteEvent() {
        return this.ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Set 
     * @param ExtractTraceWatermarkCompleteEvent 
     */
    public void setExtractTraceWatermarkCompleteEvent(ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent) {
        this.ExtractTraceWatermarkCompleteEvent = ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Get  
     * @return ExtractCopyRightWatermarkCompleteEvent 
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkCompleteEvent() {
        return this.ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Set 
     * @param ExtractCopyRightWatermarkCompleteEvent 
     */
    public void setExtractCopyRightWatermarkCompleteEvent(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent) {
        this.ExtractCopyRightWatermarkCompleteEvent = ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Get  
     * @return ReviewAudioVideoCompleteEvent 
     */
    public ReviewAudioVideoTask getReviewAudioVideoCompleteEvent() {
        return this.ReviewAudioVideoCompleteEvent;
    }

    /**
     * Set 
     * @param ReviewAudioVideoCompleteEvent 
     */
    public void setReviewAudioVideoCompleteEvent(ReviewAudioVideoTask ReviewAudioVideoCompleteEvent) {
        this.ReviewAudioVideoCompleteEvent = ReviewAudioVideoCompleteEvent;
    }

    /**
     * Get  
     * @return ReduceMediaBitrateCompleteEvent 
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateCompleteEvent() {
        return this.ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Set 
     * @param ReduceMediaBitrateCompleteEvent 
     */
    public void setReduceMediaBitrateCompleteEvent(ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent) {
        this.ReduceMediaBitrateCompleteEvent = ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Get  
     * @return DescribeFileAttributesCompleteEvent 
     */
    public DescribeFileAttributesTask getDescribeFileAttributesCompleteEvent() {
        return this.DescribeFileAttributesCompleteEvent;
    }

    /**
     * Set 
     * @param DescribeFileAttributesCompleteEvent 
     */
    public void setDescribeFileAttributesCompleteEvent(DescribeFileAttributesTask DescribeFileAttributesCompleteEvent) {
        this.DescribeFileAttributesCompleteEvent = DescribeFileAttributesCompleteEvent;
    }

    /**
     * Get  
     * @return QualityInspectCompleteEvent 
     */
    public QualityInspectTask getQualityInspectCompleteEvent() {
        return this.QualityInspectCompleteEvent;
    }

    /**
     * Set 
     * @param QualityInspectCompleteEvent 
     */
    public void setQualityInspectCompleteEvent(QualityInspectTask QualityInspectCompleteEvent) {
        this.QualityInspectCompleteEvent = QualityInspectCompleteEvent;
    }

    /**
     * Get  
     * @return QualityEnhanceCompleteEvent 
     */
    public QualityEnhanceTask getQualityEnhanceCompleteEvent() {
        return this.QualityEnhanceCompleteEvent;
    }

    /**
     * Set 
     * @param QualityEnhanceCompleteEvent 
     */
    public void setQualityEnhanceCompleteEvent(QualityEnhanceTask QualityEnhanceCompleteEvent) {
        this.QualityEnhanceCompleteEvent = QualityEnhanceCompleteEvent;
    }

    /**
     * Get  
     * @return MediaCastStatusChangedEvent 
     */
    public MediaCastEvent getMediaCastStatusChangedEvent() {
        return this.MediaCastStatusChangedEvent;
    }

    /**
     * Set 
     * @param MediaCastStatusChangedEvent 
     */
    public void setMediaCastStatusChangedEvent(MediaCastEvent MediaCastStatusChangedEvent) {
        this.MediaCastStatusChangedEvent = MediaCastStatusChangedEvent;
    }

    /**
     * Get  
     * @return PersistenceCompleteEvent 
     */
    public PersistenceCompleteTask getPersistenceCompleteEvent() {
        return this.PersistenceCompleteEvent;
    }

    /**
     * Set 
     * @param PersistenceCompleteEvent 
     */
    public void setPersistenceCompleteEvent(PersistenceCompleteTask PersistenceCompleteEvent) {
        this.PersistenceCompleteEvent = PersistenceCompleteEvent;
    }

    /**
     * Get  
     * @return ComplexAdaptiveDynamicStreamingCompleteEvent 
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingCompleteEvent() {
        return this.ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Set 
     * @param ComplexAdaptiveDynamicStreamingCompleteEvent 
     */
    public void setComplexAdaptiveDynamicStreamingCompleteEvent(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingCompleteEvent) {
        this.ComplexAdaptiveDynamicStreamingCompleteEvent = ComplexAdaptiveDynamicStreamingCompleteEvent;
    }

    /**
     * Get  
     * @return ProcessMediaByMPSCompleteEvent 
     */
    public ProcessMediaByMPS getProcessMediaByMPSCompleteEvent() {
        return this.ProcessMediaByMPSCompleteEvent;
    }

    /**
     * Set 
     * @param ProcessMediaByMPSCompleteEvent 
     */
    public void setProcessMediaByMPSCompleteEvent(ProcessMediaByMPS ProcessMediaByMPSCompleteEvent) {
        this.ProcessMediaByMPSCompleteEvent = ProcessMediaByMPSCompleteEvent;
    }

    /**
     * Get  
     * @return AigcImageCompleteEvent 
     */
    public AigcImageTask getAigcImageCompleteEvent() {
        return this.AigcImageCompleteEvent;
    }

    /**
     * Set 
     * @param AigcImageCompleteEvent 
     */
    public void setAigcImageCompleteEvent(AigcImageTask AigcImageCompleteEvent) {
        this.AigcImageCompleteEvent = AigcImageCompleteEvent;
    }

    /**
     * Get  
     * @return AigcVideoCompleteEvent 
     */
    public AigcVideoTask getAigcVideoCompleteEvent() {
        return this.AigcVideoCompleteEvent;
    }

    /**
     * Set 
     * @param AigcVideoCompleteEvent 
     */
    public void setAigcVideoCompleteEvent(AigcVideoTask AigcVideoCompleteEvent) {
        this.AigcVideoCompleteEvent = AigcVideoCompleteEvent;
    }

    /**
     * Get  
     * @return ExtractBlindWatermarkComplete 
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkComplete() {
        return this.ExtractBlindWatermarkComplete;
    }

    /**
     * Set 
     * @param ExtractBlindWatermarkComplete 
     */
    public void setExtractBlindWatermarkComplete(ExtractBlindWatermarkTask ExtractBlindWatermarkComplete) {
        this.ExtractBlindWatermarkComplete = ExtractBlindWatermarkComplete;
    }

    /**
     * Get  
     * @return SceneAigcImageCompleteEvent 
     */
    public SceneAigcImageTask getSceneAigcImageCompleteEvent() {
        return this.SceneAigcImageCompleteEvent;
    }

    /**
     * Set 
     * @param SceneAigcImageCompleteEvent 
     */
    public void setSceneAigcImageCompleteEvent(SceneAigcImageTask SceneAigcImageCompleteEvent) {
        this.SceneAigcImageCompleteEvent = SceneAigcImageCompleteEvent;
    }

    /**
     * Get  
     * @return ProcessImageAsyncCompleteEvent 
     */
    public ProcessImageAsyncTask getProcessImageAsyncCompleteEvent() {
        return this.ProcessImageAsyncCompleteEvent;
    }

    /**
     * Set 
     * @param ProcessImageAsyncCompleteEvent 
     */
    public void setProcessImageAsyncCompleteEvent(ProcessImageAsyncTask ProcessImageAsyncCompleteEvent) {
        this.ProcessImageAsyncCompleteEvent = ProcessImageAsyncCompleteEvent;
    }

    /**
     * Get  
     * @return CreateAigcAdvancedCustomElementCompleteEvent 
     */
    public CreateAigcAdvancedCustomElementTask getCreateAigcAdvancedCustomElementCompleteEvent() {
        return this.CreateAigcAdvancedCustomElementCompleteEvent;
    }

    /**
     * Set 
     * @param CreateAigcAdvancedCustomElementCompleteEvent 
     */
    public void setCreateAigcAdvancedCustomElementCompleteEvent(CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementCompleteEvent) {
        this.CreateAigcAdvancedCustomElementCompleteEvent = CreateAigcAdvancedCustomElementCompleteEvent;
    }

    /**
     * Get  
     * @return CreateAigcCustomVoiceCompleteEvent 
     */
    public CreateAigcCustomVoiceTask getCreateAigcCustomVoiceCompleteEvent() {
        return this.CreateAigcCustomVoiceCompleteEvent;
    }

    /**
     * Set 
     * @param CreateAigcCustomVoiceCompleteEvent 
     */
    public void setCreateAigcCustomVoiceCompleteEvent(CreateAigcCustomVoiceTask CreateAigcCustomVoiceCompleteEvent) {
        this.CreateAigcCustomVoiceCompleteEvent = CreateAigcCustomVoiceCompleteEvent;
    }

    /**
     * Get  
     * @return DescribeAigcFaceInfoAsyncCompleteEvent 
     */
    public DescribeAigcFaceInfoAsyncTask getDescribeAigcFaceInfoAsyncCompleteEvent() {
        return this.DescribeAigcFaceInfoAsyncCompleteEvent;
    }

    /**
     * Set 
     * @param DescribeAigcFaceInfoAsyncCompleteEvent 
     */
    public void setDescribeAigcFaceInfoAsyncCompleteEvent(DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncCompleteEvent) {
        this.DescribeAigcFaceInfoAsyncCompleteEvent = DescribeAigcFaceInfoAsyncCompleteEvent;
    }

    /**
     * Get  
     * @return AigcHunyuan3DCompleteEvent 
     */
    public AigcHunyuan3DTask getAigcHunyuan3DCompleteEvent() {
        return this.AigcHunyuan3DCompleteEvent;
    }

    /**
     * Set 
     * @param AigcHunyuan3DCompleteEvent 
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

