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

public class EventContent extends AbstractModel {

    /**
    * Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again.
    */
    @SerializedName("EventHandle")
    @Expose
    private String EventHandle;

    /**
    * <b>Supported event types:</b>
<li>`NewFileUpload`: Video uploaded.</li>
<li>`ProcedureStateChanged`: Task flow status changed.</li>
<li>`FileDeleted`: Video deleted.</li>
<li>`RestoreMediaComplete`: Video retrieved.</li>
<li>`PullComplete`: Finished video pulling.</li>
<li>`EditMediaComplete`: Finished video editing.</li>
<li>`SplitMediaComplete`: Finished video splitting.</li>
<li>`ComposeMediaComplete`: Finished producing the media file.</li>
<li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li>
<li>`RemoveWatermark`: Watermark removed.</li>
<li>`RebuildMediaComplete`: Finished audio/video remastering.</li>
<li>`ReviewAudioVideoComplete`: Finished moderation.</li>
<li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li>
<li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li>
<b>v2017 task types:</b>
<li>`TranscodeComplete`: Finished video transcoding.</li>
<li>`ConcatComplete`: Finished video splicing.</li>
<li>`ClipComplete`: Finished video clipping.</li>
<li>`CreateImageSpriteComplete`: Finished image sprite generation.</li>
<li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li>
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
    * The notification for completing video splitting, which is valid if the event type is `SplitMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
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
    * The notification for completing watermark removal. This parameter is valid only if the event type is `RemoveWatermark`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemoveWatermarkCompleteEvent")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkCompleteEvent;

    /**
    * The notification for completing video retrieval. This parameter is valid if the event type is `RestoreMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RestoreMediaCompleteEvent")
    @Expose
    private RestoreMediaTask RestoreMediaCompleteEvent;

    /**
    * The notification for completing audio/video remastering. This parameter is valid only if the event type is `RebuildMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RebuildMediaCompleteEvent")
    @Expose
    private RebuildMediaTask RebuildMediaCompleteEvent;

    /**
    * The notification for completing digital watermark extraction. This parameter is valid only if `EventType` is `ExtractTraceWatermarkComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again. 
     * @return EventHandle Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again.
     */
    public String getEventHandle() {
        return this.EventHandle;
    }

    /**
     * Set Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again.
     * @param EventHandle Event handler. The caller must call `ConfirmEvents` to confirm that the message has been received, and the confirmation is valid for 30 seconds. After the confirmation expires, the event can be obtained again.
     */
    public void setEventHandle(String EventHandle) {
        this.EventHandle = EventHandle;
    }

