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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListQaItem extends AbstractModel {

    /**
    * Q&A ID.
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
    * Source.
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
    * Status.
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
    * Document ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether editing is allowed.
    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * Whether deletion is allowed.
    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
    * Whether verification is allowed.
    */
    @SerializedName("IsAllowAccept")
    @Expose
    private Boolean IsAllowAccept;

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
    * Number of Q&A characters.
    */
    @SerializedName("QaCharSize")
    @Expose
    private String QaCharSize;

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
    * Applicable range of attribute label, 1: all, 2: by conditions.
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * Attribute label.
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabel [] AttrLabels;

    /**
    * Count of similar questions.
    */
    @SerializedName("SimilarQuestionNum")
    @Expose
    private Long SimilarQuestionNum;

    /**
    * Return similar questions associated with the Q&A and perform linked search. Only one similar question will be displayed.
    */
    @SerializedName("SimilarQuestionTips")
    @Expose
    private String SimilarQuestionTips;

    /**
     * Get Q&A ID. 
     * @return QaBizId Q&A ID.
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set Q&A ID.
     * @param QaBizId Q&A ID.
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
     * Get Source. 
     * @return Source Source.
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Source.
     * @param Source Source.
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
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
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
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get Number of Q&A characters. 
     * @return QaCharSize Number of Q&A characters.
     */
    public String getQaCharSize() {
        return this.QaCharSize;
    }

    /**
     * Set Number of Q&A characters.
     * @param QaCharSize Number of Q&A characters.
     */
    public void setQaCharSize(String QaCharSize) {
        this.QaCharSize = QaCharSize;
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
     * Get Applicable range of attribute label, 1: all, 2: by conditions. 
     * @return AttrRange Applicable range of attribute label, 1: all, 2: by conditions.
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set Applicable range of attribute label, 1: all, 2: by conditions.
     * @param AttrRange Applicable range of attribute label, 1: all, 2: by conditions.
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get Attribute label. 
     * @return AttrLabels Attribute label.
     */
    public AttrLabel [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set Attribute label.
     * @param AttrLabels Attribute label.
     */
    public void setAttrLabels(AttrLabel [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get Count of similar questions. 
     * @return SimilarQuestionNum Count of similar questions.
     */
    public Long getSimilarQuestionNum() {
        return this.SimilarQuestionNum;
    }

    /**
     * Set Count of similar questions.
     * @param SimilarQuestionNum Count of similar questions.
     */
    public void setSimilarQuestionNum(Long SimilarQuestionNum) {
        this.SimilarQuestionNum = SimilarQuestionNum;
    }

    /**
     * Get Return similar questions associated with the Q&A and perform linked search. Only one similar question will be displayed. 
     * @return SimilarQuestionTips Return similar questions associated with the Q&A and perform linked search. Only one similar question will be displayed.
     */
    public String getSimilarQuestionTips() {
        return this.SimilarQuestionTips;
    }

    /**
     * Set Return similar questions associated with the Q&A and perform linked search. Only one similar question will be displayed.
     * @param SimilarQuestionTips Return similar questions associated with the Q&A and perform linked search. Only one similar question will be displayed.
     */
    public void setSimilarQuestionTips(String SimilarQuestionTips) {
        this.SimilarQuestionTips = SimilarQuestionTips;
    }

    public ListQaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQaItem(ListQaItem source) {
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
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
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
        if (source.IsAllowAccept != null) {
            this.IsAllowAccept = new Boolean(source.IsAllowAccept);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.QaCharSize != null) {
            this.QaCharSize = new String(source.QaCharSize);
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
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
        if (source.SimilarQuestionNum != null) {
            this.SimilarQuestionNum = new Long(source.SimilarQuestionNum);
        }
        if (source.SimilarQuestionTips != null) {
            this.SimilarQuestionTips = new String(source.SimilarQuestionTips);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);
        this.setParamSimple(map, prefix + "IsAllowAccept", this.IsAllowAccept);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "QaCharSize", this.QaCharSize);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "SimilarQuestionNum", this.SimilarQuestionNum);
        this.setParamSimple(map, prefix + "SimilarQuestionTips", this.SimilarQuestionTips);

    }
}

