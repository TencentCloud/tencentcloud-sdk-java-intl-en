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
    * <p>Image ID.</p>
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * <p>Image name.</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>Image digests.</p>
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Image size.</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>Number of associated hosts (including normal nodes and super nodes).</p>
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * <p>Number of associated containers.</p>
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * <p>Number of super nodes.</p>
    */
    @SerializedName("SuperNodeCnt")
    @Expose
    private Long SuperNodeCnt;

    /**
    * <p>Last scan time.</p>
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * <p>Number of vulnerabilities.</p>
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * <p>Number of risky behaviors.</p>
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * <p>Number of sensitive information entries.</p>
    */
    @SerializedName("SensitiveInfoCnt")
    @Expose
    private Long SensitiveInfoCnt;

    /**
    * <p>Whether the image is trusted.</p>
    */
    @SerializedName("IsTrustImage")
    @Expose
    private Boolean IsTrustImage;

    /**
    * <p>Image OS.</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>Agent image scan error.</p>
    */
    @SerializedName("AgentError")
    @Expose
    private String AgentError;

    /**
    * <p>Backend image scan error.</p>
    */
    @SerializedName("ScanError")
    @Expose
    private String ScanError;

    /**
    * <p>System architecture.</p>
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * <p>Author.</p>
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * <p>Build history.</p>
    */
    @SerializedName("BuildHistory")
    @Expose
    private String BuildHistory;

    /**
    * <p>Trojan scan progress.</p>
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * <p>Vulnerability scan progress.</p>
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * <p>Sensitive information scan progress.</p>
    */
    @SerializedName("ScanRiskProgress")
    @Expose
    private Long ScanRiskProgress;

    /**
    * <p>Trojan scan error.</p>
    */
    @SerializedName("ScanVirusError")
    @Expose
    private String ScanVirusError;

    /**
    * <p>Vulnerability scan error.</p>
    */
    @SerializedName("ScanVulError")
    @Expose
    private String ScanVulError;

    /**
    * <p>Sensitive information error.</p>
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * <p>Image scan status.</p>
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * <p>Number of Trojans and viruses.</p>
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * <p>Image scan status.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Remaining scan time.</p>
    */
    @SerializedName("RemainScanTime")
    @Expose
    private Long RemainScanTime;

    /**
    * <p>Whether authorization is performed. 1 indicates authorized and 0 indicates unauthorized.</p>
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * <p>Solution.</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>Reason.</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>Repository digests.</p>
    */
    @SerializedName("RepoDigests")
    @Expose
    private String [] RepoDigests;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Image ID.</p> 
     * @return ImageID <p>Image ID.</p>
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageID <p>Image ID.</p>
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get <p>Image name.</p> 
     * @return ImageName <p>Image name.</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>Image name.</p>
     * @param ImageName <p>Image name.</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>Image digests.</p> 
     * @return ImageDigest <p>Image digests.</p>
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set <p>Image digests.</p>
     * @param ImageDigest <p>Image digests.</p>
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Image size.</p> 
     * @return Size <p>Image size.</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>Image size.</p>
     * @param Size <p>Image size.</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>Number of associated hosts (including normal nodes and super nodes).</p> 
     * @return HostCnt <p>Number of associated hosts (including normal nodes and super nodes).</p>
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set <p>Number of associated hosts (including normal nodes and super nodes).</p>
     * @param HostCnt <p>Number of associated hosts (including normal nodes and super nodes).</p>
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get <p>Number of associated containers.</p> 
     * @return ContainerCnt <p>Number of associated containers.</p>
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set <p>Number of associated containers.</p>
     * @param ContainerCnt <p>Number of associated containers.</p>
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get <p>Number of super nodes.</p> 
     * @return SuperNodeCnt <p>Number of super nodes.</p>
     */
    public Long getSuperNodeCnt() {
        return this.SuperNodeCnt;
    }

    /**
     * Set <p>Number of super nodes.</p>
     * @param SuperNodeCnt <p>Number of super nodes.</p>
     */
    public void setSuperNodeCnt(Long SuperNodeCnt) {
        this.SuperNodeCnt = SuperNodeCnt;
    }

    /**
     * Get <p>Last scan time.</p> 
     * @return ScanTime <p>Last scan time.</p>
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set <p>Last scan time.</p>
     * @param ScanTime <p>Last scan time.</p>
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get <p>Number of vulnerabilities.</p> 
     * @return VulCnt <p>Number of vulnerabilities.</p>
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set <p>Number of vulnerabilities.</p>
     * @param VulCnt <p>Number of vulnerabilities.</p>
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get <p>Number of risky behaviors.</p> 
     * @return RiskCnt <p>Number of risky behaviors.</p>
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set <p>Number of risky behaviors.</p>
     * @param RiskCnt <p>Number of risky behaviors.</p>
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get <p>Number of sensitive information entries.</p> 
     * @return SensitiveInfoCnt <p>Number of sensitive information entries.</p>
     */
    public Long getSensitiveInfoCnt() {
        return this.SensitiveInfoCnt;
    }

    /**
     * Set <p>Number of sensitive information entries.</p>
     * @param SensitiveInfoCnt <p>Number of sensitive information entries.</p>
     */
    public void setSensitiveInfoCnt(Long SensitiveInfoCnt) {
        this.SensitiveInfoCnt = SensitiveInfoCnt;
    }

    /**
     * Get <p>Whether the image is trusted.</p> 
     * @return IsTrustImage <p>Whether the image is trusted.</p>
     */
    public Boolean getIsTrustImage() {
        return this.IsTrustImage;
    }

    /**
     * Set <p>Whether the image is trusted.</p>
     * @param IsTrustImage <p>Whether the image is trusted.</p>
     */
    public void setIsTrustImage(Boolean IsTrustImage) {
        this.IsTrustImage = IsTrustImage;
    }

    /**
     * Get <p>Image OS.</p> 
     * @return OsName <p>Image OS.</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>Image OS.</p>
     * @param OsName <p>Image OS.</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>Agent image scan error.</p> 
     * @return AgentError <p>Agent image scan error.</p>
     */
    public String getAgentError() {
        return this.AgentError;
    }

    /**
     * Set <p>Agent image scan error.</p>
     * @param AgentError <p>Agent image scan error.</p>
     */
    public void setAgentError(String AgentError) {
        this.AgentError = AgentError;
    }

    /**
     * Get <p>Backend image scan error.</p> 
     * @return ScanError <p>Backend image scan error.</p>
     */
    public String getScanError() {
        return this.ScanError;
    }

    /**
     * Set <p>Backend image scan error.</p>
     * @param ScanError <p>Backend image scan error.</p>
     */
    public void setScanError(String ScanError) {
        this.ScanError = ScanError;
    }

    /**
     * Get <p>System architecture.</p> 
     * @return Architecture <p>System architecture.</p>
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set <p>System architecture.</p>
     * @param Architecture <p>System architecture.</p>
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get <p>Author.</p> 
     * @return Author <p>Author.</p>
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set <p>Author.</p>
     * @param Author <p>Author.</p>
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get <p>Build history.</p> 
     * @return BuildHistory <p>Build history.</p>
     */
    public String getBuildHistory() {
        return this.BuildHistory;
    }

    /**
     * Set <p>Build history.</p>
     * @param BuildHistory <p>Build history.</p>
     */
    public void setBuildHistory(String BuildHistory) {
        this.BuildHistory = BuildHistory;
    }

    /**
     * Get <p>Trojan scan progress.</p> 
     * @return ScanVirusProgress <p>Trojan scan progress.</p>
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set <p>Trojan scan progress.</p>
     * @param ScanVirusProgress <p>Trojan scan progress.</p>
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get <p>Vulnerability scan progress.</p> 
     * @return ScanVulProgress <p>Vulnerability scan progress.</p>
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set <p>Vulnerability scan progress.</p>
     * @param ScanVulProgress <p>Vulnerability scan progress.</p>
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get <p>Sensitive information scan progress.</p> 
     * @return ScanRiskProgress <p>Sensitive information scan progress.</p>
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set <p>Sensitive information scan progress.</p>
     * @param ScanRiskProgress <p>Sensitive information scan progress.</p>
     */
    public void setScanRiskProgress(Long ScanRiskProgress) {
        this.ScanRiskProgress = ScanRiskProgress;
    }

    /**
     * Get <p>Trojan scan error.</p> 
     * @return ScanVirusError <p>Trojan scan error.</p>
     */
    public String getScanVirusError() {
        return this.ScanVirusError;
    }

    /**
     * Set <p>Trojan scan error.</p>
     * @param ScanVirusError <p>Trojan scan error.</p>
     */
    public void setScanVirusError(String ScanVirusError) {
        this.ScanVirusError = ScanVirusError;
    }

    /**
     * Get <p>Vulnerability scan error.</p> 
     * @return ScanVulError <p>Vulnerability scan error.</p>
     */
    public String getScanVulError() {
        return this.ScanVulError;
    }

    /**
     * Set <p>Vulnerability scan error.</p>
     * @param ScanVulError <p>Vulnerability scan error.</p>
     */
    public void setScanVulError(String ScanVulError) {
        this.ScanVulError = ScanVulError;
    }

    /**
     * Get <p>Sensitive information error.</p> 
     * @return ScanRiskError <p>Sensitive information error.</p>
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set <p>Sensitive information error.</p>
     * @param ScanRiskError <p>Sensitive information error.</p>
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get <p>Image scan status.</p> 
     * @return ScanStatus <p>Image scan status.</p>
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set <p>Image scan status.</p>
     * @param ScanStatus <p>Image scan status.</p>
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get <p>Number of Trojans and viruses.</p> 
     * @return VirusCnt <p>Number of Trojans and viruses.</p>
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set <p>Number of Trojans and viruses.</p>
     * @param VirusCnt <p>Number of Trojans and viruses.</p>
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get <p>Image scan status.</p> 
     * @return Status <p>Image scan status.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Image scan status.</p>
     * @param Status <p>Image scan status.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Remaining scan time.</p> 
     * @return RemainScanTime <p>Remaining scan time.</p>
     */
    public Long getRemainScanTime() {
        return this.RemainScanTime;
    }

    /**
     * Set <p>Remaining scan time.</p>
     * @param RemainScanTime <p>Remaining scan time.</p>
     */
    public void setRemainScanTime(Long RemainScanTime) {
        this.RemainScanTime = RemainScanTime;
    }

    /**
     * Get <p>Whether authorization is performed. 1 indicates authorized and 0 indicates unauthorized.</p> 
     * @return IsAuthorized <p>Whether authorization is performed. 1 indicates authorized and 0 indicates unauthorized.</p>
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set <p>Whether authorization is performed. 1 indicates authorized and 0 indicates unauthorized.</p>
     * @param IsAuthorized <p>Whether authorization is performed. 1 indicates authorized and 0 indicates unauthorized.</p>
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get <p>Solution.</p> 
     * @return Solution <p>Solution.</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>Solution.</p>
     * @param Solution <p>Solution.</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>Reason.</p> 
     * @return Reason <p>Reason.</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>Reason.</p>
     * @param Reason <p>Reason.</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>Repository digests.</p> 
     * @return RepoDigests <p>Repository digests.</p>
     */
    public String [] getRepoDigests() {
        return this.RepoDigests;
    }

    /**
     * Set <p>Repository digests.</p>
     * @param RepoDigests <p>Repository digests.</p>
     */
    public void setRepoDigests(String [] RepoDigests) {
        this.RepoDigests = RepoDigests;
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
        if (source.ImageDigest != null) {
            this.ImageDigest = new String(source.ImageDigest);
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
        if (source.SuperNodeCnt != null) {
            this.SuperNodeCnt = new Long(source.SuperNodeCnt);
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
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.RepoDigests != null) {
            this.RepoDigests = new String[source.RepoDigests.length];
            for (int i = 0; i < source.RepoDigests.length; i++) {
                this.RepoDigests[i] = new String(source.RepoDigests[i]);
            }
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
        this.setParamSimple(map, prefix + "ImageDigest", this.ImageDigest);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "SuperNodeCnt", this.SuperNodeCnt);
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
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArraySimple(map, prefix + "RepoDigests.", this.RepoDigests);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

