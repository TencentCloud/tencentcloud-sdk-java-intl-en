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

public class QASummary extends AbstractModel {

    /**
    * <p>Category path (including category ID, category ID path from the root node, and category name path)</p>
    */
    @SerializedName("CategoryPath")
    @Expose
    private CategoryPath CategoryPath;

    /**
    * <p>Knowledge effective scope</p>
    */
    @SerializedName("KnowledgeScope")
    @Expose
    private KnowledgeScope KnowledgeScope;

    /**
    * <p>Lifecycle information.</p>
    */
    @SerializedName("Lifecycle")
    @Expose
    private QALifecycle Lifecycle;

    /**
    * <p>Meta information (question/answer/size statistics)</p>
    */
    @SerializedName("Metadata")
    @Expose
    private QAMetadata Metadata;

    /**
    * <p>Operator information.</p>
    */
    @SerializedName("OperatorInfo")
    @Expose
    private QAOperator OperatorInfo;

    /**
    * <p>QA ID</p>
    */
    @SerializedName("QaId")
    @Expose
    private String QaId;

    /**
    * <p>Similar question statistics</p>
    */
    @SerializedName("SimilarQuestion")
    @Expose
    private SimilarQuestionStat SimilarQuestion;

    /**
    * <p>Source information.</p>
    */
    @SerializedName("SourceInfo")
    @Expose
    private QASourceInfo SourceInfo;

    /**
     * Get <p>Category path (including category ID, category ID path from the root node, and category name path)</p> 
     * @return CategoryPath <p>Category path (including category ID, category ID path from the root node, and category name path)</p>
     */
    public CategoryPath getCategoryPath() {
        return this.CategoryPath;
    }

    /**
     * Set <p>Category path (including category ID, category ID path from the root node, and category name path)</p>
     * @param CategoryPath <p>Category path (including category ID, category ID path from the root node, and category name path)</p>
     */
    public void setCategoryPath(CategoryPath CategoryPath) {
        this.CategoryPath = CategoryPath;
    }

    /**
     * Get <p>Knowledge effective scope</p> 
     * @return KnowledgeScope <p>Knowledge effective scope</p>
     */
    public KnowledgeScope getKnowledgeScope() {
        return this.KnowledgeScope;
    }

    /**
     * Set <p>Knowledge effective scope</p>
     * @param KnowledgeScope <p>Knowledge effective scope</p>
     */
    public void setKnowledgeScope(KnowledgeScope KnowledgeScope) {
        this.KnowledgeScope = KnowledgeScope;
    }

    /**
     * Get <p>Lifecycle information.</p> 
     * @return Lifecycle <p>Lifecycle information.</p>
     */
    public QALifecycle getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set <p>Lifecycle information.</p>
     * @param Lifecycle <p>Lifecycle information.</p>
     */
    public void setLifecycle(QALifecycle Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get <p>Meta information (question/answer/size statistics)</p> 
     * @return Metadata <p>Meta information (question/answer/size statistics)</p>
     */
    public QAMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>Meta information (question/answer/size statistics)</p>
     * @param Metadata <p>Meta information (question/answer/size statistics)</p>
     */
    public void setMetadata(QAMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>Operator information.</p> 
     * @return OperatorInfo <p>Operator information.</p>
     */
    public QAOperator getOperatorInfo() {
        return this.OperatorInfo;
    }

    /**
     * Set <p>Operator information.</p>
     * @param OperatorInfo <p>Operator information.</p>
     */
    public void setOperatorInfo(QAOperator OperatorInfo) {
        this.OperatorInfo = OperatorInfo;
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
     * Get <p>Similar question statistics</p> 
     * @return SimilarQuestion <p>Similar question statistics</p>
     */
    public SimilarQuestionStat getSimilarQuestion() {
        return this.SimilarQuestion;
    }

    /**
     * Set <p>Similar question statistics</p>
     * @param SimilarQuestion <p>Similar question statistics</p>
     */
    public void setSimilarQuestion(SimilarQuestionStat SimilarQuestion) {
        this.SimilarQuestion = SimilarQuestion;
    }

    /**
     * Get <p>Source information.</p> 
     * @return SourceInfo <p>Source information.</p>
     */
    public QASourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>Source information.</p>
     * @param SourceInfo <p>Source information.</p>
     */
    public void setSourceInfo(QASourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public QASummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QASummary(QASummary source) {
        if (source.CategoryPath != null) {
            this.CategoryPath = new CategoryPath(source.CategoryPath);
        }
        if (source.KnowledgeScope != null) {
            this.KnowledgeScope = new KnowledgeScope(source.KnowledgeScope);
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new QALifecycle(source.Lifecycle);
        }
        if (source.Metadata != null) {
            this.Metadata = new QAMetadata(source.Metadata);
        }
        if (source.OperatorInfo != null) {
            this.OperatorInfo = new QAOperator(source.OperatorInfo);
        }
        if (source.QaId != null) {
            this.QaId = new String(source.QaId);
        }
        if (source.SimilarQuestion != null) {
            this.SimilarQuestion = new SimilarQuestionStat(source.SimilarQuestion);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new QASourceInfo(source.SourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CategoryPath.", this.CategoryPath);
        this.setParamObj(map, prefix + "KnowledgeScope.", this.KnowledgeScope);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "OperatorInfo.", this.OperatorInfo);
        this.setParamSimple(map, prefix + "QaId", this.QaId);
        this.setParamObj(map, prefix + "SimilarQuestion.", this.SimilarQuestion);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

