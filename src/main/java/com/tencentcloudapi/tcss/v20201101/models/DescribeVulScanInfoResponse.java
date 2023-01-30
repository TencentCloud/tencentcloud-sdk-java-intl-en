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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulScanInfoResponse extends AbstractModel{

    /**
    * Total number of local images scanned this time
    */
    @SerializedName("LocalImageScanCount")
    @Expose
    private Long LocalImageScanCount;

    /**
    * Number of ignored vulnerabilities
    */
    @SerializedName("IgnoreVulCount")
    @Expose
    private Long IgnoreVulCount;

    /**
    * Start time of the vulnerability scan
    */
    @SerializedName("ScanStartTime")
    @Expose
    private String ScanStartTime;

    /**
    * End time of the vulnerability scan
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * Number of images found to be at risk
    */
    @SerializedName("FoundRiskImageCount")
    @Expose
    private Long FoundRiskImageCount;

    /**
    * Number of vulnerabilities found in local images
    */
    @SerializedName("FoundVulCount")
    @Expose
    private Long FoundVulCount;

    /**
    * Scanning progress
    */
    @SerializedName("ScanProgress")
    @Expose
    private Float ScanProgress;

    /**
    * Total number of repository images scanned this time
    */
    @SerializedName("RegistryImageScanCount")
    @Expose
    private Long RegistryImageScanCount;

    /**
    * ID of the last task to scan local images for vulnerabilities
    */
    @SerializedName("LocalTaskID")
    @Expose
    private Long LocalTaskID;

    /**
    * Scanning status. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned); `CANCELED` (stopped).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Remaining time in seconds
    */
    @SerializedName("RemainingTime")
    @Expose
    private Float RemainingTime;

    /**
    * ID of the last task to scan repository images for vulnerabilities
    */
    @SerializedName("RegistryTaskID")
    @Expose
    private Long RegistryTaskID;

    /**
    * Number of vulnerabilities found in the repository
    */
    @SerializedName("RegistryFoundVulCount")
    @Expose
    private Long RegistryFoundVulCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of local images scanned this time 
     * @return LocalImageScanCount Total number of local images scanned this time
     */
    public Long getLocalImageScanCount() {
        return this.LocalImageScanCount;
    }

    /**
     * Set Total number of local images scanned this time
     * @param LocalImageScanCount Total number of local images scanned this time
     */
    public void setLocalImageScanCount(Long LocalImageScanCount) {
        this.LocalImageScanCount = LocalImageScanCount;
    }

    /**
     * Get Number of ignored vulnerabilities 
     * @return IgnoreVulCount Number of ignored vulnerabilities
     */
    public Long getIgnoreVulCount() {
        return this.IgnoreVulCount;
    }

    /**
     * Set Number of ignored vulnerabilities
     * @param IgnoreVulCount Number of ignored vulnerabilities
     */
    public void setIgnoreVulCount(Long IgnoreVulCount) {
        this.IgnoreVulCount = IgnoreVulCount;
    }

    /**
     * Get Start time of the vulnerability scan 
     * @return ScanStartTime Start time of the vulnerability scan
     */
    public String getScanStartTime() {
        return this.ScanStartTime;
    }

    /**
     * Set Start time of the vulnerability scan
     * @param ScanStartTime Start time of the vulnerability scan
     */
    public void setScanStartTime(String ScanStartTime) {
        this.ScanStartTime = ScanStartTime;
    }

    /**
     * Get End time of the vulnerability scan 
     * @return ScanEndTime End time of the vulnerability scan
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set End time of the vulnerability scan
     * @param ScanEndTime End time of the vulnerability scan
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get Number of images found to be at risk 
     * @return FoundRiskImageCount Number of images found to be at risk
     */
    public Long getFoundRiskImageCount() {
        return this.FoundRiskImageCount;
    }

    /**
     * Set Number of images found to be at risk
     * @param FoundRiskImageCount Number of images found to be at risk
     */
    public void setFoundRiskImageCount(Long FoundRiskImageCount) {
        this.FoundRiskImageCount = FoundRiskImageCount;
    }

    /**
     * Get Number of vulnerabilities found in local images 
     * @return FoundVulCount Number of vulnerabilities found in local images
     */
    public Long getFoundVulCount() {
        return this.FoundVulCount;
    }

    /**
     * Set Number of vulnerabilities found in local images
     * @param FoundVulCount Number of vulnerabilities found in local images
     */
    public void setFoundVulCount(Long FoundVulCount) {
        this.FoundVulCount = FoundVulCount;
    }

    /**
     * Get Scanning progress 
     * @return ScanProgress Scanning progress
     */
    public Float getScanProgress() {
        return this.ScanProgress;
    }

    /**
     * Set Scanning progress
     * @param ScanProgress Scanning progress
     */
    public void setScanProgress(Float ScanProgress) {
        this.ScanProgress = ScanProgress;
    }

    /**
     * Get Total number of repository images scanned this time 
     * @return RegistryImageScanCount Total number of repository images scanned this time
     */
    public Long getRegistryImageScanCount() {
        return this.RegistryImageScanCount;
    }

    /**
     * Set Total number of repository images scanned this time
     * @param RegistryImageScanCount Total number of repository images scanned this time
     */
    public void setRegistryImageScanCount(Long RegistryImageScanCount) {
        this.RegistryImageScanCount = RegistryImageScanCount;
    }

    /**
     * Get ID of the last task to scan local images for vulnerabilities 
     * @return LocalTaskID ID of the last task to scan local images for vulnerabilities
     */
    public Long getLocalTaskID() {
        return this.LocalTaskID;
    }

    /**
     * Set ID of the last task to scan local images for vulnerabilities
     * @param LocalTaskID ID of the last task to scan local images for vulnerabilities
     */
    public void setLocalTaskID(Long LocalTaskID) {
        this.LocalTaskID = LocalTaskID;
    }

    /**
     * Get Scanning status. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned); `CANCELED` (stopped). 
     * @return Status Scanning status. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned); `CANCELED` (stopped).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Scanning status. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned); `CANCELED` (stopped).
     * @param Status Scanning status. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned); `CANCELED` (stopped).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Remaining time in seconds 
     * @return RemainingTime Remaining time in seconds
     */
    public Float getRemainingTime() {
        return this.RemainingTime;
    }

    /**
     * Set Remaining time in seconds
     * @param RemainingTime Remaining time in seconds
     */
    public void setRemainingTime(Float RemainingTime) {
        this.RemainingTime = RemainingTime;
    }

    /**
     * Get ID of the last task to scan repository images for vulnerabilities 
     * @return RegistryTaskID ID of the last task to scan repository images for vulnerabilities
     */
    public Long getRegistryTaskID() {
        return this.RegistryTaskID;
    }

    /**
     * Set ID of the last task to scan repository images for vulnerabilities
     * @param RegistryTaskID ID of the last task to scan repository images for vulnerabilities
     */
    public void setRegistryTaskID(Long RegistryTaskID) {
        this.RegistryTaskID = RegistryTaskID;
    }

    /**
     * Get Number of vulnerabilities found in the repository 
     * @return RegistryFoundVulCount Number of vulnerabilities found in the repository
     */
    public Long getRegistryFoundVulCount() {
        return this.RegistryFoundVulCount;
    }

    /**
     * Set Number of vulnerabilities found in the repository
     * @param RegistryFoundVulCount Number of vulnerabilities found in the repository
     */
    public void setRegistryFoundVulCount(Long RegistryFoundVulCount) {
        this.RegistryFoundVulCount = RegistryFoundVulCount;
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

    public DescribeVulScanInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanInfoResponse(DescribeVulScanInfoResponse source) {
        if (source.LocalImageScanCount != null) {
            this.LocalImageScanCount = new Long(source.LocalImageScanCount);
        }
        if (source.IgnoreVulCount != null) {
            this.IgnoreVulCount = new Long(source.IgnoreVulCount);
        }
        if (source.ScanStartTime != null) {
            this.ScanStartTime = new String(source.ScanStartTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.FoundRiskImageCount != null) {
            this.FoundRiskImageCount = new Long(source.FoundRiskImageCount);
        }
        if (source.FoundVulCount != null) {
            this.FoundVulCount = new Long(source.FoundVulCount);
        }
        if (source.ScanProgress != null) {
            this.ScanProgress = new Float(source.ScanProgress);
        }
        if (source.RegistryImageScanCount != null) {
            this.RegistryImageScanCount = new Long(source.RegistryImageScanCount);
        }
        if (source.LocalTaskID != null) {
            this.LocalTaskID = new Long(source.LocalTaskID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RemainingTime != null) {
            this.RemainingTime = new Float(source.RemainingTime);
        }
        if (source.RegistryTaskID != null) {
            this.RegistryTaskID = new Long(source.RegistryTaskID);
        }
        if (source.RegistryFoundVulCount != null) {
            this.RegistryFoundVulCount = new Long(source.RegistryFoundVulCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalImageScanCount", this.LocalImageScanCount);
        this.setParamSimple(map, prefix + "IgnoreVulCount", this.IgnoreVulCount);
        this.setParamSimple(map, prefix + "ScanStartTime", this.ScanStartTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "FoundRiskImageCount", this.FoundRiskImageCount);
        this.setParamSimple(map, prefix + "FoundVulCount", this.FoundVulCount);
        this.setParamSimple(map, prefix + "ScanProgress", this.ScanProgress);
        this.setParamSimple(map, prefix + "RegistryImageScanCount", this.RegistryImageScanCount);
        this.setParamSimple(map, prefix + "LocalTaskID", this.LocalTaskID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RemainingTime", this.RemainingTime);
        this.setParamSimple(map, prefix + "RegistryTaskID", this.RegistryTaskID);
        this.setParamSimple(map, prefix + "RegistryFoundVulCount", this.RegistryFoundVulCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

