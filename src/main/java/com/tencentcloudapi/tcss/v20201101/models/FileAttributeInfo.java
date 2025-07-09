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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileAttributeInfo extends AbstractModel {

    /**
    * Filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File type
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File size in bytes
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * File path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * File creation time
    */
    @SerializedName("FileCreateTime")
    @Expose
    private String FileCreateTime;

    /**
    * Time when the file is last tampered with
    */
    @SerializedName("LatestTamperedFileMTime")
    @Expose
    private String LatestTamperedFileMTime;

    /**
    * Content of the new file
    */
    @SerializedName("NewFile")
    @Expose
    private String NewFile;

    /**
    * Differences between old and new files
    */
    @SerializedName("FileDiff")
    @Expose
    private String FileDiff;

    /**
     * Get Filename 
     * @return FileName Filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename
     * @param FileName Filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File type 
     * @return FileType File type
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type
     * @param FileType File type
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
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
     * Get File path 
     * @return FilePath File path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path
     * @param FilePath File path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get File creation time 
     * @return FileCreateTime File creation time
     */
    public String getFileCreateTime() {
        return this.FileCreateTime;
    }

    /**
     * Set File creation time
     * @param FileCreateTime File creation time
     */
    public void setFileCreateTime(String FileCreateTime) {
        this.FileCreateTime = FileCreateTime;
    }

    /**
     * Get Time when the file is last tampered with 
     * @return LatestTamperedFileMTime Time when the file is last tampered with
     */
    public String getLatestTamperedFileMTime() {
        return this.LatestTamperedFileMTime;
    }

    /**
     * Set Time when the file is last tampered with
     * @param LatestTamperedFileMTime Time when the file is last tampered with
     */
    public void setLatestTamperedFileMTime(String LatestTamperedFileMTime) {
        this.LatestTamperedFileMTime = LatestTamperedFileMTime;
    }

    /**
     * Get Content of the new file 
     * @return NewFile Content of the new file
     */
    public String getNewFile() {
        return this.NewFile;
    }

    /**
     * Set Content of the new file
     * @param NewFile Content of the new file
     */
    public void setNewFile(String NewFile) {
        this.NewFile = NewFile;
    }

    /**
     * Get Differences between old and new files 
     * @return FileDiff Differences between old and new files
     */
    public String getFileDiff() {
        return this.FileDiff;
    }

    /**
     * Set Differences between old and new files
     * @param FileDiff Differences between old and new files
     */
    public void setFileDiff(String FileDiff) {
        this.FileDiff = FileDiff;
    }

    public FileAttributeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileAttributeInfo(FileAttributeInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileCreateTime != null) {
            this.FileCreateTime = new String(source.FileCreateTime);
        }
        if (source.LatestTamperedFileMTime != null) {
            this.LatestTamperedFileMTime = new String(source.LatestTamperedFileMTime);
        }
        if (source.NewFile != null) {
            this.NewFile = new String(source.NewFile);
        }
        if (source.FileDiff != null) {
            this.FileDiff = new String(source.FileDiff);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileCreateTime", this.FileCreateTime);
        this.setParamSimple(map, prefix + "LatestTamperedFileMTime", this.LatestTamperedFileMTime);
        this.setParamSimple(map, prefix + "NewFile", this.NewFile);
        this.setParamSimple(map, prefix + "FileDiff", this.FileDiff);

    }
}

