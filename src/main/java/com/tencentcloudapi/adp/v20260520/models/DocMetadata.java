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

public class DocMetadata extends AbstractModel {

    /**
    * <p>Number of characters in the document</p>
    */
    @SerializedName("DocCharCount")
    @Expose
    private String DocCharCount;

    /**
    * <p>File name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>File size (byte)</p>
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * <p>File type/extension</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>List of metadata reference field names (used to display which categories and properties of a document are set as metadata)</p>
    */
    @SerializedName("RefFieldNameList")
    @Expose
    private String [] RefFieldNameList;

    /**
    * <p>Source description.</p>
    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * <p>Document source type: 1=local upload, 2=webpage link, 3=COS integration, 4=import from external sources<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>Local upload</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>Webpage link</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS integration</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>Import from external sources</td></tr></tbody></table></p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get <p>Number of characters in the document</p> 
     * @return DocCharCount <p>Number of characters in the document</p>
     */
    public String getDocCharCount() {
        return this.DocCharCount;
    }

    /**
     * Set <p>Number of characters in the document</p>
     * @param DocCharCount <p>Number of characters in the document</p>
     */
    public void setDocCharCount(String DocCharCount) {
        this.DocCharCount = DocCharCount;
    }

    /**
     * Get <p>File name.</p> 
     * @return FileName <p>File name.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name.</p>
     * @param FileName <p>File name.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>File size (byte)</p> 
     * @return FileSize <p>File size (byte)</p>
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>File size (byte)</p>
     * @param FileSize <p>File size (byte)</p>
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>File type/extension</p> 
     * @return FileType <p>File type/extension</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>File type/extension</p>
     * @param FileType <p>File type/extension</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>List of metadata reference field names (used to display which categories and properties of a document are set as metadata)</p> 
     * @return RefFieldNameList <p>List of metadata reference field names (used to display which categories and properties of a document are set as metadata)</p>
     */
    public String [] getRefFieldNameList() {
        return this.RefFieldNameList;
    }

    /**
     * Set <p>List of metadata reference field names (used to display which categories and properties of a document are set as metadata)</p>
     * @param RefFieldNameList <p>List of metadata reference field names (used to display which categories and properties of a document are set as metadata)</p>
     */
    public void setRefFieldNameList(String [] RefFieldNameList) {
        this.RefFieldNameList = RefFieldNameList;
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
     * Get <p>Document source type: 1=local upload, 2=webpage link, 3=COS integration, 4=import from external sources<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>Local upload</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>Webpage link</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS integration</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>Import from external sources</td></tr></tbody></table></p> 
     * @return SourceType <p>Document source type: 1=local upload, 2=webpage link, 3=COS integration, 4=import from external sources<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>Local upload</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>Webpage link</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS integration</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>Import from external sources</td></tr></tbody></table></p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>Document source type: 1=local upload, 2=webpage link, 3=COS integration, 4=import from external sources<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>Local upload</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>Webpage link</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS integration</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>Import from external sources</td></tr></tbody></table></p>
     * @param SourceType <p>Document source type: 1=local upload, 2=webpage link, 3=COS integration, 4=import from external sources<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_SOURCE_TYPE_LOCAL</td><td>1</td><td>Local upload</td></tr><tr><td>DOC_SOURCE_TYPE_URL</td><td>2</td><td>Webpage link</td></tr><tr><td>DOC_SOURCE_TYPE_COS</td><td>3</td><td>COS integration</td></tr><tr><td>DOC_SOURCE_TYPE_IMPORT</td><td>4</td><td>Import from external sources</td></tr></tbody></table></p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    public DocMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocMetadata(DocMetadata source) {
        if (source.DocCharCount != null) {
            this.DocCharCount = new String(source.DocCharCount);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.RefFieldNameList != null) {
            this.RefFieldNameList = new String[source.RefFieldNameList.length];
            for (int i = 0; i < source.RefFieldNameList.length; i++) {
                this.RefFieldNameList[i] = new String(source.RefFieldNameList[i]);
            }
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
        this.setParamSimple(map, prefix + "DocCharCount", this.DocCharCount);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamArraySimple(map, prefix + "RefFieldNameList.", this.RefFieldNameList);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

