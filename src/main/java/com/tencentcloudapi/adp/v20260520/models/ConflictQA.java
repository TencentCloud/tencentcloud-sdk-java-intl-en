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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictQA extends AbstractModel {

    /**
    * <p>Answer</p>
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * <p>Knowledge application scope: 1=disabled, 2=development domain only, 3=release domain only, 4=global<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
    */
    @SerializedName("EffectiveDomain")
    @Expose
    private Long EffectiveDomain;

    /**
    * <p>Associated document name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>Associated document type</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>QA ID</p>
    */
    @SerializedName("QaId")
    @Expose
    private String QaId;

    /**
    * <p>Query</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>Source type: 1=documentation generation, 2=batch import, 3=manual entry<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>Documentation generation</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>Batch import</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>Manual entry</td></tr></tbody></table></p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>Update time (Unix seconds, for sorting old and new)</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Answer</p> 
     * @return Answer <p>Answer</p>
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set <p>Answer</p>
     * @param Answer <p>Answer</p>
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get <p>Knowledge application scope: 1=disabled, 2=development domain only, 3=release domain only, 4=global<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p> 
     * @return EffectiveDomain <p>Knowledge application scope: 1=disabled, 2=development domain only, 3=release domain only, 4=global<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public Long getEffectiveDomain() {
        return this.EffectiveDomain;
    }

    /**
     * Set <p>Knowledge application scope: 1=disabled, 2=development domain only, 3=release domain only, 4=global<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     * @param EffectiveDomain <p>Knowledge application scope: 1=disabled, 2=development domain only, 3=release domain only, 4=global<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public void setEffectiveDomain(Long EffectiveDomain) {
        this.EffectiveDomain = EffectiveDomain;
    }

    /**
     * Get <p>Associated document name.</p> 
     * @return FileName <p>Associated document name.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>Associated document name.</p>
     * @param FileName <p>Associated document name.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>Associated document type</p> 
     * @return FileType <p>Associated document type</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>Associated document type</p>
     * @param FileType <p>Associated document type</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>QA ID</p> 
     * @return QaId <p>QA ID</p>
     */
    public String getQaId() {
        return this.QaId;
    }

    /**
     * Set <p>QA ID</p>
     * @param QaId <p>QA ID</p>
     */
    public void setQaId(String QaId) {
        this.QaId = QaId;
    }

    /**
     * Get <p>Query</p> 
     * @return Question <p>Query</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>Query</p>
     * @param Question <p>Query</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>Source type: 1=documentation generation, 2=batch import, 3=manual entry<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>Documentation generation</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>Batch import</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>Manual entry</td></tr></tbody></table></p> 
     * @return SourceType <p>Source type: 1=documentation generation, 2=batch import, 3=manual entry<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>Documentation generation</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>Batch import</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>Manual entry</td></tr></tbody></table></p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>Source type: 1=documentation generation, 2=batch import, 3=manual entry<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>Documentation generation</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>Batch import</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>Manual entry</td></tr></tbody></table></p>
     * @param SourceType <p>Source type: 1=documentation generation, 2=batch import, 3=manual entry<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>Documentation generation</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>Batch import</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>Manual entry</td></tr></tbody></table></p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>Update time (Unix seconds, for sorting old and new)</p> 
     * @return UpdateTime <p>Update time (Unix seconds, for sorting old and new)</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time (Unix seconds, for sorting old and new)</p>
     * @param UpdateTime <p>Update time (Unix seconds, for sorting old and new)</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ConflictQA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConflictQA(ConflictQA source) {
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.EffectiveDomain != null) {
            this.EffectiveDomain = new Long(source.EffectiveDomain);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.QaId != null) {
            this.QaId = new String(source.QaId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "QaId", this.QaId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

