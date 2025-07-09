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

public class ListDocItem extends AbstractModel {

    /**
    * Document ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * File name.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * The new document name after renaming. This name remains until the document is published after the renaming submission.
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
    * File type.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * COS path.
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Document status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Document status description.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Whether to refer to an answer.
    */
    @SerializedName("IsRefer")
    @Expose
    private Boolean IsRefer;

    /**
    * Quantity of Q&A pairs.
    */
    @SerializedName("QaNum")
    @Expose
    private Long QaNum;

    /**
    * Whether it has been deleted.
    */
    @SerializedName("IsDeleted")
    @Expose
    private Boolean IsDeleted;

    /**
    * Document source.
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * Document source description.
    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * Whether regeneration is allowed.
    */
    @SerializedName("IsAllowRestart")
    @Expose
    private Boolean IsAllowRestart;

    /**
    * Whether the Q&A has been deleted.
    */
    @SerializedName("IsDeletedQa")
    @Expose
    private Boolean IsDeletedQa;

    /**
    * Whether the Q&A is being generated.
    */
    @SerializedName("IsCreatingQa")
    @Expose
    private Boolean IsCreatingQa;

    /**
    * Whether deletion is allowed.
    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
    * Whether to allow operation reference switch.
    */
    @SerializedName("IsAllowRefer")
    @Expose
    private Boolean IsAllowRefer;

    /**
    * Whether Q&A has been generated.
    */
    @SerializedName("IsCreatedQa")
    @Expose
    private Boolean IsCreatedQa;

    /**
    * Document character count.
    */
    @SerializedName("DocCharSize")
    @Expose
    private String DocCharSize;

    /**
    * Applicable range of attribute label.
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
    * Whether editing is allowed.
    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * External reference URL type, 0: system URL; 1: custom URL.
When the value is 1, the WebUrl field cannot be empty; otherwise, it will not take effect.
    */
    @SerializedName("ReferUrlType")
    @Expose
    private Long ReferUrlType;

    /**
    * Web page URL (or custom URL) .
    */
    @SerializedName("WebUrl")
    @Expose
    private String WebUrl;

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
    * Whether retries are allowed, 0: no, 1: yes.
    */
    @SerializedName("IsAllowRetry")
    @Expose
    private Boolean IsAllowRetry;

    /**
    * 0: document comparison processing; 1: Q&A generation from document.
    */
    @SerializedName("Processing")
    @Expose
    private Long [] Processing;

    /**
    * Time when the document was created and stored into the database.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * ID of the document's category.
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * User-defined ID of the document.
    */
    @SerializedName("CustomerKnowledgeId")
    @Expose
    private String CustomerKnowledgeId;

    /**
    * Attribute label of the document. 0: Do not perform external user permission verification.
    */
    @SerializedName("AttributeFlags")
    @Expose
    private Long [] AttributeFlags;

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
     * Get File name. 
     * @return FileName File name.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name.
     * @param FileName File name.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get The new document name after renaming. This name remains until the document is published after the renaming submission. 
     * @return NewName The new document name after renaming. This name remains until the document is published after the renaming submission.
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set The new document name after renaming. This name remains until the document is published after the renaming submission.
     * @param NewName The new document name after renaming. This name remains until the document is published after the renaming submission.
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    /**
     * Get File type. 
     * @return FileType File type.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type.
     * @param FileType File type.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get COS path. 
     * @return CosUrl COS path.
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set COS path.
     * @param CosUrl COS path.
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
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
     * Get Document status. 
     * @return Status Document status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Document status.
     * @param Status Document status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Document status description. 
     * @return StatusDesc Document status description.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Document status description.
     * @param StatusDesc Document status description.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Reason. 
     * @return Reason Reason.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason.
     * @param Reason Reason.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Whether to refer to an answer. 
     * @return IsRefer Whether to refer to an answer.
     */
    public Boolean getIsRefer() {
        return this.IsRefer;
    }

    /**
     * Set Whether to refer to an answer.
     * @param IsRefer Whether to refer to an answer.
     */
    public void setIsRefer(Boolean IsRefer) {
        this.IsRefer = IsRefer;
    }

    /**
     * Get Quantity of Q&A pairs. 
     * @return QaNum Quantity of Q&A pairs.
     */
    public Long getQaNum() {
        return this.QaNum;
    }

    /**
     * Set Quantity of Q&A pairs.
     * @param QaNum Quantity of Q&A pairs.
     */
    public void setQaNum(Long QaNum) {
        this.QaNum = QaNum;
    }

    /**
     * Get Whether it has been deleted. 
     * @return IsDeleted Whether it has been deleted.
     */
    public Boolean getIsDeleted() {
        return this.IsDeleted;
    }

    /**
     * Set Whether it has been deleted.
     * @param IsDeleted Whether it has been deleted.
     */
    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    /**
     * Get Document source. 
     * @return Source Document source.
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Document source.
     * @param Source Document source.
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get Document source description. 
     * @return SourceDesc Document source description.
     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set Document source description.
     * @param SourceDesc Document source description.
     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
    }

    /**
     * Get Whether regeneration is allowed. 
     * @return IsAllowRestart Whether regeneration is allowed.
     */
    public Boolean getIsAllowRestart() {
        return this.IsAllowRestart;
    }

