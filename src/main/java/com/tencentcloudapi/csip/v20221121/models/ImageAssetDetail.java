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

public class ImageAssetDetail extends AbstractModel {

    /**
    * <p>Image digests.</p>
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * <p>Repository address</p>
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * <p>Repository type</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>Image name.</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>Image tag</p>
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>Scan status</p><p>Enumeration values:</p><ul><li>0: Initial state</li><li>1: Issued</li><li>2: Scanning</li><li>3: Scan complete</li><li>4: Scan timeout</li><li>5: Scan failure</li></ul>
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * <p>Number of vulnerabilities</p>
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * <p>Number of Trojans</p>
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * <p>Number of sensitive information entries.</p>
    */
    @SerializedName("SensitiveCnt")
    @Expose
    private Long SensitiveCnt;

    /**
    * <p>Repository instance id.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Image repository name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Namespace.</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Whether to authorize.</p>
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * <p>Image size.</p>
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Repository region</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>Image creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * <p>id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Account name associated with the mirror</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>uin of the associated account of the mirror</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>appid of the account associated with the mirror</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>Number of low-risk vulnerabilities</p>
    */
    @SerializedName("LowLevelVulCnt")
    @Expose
    private Long LowLevelVulCnt;

    /**
    * <p>Medium-risk vulnerability count</p>
    */
    @SerializedName("MediumLevelVulCnt")
    @Expose
    private Long MediumLevelVulCnt;

    /**
    * <p>Number of high-risk vulnerabilities</p>
    */
    @SerializedName("HighLevelVulCnt")
    @Expose
    private Long HighLevelVulCnt;

    /**
    * <p>Number of critical risk vulnerabilities</p>
    */
    @SerializedName("CriticalLevelVulCnt")
    @Expose
    private Long CriticalLevelVulCnt;

    /**
    * <p>Number of low-risk trojans</p>
    */
    @SerializedName("LowLevelVirusCnt")
    @Expose
    private Long LowLevelVirusCnt;

    /**
    * <p>Number of medium-risk trojans</p>
    */
    @SerializedName("MediumLevelVirusCnt")
    @Expose
    private Long MediumLevelVirusCnt;

    /**
    * <p>Number of high-risk trojans</p>
    */
    @SerializedName("HighLevelVirusCnt")
    @Expose
    private Long HighLevelVirusCnt;

    /**
    * <p>Number of severe trojans</p>
    */
    @SerializedName("CriticalLevelVirusCnt")
    @Expose
    private Long CriticalLevelVirusCnt;

    /**
    * <p>Number of emergency vulnerabilities</p>
    */
    @SerializedName("EmergencyVulCnt")
    @Expose
    private Long EmergencyVulCnt;

    /**
    * <p>Number of low-risk sensitive data items</p>
    */
    @SerializedName("LowLevelSensitiveCnt")
    @Expose
    private Long LowLevelSensitiveCnt;

    /**
    * <p>Number of medium-risk sensitive data items</p>
    */
    @SerializedName("MediumLevelSensitiveCnt")
    @Expose
    private Long MediumLevelSensitiveCnt;

    /**
    * <p>Number of high-risk sensitive data items</p>
    */
    @SerializedName("HighLevelSensitiveCnt")
    @Expose
    private Long HighLevelSensitiveCnt;

