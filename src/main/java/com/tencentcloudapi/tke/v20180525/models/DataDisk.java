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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel{

    /**
    * Disk type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * File system (ext3/ext4/xfs)
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

    /**
    * Disk size (G)
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Whether the disk is auto-formatted and mounted
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AutoFormatAndMount")
    @Expose
    private Boolean AutoFormatAndMount;

    /**
    * Mounting directory
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
     * Get Disk type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DiskType Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DiskType Disk type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get File system (ext3/ext4/xfs)
Note: This field may return null, indicating that no valid value was found. 
     * @return FileSystem File system (ext3/ext4/xfs)
Note: This field may return null, indicating that no valid value was found.
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set File system (ext3/ext4/xfs)
Note: This field may return null, indicating that no valid value was found.
     * @param FileSystem File system (ext3/ext4/xfs)
Note: This field may return null, indicating that no valid value was found.
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get Disk size (G)
Note: This field may return null, indicating that no valid value was found. 
     * @return DiskSize Disk size (G)
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size (G)
Note: This field may return null, indicating that no valid value was found.
     * @param DiskSize Disk size (G)
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Whether the disk is auto-formatted and mounted
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return AutoFormatAndMount Whether the disk is auto-formatted and mounted
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Boolean getAutoFormatAndMount() {
        return this.AutoFormatAndMount;
    }

    /**
     * Set Whether the disk is auto-formatted and mounted
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param AutoFormatAndMount Whether the disk is auto-formatted and mounted
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setAutoFormatAndMount(Boolean AutoFormatAndMount) {
        this.AutoFormatAndMount = AutoFormatAndMount;
    }

    /**
     * Get Mounting directory
Note: This field may return null, indicating that no valid value was found. 
     * @return MountTarget Mounting directory
Note: This field may return null, indicating that no valid value was found.
     */
    public String getMountTarget() {
        return this.MountTarget;
    }

    /**
     * Set Mounting directory
Note: This field may return null, indicating that no valid value was found.
     * @param MountTarget Mounting directory
Note: This field may return null, indicating that no valid value was found.
     */
    public void setMountTarget(String MountTarget) {
        this.MountTarget = MountTarget;
    }

    public DataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDisk(DataDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.FileSystem != null) {
            this.FileSystem = new String(source.FileSystem);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.AutoFormatAndMount != null) {
            this.AutoFormatAndMount = new Boolean(source.AutoFormatAndMount);
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
        this.setParamSimple(map, prefix + "FileSystem", this.FileSystem);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "AutoFormatAndMount", this.AutoFormatAndMount);
        this.setParamSimple(map, prefix + "MountTarget", this.MountTarget);

    }
}

