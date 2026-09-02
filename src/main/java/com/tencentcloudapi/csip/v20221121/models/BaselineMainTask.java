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

public class BaselineMainTask extends AbstractModel {

    /**
    * <p>Global task ID corresponding to the main task.</p>
    */
    @SerializedName("JobID")
    @Expose
    private String JobID;

    /**
    * <p>Main task ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Main task status. Values:</p><ul><li>INIT: initialization</li><li>SUBTASK_CREATING: creating subtasks</li><li>SCANNING: scanning</li><li>TIMEOUT: timeout</li><li>USER_CANCELED: canceled by the user</li><li>ALL_FAILED: all failed</li><li>SUCCESS: success</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Appid of the associated tenant of the main task.</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>Main task type. Value:</p><ul><li>ONE_SHOT: one-click policy scan (manual triggering)</li><li>PERIODIC: period scanning (auto-trigger by CycleScanConf)</li><li>OTHER: other disperse scans (triggered by asset dimension, etc.)</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>Main task start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time of the main task. Empty if not ended.</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>Failure error code. Empty if the request is successful.</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>Failure reason, empty if successful.</p>
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * <p>Solution (mapped according to ErrCode; empty on success)</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>Number of assets scanned successfully.</p>
    */
    @SerializedName("ScanSuccessCount")
    @Expose
    private Long ScanSuccessCount;

    /**
    * <p>Number of assets with scan failure.</p>
    */
    @SerializedName("ScanFailedCount")
    @Expose
    private Long ScanFailedCount;

    /**
    * <p>Total number of subtasks</p>
    */
    @SerializedName("ScanTotalCount")
    @Expose
    private Long ScanTotalCount;

    /**
     * Get <p>Global task ID corresponding to the main task.</p> 
     * @return JobID <p>Global task ID corresponding to the main task.</p>
     */
    public String getJobID() {
        return this.JobID;
    }

    /**
     * Set <p>Global task ID corresponding to the main task.</p>
     * @param JobID <p>Global task ID corresponding to the main task.</p>
     */
    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    /**
     * Get <p>Main task ID.</p> 
     * @return ID <p>Main task ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Main task ID.</p>
     * @param ID <p>Main task ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Main task status. Values:</p><ul><li>INIT: initialization</li><li>SUBTASK_CREATING: creating subtasks</li><li>SCANNING: scanning</li><li>TIMEOUT: timeout</li><li>USER_CANCELED: canceled by the user</li><li>ALL_FAILED: all failed</li><li>SUCCESS: success</li></ul> 
     * @return Status <p>Main task status. Values:</p><ul><li>INIT: initialization</li><li>SUBTASK_CREATING: creating subtasks</li><li>SCANNING: scanning</li><li>TIMEOUT: timeout</li><li>USER_CANCELED: canceled by the user</li><li>ALL_FAILED: all failed</li><li>SUCCESS: success</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Main task status. Values:</p><ul><li>INIT: initialization</li><li>SUBTASK_CREATING: creating subtasks</li><li>SCANNING: scanning</li><li>TIMEOUT: timeout</li><li>USER_CANCELED: canceled by the user</li><li>ALL_FAILED: all failed</li><li>SUCCESS: success</li></ul>
     * @param Status <p>Main task status. Values:</p><ul><li>INIT: initialization</li><li>SUBTASK_CREATING: creating subtasks</li><li>SCANNING: scanning</li><li>TIMEOUT: timeout</li><li>USER_CANCELED: canceled by the user</li><li>ALL_FAILED: all failed</li><li>SUCCESS: success</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Appid of the associated tenant of the main task.</p> 
     * @return Appid <p>Appid of the associated tenant of the main task.</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>Appid of the associated tenant of the main task.</p>
     * @param Appid <p>Appid of the associated tenant of the main task.</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>Main task type. Value:</p><ul><li>ONE_SHOT: one-click policy scan (manual triggering)</li><li>PERIODIC: period scanning (auto-trigger by CycleScanConf)</li><li>OTHER: other disperse scans (triggered by asset dimension, etc.)</li></ul> 
     * @return TaskType <p>Main task type. Value:</p><ul><li>ONE_SHOT: one-click policy scan (manual triggering)</li><li>PERIODIC: period scanning (auto-trigger by CycleScanConf)</li><li>OTHER: other disperse scans (triggered by asset dimension, etc.)</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Main task type. Value:</p><ul><li>ONE_SHOT: one-click policy scan (manual triggering)</li><li>PERIODIC: period scanning (auto-trigger by CycleScanConf)</li><li>OTHER: other disperse scans (triggered by asset dimension, etc.)</li></ul>
     * @param TaskType <p>Main task type. Value:</p><ul><li>ONE_SHOT: one-click policy scan (manual triggering)</li><li>PERIODIC: period scanning (auto-trigger by CycleScanConf)</li><li>OTHER: other disperse scans (triggered by asset dimension, etc.)</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Main task start time.</p> 
     * @return StartTime <p>Main task start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Main task start time.</p>
     * @param StartTime <p>Main task start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time of the main task. Empty if not ended.</p> 
     * @return FinishTime <p>End time of the main task. Empty if not ended.</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>End time of the main task. Empty if not ended.</p>
     * @param FinishTime <p>End time of the main task. Empty if not ended.</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul> 
     * @return CheckAssetType <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     * @param CheckAssetType <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>Failure error code. Empty if the request is successful.</p> 
     * @return ErrCode <p>Failure error code. Empty if the request is successful.</p>
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Failure error code. Empty if the request is successful.</p>
     * @param ErrCode <p>Failure error code. Empty if the request is successful.</p>
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Failure reason, empty if successful.</p> 
     * @return ErrMessage <p>Failure reason, empty if successful.</p>
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set <p>Failure reason, empty if successful.</p>
     * @param ErrMessage <p>Failure reason, empty if successful.</p>
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get <p>Solution (mapped according to ErrCode; empty on success)</p> 
     * @return Solution <p>Solution (mapped according to ErrCode; empty on success)</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>Solution (mapped according to ErrCode; empty on success)</p>
     * @param Solution <p>Solution (mapped according to ErrCode; empty on success)</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>Number of assets scanned successfully.</p> 
     * @return ScanSuccessCount <p>Number of assets scanned successfully.</p>
     */
    public Long getScanSuccessCount() {
        return this.ScanSuccessCount;
    }