    /**
     * Set Whether regeneration is allowed.
     * @param IsAllowRestart Whether regeneration is allowed.
     */
    public void setIsAllowRestart(Boolean IsAllowRestart) {
        this.IsAllowRestart = IsAllowRestart;
    }

    /**
     * Get Whether the Q&A has been deleted. 
     * @return IsDeletedQa Whether the Q&A has been deleted.
     */
    public Boolean getIsDeletedQa() {
        return this.IsDeletedQa;
    }

    /**
     * Set Whether the Q&A has been deleted.
     * @param IsDeletedQa Whether the Q&A has been deleted.
     */
    public void setIsDeletedQa(Boolean IsDeletedQa) {
        this.IsDeletedQa = IsDeletedQa;
    }

    /**
     * Get Whether the Q&A is being generated. 
     * @return IsCreatingQa Whether the Q&A is being generated.
     */
    public Boolean getIsCreatingQa() {
        return this.IsCreatingQa;
    }

    /**
     * Set Whether the Q&A is being generated.
     * @param IsCreatingQa Whether the Q&A is being generated.
     */
    public void setIsCreatingQa(Boolean IsCreatingQa) {
        this.IsCreatingQa = IsCreatingQa;
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
     * Get Whether to allow operation reference switch. 
     * @return IsAllowRefer Whether to allow operation reference switch.
     */
    public Boolean getIsAllowRefer() {
        return this.IsAllowRefer;
    }

    /**
     * Set Whether to allow operation reference switch.
     * @param IsAllowRefer Whether to allow operation reference switch.
     */
    public void setIsAllowRefer(Boolean IsAllowRefer) {
        this.IsAllowRefer = IsAllowRefer;
    }

    /**
     * Get Whether Q&A has been generated. 
     * @return IsCreatedQa Whether Q&A has been generated.
     */
    public Boolean getIsCreatedQa() {
        return this.IsCreatedQa;
    }

    /**
     * Set Whether Q&A has been generated.
     * @param IsCreatedQa Whether Q&A has been generated.
     */
    public void setIsCreatedQa(Boolean IsCreatedQa) {
        this.IsCreatedQa = IsCreatedQa;
    }

    /**
     * Get Document character count. 
     * @return DocCharSize Document character count.
     */
    public String getDocCharSize() {
        return this.DocCharSize;
    }

    /**
     * Set Document character count.
     * @param DocCharSize Document character count.
     */
    public void setDocCharSize(String DocCharSize) {
        this.DocCharSize = DocCharSize;
    }

    /**
     * Get Applicable range of attribute label. 
     * @return AttrRange Applicable range of attribute label.
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set Applicable range of attribute label.
     * @param AttrRange Applicable range of attribute label.
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
     * Get External reference URL type, 0: system URL; 1: custom URL.
When the value is 1, the WebUrl field cannot be empty; otherwise, it will not take effect. 
     * @return ReferUrlType External reference URL type, 0: system URL; 1: custom URL.
When the value is 1, the WebUrl field cannot be empty; otherwise, it will not take effect.
     */
    public Long getReferUrlType() {
        return this.ReferUrlType;
    }

    /**
     * Set External reference URL type, 0: system URL; 1: custom URL.
When the value is 1, the WebUrl field cannot be empty; otherwise, it will not take effect.
     * @param ReferUrlType External reference URL type, 0: system URL; 1: custom URL.
When the value is 1, the WebUrl field cannot be empty; otherwise, it will not take effect.
     */
    public void setReferUrlType(Long ReferUrlType) {
        this.ReferUrlType = ReferUrlType;
    }

    /**
     * Get Web page URL (or custom URL) . 
     * @return WebUrl Web page URL (or custom URL) .
     */
    public String getWebUrl() {
        return this.WebUrl;
    }

    /**
     * Set Web page URL (or custom URL) .
     * @param WebUrl Web page URL (or custom URL) .
     */
    public void setWebUrl(String WebUrl) {
        this.WebUrl = WebUrl;
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
     * Get Whether retries are allowed, 0: no, 1: yes. 
     * @return IsAllowRetry Whether retries are allowed, 0: no, 1: yes.
     */
    public Boolean getIsAllowRetry() {
        return this.IsAllowRetry;
    }

    /**
     * Set Whether retries are allowed, 0: no, 1: yes.
     * @param IsAllowRetry Whether retries are allowed, 0: no, 1: yes.
     */
    public void setIsAllowRetry(Boolean IsAllowRetry) {
        this.IsAllowRetry = IsAllowRetry;
    }

    /**
     * Get 0: document comparison processing; 1: Q&A generation from document. 
     * @return Processing 0: document comparison processing; 1: Q&A generation from document.
     */
    public Long [] getProcessing() {
        return this.Processing;
    }

    /**
     * Set 0: document comparison processing; 1: Q&A generation from document.
     * @param Processing 0: document comparison processing; 1: Q&A generation from document.
     */
    public void setProcessing(Long [] Processing) {
        this.Processing = Processing;
    }

    /**
     * Get Time when the document was created and stored into the database. 
     * @return CreateTime Time when the document was created and stored into the database.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Time when the document was created and stored into the database.
     * @param CreateTime Time when the document was created and stored into the database.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get ID of the document's category. 
     * @return CateBizId ID of the document's category.
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set ID of the document's category.
     * @param CateBizId ID of the document's category.
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get User-defined ID of the document. 
     * @return CustomerKnowledgeId User-defined ID of the document.
     */
    public String getCustomerKnowledgeId() {
        return this.CustomerKnowledgeId;
    }

    /**
     * Set User-defined ID of the document.
     * @param CustomerKnowledgeId User-defined ID of the document.
     */
    public void setCustomerKnowledgeId(String CustomerKnowledgeId) {
        this.CustomerKnowledgeId = CustomerKnowledgeId;
    }

    /**
     * Get Attribute label of the document. 0: Do not perform external user permission verification. 
     * @return AttributeFlags Attribute label of the document. 0: Do not perform external user permission verification.
     */
    public Long [] getAttributeFlags() {
        return this.AttributeFlags;
    }

    /**
     * Set Attribute label of the document. 0: Do not perform external user permission verification.
     * @param AttributeFlags Attribute label of the document. 0: Do not perform external user permission verification.
     */
    public void setAttributeFlags(Long [] AttributeFlags) {
        this.AttributeFlags = AttributeFlags;
    }

    public ListDocItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDocItem(ListDocItem source) {
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.NewName != null) {
            this.NewName = new String(source.NewName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
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
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.IsRefer != null) {
            this.IsRefer = new Boolean(source.IsRefer);
        }
        if (source.QaNum != null) {
            this.QaNum = new Long(source.QaNum);
        }
        if (source.IsDeleted != null) {
            this.IsDeleted = new Boolean(source.IsDeleted);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.IsAllowRestart != null) {
            this.IsAllowRestart = new Boolean(source.IsAllowRestart);
        }
        if (source.IsDeletedQa != null) {
            this.IsDeletedQa = new Boolean(source.IsDeletedQa);
        }
        if (source.IsCreatingQa != null) {
            this.IsCreatingQa = new Boolean(source.IsCreatingQa);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
        if (source.IsAllowRefer != null) {
            this.IsAllowRefer = new Boolean(source.IsAllowRefer);
        }
        if (source.IsCreatedQa != null) {
            this.IsCreatedQa = new Boolean(source.IsCreatedQa);
        }
        if (source.DocCharSize != null) {
            this.DocCharSize = new String(source.DocCharSize);
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
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.ReferUrlType != null) {
            this.ReferUrlType = new Long(source.ReferUrlType);
        }
        if (source.WebUrl != null) {
            this.WebUrl = new String(source.WebUrl);
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
        }
        if (source.IsAllowRetry != null) {
            this.IsAllowRetry = new Boolean(source.IsAllowRetry);
        }
        if (source.Processing != null) {
            this.Processing = new Long[source.Processing.length];
            for (int i = 0; i < source.Processing.length; i++) {
                this.Processing[i] = new Long(source.Processing[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.CustomerKnowledgeId != null) {
            this.CustomerKnowledgeId = new String(source.CustomerKnowledgeId);
        }
        if (source.AttributeFlags != null) {
            this.AttributeFlags = new Long[source.AttributeFlags.length];
            for (int i = 0; i < source.AttributeFlags.length; i++) {
                this.AttributeFlags[i] = new Long(source.AttributeFlags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "NewName", this.NewName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "IsRefer", this.IsRefer);
        this.setParamSimple(map, prefix + "QaNum", this.QaNum);
        this.setParamSimple(map, prefix + "IsDeleted", this.IsDeleted);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "IsAllowRestart", this.IsAllowRestart);
        this.setParamSimple(map, prefix + "IsDeletedQa", this.IsDeletedQa);
        this.setParamSimple(map, prefix + "IsCreatingQa", this.IsCreatingQa);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);
        this.setParamSimple(map, prefix + "IsAllowRefer", this.IsAllowRefer);
        this.setParamSimple(map, prefix + "IsCreatedQa", this.IsCreatedQa);
        this.setParamSimple(map, prefix + "DocCharSize", this.DocCharSize);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "ReferUrlType", this.ReferUrlType);
        this.setParamSimple(map, prefix + "WebUrl", this.WebUrl);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);
        this.setParamSimple(map, prefix + "IsAllowRetry", this.IsAllowRetry);
        this.setParamArraySimple(map, prefix + "Processing.", this.Processing);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "CustomerKnowledgeId", this.CustomerKnowledgeId);
        this.setParamArraySimple(map, prefix + "AttributeFlags.", this.AttributeFlags);

    }
}

