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

public class ImageProgress extends AbstractModel{

    /**
    * Image ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Repository type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Image repository address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

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
    * Image scanning status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * CVE scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CveProgress")
    @Expose
    private Long CveProgress;

    /**
    * Sensitive data scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskProgress")
    @Expose
    private Long RiskProgress;

    /**
    * Trojan scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirusProgress")
    @Expose
    private Long VirusProgress;

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
     * Get Repository type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistryType Repository type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Repository type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistryType Repository type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Image repository address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageRepoAddress Image repository address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set Image repository address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageRepoAddress Image repository address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
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
     * Get CVE scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CveProgress CVE scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCveProgress() {
        return this.CveProgress;
    }

    /**
     * Set CVE scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CveProgress CVE scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCveProgress(Long CveProgress) {
        this.CveProgress = CveProgress;
    }

    /**
     * Get Sensitive data scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskProgress Sensitive data scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskProgress() {
        return this.RiskProgress;
    }

    /**
     * Set Sensitive data scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskProgress Sensitive data scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskProgress(Long RiskProgress) {
        this.RiskProgress = RiskProgress;
    }

    /**
     * Get Trojan scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirusProgress Trojan scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVirusProgress() {
        return this.VirusProgress;
    }

    /**
     * Set Trojan scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirusProgress Trojan scanning progress of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirusProgress(Long VirusProgress) {
        this.VirusProgress = VirusProgress;
    }

    public ImageProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProgress(ImageProgress source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
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
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.CveProgress != null) {
            this.CveProgress = new Long(source.CveProgress);
        }
        if (source.RiskProgress != null) {
            this.RiskProgress = new Long(source.RiskProgress);
        }
        if (source.VirusProgress != null) {
            this.VirusProgress = new Long(source.VirusProgress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "CveProgress", this.CveProgress);
        this.setParamSimple(map, prefix + "RiskProgress", this.RiskProgress);
        this.setParamSimple(map, prefix + "VirusProgress", this.VirusProgress);

    }
}

