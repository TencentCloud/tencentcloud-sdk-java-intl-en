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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoMountConfiguration extends AbstractModel{

    /**
    * ID of the instance to which the cloud disk is attached.
    */
    @SerializedName("InstanceId")
    @Expose
    private String [] InstanceId;

    /**
    * Mount point in the instance.
    */
    @SerializedName("MountPoint")
    @Expose
    private String [] MountPoint;

    /**
    * File system type. Valid values: `ext4`, `xfs`.
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
     * Get ID of the instance to which the cloud disk is attached. 
     * @return InstanceId ID of the instance to which the cloud disk is attached.
     */
    public String [] getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to which the cloud disk is attached.
     * @param InstanceId ID of the instance to which the cloud disk is attached.
     */
    public void setInstanceId(String [] InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Mount point in the instance. 
     * @return MountPoint Mount point in the instance.
     */
    public String [] getMountPoint() {
        return this.MountPoint;
    }

    /**
     * Set Mount point in the instance.
     * @param MountPoint Mount point in the instance.
     */
    public void setMountPoint(String [] MountPoint) {
        this.MountPoint = MountPoint;
    }

    /**
     * Get File system type. Valid values: `ext4`, `xfs`. 
     * @return FileSystemType File system type. Valid values: `ext4`, `xfs`.
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set File system type. Valid values: `ext4`, `xfs`.
     * @param FileSystemType File system type. Valid values: `ext4`, `xfs`.
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
            this.InstanceId = new String[source.InstanceId.length];
            for (int i = 0; i < source.InstanceId.length; i++) {
                this.InstanceId[i] = new String(source.InstanceId[i]);
            }
        }
        if (source.MountPoint != null) {
            this.MountPoint = new String[source.MountPoint.length];
            for (int i = 0; i < source.MountPoint.length; i++) {
                this.MountPoint[i] = new String(source.MountPoint[i]);
            }
        }
        if (source.FileSystemType != null) {
            this.FileSystemType = new String(source.FileSystemType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceId.", this.InstanceId);
        this.setParamArraySimple(map, prefix + "MountPoint.", this.MountPoint);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);

    }
}

