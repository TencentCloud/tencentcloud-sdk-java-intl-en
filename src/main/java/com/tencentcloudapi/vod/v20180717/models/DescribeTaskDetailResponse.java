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
    * <p>Task type. Valid values: <li>Procedure: Video processing task</li><li>EditMedia: Video editing task</li><li>SplitMedia: Video splitting task</li><li>ComposeMedia: Media file creation task</li><li>WechatPublish: WeChat publishing task</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task</li><li>PullUpload: Pull and upload media files task</li><li>FastClipMedia: Quick trimming task</li><li>RemoveWatermarkTask: Intelligent watermark removal task</li><li>DescribeFileAttributesTask: File attribute retrieval task</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended)</li><li>ReviewAudioVideo: Audio/video moderation task</li><li>ExtractTraceWatermark: Source watermark extraction task</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task</li><li>QualityInspect: Audio and video quality inspection task</li><li>QualityEnhance: Audio and video quality regeneration task</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task</li><li>ProcessMediaByMPS: MPS video processing task</li><li>AigcImageTask: AIGC image generation task</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task</li><li>AigcVideoTask: AIGC video generation task</li><li>AigcAudioTask: AIGC audio generation task</li><li>ImportMediaKnowledge: Import media knowledge task</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>CreateAigcAdvancedCustomElement: Create custom subject task</li><li>CreateAigcCustomVoice: Create custom voice type task</li><li>CreateAigcSubject: Create subject task</li><li>AigcVideoRedrawTask: AIGC video conversion task</li><li>CreateAigcAudioClone: AIGC voice clone task</li><li>DescribeAigcFaceInfoAsync: Asynchronously fetch AIGC face information task</li><li>WandAsrTask: WAND speech recognition</li><li>AigcHunyuan3DTask: AIGC Hunyuan 3D task</li><li>DesignVoiceAsync: Voice type design</li><li>CloneVoiceAsync: Voice type clone</li><li>TextToSpeechAsync: Speech generation</li><li>VideoDubbingAsync: Video translation dubbing</li></p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>Task status. Valid values: </p><li>WAITING: Waiting; </li><li>PROCESSING: Processing; </li><li>FINISH: Completed; </li><li>ABORTED: Terminated.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Task creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Task start execution time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p>
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
    */
    @SerializedName("ProcedureTask")
    @Expose
    private ProcedureTask ProcedureTask;

    /**
    * <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
    */
    @SerializedName("EditMediaTask")
    @Expose
    private EditMediaTask EditMediaTask;

    /**
    * <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
    */
    @SerializedName("WechatPublishTask")
    @Expose
    private WechatPublishTask WechatPublishTask;

    /**
    * <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
    */
    @SerializedName("ComposeMediaTask")
    @Expose
    private ComposeMediaTask ComposeMediaTask;

    /**
    * <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
    */
    @SerializedName("SplitMediaTask")
    @Expose
    private SplitMediaTask SplitMediaTask;

    /**
    * <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
    */
    @SerializedName("WechatMiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishTask;

    /**
    * <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
    */
    @SerializedName("PullUploadTask")
    @Expose
    private PullUploadTask PullUploadTask;

    /**
    * <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTask2017 TranscodeTask;

    /**
    * <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
    */
    @SerializedName("ConcatTask")
    @Expose
    private ConcatTask2017 ConcatTask;

    /**
    * <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
    */
    @SerializedName("ClipTask")
    @Expose
    private ClipTask2017 ClipTask;

    /**
    * <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
    */
    @SerializedName("CreateImageSpriteTask")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteTask;

    /**
    * <p>Video screenshot at specified time point task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask;

    /**
    * <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
    */
    @SerializedName("RemoveWatermarkTask")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkTask;

    /**
    * <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
    */
    @SerializedName("RebuildMediaTask")
    @Expose
    private RebuildMediaTask RebuildMediaTask;

    /**
    * <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
    */
    @SerializedName("ExtractTraceWatermarkTask")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkTask;

    /**
    * <p>Extract copyright watermark task information. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
    */
    @SerializedName("ExtractCopyRightWatermarkTask")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask;

    /**
    * <p>Audio/Video moderation task information. This field has a value only when TaskType is ReviewAudioVideo.</p>
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoTask;

    /**
    * <p>This field is invalid.</p>
    */
    @SerializedName("ReduceMediaBitrateTask")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateTask;

    /**
    * <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
    */
    @SerializedName("DescribeFileAttributesTask")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesTask;

    /**
    * <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
    */
    @SerializedName("QualityInspectTask")
    @Expose
    private QualityInspectTask QualityInspectTask;

    /**
    * <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
    */
    @SerializedName("QualityEnhanceTask")
    @Expose
    private QualityEnhanceTask QualityEnhanceTask;

    /**
    * <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
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
    * <p>AIGC image task info. This field has a value only when TaskType is AigcImageTask.</p>
    */
    @SerializedName("AigcImageTask")
    @Expose
    private AigcImageTask AigcImageTask;

    /**
    * <p>AIGC video generation task information. This field has a value only when TaskType is AigcVideoTask.</p>
    */
    @SerializedName("AigcVideoTask")
    @Expose
    private AigcVideoTask AigcVideoTask;

    /**
    * <p>Media import knowledge base task information. This field has a value only when TaskType is ImportMediaKnowledge.</p>
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
    * <p>Image asynchronous task processing info. This field has a value only when TaskType is ProcessImageAsync.</p>
    */
    @SerializedName("ProcessImageAsyncTask")
    @Expose
    private ProcessImageAsync ProcessImageAsyncTask;

    /**
    * <p>Information about the digital watermark extraction task. This field has a value only when TaskType is ExtractBlindWatermark.</p>
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
    * <p>AIGC video redraw info. This field has a value only when TaskType is AigcVideoRedrawTask.</p>
    */
    @SerializedName("AigcVideoRedrawTask")
    @Expose
    private AigcVideoRedrawTask AigcVideoRedrawTask;

    /**
    * <p>AIGC sound effect information. This field has a value only when TaskType is AigcAudioTask.</p>
    */
    @SerializedName("AigcAudioTask")
    @Expose
    private AigcAudioTask AigcAudioTask;

    /**
    * <p>AIGC voice clone info. This field has a value only when TaskType is CreateAigcAudioClone.</p>
    */
    @SerializedName("CreateAigcAudioCloneTask")
    @Expose
    private CreateAigcAudioCloneTask CreateAigcAudioCloneTask;

    /**
    * <p>Asynchronously fetch AIGC face information. This field has a value only when TaskType is DescribeAigcFaceInfoAsync.</p>
    */
    @SerializedName("DescribeAigcFaceInfoAsyncTask")
    @Expose
    private DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncTask;

    /**
    * <p>Hunyuan 3D task. This field has a value only when TaskType is AigcHunyuan3DTask.</p>
    */
    @SerializedName("AigcHunyuan3DTask")
    @Expose
    private AigcHunyuan3DTask AigcHunyuan3DTask;

    /**
    * <p>Voice type design. This field has a value only when TaskType is DesignVoiceAsync.</p>
    */
    @SerializedName("DesignVoiceAsyncTask")
    @Expose
    private DesignVoiceAsyncTask DesignVoiceAsyncTask;

    /**
    * <p>Voice type clone. This field has a value only when TaskType is CloneVoiceAsync.</p>
    */
    @SerializedName("CloneVoiceAsyncTask")
    @Expose
    private CloneVoiceAsyncTask CloneVoiceAsyncTask;

    /**
    * <p>Text to speech. This field has a value only when TaskType is TextToSpeechAsync.</p>
    */
    @SerializedName("TextToSpeechAsyncTask")
    @Expose
    private TextToSpeechAsyncTask TextToSpeechAsyncTask;

    /**
    * <p>Video translation and dubbing. This field has a value only when TaskType is VideoDubbingAsync.</p>
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
     * Get <p>Task type. Valid values: <li>Procedure: Video processing task</li><li>EditMedia: Video editing task</li><li>SplitMedia: Video splitting task</li><li>ComposeMedia: Media file creation task</li><li>WechatPublish: WeChat publishing task</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task</li><li>PullUpload: Pull and upload media files task</li><li>FastClipMedia: Quick trimming task</li><li>RemoveWatermarkTask: Intelligent watermark removal task</li><li>DescribeFileAttributesTask: File attribute retrieval task</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended)</li><li>ReviewAudioVideo: Audio/video moderation task</li><li>ExtractTraceWatermark: Source watermark extraction task</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task</li><li>QualityInspect: Audio and video quality inspection task</li><li>QualityEnhance: Audio and video quality regeneration task</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task</li><li>ProcessMediaByMPS: MPS video processing task</li><li>AigcImageTask: AIGC image generation task</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task</li><li>AigcVideoTask: AIGC video generation task</li><li>AigcAudioTask: AIGC audio generation task</li><li>ImportMediaKnowledge: Import media knowledge task</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>CreateAigcAdvancedCustomElement: Create custom subject task</li><li>CreateAigcCustomVoice: Create custom voice type task</li><li>CreateAigcSubject: Create subject task</li><li>AigcVideoRedrawTask: AIGC video conversion task</li><li>CreateAigcAudioClone: AIGC voice clone task</li><li>DescribeAigcFaceInfoAsync: Asynchronously fetch AIGC face information task</li><li>WandAsrTask: WAND speech recognition</li><li>AigcHunyuan3DTask: AIGC Hunyuan 3D task</li><li>DesignVoiceAsync: Voice type design</li><li>CloneVoiceAsync: Voice type clone</li><li>TextToSpeechAsync: Speech generation</li><li>VideoDubbingAsync: Video translation dubbing</li></p> 
     * @return TaskType <p>Task type. Valid values: <li>Procedure: Video processing task</li><li>EditMedia: Video editing task</li><li>SplitMedia: Video splitting task</li><li>ComposeMedia: Media file creation task</li><li>WechatPublish: WeChat publishing task</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task</li><li>PullUpload: Pull and upload media files task</li><li>FastClipMedia: Quick trimming task</li><li>RemoveWatermarkTask: Intelligent watermark removal task</li><li>DescribeFileAttributesTask: File attribute retrieval task</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended)</li><li>ReviewAudioVideo: Audio/video moderation task</li><li>ExtractTraceWatermark: Source watermark extraction task</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task</li><li>QualityInspect: Audio and video quality inspection task</li><li>QualityEnhance: Audio and video quality regeneration task</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task</li><li>ProcessMediaByMPS: MPS video processing task</li><li>AigcImageTask: AIGC image generation task</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task</li><li>AigcVideoTask: AIGC video generation task</li><li>AigcAudioTask: AIGC audio generation task</li><li>ImportMediaKnowledge: Import media knowledge task</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>CreateAigcAdvancedCustomElement: Create custom subject task</li><li>CreateAigcCustomVoice: Create custom voice type task</li><li>CreateAigcSubject: Create subject task</li><li>AigcVideoRedrawTask: AIGC video conversion task</li><li>CreateAigcAudioClone: AIGC voice clone task</li><li>DescribeAigcFaceInfoAsync: Asynchronously fetch AIGC face information task</li><li>WandAsrTask: WAND speech recognition</li><li>AigcHunyuan3DTask: AIGC Hunyuan 3D task</li><li>DesignVoiceAsync: Voice type design</li><li>CloneVoiceAsync: Voice type clone</li><li>TextToSpeechAsync: Speech generation</li><li>VideoDubbingAsync: Video translation dubbing</li></p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Task type. Valid values: <li>Procedure: Video processing task</li><li>EditMedia: Video editing task</li><li>SplitMedia: Video splitting task</li><li>ComposeMedia: Media file creation task</li><li>WechatPublish: WeChat publishing task</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task</li><li>PullUpload: Pull and upload media files task</li><li>FastClipMedia: Quick trimming task</li><li>RemoveWatermarkTask: Intelligent watermark removal task</li><li>DescribeFileAttributesTask: File attribute retrieval task</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended)</li><li>ReviewAudioVideo: Audio/video moderation task</li><li>ExtractTraceWatermark: Source watermark extraction task</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task</li><li>QualityInspect: Audio and video quality inspection task</li><li>QualityEnhance: Audio and video quality regeneration task</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task</li><li>ProcessMediaByMPS: MPS video processing task</li><li>AigcImageTask: AIGC image generation task</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task</li><li>AigcVideoTask: AIGC video generation task</li><li>AigcAudioTask: AIGC audio generation task</li><li>ImportMediaKnowledge: Import media knowledge task</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>CreateAigcAdvancedCustomElement: Create custom subject task</li><li>CreateAigcCustomVoice: Create custom voice type task</li><li>CreateAigcSubject: Create subject task</li><li>AigcVideoRedrawTask: AIGC video conversion task</li><li>CreateAigcAudioClone: AIGC voice clone task</li><li>DescribeAigcFaceInfoAsync: Asynchronously fetch AIGC face information task</li><li>WandAsrTask: WAND speech recognition</li><li>AigcHunyuan3DTask: AIGC Hunyuan 3D task</li><li>DesignVoiceAsync: Voice type design</li><li>CloneVoiceAsync: Voice type clone</li><li>TextToSpeechAsync: Speech generation</li><li>VideoDubbingAsync: Video translation dubbing</li></p>
     * @param TaskType <p>Task type. Valid values: <li>Procedure: Video processing task</li><li>EditMedia: Video editing task</li><li>SplitMedia: Video splitting task</li><li>ComposeMedia: Media file creation task</li><li>WechatPublish: WeChat publishing task</li><li>WechatMiniProgramPublish: WeChat Mini Program Video Publishing Task</li><li>PullUpload: Pull and upload media files task</li><li>FastClipMedia: Quick trimming task</li><li>RemoveWatermarkTask: Intelligent watermark removal task</li><li>DescribeFileAttributesTask: File attribute retrieval task</li><li>RebuildMedia: Audio and video quality regeneration task (not recommended)</li><li>ReviewAudioVideo: Audio/video moderation task</li><li>ExtractTraceWatermark: Source watermark extraction task</li><li>ExtractCopyRightWatermark: Copyright Watermark Extraction Task</li><li>QualityInspect: Audio and video quality inspection task</li><li>QualityEnhance: Audio and video quality regeneration task</li><li>ComplexAdaptiveDynamicStreaming: Complex adaptive bitstream task</li><li>ProcessMediaByMPS: MPS video processing task</li><li>AigcImageTask: AIGC image generation task</li><li>SceneAigcImageTask: Scenario-based AIGC image generation task</li><li>AigcVideoTask: AIGC video generation task</li><li>AigcAudioTask: AIGC audio generation task</li><li>ImportMediaKnowledge: Import media knowledge task</li><li>SceneAigcVideoTask: Scenario-based AIGC video generation task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>ExtractBlindWatermark: Digital watermark extraction task</li><li>CreateAigcAdvancedCustomElement: Create custom subject task</li><li>CreateAigcCustomVoice: Create custom voice type task</li><li>CreateAigcSubject: Create subject task</li><li>AigcVideoRedrawTask: AIGC video conversion task</li><li>CreateAigcAudioClone: AIGC voice clone task</li><li>DescribeAigcFaceInfoAsync: Asynchronously fetch AIGC face information task</li><li>WandAsrTask: WAND speech recognition</li><li>AigcHunyuan3DTask: AIGC Hunyuan 3D task</li><li>DesignVoiceAsync: Voice type design</li><li>CloneVoiceAsync: Voice type clone</li><li>TextToSpeechAsync: Speech generation</li><li>VideoDubbingAsync: Video translation dubbing</li></p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Task status. Valid values: </p><li>WAITING: Waiting; </li><li>PROCESSING: Processing; </li><li>FINISH: Completed; </li><li>ABORTED: Terminated.</li> 
     * @return Status <p>Task status. Valid values: </p><li>WAITING: Waiting; </li><li>PROCESSING: Processing; </li><li>FINISH: Completed; </li><li>ABORTED: Terminated.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status. Valid values: </p><li>WAITING: Waiting; </li><li>PROCESSING: Processing; </li><li>FINISH: Completed; </li><li>ABORTED: Terminated.</li>
     * @param Status <p>Task status. Valid values: </p><li>WAITING: Waiting; </li><li>PROCESSING: Processing; </li><li>FINISH: Completed; </li><li>ABORTED: Terminated.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Task creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return CreateTime <p>Task creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Task creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param CreateTime <p>Task creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Task start execution time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p> 
     * @return BeginProcessTime <p>Task start execution time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p>
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set <p>Task start execution time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p>
     * @param BeginProcessTime <p>Task start execution time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p>
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p> 
     * @return FinishTime <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p>
     * @param FinishTime <p>Task completion time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date and time format</a>.</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Video processing task information. This field has a value only when TaskType is Procedure.</p> 
     * @return ProcedureTask <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
     */
    public ProcedureTask getProcedureTask() {
        return this.ProcedureTask;
    }

    /**
     * Set <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
     * @param ProcedureTask <p>Video processing task information. This field has a value only when TaskType is Procedure.</p>
     */
    public void setProcedureTask(ProcedureTask ProcedureTask) {
        this.ProcedureTask = ProcedureTask;
    }

    /**
     * Get <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p> 
     * @return EditMediaTask <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
     */
    public EditMediaTask getEditMediaTask() {
        return this.EditMediaTask;
    }

    /**
     * Set <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
     * @param EditMediaTask <p>Video editing task information. This field has a value only when TaskType is EditMedia.</p>
     */
    public void setEditMediaTask(EditMediaTask EditMediaTask) {
        this.EditMediaTask = EditMediaTask;
    }

    /**
     * Get <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p> 
     * @return WechatPublishTask <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
     */
    public WechatPublishTask getWechatPublishTask() {
        return this.WechatPublishTask;
    }

    /**
     * Set <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
     * @param WechatPublishTask <p>WeChat publishing task information. This field has a value only when TaskType is WechatPublish.</p>
     */
    public void setWechatPublishTask(WechatPublishTask WechatPublishTask) {
        this.WechatPublishTask = WechatPublishTask;
    }

    /**
     * Get <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p> 
     * @return ComposeMediaTask <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
     */
    public ComposeMediaTask getComposeMediaTask() {
        return this.ComposeMediaTask;
    }

    /**
     * Set <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
     * @param ComposeMediaTask <p>Media file production task information. This field has a value only when TaskType is ComposeMedia.</p>
     */
    public void setComposeMediaTask(ComposeMediaTask ComposeMediaTask) {
        this.ComposeMediaTask = ComposeMediaTask;
    }

    /**
     * Get <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p> 
     * @return SplitMediaTask <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
     */
    public SplitMediaTask getSplitMediaTask() {
        return this.SplitMediaTask;
    }

    /**
     * Set <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
     * @param SplitMediaTask <p>Video splitting task information. This field has a value only when TaskType is SplitMedia.</p>
     */
    public void setSplitMediaTask(SplitMediaTask SplitMediaTask) {
        this.SplitMediaTask = SplitMediaTask;
    }

    /**
     * Get <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p> 
     * @return WechatMiniProgramPublishTask <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishTask() {
        return this.WechatMiniProgramPublishTask;
    }

    /**
     * Set <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
     * @param WechatMiniProgramPublishTask <p>WeChat Mini Program publishing task information. This field has a value only when TaskType is WechatMiniProgramPublish.</p>
     */
    public void setWechatMiniProgramPublishTask(WechatMiniProgramPublishTask WechatMiniProgramPublishTask) {
        this.WechatMiniProgramPublishTask = WechatMiniProgramPublishTask;
    }

    /**
     * Get <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p> 
     * @return PullUploadTask <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
     */
    public PullUploadTask getPullUploadTask() {
        return this.PullUploadTask;
    }

    /**
     * Set <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
     * @param PullUploadTask <p>Pull and upload media files task information. This field has a value only when TaskType is PullUpload.</p>
     */
    public void setPullUploadTask(PullUploadTask PullUploadTask) {
        this.PullUploadTask = PullUploadTask;
    }

    /**
     * Get <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p> 
     * @return TranscodeTask <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
     */
    public TranscodeTask2017 getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
     * @param TranscodeTask <p>Video transcoding task information. This field has a value only when TaskType is Transcode.</p>
     */
    public void setTranscodeTask(TranscodeTask2017 TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get <p>Video splicing task information. This field has a value only when TaskType is Concat.</p> 
     * @return ConcatTask <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
     */
    public ConcatTask2017 getConcatTask() {
        return this.ConcatTask;
    }

    /**
     * Set <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
     * @param ConcatTask <p>Video splicing task information. This field has a value only when TaskType is Concat.</p>
     */
    public void setConcatTask(ConcatTask2017 ConcatTask) {
        this.ConcatTask = ConcatTask;
    }

    /**
     * Get <p>Video editing task information. This field has a value only when TaskType is Clip.</p> 
     * @return ClipTask <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
     */
    public ClipTask2017 getClipTask() {
        return this.ClipTask;
    }

    /**
     * Set <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
     * @param ClipTask <p>Video editing task information. This field has a value only when TaskType is Clip.</p>
     */
    public void setClipTask(ClipTask2017 ClipTask) {
        this.ClipTask = ClipTask;
    }

    /**
     * Get <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p> 
     * @return CreateImageSpriteTask <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteTask() {
        return this.CreateImageSpriteTask;
    }

    /**
     * Set <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
     * @param CreateImageSpriteTask <p>Capturing sprite image task information. This field has a value only when TaskType is ImageSprite.</p>
     */
    public void setCreateImageSpriteTask(CreateImageSpriteTask2017 CreateImageSpriteTask) {
        this.CreateImageSpriteTask = CreateImageSpriteTask;
    }

    /**
     * Get <p>Video screenshot at specified time point task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p> 
     * @return SnapshotByTimeOffsetTask <p>Video screenshot at specified time point task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set <p>Video screenshot at specified time point task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
     * @param SnapshotByTimeOffsetTask <p>Video screenshot at specified time point task information. This field has a value only when TaskType is SnapshotByTimeOffset.</p>
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p> 
     * @return RemoveWatermarkTask <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
     */
    public RemoveWatermarkTask getRemoveWatermarkTask() {
        return this.RemoveWatermarkTask;
    }

    /**
     * Set <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
     * @param RemoveWatermarkTask <p>Intelligent watermark removal task information. This field has a value only when TaskType is RemoveWatermark.</p>
     */
    public void setRemoveWatermarkTask(RemoveWatermarkTask RemoveWatermarkTask) {
        this.RemoveWatermarkTask = RemoveWatermarkTask;
    }

    /**
     * Get <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p> 
     * @return RebuildMediaTask <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
     */
    public RebuildMediaTask getRebuildMediaTask() {
        return this.RebuildMediaTask;
    }

    /**
     * Set <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
     * @param RebuildMediaTask <p>Audio and video quality revival task information. This field has a value only when TaskType is RebuildMedia.</p>
     */
    public void setRebuildMediaTask(RebuildMediaTask RebuildMediaTask) {
        this.RebuildMediaTask = RebuildMediaTask;
    }

    /**
     * Get <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p> 
     * @return ExtractTraceWatermarkTask <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkTask() {
        return this.ExtractTraceWatermarkTask;
    }

    /**
     * Set <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
     * @param ExtractTraceWatermarkTask <p>Information about the traceability watermark extraction task. This field has a value only when TaskType is ExtractTraceWatermark.</p>
     */
    public void setExtractTraceWatermarkTask(ExtractTraceWatermarkTask ExtractTraceWatermarkTask) {
        this.ExtractTraceWatermarkTask = ExtractTraceWatermarkTask;
    }

    /**
     * Get <p>Extract copyright watermark task information. This field has a value only when TaskType is ExtractCopyRightWatermark.</p> 
     * @return ExtractCopyRightWatermarkTask <p>Extract copyright watermark task information. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkTask() {
        return this.ExtractCopyRightWatermarkTask;
    }

    /**
     * Set <p>Extract copyright watermark task information. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
     * @param ExtractCopyRightWatermarkTask <p>Extract copyright watermark task information. This field has a value only when TaskType is ExtractCopyRightWatermark.</p>
     */
    public void setExtractCopyRightWatermarkTask(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask) {
        this.ExtractCopyRightWatermarkTask = ExtractCopyRightWatermarkTask;
    }

    /**
     * Get <p>Audio/Video moderation task information. This field has a value only when TaskType is ReviewAudioVideo.</p> 
     * @return ReviewAudioVideoTask <p>Audio/Video moderation task information. This field has a value only when TaskType is ReviewAudioVideo.</p>
     */
    public ReviewAudioVideoTask getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set <p>Audio/Video moderation task information. This field has a value only when TaskType is ReviewAudioVideo.</p>
     * @param ReviewAudioVideoTask <p>Audio/Video moderation task information. This field has a value only when TaskType is ReviewAudioVideo.</p>
     */
    public void setReviewAudioVideoTask(ReviewAudioVideoTask ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get <p>This field is invalid.</p> 
     * @return ReduceMediaBitrateTask <p>This field is invalid.</p>
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateTask() {
        return this.ReduceMediaBitrateTask;
    }

    /**
     * Set <p>This field is invalid.</p>
     * @param ReduceMediaBitrateTask <p>This field is invalid.</p>
     */
    public void setReduceMediaBitrateTask(ReduceMediaBitrateTask ReduceMediaBitrateTask) {
        this.ReduceMediaBitrateTask = ReduceMediaBitrateTask;
    }

    /**
     * Get <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p> 
     * @return DescribeFileAttributesTask <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
     */
    public DescribeFileAttributesTask getDescribeFileAttributesTask() {
        return this.DescribeFileAttributesTask;
    }

    /**
     * Set <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
     * @param DescribeFileAttributesTask <p>File attribute acquisition task information. This field has a value only when TaskType is DescribeFileAttributes.</p>
     */
    public void setDescribeFileAttributesTask(DescribeFileAttributesTask DescribeFileAttributesTask) {
        this.DescribeFileAttributesTask = DescribeFileAttributesTask;
    }

    /**
     * Get <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p> 
     * @return QualityInspectTask <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
     */
    public QualityInspectTask getQualityInspectTask() {
        return this.QualityInspectTask;
    }

    /**
     * Set <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
     * @param QualityInspectTask <p>Audio and video quality detection task information. This field has a value only when TaskType is QualityInspect.</p>
     */
    public void setQualityInspectTask(QualityInspectTask QualityInspectTask) {
        this.QualityInspectTask = QualityInspectTask;
    }

    /**
     * Get <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p> 
     * @return QualityEnhanceTask <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
     */
    public QualityEnhanceTask getQualityEnhanceTask() {
        return this.QualityEnhanceTask;
    }

    /**
     * Set <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
     * @param QualityEnhanceTask <p>Audio and video quality revival task information. This field has a value only when TaskType is QualityEnhance.</p>
     */
    public void setQualityEnhanceTask(QualityEnhanceTask QualityEnhanceTask) {
        this.QualityEnhanceTask = QualityEnhanceTask;
    }

    /**
     * Get <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p> 
     * @return ComplexAdaptiveDynamicStreamingTask <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
     */
    public ComplexAdaptiveDynamicStreamingTask getComplexAdaptiveDynamicStreamingTask() {
        return this.ComplexAdaptiveDynamicStreamingTask;
    }

    /**
     * Set <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
     * @param ComplexAdaptiveDynamicStreamingTask <p>Complex adaptive bitrate task information. This field has a value only when TaskType is ComplexAdaptiveDynamicStreaming.</p>
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
     * Get <p>AIGC image task info. This field has a value only when TaskType is AigcImageTask.</p> 
     * @return AigcImageTask <p>AIGC image task info. This field has a value only when TaskType is AigcImageTask.</p>
     */
    public AigcImageTask getAigcImageTask() {
        return this.AigcImageTask;
    }

    /**
     * Set <p>AIGC image task info. This field has a value only when TaskType is AigcImageTask.</p>
     * @param AigcImageTask <p>AIGC image task info. This field has a value only when TaskType is AigcImageTask.</p>
     */
    public void setAigcImageTask(AigcImageTask AigcImageTask) {
        this.AigcImageTask = AigcImageTask;
    }

    /**
     * Get <p>AIGC video generation task information. This field has a value only when TaskType is AigcVideoTask.</p> 
     * @return AigcVideoTask <p>AIGC video generation task information. This field has a value only when TaskType is AigcVideoTask.</p>
     */
    public AigcVideoTask getAigcVideoTask() {
        return this.AigcVideoTask;
    }

    /**
     * Set <p>AIGC video generation task information. This field has a value only when TaskType is AigcVideoTask.</p>
     * @param AigcVideoTask <p>AIGC video generation task information. This field has a value only when TaskType is AigcVideoTask.</p>
     */
    public void setAigcVideoTask(AigcVideoTask AigcVideoTask) {
        this.AigcVideoTask = AigcVideoTask;
    }

    /**
     * Get <p>Media import knowledge base task information. This field has a value only when TaskType is ImportMediaKnowledge.</p> 
     * @return ImportMediaKnowledge <p>Media import knowledge base task information. This field has a value only when TaskType is ImportMediaKnowledge.</p>
     */
    public ImportMediaKnowledgeTask getImportMediaKnowledge() {
        return this.ImportMediaKnowledge;
    }

    /**
     * Set <p>Media import knowledge base task information. This field has a value only when TaskType is ImportMediaKnowledge.</p>
     * @param ImportMediaKnowledge <p>Media import knowledge base task information. This field has a value only when TaskType is ImportMediaKnowledge.</p>
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
     * Get <p>Image asynchronous task processing info. This field has a value only when TaskType is ProcessImageAsync.</p> 
     * @return ProcessImageAsyncTask <p>Image asynchronous task processing info. This field has a value only when TaskType is ProcessImageAsync.</p>
     */
    public ProcessImageAsync getProcessImageAsyncTask() {
        return this.ProcessImageAsyncTask;
    }

    /**
     * Set <p>Image asynchronous task processing info. This field has a value only when TaskType is ProcessImageAsync.</p>
     * @param ProcessImageAsyncTask <p>Image asynchronous task processing info. This field has a value only when TaskType is ProcessImageAsync.</p>
     */
    public void setProcessImageAsyncTask(ProcessImageAsync ProcessImageAsyncTask) {
        this.ProcessImageAsyncTask = ProcessImageAsyncTask;
    }

    /**
     * Get <p>Information about the digital watermark extraction task. This field has a value only when TaskType is ExtractBlindWatermark.</p> 
     * @return ExtractBlindWatermarkTask <p>Information about the digital watermark extraction task. This field has a value only when TaskType is ExtractBlindWatermark.</p>
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkTask() {
        return this.ExtractBlindWatermarkTask;
    }

    /**
     * Set <p>Information about the digital watermark extraction task. This field has a value only when TaskType is ExtractBlindWatermark.</p>
     * @param ExtractBlindWatermarkTask <p>Information about the digital watermark extraction task. This field has a value only when TaskType is ExtractBlindWatermark.</p>
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
     * Get <p>AIGC video redraw info. This field has a value only when TaskType is AigcVideoRedrawTask.</p> 
     * @return AigcVideoRedrawTask <p>AIGC video redraw info. This field has a value only when TaskType is AigcVideoRedrawTask.</p>
     */
    public AigcVideoRedrawTask getAigcVideoRedrawTask() {
        return this.AigcVideoRedrawTask;
    }

    /**
     * Set <p>AIGC video redraw info. This field has a value only when TaskType is AigcVideoRedrawTask.</p>
     * @param AigcVideoRedrawTask <p>AIGC video redraw info. This field has a value only when TaskType is AigcVideoRedrawTask.</p>
     */
    public void setAigcVideoRedrawTask(AigcVideoRedrawTask AigcVideoRedrawTask) {
        this.AigcVideoRedrawTask = AigcVideoRedrawTask;
    }

    /**
     * Get <p>AIGC sound effect information. This field has a value only when TaskType is AigcAudioTask.</p> 
     * @return AigcAudioTask <p>AIGC sound effect information. This field has a value only when TaskType is AigcAudioTask.</p>
     */
    public AigcAudioTask getAigcAudioTask() {
        return this.AigcAudioTask;
    }

    /**
     * Set <p>AIGC sound effect information. This field has a value only when TaskType is AigcAudioTask.</p>
     * @param AigcAudioTask <p>AIGC sound effect information. This field has a value only when TaskType is AigcAudioTask.</p>
     */
    public void setAigcAudioTask(AigcAudioTask AigcAudioTask) {
        this.AigcAudioTask = AigcAudioTask;
    }

    /**
     * Get <p>AIGC voice clone info. This field has a value only when TaskType is CreateAigcAudioClone.</p> 
     * @return CreateAigcAudioCloneTask <p>AIGC voice clone info. This field has a value only when TaskType is CreateAigcAudioClone.</p>
     */
    public CreateAigcAudioCloneTask getCreateAigcAudioCloneTask() {
        return this.CreateAigcAudioCloneTask;
    }

    /**
     * Set <p>AIGC voice clone info. This field has a value only when TaskType is CreateAigcAudioClone.</p>
     * @param CreateAigcAudioCloneTask <p>AIGC voice clone info. This field has a value only when TaskType is CreateAigcAudioClone.</p>
     */
    public void setCreateAigcAudioCloneTask(CreateAigcAudioCloneTask CreateAigcAudioCloneTask) {
        this.CreateAigcAudioCloneTask = CreateAigcAudioCloneTask;
    }

    /**
     * Get <p>Asynchronously fetch AIGC face information. This field has a value only when TaskType is DescribeAigcFaceInfoAsync.</p> 
     * @return DescribeAigcFaceInfoAsyncTask <p>Asynchronously fetch AIGC face information. This field has a value only when TaskType is DescribeAigcFaceInfoAsync.</p>
     */
    public DescribeAigcFaceInfoAsyncTask getDescribeAigcFaceInfoAsyncTask() {
        return this.DescribeAigcFaceInfoAsyncTask;
    }

    /**
     * Set <p>Asynchronously fetch AIGC face information. This field has a value only when TaskType is DescribeAigcFaceInfoAsync.</p>
     * @param DescribeAigcFaceInfoAsyncTask <p>Asynchronously fetch AIGC face information. This field has a value only when TaskType is DescribeAigcFaceInfoAsync.</p>
     */
    public void setDescribeAigcFaceInfoAsyncTask(DescribeAigcFaceInfoAsyncTask DescribeAigcFaceInfoAsyncTask) {
        this.DescribeAigcFaceInfoAsyncTask = DescribeAigcFaceInfoAsyncTask;
    }

    /**
     * Get <p>Hunyuan 3D task. This field has a value only when TaskType is AigcHunyuan3DTask.</p> 
     * @return AigcHunyuan3DTask <p>Hunyuan 3D task. This field has a value only when TaskType is AigcHunyuan3DTask.</p>
     */
    public AigcHunyuan3DTask getAigcHunyuan3DTask() {
        return this.AigcHunyuan3DTask;
    }

    /**
     * Set <p>Hunyuan 3D task. This field has a value only when TaskType is AigcHunyuan3DTask.</p>
     * @param AigcHunyuan3DTask <p>Hunyuan 3D task. This field has a value only when TaskType is AigcHunyuan3DTask.</p>
     */
    public void setAigcHunyuan3DTask(AigcHunyuan3DTask AigcHunyuan3DTask) {
        this.AigcHunyuan3DTask = AigcHunyuan3DTask;
    }

    /**
     * Get <p>Voice type design. This field has a value only when TaskType is DesignVoiceAsync.</p> 
     * @return DesignVoiceAsyncTask <p>Voice type design. This field has a value only when TaskType is DesignVoiceAsync.</p>
     */
    public DesignVoiceAsyncTask getDesignVoiceAsyncTask() {
        return this.DesignVoiceAsyncTask;
    }

    /**
     * Set <p>Voice type design. This field has a value only when TaskType is DesignVoiceAsync.</p>
     * @param DesignVoiceAsyncTask <p>Voice type design. This field has a value only when TaskType is DesignVoiceAsync.</p>
     */
    public void setDesignVoiceAsyncTask(DesignVoiceAsyncTask DesignVoiceAsyncTask) {
        this.DesignVoiceAsyncTask = DesignVoiceAsyncTask;
    }

    /**
     * Get <p>Voice type clone. This field has a value only when TaskType is CloneVoiceAsync.</p> 
     * @return CloneVoiceAsyncTask <p>Voice type clone. This field has a value only when TaskType is CloneVoiceAsync.</p>
     */
    public CloneVoiceAsyncTask getCloneVoiceAsyncTask() {
        return this.CloneVoiceAsyncTask;
    }

    /**
     * Set <p>Voice type clone. This field has a value only when TaskType is CloneVoiceAsync.</p>
     * @param CloneVoiceAsyncTask <p>Voice type clone. This field has a value only when TaskType is CloneVoiceAsync.</p>
     */
    public void setCloneVoiceAsyncTask(CloneVoiceAsyncTask CloneVoiceAsyncTask) {
        this.CloneVoiceAsyncTask = CloneVoiceAsyncTask;
    }

    /**
     * Get <p>Text to speech. This field has a value only when TaskType is TextToSpeechAsync.</p> 
     * @return TextToSpeechAsyncTask <p>Text to speech. This field has a value only when TaskType is TextToSpeechAsync.</p>
     */
    public TextToSpeechAsyncTask getTextToSpeechAsyncTask() {
        return this.TextToSpeechAsyncTask;
    }

    /**
     * Set <p>Text to speech. This field has a value only when TaskType is TextToSpeechAsync.</p>
     * @param TextToSpeechAsyncTask <p>Text to speech. This field has a value only when TaskType is TextToSpeechAsync.</p>
     */
    public void setTextToSpeechAsyncTask(TextToSpeechAsyncTask TextToSpeechAsyncTask) {
        this.TextToSpeechAsyncTask = TextToSpeechAsyncTask;
    }

    /**
     * Get <p>Video translation and dubbing. This field has a value only when TaskType is VideoDubbingAsync.</p> 
     * @return VideoDubbingAsyncTask <p>Video translation and dubbing. This field has a value only when TaskType is VideoDubbingAsync.</p>
     */
    public VideoDubbingAsyncTask getVideoDubbingAsyncTask() {
        return this.VideoDubbingAsyncTask;
    }

    /**
     * Set <p>Video translation and dubbing. This field has a value only when TaskType is VideoDubbingAsync.</p>
     * @param VideoDubbingAsyncTask <p>Video translation and dubbing. This field has a value only when TaskType is VideoDubbingAsync.</p>
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

