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

public class ExportJobInfo extends AbstractModel {

    /**
    * Job ID
    */
    @SerializedName("JobID")
    @Expose
    private String JobID;

    /**
    * Job name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Source
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Export status
    */
    @SerializedName("ExportStatus")
    @Expose
    private String ExportStatus;

    /**
    * Export progress
    */
    @SerializedName("ExportProgress")
    @Expose
    private Long ExportProgress;

    /**
    * Reason for failure
    */
    @SerializedName("FailureMsg")
    @Expose
    private String FailureMsg;

    /**
    * Timeout threshold
    */
    @SerializedName("Timeout")
    @Expose
    private String Timeout;

    /**
    * Insertion time
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get Job ID 
     * @return JobID Job ID
     */
    public String getJobID() {
        return this.JobID;
    }

    /**
     * Set Job ID
     * @param JobID Job ID
     */
    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    /**
     * Get Job name 
     * @return JobName Job name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Job name
     * @param JobName Job name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Source 
     * @return Source Source
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source
     * @param Source Source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Export status 
     * @return ExportStatus Export status
     */
    public String getExportStatus() {
        return this.ExportStatus;
    }

    /**
     * Set Export status
     * @param ExportStatus Export status
     */
    public void setExportStatus(String ExportStatus) {
        this.ExportStatus = ExportStatus;
    }

    /**
     * Get Export progress 
     * @return ExportProgress Export progress
     */
    public Long getExportProgress() {
        return this.ExportProgress;
    }

    /**
     * Set Export progress
     * @param ExportProgress Export progress
     */
    public void setExportProgress(Long ExportProgress) {
        this.ExportProgress = ExportProgress;
    }

    /**
     * Get Reason for failure 
     * @return FailureMsg Reason for failure
     */
    public String getFailureMsg() {
        return this.FailureMsg;
    }

    /**
     * Set Reason for failure
     * @param FailureMsg Reason for failure
     */
    public void setFailureMsg(String FailureMsg) {
        this.FailureMsg = FailureMsg;
    }

    /**
     * Get Timeout threshold 
     * @return Timeout Timeout threshold
     */
    public String getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout threshold
     * @param Timeout Timeout threshold
     */
    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Insertion time 
     * @return InsertTime Insertion time
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set Insertion time
     * @param InsertTime Insertion time
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public ExportJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportJobInfo(ExportJobInfo source) {
        if (source.JobID != null) {
            this.JobID = new String(source.JobID);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ExportStatus != null) {
            this.ExportStatus = new String(source.ExportStatus);
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
        this.setParamSimple(map, prefix + "ExportStatus", this.ExportStatus);
        this.setParamSimple(map, prefix + "ExportProgress", this.ExportProgress);
        this.setParamSimple(map, prefix + "FailureMsg", this.FailureMsg);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

