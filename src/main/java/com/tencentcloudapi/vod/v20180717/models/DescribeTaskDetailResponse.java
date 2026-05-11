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
    * <p>Task type. Valid values: <li>Procedure: Video processing task;</li><li>EditMedia: Video editing task;</li><li>SplitMedia: Video splitting task;</li><li>ComposeMedia: Media file creation task;</li><li>WechatPublish: WeChat publishing task;</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task;</li><li>PullUpload: Pull and upload media files task;</li><li>FastClipMedia: Quick trimming task;</li><li>RemoveWatermarkTask: Intelligent watermark removal task;</li><li>DescribeFileAttributesTask: File attribute retrieval task;</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended);</li><li>ReviewAudioVideo: Audio/video moderation task;</li><li>ExtractTraceWatermark: Source watermark extraction task;</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task;</li><li>QualityInspect: Audio and video quality inspection task;</li><li>QualityEnhance: Audio and video quality regeneration task;</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task;</li><li>ProcessMediaByMPS: MPS video processing task;</li><li>AigcImageTask: AIGC image generation task;</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task;</li><li>AigcVideoTask: AIGC video generation task;</li><li>ImportMediaKnowledge: Import media knowledge task.</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task;</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>CreateAigcAdvancedCustomElementTask: Create custom subject task</li><li>CreateAigcCustomVoiceTask: Create custom voice type task</li><li>CreateAigcSubjectTask: Create subject task</li></p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>Task status. Value:</p><li>WAITING: Waiting;</li><li>PROCESSING: Processing;</li><li>FINISH: Completed;</li><li>ABORTED: Terminated.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Task creation time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Task execution start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * <p>Task execution completion time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcedureTask")
    @Expose
    private ProcedureTask ProcedureTask;

    /**
    * <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EditMediaTask")
    @Expose
    private EditMediaTask EditMediaTask;

    /**
    * <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatPublishTask")
    @Expose
    private WechatPublishTask WechatPublishTask;

    /**
    * <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComposeMediaTask")
    @Expose
    private ComposeMediaTask ComposeMediaTask;

    /**
    * <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SplitMediaTask")
    @Expose
    private SplitMediaTask SplitMediaTask;

    /**
    * <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatMiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishTask;

    /**
    * <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PullUploadTask")
    @Expose
    private PullUploadTask PullUploadTask;

    /**
    * <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTask2017 TranscodeTask;

    /**
    * <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConcatTask")
    @Expose
    private ConcatTask2017 ConcatTask;

    /**
    * <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClipTask")
    @Expose
    private ClipTask2017 ClipTask;

    /**
    * <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateImageSpriteTask")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteTask;

    /**
    * <p>Video screenshot at specified time task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask;

    /**
    * <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemoveWatermarkTask")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkTask;

    /**
    * <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RebuildMediaTask")
    @Expose
    private RebuildMediaTask RebuildMediaTask;

    /**
    * <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtractTraceWatermarkTask")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkTask;

    /**
    * <p>Information about the copyright watermark extraction task. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtractCopyRightWatermarkTask")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask;

    /**
    * <p>Audio/video moderation task info. This field has a value only when TaskType is ReviewAudioVideo.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoTask;

    /**
    * <p>This field is invalid.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReduceMediaBitrateTask")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateTask;

    /**
    * <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DescribeFileAttributesTask")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesTask;

    /**
    * <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityInspectTask")
    @Expose
    private QualityInspectTask QualityInspectTask;

    /**
    * <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityEnhanceTask")
    @Expose
    private QualityEnhanceTask QualityEnhanceTask;

    /**
    * <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingTask")
    @Expose
    private ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingTask;

    /**
    * <p>MPS video processing task information. This field has a value only when TaskType is ProcessMediaByMPS.</p>
    */
    @SerializedName("ProcessMediaByMPSTask")
    @Expose
    private ProcessMediaByMPS ProcessMediaByMPSTask;

    /**
    * <p>AIGC image generation task info. This field has a value only when TaskType is AigcImageTask.</p>
    */
    @SerializedName("AigcImageTask")
    @Expose
    private AigcImageTask AigcImageTask;

    /**
    * <p>AIGC video task information. This field has a value only when TaskType is AigcVideoTask.</p>
    */
    @SerializedName("AigcVideoTask")
    @Expose
    private AigcVideoTask AigcVideoTask;

    /**
    * <p>Media import knowledge base task info. This field has a value only when TaskType is ImportMediaKnowledge.</p>
    */
    @SerializedName("ImportMediaKnowledge")
    @Expose
    private ImportMediaKnowledgeTask ImportMediaKnowledge;

    /**
    * <p>Scenario-based AIGC image generation task info. This field has a value only when TaskType is SceneAigcImageTask.</p>
    */
    @SerializedName("SceneAigcImageTask")
    @Expose
    private SceneAigcImageTask SceneAigcImageTask;

    /**
    * <p>Scenario-based AIGC video task info. This field has a value only when TaskType is SceneAigcVideoTask.</p>
    */
    @SerializedName("SceneAigcVideoTask")
    @Expose
    private SceneAigcVideoTask SceneAigcVideoTask;

    /**
    * <p>Asynchronous image processing task information. This field has a value only when TaskType is ProcessImageAsync.</p>
    */
    @SerializedName("ProcessImageAsyncTask")
    @Expose
    private ProcessImageAsync ProcessImageAsyncTask;

    /**
    * <p>Extract digital watermark task info. This field has a value only when TaskType is ExtractBlindWatermark.</p>
    */
    @SerializedName("ExtractBlindWatermarkTask")
    @Expose
    private ExtractBlindWatermarkTask ExtractBlindWatermarkTask;

    /**
    * <p>Create custom entity information. This field has a value only when TaskType is CreateAigcAdvancedCustomElement.</p>
    */
    @SerializedName("CreateAigcAdvancedCustomElementTask")
    @Expose
    private CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementTask;

    /**
    * <p>Create custom tone information. This field has a value only when TaskType is CreateAigcCustomVoice.</p>
    */
    @SerializedName("CreateAigcCustomVoiceTask")
    @Expose
    private CreateAigcCustomVoiceTask CreateAigcCustomVoiceTask;

    /**
    * <p>Create entity information. This field has a value only when TaskType is CreateAigcSubject.</p>
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
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Task type. Valid values: <li>Procedure: Video processing task;</li><li>EditMedia: Video editing task;</li><li>SplitMedia: Video splitting task;</li><li>ComposeMedia: Media file creation task;</li><li>WechatPublish: WeChat publishing task;</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task;</li><li>PullUpload: Pull and upload media files task;</li><li>FastClipMedia: Quick trimming task;</li><li>RemoveWatermarkTask: Intelligent watermark removal task;</li><li>DescribeFileAttributesTask: File attribute retrieval task;</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended);</li><li>ReviewAudioVideo: Audio/video moderation task;</li><li>ExtractTraceWatermark: Source watermark extraction task;</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task;</li><li>QualityInspect: Audio and video quality inspection task;</li><li>QualityEnhance: Audio and video quality regeneration task;</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task;</li><li>ProcessMediaByMPS: MPS video processing task;</li><li>AigcImageTask: AIGC image generation task;</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task;</li><li>AigcVideoTask: AIGC video generation task;</li><li>ImportMediaKnowledge: Import media knowledge task.</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task;</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>CreateAigcAdvancedCustomElementTask: Create custom subject task</li><li>CreateAigcCustomVoiceTask: Create custom voice type task</li><li>CreateAigcSubjectTask: Create subject task</li></p> 
     * @return TaskType <p>Task type. Valid values: <li>Procedure: Video processing task;</li><li>EditMedia: Video editing task;</li><li>SplitMedia: Video splitting task;</li><li>ComposeMedia: Media file creation task;</li><li>WechatPublish: WeChat publishing task;</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task;</li><li>PullUpload: Pull and upload media files task;</li><li>FastClipMedia: Quick trimming task;</li><li>RemoveWatermarkTask: Intelligent watermark removal task;</li><li>DescribeFileAttributesTask: File attribute retrieval task;</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended);</li><li>ReviewAudioVideo: Audio/video moderation task;</li><li>ExtractTraceWatermark: Source watermark extraction task;</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task;</li><li>QualityInspect: Audio and video quality inspection task;</li><li>QualityEnhance: Audio and video quality regeneration task;</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task;</li><li>ProcessMediaByMPS: MPS video processing task;</li><li>AigcImageTask: AIGC image generation task;</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task;</li><li>AigcVideoTask: AIGC video generation task;</li><li>ImportMediaKnowledge: Import media knowledge task.</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task;</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>CreateAigcAdvancedCustomElementTask: Create custom subject task</li><li>CreateAigcCustomVoiceTask: Create custom voice type task</li><li>CreateAigcSubjectTask: Create subject task</li></p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task type. Valid values: <li>Procedure: Video processing task;</li><li>EditMedia: Video editing task;</li><li>SplitMedia: Video splitting task;</li><li>ComposeMedia: Media file creation task;</li><li>WechatPublish: WeChat publishing task;</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task;</li><li>PullUpload: Pull and upload media files task;</li><li>FastClipMedia: Quick trimming task;</li><li>RemoveWatermarkTask: Intelligent watermark removal task;</li><li>DescribeFileAttributesTask: File attribute retrieval task;</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended);</li><li>ReviewAudioVideo: Audio/video moderation task;</li><li>ExtractTraceWatermark: Source watermark extraction task;</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task;</li><li>QualityInspect: Audio and video quality inspection task;</li><li>QualityEnhance: Audio and video quality regeneration task;</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task;</li><li>ProcessMediaByMPS: MPS video processing task;</li><li>AigcImageTask: AIGC image generation task;</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task;</li><li>AigcVideoTask: AIGC video generation task;</li><li>ImportMediaKnowledge: Import media knowledge task.</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task;</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>CreateAigcAdvancedCustomElementTask: Create custom subject task</li><li>CreateAigcCustomVoiceTask: Create custom voice type task</li><li>CreateAigcSubjectTask: Create subject task</li></p>
     * @param TaskType <p>Task type. Valid values: <li>Procedure: Video processing task;</li><li>EditMedia: Video editing task;</li><li>SplitMedia: Video splitting task;</li><li>ComposeMedia: Media file creation task;</li><li>WechatPublish: WeChat publishing task;</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task;</li><li>PullUpload: Pull and upload media files task;</li><li>FastClipMedia: Quick trimming task;</li><li>RemoveWatermarkTask: Intelligent watermark removal task;</li><li>DescribeFileAttributesTask: File attribute retrieval task;</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended);</li><li>ReviewAudioVideo: Audio/video moderation task;</li><li>ExtractTraceWatermark: Source watermark extraction task;</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task;</li><li>QualityInspect: Audio and video quality inspection task;</li><li>QualityEnhance: Audio and video quality regeneration task;</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task;</li><li>ProcessMediaByMPS: MPS video processing task;</li><li>AigcImageTask: AIGC image generation task;</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task;</li><li>AigcVideoTask: AIGC video generation task;</li><li>ImportMediaKnowledge: Import media knowledge task.</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task;</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>ExtractBlindWatermark: Digital watermark extraction task.</li><li>CreateAigcAdvancedCustomElementTask: Create custom subject task</li><li>CreateAigcCustomVoiceTask: Create custom voice type task</li><li>CreateAigcSubjectTask: Create subject task</li></p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Task status. Value:</p><li>WAITING: Waiting;</li><li>PROCESSING: Processing;</li><li>FINISH: Completed;</li><li>ABORTED: Terminated.</li> 
     * @return Status <p>Task status. Value:</p><li>WAITING: Waiting;</li><li>PROCESSING: Processing;</li><li>FINISH: Completed;</li><li>ABORTED: Terminated.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status. Value:</p><li>WAITING: Waiting;</li><li>PROCESSING: Processing;</li><li>FINISH: Completed;</li><li>ABORTED: Terminated.</li>
     * @param Status <p>Task status. Value:</p><li>WAITING: Waiting;</li><li>PROCESSING: Processing;</li><li>FINISH: Completed;</li><li>ABORTED: Terminated.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Task creation time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return CreateTime <p>Task creation time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Task creation time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param CreateTime <p>Task creation time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Task execution start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p> 
     * @return BeginProcessTime <p>Task execution start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set <p>Task execution start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     * @param BeginProcessTime <p>Task execution start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get <p>Task execution completion time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p> 
     * @return FinishTime <p>Task execution completion time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Task execution completion time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     * @param FinishTime <p>Task execution completion time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcedureTask <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProcedureTask getProcedureTask() {
        return this.ProcedureTask;
    }

    /**
     * Set <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcedureTask <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcedureTask(ProcedureTask ProcedureTask) {
        this.ProcedureTask = ProcedureTask;
    }

    /**
     * Get <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EditMediaTask <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EditMediaTask getEditMediaTask() {
        return this.EditMediaTask;
    }

    /**
     * Set <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EditMediaTask <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEditMediaTask(EditMediaTask EditMediaTask) {
        this.EditMediaTask = EditMediaTask;
    }

    /**
     * Get <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WechatPublishTask <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WechatPublishTask getWechatPublishTask() {
        return this.WechatPublishTask;
    }

    /**
     * Set <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WechatPublishTask <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatPublishTask(WechatPublishTask WechatPublishTask) {
        this.WechatPublishTask = WechatPublishTask;
    }

    /**
     * Get <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComposeMediaTask <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComposeMediaTask getComposeMediaTask() {
        return this.ComposeMediaTask;
    }

    /**
     * Set <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComposeMediaTask <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComposeMediaTask(ComposeMediaTask ComposeMediaTask) {
        this.ComposeMediaTask = ComposeMediaTask;
    }

    /**
     * Get <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SplitMediaTask <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SplitMediaTask getSplitMediaTask() {
        return this.SplitMediaTask;
    }

    /**
     * Set <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SplitMediaTask <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSplitMediaTask(SplitMediaTask SplitMediaTask) {
        this.SplitMediaTask = SplitMediaTask;
    }

    /**
     * Get <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WechatMiniProgramPublishTask <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishTask() {
        return this.WechatMiniProgramPublishTask;
    }

    /**
     * Set <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WechatMiniProgramPublishTask <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatMiniProgramPublishTask(WechatMiniProgramPublishTask WechatMiniProgramPublishTask) {
        this.WechatMiniProgramPublishTask = WechatMiniProgramPublishTask;
    }

    /**
     * Get <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PullUploadTask <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PullUploadTask getPullUploadTask() {
        return this.PullUploadTask;
    }

    /**
     * Set <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PullUploadTask <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPullUploadTask(PullUploadTask PullUploadTask) {
        this.PullUploadTask = PullUploadTask;
    }

    /**
     * Get <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeTask <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TranscodeTask2017 getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranscodeTask <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeTask(TranscodeTask2017 TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConcatTask <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConcatTask2017 getConcatTask() {
        return this.ConcatTask;
    }

    /**
     * Set <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConcatTask <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConcatTask(ConcatTask2017 ConcatTask) {
        this.ConcatTask = ConcatTask;
    }

    /**
     * Get <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClipTask <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClipTask2017 getClipTask() {
        return this.ClipTask;
    }

    /**
     * Set <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClipTask <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClipTask(ClipTask2017 ClipTask) {
        this.ClipTask = ClipTask;
    }

    /**
     * Get <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateImageSpriteTask <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteTask() {
        return this.CreateImageSpriteTask;
    }

    /**
     * Set <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateImageSpriteTask <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateImageSpriteTask(CreateImageSpriteTask2017 CreateImageSpriteTask) {
        this.CreateImageSpriteTask = CreateImageSpriteTask;
    }

    /**
     * Get <p>Video screenshot at specified time task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotByTimeOffsetTask <p>Video screenshot at specified time task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set <p>Video screenshot at specified time task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SnapshotByTimeOffsetTask <p>Video screenshot at specified time task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemoveWatermarkTask <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RemoveWatermarkTask getRemoveWatermarkTask() {
        return this.RemoveWatermarkTask;
    }

    /**
     * Set <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemoveWatermarkTask <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemoveWatermarkTask(RemoveWatermarkTask RemoveWatermarkTask) {
        this.RemoveWatermarkTask = RemoveWatermarkTask;
    }

    /**
     * Get <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RebuildMediaTask <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RebuildMediaTask getRebuildMediaTask() {
        return this.RebuildMediaTask;
    }

    /**
     * Set <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RebuildMediaTask <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRebuildMediaTask(RebuildMediaTask RebuildMediaTask) {
        this.RebuildMediaTask = RebuildMediaTask;
    }

    /**
     * Get <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtractTraceWatermarkTask <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkTask() {
        return this.ExtractTraceWatermarkTask;
    }

    /**
     * Set <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtractTraceWatermarkTask <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtractTraceWatermarkTask(ExtractTraceWatermarkTask ExtractTraceWatermarkTask) {
        this.ExtractTraceWatermarkTask = ExtractTraceWatermarkTask;
    }

    /**
     * Get <p>Information about the copyright watermark extraction task. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtractCopyRightWatermarkTask <p>Information about the copyright watermark extraction task. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkTask() {
        return this.ExtractCopyRightWatermarkTask;
    }

    /**
     * Set <p>Information about the copyright watermark extraction task. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtractCopyRightWatermarkTask <p>Information about the copyright watermark extraction task. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtractCopyRightWatermarkTask(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask) {
        this.ExtractCopyRightWatermarkTask = ExtractCopyRightWatermarkTask;
    }

    /**
     * Get <p>Audio/video moderation task info. This field has a value only when TaskType is ReviewAudioVideo.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReviewAudioVideoTask <p>Audio/video moderation task info. This field has a value only when TaskType is ReviewAudioVideo.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReviewAudioVideoTask getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set <p>Audio/video moderation task info. This field has a value only when TaskType is ReviewAudioVideo.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReviewAudioVideoTask <p>Audio/video moderation task info. This field has a value only when TaskType is ReviewAudioVideo.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReviewAudioVideoTask(ReviewAudioVideoTask ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get <p>This field is invalid.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReduceMediaBitrateTask <p>This field is invalid.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateTask() {
        return this.ReduceMediaBitrateTask;
    }

    /**
     * Set <p>This field is invalid.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReduceMediaBitrateTask <p>This field is invalid.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReduceMediaBitrateTask(ReduceMediaBitrateTask ReduceMediaBitrateTask) {
        this.ReduceMediaBitrateTask = ReduceMediaBitrateTask;
    }

    /**
     * Get <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DescribeFileAttributesTask <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribeFileAttributesTask getDescribeFileAttributesTask() {
        return this.DescribeFileAttributesTask;
    }

    /**
     * Set <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DescribeFileAttributesTask <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescribeFileAttributesTask(DescribeFileAttributesTask DescribeFileAttributesTask) {
        this.DescribeFileAttributesTask = DescribeFileAttributesTask;
    }

    /**
     * Get <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityInspectTask <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityInspectTask getQualityInspectTask() {
        return this.QualityInspectTask;
    }

    /**
     * Set <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityInspectTask <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityInspectTask(QualityInspectTask QualityInspectTask) {
        this.QualityInspectTask = QualityInspectTask;
    }

    /**
     * Get <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityEnhanceTask <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityEnhanceTask getQualityEnhanceTask() {
        return this.QualityEnhanceTask;
    }

    /**
     * Set <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityEnhanceTask <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityEnhanceTask(QualityEnhanceTask QualityEnhanceTask) {
        this.QualityEnhanceTask = QualityEnhanceTask;
    }

    /**
     * Get <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComplexAdaptiveDynamicStreamingTask <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingTask() {
        return this.ComplexAdaptiveDynamicStreamingTask;
    }

    /**
     * Set <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComplexAdaptiveDynamicStreamingTask <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComplexAdaptiveDynamicStreamingTask(ComplexAdaptiveDynamicStreamingTask ComplexAdaptiveDynamicStreamingTask) {
        this.ComplexAdaptiveDynamicStreamingTask = ComplexAdaptiveDynamicStreamingTask;
    }

    /**
     * Get <p>MPS video processing task information. This field has a value only when TaskType is ProcessMediaByMPS.</p> 
     * @return ProcessMediaByMPSTask <p>MPS video processing task information. This field has a value only when TaskType is ProcessMediaByMPS.</p>
     */
    public ProcessMediaByMPS getProcessMediaByMPSTask() {
        return this.ProcessMediaByMPSTask;
    }

    /**
     * Set <p>MPS video processing task information. This field has a value only when TaskType is ProcessMediaByMPS.</p>
     * @param ProcessMediaByMPSTask <p>MPS video processing task information. This field has a value only when TaskType is ProcessMediaByMPS.</p>
     */
    public void setProcessMediaByMPSTask(ProcessMediaByMPS ProcessMediaByMPSTask) {
        this.ProcessMediaByMPSTask = ProcessMediaByMPSTask;
    }

    /**
     * Get <p>AIGC image generation task info. This field has a value only when TaskType is AigcImageTask.</p> 
     * @return AigcImageTask <p>AIGC image generation task info. This field has a value only when TaskType is AigcImageTask.</p>
     */
    public AigcImageTask getAigcImageTask() {
        return this.AigcImageTask;
    }

    /**
     * Set <p>AIGC image generation task info. This field has a value only when TaskType is AigcImageTask.</p>
     * @param AigcImageTask <p>AIGC image generation task info. This field has a value only when TaskType is AigcImageTask.</p>
     */
    public void setAigcImageTask(AigcImageTask AigcImageTask) {
        this.AigcImageTask = AigcImageTask;
    }

    /**
     * Get <p>AIGC video task information. This field has a value only when TaskType is AigcVideoTask.</p> 
     * @return AigcVideoTask <p>AIGC video task information. This field has a value only when TaskType is AigcVideoTask.</p>
     */
    public AigcVideoTask getAigcVideoTask() {
        return this.AigcVideoTask;
    }

    /**
     * Set <p>AIGC video task information. This field has a value only when TaskType is AigcVideoTask.</p>
     * @param AigcVideoTask <p>AIGC video task information. This field has a value only when TaskType is AigcVideoTask.</p>
     */
    public void setAigcVideoTask(AigcVideoTask AigcVideoTask) {
        this.AigcVideoTask = AigcVideoTask;
    }

    /**
     * Get <p>Media import knowledge base task info. This field has a value only when TaskType is ImportMediaKnowledge.</p> 
     * @return ImportMediaKnowledge <p>Media import knowledge base task info. This field has a value only when TaskType is ImportMediaKnowledge.</p>
     */
    public ImportMediaKnowledgeTask getImportMediaKnowledge() {
        return this.ImportMediaKnowledge;
    }

    /**
     * Set <p>Media import knowledge base task info. This field has a value only when TaskType is ImportMediaKnowledge.</p>
     * @param ImportMediaKnowledge <p>Media import knowledge base task info. This field has a value only when TaskType is ImportMediaKnowledge.</p>
     */
    public void setImportMediaKnowledge(ImportMediaKnowledgeTask ImportMediaKnowledge) {
        this.ImportMediaKnowledge = ImportMediaKnowledge;
    }

    /**
     * Get <p>Scenario-based AIGC image generation task info. This field has a value only when TaskType is SceneAigcImageTask.</p> 
     * @return SceneAigcImageTask <p>Scenario-based AIGC image generation task info. This field has a value only when TaskType is SceneAigcImageTask.</p>
     */
    public SceneAigcImageTask getSceneAigcImageTask() {
        return this.SceneAigcImageTask;
    }

    /**
     * Set <p>Scenario-based AIGC image generation task info. This field has a value only when TaskType is SceneAigcImageTask.</p>
     * @param SceneAigcImageTask <p>Scenario-based AIGC image generation task info. This field has a value only when TaskType is SceneAigcImageTask.</p>
     */
    public void setSceneAigcImageTask(SceneAigcImageTask SceneAigcImageTask) {
        this.SceneAigcImageTask = SceneAigcImageTask;
    }

    /**
     * Get <p>Scenario-based AIGC video task info. This field has a value only when TaskType is SceneAigcVideoTask.</p> 
     * @return SceneAigcVideoTask <p>Scenario-based AIGC video task info. This field has a value only when TaskType is SceneAigcVideoTask.</p>
     */
    public SceneAigcVideoTask getSceneAigcVideoTask() {
        return this.SceneAigcVideoTask;
    }

    /**
     * Set <p>Scenario-based AIGC video task info. This field has a value only when TaskType is SceneAigcVideoTask.</p>
     * @param SceneAigcVideoTask <p>Scenario-based AIGC video task info. This field has a value only when TaskType is SceneAigcVideoTask.</p>
     */
    public void setSceneAigcVideoTask(SceneAigcVideoTask SceneAigcVideoTask) {
        this.SceneAigcVideoTask = SceneAigcVideoTask;
    }

    /**
     * Get <p>Asynchronous image processing task information. This field has a value only when TaskType is ProcessImageAsync.</p> 
     * @return ProcessImageAsyncTask <p>Asynchronous image processing task information. This field has a value only when TaskType is ProcessImageAsync.</p>
     */
    public ProcessImageAsync getProcessImageAsyncTask() {
        return this.ProcessImageAsyncTask;
    }

    /**
     * Set <p>Asynchronous image processing task information. This field has a value only when TaskType is ProcessImageAsync.</p>
     * @param ProcessImageAsyncTask <p>Asynchronous image processing task information. This field has a value only when TaskType is ProcessImageAsync.</p>
     */
    public void setProcessImageAsyncTask(ProcessImageAsync ProcessImageAsyncTask) {
        this.ProcessImageAsyncTask = ProcessImageAsyncTask;
    }

    /**
     * Get <p>Extract digital watermark task info. This field has a value only when TaskType is ExtractBlindWatermark.</p> 
     * @return ExtractBlindWatermarkTask <p>Extract digital watermark task info. This field has a value only when TaskType is ExtractBlindWatermark.</p>
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkTask() {
        return this.ExtractBlindWatermarkTask;
    }

    /**
     * Set <p>Extract digital watermark task info. This field has a value only when TaskType is ExtractBlindWatermark.</p>
     * @param ExtractBlindWatermarkTask <p>Extract digital watermark task info. This field has a value only when TaskType is ExtractBlindWatermark.</p>
     */
    public void setExtractBlindWatermarkTask(ExtractBlindWatermarkTask ExtractBlindWatermarkTask) {
        this.ExtractBlindWatermarkTask = ExtractBlindWatermarkTask;
    }

    /**
     * Get <p>Create custom entity information. This field has a value only when TaskType is CreateAigcAdvancedCustomElement.</p> 
     * @return CreateAigcAdvancedCustomElementTask <p>Create custom entity information. This field has a value only when TaskType is CreateAigcAdvancedCustomElement.</p>
     */
    public CreateAigcAdvancedCustomElementTask getCreateAigcAdvancedCustomElementTask() {
        return this.CreateAigcAdvancedCustomElementTask;
    }

    /**
     * Set <p>Create custom entity information. This field has a value only when TaskType is CreateAigcAdvancedCustomElement.</p>
     * @param CreateAigcAdvancedCustomElementTask <p>Create custom entity information. This field has a value only when TaskType is CreateAigcAdvancedCustomElement.</p>
     */
    public void setCreateAigcAdvancedCustomElementTask(CreateAigcAdvancedCustomElementTask CreateAigcAdvancedCustomElementTask) {
        this.CreateAigcAdvancedCustomElementTask = CreateAigcAdvancedCustomElementTask;
    }

    /**
     * Get <p>Create custom tone information. This field has a value only when TaskType is CreateAigcCustomVoice.</p> 
     * @return CreateAigcCustomVoiceTask <p>Create custom tone information. This field has a value only when TaskType is CreateAigcCustomVoice.</p>
     */
    public CreateAigcCustomVoiceTask getCreateAigcCustomVoiceTask() {
        return this.CreateAigcCustomVoiceTask;
    }

    /**
     * Set <p>Create custom tone information. This field has a value only when TaskType is CreateAigcCustomVoice.</p>
     * @param CreateAigcCustomVoiceTask <p>Create custom tone information. This field has a value only when TaskType is CreateAigcCustomVoice.</p>
     */
    public void setCreateAigcCustomVoiceTask(CreateAigcCustomVoiceTask CreateAigcCustomVoiceTask) {
        this.CreateAigcCustomVoiceTask = CreateAigcCustomVoiceTask;
    }

    /**
     * Get <p>Create entity information. This field has a value only when TaskType is CreateAigcSubject.</p> 
     * @return CreateAigcSubjectTask <p>Create entity information. This field has a value only when TaskType is CreateAigcSubject.</p>
     */
    public CreateAigcSubjectTask getCreateAigcSubjectTask() {
        return this.CreateAigcSubjectTask;
    }

    /**
     * Set <p>Create entity information. This field has a value only when TaskType is CreateAigcSubject.</p>
     * @param CreateAigcSubjectTask <p>Create entity information. This field has a value only when TaskType is CreateAigcSubject.</p>
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

