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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodVolume extends AbstractModel {

    /**
    * Storage type. Valid values: "pvc" and "hostpath".
    */
    @SerializedName("VolumeType")
    @Expose
    private String VolumeType;

    /**
    * When VolumeType is set to "pvc", this parameter takes effect.
    */
    @SerializedName("PVCVolume")
    @Expose
    private PersistentVolumeContext PVCVolume;

    /**
    * When VolumeType is set to "hostpath", this parameter takes effect.
    */
    @SerializedName("HostVolume")
    @Expose
    private HostVolumeContext HostVolume;

    /**
     * Get Storage type. Valid values: "pvc" and "hostpath". 
     * @return VolumeType Storage type. Valid values: "pvc" and "hostpath".
     */
    public String getVolumeType() {
        return this.VolumeType;
    }

    /**
     * Set Storage type. Valid values: "pvc" and "hostpath".
     * @param VolumeType Storage type. Valid values: "pvc" and "hostpath".
     */
    public void setVolumeType(String VolumeType) {
        this.VolumeType = VolumeType;
    }

    /**
     * Get When VolumeType is set to "pvc", this parameter takes effect. 
     * @return PVCVolume When VolumeType is set to "pvc", this parameter takes effect.
     */
    public PersistentVolumeContext getPVCVolume() {
        return this.PVCVolume;
    }

    /**
     * Set When VolumeType is set to "pvc", this parameter takes effect.
     * @param PVCVolume When VolumeType is set to "pvc", this parameter takes effect.
     */
    public void setPVCVolume(PersistentVolumeContext PVCVolume) {
        this.PVCVolume = PVCVolume;
    }

    /**
     * Get When VolumeType is set to "hostpath", this parameter takes effect. 
     * @return HostVolume When VolumeType is set to "hostpath", this parameter takes effect.
     */
    public HostVolumeContext getHostVolume() {
        return this.HostVolume;
    }

    /**
     * Set When VolumeType is set to "hostpath", this parameter takes effect.
     * @param HostVolume When VolumeType is set to "hostpath", this parameter takes effect.
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