    /**
     * Set <p>Number of assets scanned successfully.</p>
     * @param ScanSuccessCount <p>Number of assets scanned successfully.</p>
     */
    public void setScanSuccessCount(Long ScanSuccessCount) {
        this.ScanSuccessCount = ScanSuccessCount;
    }

    /**
     * Get <p>Number of assets with scan failure.</p> 
     * @return ScanFailedCount <p>Number of assets with scan failure.</p>
     */
    public Long getScanFailedCount() {
        return this.ScanFailedCount;
    }

    /**
     * Set <p>Number of assets with scan failure.</p>
     * @param ScanFailedCount <p>Number of assets with scan failure.</p>
     */
    public void setScanFailedCount(Long ScanFailedCount) {
        this.ScanFailedCount = ScanFailedCount;
    }

    /**
     * Get <p>Total number of subtasks</p> 
     * @return ScanTotalCount <p>Total number of subtasks</p>
     */
    public Long getScanTotalCount() {
        return this.ScanTotalCount;
    }

    /**
     * Set <p>Total number of subtasks</p>
     * @param ScanTotalCount <p>Total number of subtasks</p>
     */
    public void setScanTotalCount(Long ScanTotalCount) {
        this.ScanTotalCount = ScanTotalCount;
    }

    public BaselineMainTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineMainTask(BaselineMainTask source) {
        if (source.JobID != null) {
            this.JobID = new String(source.JobID);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.ScanSuccessCount != null) {
            this.ScanSuccessCount = new Long(source.ScanSuccessCount);
        }
        if (source.ScanFailedCount != null) {
            this.ScanFailedCount = new Long(source.ScanFailedCount);
        }
        if (source.ScanTotalCount != null) {
            this.ScanTotalCount = new Long(source.ScanTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobID", this.JobID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "ScanSuccessCount", this.ScanSuccessCount);
        this.setParamSimple(map, prefix + "ScanFailedCount", this.ScanFailedCount);
        this.setParamSimple(map, prefix + "ScanTotalCount", this.ScanTotalCount);

    }
}

