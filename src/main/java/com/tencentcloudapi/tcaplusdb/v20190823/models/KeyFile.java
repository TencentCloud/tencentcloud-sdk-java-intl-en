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

public class KeyFile extends AbstractModel {

    /**
    * Key file name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Key file extension
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * Key file content
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * Key file size
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
     * Get Key file name 
     * @return FileName Key file name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Key file name
     * @param FileName Key file name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Key file extension 
     * @return FileExtType Key file extension
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * Set Key file extension
     * @param FileExtType Key file extension
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * Get Key file content 
     * @return FileContent Key file content
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set Key file content
     * @param FileContent Key file content
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get Key file size 
     * @return FileSize Key file size
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Key file size
     * @param FileSize Key file size
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    public KeyFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyFile(KeyFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileExtType != null) {
            this.FileExtType = new String(source.FileExtType);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileExtType", this.FileExtType);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