    /**
    * <p>Number of critical sensitive data items</p>
    */
    @SerializedName("CriticalLevelSensitiveCnt")
    @Expose
    private Long CriticalLevelSensitiveCnt;

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
     * Get <p>Repository address</p> 
     * @return ImageRepoAddress <p>Repository address</p>
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set <p>Repository address</p>
     * @param ImageRepoAddress <p>Repository address</p>
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get <p>Repository type</p> 
     * @return RegistryType <p>Repository type</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>Repository type</p>
     * @param RegistryType <p>Repository type</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
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
     * Get <p>Image tag</p> 
     * @return ImageTag <p>Image tag</p>
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set <p>Image tag</p>
     * @param ImageTag <p>Image tag</p>
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestScanTime <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param LatestScanTime <p>Last scan time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>Scan status</p><p>Enumeration values:</p><ul><li>0: Initial state</li><li>1: Issued</li><li>2: Scanning</li><li>3: Scan complete</li><li>4: Scan timeout</li><li>5: Scan failure</li></ul> 
     * @return ScanStatus <p>Scan status</p><p>Enumeration values:</p><ul><li>0: Initial state</li><li>1: Issued</li><li>2: Scanning</li><li>3: Scan complete</li><li>4: Scan timeout</li><li>5: Scan failure</li></ul>
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set <p>Scan status</p><p>Enumeration values:</p><ul><li>0: Initial state</li><li>1: Issued</li><li>2: Scanning</li><li>3: Scan complete</li><li>4: Scan timeout</li><li>5: Scan failure</li></ul>
     * @param ScanStatus <p>Scan status</p><p>Enumeration values:</p><ul><li>0: Initial state</li><li>1: Issued</li><li>2: Scanning</li><li>3: Scan complete</li><li>4: Scan timeout</li><li>5: Scan failure</li></ul>
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get <p>Number of vulnerabilities</p> 
     * @return VulCnt <p>Number of vulnerabilities</p>
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set <p>Number of vulnerabilities</p>
     * @param VulCnt <p>Number of vulnerabilities</p>
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get <p>Number of Trojans</p> 
     * @return VirusCnt <p>Number of Trojans</p>
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set <p>Number of Trojans</p>
     * @param VirusCnt <p>Number of Trojans</p>
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get <p>Number of sensitive information entries.</p> 
     * @return SensitiveCnt <p>Number of sensitive information entries.</p>
     */
    public Long getSensitiveCnt() {
        return this.SensitiveCnt;
    }

    /**
     * Set <p>Number of sensitive information entries.</p>
     * @param SensitiveCnt <p>Number of sensitive information entries.</p>
     */
    public void setSensitiveCnt(Long SensitiveCnt) {
        this.SensitiveCnt = SensitiveCnt;
    }

    /**
     * Get <p>Repository instance id.</p> 
     * @return InstanceId <p>Repository instance id.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Repository instance id.</p>
     * @param InstanceId <p>Repository instance id.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Image repository name</p> 
     * @return InstanceName <p>Image repository name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Image repository name</p>
     * @param InstanceName <p>Image repository name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Namespace.</p> 
     * @return Namespace <p>Namespace.</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Namespace.</p>
     * @param Namespace <p>Namespace.</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>Whether to authorize.</p> 
     * @return IsAuthorized <p>Whether to authorize.</p>
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set <p>Whether to authorize.</p>
     * @param IsAuthorized <p>Whether to authorize.</p>
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get <p>Image size.</p> 
     * @return ImageSize <p>Image size.</p>
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set <p>Image size.</p>
     * @param ImageSize <p>Image size.</p>
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageId <p>Image ID.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageId <p>Image ID.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Repository region</p> 
     * @return RegistryRegion <p>Repository region</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>Repository region</p>
     * @param RegistryRegion <p>Repository region</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>Image creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return ImageCreateTime <p>Image creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set <p>Image creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param ImageCreateTime <p>Image creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get <p>id</p> 
     * @return Id <p>id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
     * @param Id <p>id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Account name associated with the mirror</p> 
     * @return OwnerAccountName <p>Account name associated with the mirror</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Account name associated with the mirror</p>
     * @param OwnerAccountName <p>Account name associated with the mirror</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>uin of the associated account of the mirror</p> 
     * @return OwnerUin <p>uin of the associated account of the mirror</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin of the associated account of the mirror</p>
     * @param OwnerUin <p>uin of the associated account of the mirror</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>appid of the account associated with the mirror</p> 
     * @return OwnerAppId <p>appid of the account associated with the mirror</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the mirror</p>
     * @param OwnerAppId <p>appid of the account associated with the mirror</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>Number of low-risk vulnerabilities</p> 
     * @return LowLevelVulCnt <p>Number of low-risk vulnerabilities</p>
     */
    public Long getLowLevelVulCnt() {
        return this.LowLevelVulCnt;
    }

