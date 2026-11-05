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

public class QASourceInfo extends AbstractModel {

    /**
    * <p>Application scope of the associated document<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
    */
    @SerializedName("DocEffectiveDomain")
    @Expose
    private Long DocEffectiveDomain;

    /**
    * <p>Associated document ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>Associated document name</p>
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
    * <p>Source description.</p>
    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * <p>Source type: 1=documentation generation, 2=batch import, 3=manual entry<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>QA_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>QA_SOURCE_TYPE_DOC</td><td>1</td><td>Documentation generation</td></tr><tr><td>QA_SOURCE_TYPE_BATCH_IMPORT</td><td>2</td><td>Batch import</td></tr><tr><td>QA_SOURCE_TYPE_MANUAL</td><td>3</td><td>Manual entry</td></tr></tbody></table></p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get <p>Application scope of the associated document<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p> 
     * @return DocEffectiveDomain <p>Application scope of the associated document<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public Long getDocEffectiveDomain() {
        return this.DocEffectiveDomain;
    }

    /**
     * Set <p>Application scope of the associated document<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     * @param DocEffectiveDomain <p>Application scope of the associated document<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public void setDocEffectiveDomain(Long DocEffectiveDomain) {
        this.DocEffectiveDomain = DocEffectiveDomain;
    }

    /**
     * Get <p>Associated document ID</p> 
     * @return DocId <p>Associated document ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>Associated document ID</p>
     * @param DocId <p>Associated document ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>Associated document name</p> 
     * @return FileName <p>Associated document name</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>Associated document name</p>
     * @param FileName <p>Associated document name</p>
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
     * Get <p>Source description.</p> 
     * @return SourceDesc <p>Source description.</p>
     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set <p>Source description.</p>
     * @param SourceDesc <p>Source description.</p>
     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
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

    public QASourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QASourceInfo(QASourceInfo source) {
        if (source.DocEffectiveDomain != null) {
            this.DocEffectiveDomain = new Long(source.DocEffectiveDomain);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocEffectiveDomain", this.DocEffectiveDomain);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

