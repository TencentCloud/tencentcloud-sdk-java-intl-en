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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfo extends AbstractModel {

    /**
    * File name.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size.
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * URL of the file, address of COS.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * File type.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * DocID returned after parsing.
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * Creation time.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get File name. 
     * @return FileName File name.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name.
     * @param FileName File name.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size. 
     * @return FileSize File size.
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size.
     * @param FileSize File size.
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get URL of the file, address of COS. 
     * @return FileUrl URL of the file, address of COS.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set URL of the file, address of COS.
     * @param FileUrl URL of the file, address of COS.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get File type. 
     * @return FileType File type.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type.
     * @param FileType File type.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get DocID returned after parsing. 
     * @return DocId DocID returned after parsing.
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set DocID returned after parsing.
     * @param DocId DocID returned after parsing.
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get Creation time. 
     * @return CreatedAt Creation time.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.
     * @param CreatedAt Creation time.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

