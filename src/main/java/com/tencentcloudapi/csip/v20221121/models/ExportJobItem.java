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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportJobItem extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("JobID")
    @Expose
    private String JobID;

    /**
    * Task name.
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Task source.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Task status.
    */
    @SerializedName("ExportJobStatus")
    @Expose
    private String ExportJobStatus;

    /**
    * Task progress
    */
    @SerializedName("ExportProgress")
    @Expose
    private Long ExportProgress;

    /**
    * Error message
    */
    @SerializedName("FailureMsg")
    @Expose
    private String FailureMsg;

    /**
    * Task Timeout Duration
    */
    @SerializedName("Timeout")
    @Expose
    private String Timeout;

    /**
    * Task creation time
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get Task ID. 
     * @return JobID Task ID.
     */
    public String getJobID() {
        return this.JobID;
    }

    /**
     * Set Task ID.
     * @param JobID Task ID.
     */
    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    /**
     * Get Task name. 
     * @return JobName Task name.
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Task name.
     * @param JobName Task name.
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Task source. 
     * @return Source Task source.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Task source.
     * @param Source Task source.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Task status. 
     * @return ExportJobStatus Task status.
     */
    public String getExportJobStatus() {
        return this.ExportJobStatus;
    }

    /**
     * Set Task status.
     * @param ExportJobStatus Task status.
     */
    public void setExportJobStatus(String ExportJobStatus) {
        this.ExportJobStatus = ExportJobStatus;
    }

    /**
     * Get Task progress 
     * @return ExportProgress Task progress
     */
    public Long getExportProgress() {
        return this.ExportProgress;
    }

    /**
     * Set Task progress
     * @param ExportProgress Task progress
     */
    public void setExportProgress(Long ExportProgress) {
        this.ExportProgress = ExportProgress;
    }

    /**
     * Get Error message 
     * @return FailureMsg Error message
     */
    public String getFailureMsg() {
        return this.FailureMsg;
    }

    /**
     * Set Error message
     * @param FailureMsg Error message
     */
    public void setFailureMsg(String FailureMsg) {
        this.FailureMsg = FailureMsg;
    }

    /**
     * Get Task Timeout Duration 
     * @return Timeout Task Timeout Duration
     */
    public String getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Task Timeout Duration
     * @param Timeout Task Timeout Duration
     */
    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Task creation time 
     * @return InsertTime Task creation time
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Task creation time
     * @param InsertTime Task creation time
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public ExportJobItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportJobItem(ExportJobItem source) {
        if (source.JobID != null) {
            this.JobID = new String(source.JobID);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ExportJobStatus != null) {
            this.ExportJobStatus = new String(source.ExportJobStatus);
        }
        if (source.ExportProgress != null) {
            this.ExportProgress = new Long(source.ExportProgress);
        }
        if (source.FailureMsg != null) {
            this.FailureMsg = new String(source.FailureMsg);
        }
        if (source.Timeout != null) {
            this.Timeout = new String(source.Timeout);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobID", this.JobID);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ExportJobStatus", this.ExportJobStatus);
        this.setParamSimple(map, prefix + "ExportProgress", this.ExportProgress);
        this.setParamSimple(map, prefix + "FailureMsg", this.FailureMsg);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

