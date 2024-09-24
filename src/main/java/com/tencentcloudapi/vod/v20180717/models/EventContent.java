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
    * <b>Supported event types:</b><li>`NewFileUpload`: Video uploaded.</li><li>`ProcedureStateChanged`: Task flow status changed.</li><li>`FileDeleted`: Video deleted.</li><li>`RestoreMediaComplete`: Video retrieved.</li><li>`PullComplete`: Finished video pulling.</li><li>`EditMediaComplete`: Finished video editing.</li><li>`SplitMediaComplete`: Finished video splitting.</li><li>`ComposeMediaComplete`: Finished producing the media file.</li><li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li><li>`RemoveWatermark`: Watermark removed.</li><li>`RebuildMediaComplete`: Finished audio/video remastering.</li><li>`ReviewAudioVideoComplete`: Finished moderation.</li><li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li><li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li><li>`QualityEnhanceComplete`: FinishedQualityEnhance.</li><li>`PersistenceComplete`: Clipping persistented. </li><b>v2017 task types:</b><li>`TranscodeComplete`: Finished video transcoding.</li><li>`ConcatComplete`: Finished video splicing.</li><li>`ClipComplete`: Finished video clipping.</li><li>`CreateImageSpriteComplete`: Finished image sprite generation.</li><li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Media uploaded event, valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileUploadEvent")
    @Expose
    private FileUploadTask FileUploadEvent;

    /**
    * Task flow status changed event, valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProcedureStateChangeEvent")
    @Expose
    private ProcedureTask ProcedureStateChangeEvent;

    /**
    * File deleted event, valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileDeleteEvent")
    @Expose
    private FileDeleteTask FileDeleteEvent;

    /**
    * PullUpload completion event, valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PullCompleteEvent")
    @Expose
    private PullUploadTask PullCompleteEvent;

    /**
    * EditMedia completion event, valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EditMediaCompleteEvent")
    @Expose
    private EditMediaTask EditMediaCompleteEvent;

    /**
    * SplitMedia completion event, valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SplitMediaCompleteEvent")
    @Expose
    private SplitMediaTask SplitMediaCompleteEvent;

    /**
    * ComposeMedia completion event, valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ComposeMediaCompleteEvent")
    @Expose
    private ComposeMediaTask ComposeMediaCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("ClipCompleteEvent")
    @Expose
    private ClipTask2017 ClipCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("TranscodeCompleteEvent")
    @Expose
    private TranscodeTask2017 TranscodeCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("CreateImageSpriteCompleteEvent")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("ConcatCompleteEvent")
    @Expose
    private ConcatTask2017 ConcatCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("SnapshotByTimeOffsetCompleteEvent")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("WechatPublishCompleteEvent")
    @Expose
    private WechatPublishTask WechatPublishCompleteEvent;

    /**
    * WechatMiniProgramPublish completion event, valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WechatMiniProgramPublishCompleteEvent")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent;

    /**
    * RemoveWatermark completion event, valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemoveWatermarkCompleteEvent")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkCompleteEvent;

    /**
    * RestoreMedia completion event, valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RestoreMediaCompleteEvent")
    @Expose
    private RestoreMediaTask RestoreMediaCompleteEvent;

    /**
    * RebuildMedia completion event, valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RebuildMediaCompleteEvent")
    @Expose
    private RebuildMediaTask RebuildMediaCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("ExtractTraceWatermarkCompleteEvent")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("ExtractCopyRightWatermarkCompleteEvent")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent;

    /**
    * ReviewAudioVideo completion event, valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReviewAudioVideoCompleteEvent")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoCompleteEvent;

    /**
    * Expired.
    */
    @SerializedName("ReduceMediaBitrateCompleteEvent")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent;

    /**
    * DescribeFileAttributes completion event, valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DescribeFileAttributesCompleteEvent")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesCompleteEvent;

    /**
    * QualityInspect completion event, valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityInspectCompleteEvent")
    @Expose
    private QualityInspectTask QualityInspectCompleteEvent;

    /**
    * Remaster completion event, valid when the event type is QualityEnhanceComplete.
Pay attention to: this field may return null, indicating that no valid value can be obtained
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
    * Persistence completion event, valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PersistenceCompleteEvent")
    @Expose
    private PersistenceCompleteTask PersistenceCompleteEvent;

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
     * Get <b>Supported event types:</b><li>`NewFileUpload`: Video uploaded.</li><li>`ProcedureStateChanged`: Task flow status changed.</li><li>`FileDeleted`: Video deleted.</li><li>`RestoreMediaComplete`: Video retrieved.</li><li>`PullComplete`: Finished video pulling.</li><li>`EditMediaComplete`: Finished video editing.</li><li>`SplitMediaComplete`: Finished video splitting.</li><li>`ComposeMediaComplete`: Finished producing the media file.</li><li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li><li>`RemoveWatermark`: Watermark removed.</li><li>`RebuildMediaComplete`: Finished audio/video remastering.</li><li>`ReviewAudioVideoComplete`: Finished moderation.</li><li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li><li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li><li>`QualityEnhanceComplete`: FinishedQualityEnhance.</li><li>`PersistenceComplete`: Clipping persistented. </li><b>v2017 task types:</b><li>`TranscodeComplete`: Finished video transcoding.</li><li>`ConcatComplete`: Finished video splicing.</li><li>`ClipComplete`: Finished video clipping.</li><li>`CreateImageSpriteComplete`: Finished image sprite generation.</li><li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li> 
     * @return EventType <b>Supported event types:</b><li>`NewFileUpload`: Video uploaded.</li><li>`ProcedureStateChanged`: Task flow status changed.</li><li>`FileDeleted`: Video deleted.</li><li>`RestoreMediaComplete`: Video retrieved.</li><li>`PullComplete`: Finished video pulling.</li><li>`EditMediaComplete`: Finished video editing.</li><li>`SplitMediaComplete`: Finished video splitting.</li><li>`ComposeMediaComplete`: Finished producing the media file.</li><li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li><li>`RemoveWatermark`: Watermark removed.</li><li>`RebuildMediaComplete`: Finished audio/video remastering.</li><li>`ReviewAudioVideoComplete`: Finished moderation.</li><li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li><li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li><li>`QualityEnhanceComplete`: FinishedQualityEnhance.</li><li>`PersistenceComplete`: Clipping persistented. </li><b>v2017 task types:</b><li>`TranscodeComplete`: Finished video transcoding.</li><li>`ConcatComplete`: Finished video splicing.</li><li>`ClipComplete`: Finished video clipping.</li><li>`CreateImageSpriteComplete`: Finished image sprite generation.</li><li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <b>Supported event types:</b><li>`NewFileUpload`: Video uploaded.</li><li>`ProcedureStateChanged`: Task flow status changed.</li><li>`FileDeleted`: Video deleted.</li><li>`RestoreMediaComplete`: Video retrieved.</li><li>`PullComplete`: Finished video pulling.</li><li>`EditMediaComplete`: Finished video editing.</li><li>`SplitMediaComplete`: Finished video splitting.</li><li>`ComposeMediaComplete`: Finished producing the media file.</li><li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li><li>`RemoveWatermark`: Watermark removed.</li><li>`RebuildMediaComplete`: Finished audio/video remastering.</li><li>`ReviewAudioVideoComplete`: Finished moderation.</li><li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li><li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li><li>`QualityEnhanceComplete`: FinishedQualityEnhance.</li><li>`PersistenceComplete`: Clipping persistented. </li><b>v2017 task types:</b><li>`TranscodeComplete`: Finished video transcoding.</li><li>`ConcatComplete`: Finished video splicing.</li><li>`ClipComplete`: Finished video clipping.</li><li>`CreateImageSpriteComplete`: Finished image sprite generation.</li><li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li>
     * @param EventType <b>Supported event types:</b><li>`NewFileUpload`: Video uploaded.</li><li>`ProcedureStateChanged`: Task flow status changed.</li><li>`FileDeleted`: Video deleted.</li><li>`RestoreMediaComplete`: Video retrieved.</li><li>`PullComplete`: Finished video pulling.</li><li>`EditMediaComplete`: Finished video editing.</li><li>`SplitMediaComplete`: Finished video splitting.</li><li>`ComposeMediaComplete`: Finished producing the media file.</li><li>`WechatMiniProgramPublishComplete`: Finished publishing on Weixin Mini Program.</li><li>`RemoveWatermark`: Watermark removed.</li><li>`RebuildMediaComplete`: Finished audio/video remastering.</li><li>`ReviewAudioVideoComplete`: Finished moderation.</li><li>`ExtractTraceWatermarkComplete`: Finished digital watermark extraction.</li><li>`DescribeFileAttributesComplete`: Finished getting file attributes.</li><li>`QualityEnhanceComplete`: FinishedQualityEnhance.</li><li>`PersistenceComplete`: Clipping persistented. </li><b>v2017 task types:</b><li>`TranscodeComplete`: Finished video transcoding.</li><li>`ConcatComplete`: Finished video splicing.</li><li>`ClipComplete`: Finished video clipping.</li><li>`CreateImageSpriteComplete`: Finished image sprite generation.</li><li>`CreateSnapshotByTimeOffsetComplete`: Finished time point screencapturing.</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Media uploaded event, valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileUploadEvent Media uploaded event, valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public FileUploadTask getFileUploadEvent() {
        return this.FileUploadEvent;
    }

    /**
     * Set Media uploaded event, valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileUploadEvent Media uploaded event, valid when the event type is NewFileUpload.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileUploadEvent(FileUploadTask FileUploadEvent) {
        this.FileUploadEvent = FileUploadEvent;
    }

    /**
     * Get Task flow status changed event, valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProcedureStateChangeEvent Task flow status changed event, valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ProcedureTask getProcedureStateChangeEvent() {
        return this.ProcedureStateChangeEvent;
    }

    /**
     * Set Task flow status changed event, valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProcedureStateChangeEvent Task flow status changed event, valid when the event type is ProcedureStateChanged.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProcedureStateChangeEvent(ProcedureTask ProcedureStateChangeEvent) {
        this.ProcedureStateChangeEvent = ProcedureStateChangeEvent;
    }

    /**
     * Get File deleted event, valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileDeleteEvent File deleted event, valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public FileDeleteTask getFileDeleteEvent() {
        return this.FileDeleteEvent;
    }

    /**
     * Set File deleted event, valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileDeleteEvent File deleted event, valid when the event type is FileDeleted.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileDeleteEvent(FileDeleteTask FileDeleteEvent) {
        this.FileDeleteEvent = FileDeleteEvent;
    }

    /**
     * Get PullUpload completion event, valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PullCompleteEvent PullUpload completion event, valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public PullUploadTask getPullCompleteEvent() {
        return this.PullCompleteEvent;
    }

    /**
     * Set PullUpload completion event, valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PullCompleteEvent PullUpload completion event, valid when the event type is PullComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPullCompleteEvent(PullUploadTask PullCompleteEvent) {
        this.PullCompleteEvent = PullCompleteEvent;
    }

    /**
     * Get EditMedia completion event, valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EditMediaCompleteEvent EditMedia completion event, valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public EditMediaTask getEditMediaCompleteEvent() {
        return this.EditMediaCompleteEvent;
    }

    /**
     * Set EditMedia completion event, valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EditMediaCompleteEvent EditMedia completion event, valid when the event type is EditMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEditMediaCompleteEvent(EditMediaTask EditMediaCompleteEvent) {
        this.EditMediaCompleteEvent = EditMediaCompleteEvent;
    }

    /**
     * Get SplitMedia completion event, valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SplitMediaCompleteEvent SplitMedia completion event, valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SplitMediaTask getSplitMediaCompleteEvent() {
        return this.SplitMediaCompleteEvent;
    }

    /**
     * Set SplitMedia completion event, valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SplitMediaCompleteEvent SplitMedia completion event, valid when the event type is SplitMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSplitMediaCompleteEvent(SplitMediaTask SplitMediaCompleteEvent) {
        this.SplitMediaCompleteEvent = SplitMediaCompleteEvent;
    }

    /**
     * Get ComposeMedia completion event, valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ComposeMediaCompleteEvent ComposeMedia completion event, valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ComposeMediaTask getComposeMediaCompleteEvent() {
        return this.ComposeMediaCompleteEvent;
    }

    /**
     * Set ComposeMedia completion event, valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ComposeMediaCompleteEvent ComposeMedia completion event, valid when the event type is ComposeMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setComposeMediaCompleteEvent(ComposeMediaTask ComposeMediaCompleteEvent) {
        this.ComposeMediaCompleteEvent = ComposeMediaCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return ClipCompleteEvent Expired.
     */
    public ClipTask2017 getClipCompleteEvent() {
        return this.ClipCompleteEvent;
    }

    /**
     * Set Expired.
     * @param ClipCompleteEvent Expired.
     */
    public void setClipCompleteEvent(ClipTask2017 ClipCompleteEvent) {
        this.ClipCompleteEvent = ClipCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return TranscodeCompleteEvent Expired.
     */
    public TranscodeTask2017 getTranscodeCompleteEvent() {
        return this.TranscodeCompleteEvent;
    }

    /**
     * Set Expired.
     * @param TranscodeCompleteEvent Expired.
     */
    public void setTranscodeCompleteEvent(TranscodeTask2017 TranscodeCompleteEvent) {
        this.TranscodeCompleteEvent = TranscodeCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return CreateImageSpriteCompleteEvent Expired.
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteCompleteEvent() {
        return this.CreateImageSpriteCompleteEvent;
    }

    /**
     * Set Expired.
     * @param CreateImageSpriteCompleteEvent Expired.
     */
    public void setCreateImageSpriteCompleteEvent(CreateImageSpriteTask2017 CreateImageSpriteCompleteEvent) {
        this.CreateImageSpriteCompleteEvent = CreateImageSpriteCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return ConcatCompleteEvent Expired.
     */
    public ConcatTask2017 getConcatCompleteEvent() {
        return this.ConcatCompleteEvent;
    }

    /**
     * Set Expired.
     * @param ConcatCompleteEvent Expired.
     */
    public void setConcatCompleteEvent(ConcatTask2017 ConcatCompleteEvent) {
        this.ConcatCompleteEvent = ConcatCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return SnapshotByTimeOffsetCompleteEvent Expired.
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetCompleteEvent() {
        return this.SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Set Expired.
     * @param SnapshotByTimeOffsetCompleteEvent Expired.
     */
    public void setSnapshotByTimeOffsetCompleteEvent(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetCompleteEvent) {
        this.SnapshotByTimeOffsetCompleteEvent = SnapshotByTimeOffsetCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return WechatPublishCompleteEvent Expired.
     */
    public WechatPublishTask getWechatPublishCompleteEvent() {
        return this.WechatPublishCompleteEvent;
    }

    /**
     * Set Expired.
     * @param WechatPublishCompleteEvent Expired.
     */
    public void setWechatPublishCompleteEvent(WechatPublishTask WechatPublishCompleteEvent) {
        this.WechatPublishCompleteEvent = WechatPublishCompleteEvent;
    }

    /**
     * Get WechatMiniProgramPublish completion event, valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WechatMiniProgramPublishCompleteEvent WechatMiniProgramPublish completion event, valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishCompleteEvent() {
        return this.WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Set WechatMiniProgramPublish completion event, valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WechatMiniProgramPublishCompleteEvent WechatMiniProgramPublish completion event, valid when the event type is WechatMiniProgramPublishComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWechatMiniProgramPublishCompleteEvent(WechatMiniProgramPublishTask WechatMiniProgramPublishCompleteEvent) {
        this.WechatMiniProgramPublishCompleteEvent = WechatMiniProgramPublishCompleteEvent;
    }

    /**
     * Get RemoveWatermark completion event, valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemoveWatermarkCompleteEvent RemoveWatermark completion event, valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RemoveWatermarkTask getRemoveWatermarkCompleteEvent() {
        return this.RemoveWatermarkCompleteEvent;
    }

    /**
     * Set RemoveWatermark completion event, valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemoveWatermarkCompleteEvent RemoveWatermark completion event, valid when the event type is RemoveWatermark.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemoveWatermarkCompleteEvent(RemoveWatermarkTask RemoveWatermarkCompleteEvent) {
        this.RemoveWatermarkCompleteEvent = RemoveWatermarkCompleteEvent;
    }

    /**
     * Get RestoreMedia completion event, valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RestoreMediaCompleteEvent RestoreMedia completion event, valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RestoreMediaTask getRestoreMediaCompleteEvent() {
        return this.RestoreMediaCompleteEvent;
    }

    /**
     * Set RestoreMedia completion event, valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RestoreMediaCompleteEvent RestoreMedia completion event, valid when the event type is RestoreMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRestoreMediaCompleteEvent(RestoreMediaTask RestoreMediaCompleteEvent) {
        this.RestoreMediaCompleteEvent = RestoreMediaCompleteEvent;
    }

    /**
     * Get RebuildMedia completion event, valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RebuildMediaCompleteEvent RebuildMedia completion event, valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RebuildMediaTask getRebuildMediaCompleteEvent() {
        return this.RebuildMediaCompleteEvent;
    }

    /**
     * Set RebuildMedia completion event, valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RebuildMediaCompleteEvent RebuildMedia completion event, valid when the event type is RebuildMediaComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRebuildMediaCompleteEvent(RebuildMediaTask RebuildMediaCompleteEvent) {
        this.RebuildMediaCompleteEvent = RebuildMediaCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return ExtractTraceWatermarkCompleteEvent Expired.
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkCompleteEvent() {
        return this.ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Set Expired.
     * @param ExtractTraceWatermarkCompleteEvent Expired.
     */
    public void setExtractTraceWatermarkCompleteEvent(ExtractTraceWatermarkTask ExtractTraceWatermarkCompleteEvent) {
        this.ExtractTraceWatermarkCompleteEvent = ExtractTraceWatermarkCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return ExtractCopyRightWatermarkCompleteEvent Expired.
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkCompleteEvent() {
        return this.ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Set Expired.
     * @param ExtractCopyRightWatermarkCompleteEvent Expired.
     */
    public void setExtractCopyRightWatermarkCompleteEvent(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkCompleteEvent) {
        this.ExtractCopyRightWatermarkCompleteEvent = ExtractCopyRightWatermarkCompleteEvent;
    }

    /**
     * Get ReviewAudioVideo completion event, valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReviewAudioVideoCompleteEvent ReviewAudioVideo completion event, valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ReviewAudioVideoTask getReviewAudioVideoCompleteEvent() {
        return this.ReviewAudioVideoCompleteEvent;
    }

    /**
     * Set ReviewAudioVideo completion event, valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReviewAudioVideoCompleteEvent ReviewAudioVideo completion event, valid when the event type is ReviewAudioVideoComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReviewAudioVideoCompleteEvent(ReviewAudioVideoTask ReviewAudioVideoCompleteEvent) {
        this.ReviewAudioVideoCompleteEvent = ReviewAudioVideoCompleteEvent;
    }

    /**
     * Get Expired. 
     * @return ReduceMediaBitrateCompleteEvent Expired.
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateCompleteEvent() {
        return this.ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Set Expired.
     * @param ReduceMediaBitrateCompleteEvent Expired.
     */
    public void setReduceMediaBitrateCompleteEvent(ReduceMediaBitrateTask ReduceMediaBitrateCompleteEvent) {
        this.ReduceMediaBitrateCompleteEvent = ReduceMediaBitrateCompleteEvent;
    }

    /**
     * Get DescribeFileAttributes completion event, valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DescribeFileAttributesCompleteEvent DescribeFileAttributes completion event, valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DescribeFileAttributesTask getDescribeFileAttributesCompleteEvent() {
        return this.DescribeFileAttributesCompleteEvent;
    }

    /**
     * Set DescribeFileAttributes completion event, valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DescribeFileAttributesCompleteEvent DescribeFileAttributes completion event, valid when the event type is DescribeFileAttributesComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescribeFileAttributesCompleteEvent(DescribeFileAttributesTask DescribeFileAttributesCompleteEvent) {
        this.DescribeFileAttributesCompleteEvent = DescribeFileAttributesCompleteEvent;
    }

    /**
     * Get QualityInspect completion event, valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityInspectCompleteEvent QualityInspect completion event, valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public QualityInspectTask getQualityInspectCompleteEvent() {
        return this.QualityInspectCompleteEvent;
    }

    /**
     * Set QualityInspect completion event, valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityInspectCompleteEvent QualityInspect completion event, valid when the event type is QualityInspectComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityInspectCompleteEvent(QualityInspectTask QualityInspectCompleteEvent) {
        this.QualityInspectCompleteEvent = QualityInspectCompleteEvent;
    }

    /**
     * Get Remaster completion event, valid when the event type is QualityEnhanceComplete.
Pay attention to: this field may return null, indicating that no valid value can be obtained 
     * @return QualityEnhanceCompleteEvent Remaster completion event, valid when the event type is QualityEnhanceComplete.
Pay attention to: this field may return null, indicating that no valid value can be obtained
     */
    public QualityEnhanceTask getQualityEnhanceCompleteEvent() {
        return this.QualityEnhanceCompleteEvent;
    }

    /**
     * Set Remaster completion event, valid when the event type is QualityEnhanceComplete.
Pay attention to: this field may return null, indicating that no valid value can be obtained
     * @param QualityEnhanceCompleteEvent Remaster completion event, valid when the event type is QualityEnhanceComplete.
Pay attention to: this field may return null, indicating that no valid value can be obtained
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
     * Get Persistence completion event, valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PersistenceCompleteEvent Persistence completion event, valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public PersistenceCompleteTask getPersistenceCompleteEvent() {
        return this.PersistenceCompleteEvent;
    }

    /**
     * Set Persistence completion event, valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PersistenceCompleteEvent Persistence completion event, valid when the event type is PersistenceComplete.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPersistenceCompleteEvent(PersistenceCompleteTask PersistenceCompleteEvent) {
        this.PersistenceCompleteEvent = PersistenceCompleteEvent;
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

    }
}

