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

public class DescribeAssetImageRegistryDetailResponse extends AbstractModel{

    /**
    * Image digest
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * Image address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * Image type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Repository name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * Scan time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Scanning status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * Number of viruses and trojans
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

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
    @SerializedName("SentiveInfoCnt")
    @Expose
    private Long SentiveInfoCnt;

    /**
    * Image system
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

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
    * Layer file information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LayerInfo")
    @Expose
    private String LayerInfo;

    /**
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Namespace
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * High-risk scan error
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * Vulnerability scanning progress
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
    * Remaining scan time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanRemainTime")
    @Expose
    private Long ScanRemainTime;

    /**
    * CVE scanning status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CveStatus")
    @Expose
    private String CveStatus;

    /**
    * High-risk scanning status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * Trojan scanning status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirusStatus")
    @Expose
    private String VirusStatus;

    /**
    * Overall progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Licensing status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * Image size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Image ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * Image creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Image digest
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageDigest Image digest
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set Image digest
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageDigest Image digest
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get Image address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageRepoAddress Image address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set Image address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageRepoAddress Image address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get Image type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryType Image type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Image type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryType Image type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Repository name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageName Repository name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Repository name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageName Repository name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Image tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageTag Image tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set Image tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageTag Image tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get Scan time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanTime Scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scan time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanTime Scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Scanning status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanStatus Scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanStatus Scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
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
     * @return SentiveInfoCnt Number of sensitive data items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSentiveInfoCnt() {
        return this.SentiveInfoCnt;
    }

    /**
     * Set Number of sensitive data items
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SentiveInfoCnt Number of sensitive data items
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSentiveInfoCnt(Long SentiveInfoCnt) {
        this.SentiveInfoCnt = SentiveInfoCnt;
    }

    /**
     * Get Image system
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OsName Image system
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Image system
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OsName Image system
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
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
     * Get Layer file information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LayerInfo Layer file information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLayerInfo() {
        return this.LayerInfo;
    }

    /**
     * Set Layer file information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LayerInfo Layer file information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLayerInfo(String LayerInfo) {
        this.LayerInfo = LayerInfo;
    }

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Namespace
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Namespace Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Namespace Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get High-risk scan error
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanRiskError High-risk scan error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set High-risk scan error
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanRiskError High-risk scan error
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
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
     * Get Vulnerability scanning progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanVulProgress Vulnerability scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set Vulnerability scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanVulProgress Vulnerability scanning progress
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
     * Get Remaining scan time in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanRemainTime Remaining scan time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanRemainTime() {
        return this.ScanRemainTime;
    }

    /**
     * Set Remaining scan time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanRemainTime Remaining scan time in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanRemainTime(Long ScanRemainTime) {
        this.ScanRemainTime = ScanRemainTime;
    }

    /**
     * Get CVE scanning status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CveStatus CVE scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCveStatus() {
        return this.CveStatus;
    }

    /**
     * Set CVE scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CveStatus CVE scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCveStatus(String CveStatus) {
        this.CveStatus = CveStatus;
    }

    /**
     * Get High-risk scanning status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskStatus High-risk scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set High-risk scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskStatus High-risk scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get Trojan scanning status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirusStatus Trojan scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVirusStatus() {
        return this.VirusStatus;
    }

    /**
     * Set Trojan scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirusStatus Trojan scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirusStatus(String VirusStatus) {
        this.VirusStatus = VirusStatus;
    }

    /**
     * Get Overall progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Overall progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Overall progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Progress Overall progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Licensing status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAuthorized Licensing status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set Licensing status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAuthorized Licensing status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get Image size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageSize Image size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageSize Image size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get Image ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageId Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageId Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryRegion Image region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set Image region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryRegion Image region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get Image creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageCreateTime Image creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set Image creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageCreateTime Image creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

