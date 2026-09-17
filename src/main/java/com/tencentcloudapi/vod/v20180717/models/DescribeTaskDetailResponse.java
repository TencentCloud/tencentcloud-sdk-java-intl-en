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

public class DescribeTaskDetailResponse extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 
    */
    @SerializedName("ProcedureTask")
    @Expose
    private ProcedureTask ProcedureTask;

    /**
    * 
    */
    @SerializedName("EditMediaTask")
    @Expose
    private EditMediaTask EditMediaTask;

    /**
    * 
    */
    @SerializedName("WechatPublishTask")
    @Expose
    private WechatPublishTask WechatPublishTask;

    /**
    * 
    */
    @SerializedName("ComposeMediaTask")
    @Expose
    private ComposeMediaTask ComposeMediaTask;

    /**
    * 
    */
    @SerializedName("SplitMediaTask")
    @Expose
    private SplitMediaTask SplitMediaTask;

    /**
    * 
    */
    @SerializedName("WechatMiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishTask;

    /**
    * 
    */
    @SerializedName("PullUploadTask")
    @Expose
    private PullUploadTask PullUploadTask;

    /**
    * 
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTask2017 TranscodeTask;

    /**
    * 
    */
    @SerializedName("ConcatTask")
    @Expose
    private ConcatTask2017 ConcatTask;

    /**
    * 
    */
    @SerializedName("ClipTask")
    @Expose
    private ClipTask2017 ClipTask;

    /**
    * 
    */
    @SerializedName("CreateImageSpriteTask")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteTask;

    /**
    * 
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask;

    /**
    * 
    */
    @SerializedName("RemoveWatermarkTask")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkTask;

    /**
    * 
    */
    @SerializedName("RebuildMediaTask")
    @Expose
    private RebuildMediaTask RebuildMediaTask;

    /**
    * 
    */
    @SerializedName("ExtractTraceWatermarkTask")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkTask;

    /**
    * 
    */
    @SerializedName("ExtractCopyRightWatermarkTask")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask;

    /**
    * 
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoTask;

    /**
    * 
    */
    @SerializedName("ReduceMediaBitrateTask")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateTask;

    /**
    * 
    */
    @SerializedName("DescribeFileAttributesTask")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesTask;

    /**
    * 
    */
    @SerializedName("QualityInspectTask")
    @Expose
    private QualityInspectTask QualityInspectTask;

    /**
    * 
    */
    @SerializedName("QualityEnhanceTask")
    @Expose
    private QualityEnhanceTask QualityEnhanceTask;

    /**
    * 
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingTask")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingTask;

    /**
    * 
    */
    @SerializedName("ProcessMediaByMPSTask")
    @Expose
    private ProcessMediaByMPS ProcessMediaByMPSTask;

    /**
    * 
    */
    @SerializedName("AigcImageTask")
    @Expose
    private AigcImageTask AigcImageTask;

    /**
    * 
    */
    @SerializedName("AigcVideoTask")
    @Expose
    private AigcVideoTask AigcVideoTask;

    /**
    * 
    */
    @SerializedName("ImportMediaKnowledge")
    @Expose
    private ImportMediaKnowledgeTask ImportMediaKnowledge;

    /**
    * 
    */
    @SerializedName("SceneAigcImageTask")
    @Expose
    private SceneAigcImageTask SceneAigcImageTask;

    /**
    * 
    */
    @SerializedName("SceneAigcVideoTask")
    @Expose
    private SceneAigcVideoTask SceneAigcVideoTask;

    /**
    * 
    */
    @SerializedName("ProcessImageAsyncTask")
    @Expose
    private ProcessImageAsync ProcessImageAsyncTask;

    /**
    * 
    */
    @SerializedName("ExtractBlindWatermarkTask")
    @Expose
    private ExtractBlindWatermarkTask ExtractBlindWatermarkTask;

    /**
    * 
    */
    @SerializedName("CreateAigcAdvancedCustomElementTask")
    @Expose
    private CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementTask;

    /**
    * 
    */
    @SerializedName("CreateAigcCustomVoiceTask")
    @Expose
    private CreateAigcCustomVoiceTask CreateAigcCustomVoiceTask;

    /**
    * 
    */
    @SerializedName("CreateAigcSubjectTask")
    @Expose
    private CreateAigcSubjectTask CreateAigcSubjectTask;

    /**
    * 
    */
    @SerializedName("AigcVideoRedrawTask")
    @Expose
    private AigcVideoRedrawTask AigcVideoRedrawTask;

    /**
    * 
    */
    @SerializedName("AigcAudioTask")
    @Expose
    private AigcAudioTask AigcAudioTask;

    /**
    * 
    */
    @SerializedName("CreateAigcAudioCloneTask")
    @Expose
    private CreateAigcAudioCloneTask CreateAigcAudioCloneTask;

    /**
    * 
    */
    @SerializedName("DescribeAigcFaceInfoAsyncTask")
    @Expose
    private DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncTask;

    /**
    * 
    */
    @SerializedName("AigcHunyuan3DTask")
    @Expose
    private AigcHunyuan3DTask AigcHunyuan3DTask;

    /**
    * 
    */
    @SerializedName("DesignVoiceAsyncTask")
    @Expose
    private DesignVoiceAsyncTask DesignVoiceAsyncTask;

    /**
    * 
    */
    @SerializedName("CloneVoiceAsyncTask")
    @Expose
    private CloneVoiceAsyncTask CloneVoiceAsyncTask;

    /**
    * 
    */
    @SerializedName("TextToSpeechAsyncTask")
    @Expose
    private TextToSpeechAsyncTask TextToSpeechAsyncTask;

    /**
    * 
    */
    @SerializedName("VideoDubbingAsyncTask")
    @Expose
    private VideoDubbingAsyncTask VideoDubbingAsyncTask;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get  
     * @return TaskType 
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 
     * @param TaskType 
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return BeginProcessTime 
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set 
     * @param BeginProcessTime 
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get  
     * @return FinishTime 
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 
     * @param FinishTime 
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get  
     * @return ProcedureTask 
     */
    public ProcedureTask getProcedureTask() {
        return this.ProcedureTask;
    }

    /**
     * Set 
     * @param ProcedureTask 
     */
    public void setProcedureTask(ProcedureTask ProcedureTask) {
        this.ProcedureTask = ProcedureTask;
    }

    /**
     * Get  
     * @return EditMediaTask 
     */
    public EditMediaTask getEditMediaTask() {
        return this.EditMediaTask;
    }

    /**
     * Set 
     * @param EditMediaTask 
     */
    public void setEditMediaTask(EditMediaTask EditMediaTask) {
        this.EditMediaTask = EditMediaTask;
    }

    /**
     * Get  
     * @return WechatPublishTask 
     */
    public WechatPublishTask getWechatPublishTask() {
        return this.WechatPublishTask;
    }

    /**
     * Set 
     * @param WechatPublishTask 
     */
    public void setWechatPublishTask(WechatPublishTask WechatPublishTask) {
        this.WechatPublishTask = WechatPublishTask;
    }

    /**
     * Get  
     * @return ComposeMediaTask 
     */
    public ComposeMediaTask getComposeMediaTask() {
        return this.ComposeMediaTask;
    }

    /**
     * Set 
     * @param ComposeMediaTask 
     */
    public void setComposeMediaTask(ComposeMediaTask ComposeMediaTask) {
        this.ComposeMediaTask = ComposeMediaTask;
    }

    /**
     * Get  
     * @return SplitMediaTask 
     */
    public SplitMediaTask getSplitMediaTask() {
        return this.SplitMediaTask;
    }

    /**
     * Set 
     * @param SplitMediaTask 
     */
    public void setSplitMediaTask(SplitMediaTask SplitMediaTask) {
        this.SplitMediaTask = SplitMediaTask;
    }

    /**
     * Get  
     * @return WechatMiniProgramPublishTask 
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishTask() {
        return this.WechatMiniProgramPublishTask;
    }

    /**
     * Set 
     * @param WechatMiniProgramPublishTask 
     */
    public void setWechatMiniProgramPublishTask(WechatMiniProgramPublishTask WechatMiniProgramPublishTask) {
        this.WechatMiniProgramPublishTask = WechatMiniProgramPublishTask;
    }

    /**
     * Get  
     * @return PullUploadTask 
     */
    public PullUploadTask getPullUploadTask() {
        return this.PullUploadTask;
    }

    /**
     * Set 
     * @param PullUploadTask 
     */
    public void setPullUploadTask(PullUploadTask PullUploadTask) {
        this.PullUploadTask = PullUploadTask;
    }

    /**
     * Get  
     * @return TranscodeTask 
     */
    public TranscodeTask2017 getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set 
     * @param TranscodeTask 
     */
    public void setTranscodeTask(TranscodeTask2017 TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get  
     * @return ConcatTask 
     */
    public ConcatTask2017 getConcatTask() {
        return this.ConcatTask;
    }

    /**
     * Set 
     * @param ConcatTask 
     */
    public void setConcatTask(ConcatTask2017 ConcatTask) {
        this.ConcatTask = ConcatTask;
    }

    /**
     * Get  
     * @return ClipTask 
     */
    public ClipTask2017 getClipTask() {
        return this.ClipTask;
    }

    /**
     * Set 
     * @param ClipTask 
     */
    public void setClipTask(ClipTask2017 ClipTask) {
        this.ClipTask = ClipTask;
    }

    /**
     * Get  
     * @return CreateImageSpriteTask 
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteTask() {
        return this.CreateImageSpriteTask;
    }

    /**
     * Set 
     * @param CreateImageSpriteTask 
     */
    public void setCreateImageSpriteTask(CreateImageSpriteTask2017 CreateImageSpriteTask) {
        this.CreateImageSpriteTask = CreateImageSpriteTask;
    }

    /**
     * Get  
     * @return SnapshotByTimeOffsetTask 
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set 
     * @param SnapshotByTimeOffsetTask 
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get  
     * @return RemoveWatermarkTask 
     */
    public RemoveWatermarkTask getRemoveWatermarkTask() {
        return this.RemoveWatermarkTask;
    }

    /**
     * Set 
     * @param RemoveWatermarkTask 
     */
    public void setRemoveWatermarkTask(RemoveWatermarkTask RemoveWatermarkTask) {
        this.RemoveWatermarkTask = RemoveWatermarkTask;
    }

    /**
     * Get  
     * @return RebuildMediaTask 
     */
    public RebuildMediaTask getRebuildMediaTask() {
        return this.RebuildMediaTask;
    }

    /**
     * Set 
     * @param RebuildMediaTask 
     */
    public void setRebuildMediaTask(RebuildMediaTask RebuildMediaTask) {
        this.RebuildMediaTask = RebuildMediaTask;
    }

    /**
     * Get  
     * @return ExtractTraceWatermarkTask 
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkTask() {
        return this.ExtractTraceWatermarkTask;
    }

    /**
     * Set 
     * @param ExtractTraceWatermarkTask 
     */
    public void setExtractTraceWatermarkTask(ExtractTraceWatermarkTask ExtractTraceWatermarkTask) {
        this.ExtractTraceWatermarkTask = ExtractTraceWatermarkTask;
    }

    /**
     * Get  
     * @return ExtractCopyRightWatermarkTask 
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkTask() {
        return this.ExtractCopyRightWatermarkTask;
    }

    /**
     * Set 
     * @param ExtractCopyRightWatermarkTask 
     */
    public void setExtractCopyRightWatermarkTask(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask) {
        this.ExtractCopyRightWatermarkTask = ExtractCopyRightWatermarkTask;
    }

    /**
     * Get  
     * @return ReviewAudioVideoTask 
     */
    public ReviewAudioVideoTask getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set 
     * @param ReviewAudioVideoTask 
     */
    public void setReviewAudioVideoTask(ReviewAudioVideoTask ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get  
     * @return ReduceMediaBitrateTask 
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateTask() {
        return this.ReduceMediaBitrateTask;
    }

    /**
     * Set 
     * @param ReduceMediaBitrateTask 
     */
    public void setReduceMediaBitrateTask(ReduceMediaBitrateTask ReduceMediaBitrateTask) {
        this.ReduceMediaBitrateTask = ReduceMediaBitrateTask;
    }

    /**
     * Get  
     * @return DescribeFileAttributesTask 
     */
    public DescribeFileAttributesTask getDescribeFileAttributesTask() {
        return this.DescribeFileAttributesTask;
    }

    /**
     * Set 
     * @param DescribeFileAttributesTask 
     */
    public void setDescribeFileAttributesTask(DescribeFileAttributesTask DescribeFileAttributesTask) {
        this.DescribeFileAttributesTask = DescribeFileAttributesTask;
    }

    /**
     * Get  
     * @return QualityInspectTask 
     */
    public QualityInspectTask getQualityInspectTask() {
        return this.QualityInspectTask;
    }

    /**
     * Set 
     * @param QualityInspectTask 
     */
    public void setQualityInspectTask(QualityInspectTask QualityInspectTask) {
        this.QualityInspectTask = QualityInspectTask;
    }

    /**
     * Get  
     * @return QualityEnhanceTask 
     */
    public QualityEnhanceTask getQualityEnhanceTask() {
        return this.QualityEnhanceTask;
    }

    /**
     * Set 
     * @param QualityEnhanceTask 
     */
    public void setQualityEnhanceTask(QualityEnhanceTask QualityEnhanceTask) {
        this.QualityEnhanceTask = QualityEnhanceTask;
    }

    /**
     * Get  
     * @return ComplexAdaptiveDynamicStreamingTask 
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingTask() {
        return this.ComplexAdaptiveDynamicStreamingTask;
    }

    /**
     * Set 
     * @param ComplexAdaptiveDynamicStreamingTask 
     */
    public void setComplexAdaptiveDynamicStreamingTask(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingTask) {
        this.ComplexAdaptiveDynamicStreamingTask = ComplexAdaptiveDynamicStreamingTask;
    }

    /**
     * Get  
     * @return ProcessMediaByMPSTask 
     */
    public ProcessMediaByMPS getProcessMediaByMPSTask() {
        return this.ProcessMediaByMPSTask;
    }

    /**
     * Set 
     * @param ProcessMediaByMPSTask 
     */
    public void setProcessMediaByMPSTask(ProcessMediaByMPS ProcessMediaByMPSTask) {
        this.ProcessMediaByMPSTask = ProcessMediaByMPSTask;
    }

    /**
     * Get  
     * @return AigcImageTask 
     */
    public AigcImageTask getAigcImageTask() {
        return this.AigcImageTask;
    }

    /**
     * Set 
     * @param AigcImageTask 
     */
    public void setAigcImageTask(AigcImageTask AigcImageTask) {
        this.AigcImageTask = AigcImageTask;
    }

    /**
     * Get  
     * @return AigcVideoTask 
     */
    public AigcVideoTask getAigcVideoTask() {
        return this.AigcVideoTask;
    }

    /**
     * Set 
     * @param AigcVideoTask 
     */
    public void setAigcVideoTask(AigcVideoTask AigcVideoTask) {
        this.AigcVideoTask = AigcVideoTask;
    }

    /**
     * Get  
     * @return ImportMediaKnowledge 
     */
    public ImportMediaKnowledgeTask getImportMediaKnowledge() {
        return this.ImportMediaKnowledge;
    }

    /**
     * Set 
     * @param ImportMediaKnowledge 
     */
    public void setImportMediaKnowledge(ImportMediaKnowledgeTask ImportMediaKnowledge) {
        this.ImportMediaKnowledge = ImportMediaKnowledge;
    }

    /**
     * Get  
     * @return SceneAigcImageTask 
     */
    public SceneAigcImageTask getSceneAigcImageTask() {
        return this.SceneAigcImageTask;
    }

    /**
     * Set 
     * @param SceneAigcImageTask 
     */
    public void setSceneAigcImageTask(SceneAigcImageTask SceneAigcImageTask) {
        this.SceneAigcImageTask = SceneAigcImageTask;
    }

    /**
     * Get  
     * @return SceneAigcVideoTask 
     */
    public SceneAigcVideoTask getSceneAigcVideoTask() {
        return this.SceneAigcVideoTask;
    }

    /**
     * Set 
     * @param SceneAigcVideoTask 
     */
    public void setSceneAigcVideoTask(SceneAigcVideoTask SceneAigcVideoTask) {
        this.SceneAigcVideoTask = SceneAigcVideoTask;
    }

    /**
     * Get  
     * @return ProcessImageAsyncTask 
     */
    public ProcessImageAsync getProcessImageAsyncTask() {
        return this.ProcessImageAsyncTask;
    }

    /**
     * Set 
     * @param ProcessImageAsyncTask 
     */
    public void setProcessImageAsyncTask(ProcessImageAsync ProcessImageAsyncTask) {
        this.ProcessImageAsyncTask = ProcessImageAsyncTask;
    }

    /**
     * Get  
     * @return ExtractBlindWatermarkTask 
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkTask() {
        return this.ExtractBlindWatermarkTask;
    }

    /**
     * Set 
     * @param ExtractBlindWatermarkTask 
     */
    public void setExtractBlindWatermarkTask(ExtractBlindWatermarkTask ExtractBlindWatermarkTask) {
        this.ExtractBlindWatermarkTask = ExtractBlindWatermarkTask;
    }

    /**
     * Get  
     * @return CreateAigcAdvancedCustomElementTask 
     */
    public CreateAigcAdvancedCustomElementTask getCreateAigcAdvancedCustomElementTask() {
        return this.CreateAigcAdvancedCustomElementTask;
    }

    /**
     * Set 
     * @param CreateAigcAdvancedCustomElementTask 
     */
    public void setCreateAigcAdvancedCustomElementTask(CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementTask) {
        this.CreateAigcAdvancedCustomElementTask = CreateAigcAdvancedCustomElementTask;
    }

    /**
     * Get  
     * @return CreateAigcCustomVoiceTask 
     */
    public CreateAigcCustomVoiceTask getCreateAigcCustomVoiceTask() {
        return this.CreateAigcCustomVoiceTask;
    }

    /**
     * Set 
     * @param CreateAigcCustomVoiceTask 
     */
    public void setCreateAigcCustomVoiceTask(CreateAigcCustomVoiceTask CreateAigcCustomVoiceTask) {
        this.CreateAigcCustomVoiceTask = CreateAigcCustomVoiceTask;
    }

    /**
     * Get  
     * @return CreateAigcSubjectTask 
     */
    public CreateAigcSubjectTask getCreateAigcSubjectTask() {
        return this.CreateAigcSubjectTask;
    }

    /**
     * Set 
     * @param CreateAigcSubjectTask 
     */
    public void setCreateAigcSubjectTask(CreateAigcSubjectTask CreateAigcSubjectTask) {
        this.CreateAigcSubjectTask = CreateAigcSubjectTask;
    }

    /**
     * Get  
     * @return AigcVideoRedrawTask 
     */
    public AigcVideoRedrawTask getAigcVideoRedrawTask() {
        return this.AigcVideoRedrawTask;
    }

    /**
     * Set 
     * @param AigcVideoRedrawTask 
     */
    public void setAigcVideoRedrawTask(AigcVideoRedrawTask AigcVideoRedrawTask) {
        this.AigcVideoRedrawTask = AigcVideoRedrawTask;
    }

    /**
     * Get  
     * @return AigcAudioTask 
     */
    public AigcAudioTask getAigcAudioTask() {
        return this.AigcAudioTask;
    }

    /**
     * Set 
     * @param AigcAudioTask 
     */
    public void setAigcAudioTask(AigcAudioTask AigcAudioTask) {
        this.AigcAudioTask = AigcAudioTask;
    }

    /**
     * Get  
     * @return CreateAigcAudioCloneTask 
     */
    public CreateAigcAudioCloneTask getCreateAigcAudioCloneTask() {
        return this.CreateAigcAudioCloneTask;
    }

    /**
     * Set 
     * @param CreateAigcAudioCloneTask 
     */
    public void setCreateAigcAudioCloneTask(CreateAigcAudioCloneTask CreateAigcAudioCloneTask) {
        this.CreateAigcAudioCloneTask = CreateAigcAudioCloneTask;
    }

    /**
     * Get  
     * @return DescribeAigcFaceInfoAsyncTask 
     */
    public DescribeAigcFaceInfoAsyncTask getDescribeAigcFaceInfoAsyncTask() {
        return this.DescribeAigcFaceInfoAsyncTask;
    }

    /**
     * Set 
     * @param DescribeAigcFaceInfoAsyncTask 
     */
    public void setDescribeAigcFaceInfoAsyncTask(DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncTask) {
        this.DescribeAigcFaceInfoAsyncTask = DescribeAigcFaceInfoAsyncTask;
    }

    /**
     * Get  
     * @return AigcHunyuan3DTask 
     */
    public AigcHunyuan3DTask getAigcHunyuan3DTask() {
        return this.AigcHunyuan3DTask;
    }

    /**
     * Set 
     * @param AigcHunyuan3DTask 
     */
    public void setAigcHunyuan3DTask(AigcHunyuan3DTask AigcHunyuan3DTask) {
        this.AigcHunyuan3DTask = AigcHunyuan3DTask;
    }

    /**
     * Get  
     * @return DesignVoiceAsyncTask 
     */
    public DesignVoiceAsyncTask getDesignVoiceAsyncTask() {
        return this.DesignVoiceAsyncTask;
    }

    /**
     * Set 
     * @param DesignVoiceAsyncTask 
     */
    public void setDesignVoiceAsyncTask(DesignVoiceAsyncTask DesignVoiceAsyncTask) {
        this.DesignVoiceAsyncTask = DesignVoiceAsyncTask;
    }

    /**
     * Get  
     * @return CloneVoiceAsyncTask 
     */
    public CloneVoiceAsyncTask getCloneVoiceAsyncTask() {
        return this.CloneVoiceAsyncTask;
    }

    /**
     * Set 
     * @param CloneVoiceAsyncTask 
     */
    public void setCloneVoiceAsyncTask(CloneVoiceAsyncTask CloneVoiceAsyncTask) {
        this.CloneVoiceAsyncTask = CloneVoiceAsyncTask;
    }

    /**
     * Get  
     * @return TextToSpeechAsyncTask 
     */
    public TextToSpeechAsyncTask getTextToSpeechAsyncTask() {
        return this.TextToSpeechAsyncTask;
    }

    /**
     * Set 
     * @param TextToSpeechAsyncTask 
     */
    public void setTextToSpeechAsyncTask(TextToSpeechAsyncTask TextToSpeechAsyncTask) {
        this.TextToSpeechAsyncTask = TextToSpeechAsyncTask;
    }

    /**
     * Get  
     * @return VideoDubbingAsyncTask 
     */
    public VideoDubbingAsyncTask getVideoDubbingAsyncTask() {
        return this.VideoDubbingAsyncTask;
    }

    /**
     * Set 
     * @param VideoDubbingAsyncTask 
     */
    public void setVideoDubbingAsyncTask(VideoDubbingAsyncTask VideoDubbingAsyncTask) {
        this.VideoDubbingAsyncTask = VideoDubbingAsyncTask;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailResponse(DescribeTaskDetailResponse source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.ProcedureTask != null) {
            this.ProcedureTask = new ProcedureTask(source.ProcedureTask);
        }
        if (source.EditMediaTask != null) {
            this.EditMediaTask = new EditMediaTask(source.EditMediaTask);
        }
        if (source.WechatPublishTask != null) {
            this.WechatPublishTask = new WechatPublishTask(source.WechatPublishTask);
        }
        if (source.ComposeMediaTask != null) {
            this.ComposeMediaTask = new ComposeMediaTask(source.ComposeMediaTask);
        }
        if (source.SplitMediaTask != null) {
            this.SplitMediaTask = new SplitMediaTask(source.SplitMediaTask);
        }
        if (source.WechatMiniProgramPublishTask != null) {
            this.WechatMiniProgramPublishTask = new WechatMiniProgramPublishTask(source.WechatMiniProgramPublishTask);
        }
        if (source.PullUploadTask != null) {
            this.PullUploadTask = new PullUploadTask(source.PullUploadTask);
        }
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new TranscodeTask2017(source.TranscodeTask);
        }
        if (source.ConcatTask != null) {
            this.ConcatTask = new ConcatTask2017(source.ConcatTask);
        }
        if (source.ClipTask != null) {
            this.ClipTask = new ClipTask2017(source.ClipTask);
        }
        if (source.CreateImageSpriteTask != null) {
            this.CreateImageSpriteTask = new CreateImageSpriteTask2017(source.CreateImageSpriteTask);
        }
        if (source.SnapshotByTimeOffsetTask != null) {
            this.SnapshotByTimeOffsetTask = new SnapshotByTimeOffsetTask2017(source.SnapshotByTimeOffsetTask);
        }
        if (source.RemoveWatermarkTask != null) {
            this.RemoveWatermarkTask = new RemoveWatermarkTask(source.RemoveWatermarkTask);
        }
        if (source.RebuildMediaTask != null) {
            this.RebuildMediaTask = new RebuildMediaTask(source.RebuildMediaTask);
        }
        if (source.ExtractTraceWatermarkTask != null) {
            this.ExtractTraceWatermarkTask = new ExtractTraceWatermarkTask(source.ExtractTraceWatermarkTask);
        }
        if (source.ExtractCopyRightWatermarkTask != null) {
            this.ExtractCopyRightWatermarkTask = new ExtractCopyRightWatermarkTask(source.ExtractCopyRightWatermarkTask);
        }
        if (source.ReviewAudioVideoTask != null) {
            this.ReviewAudioVideoTask = new ReviewAudioVideoTask(source.ReviewAudioVideoTask);
        }
        if (source.ReduceMediaBitrateTask != null) {
            this.ReduceMediaBitrateTask = new ReduceMediaBitrateTask(source.ReduceMediaBitrateTask);
        }
        if (source.DescribeFileAttributesTask != null) {
            this.DescribeFileAttributesTask = new DescribeFileAttributesTask(source.DescribeFileAttributesTask);
        }
        if (source.QualityInspectTask != null) {
            this.QualityInspectTask = new QualityInspectTask(source.QualityInspectTask);
        }
        if (source.QualityEnhanceTask != null) {
            this.QualityEnhanceTask = new QualityEnhanceTask(source.QualityEnhanceTask);
        }
        if (source.ComplexAdaptiveDynamicStreamingTask != null) {
            this.ComplexAdaptiveDynamicStreamingTask = new ComplexAdaptiveDynamicStreamingTask(source.ComplexAdaptiveDynamicStreamingTask);
        }
        if (source.ProcessMediaByMPSTask != null) {
            this.ProcessMediaByMPSTask = new ProcessMediaByMPS(source.ProcessMediaByMPSTask);
        }
        if (source.AigcImageTask != null) {
            this.AigcImageTask = new AigcImageTask(source.AigcImageTask);
        }
        if (source.AigcVideoTask != null) {
            this.AigcVideoTask = new AigcVideoTask(source.AigcVideoTask);
        }
        if (source.ImportMediaKnowledge != null) {
            this.ImportMediaKnowledge = new ImportMediaKnowledgeTask(source.ImportMediaKnowledge);
        }
        if (source.SceneAigcImageTask != null) {
            this.SceneAigcImageTask = new SceneAigcImageTask(source.SceneAigcImageTask);
        }
        if (source.SceneAigcVideoTask != null) {
            this.SceneAigcVideoTask = new SceneAigcVideoTask(source.SceneAigcVideoTask);
        }
        if (source.ProcessImageAsyncTask != null) {
            this.ProcessImageAsyncTask = new ProcessImageAsync(source.ProcessImageAsyncTask);
        }
        if (source.ExtractBlindWatermarkTask != null) {
            this.ExtractBlindWatermarkTask = new ExtractBlindWatermarkTask(source.ExtractBlindWatermarkTask);
        }
        if (source.CreateAigcAdvancedCustomElementTask != null) {
            this.CreateAigcAdvancedCustomElementTask = new CreateAigcAdvancedCustomElementTask(source.CreateAigcAdvancedCustomElementTask);
        }
        if (source.CreateAigcCustomVoiceTask != null) {
            this.CreateAigcCustomVoiceTask = new CreateAigcCustomVoiceTask(source.CreateAigcCustomVoiceTask);
        }
        if (source.CreateAigcSubjectTask != null) {
            this.CreateAigcSubjectTask = new CreateAigcSubjectTask(source.CreateAigcSubjectTask);
        }
        if (source.AigcVideoRedrawTask != null) {
            this.AigcVideoRedrawTask = new AigcVideoRedrawTask(source.AigcVideoRedrawTask);
        }
        if (source.AigcAudioTask != null) {
            this.AigcAudioTask = new AigcAudioTask(source.AigcAudioTask);
        }
        if (source.CreateAigcAudioCloneTask != null) {
            this.CreateAigcAudioCloneTask = new CreateAigcAudioCloneTask(source.CreateAigcAudioCloneTask);
        }
        if (source.DescribeAigcFaceInfoAsyncTask != null) {
            this.DescribeAigcFaceInfoAsyncTask = new DescribeAigcFaceInfoAsyncTask(source.DescribeAigcFaceInfoAsyncTask);
        }
        if (source.AigcHunyuan3DTask != null) {
            this.AigcHunyuan3DTask = new AigcHunyuan3DTask(source.AigcHunyuan3DTask);
        }
        if (source.DesignVoiceAsyncTask != null) {
            this.DesignVoiceAsyncTask = new DesignVoiceAsyncTask(source.DesignVoiceAsyncTask);
        }
        if (source.CloneVoiceAsyncTask != null) {
            this.CloneVoiceAsyncTask = new CloneVoiceAsyncTask(source.CloneVoiceAsyncTask);
        }
        if (source.TextToSpeechAsyncTask != null) {
            this.TextToSpeechAsyncTask = new TextToSpeechAsyncTask(source.TextToSpeechAsyncTask);
        }
        if (source.VideoDubbingAsyncTask != null) {
            this.VideoDubbingAsyncTask = new VideoDubbingAsyncTask(source.VideoDubbingAsyncTask);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamObj(map, prefix + "ProcedureTask.", this.ProcedureTask);
        this.setParamObj(map, prefix + "EditMediaTask.", this.EditMediaTask);
        this.setParamObj(map, prefix + "WechatPublishTask.", this.WechatPublishTask);
        this.setParamObj(map, prefix + "ComposeMediaTask.", this.ComposeMediaTask);
        this.setParamObj(map, prefix + "SplitMediaTask.", this.SplitMediaTask);
        this.setParamObj(map, prefix + "WechatMiniProgramPublishTask.", this.WechatMiniProgramPublishTask);
        this.setParamObj(map, prefix + "PullUploadTask.", this.PullUploadTask);
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "ConcatTask.", this.ConcatTask);
        this.setParamObj(map, prefix + "ClipTask.", this.ClipTask);
        this.setParamObj(map, prefix + "CreateImageSpriteTask.", this.CreateImageSpriteTask);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetTask.", this.SnapshotByTimeOffsetTask);
        this.setParamObj(map, prefix + "RemoveWatermarkTask.", this.RemoveWatermarkTask);
        this.setParamObj(map, prefix + "RebuildMediaTask.", this.RebuildMediaTask);
        this.setParamObj(map, prefix + "ExtractTraceWatermarkTask.", this.ExtractTraceWatermarkTask);
        this.setParamObj(map, prefix + "ExtractCopyRightWatermarkTask.", this.ExtractCopyRightWatermarkTask);
        this.setParamObj(map, prefix + "ReviewAudioVideoTask.", this.ReviewAudioVideoTask);
        this.setParamObj(map, prefix + "ReduceMediaBitrateTask.", this.ReduceMediaBitrateTask);
        this.setParamObj(map, prefix + "DescribeFileAttributesTask.", this.DescribeFileAttributesTask);
        this.setParamObj(map, prefix + "QualityInspectTask.", this.QualityInspectTask);
        this.setParamObj(map, prefix + "QualityEnhanceTask.", this.QualityEnhanceTask);
        this.setParamObj(map, prefix + "ComplexAdaptiveDynamicStreamingTask.", this.ComplexAdaptiveDynamicStreamingTask);
        this.setParamObj(map, prefix + "ProcessMediaByMPSTask.", this.ProcessMediaByMPSTask);
        this.setParamObj(map, prefix + "AigcImageTask.", this.AigcImageTask);
        this.setParamObj(map, prefix + "AigcVideoTask.", this.AigcVideoTask);
        this.setParamObj(map, prefix + "ImportMediaKnowledge.", this.ImportMediaKnowledge);
        this.setParamObj(map, prefix + "SceneAigcImageTask.", this.SceneAigcImageTask);
        this.setParamObj(map, prefix + "SceneAigcVideoTask.", this.SceneAigcVideoTask);
        this.setParamObj(map, prefix + "ProcessImageAsyncTask.", this.ProcessImageAsyncTask);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkTask.", this.ExtractBlindWatermarkTask);
        this.setParamObj(map, prefix + "CreateAigcAdvancedCustomElementTask.", this.CreateAigcAdvancedCustomElementTask);
        this.setParamObj(map, prefix + "CreateAigcCustomVoiceTask.", this.CreateAigcCustomVoiceTask);
        this.setParamObj(map, prefix + "CreateAigcSubjectTask.", this.CreateAigcSubjectTask);
        this.setParamObj(map, prefix + "AigcVideoRedrawTask.", this.AigcVideoRedrawTask);
        this.setParamObj(map, prefix + "AigcAudioTask.", this.AigcAudioTask);
        this.setParamObj(map, prefix + "CreateAigcAudioCloneTask.", this.CreateAigcAudioCloneTask);
        this.setParamObj(map, prefix + "DescribeAigcFaceInfoAsyncTask.", this.DescribeAigcFaceInfoAsyncTask);
        this.setParamObj(map, prefix + "AigcHunyuan3DTask.", this.AigcHunyuan3DTask);
        this.setParamObj(map, prefix + "DesignVoiceAsyncTask.", this.DesignVoiceAsyncTask);
        this.setParamObj(map, prefix + "CloneVoiceAsyncTask.", this.CloneVoiceAsyncTask);
        this.setParamObj(map, prefix + "TextToSpeechAsyncTask.", this.TextToSpeechAsyncTask);
        this.setParamObj(map, prefix + "VideoDubbingAsyncTask.", this.VideoDubbingAsyncTask);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

