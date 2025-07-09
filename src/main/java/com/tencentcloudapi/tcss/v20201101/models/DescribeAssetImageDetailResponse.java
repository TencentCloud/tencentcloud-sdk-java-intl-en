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

public class DescribeAssetImageDetailResponse extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Image size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Number of associated servers
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * Number of associated containers
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * Number of risky behaviors
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * Number of sensitive data items
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SensitiveInfoCnt")
    @Expose
    private Long SensitiveInfoCnt;

    /**
    * Whether it is a trusted image
    */
    @SerializedName("IsTrustImage")
    @Expose
    private Boolean IsTrustImage;

    /**
    * Image system
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Image scan error in the agent
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AgentError")
    @Expose
    private String AgentError;

    /**
    * Image scan error on the backend
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanError")
    @Expose
    private String ScanError;

    /**
    * System architecture
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * Author
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * Build history
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BuildHistory")
    @Expose
    private String BuildHistory;

    /**
    * Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * Vulnerability scan progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanRiskProgress")
    @Expose
    private Long ScanRiskProgress;

    /**
    * Trojan scan error
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanVirusError")
    @Expose
    private String ScanVirusError;

    /**
    * Vulnerability scan error
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanVulError")
    @Expose
    private String ScanVulError;

    /**
    * Sensitive data error
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * Number of viruses and trojans
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Remaining scan time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemainScanTime")
    @Expose
    private Long RemainScanTime;

    /**
    * Valid values: `1` (licensed); `0` (unlicensed).
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Image size 
     * @return Size Image size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Image size
     * @param Size Image size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Number of associated servers
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostCnt Number of associated servers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set Number of associated servers
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostCnt Number of associated servers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get Number of associated containers
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerCnt Number of associated containers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set Number of associated containers
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerCnt Number of associated containers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get Last scan time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanTime Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanTime Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulCnt Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulCnt Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get Number of risky behaviors
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskCnt Number of risky behaviors
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set Number of risky behaviors
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskCnt Number of risky behaviors
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get Number of sensitive data items
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SensitiveInfoCnt Number of sensitive data items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSensitiveInfoCnt() {
        return this.SensitiveInfoCnt;
    }

    /**
     * Set Number of sensitive data items
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SensitiveInfoCnt Number of sensitive data items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSensitiveInfoCnt(Long SensitiveInfoCnt) {
        this.SensitiveInfoCnt = SensitiveInfoCnt;
    }

    /**
     * Get Whether it is a trusted image 
     * @return IsTrustImage Whether it is a trusted image
     */
    public Boolean getIsTrustImage() {
        return this.IsTrustImage;
    }

    /**
     * Set Whether it is a trusted image
     * @param IsTrustImage Whether it is a trusted image
     */
    public void setIsTrustImage(Boolean IsTrustImage) {
        this.IsTrustImage = IsTrustImage;
    }

    /**
     * Get Image system 
     * @return OsName Image system
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Image system
     * @param OsName Image system
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Image scan error in the agent
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AgentError Image scan error in the agent
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAgentError() {
        return this.AgentError;
    }

    /**
     * Set Image scan error in the agent
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AgentError Image scan error in the agent
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAgentError(String AgentError) {
        this.AgentError = AgentError;
    }

    /**
     * Get Image scan error on the backend
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanError Image scan error on the backend
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanError() {
        return this.ScanError;
    }

    /**
     * Set Image scan error on the backend
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanError Image scan error on the backend
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanError(String ScanError) {
        this.ScanError = ScanError;
    }

    /**
     * Get System architecture
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Architecture System architecture
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set System architecture
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Architecture System architecture
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get Author
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Author Author
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set Author
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Author Author
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get Build history
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BuildHistory Build history
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBuildHistory() {
        return this.BuildHistory;
    }

    /**
     * Set Build history
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BuildHistory Build history
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBuildHistory(String BuildHistory) {
        this.BuildHistory = BuildHistory;
    }

    /**
     * Get Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanVirusProgress Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanVirusProgress Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get Vulnerability scan progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanVulProgress Vulnerability scan progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set Vulnerability scan progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanVulProgress Vulnerability scan progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanRiskProgress Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanRiskProgress Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanRiskProgress(Long ScanRiskProgress) {
        this.ScanRiskProgress = ScanRiskProgress;
    }

    /**
     * Get Trojan scan error
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanVirusError Trojan scan error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanVirusError() {
        return this.ScanVirusError;
    }

    /**
     * Set Trojan scan error
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanVirusError Trojan scan error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanVirusError(String ScanVirusError) {
        this.ScanVirusError = ScanVirusError;
    }

    /**
     * Get Vulnerability scan error
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanVulError Vulnerability scan error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanVulError() {
        return this.ScanVulError;
    }

    /**
     * Set Vulnerability scan error
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanVulError Vulnerability scan error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanVulError(String ScanVulError) {
        this.ScanVulError = ScanVulError;
    }

    /**
     * Get Sensitive data error
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanRiskError Sensitive data error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set Sensitive data error
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanRiskError Sensitive data error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get Image scanning status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanStatus Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanStatus Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Number of viruses and trojans
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirusCnt Number of viruses and trojans
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set Number of viruses and trojans
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirusCnt Number of viruses and trojans
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get Image scanning status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Remaining scan time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemainScanTime Remaining scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRemainScanTime() {
        return this.RemainScanTime;
    }

    /**
     * Set Remaining scan time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemainScanTime Remaining scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemainScanTime(Long RemainScanTime) {
        this.RemainScanTime = RemainScanTime;
    }

    /**
     * Get Valid values: `1` (licensed); `0` (unlicensed). 
     * @return IsAuthorized Valid values: `1` (licensed); `0` (unlicensed).
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set Valid values: `1` (licensed); `0` (unlicensed).
     * @param IsAuthorized Valid values: `1` (licensed); `0` (unlicensed).
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
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

    public DescribeAssetImageDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageDetailResponse(DescribeAssetImageDetailResponse source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.SensitiveInfoCnt != null) {
            this.SensitiveInfoCnt = new Long(source.SensitiveInfoCnt);
        }
        if (source.IsTrustImage != null) {
            this.IsTrustImage = new Boolean(source.IsTrustImage);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.AgentError != null) {
            this.AgentError = new String(source.AgentError);
        }
        if (source.ScanError != null) {
            this.ScanError = new String(source.ScanError);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.BuildHistory != null) {
            this.BuildHistory = new String(source.BuildHistory);
        }
        if (source.ScanVirusProgress != null) {
            this.ScanVirusProgress = new Long(source.ScanVirusProgress);
        }
        if (source.ScanVulProgress != null) {
            this.ScanVulProgress = new Long(source.ScanVulProgress);
        }
        if (source.ScanRiskProgress != null) {
            this.ScanRiskProgress = new Long(source.ScanRiskProgress);
        }
        if (source.ScanVirusError != null) {
            this.ScanVirusError = new String(source.ScanVirusError);
        }
        if (source.ScanVulError != null) {
            this.ScanVulError = new String(source.ScanVulError);
        }
        if (source.ScanRiskError != null) {
            this.ScanRiskError = new String(source.ScanRiskError);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RemainScanTime != null) {
            this.RemainScanTime = new Long(source.RemainScanTime);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "SensitiveInfoCnt", this.SensitiveInfoCnt);
        this.setParamSimple(map, prefix + "IsTrustImage", this.IsTrustImage);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "AgentError", this.AgentError);
        this.setParamSimple(map, prefix + "ScanError", this.ScanError);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "BuildHistory", this.BuildHistory);
        this.setParamSimple(map, prefix + "ScanVirusProgress", this.ScanVirusProgress);
        this.setParamSimple(map, prefix + "ScanVulProgress", this.ScanVulProgress);
        this.setParamSimple(map, prefix + "ScanRiskProgress", this.ScanRiskProgress);
        this.setParamSimple(map, prefix + "ScanVirusError", this.ScanVirusError);
        this.setParamSimple(map, prefix + "ScanVulError", this.ScanVulError);
        this.setParamSimple(map, prefix + "ScanRiskError", this.ScanRiskError);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RemainScanTime", this.RemainScanTime);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

