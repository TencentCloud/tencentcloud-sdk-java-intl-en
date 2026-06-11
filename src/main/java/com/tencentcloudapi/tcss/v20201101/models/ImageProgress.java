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

public class ImageProgress extends AbstractModel {

    /**
    * Image id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * repository type
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Image repository address
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

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
    * repository name
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
    * Image scan status
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * Mirror cve scan progress
    */
    @SerializedName("CveProgress")
    @Expose
    private Long CveProgress;

    /**
    * Mirror sensitivity scan progress
    */
    @SerializedName("RiskProgress")
    @Expose
    private Long RiskProgress;

    /**
    * Trojan mirror scan progress
    */
    @SerializedName("VirusProgress")
    @Expose
    private Long VirusProgress;

    /**
     * Get Image id 
     * @return ImageId Image id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image id
     * @param ImageId Image id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get repository type 
     * @return RegistryType repository type
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set repository type
     * @param RegistryType repository type
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
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
     * Get repository name 
     * @return ImageName repository name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set repository name
     * @param ImageName repository name
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
     * Get Image scan status 
     * @return ScanStatus Image scan status
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Image scan status
     * @param ScanStatus Image scan status
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Mirror cve scan progress 
     * @return CveProgress Mirror cve scan progress
     */
    public Long getCveProgress() {
        return this.CveProgress;
    }

    /**
     * Set Mirror cve scan progress
     * @param CveProgress Mirror cve scan progress
     */
    public void setCveProgress(Long CveProgress) {
        this.CveProgress = CveProgress;
    }

    /**
     * Get Mirror sensitivity scan progress 
     * @return RiskProgress Mirror sensitivity scan progress
     */
    public Long getRiskProgress() {
        return this.RiskProgress;
    }

    /**
     * Set Mirror sensitivity scan progress
     * @param RiskProgress Mirror sensitivity scan progress
     */
    public void setRiskProgress(Long RiskProgress) {
        this.RiskProgress = RiskProgress;
    }

    /**
     * Get Trojan mirror scan progress 
     * @return VirusProgress Trojan mirror scan progress
     */
    public Long getVirusProgress() {
        return this.VirusProgress;
    }

    /**
     * Set Trojan mirror scan progress
     * @param VirusProgress Trojan mirror scan progress
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

