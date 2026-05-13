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

public class FileInfoContent extends AbstractModel {

    /**
    * 
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get  
     * @return DocBizId 
     * @deprecated
     */
    @Deprecated
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 
     * @param DocBizId 
     * @deprecated
     */
    @Deprecated
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get  
     * @return FileName 
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 
     * @param FileName 
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get  
     * @return FileType 
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 
     * @param FileType 
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get  
     * @return FileSize 
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 
     * @param FileSize 
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get  
     * @return FileUrl 
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 
     * @param FileUrl 
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get  
     * @return DocId 
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set 
     * @param DocId 
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public FileInfoContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfoContent(FileInfoContent source) {
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

