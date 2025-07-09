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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoMountConfiguration extends AbstractModel {

    /**
    * ID of the instance to be mounted to. The instance must be **Running**.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The mount point within the instance. Only Linux instances are supported. If it's not specified, the default mount point is "/data/disk".
    */
    @SerializedName("MountPoint")
    @Expose
    private String MountPoint;

    /**
    * The file system type. Values: `ext4` (default) and `xfs`. Only Linux instances are supported. 
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
     * Get ID of the instance to be mounted to. The instance must be **Running**. 
     * @return InstanceId ID of the instance to be mounted to. The instance must be **Running**.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be mounted to. The instance must be **Running**.
     * @param InstanceId ID of the instance to be mounted to. The instance must be **Running**.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The mount point within the instance. Only Linux instances are supported. If it's not specified, the default mount point is "/data/disk". 
     * @return MountPoint The mount point within the instance. Only Linux instances are supported. If it's not specified, the default mount point is "/data/disk".
     */
    public String getMountPoint() {
        return this.MountPoint;
    }

    /**
     * Set The mount point within the instance. Only Linux instances are supported. If it's not specified, the default mount point is "/data/disk".
     * @param MountPoint The mount point within the instance. Only Linux instances are supported. If it's not specified, the default mount point is "/data/disk".
     */
    public void setMountPoint(String MountPoint) {
        this.MountPoint = MountPoint;
    }

    /**
     * Get The file system type. Values: `ext4` (default) and `xfs`. Only Linux instances are supported.  
     * @return FileSystemType The file system type. Values: `ext4` (default) and `xfs`. Only Linux instances are supported. 
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set The file system type. Values: `ext4` (default) and `xfs`. Only Linux instances are supported. 
     * @param FileSystemType The file system type. Values: `ext4` (default) and `xfs`. Only Linux instances are supported. 
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    public AutoMountConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoMountConfiguration(AutoMountConfiguration source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MountPoint != null) {
            this.MountPoint = new String(source.MountPoint);
        }
        if (source.FileSystemType != null) {
            this.FileSystemType = new String(source.FileSystemType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MountPoint", this.MountPoint);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);

    }
}