    /**
     * Set <p>Number of low-risk vulnerabilities</p>
     * @param LowLevelVulCnt <p>Number of low-risk vulnerabilities</p>
     */
    public void setLowLevelVulCnt(Long LowLevelVulCnt) {
        this.LowLevelVulCnt = LowLevelVulCnt;
    }

    /**
     * Get <p>Medium-risk vulnerability count</p> 
     * @return MediumLevelVulCnt <p>Medium-risk vulnerability count</p>
     */
    public Long getMediumLevelVulCnt() {
        return this.MediumLevelVulCnt;
    }

    /**
     * Set <p>Medium-risk vulnerability count</p>
     * @param MediumLevelVulCnt <p>Medium-risk vulnerability count</p>
     */
    public void setMediumLevelVulCnt(Long MediumLevelVulCnt) {
        this.MediumLevelVulCnt = MediumLevelVulCnt;
    }

    /**
     * Get <p>Number of high-risk vulnerabilities</p> 
     * @return HighLevelVulCnt <p>Number of high-risk vulnerabilities</p>
     */
    public Long getHighLevelVulCnt() {
        return this.HighLevelVulCnt;
    }

    /**
     * Set <p>Number of high-risk vulnerabilities</p>
     * @param HighLevelVulCnt <p>Number of high-risk vulnerabilities</p>
     */
    public void setHighLevelVulCnt(Long HighLevelVulCnt) {
        this.HighLevelVulCnt = HighLevelVulCnt;
    }

    /**
     * Get <p>Number of critical risk vulnerabilities</p> 
     * @return CriticalLevelVulCnt <p>Number of critical risk vulnerabilities</p>
     */
    public Long getCriticalLevelVulCnt() {
        return this.CriticalLevelVulCnt;
    }

    /**
     * Set <p>Number of critical risk vulnerabilities</p>
     * @param CriticalLevelVulCnt <p>Number of critical risk vulnerabilities</p>
     */
    public void setCriticalLevelVulCnt(Long CriticalLevelVulCnt) {
        this.CriticalLevelVulCnt = CriticalLevelVulCnt;
    }

    /**
     * Get <p>Number of low-risk trojans</p> 
     * @return LowLevelVirusCnt <p>Number of low-risk trojans</p>
     */
    public Long getLowLevelVirusCnt() {
        return this.LowLevelVirusCnt;
    }

    /**
     * Set <p>Number of low-risk trojans</p>
     * @param LowLevelVirusCnt <p>Number of low-risk trojans</p>
     */
    public void setLowLevelVirusCnt(Long LowLevelVirusCnt) {
        this.LowLevelVirusCnt = LowLevelVirusCnt;
    }

    /**
     * Get <p>Number of medium-risk trojans</p> 
     * @return MediumLevelVirusCnt <p>Number of medium-risk trojans</p>
     */
    public Long getMediumLevelVirusCnt() {
        return this.MediumLevelVirusCnt;
    }

    /**
     * Set <p>Number of medium-risk trojans</p>
     * @param MediumLevelVirusCnt <p>Number of medium-risk trojans</p>
     */
    public void setMediumLevelVirusCnt(Long MediumLevelVirusCnt) {
        this.MediumLevelVirusCnt = MediumLevelVirusCnt;
    }

    /**
     * Get <p>Number of high-risk trojans</p> 
     * @return HighLevelVirusCnt <p>Number of high-risk trojans</p>
     */
    public Long getHighLevelVirusCnt() {
        return this.HighLevelVirusCnt;
    }

