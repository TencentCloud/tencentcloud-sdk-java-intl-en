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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountPoint extends AbstractModel{

    /**
    * Mount point ID
    */
    @SerializedName("MountPointId")
    @Expose
    private String MountPointId;

    /**
    * Mount point name
    */
    @SerializedName("MountPointName")
    @Expose
    private String MountPointName;

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Mount point status (1: enabled; 2: disabled)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * List of IDs of the bound permission groups
    */
    @SerializedName("AccessGroupIds")
    @Expose
    private String [] AccessGroupIds;

    /**
     * Get Mount point ID 
     * @return MountPointId Mount point ID
     */
    public String getMountPointId() {
        return this.MountPointId;
    }

    /**
     * Set Mount point ID
     * @param MountPointId Mount point ID
     */
    public void setMountPointId(String MountPointId) {
        this.MountPointId = MountPointId;
    }

    /**
     * Get Mount point name 
     * @return MountPointName Mount point name
     */
    public String getMountPointName() {
        return this.MountPointName;
    }

    /**
     * Set Mount point name
     * @param MountPointName Mount point name
     */
    public void setMountPointName(String MountPointName) {
        this.MountPointName = MountPointName;
    }

    /**
     * Get File system ID 
     * @return FileSystemId File system ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID
     * @param FileSystemId File system ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Mount point status (1: enabled; 2: disabled) 
     * @return Status Mount point status (1: enabled; 2: disabled)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Mount point status (1: enabled; 2: disabled)
     * @param Status Mount point status (1: enabled; 2: disabled)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get List of IDs of the bound permission groups 
     * @return AccessGroupIds List of IDs of the bound permission groups
     */
    public String [] getAccessGroupIds() {
        return this.AccessGroupIds;
    }

    /**
     * Set List of IDs of the bound permission groups
     * @param AccessGroupIds List of IDs of the bound permission groups
     */
    public void setAccessGroupIds(String [] AccessGroupIds) {
        this.AccessGroupIds = AccessGroupIds;
    }

    public MountPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountPoint(MountPoint source) {
        if (source.MountPointId != null) {
            this.MountPointId = new String(source.MountPointId);
        }
        if (source.MountPointName != null) {
            this.MountPointName = new String(source.MountPointName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AccessGroupIds != null) {
            this.AccessGroupIds = new String[source.AccessGroupIds.length];
            for (int i = 0; i < source.AccessGroupIds.length; i++) {
                this.AccessGroupIds[i] = new String(source.AccessGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPointId", this.MountPointId);
        this.setParamSimple(map, prefix + "MountPointName", this.MountPointName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "AccessGroupIds.", this.AccessGroupIds);

    }
}

