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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodVolume extends AbstractModel {

    /**
    * Storage type. Valid values: `pvc` and `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VolumeType")
    @Expose
    private String VolumeType;

    /**
    * This field will take effect if `VolumeType` is `pvc`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PVCVolume")
    @Expose
    private PersistentVolumeContext PVCVolume;

    /**
    * This field will take effect if `VolumeType` is `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostVolume")
    @Expose
    private HostVolumeContext HostVolume;

    /**
     * Get Storage type. Valid values: `pvc` and `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VolumeType Storage type. Valid values: `pvc` and `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVolumeType() {
        return this.VolumeType;
    }

    /**
     * Set Storage type. Valid values: `pvc` and `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VolumeType Storage type. Valid values: `pvc` and `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVolumeType(String VolumeType) {
        this.VolumeType = VolumeType;
    }

    /**
     * Get This field will take effect if `VolumeType` is `pvc`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PVCVolume This field will take effect if `VolumeType` is `pvc`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PersistentVolumeContext getPVCVolume() {
        return this.PVCVolume;
    }

    /**
     * Set This field will take effect if `VolumeType` is `pvc`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PVCVolume This field will take effect if `VolumeType` is `pvc`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPVCVolume(PersistentVolumeContext PVCVolume) {
        this.PVCVolume = PVCVolume;
    }

    /**
     * Get This field will take effect if `VolumeType` is `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostVolume This field will take effect if `VolumeType` is `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HostVolumeContext getHostVolume() {
        return this.HostVolume;
    }

    /**
     * Set This field will take effect if `VolumeType` is `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostVolume This field will take effect if `VolumeType` is `hostpath`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostVolume(HostVolumeContext HostVolume) {
        this.HostVolume = HostVolume;
    }

    public PodVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodVolume(PodVolume source) {
        if (source.VolumeType != null) {
            this.VolumeType = new String(source.VolumeType);
        }
        if (source.PVCVolume != null) {
            this.PVCVolume = new PersistentVolumeContext(source.PVCVolume);
        }
        if (source.HostVolume != null) {
            this.HostVolume = new HostVolumeContext(source.HostVolume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeType", this.VolumeType);
        this.setParamObj(map, prefix + "PVCVolume.", this.PVCVolume);
        this.setParamObj(map, prefix + "HostVolume.", this.HostVolume);

    }
}

