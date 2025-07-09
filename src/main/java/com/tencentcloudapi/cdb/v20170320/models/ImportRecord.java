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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportRecord extends AbstractModel {

    /**
    * Status value
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Status value
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Execution duration
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backend task ID
    */
    @SerializedName("WorkId")
    @Expose
    private String WorkId;

    /**
    * Name of the file to be imported
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Execution progress
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * Task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * File size
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * Task execution information
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Task ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * Name of the table to be imported
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Async task request ID
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;

    /**
     * Get Status value 
     * @return Status Status value
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value
     * @param Status Status value
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Status value 
     * @return Code Status value
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Status value
     * @param Code Status value
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Execution duration 
     * @return CostTime Execution duration
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Execution duration
     * @param CostTime Execution duration
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backend task ID 
     * @return WorkId Backend task ID
     */
    public String getWorkId() {
        return this.WorkId;
    }

    /**
     * Set Backend task ID
     * @param WorkId Backend task ID
     */
    public void setWorkId(String WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get Name of the file to be imported 
     * @return FileName Name of the file to be imported
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Name of the file to be imported
     * @param FileName Name of the file to be imported
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Execution progress 
     * @return Process Execution progress
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set Execution progress
     * @param Process Execution progress
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get Task creation time 
     * @return CreateTime Task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
     * @param CreateTime Task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get File size 
     * @return FileSize File size
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size
     * @param FileSize File size
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Task execution information 
     * @return Message Task execution information
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Task execution information
     * @param Message Task execution information
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Task ID 
     * @return JobId Task ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID
     * @param JobId Task ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Name of the table to be imported 
     * @return DbName Name of the table to be imported
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Name of the table to be imported
     * @param DbName Name of the table to be imported
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Async task request ID 
     * @return AsyncRequestId Async task request ID
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set Async task request ID
     * @param AsyncRequestId Async task request ID
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    public ImportRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportRecord(ImportRecord source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.WorkId != null) {
            this.WorkId = new String(source.WorkId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Process != null) {
            this.Process = new Long(source.Process);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new String(source.AsyncRequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);

    }
}

