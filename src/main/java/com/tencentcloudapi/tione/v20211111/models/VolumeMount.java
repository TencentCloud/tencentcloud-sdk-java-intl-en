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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeMount extends AbstractModel {

    /**
    * Cloud File Storage (CFS) configuration information.
    */
    @SerializedName("CFSConfig")
    @Expose
    private CFSConfig CFSConfig;

    /**
    * Mounting source type. Valid values: CFS and COS. The default value is CFS.
    */
    @SerializedName("VolumeSourceType")
    @Expose
    private String VolumeSourceType;

    /**
    * Mounting path in the custom container.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
     * Get Cloud File Storage (CFS) configuration information. 
     * @return CFSConfig Cloud File Storage (CFS) configuration information.
     */
    public CFSConfig getCFSConfig() {
        return this.CFSConfig;
    }

    /**
     * Set Cloud File Storage (CFS) configuration information.
     * @param CFSConfig Cloud File Storage (CFS) configuration information.
     */
    public void setCFSConfig(CFSConfig CFSConfig) {
        this.CFSConfig = CFSConfig;
    }

    /**
     * Get Mounting source type. Valid values: CFS and COS. The default value is CFS. 
     * @return VolumeSourceType Mounting source type. Valid values: CFS and COS. The default value is CFS.
     */
    public String getVolumeSourceType() {
        return this.VolumeSourceType;
    }

    /**
     * Set Mounting source type. Valid values: CFS and COS. The default value is CFS.
     * @param VolumeSourceType Mounting source type. Valid values: CFS and COS. The default value is CFS.
     */
    public void setVolumeSourceType(String VolumeSourceType) {
        this.VolumeSourceType = VolumeSourceType;
    }

    /**
     * Get Mounting path in the custom container.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MountPath Mounting path in the custom container.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set Mounting path in the custom container.Note: This field may return null, indicating that no valid values can be obtained.
     * @param MountPath Mounting path in the custom container.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    public VolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeMount(VolumeMount source) {
        if (source.CFSConfig != null) {
            this.CFSConfig = new CFSConfig(source.CFSConfig);
        }
        if (source.VolumeSourceType != null) {
            this.VolumeSourceType = new String(source.VolumeSourceType);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CFSConfig.", this.CFSConfig);
        this.setParamSimple(map, prefix + "VolumeSourceType", this.VolumeSourceType);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);

    }
}

