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

public class EDRExportJobItem extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>Task name</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>Data source</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Export status.</p>
    */
    @SerializedName("ExportStatus")
    @Expose
    private String ExportStatus;

    /**
    * <p>Export progress</p>
    */
    @SerializedName("ExportProgress")
    @Expose
    private Long ExportProgress;

    /**
    * <p>Description of failure</p>
    */
    @SerializedName("FailureMsg")
    @Expose
    private String FailureMsg;

    /**
    * <p>Timeout period.</p>
    */
    @SerializedName("Timeout")
    @Expose
    private String Timeout;

    /**
    * <p>Insertion time.</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get <p>Task ID.</p> 
     * @return JobId <p>Task ID.</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param JobId <p>Task ID.</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>Task name</p> 
     * @return JobName <p>Task name</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>Task name</p>
     * @param JobName <p>Task name</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>Data source</p> 
     * @return Source <p>Data source</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Data source</p>
     * @param Source <p>Data source</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Export status.</p> 
     * @return ExportStatus <p>Export status.</p>
     */
    public String getExportStatus() {
        return this.ExportStatus;
    }

    /**
     * Set <p>Export status.</p>
     * @param ExportStatus <p>Export status.</p>
     */
    public void setExportStatus(String ExportStatus) {
        this.ExportStatus = ExportStatus;
    }

    /**
     * Get <p>Export progress</p> 
     * @return ExportProgress <p>Export progress</p>
     */
    public Long getExportProgress() {
        return this.ExportProgress;
    }

    /**
     * Set <p>Export progress</p>
     * @param ExportProgress <p>Export progress</p>
     */
    public void setExportProgress(Long ExportProgress) {
        this.ExportProgress = ExportProgress;
    }

    /**
     * Get <p>Description of failure</p> 
     * @return FailureMsg <p>Description of failure</p>
     */
    public String getFailureMsg() {
        return this.FailureMsg;
    }

    /**
     * Set <p>Description of failure</p>
     * @param FailureMsg <p>Description of failure</p>
     */
    public void setFailureMsg(String FailureMsg) {
        this.FailureMsg = FailureMsg;
    }

    /**
     * Get <p>Timeout period.</p> 
     * @return Timeout <p>Timeout period.</p>
     */
    public String getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Timeout period.</p>
     * @param Timeout <p>Timeout period.</p>
     */
    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Insertion time.</p> 
     * @return InsertTime <p>Insertion time.</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>Insertion time.</p>
     * @param InsertTime <p>Insertion time.</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public EDRExportJobItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRExportJobItem(EDRExportJobItem source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ExportStatus", this.ExportStatus);
        this.setParamSimple(map, prefix + "ExportProgress", this.ExportProgress);
        this.setParamSimple(map, prefix + "FailureMsg", this.FailureMsg);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

