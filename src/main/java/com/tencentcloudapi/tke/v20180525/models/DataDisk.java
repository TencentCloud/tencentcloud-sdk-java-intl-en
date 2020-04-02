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
    * 
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * File system (ext3/ext4/xfs)
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

    /**
    * 
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Whether to automatically format and mount the disk
    */
    @SerializedName("AutoFormatAndMount")
    @Expose
    private Boolean AutoFormatAndMount;

    /**
    * 
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
     * Get  
     * @return DiskType 
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 
     * @param DiskType 
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get File system (ext3/ext4/xfs) 
     * @return FileSystem File system (ext3/ext4/xfs)
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set File system (ext3/ext4/xfs)
     * @param FileSystem File system (ext3/ext4/xfs)
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get  
     * @return DiskSize 
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 
     * @param DiskSize 
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Whether to automatically format and mount the disk 
     * @return AutoFormatAndMount Whether to automatically format and mount the disk
     */
    public Boolean getAutoFormatAndMount() {
        return this.AutoFormatAndMount;
    }

    /**
     * Set Whether to automatically format and mount the disk
     * @param AutoFormatAndMount Whether to automatically format and mount the disk
     */
    public void setAutoFormatAndMount(Boolean AutoFormatAndMount) {
        this.AutoFormatAndMount = AutoFormatAndMount;
    }

    /**
     * Get  
     * @return MountTarget 
     */
    public String getMountTarget() {
        return this.MountTarget;
    }

    /**
     * Set 
     * @param MountTarget 
     */
    public void setMountTarget(String MountTarget) {
        this.MountTarget = MountTarget;
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

