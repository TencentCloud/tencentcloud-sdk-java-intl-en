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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Disk extends AbstractModel {

    /**
    * Cloud disk type
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Cloud disk size (GB)
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Whether to automatically format and mount disks.
    */
    @SerializedName("AutoFormatAndMount")
    @Expose
    private Boolean AutoFormatAndMount;

    /**
    * File system
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

    /**
    * Mounting directory
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
     * Get Cloud disk type 
     * @return DiskType Cloud disk type
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk type
     * @param DiskType Cloud disk type
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Cloud disk size (GB) 
     * @return DiskSize Cloud disk size (GB)
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size (GB)
     * @param DiskSize Cloud disk size (GB)
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Whether to automatically format and mount disks. 
     * @return AutoFormatAndMount Whether to automatically format and mount disks.
     */
    public Boolean getAutoFormatAndMount() {
        return this.AutoFormatAndMount;
    }

    /**
     * Set Whether to automatically format and mount disks.
     * @param AutoFormatAndMount Whether to automatically format and mount disks.
     */
    public void setAutoFormatAndMount(Boolean AutoFormatAndMount) {
        this.AutoFormatAndMount = AutoFormatAndMount;
    }

    /**
     * Get File system 
     * @return FileSystem File system
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set File system
     * @param FileSystem File system
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get Mounting directory 
     * @return MountTarget Mounting directory
     */
    public String getMountTarget() {
        return this.MountTarget;
    }

    /**
     * Set Mounting directory
     * @param MountTarget Mounting directory
     */
    public void setMountTarget(String MountTarget) {
        this.MountTarget = MountTarget;
    }

    public Disk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Disk(Disk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.AutoFormatAndMount != null) {
            this.AutoFormatAndMount = new Boolean(source.AutoFormatAndMount);
        }
        if (source.FileSystem != null) {
            this.FileSystem = new String(source.FileSystem);
        }
        if (source.MountTarget != null) {
            this.MountTarget = new String(source.MountTarget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "AutoFormatAndMount", this.AutoFormatAndMount);
        this.setParamSimple(map, prefix + "FileSystem", this.FileSystem);
        this.setParamSimple(map, prefix + "MountTarget", this.MountTarget);

    }
}

