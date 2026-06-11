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

public class DescribeAssetImageRegistryDetailResponse extends AbstractModel {

    /**
    * Image Digest
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * Image address.
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * Image type
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Repository name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Mirror version
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * Scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * scan status
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * Number of security vulnerabilities
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * Number of Trojan viruses
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * Number of risky behaviors
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * Number of sensitive data items
    */
    @SerializedName("SentiveInfoCnt")
    @Expose
    private Long SentiveInfoCnt;

    /**
    * Image system.
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Trojan scan error
    */
    @SerializedName("ScanVirusError")
    @Expose
    private String ScanVirusError;

    /**
    * Vulnerability scanning error
    */
    @SerializedName("ScanVulError")
    @Expose
    private String ScanVulError;

    /**
    * Layer file information
    */
    @SerializedName("LayerInfo")
    @Expose
    private String LayerInfo;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * High risk scan error
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * Trojan information scan progress
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * Vulnerability scan progress.
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * Sensitive scanning progress
    */
    @SerializedName("ScanRiskProgress")
    @Expose
    private Long ScanRiskProgress;

    /**
    * Remaining scan time (seconds)
    */
    @SerializedName("ScanRemainTime")
    @Expose
    private Long ScanRemainTime;

    /**
    * cve scan status
    */
    @SerializedName("CveStatus")
    @Expose
    private String CveStatus;

    /**
    * High risk scan status
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * Trojan scan status
    */
    @SerializedName("VirusStatus")
    @Expose
    private String VirusStatus;

    /**
    * Overall progress
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Authorization status
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * Image size
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Image ID.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image Zone
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * Image Creation Time
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * Number of sensitive data items
    */
    @SerializedName("SensitiveInfoCnt")
    @Expose
    private Long SensitiveInfoCnt;

    /**
    * 
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Solution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Reason
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Image Digest 
     * @return ImageDigest Image Digest
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set Image Digest
     * @param ImageDigest Image Digest
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get Image address. 
     * @return ImageRepoAddress Image address.
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set Image address.
     * @param ImageRepoAddress Image address.
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get Image type 
     * @return RegistryType Image type
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Image type
     * @param RegistryType Image type
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Repository name 
     * @return ImageName Repository name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Repository name
     * @param ImageName Repository name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Mirror version 
     * @return ImageTag Mirror version
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set Mirror version
     * @param ImageTag Mirror version
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get Scan time 
     * @return ScanTime Scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scan time
     * @param ScanTime Scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get scan status 
     * @return ScanStatus scan status
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set scan status
     * @param ScanStatus scan status
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Number of security vulnerabilities 
     * @return VulCnt Number of security vulnerabilities
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set Number of security vulnerabilities
     * @param VulCnt Number of security vulnerabilities
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get Number of Trojan viruses 
     * @return VirusCnt Number of Trojan viruses
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set Number of Trojan viruses
     * @param VirusCnt Number of Trojan viruses
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get Number of risky behaviors 
     * @return RiskCnt Number of risky behaviors
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set Number of risky behaviors
     * @param RiskCnt Number of risky behaviors
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get Number of sensitive data items 
     * @return SentiveInfoCnt Number of sensitive data items
     * @deprecated
     */
    @Deprecated
    public Long getSentiveInfoCnt() {
        return this.SentiveInfoCnt;
    }

    /**
     * Set Number of sensitive data items
     * @param SentiveInfoCnt Number of sensitive data items
     * @deprecated
     */
    @Deprecated
    public void setSentiveInfoCnt(Long SentiveInfoCnt) {
        this.SentiveInfoCnt = SentiveInfoCnt;
    }

    /**
     * Get Image system. 
     * @return OsName Image system.
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Image system.
     * @param OsName Image system.
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Trojan scan error 
     * @return ScanVirusError Trojan scan error
     */
    public String getScanVirusError() {
        return this.ScanVirusError;
    }

    /**
     * Set Trojan scan error
     * @param ScanVirusError Trojan scan error
     */
    public void setScanVirusError(String ScanVirusError) {
        this.ScanVirusError = ScanVirusError;
    }

    /**
     * Get Vulnerability scanning error 
     * @return ScanVulError Vulnerability scanning error
     */
    public String getScanVulError() {
        return this.ScanVulError;
    }

    /**
     * Set Vulnerability scanning error
     * @param ScanVulError Vulnerability scanning error
     */
    public void setScanVulError(String ScanVulError) {
        this.ScanVulError = ScanVulError;
    }

    /**
     * Get Layer file information 
     * @return LayerInfo Layer file information
     */
    public String getLayerInfo() {
        return this.LayerInfo;
    }

