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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Volume extends AbstractModel {

    /**
    * Volume ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VolumeId")
    @Expose
    private String VolumeId;

    /**
    * Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Environment ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Volume type. Valid values:
* SHARED: Multi-point mount shared storage
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Volume size (GB)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * Volume usage (Byte)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
    * Volume throughput upper limit (MiB/s)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Float BandwidthLimit;

    /**
    * Default mount path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultMountPath")
    @Expose
    private String DefaultMountPath;

    /**
    * Whether it is the default volume.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Volume ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VolumeId Volume ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVolumeId() {
        return this.VolumeId;
    }

    /**
     * Set Volume ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VolumeId Volume ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVolumeId(String VolumeId) {
        this.VolumeId = VolumeId;
    }

    /**
     * Get Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Environment ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentId Environment ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentId Environment ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Volume type. Valid values:
* SHARED: Multi-point mount shared storage
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Volume type. Valid values:
* SHARED: Multi-point mount shared storage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Volume type. Valid values:
* SHARED: Multi-point mount shared storage
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Volume type. Valid values:
* SHARED: Multi-point mount shared storage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Spec Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Spec Volume specifications. Valid values:

- SD: standard
- HP: high-performance
- TB: standard Turbo
- TP: high-performance Turbo
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Volume size (GB)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Capacity Volume size (GB)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set Volume size (GB)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Capacity Volume size (GB)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get Volume usage (Byte)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Usage Volume usage (Byte)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set Volume usage (Byte)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Usage Volume usage (Byte)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    /**
     * Get Volume throughput upper limit (MiB/s)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BandwidthLimit Volume throughput upper limit (MiB/s)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set Volume throughput upper limit (MiB/s)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BandwidthLimit Volume throughput upper limit (MiB/s)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidthLimit(Float BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get Default mount path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultMountPath Default mount path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultMountPath() {
        return this.DefaultMountPath;
    }

    /**
     * Set Default mount path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultMountPath Default mount path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultMountPath(String DefaultMountPath) {
        this.DefaultMountPath = DefaultMountPath;
    }

    /**
     * Get Whether it is the default volume.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDefault Whether it is the default volume.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default volume.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDefault Whether it is the default volume.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Volume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Volume(Volume source) {
        if (source.VolumeId != null) {
            this.VolumeId = new String(source.VolumeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
        if (source.BandwidthLimit != null) {
            this.BandwidthLimit = new Float(source.BandwidthLimit);
        }
        if (source.DefaultMountPath != null) {
            this.DefaultMountPath = new String(source.DefaultMountPath);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeId", this.VolumeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);
        this.setParamSimple(map, prefix + "DefaultMountPath", this.DefaultMountPath);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

