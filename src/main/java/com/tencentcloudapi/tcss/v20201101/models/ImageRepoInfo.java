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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRepoInfo extends AbstractModel {

    /**
    * Image digest
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * Image repository address
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * Repository type
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image tag
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * Image size
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Last scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Scanning status
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * Number of vulnerabilities
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * Number of viruses and trojans
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
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
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
    * High-risk scan error
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * Vulnerability scanning progress
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
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * Repository region
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * List of IDs
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Image ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * Whether it is the latest image tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
     * Get Image digest 
     * @return ImageDigest Image digest
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set Image digest
     * @param ImageDigest Image digest
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get Image repository address 
     * @return ImageRepoAddress Image repository address
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set Image repository address
     * @param ImageRepoAddress Image repository address
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get Repository type 
     * @return RegistryType Repository type
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Repository type
     * @param RegistryType Repository type
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
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
     * Get Image tag 
     * @return ImageTag Image tag
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set Image tag
     * @param ImageTag Image tag
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
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
     * Get Last scan time 
     * @return ScanTime Last scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Last scan time
     * @param ScanTime Last scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Scanning status 
     * @return ScanStatus Scanning status
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Scanning status
     * @param ScanStatus Scanning status
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Number of vulnerabilities 
     * @return VulCnt Number of vulnerabilities
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set Number of vulnerabilities
     * @param VulCnt Number of vulnerabilities
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get Number of viruses and trojans 
     * @return VirusCnt Number of viruses and trojans
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set Number of viruses and trojans
     * @param VirusCnt Number of viruses and trojans
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
     */
    public Long getSentiveInfoCnt() {
        return this.SentiveInfoCnt;
    }

    /**
     * Set Number of sensitive data items
     * @param SentiveInfoCnt Number of sensitive data items
     */
    public void setSentiveInfoCnt(Long SentiveInfoCnt) {
        this.SentiveInfoCnt = SentiveInfoCnt;
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
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
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
     * Get Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanVirusProgress Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanVirusProgress Sensitive data scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanVulProgress Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanVulProgress Trojan scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get Vulnerability scanning progress
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanRiskProgress Vulnerability scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set Vulnerability scanning progress
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanRiskProgress Vulnerability scanning progress
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
     * @return IsAuthorized Licensing status
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set Licensing status
     * @param IsAuthorized Licensing status
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get Repository region 
     * @return RegistryRegion Repository region
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set Repository region
     * @param RegistryRegion Repository region
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get List of IDs 
     * @return Id List of IDs
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set List of IDs
     * @param Id List of IDs
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get Whether it is the latest image tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsLatestImage Whether it is the latest image tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set Whether it is the latest image tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsLatestImage Whether it is the latest image tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    public ImageRepoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRepoInfo(ImageRepoInfo source) {
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
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
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
        if (source.IsTrustImage != null) {
            this.IsTrustImage = new Boolean(source.IsTrustImage);
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
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
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
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "SentiveInfoCnt", this.SentiveInfoCnt);
        this.setParamSimple(map, prefix + "IsTrustImage", this.IsTrustImage);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ScanVirusError", this.ScanVirusError);
        this.setParamSimple(map, prefix + "ScanVulError", this.ScanVulError);
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
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);

    }
}