    /**
     * Set Layer file information
     * @param LayerInfo Layer file information
     */
    public void setLayerInfo(String LayerInfo) {
        this.LayerInfo = LayerInfo;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get High risk scan error 
     * @return ScanRiskError High risk scan error
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set High risk scan error
     * @param ScanRiskError High risk scan error
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get Trojan information scan progress 
     * @return ScanVirusProgress Trojan information scan progress
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set Trojan information scan progress
     * @param ScanVirusProgress Trojan information scan progress
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get Vulnerability scan progress. 
     * @return ScanVulProgress Vulnerability scan progress.
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set Vulnerability scan progress.
     * @param ScanVulProgress Vulnerability scan progress.
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get Sensitive scanning progress 
     * @return ScanRiskProgress Sensitive scanning progress
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set Sensitive scanning progress
     * @param ScanRiskProgress Sensitive scanning progress
     */
    public void setScanRiskProgress(Long ScanRiskProgress) {
        this.ScanRiskProgress = ScanRiskProgress;
    }

    /**
     * Get Remaining scan time (seconds) 
     * @return ScanRemainTime Remaining scan time (seconds)
     */
    public Long getScanRemainTime() {
        return this.ScanRemainTime;
    }

    /**
     * Set Remaining scan time (seconds)
     * @param ScanRemainTime Remaining scan time (seconds)
     */
    public void setScanRemainTime(Long ScanRemainTime) {
        this.ScanRemainTime = ScanRemainTime;
    }

    /**
     * Get cve scan status 
     * @return CveStatus cve scan status
     */
    public String getCveStatus() {
        return this.CveStatus;
    }

    /**
     * Set cve scan status
     * @param CveStatus cve scan status
     */
    public void setCveStatus(String CveStatus) {
        this.CveStatus = CveStatus;
    }

    /**
     * Get High risk scan status 
     * @return RiskStatus High risk scan status
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set High risk scan status
     * @param RiskStatus High risk scan status
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get Trojan scan status 
     * @return VirusStatus Trojan scan status
     */
    public String getVirusStatus() {
        return this.VirusStatus;
    }

    /**
     * Set Trojan scan status
     * @param VirusStatus Trojan scan status
     */
    public void setVirusStatus(String VirusStatus) {
        this.VirusStatus = VirusStatus;
    }

    /**
     * Get Overall progress 
     * @return Progress Overall progress
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Overall progress
     * @param Progress Overall progress
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Authorization status 
     * @return IsAuthorized Authorization status
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set Authorization status
     * @param IsAuthorized Authorization status
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get Image size 
     * @return ImageSize Image size
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size
     * @param ImageSize Image size
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get Image ID. 
     * @return ImageId Image ID.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID.
     * @param ImageId Image ID.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image Zone 
     * @return RegistryRegion Image Zone
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set Image Zone
     * @param RegistryRegion Image Zone
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get Image Creation Time 
     * @return ImageCreateTime Image Creation Time
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set Image Creation Time
     * @param ImageCreateTime Image Creation Time
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get Number of sensitive data items 
     * @return SensitiveInfoCnt Number of sensitive data items
     */
    public Long getSensitiveInfoCnt() {
        return this.SensitiveInfoCnt;
    }

    /**
     * Set Number of sensitive data items
     * @param SensitiveInfoCnt Number of sensitive data items
     */
    public void setSensitiveInfoCnt(Long SensitiveInfoCnt) {
        this.SensitiveInfoCnt = SensitiveInfoCnt;
    }

    /**
     * Get  
     * @return Id 
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 
     * @param Id 
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Solution 
     * @return Solution Solution
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Solution
     * @param Solution Solution
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get Reason 
     * @return Reason Reason
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason
     * @param Reason Reason
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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

    public DescribeAssetImageRegistryDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryDetailResponse(DescribeAssetImageRegistryDetailResponse source) {
        if (source.ImageDigest != null) {
            this.ImageDigest = new String(source.ImageDigest);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.SentiveInfoCnt != null) {
            this.SentiveInfoCnt = new Long(source.SentiveInfoCnt);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.ScanVirusError != null) {
            this.ScanVirusError = new String(source.ScanVirusError);
        }
        if (source.ScanVulError != null) {
            this.ScanVulError = new String(source.ScanVulError);
        }
        if (source.LayerInfo != null) {
            this.LayerInfo = new String(source.LayerInfo);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ScanRiskError != null) {
            this.ScanRiskError = new String(source.ScanRiskError);
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
        if (source.ScanRemainTime != null) {
            this.ScanRemainTime = new Long(source.ScanRemainTime);
        }
        if (source.CveStatus != null) {
            this.CveStatus = new String(source.CveStatus);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.VirusStatus != null) {
            this.VirusStatus = new String(source.VirusStatus);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.SensitiveInfoCnt != null) {
            this.SensitiveInfoCnt = new Long(source.SensitiveInfoCnt);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageDigest", this.ImageDigest);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "SentiveInfoCnt", this.SentiveInfoCnt);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ScanVirusError", this.ScanVirusError);
        this.setParamSimple(map, prefix + "ScanVulError", this.ScanVulError);
        this.setParamSimple(map, prefix + "LayerInfo", this.LayerInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ScanRiskError", this.ScanRiskError);
        this.setParamSimple(map, prefix + "ScanVirusProgress", this.ScanVirusProgress);
        this.setParamSimple(map, prefix + "ScanVulProgress", this.ScanVulProgress);
        this.setParamSimple(map, prefix + "ScanRiskProgress", this.ScanRiskProgress);
        this.setParamSimple(map, prefix + "ScanRemainTime", this.ScanRemainTime);
        this.setParamSimple(map, prefix + "CveStatus", this.CveStatus);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "VirusStatus", this.VirusStatus);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "SensitiveInfoCnt", this.SensitiveInfoCnt);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

