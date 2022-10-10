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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BusinessIntelligenceFile extends AbstractModel{

    /**
    * File name
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
    * File COS_URL
    */
    @SerializedName("FileURL")
    @Expose
    private String FileURL;

    /**
    * The file path on the server
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * File size in bytes
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * File MD5 value
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * File deployment status. Valid values: `1`(Initialize to be deployed), `2` (Deploying), `3` (Deployment successful), `4` (Deployment failed).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * File creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Start time of file deployment
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of file deployment
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Returned error message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Business intelligence instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Operation information
    */
    @SerializedName("Action")
    @Expose
    private FileAction Action;

    /**
     * Get File name 
     * @return FileName File name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name
     * @param FileName File name
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
     * Get File COS_URL 
     * @return FileURL File COS_URL
     */
    public String getFileURL() {
        return this.FileURL;
    }

    /**
     * Set File COS_URL
     * @param FileURL File COS_URL
     */
    public void setFileURL(String FileURL) {
        this.FileURL = FileURL;
    }

    /**
     * Get The file path on the server 
     * @return FilePath The file path on the server
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set The file path on the server
     * @param FilePath The file path on the server
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
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
     * Get File MD5 value 
     * @return FileMd5 File MD5 value
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set File MD5 value
     * @param FileMd5 File MD5 value
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get File deployment status. Valid values: `1`(Initialize to be deployed), `2` (Deploying), `3` (Deployment successful), `4` (Deployment failed). 
     * @return Status File deployment status. Valid values: `1`(Initialize to be deployed), `2` (Deploying), `3` (Deployment successful), `4` (Deployment failed).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set File deployment status. Valid values: `1`(Initialize to be deployed), `2` (Deploying), `3` (Deployment successful), `4` (Deployment failed).
     * @param Status File deployment status. Valid values: `1`(Initialize to be deployed), `2` (Deploying), `3` (Deployment successful), `4` (Deployment failed).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get File creation time 
     * @return CreateTime File creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set File creation time
     * @param CreateTime File creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Start time of file deployment 
     * @return StartTime Start time of file deployment
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of file deployment
     * @param StartTime Start time of file deployment
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of file deployment 
     * @return EndTime End time of file deployment
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of file deployment
     * @param EndTime End time of file deployment
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Returned error message 
     * @return Message Returned error message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Returned error message
     * @param Message Returned error message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Business intelligence instance ID 
     * @return InstanceId Business intelligence instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business intelligence instance ID
     * @param InstanceId Business intelligence instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Operation information 
     * @return Action Operation information
     */
    public FileAction getAction() {
        return this.Action;
    }

    /**
     * Set Operation information
     * @param Action Operation information
     */
    public void setAction(FileAction Action) {
        this.Action = Action;
    }

    public BusinessIntelligenceFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessIntelligenceFile(BusinessIntelligenceFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileURL != null) {
            this.FileURL = new String(source.FileURL);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Action != null) {
            this.Action = new FileAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileURL", this.FileURL);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

