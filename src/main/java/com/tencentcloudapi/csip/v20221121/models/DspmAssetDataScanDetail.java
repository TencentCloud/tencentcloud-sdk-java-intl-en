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

public class DspmAssetDataScanDetail extends AbstractModel {

    /**
    * <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Identification task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
    */
    @SerializedName("StatusInfo")
    @Expose
    private String StatusInfo;

    /**
    * <p>Recognition progress</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>Last scan time.</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>Recognition failure message</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * <p>Number of databases</p>
    */
    @SerializedName("DbCount")
    @Expose
    private Long DbCount;

    /**
    * <p>Category id set</p>
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * <p>Category name collection.</p>
    */
    @SerializedName("CategoryNames")
    @Expose
    private String [] CategoryNames;

    /**
    * <p>Scan task configuration</p>
    */
    @SerializedName("TaskConfig")
    @Expose
    private DspmSensitiveScanTaskConfig TaskConfig;

    /**
    * <p>Categorization details of recognition results</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private DspmIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p> 
     * @return Status <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     * @param Status <p>Recognition task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Identification task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p> 
     * @return StatusInfo <p>Identification task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     */
    public String getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set <p>Identification task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     * @param StatusInfo <p>Identification task status. 0: unrecognized; 1: in process; 2: terminated; 3: successful; 4: failed.</p>
     */
    public void setStatusInfo(String StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get <p>Recognition progress</p> 
     * @return Progress <p>Recognition progress</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Recognition progress</p>
     * @param Progress <p>Recognition progress</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Last scan time.</p> 
     * @return LatestScanTime <p>Last scan time.</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>Last scan time.</p>
     * @param LatestScanTime <p>Last scan time.</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>Recognition failure message</p> 
     * @return ErrorInfo <p>Recognition failure message</p>
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>Recognition failure message</p>
     * @param ErrorInfo <p>Recognition failure message</p>
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>Number of databases</p> 
     * @return DbCount <p>Number of databases</p>
     */
    public Long getDbCount() {
        return this.DbCount;
    }

    /**
     * Set <p>Number of databases</p>
     * @param DbCount <p>Number of databases</p>
     */
    public void setDbCount(Long DbCount) {
        this.DbCount = DbCount;
    }

    /**
     * Get <p>Category id set</p> 
     * @return CategoryIds <p>Category id set</p>
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set <p>Category id set</p>
     * @param CategoryIds <p>Category id set</p>
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get <p>Category name collection.</p> 
     * @return CategoryNames <p>Category name collection.</p>
     */
    public String [] getCategoryNames() {
        return this.CategoryNames;
    }

    /**
     * Set <p>Category name collection.</p>
     * @param CategoryNames <p>Category name collection.</p>
     */
    public void setCategoryNames(String [] CategoryNames) {
        this.CategoryNames = CategoryNames;
    }

    /**
     * Get <p>Scan task configuration</p> 
     * @return TaskConfig <p>Scan task configuration</p>
     */
    public DspmSensitiveScanTaskConfig getTaskConfig() {
        return this.TaskConfig;
    }

    /**
     * Set <p>Scan task configuration</p>
     * @param TaskConfig <p>Scan task configuration</p>
     */
    public void setTaskConfig(DspmSensitiveScanTaskConfig TaskConfig) {
        this.TaskConfig = TaskConfig;
    }

    /**
     * Get <p>Categorization details of recognition results</p> 
     * @return CategoryDetails <p>Categorization details of recognition results</p>
     */
    public DspmIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>Categorization details of recognition results</p>
     * @param CategoryDetails <p>Categorization details of recognition results</p>
     */
    public void setCategoryDetails(DspmIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public DspmAssetDataScanDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetDataScanDetail(DspmAssetDataScanDetail source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new String(source.StatusInfo);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.DbCount != null) {
            this.DbCount = new Long(source.DbCount);
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
            }
        }
        if (source.CategoryNames != null) {
            this.CategoryNames = new String[source.CategoryNames.length];
            for (int i = 0; i < source.CategoryNames.length; i++) {
                this.CategoryNames[i] = new String(source.CategoryNames[i]);
            }
        }
        if (source.TaskConfig != null) {
            this.TaskConfig = new DspmSensitiveScanTaskConfig(source.TaskConfig);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new DspmIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new DspmIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusInfo", this.StatusInfo);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "DbCount", this.DbCount);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamArraySimple(map, prefix + "CategoryNames.", this.CategoryNames);
        this.setParamObj(map, prefix + "TaskConfig.", this.TaskConfig);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

