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

public class MsgFileInfo extends AbstractModel {

    /**
    * Document name.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Document size.
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * Document URL.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Document type.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Document ID.
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
     * Get Document name. 
     * @return FileName Document name.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Document name.
     * @param FileName Document name.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Document size. 
     * @return FileSize Document size.
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Document size.
     * @param FileSize Document size.
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Document URL. 
     * @return FileUrl Document URL.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set Document URL.
     * @param FileUrl Document URL.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get Document type. 
     * @return FileType Document type.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Document type.
     * @param FileType Document type.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Document ID. 
     * @return DocId Document ID.
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set Document ID.
     * @param DocId Document ID.
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    public MsgFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgFileInfo(MsgFileInfo source) {
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

    }
}