    /**
     * Set <p>Number of high-risk trojans</p>
     * @param HighLevelVirusCnt <p>Number of high-risk trojans</p>
     */
    public void setHighLevelVirusCnt(Long HighLevelVirusCnt) {
        this.HighLevelVirusCnt = HighLevelVirusCnt;
    }

    /**
     * Get <p>Number of severe trojans</p> 
     * @return CriticalLevelVirusCnt <p>Number of severe trojans</p>
     */
    public Long getCriticalLevelVirusCnt() {
        return this.CriticalLevelVirusCnt;
    }

    /**
     * Set <p>Number of severe trojans</p>
     * @param CriticalLevelVirusCnt <p>Number of severe trojans</p>
     */
    public void setCriticalLevelVirusCnt(Long CriticalLevelVirusCnt) {
        this.CriticalLevelVirusCnt = CriticalLevelVirusCnt;
    }

    /**
     * Get <p>Number of emergency vulnerabilities</p> 
     * @return EmergencyVulCnt <p>Number of emergency vulnerabilities</p>
     */
    public Long getEmergencyVulCnt() {
        return this.EmergencyVulCnt;
    }

    /**
     * Set <p>Number of emergency vulnerabilities</p>
     * @param EmergencyVulCnt <p>Number of emergency vulnerabilities</p>
     */
    public void setEmergencyVulCnt(Long EmergencyVulCnt) {
        this.EmergencyVulCnt = EmergencyVulCnt;
    }

    /**
     * Get <p>Number of low-risk sensitive data items</p> 
     * @return LowLevelSensitiveCnt <p>Number of low-risk sensitive data items</p>
     */
    public Long getLowLevelSensitiveCnt() {
        return this.LowLevelSensitiveCnt;
    }

    /**
     * Set <p>Number of low-risk sensitive data items</p>
     * @param LowLevelSensitiveCnt <p>Number of low-risk sensitive data items</p>
     */
    public void setLowLevelSensitiveCnt(Long LowLevelSensitiveCnt) {
        this.LowLevelSensitiveCnt = LowLevelSensitiveCnt;
    }

    /**
     * Get <p>Number of medium-risk sensitive data items</p> 
     * @return MediumLevelSensitiveCnt <p>Number of medium-risk sensitive data items</p>
     */
    public Long getMediumLevelSensitiveCnt() {
        return this.MediumLevelSensitiveCnt;
    }

    /**
     * Set <p>Number of medium-risk sensitive data items</p>
     * @param MediumLevelSensitiveCnt <p>Number of medium-risk sensitive data items</p>
     */
    public void setMediumLevelSensitiveCnt(Long MediumLevelSensitiveCnt) {
        this.MediumLevelSensitiveCnt = MediumLevelSensitiveCnt;
    }

    /**
     * Get <p>Number of high-risk sensitive data items</p> 
     * @return HighLevelSensitiveCnt <p>Number of high-risk sensitive data items</p>
     */
    public Long getHighLevelSensitiveCnt() {
        return this.HighLevelSensitiveCnt;
    }

    /**
     * Set <p>Number of high-risk sensitive data items</p>
     * @param HighLevelSensitiveCnt <p>Number of high-risk sensitive data items</p>
     */
    public void setHighLevelSensitiveCnt(Long HighLevelSensitiveCnt) {
        this.HighLevelSensitiveCnt = HighLevelSensitiveCnt;
    }

    /**
     * Get <p>Number of critical sensitive data items</p> 
     * @return CriticalLevelSensitiveCnt <p>Number of critical sensitive data items</p>
     */
    public Long getCriticalLevelSensitiveCnt() {
        return this.CriticalLevelSensitiveCnt;
    }