    /**
     * Get <b>Supported event types:</b>
<li>`NewFileUpload`: Video uploaded.</li>
<li>`ProcedureStateChanged`: Task flow status changed.</li>
<li>`FileDeleted`: Video deleted.</li>
<li>`RestoreMediaComplete`: Video retrieved.</li>
<li>`PullComplete`: Finished video pulling.</li>
<li>`EditMediaComplete`: Finished video editing.</li>
<li>`SplitMediaComplete`: Finished video splitting.</li>
<li>`ComposeMediaComplete`: Finished producing the media file.</li>
<li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li>
<li>`RemoveWatermark`: Watermark removed.</li>
<li>`RebuildMediaComplete`: Finished audio/video remastering.</li>
<li>`ReviewAudioVideoComplete`: Finished moderation.</li>
<li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li>
<li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li>
<b>v2017 task types:</b>
<li>`TranscodeComplete`: Finished video transcoding.</li>
<li>`ConcatComplete`: Finished video splicing.</li>
<li>`ClipComplete`: Finished video clipping.</li>
<li>`CreateImageSpriteComplete`: Finished image sprite generation.</li>
<li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li> 
     * @return EventType <b>Supported event types:</b>
<li>`NewFileUpload`: Video uploaded.</li>
<li>`ProcedureStateChanged`: Task flow status changed.</li>
<li>`FileDeleted`: Video deleted.</li>
<li>`RestoreMediaComplete`: Video retrieved.</li>
<li>`PullComplete`: Finished video pulling.</li>
<li>`EditMediaComplete`: Finished video editing.</li>
<li>`SplitMediaComplete`: Finished video splitting.</li>
<li>`ComposeMediaComplete`: Finished producing the media file.</li>
<li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li>
<li>`RemoveWatermark`: Watermark removed.</li>
<li>`RebuildMediaComplete`: Finished audio/video remastering.</li>
<li>`ReviewAudioVideoComplete`: Finished moderation.</li>
<li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li>
<li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li>
<b>v2017 task types:</b>
<li>`TranscodeComplete`: Finished video transcoding.</li>
<li>`ConcatComplete`: Finished video splicing.</li>
<li>`ClipComplete`: Finished video clipping.</li>
<li>`CreateImageSpriteComplete`: Finished image sprite generation.</li>
<li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <b>Supported event types:</b>
<li>`NewFileUpload`: Video uploaded.</li>
<li>`ProcedureStateChanged`: Task flow status changed.</li>
<li>`FileDeleted`: Video deleted.</li>
<li>`RestoreMediaComplete`: Video retrieved.</li>
<li>`PullComplete`: Finished video pulling.</li>
<li>`EditMediaComplete`: Finished video editing.</li>
<li>`SplitMediaComplete`: Finished video splitting.</li>
<li>`ComposeMediaComplete`: Finished producing the media file.</li>
<li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li>
<li>`RemoveWatermark`: Watermark removed.</li>
<li>`RebuildMediaComplete`: Finished audio/video remastering.</li>
<li>`ReviewAudioVideoComplete`: Finished moderation.</li>
<li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li>
<li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li>
<b>v2017 task types:</b>
<li>`TranscodeComplete`: Finished video transcoding.</li>
<li>`ConcatComplete`: Finished video splicing.</li>
<li>`ClipComplete`: Finished video clipping.</li>
<li>`CreateImageSpriteComplete`: Finished image sprite generation.</li>
<li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li>
     * @param EventType <b>Supported event types:</b>
<li>`NewFileUpload`: Video uploaded.</li>
<li>`ProcedureStateChanged`: Task flow status changed.</li>
<li>`FileDeleted`: Video deleted.</li>
<li>`RestoreMediaComplete`: Video retrieved.</li>
<li>`PullComplete`: Finished video pulling.</li>
<li>`EditMediaComplete`: Finished video editing.</li>
<li>`SplitMediaComplete`: Finished video splitting.</li>
<li>`ComposeMediaComplete`: Finished producing the media file.</li>
<li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li>
<li>`RemoveWatermark`: Watermark removed.</li>
<li>`RebuildMediaComplete`: Finished audio/video remastering.</li>
<li>`ReviewAudioVideoComplete`: Finished moderation.</li>
<li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li>
<li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li>
<b>v2017 task types:</b>
<li>`TranscodeComplete`: Finished video transcoding.</li>
<li>`ConcatComplete`: Finished video splicing.</li>
<li>`ClipComplete`: Finished video clipping.</li>
<li>`CreateImageSpriteComplete`: Finished image sprite generation.</li>
<li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li>
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
     * Get The notification for completing video splitting, which is valid if the event type is `SplitMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SplitMediaCompleteEvent The notification for completing video splitting, which is valid if the event type is `SplitMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SplitMediaTask getSplitMediaCompleteEvent() {
        return this.SplitMediaCompleteEvent;
    }

    /**
     * Set The notification for completing video splitting, which is valid if the event type is `SplitMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SplitMediaCompleteEvent The notification for completing video splitting, which is valid if the event type is `SplitMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get The notification for completing watermark removal. This parameter is valid only if the event type is `RemoveWatermark`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemoveWatermarkCompleteEvent The notification for completing watermark removal. This parameter is valid only if the event type is `RemoveWatermark`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RemoveWatermarkTask getRemoveWatermarkCompleteEvent() {
        return this.RemoveWatermarkCompleteEvent;
    }

    /**
     * Set The notification for completing watermark removal. This parameter is valid only if the event type is `RemoveWatermark`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemoveWatermarkCompleteEvent The notification for completing watermark removal. This parameter is valid only if the event type is `RemoveWatermark`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemoveWatermarkCompleteEvent(RemoveWatermarkTask RemoveWatermarkCompleteEvent) {
        this.RemoveWatermarkCompleteEvent = RemoveWatermarkCompleteEvent;
    }

    /**
     * Get The notification for completing video retrieval. This parameter is valid if the event type is `RestoreMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RestoreMediaCompleteEvent The notification for completing video retrieval. This parameter is valid if the event type is `RestoreMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RestoreMediaTask getRestoreMediaCompleteEvent() {
        return this.RestoreMediaCompleteEvent;
    }

    /**
     * Set The notification for completing video retrieval. This parameter is valid if the event type is `RestoreMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RestoreMediaCompleteEvent The notification for completing video retrieval. This parameter is valid if the event type is `RestoreMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRestoreMediaCompleteEvent(RestoreMediaTask RestoreMediaCompleteEvent) {
        this.RestoreMediaCompleteEvent = RestoreMediaCompleteEvent;
    }

    /**
     * Get The notification for completing audio/video remastering. This parameter is valid only if the event type is `RebuildMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RebuildMediaCompleteEvent The notification for completing audio/video remastering. This parameter is valid only if the event type is `RebuildMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildMediaTask getRebuildMediaCompleteEvent() {
        return this.RebuildMediaCompleteEvent;
    }

    /**
     * Set The notification for completing audio/video remastering. This parameter is valid only if the event type is `RebuildMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RebuildMediaCompleteEvent The notification for completing audio/video remastering. This parameter is valid only if the event type is `RebuildMediaComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRebuildMediaCompleteEvent(RebuildMediaTask RebuildMediaCompleteEvent) {
        this.RebuildMediaCompleteEvent = RebuildMediaCompleteEvent;
    }

    /**
     * Get The notification for completing digital watermark extraction. This parameter is valid only if `EventType` is `ExtractTraceWatermarkComplete`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtractTraceWatermarkCompleteEvent The notification for completing digital watermark extraction. This parameter is valid only if `EventType` is `ExtractTraceWatermarkComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkCompleteEvent() {
        return this.ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Set The notification for completing digital watermark extraction. This parameter is valid only if `EventType` is `ExtractTraceWatermarkComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtractTraceWatermarkCompleteEvent The notification for completing digital watermark extraction. This parameter is valid only if `EventType` is `ExtractTraceWatermarkComplete`.
Note: This field may return null, indicating that no valid values can be obtained.
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

    }
}

