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

public class UpdateImageRegistryTimingScanTaskRequest extends AbstractModel {

    /**
    * Scheduled scan cycle
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * Scheduled scan switch
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Scheduled scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Array of the scanned trojan types
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * Scanned image
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * Whether to scan all
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * ID of the image to be scanned
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
    * Whether to scan for the latest version
    */
    @SerializedName("Latest")
    @Expose
    private Boolean Latest;

    /**
    * Whether running containers exist
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Boolean ContainerRunning;

    /**
    * Scan End Time
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * Scan Scope: 0 All Images, 1 Custom Images, 2 Recommended Scan Images
    */
    @SerializedName("ScanScope")
    @Expose
    private Long ScanScope;

    /**
    * Repository Type tcr,ccr,harbor
    */
    @SerializedName("RegistryType")
    @Expose
    private String [] RegistryType;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String [] Namespace;

    /**
     * Get Scheduled scan cycle 
     * @return ScanPeriod Scheduled scan cycle
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set Scheduled scan cycle
     * @param ScanPeriod Scheduled scan cycle
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get Scheduled scan switch 
     * @return Enable Scheduled scan switch
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Scheduled scan switch
     * @param Enable Scheduled scan switch
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Scheduled scan time 
     * @return ScanTime Scheduled scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scheduled scan time
     * @param ScanTime Scheduled scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Array of the scanned trojan types 
     * @return ScanType Array of the scanned trojan types
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set Array of the scanned trojan types
     * @param ScanType Array of the scanned trojan types
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get Scanned image 
     * @return Images Scanned image
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set Scanned image
     * @param Images Scanned image
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get Whether to scan all 
     * @return All Whether to scan all
     * @deprecated
     */
    @Deprecated
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Whether to scan all
     * @param All Whether to scan all
     * @deprecated
     */
    @Deprecated
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get ID of the image to be scanned 
     * @return Id ID of the image to be scanned
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set ID of the image to be scanned
     * @param Id ID of the image to be scanned
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    /**
     * Get Whether to scan for the latest version 
     * @return Latest Whether to scan for the latest version
     */
    public Boolean getLatest() {
        return this.Latest;
    }

    /**
     * Set Whether to scan for the latest version
     * @param Latest Whether to scan for the latest version
     */
    public void setLatest(Boolean Latest) {
        this.Latest = Latest;
    }

    /**
     * Get Whether running containers exist 
     * @return ContainerRunning Whether running containers exist
     */
    public Boolean getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set Whether running containers exist
     * @param ContainerRunning Whether running containers exist
     */
    public void setContainerRunning(Boolean ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get Scan End Time 
     * @return ScanEndTime Scan End Time
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set Scan End Time
     * @param ScanEndTime Scan End Time
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get Scan Scope: 0 All Images, 1 Custom Images, 2 Recommended Scan Images 
     * @return ScanScope Scan Scope: 0 All Images, 1 Custom Images, 2 Recommended Scan Images
     */
    public Long getScanScope() {
        return this.ScanScope;
    }

    /**
     * Set Scan Scope: 0 All Images, 1 Custom Images, 2 Recommended Scan Images
     * @param ScanScope Scan Scope: 0 All Images, 1 Custom Images, 2 Recommended Scan Images
     */
    public void setScanScope(Long ScanScope) {
        this.ScanScope = ScanScope;
    }

    /**
     * Get Repository Type tcr,ccr,harbor 
     * @return RegistryType Repository Type tcr,ccr,harbor
     */
    public String [] getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Repository Type tcr,ccr,harbor
     * @param RegistryType Repository Type tcr,ccr,harbor
     */
    public void setRegistryType(String [] RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String [] Namespace) {
        this.Namespace = Namespace;
    }

    public UpdateImageRegistryTimingScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateImageRegistryTimingScanTaskRequest(UpdateImageRegistryTimingScanTaskRequest source) {
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new Long(source.ScanPeriod);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
        if (source.Latest != null) {
            this.Latest = new Boolean(source.Latest);
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Boolean(source.ContainerRunning);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.ScanScope != null) {
            this.ScanScope = new Long(source.ScanScope);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String[source.RegistryType.length];
            for (int i = 0; i < source.RegistryType.length; i++) {
                this.RegistryType[i] = new String(source.RegistryType[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new String(source.Namespace[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamSimple(map, prefix + "Latest", this.Latest);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "ScanScope", this.ScanScope);
        this.setParamArraySimple(map, prefix + "RegistryType.", this.RegistryType);
        this.setParamArraySimple(map, prefix + "Namespace.", this.Namespace);

    }
}

