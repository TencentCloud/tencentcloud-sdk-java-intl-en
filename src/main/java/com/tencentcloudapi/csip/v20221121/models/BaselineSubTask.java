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

public class BaselineSubTask extends AbstractModel {

    /**
    * <p>Subtask ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>ID of the main task it belongs to (corresponds to BaselineMainTask.ID).</p>
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

    /**
    * <p>Execution result of the subtask. Value:</p><ul><li>SUCCESS: successful</li><li>FAILED: failed</li><li>USER_CANCELED: canceled by the user</li><li>CHECKING: detecting</li><li>UNKNOWN: unknown status</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Appid of the tenant associated with the subtask.</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>Subtask start execution time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Subtask end time. If not ended, it is empty</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Detect asset major category, case-sensitive between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: host</li><li>CLUSTER: container cluster</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>Host asset information returned when CheckAssetType=HOST. Empty when CheckAssetType=CLUSTER.</p>
    */
    @SerializedName("HostAsset")
    @Expose
    private BaselineHostAsset HostAsset;

    /**
    * <p>Status code: In case of failure, a failure code is returned (for example, AGENT_OFFLINE, SCAN_TIMEOUT, CLIENT_SCAN_FAILED). During detection, the detection status is returned. It is empty for success or user cancellation.</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>Detailed description of the reason for failure. Empty on success, canceled by the user, or during detection.</p>
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * <p>Solution recommendation in case of failure. Empty for success, canceled by the user, or in-progress detection.</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>Cluster asset information returned when CheckAssetType=CLUSTER. Empty when CheckAssetType=HOST.</p>
    */
    @SerializedName("ClusterAsset")
    @Expose
    private BaselineClusterAsset ClusterAsset;

    /**
     * Get <p>Subtask ID.</p> 
     * @return ID <p>Subtask ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Subtask ID.</p>
     * @param ID <p>Subtask ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>ID of the main task it belongs to (corresponds to BaselineMainTask.ID).</p> 
     * @return TaskID <p>ID of the main task it belongs to (corresponds to BaselineMainTask.ID).</p>
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set <p>ID of the main task it belongs to (corresponds to BaselineMainTask.ID).</p>
     * @param TaskID <p>ID of the main task it belongs to (corresponds to BaselineMainTask.ID).</p>
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get <p>Execution result of the subtask. Value:</p><ul><li>SUCCESS: successful</li><li>FAILED: failed</li><li>USER_CANCELED: canceled by the user</li><li>CHECKING: detecting</li><li>UNKNOWN: unknown status</li></ul> 
     * @return Status <p>Execution result of the subtask. Value:</p><ul><li>SUCCESS: successful</li><li>FAILED: failed</li><li>USER_CANCELED: canceled by the user</li><li>CHECKING: detecting</li><li>UNKNOWN: unknown status</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Execution result of the subtask. Value:</p><ul><li>SUCCESS: successful</li><li>FAILED: failed</li><li>USER_CANCELED: canceled by the user</li><li>CHECKING: detecting</li><li>UNKNOWN: unknown status</li></ul>
     * @param Status <p>Execution result of the subtask. Value:</p><ul><li>SUCCESS: successful</li><li>FAILED: failed</li><li>USER_CANCELED: canceled by the user</li><li>CHECKING: detecting</li><li>UNKNOWN: unknown status</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Appid of the tenant associated with the subtask.</p> 
     * @return Appid <p>Appid of the tenant associated with the subtask.</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>Appid of the tenant associated with the subtask.</p>
     * @param Appid <p>Appid of the tenant associated with the subtask.</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>Subtask start execution time.</p> 
     * @return StartTime <p>Subtask start execution time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Subtask start execution time.</p>
     * @param StartTime <p>Subtask start execution time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Subtask end time. If not ended, it is empty</p> 
     * @return FinishTime <p>Subtask end time. If not ended, it is empty</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Subtask end time. If not ended, it is empty</p>
     * @param FinishTime <p>Subtask end time. If not ended, it is empty</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Detect asset major category, case-sensitive between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: host</li><li>CLUSTER: container cluster</li></ul> 
     * @return CheckAssetType <p>Detect asset major category, case-sensitive between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: host</li><li>CLUSTER: container cluster</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>Detect asset major category, case-sensitive between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: host</li><li>CLUSTER: container cluster</li></ul>
     * @param CheckAssetType <p>Detect asset major category, case-sensitive between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: host</li><li>CLUSTER: container cluster</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>Host asset information returned when CheckAssetType=HOST. Empty when CheckAssetType=CLUSTER.</p> 
     * @return HostAsset <p>Host asset information returned when CheckAssetType=HOST. Empty when CheckAssetType=CLUSTER.</p>
     */
    public BaselineHostAsset getHostAsset() {
        return this.HostAsset;
    }

