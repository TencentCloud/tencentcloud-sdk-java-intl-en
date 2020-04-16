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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlFileInfo extends AbstractModel{

    /**
    * Upload time
    */
    @SerializedName("UploadTime")
    @Expose
    private String UploadTime;

    /**
    * Upload progress
    */
    @SerializedName("UploadInfo")
    @Expose
    private UploadInfo UploadInfo;

    /**
    * Filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size in bytes
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Whether upload is finished. Valid values: 0 (not completed), 1 (completed)
    */
    @SerializedName("IsUploadFinished")
    @Expose
    private Long IsUploadFinished;

    /**
    * File ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get Upload time 
     * @return UploadTime Upload time
     */
    public String getUploadTime() {
        return this.UploadTime;
    }

    /**
     * Set Upload time
     * @param UploadTime Upload time
     */
    public void setUploadTime(String UploadTime) {
        this.UploadTime = UploadTime;
    }

    /**
     * Get Upload progress 
     * @return UploadInfo Upload progress
     */
    public UploadInfo getUploadInfo() {
        return this.UploadInfo;
    }

    /**
     * Set Upload progress
     * @param UploadInfo Upload progress
     */
    public void setUploadInfo(UploadInfo UploadInfo) {
        this.UploadInfo = UploadInfo;
    }

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
     * Get Whether upload is finished. Valid values: 0 (not completed), 1 (completed) 
     * @return IsUploadFinished Whether upload is finished. Valid values: 0 (not completed), 1 (completed)
     */
    public Long getIsUploadFinished() {
        return this.IsUploadFinished;
    }

    /**
     * Set Whether upload is finished. Valid values: 0 (not completed), 1 (completed)
     * @param IsUploadFinished Whether upload is finished. Valid values: 0 (not completed), 1 (completed)
     */
    public void setIsUploadFinished(Long IsUploadFinished) {
        this.IsUploadFinished = IsUploadFinished;
    }

    /**
     * Get File ID 
     * @return FileId File ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID
     * @param FileId File ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadTime", this.UploadTime);
        this.setParamObj(map, prefix + "UploadInfo.", this.UploadInfo);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "IsUploadFinished", this.IsUploadFinished);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

