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

public class DescribeVirusScanTaskStatusResponse extends AbstractModel {

    /**
    * Number of scanned containers
    */
    @SerializedName("ContainerTotal")
    @Expose
    private Long ContainerTotal;

    /**
    * Number of containers at risk
    */
    @SerializedName("RiskContainerCnt")
    @Expose
    private Long RiskContainerCnt;

    /**
    * Scan task status:
`SCAN_NONE`: None. 
`SCAN_SCANNING`: Scanning.
`SCAN_FINISH`: Scanned. 
`SCAN_TIMEOUT`: Scan timed out.
`SCAN_CANCELING`: Canceling.
`SCAN_CANCELED`: Canceled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Scanning progress
    */
    @SerializedName("Schedule")
    @Expose
    private Long Schedule;

    /**
    * Number of scanned containers
    */
    @SerializedName("ContainerScanCnt")
    @Expose
    private Long ContainerScanCnt;

    /**
    * Number of risks
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * Remaining scan time
    */
    @SerializedName("LeftSeconds")
    @Expose
    private Long LeftSeconds;

    /**
    * Scan start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Scan end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Scan type. Valid values: `CYCLE` (periodic scan); `MANUAL` (manual scan).
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of scanned containers 
     * @return ContainerTotal Number of scanned containers
     */
    public Long getContainerTotal() {
        return this.ContainerTotal;
    }

    /**
     * Set Number of scanned containers
     * @param ContainerTotal Number of scanned containers
     */
    public void setContainerTotal(Long ContainerTotal) {
        this.ContainerTotal = ContainerTotal;
    }

    /**
     * Get Number of containers at risk 
     * @return RiskContainerCnt Number of containers at risk
     */
    public Long getRiskContainerCnt() {
        return this.RiskContainerCnt;
    }

    /**
     * Set Number of containers at risk
     * @param RiskContainerCnt Number of containers at risk
     */
    public void setRiskContainerCnt(Long RiskContainerCnt) {
        this.RiskContainerCnt = RiskContainerCnt;
    }

    /**
     * Get Scan task status:
`SCAN_NONE`: None. 
`SCAN_SCANNING`: Scanning.
`SCAN_FINISH`: Scanned. 
`SCAN_TIMEOUT`: Scan timed out.
`SCAN_CANCELING`: Canceling.
`SCAN_CANCELED`: Canceled. 
     * @return Status Scan task status:
`SCAN_NONE`: None. 
`SCAN_SCANNING`: Scanning.
`SCAN_FINISH`: Scanned. 
`SCAN_TIMEOUT`: Scan timed out.
`SCAN_CANCELING`: Canceling.
`SCAN_CANCELED`: Canceled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Scan task status:
`SCAN_NONE`: None. 
`SCAN_SCANNING`: Scanning.
`SCAN_FINISH`: Scanned. 
`SCAN_TIMEOUT`: Scan timed out.
`SCAN_CANCELING`: Canceling.
`SCAN_CANCELED`: Canceled.
     * @param Status Scan task status:
`SCAN_NONE`: None. 
`SCAN_SCANNING`: Scanning.
`SCAN_FINISH`: Scanned. 
`SCAN_TIMEOUT`: Scan timed out.
`SCAN_CANCELING`: Canceling.
`SCAN_CANCELED`: Canceled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Scanning progress 
     * @return Schedule Scanning progress
     */
    public Long getSchedule() {
        return this.Schedule;
    }

    /**
     * Set Scanning progress
     * @param Schedule Scanning progress
     */
    public void setSchedule(Long Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get Number of scanned containers 
     * @return ContainerScanCnt Number of scanned containers
     */
    public Long getContainerScanCnt() {
        return this.ContainerScanCnt;
    }

    /**
     * Set Number of scanned containers
     * @param ContainerScanCnt Number of scanned containers
     */
    public void setContainerScanCnt(Long ContainerScanCnt) {
        this.ContainerScanCnt = ContainerScanCnt;
    }

    /**
     * Get Number of risks 
     * @return RiskCnt Number of risks
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set Number of risks
     * @param RiskCnt Number of risks
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get Remaining scan time 
     * @return LeftSeconds Remaining scan time
     */
    public Long getLeftSeconds() {
        return this.LeftSeconds;
    }

    /**
     * Set Remaining scan time
     * @param LeftSeconds Remaining scan time
     */
    public void setLeftSeconds(Long LeftSeconds) {
        this.LeftSeconds = LeftSeconds;
    }

    /**
     * Get Scan start time 
     * @return StartTime Scan start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Scan start time
     * @param StartTime Scan start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Scan end time 
     * @return EndTime Scan end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Scan end time
     * @param EndTime Scan end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Scan type. Valid values: `CYCLE` (periodic scan); `MANUAL` (manual scan). 
     * @return ScanType Scan type. Valid values: `CYCLE` (periodic scan); `MANUAL` (manual scan).
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set Scan type. Valid values: `CYCLE` (periodic scan); `MANUAL` (manual scan).
     * @param ScanType Scan type. Valid values: `CYCLE` (periodic scan); `MANUAL` (manual scan).
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
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

    public DescribeVirusScanTaskStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusScanTaskStatusResponse(DescribeVirusScanTaskStatusResponse source) {
        if (source.ContainerTotal != null) {
            this.ContainerTotal = new Long(source.ContainerTotal);
        }
        if (source.RiskContainerCnt != null) {
            this.RiskContainerCnt = new Long(source.RiskContainerCnt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Schedule != null) {
            this.Schedule = new Long(source.Schedule);
        }
        if (source.ContainerScanCnt != null) {
            this.ContainerScanCnt = new Long(source.ContainerScanCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.LeftSeconds != null) {
            this.LeftSeconds = new Long(source.LeftSeconds);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerTotal", this.ContainerTotal);
        this.setParamSimple(map, prefix + "RiskContainerCnt", this.RiskContainerCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "ContainerScanCnt", this.ContainerScanCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "LeftSeconds", this.LeftSeconds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