    /**
     * Set <p>Host asset information returned when CheckAssetType=HOST. Empty when CheckAssetType=CLUSTER.</p>
     * @param HostAsset <p>Host asset information returned when CheckAssetType=HOST. Empty when CheckAssetType=CLUSTER.</p>
     */
    public void setHostAsset(BaselineHostAsset HostAsset) {
        this.HostAsset = HostAsset;
    }

    /**
     * Get <p>Status code: In case of failure, a failure code is returned (for example, AGENT_OFFLINE, SCAN_TIMEOUT, CLIENT_SCAN_FAILED). During detection, the detection status is returned. It is empty for success or user cancellation.</p> 
     * @return ErrCode <p>Status code: In case of failure, a failure code is returned (for example, AGENT_OFFLINE, SCAN_TIMEOUT, CLIENT_SCAN_FAILED). During detection, the detection status is returned. It is empty for success or user cancellation.</p>
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Status code: In case of failure, a failure code is returned (for example, AGENT_OFFLINE, SCAN_TIMEOUT, CLIENT_SCAN_FAILED). During detection, the detection status is returned. It is empty for success or user cancellation.</p>
     * @param ErrCode <p>Status code: In case of failure, a failure code is returned (for example, AGENT_OFFLINE, SCAN_TIMEOUT, CLIENT_SCAN_FAILED). During detection, the detection status is returned. It is empty for success or user cancellation.</p>
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Detailed description of the reason for failure. Empty on success, canceled by the user, or during detection.</p> 
     * @return ErrMessage <p>Detailed description of the reason for failure. Empty on success, canceled by the user, or during detection.</p>
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set <p>Detailed description of the reason for failure. Empty on success, canceled by the user, or during detection.</p>
     * @param ErrMessage <p>Detailed description of the reason for failure. Empty on success, canceled by the user, or during detection.</p>
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get <p>Solution recommendation in case of failure. Empty for success, canceled by the user, or in-progress detection.</p> 
     * @return Solution <p>Solution recommendation in case of failure. Empty for success, canceled by the user, or in-progress detection.</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>Solution recommendation in case of failure. Empty for success, canceled by the user, or in-progress detection.</p>
     * @param Solution <p>Solution recommendation in case of failure. Empty for success, canceled by the user, or in-progress detection.</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>Cluster asset information returned when CheckAssetType=CLUSTER. Empty when CheckAssetType=HOST.</p> 
     * @return ClusterAsset <p>Cluster asset information returned when CheckAssetType=CLUSTER. Empty when CheckAssetType=HOST.</p>
     */
    public BaselineClusterAsset getClusterAsset() {
        return this.ClusterAsset;
    }

    /**
     * Set <p>Cluster asset information returned when CheckAssetType=CLUSTER. Empty when CheckAssetType=HOST.</p>
     * @param ClusterAsset <p>Cluster asset information returned when CheckAssetType=CLUSTER. Empty when CheckAssetType=HOST.</p>
     */
    public void setClusterAsset(BaselineClusterAsset ClusterAsset) {
        this.ClusterAsset = ClusterAsset;
    }

    public BaselineSubTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineSubTask(BaselineSubTask source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
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
        if (source.HostAsset != null) {
            this.HostAsset = new BaselineHostAsset(source.HostAsset);
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
        if (source.ClusterAsset != null) {
            this.ClusterAsset = new BaselineClusterAsset(source.ClusterAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamObj(map, prefix + "HostAsset.", this.HostAsset);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamObj(map, prefix + "ClusterAsset.", this.ClusterAsset);

    }
}

