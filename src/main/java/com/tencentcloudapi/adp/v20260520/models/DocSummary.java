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

public class DocSummary extends AbstractModel {

    /**
    * <p>Category path (including category ID, category ID path from the root node, and category name path)</p>
    */
    @SerializedName("CategoryPath")
    @Expose
    private CategoryPath CategoryPath;

    /**
    * <p>Document ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>Knowledge effective scope (aggregate application scope + tag condition)</p>
    */
    @SerializedName("KnowledgeScope")
    @Expose
    private KnowledgeScope KnowledgeScope;

    /**
    * <p>Lifecycle information.</p>
    */
    @SerializedName("Lifecycle")
    @Expose
    private DocLifecycle Lifecycle;

    /**
    * <p>Meta information.</p>
    */
    @SerializedName("Metadata")
    @Expose
    private DocMetadata Metadata;

    /**
    * <p>Operator information (aggregate modifier + operation permission)</p>
    */
    @SerializedName("OperatorInfo")
    @Expose
    private DocOperator OperatorInfo;

    /**
    * <p>Task status information</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private DocTaskStatus TaskStatus;

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
     * Get <p>Document ID</p> 
     * @return DocId <p>Document ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>Document ID</p>
     * @param DocId <p>Document ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>Knowledge effective scope (aggregate application scope + tag condition)</p> 
     * @return KnowledgeScope <p>Knowledge effective scope (aggregate application scope + tag condition)</p>
     */
    public KnowledgeScope getKnowledgeScope() {
        return this.KnowledgeScope;
    }

    /**
     * Set <p>Knowledge effective scope (aggregate application scope + tag condition)</p>
     * @param KnowledgeScope <p>Knowledge effective scope (aggregate application scope + tag condition)</p>
     */
    public void setKnowledgeScope(KnowledgeScope KnowledgeScope) {
        this.KnowledgeScope = KnowledgeScope;
    }

    /**
     * Get <p>Lifecycle information.</p> 
     * @return Lifecycle <p>Lifecycle information.</p>
     */
    public DocLifecycle getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set <p>Lifecycle information.</p>
     * @param Lifecycle <p>Lifecycle information.</p>
     */
    public void setLifecycle(DocLifecycle Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get <p>Meta information.</p> 
     * @return Metadata <p>Meta information.</p>
     */
    public DocMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>Meta information.</p>
     * @param Metadata <p>Meta information.</p>
     */
    public void setMetadata(DocMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>Operator information (aggregate modifier + operation permission)</p> 
     * @return OperatorInfo <p>Operator information (aggregate modifier + operation permission)</p>
     */
    public DocOperator getOperatorInfo() {
        return this.OperatorInfo;
    }

    /**
     * Set <p>Operator information (aggregate modifier + operation permission)</p>
     * @param OperatorInfo <p>Operator information (aggregate modifier + operation permission)</p>
     */
    public void setOperatorInfo(DocOperator OperatorInfo) {
        this.OperatorInfo = OperatorInfo;
    }

    /**
     * Get <p>Task status information</p> 
     * @return TaskStatus <p>Task status information</p>
     */
    public DocTaskStatus getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Task status information</p>
     * @param TaskStatus <p>Task status information</p>
     */
    public void setTaskStatus(DocTaskStatus TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public DocSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocSummary(DocSummary source) {
        if (source.CategoryPath != null) {
            this.CategoryPath = new CategoryPath(source.CategoryPath);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.KnowledgeScope != null) {
            this.KnowledgeScope = new KnowledgeScope(source.KnowledgeScope);
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new DocLifecycle(source.Lifecycle);
        }
        if (source.Metadata != null) {
            this.Metadata = new DocMetadata(source.Metadata);
        }
        if (source.OperatorInfo != null) {
            this.OperatorInfo = new DocOperator(source.OperatorInfo);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new DocTaskStatus(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CategoryPath.", this.CategoryPath);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamObj(map, prefix + "KnowledgeScope.", this.KnowledgeScope);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "OperatorInfo.", this.OperatorInfo);
        this.setParamObj(map, prefix + "TaskStatus.", this.TaskStatus);

    }
}

