/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class IdlFileInfoWithoutContent extends AbstractModel {

    /**
    * Filename excluding extension
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Data interface description language (IDL) type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File extension
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * File size in bytes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * File ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * Error message
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * Get Filename excluding extension
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileName Filename excluding extension
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename excluding extension
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileName Filename excluding extension
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Data interface description language (IDL) type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileType Data interface description language (IDL) type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Data interface description language (IDL) type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileType Data interface description language (IDL) type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get File extension
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileExtType File extension
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * Set File extension
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileExtType File extension
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * Get File size in bytes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileSize File size in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileSize File size in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get File ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileId File ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileId File ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Error message
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Error Error message
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set Error message
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Error Error message
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    public IdlFileInfoWithoutContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdlFileInfoWithoutContent(IdlFileInfoWithoutContent source) {
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
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
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
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}

