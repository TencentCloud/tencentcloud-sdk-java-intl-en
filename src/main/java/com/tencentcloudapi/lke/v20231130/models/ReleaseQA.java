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

public class ReleaseQA extends AbstractModel {

    /**
    * Question.
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Status.
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * Status description.
    */
    @SerializedName("ActionDesc")
    @Expose
    private String ActionDesc;

    /**
    * Source, 1: documentation generation; 2: batch import; 3: manual addition.
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
    * Filename.
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
    * Reason for failure
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Release status.
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Long ReleaseStatus;

    /**
    * Q&A ID.
    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * Document business ID.
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

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
     * @return Action Status.
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set Status.
     * @param Action Status.
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get Status description. 
     * @return ActionDesc Status description.
     */
    public String getActionDesc() {
        return this.ActionDesc;
    }

    /**
     * Set Status description.
     * @param ActionDesc Status description.
     */
    public void setActionDesc(String ActionDesc) {
        this.ActionDesc = ActionDesc;
    }

    /**
     * Get Source, 1: documentation generation; 2: batch import; 3: manual addition. 
     * @return Source Source, 1: documentation generation; 2: batch import; 3: manual addition.
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set Source, 1: documentation generation; 2: batch import; 3: manual addition.
     * @param Source Source, 1: documentation generation; 2: batch import; 3: manual addition.
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
     * Get Filename. 
     * @return FileName Filename.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename.
     * @param FileName Filename.
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
     * Get Reason for failure 
     * @return Message Reason for failure
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Reason for failure
     * @param Message Reason for failure
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Release status. 
     * @return ReleaseStatus Release status.
     */
    public Long getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set Release status.
     * @param ReleaseStatus Release status.
     */
    public void setReleaseStatus(Long ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

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
     * Get Document business ID. 
     * @return DocBizId Document business ID.
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set Document business ID.
     * @param DocBizId Document business ID.
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    public ReleaseQA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseQA(ReleaseQA source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.ActionDesc != null) {
            this.ActionDesc = new String(source.ActionDesc);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Long(source.ReleaseStatus);
        }
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionDesc", this.ActionDesc);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ReleaseStatus", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);

    }
}

