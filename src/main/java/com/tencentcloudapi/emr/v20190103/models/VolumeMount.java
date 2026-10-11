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

public class VolumeMount extends AbstractModel {

    /**
    * Mount volume name.
    */
    @SerializedName("MountName")
    @Expose
    private String MountName;

    /**
    * Mount path.
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * Mount type.
    */
    @SerializedName("SubPathMode")
    @Expose
    private String SubPathMode;

    /**
    * Sub-path.
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * Mounting mode. Valid values: ReadWrite and OnlyRead.
    */
    @SerializedName("MountMode")
    @Expose
    private String MountMode;

    /**
     * Get Mount volume name. 
     * @return MountName Mount volume name.
     */
    public String getMountName() {
        return this.MountName;
    }

    /**
     * Set Mount volume name.
     * @param MountName Mount volume name.
     */
    public void setMountName(String MountName) {
        this.MountName = MountName;
    }

    /**
     * Get Mount path. 
     * @return MountPath Mount path.
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set Mount path.
     * @param MountPath Mount path.
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get Mount type. 
     * @return SubPathMode Mount type.
     */
    public String getSubPathMode() {
        return this.SubPathMode;
    }

    /**
     * Set Mount type.
     * @param SubPathMode Mount type.
     */
    public void setSubPathMode(String SubPathMode) {
        this.SubPathMode = SubPathMode;
    }

    /**
     * Get Sub-path. 
     * @return SubPath Sub-path.
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set Sub-path.
     * @param SubPath Sub-path.
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get Mounting mode. Valid values: ReadWrite and OnlyRead. 
     * @return MountMode Mounting mode. Valid values: ReadWrite and OnlyRead.
     */
    public String getMountMode() {
        return this.MountMode;
    }

    /**
     * Set Mounting mode. Valid values: ReadWrite and OnlyRead.
     * @param MountMode Mounting mode. Valid values: ReadWrite and OnlyRead.
     */
    public void setMountMode(String MountMode) {
        this.MountMode = MountMode;
    }

    public VolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeMount(VolumeMount source) {
        if (source.MountName != null) {
            this.MountName = new String(source.MountName);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.SubPathMode != null) {
            this.SubPathMode = new String(source.SubPathMode);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.MountMode != null) {
            this.MountMode = new String(source.MountMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountName", this.MountName);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "SubPathMode", this.SubPathMode);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "MountMode", this.MountMode);

    }
}

