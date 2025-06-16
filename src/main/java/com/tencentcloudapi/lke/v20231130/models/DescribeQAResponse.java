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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQAResponse extends AbstractModel {

    /**
    * Q&A business ID.

    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * Question.

    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Answer.

    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * Custom parameter.
    */
    @SerializedName("CustomParam")
    @Expose
    private String CustomParam;

    /**
    * Source:
1 - Q&A pairs generated from documents.
2 - Q&A pairs imported in batches.
3 - Q&A pairs input manually one by one.


    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * Source description.

    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * Update time.


    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Status<br>1 - pending verification; 2 - not released; 3 - releasing; 4 - released; 5 - release failed; 6 - not approved; 7 - under review; 8 - review failed, 9 - review failed, pending manual review after appeal; 11 - review failed, manual review not passed after appeal; 12 - expired; 13 - excessive invalid; 14 - excessive invalid recovered; 19 - learning; 20 - learning failed.


    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Status description.


    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Category ID.

    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * Whether verification is allowed.

    */
    @SerializedName("IsAllowAccept")
    @Expose
    private Boolean IsAllowAccept;

    /**
    * Whether deletion is allowed.

    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
    * Whether editing is allowed.

    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * Document ID.

    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * Document name.

    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Document type.

    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Segment ID.

    */
    @SerializedName("SegmentBizId")
    @Expose
    private String SegmentBizId;

    /**
    * Segment content.
    */
    @SerializedName("PageContent")
    @Expose
    private String PageContent;

    /**
    * Segment highlight content.
    */
    @SerializedName("Highlights")
    @Expose
    private Highlight [] Highlights;

    /**
    * Segment content.

    */
    @SerializedName("OrgData")
    @Expose
    private String OrgData;

    /**
    * Applicable scope of label.
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * Label.
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabel [] AttrLabels;

    /**
    * Effective start time, unix timestamp.
    */
    @SerializedName("ExpireStart")
    @Expose
    private String ExpireStart;

    /**
    * Effective end time, unix timestamp. 0 indicates permanent validity.
    */
    @SerializedName("ExpireEnd")
    @Expose
    private String ExpireEnd;

    /**
    * Similar question list information.
    */
    @SerializedName("SimilarQuestions")
    @Expose
    private SimilarQuestion [] SimilarQuestions;

    /**
    * Review status of Q&A text: 1 - review failed.
    */
    @SerializedName("QaAuditStatus")
    @Expose
    private Long QaAuditStatus;

    /**
    * Review status of image in Q&A: 1-review failed.
    */
    @SerializedName("PicAuditStatus")
    @Expose
    private Long PicAuditStatus;

    /**
    * Review status of video in Q&A: 1 - review failed.
    */
    @SerializedName("VideoAuditStatus")
    @Expose
    private Long VideoAuditStatus;

    /**
    * Question description.
    */
    @SerializedName("QuestionDesc")
    @Expose
    private String QuestionDesc;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Q&A business ID.
 
     * @return QaBizId Q&A business ID.

     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set Q&A business ID.

     * @param QaBizId Q&A business ID.

     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get Question.
 
     * @return Question Question.

     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set Question.

     * @param Question Question.

     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Answer.
 
     * @return Answer Answer.

     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set Answer.

     * @param Answer Answer.

     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get Custom parameter. 
     * @return CustomParam Custom parameter.
     */
    public String getCustomParam() {
        return this.CustomParam;
    }

    /**
     * Set Custom parameter.
     * @param CustomParam Custom parameter.
     */
    public void setCustomParam(String CustomParam) {
        this.CustomParam = CustomParam;
    }

    /**
     * Get Source:
1 - Q&A pairs generated from documents.
2 - Q&A pairs imported in batches.
3 - Q&A pairs input manually one by one.

 
     * @return Source Source:
1 - Q&A pairs generated from documents.
2 - Q&A pairs imported in batches.
3 - Q&A pairs input manually one by one.


     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Source:
1 - Q&A pairs generated from documents.
2 - Q&A pairs imported in batches.
3 - Q&A pairs input manually one by one.


     * @param Source Source:
1 - Q&A pairs generated from documents.
2 - Q&A pairs imported in batches.
3 - Q&A pairs input manually one by one.


     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get Source description.
 
     * @return SourceDesc Source description.

     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set Source description.

     * @param SourceDesc Source description.

     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
    }

    /**
     * Get Update time.

 
     * @return UpdateTime Update time.


     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.


     * @param UpdateTime Update time.


     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Status<br>1 - pending verification; 2 - not released; 3 - releasing; 4 - released; 5 - release failed; 6 - not approved; 7 - under review; 8 - review failed, 9 - review failed, pending manual review after appeal; 11 - review failed, manual review not passed after appeal; 12 - expired; 13 - excessive invalid; 14 - excessive invalid recovered; 19 - learning; 20 - learning failed.

 
     * @return Status Status<br>1 - pending verification; 2 - not released; 3 - releasing; 4 - released; 5 - release failed; 6 - not approved; 7 - under review; 8 - review failed, 9 - review failed, pending manual review after appeal; 11 - review failed, manual review not passed after appeal; 12 - expired; 13 - excessive invalid; 14 - excessive invalid recovered; 19 - learning; 20 - learning failed.


     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status<br>1 - pending verification; 2 - not released; 3 - releasing; 4 - released; 5 - release failed; 6 - not approved; 7 - under review; 8 - review failed, 9 - review failed, pending manual review after appeal; 11 - review failed, manual review not passed after appeal; 12 - expired; 13 - excessive invalid; 14 - excessive invalid recovered; 19 - learning; 20 - learning failed.


     * @param Status Status<br>1 - pending verification; 2 - not released; 3 - releasing; 4 - released; 5 - release failed; 6 - not approved; 7 - under review; 8 - review failed, 9 - review failed, pending manual review after appeal; 11 - review failed, manual review not passed after appeal; 12 - expired; 13 - excessive invalid; 14 - excessive invalid recovered; 19 - learning; 20 - learning failed.


     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Status description.

 
     * @return StatusDesc Status description.


     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description.


     * @param StatusDesc Status description.


     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Category ID.
 
     * @return CateBizId Category ID.

     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set Category ID.

     * @param CateBizId Category ID.

     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get Whether verification is allowed.
 
     * @return IsAllowAccept Whether verification is allowed.

     */
    public Boolean getIsAllowAccept() {
        return this.IsAllowAccept;
    }

    /**
     * Set Whether verification is allowed.

     * @param IsAllowAccept Whether verification is allowed.

     */
    public void setIsAllowAccept(Boolean IsAllowAccept) {
        this.IsAllowAccept = IsAllowAccept;
    }

    /**
     * Get Whether deletion is allowed.
 
     * @return IsAllowDelete Whether deletion is allowed.

     */
    public Boolean getIsAllowDelete() {
        return this.IsAllowDelete;
    }

    /**
     * Set Whether deletion is allowed.

     * @param IsAllowDelete Whether deletion is allowed.

     */
    public void setIsAllowDelete(Boolean IsAllowDelete) {
        this.IsAllowDelete = IsAllowDelete;
    }

    /**
     * Get Whether editing is allowed.
 
     * @return IsAllowEdit Whether editing is allowed.

     */
    public Boolean getIsAllowEdit() {
        return this.IsAllowEdit;
    }

    /**
     * Set Whether editing is allowed.

     * @param IsAllowEdit Whether editing is allowed.

     */
    public void setIsAllowEdit(Boolean IsAllowEdit) {
        this.IsAllowEdit = IsAllowEdit;
    }

    /**
     * Get Document ID.
 
     * @return DocBizId Document ID.

     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set Document ID.

     * @param DocBizId Document ID.

     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get Document name.
 
     * @return FileName Document name.

     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Document name.

     * @param FileName Document name.

     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Document type.
 
     * @return FileType Document type.

     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Document type.

     * @param FileType Document type.

     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Segment ID.
 
     * @return SegmentBizId Segment ID.

     */
    public String getSegmentBizId() {
        return this.SegmentBizId;
    }

    /**
     * Set Segment ID.

     * @param SegmentBizId Segment ID.

     */
    public void setSegmentBizId(String SegmentBizId) {
        this.SegmentBizId = SegmentBizId;
    }

    /**
     * Get Segment content. 
     * @return PageContent Segment content.
     */
    public String getPageContent() {
        return this.PageContent;
    }

    /**
     * Set Segment content.
     * @param PageContent Segment content.
     */
    public void setPageContent(String PageContent) {
        this.PageContent = PageContent;
    }

    /**
     * Get Segment highlight content. 
     * @return Highlights Segment highlight content.
     */
    public Highlight [] getHighlights() {
        return this.Highlights;
    }

    /**
     * Set Segment highlight content.
     * @param Highlights Segment highlight content.
     */
    public void setHighlights(Highlight [] Highlights) {
        this.Highlights = Highlights;
    }

    /**
     * Get Segment content.
 
     * @return OrgData Segment content.

     */
    public String getOrgData() {
        return this.OrgData;
    }

    /**
     * Set Segment content.

     * @param OrgData Segment content.

     */
    public void setOrgData(String OrgData) {
        this.OrgData = OrgData;
    }

    /**
     * Get Applicable scope of label. 
     * @return AttrRange Applicable scope of label.
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set Applicable scope of label.
     * @param AttrRange Applicable scope of label.
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get Label. 
     * @return AttrLabels Label.
     */
    public AttrLabel [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set Label.
     * @param AttrLabels Label.
     */
    public void setAttrLabels(AttrLabel [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get Effective start time, unix timestamp. 
     * @return ExpireStart Effective start time, unix timestamp.
     */
    public String getExpireStart() {
        return this.ExpireStart;
    }

    /**
     * Set Effective start time, unix timestamp.
     * @param ExpireStart Effective start time, unix timestamp.
     */
    public void setExpireStart(String ExpireStart) {
        this.ExpireStart = ExpireStart;
    }

    /**
     * Get Effective end time, unix timestamp. 0 indicates permanent validity. 
     * @return ExpireEnd Effective end time, unix timestamp. 0 indicates permanent validity.
     */
    public String getExpireEnd() {
        return this.ExpireEnd;
    }

    /**
     * Set Effective end time, unix timestamp. 0 indicates permanent validity.
     * @param ExpireEnd Effective end time, unix timestamp. 0 indicates permanent validity.
     */
    public void setExpireEnd(String ExpireEnd) {
        this.ExpireEnd = ExpireEnd;
    }

    /**
     * Get Similar question list information. 
     * @return SimilarQuestions Similar question list information.
     */
    public SimilarQuestion [] getSimilarQuestions() {
        return this.SimilarQuestions;
    }

    /**
     * Set Similar question list information.
     * @param SimilarQuestions Similar question list information.
     */
    public void setSimilarQuestions(SimilarQuestion [] SimilarQuestions) {
        this.SimilarQuestions = SimilarQuestions;
    }

    /**
     * Get Review status of Q&A text: 1 - review failed. 
     * @return QaAuditStatus Review status of Q&A text: 1 - review failed.
     */
    public Long getQaAuditStatus() {
        return this.QaAuditStatus;
    }

    /**
     * Set Review status of Q&A text: 1 - review failed.
     * @param QaAuditStatus Review status of Q&A text: 1 - review failed.
     */
    public void setQaAuditStatus(Long QaAuditStatus) {
        this.QaAuditStatus = QaAuditStatus;
    }

    /**
     * Get Review status of image in Q&A: 1-review failed. 
     * @return PicAuditStatus Review status of image in Q&A: 1-review failed.
     */
    public Long getPicAuditStatus() {
        return this.PicAuditStatus;
    }

    /**
     * Set Review status of image in Q&A: 1-review failed.
     * @param PicAuditStatus Review status of image in Q&A: 1-review failed.
     */
    public void setPicAuditStatus(Long PicAuditStatus) {
        this.PicAuditStatus = PicAuditStatus;
    }

    /**
     * Get Review status of video in Q&A: 1 - review failed. 
     * @return VideoAuditStatus Review status of video in Q&A: 1 - review failed.
     */
    public Long getVideoAuditStatus() {
        return this.VideoAuditStatus;
    }

    /**
     * Set Review status of video in Q&A: 1 - review failed.
     * @param VideoAuditStatus Review status of video in Q&A: 1 - review failed.
     */
    public void setVideoAuditStatus(Long VideoAuditStatus) {
        this.VideoAuditStatus = VideoAuditStatus;
    }

    /**
     * Get Question description. 
     * @return QuestionDesc Question description.
     */
    public String getQuestionDesc() {
        return this.QuestionDesc;
    }

    /**
     * Set Question description.
     * @param QuestionDesc Question description.
     */
    public void setQuestionDesc(String QuestionDesc) {
        this.QuestionDesc = QuestionDesc;
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

    public DescribeQAResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQAResponse(DescribeQAResponse source) {
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.CustomParam != null) {
            this.CustomParam = new String(source.CustomParam);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.IsAllowAccept != null) {
            this.IsAllowAccept = new Boolean(source.IsAllowAccept);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.SegmentBizId != null) {
            this.SegmentBizId = new String(source.SegmentBizId);
        }
        if (source.PageContent != null) {
            this.PageContent = new String(source.PageContent);
        }
        if (source.Highlights != null) {
            this.Highlights = new Highlight[source.Highlights.length];
            for (int i = 0; i < source.Highlights.length; i++) {
                this.Highlights[i] = new Highlight(source.Highlights[i]);
            }
        }
        if (source.OrgData != null) {
            this.OrgData = new String(source.OrgData);
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabel[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabel(source.AttrLabels[i]);
            }
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
        }
        if (source.SimilarQuestions != null) {
            this.SimilarQuestions = new SimilarQuestion[source.SimilarQuestions.length];
            for (int i = 0; i < source.SimilarQuestions.length; i++) {
                this.SimilarQuestions[i] = new SimilarQuestion(source.SimilarQuestions[i]);
            }
        }
        if (source.QaAuditStatus != null) {
            this.QaAuditStatus = new Long(source.QaAuditStatus);
        }
        if (source.PicAuditStatus != null) {
            this.PicAuditStatus = new Long(source.PicAuditStatus);
        }
        if (source.VideoAuditStatus != null) {
            this.VideoAuditStatus = new Long(source.VideoAuditStatus);
        }
        if (source.QuestionDesc != null) {
            this.QuestionDesc = new String(source.QuestionDesc);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "CustomParam", this.CustomParam);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "IsAllowAccept", this.IsAllowAccept);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "SegmentBizId", this.SegmentBizId);
        this.setParamSimple(map, prefix + "PageContent", this.PageContent);
        this.setParamArrayObj(map, prefix + "Highlights.", this.Highlights);
        this.setParamSimple(map, prefix + "OrgData", this.OrgData);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);
        this.setParamArrayObj(map, prefix + "SimilarQuestions.", this.SimilarQuestions);
        this.setParamSimple(map, prefix + "QaAuditStatus", this.QaAuditStatus);
        this.setParamSimple(map, prefix + "PicAuditStatus", this.PicAuditStatus);
        this.setParamSimple(map, prefix + "VideoAuditStatus", this.VideoAuditStatus);
        this.setParamSimple(map, prefix + "QuestionDesc", this.QuestionDesc);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

