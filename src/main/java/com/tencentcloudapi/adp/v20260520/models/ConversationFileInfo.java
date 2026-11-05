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

public class ConversationFileInfo extends AbstractModel {

    /**
    * <p>File creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Document business ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>File name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>File size</p>
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * <p>File type</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>File download link.</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>Original path of the file in the sandbox</p>
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * <p>File moderation status</p><p>Enumeration values:</p><ul><li>1: under review</li><li>2: pass review</li><li>3: fail review</li></ul>
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
     * Get <p>File creation time.</p> 
     * @return CreateTime <p>File creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>File creation time.</p>
     * @param CreateTime <p>File creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Document business ID</p> 
     * @return DocId <p>Document business ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>Document business ID</p>
     * @param DocId <p>Document business ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
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
     * Get <p>File size</p> 
     * @return FileSize <p>File size</p>
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>File size</p>
     * @param FileSize <p>File size</p>
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>File type</p> 
     * @return FileType <p>File type</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>File type</p>
     * @param FileType <p>File type</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>File download link.</p> 
     * @return FileUrl <p>File download link.</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>File download link.</p>
     * @param FileUrl <p>File download link.</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>Original path of the file in the sandbox</p> 
     * @return LocalPath <p>Original path of the file in the sandbox</p>
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set <p>Original path of the file in the sandbox</p>
     * @param LocalPath <p>Original path of the file in the sandbox</p>
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get <p>File moderation status</p><p>Enumeration values:</p><ul><li>1: under review</li><li>2: pass review</li><li>3: fail review</li></ul> 
     * @return AuditStatus <p>File moderation status</p><p>Enumeration values:</p><ul><li>1: under review</li><li>2: pass review</li><li>3: fail review</li></ul>
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set <p>File moderation status</p><p>Enumeration values:</p><ul><li>1: under review</li><li>2: pass review</li><li>3: fail review</li></ul>
     * @param AuditStatus <p>File moderation status</p><p>Enumeration values:</p><ul><li>1: under review</li><li>2: pass review</li><li>3: fail review</li></ul>
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    public ConversationFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationFileInfo(ConversationFileInfo source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
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
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);

    }
}

