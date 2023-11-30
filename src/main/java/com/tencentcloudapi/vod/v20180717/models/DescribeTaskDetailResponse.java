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

public class DescribeTaskDetailResponse extends AbstractModel {

    /**
    * The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`SplitMedia`: Video splitting</li>
<li>`ComposeMedia`: Media file production</li>
<li>`WechatPublish`: Weixin publishing</li>
<li>`WechatMiniProgramPublish`: Publishing videos on Weixin Mini Program</li>
<li>`PullUpload`: Pulling media files for upload</li>
<li>`FastClipMedia`: Quick clipping</li>
<li>`RemoveWatermarkTask`: Watermark removal</li>
<li>`DescribeFileAttributesTask`: Getting file attributes</li>
<li>`RebuildMedia`; Remastering audio/video</li>
<li> `ReviewAudioVideo`: Moderation</li>
<li>`ExtractTraceWatermark`: Digital watermark extraction</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task status. Valid values:
<li>WAITING: waiting;</li>
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProcedureTask")
    @Expose
    private ProcedureTask ProcedureTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EditMediaTask")
    @Expose
    private EditMediaTask EditMediaTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WechatPublishTask")
    @Expose
    private WechatPublishTask WechatPublishTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ComposeMediaTask")
    @Expose
    private ComposeMediaTask ComposeMediaTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SplitMediaTask")
    @Expose
    private SplitMediaTask SplitMediaTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WechatMiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTask WechatMiniProgramPublishTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PullUploadTask")
    @Expose
    private PullUploadTask PullUploadTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTask2017 TranscodeTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConcatTask")
    @Expose
    private ConcatTask2017 ConcatTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ClipTask")
    @Expose
    private ClipTask2017 ClipTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateImageSpriteTask")
    @Expose
    private CreateImageSpriteTask2017 CreateImageSpriteTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RemoveWatermarkTask")
    @Expose
    private RemoveWatermarkTask RemoveWatermarkTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RebuildMediaTask")
    @Expose
    private RebuildMediaTask RebuildMediaTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtractTraceWatermarkTask")
    @Expose
    private ExtractTraceWatermarkTask ExtractTraceWatermarkTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtractCopyRightWatermarkTask")
    @Expose
    private ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ReviewAudioVideoTask ReviewAudioVideoTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReduceMediaBitrateTask")
    @Expose
    private ReduceMediaBitrateTask ReduceMediaBitrateTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DescribeFileAttributesTask")
    @Expose
    private DescribeFileAttributesTask DescribeFileAttributesTask;

    /**
    * 
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityInspectTask")
    @Expose
    private QualityInspectTask QualityInspectTask;

    /**
    * Media Quality Enhance task information. This field has a value only when TaskType is QualityEnhance.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityEnhanceTask")
    @Expose
    private QualityEnhanceTask QualityEnhanceTask;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`SplitMedia`: Video splitting</li>
<li>`ComposeMedia`: Media file production</li>
<li>`WechatPublish`: Weixin publishing</li>
<li>`WechatMiniProgramPublish`: Publishing videos on Weixin Mini Program</li>
<li>`PullUpload`: Pulling media files for upload</li>
<li>`FastClipMedia`: Quick clipping</li>
<li>`RemoveWatermarkTask`: Watermark removal</li>
<li>`DescribeFileAttributesTask`: Getting file attributes</li>
<li>`RebuildMedia`; Remastering audio/video</li>
<li> `ReviewAudioVideo`: Moderation</li>
<li>`ExtractTraceWatermark`: Digital watermark extraction</li> 
     * @return TaskType The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`SplitMedia`: Video splitting</li>
<li>`ComposeMedia`: Media file production</li>
<li>`WechatPublish`: Weixin publishing</li>
<li>`WechatMiniProgramPublish`: Publishing videos on Weixin Mini Program</li>
<li>`PullUpload`: Pulling media files for upload</li>
<li>`FastClipMedia`: Quick clipping</li>
<li>`RemoveWatermarkTask`: Watermark removal</li>
<li>`DescribeFileAttributesTask`: Getting file attributes</li>
<li>`RebuildMedia`; Remastering audio/video</li>
<li> `ReviewAudioVideo`: Moderation</li>
<li>`ExtractTraceWatermark`: Digital watermark extraction</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`SplitMedia`: Video splitting</li>
<li>`ComposeMedia`: Media file production</li>
<li>`WechatPublish`: Weixin publishing</li>
<li>`WechatMiniProgramPublish`: Publishing videos on Weixin Mini Program</li>
<li>`PullUpload`: Pulling media files for upload</li>
<li>`FastClipMedia`: Quick clipping</li>
<li>`RemoveWatermarkTask`: Watermark removal</li>
<li>`DescribeFileAttributesTask`: Getting file attributes</li>
<li>`RebuildMedia`; Remastering audio/video</li>
<li> `ReviewAudioVideo`: Moderation</li>
<li>`ExtractTraceWatermark`: Digital watermark extraction</li>
     * @param TaskType The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`SplitMedia`: Video splitting</li>
<li>`ComposeMedia`: Media file production</li>
<li>`WechatPublish`: Weixin publishing</li>
<li>`WechatMiniProgramPublish`: Publishing videos on Weixin Mini Program</li>
<li>`PullUpload`: Pulling media files for upload</li>
<li>`FastClipMedia`: Quick clipping</li>
<li>`RemoveWatermarkTask`: Watermark removal</li>
<li>`DescribeFileAttributesTask`: Getting file attributes</li>
<li>`RebuildMedia`; Remastering audio/video</li>
<li> `ReviewAudioVideo`: Moderation</li>
<li>`ExtractTraceWatermark`: Digital watermark extraction</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task status. Valid values:
<li>WAITING: waiting;</li>
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li> 
     * @return Status Task status. Valid values:
<li>WAITING: waiting;</li>
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values:
<li>WAITING: waiting;</li>
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
     * @param Status Task status. Valid values:
<li>WAITING: waiting;</li>
<li>PROCESSING: processing;</li>
<li>FINISH: completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return BeginProcessTime Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param BeginProcessTime Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return FinishTime End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param FinishTime End time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProcedureTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ProcedureTask getProcedureTask() {
        return this.ProcedureTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProcedureTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProcedureTask(ProcedureTask ProcedureTask) {
        this.ProcedureTask = ProcedureTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EditMediaTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public EditMediaTask getEditMediaTask() {
        return this.EditMediaTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EditMediaTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEditMediaTask(EditMediaTask EditMediaTask) {
        this.EditMediaTask = EditMediaTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WechatPublishTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public WechatPublishTask getWechatPublishTask() {
        return this.WechatPublishTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WechatPublishTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWechatPublishTask(WechatPublishTask WechatPublishTask) {
        this.WechatPublishTask = WechatPublishTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ComposeMediaTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ComposeMediaTask getComposeMediaTask() {
        return this.ComposeMediaTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ComposeMediaTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setComposeMediaTask(ComposeMediaTask ComposeMediaTask) {
        this.ComposeMediaTask = ComposeMediaTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SplitMediaTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SplitMediaTask getSplitMediaTask() {
        return this.SplitMediaTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SplitMediaTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSplitMediaTask(SplitMediaTask SplitMediaTask) {
        this.SplitMediaTask = SplitMediaTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WechatMiniProgramPublishTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public WechatMiniProgramPublishTask getWechatMiniProgramPublishTask() {
        return this.WechatMiniProgramPublishTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WechatMiniProgramPublishTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWechatMiniProgramPublishTask(WechatMiniProgramPublishTask WechatMiniProgramPublishTask) {
        this.WechatMiniProgramPublishTask = WechatMiniProgramPublishTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PullUploadTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public PullUploadTask getPullUploadTask() {
        return this.PullUploadTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PullUploadTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPullUploadTask(PullUploadTask PullUploadTask) {
        this.PullUploadTask = PullUploadTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TranscodeTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TranscodeTask2017 getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TranscodeTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTranscodeTask(TranscodeTask2017 TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ConcatTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ConcatTask2017 getConcatTask() {
        return this.ConcatTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ConcatTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConcatTask(ConcatTask2017 ConcatTask) {
        this.ConcatTask = ConcatTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ClipTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ClipTask2017 getClipTask() {
        return this.ClipTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ClipTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClipTask(ClipTask2017 ClipTask) {
        this.ClipTask = ClipTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateImageSpriteTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CreateImageSpriteTask2017 getCreateImageSpriteTask() {
        return this.CreateImageSpriteTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateImageSpriteTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateImageSpriteTask(CreateImageSpriteTask2017 CreateImageSpriteTask) {
        this.CreateImageSpriteTask = CreateImageSpriteTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SnapshotByTimeOffsetTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SnapshotByTimeOffsetTask2017 getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SnapshotByTimeOffsetTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTask2017 SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RemoveWatermarkTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RemoveWatermarkTask getRemoveWatermarkTask() {
        return this.RemoveWatermarkTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RemoveWatermarkTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemoveWatermarkTask(RemoveWatermarkTask RemoveWatermarkTask) {
        this.RemoveWatermarkTask = RemoveWatermarkTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RebuildMediaTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RebuildMediaTask getRebuildMediaTask() {
        return this.RebuildMediaTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RebuildMediaTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRebuildMediaTask(RebuildMediaTask RebuildMediaTask) {
        this.RebuildMediaTask = RebuildMediaTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtractTraceWatermarkTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ExtractTraceWatermarkTask getExtractTraceWatermarkTask() {
        return this.ExtractTraceWatermarkTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtractTraceWatermarkTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtractTraceWatermarkTask(ExtractTraceWatermarkTask ExtractTraceWatermarkTask) {
        this.ExtractTraceWatermarkTask = ExtractTraceWatermarkTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtractCopyRightWatermarkTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ExtractCopyRightWatermarkTask getExtractCopyRightWatermarkTask() {
        return this.ExtractCopyRightWatermarkTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtractCopyRightWatermarkTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtractCopyRightWatermarkTask(ExtractCopyRightWatermarkTask ExtractCopyRightWatermarkTask) {
        this.ExtractCopyRightWatermarkTask = ExtractCopyRightWatermarkTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReviewAudioVideoTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ReviewAudioVideoTask getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReviewAudioVideoTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReviewAudioVideoTask(ReviewAudioVideoTask ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReduceMediaBitrateTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ReduceMediaBitrateTask getReduceMediaBitrateTask() {
        return this.ReduceMediaBitrateTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReduceMediaBitrateTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReduceMediaBitrateTask(ReduceMediaBitrateTask ReduceMediaBitrateTask) {
        this.ReduceMediaBitrateTask = ReduceMediaBitrateTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DescribeFileAttributesTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DescribeFileAttributesTask getDescribeFileAttributesTask() {
        return this.DescribeFileAttributesTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DescribeFileAttributesTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescribeFileAttributesTask(DescribeFileAttributesTask DescribeFileAttributesTask) {
        this.DescribeFileAttributesTask = DescribeFileAttributesTask;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityInspectTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public QualityInspectTask getQualityInspectTask() {
        return this.QualityInspectTask;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityInspectTask 
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityInspectTask(QualityInspectTask QualityInspectTask) {
        this.QualityInspectTask = QualityInspectTask;
    }

    /**
     * Get Media Quality Enhance task information. This field has a value only when TaskType is QualityEnhance.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityEnhanceTask Media Quality Enhance task information. This field has a value only when TaskType is QualityEnhance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public QualityEnhanceTask getQualityEnhanceTask() {
        return this.QualityEnhanceTask;
    }

    /**
     * Set Media Quality Enhance task information. This field has a value only when TaskType is QualityEnhance.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityEnhanceTask Media Quality Enhance task information. This field has a value only when TaskType is QualityEnhance.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityEnhanceTask(QualityEnhanceTask QualityEnhanceTask) {
        this.QualityEnhanceTask = QualityEnhanceTask;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