    /**
     * Set <p>Number of critical sensitive data items</p>
     * @param CriticalLevelSensitiveCnt <p>Number of critical sensitive data items</p>
     */
    public void setCriticalLevelSensitiveCnt(Long CriticalLevelSensitiveCnt) {
        this.CriticalLevelSensitiveCnt = CriticalLevelSensitiveCnt;
    }

    public ImageAssetDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAssetDetail(ImageAssetDetail source) {
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
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.SensitiveCnt != null) {
            this.SensitiveCnt = new Long(source.SensitiveCnt);
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.LowLevelVulCnt != null) {
            this.LowLevelVulCnt = new Long(source.LowLevelVulCnt);
        }
        if (source.MediumLevelVulCnt != null) {
            this.MediumLevelVulCnt = new Long(source.MediumLevelVulCnt);
        }
        if (source.HighLevelVulCnt != null) {
            this.HighLevelVulCnt = new Long(source.HighLevelVulCnt);
        }
        if (source.CriticalLevelVulCnt != null) {
            this.CriticalLevelVulCnt = new Long(source.CriticalLevelVulCnt);
        }
        if (source.LowLevelVirusCnt != null) {
            this.LowLevelVirusCnt = new Long(source.LowLevelVirusCnt);
        }
        if (source.MediumLevelVirusCnt != null) {
            this.MediumLevelVirusCnt = new Long(source.MediumLevelVirusCnt);
        }
        if (source.HighLevelVirusCnt != null) {
            this.HighLevelVirusCnt = new Long(source.HighLevelVirusCnt);
        }
        if (source.CriticalLevelVirusCnt != null) {
            this.CriticalLevelVirusCnt = new Long(source.CriticalLevelVirusCnt);
        }
        if (source.EmergencyVulCnt != null) {
            this.EmergencyVulCnt = new Long(source.EmergencyVulCnt);
        }
        if (source.LowLevelSensitiveCnt != null) {
            this.LowLevelSensitiveCnt = new Long(source.LowLevelSensitiveCnt);
        }
        if (source.MediumLevelSensitiveCnt != null) {
            this.MediumLevelSensitiveCnt = new Long(source.MediumLevelSensitiveCnt);
        }
        if (source.HighLevelSensitiveCnt != null) {
            this.HighLevelSensitiveCnt = new Long(source.HighLevelSensitiveCnt);
        }
        if (source.CriticalLevelSensitiveCnt != null) {
            this.CriticalLevelSensitiveCnt = new Long(source.CriticalLevelSensitiveCnt);
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
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "SensitiveCnt", this.SensitiveCnt);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "LowLevelVulCnt", this.LowLevelVulCnt);
        this.setParamSimple(map, prefix + "MediumLevelVulCnt", this.MediumLevelVulCnt);
        this.setParamSimple(map, prefix + "HighLevelVulCnt", this.HighLevelVulCnt);
        this.setParamSimple(map, prefix + "CriticalLevelVulCnt", this.CriticalLevelVulCnt);
        this.setParamSimple(map, prefix + "LowLevelVirusCnt", this.LowLevelVirusCnt);
        this.setParamSimple(map, prefix + "MediumLevelVirusCnt", this.MediumLevelVirusCnt);
        this.setParamSimple(map, prefix + "HighLevelVirusCnt", this.HighLevelVirusCnt);
        this.setParamSimple(map, prefix + "CriticalLevelVirusCnt", this.CriticalLevelVirusCnt);
        this.setParamSimple(map, prefix + "EmergencyVulCnt", this.EmergencyVulCnt);
        this.setParamSimple(map, prefix + "LowLevelSensitiveCnt", this.LowLevelSensitiveCnt);
        this.setParamSimple(map, prefix + "MediumLevelSensitiveCnt", this.MediumLevelSensitiveCnt);
        this.setParamSimple(map, prefix + "HighLevelSensitiveCnt", this.HighLevelSensitiveCnt);
        this.setParamSimple(map, prefix + "CriticalLevelSensitiveCnt", this.CriticalLevelSensitiveCnt);

    }
}

