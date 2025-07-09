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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMountPointRequest extends AbstractModel {

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
    @SerializedName("MountPointStatus")
    @Expose
    private Long MountPointStatus;

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
     * @return MountPointStatus Mount point status (1: enabled; 2: disabled)
     */
    public Long getMountPointStatus() {
        return this.MountPointStatus;
    }

    /**
     * Set Mount point status (1: enabled; 2: disabled)
     * @param MountPointStatus Mount point status (1: enabled; 2: disabled)
     */
    public void setMountPointStatus(Long MountPointStatus) {
        this.MountPointStatus = MountPointStatus;
    }

    public CreateMountPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMountPointRequest(CreateMountPointRequest source) {
        if (source.MountPointName != null) {
            this.MountPointName = new String(source.MountPointName);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.MountPointStatus != null) {
            this.MountPointStatus = new Long(source.MountPointStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPointName", this.MountPointName);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "MountPointStatus", this.MountPointStatus);

    }
}

