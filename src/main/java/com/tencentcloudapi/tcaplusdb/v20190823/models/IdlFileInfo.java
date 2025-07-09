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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdlFileInfo extends AbstractModel {

    /**
    * Filename excluding extension
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Data interface description language (IDL) type
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File extension
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * File size in bytes
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * File ID, which is meaningful for files already uploaded
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * File content, which is meaningful for files to be uploaded in this request
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
     * Get Filename excluding extension 
     * @return FileName Filename excluding extension
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename excluding extension
     * @param FileName Filename excluding extension
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Data interface description language (IDL) type 
     * @return FileType Data interface description language (IDL) type
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Data interface description language (IDL) type
     * @param FileType Data interface description language (IDL) type
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get File extension 
     * @return FileExtType File extension
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * Set File extension
     * @param FileExtType File extension
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * Get File size in bytes 
     * @return FileSize File size in bytes
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size in bytes
     * @param FileSize File size in bytes
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get File ID, which is meaningful for files already uploaded
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileId File ID, which is meaningful for files already uploaded
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID, which is meaningful for files already uploaded
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileId File ID, which is meaningful for files already uploaded
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * Get File content, which is meaningful for files to be uploaded in this request
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileContent File content, which is meaningful for files to be uploaded in this request
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set File content, which is meaningful for files to be uploaded in this request
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileContent File content, which is meaningful for files to be uploaded in this request
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    public IdlFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdlFileInfo(IdlFileInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileExtType != null) {
            this.FileExtType = new String(source.FileExtType);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileId != null) {
            this.FileId = new Long(source.FileId);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileExtType", this.FileExtType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);

    }
}

