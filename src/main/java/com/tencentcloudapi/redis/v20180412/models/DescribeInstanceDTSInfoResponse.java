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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceDTSInfoResponse extends AbstractModel{

    /**
    * DTS task ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * DTS task name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Task status. Valid values: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Status description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Synchronization latency in bytes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Disconnection time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CutDownTime")
    @Expose
    private String CutDownTime;

    /**
    * Source instance information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcInfo")
    @Expose
    private DescribeInstanceDTSInstanceInfo SrcInfo;

    /**
    * Target instance information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstInfo")
    @Expose
    private DescribeInstanceDTSInstanceInfo DstInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DTS task ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return JobId DTS task ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set DTS task ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param JobId DTS task ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get DTS task name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return JobName DTS task name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set DTS task name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param JobName DTS task name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Task status. Valid values: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Task status. Valid values: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Task status. Valid values: 1 (Creating), 3 (Checking), 4 (CheckPass), 5 (CheckNotPass), 7 (Running), 8 (ReadyComplete), 9 (Success), 10 (Failed), 11 (Stopping), 12 (Completing)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Status description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusDesc Status description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusDesc Status description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Synchronization latency in bytes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Offset Synchronization latency in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Synchronization latency in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Offset Synchronization latency in bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Disconnection time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CutDownTime Disconnection time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCutDownTime() {
        return this.CutDownTime;
    }

    /**
     * Set Disconnection time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CutDownTime Disconnection time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCutDownTime(String CutDownTime) {
        this.CutDownTime = CutDownTime;
    }

    /**
     * Get Source instance information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SrcInfo Source instance information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DescribeInstanceDTSInstanceInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source instance information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SrcInfo Source instance information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcInfo(DescribeInstanceDTSInstanceInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Target instance information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DstInfo Target instance information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DescribeInstanceDTSInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Target instance information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DstInfo Target instance information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDstInfo(DescribeInstanceDTSInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CutDownTime", this.CutDownTime);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

