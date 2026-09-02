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

public class ScanTaskRecordItem extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * <p>Task status.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Task progress</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>Consumed quota.</p>
    */
    @SerializedName("CostQuota")
    @Expose
    private Long CostQuota;

    /**
    * <p>Task creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Task end time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Task source</p>
    */
    @SerializedName("TaskSource")
    @Expose
    private String TaskSource;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskID <p>Task ID.</p>
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskID <p>Task ID.</p>
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get <p>Task status.</p> 
     * @return Status <p>Task status.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status.</p>
     * @param Status <p>Task status.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Task progress</p> 
     * @return Progress <p>Task progress</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Task progress</p>
     * @param Progress <p>Task progress</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Consumed quota.</p> 
     * @return CostQuota <p>Consumed quota.</p>
     */
    public Long getCostQuota() {
        return this.CostQuota;
    }

    /**
     * Set <p>Consumed quota.</p>
     * @param CostQuota <p>Consumed quota.</p>
     */
    public void setCostQuota(Long CostQuota) {
        this.CostQuota = CostQuota;
    }

    /**
     * Get <p>Task creation time</p> 
     * @return CreateTime <p>Task creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Task creation time</p>
     * @param CreateTime <p>Task creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Task end time.</p> 
     * @return EndTime <p>Task end time.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Task end time.</p>
     * @param EndTime <p>Task end time.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Task source</p> 
     * @return TaskSource <p>Task source</p>
     */
    public String getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set <p>Task source</p>
     * @param TaskSource <p>Task source</p>
     */
    public void setTaskSource(String TaskSource) {
        this.TaskSource = TaskSource;
    }

    public ScanTaskRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskRecordItem(ScanTaskRecordItem source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CostQuota != null) {
            this.CostQuota = new Long(source.CostQuota);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskSource != null) {
            this.TaskSource = new String(source.TaskSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CostQuota", this.CostQuota);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);

    }
}

