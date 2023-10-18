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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskInfo extends AbstractModel {

    /**
    * Disk type: LOCAL_BASIC.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk ID
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Disk size in GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get Disk type: LOCAL_BASIC. 
     * @return DiskType Disk type: LOCAL_BASIC.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type: LOCAL_BASIC.
     * @param DiskType Disk type: LOCAL_BASIC.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk ID 
     * @return DiskId Disk ID
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Disk ID
     * @param DiskId Disk ID
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Disk size in GB 
     * @return DiskSize Disk size in GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk size in GB
     * @param DiskSize Disk size in GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public DiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskInfo(DiskInfo source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

