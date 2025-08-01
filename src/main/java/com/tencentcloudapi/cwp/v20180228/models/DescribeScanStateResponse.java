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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanStateResponse extends AbstractModel {

    /**
    * 0 - never scanned; 1 - scan in progress; 2 - scan completed; 3 - stop in progress; 4 - stop completed
    */
    @SerializedName("ScanState")
    @Expose
    private Long ScanState;

    /**
    * Scan progress
    */
    @SerializedName("Schedule")
    @Expose
    private Long Schedule;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Vulnerability ID of task scan
    */
    @SerializedName("VulId")
    @Expose
    private Long [] VulId;

    /**
    * 0 - one-click detection; 1 - regular detection
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Scan start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanBeginTime")
    @Expose
    private String ScanBeginTime;

    /**
    * Number of vulnerabilities scanned
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskEventCount")
    @Expose
    private Long RiskEventCount;

    /**
    * Scan end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0 - never scanned; 1 - scan in progress; 2 - scan completed; 3 - stop in progress; 4 - stop completed 
     * @return ScanState 0 - never scanned; 1 - scan in progress; 2 - scan completed; 3 - stop in progress; 4 - stop completed
     */
    public Long getScanState() {
        return this.ScanState;
    }

    /**
     * Set 0 - never scanned; 1 - scan in progress; 2 - scan completed; 3 - stop in progress; 4 - stop completed
     * @param ScanState 0 - never scanned; 1 - scan in progress; 2 - scan completed; 3 - stop in progress; 4 - stop completed
     */
    public void setScanState(Long ScanState) {
        this.ScanState = ScanState;
    }

    /**
     * Get Scan progress 
     * @return Schedule Scan progress
     */
    public Long getSchedule() {
        return this.Schedule;
    }

    /**
     * Set Scan progress
     * @param Schedule Scan progress
     */
    public void setSchedule(Long Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Vulnerability ID of task scan 
     * @return VulId Vulnerability ID of task scan
     */
    public Long [] getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID of task scan
     * @param VulId Vulnerability ID of task scan
     */
    public void setVulId(Long [] VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 0 - one-click detection; 1 - regular detection 
     * @return Type 0 - one-click detection; 1 - regular detection
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 - one-click detection; 1 - regular detection
     * @param Type 0 - one-click detection; 1 - regular detection
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Scan start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanBeginTime Scan start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanBeginTime() {
        return this.ScanBeginTime;
    }

    /**
     * Set Scan start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanBeginTime Scan start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanBeginTime(String ScanBeginTime) {
        this.ScanBeginTime = ScanBeginTime;
    }

    /**
     * Get Number of vulnerabilities scanned
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskEventCount Number of vulnerabilities scanned
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskEventCount() {
        return this.RiskEventCount;
    }

    /**
     * Set Number of vulnerabilities scanned
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskEventCount Number of vulnerabilities scanned
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskEventCount(Long RiskEventCount) {
        this.RiskEventCount = RiskEventCount;
    }

    /**
     * Get Scan end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanEndTime Scan end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set Scan end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanEndTime Scan end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeScanStateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanStateResponse(DescribeScanStateResponse source) {
        if (source.ScanState != null) {
            this.ScanState = new Long(source.ScanState);
        }
        if (source.Schedule != null) {
            this.Schedule = new Long(source.Schedule);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.VulId != null) {
            this.VulId = new Long[source.VulId.length];
            for (int i = 0; i < source.VulId.length; i++) {
                this.VulId[i] = new Long(source.VulId[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ScanBeginTime != null) {
            this.ScanBeginTime = new String(source.ScanBeginTime);
        }
        if (source.RiskEventCount != null) {
            this.RiskEventCount = new Long(source.RiskEventCount);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanState", this.ScanState);
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "VulId.", this.VulId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ScanBeginTime", this.ScanBeginTime);
        this.setParamSimple(map, prefix + "RiskEventCount", this.RiskEventCount);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

