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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalDiskInfo extends AbstractModel{

    /**
    * Local disk type <li>LOCAL_SATA: big data </li><li>NVME_SSD: high IO</li>
    */
    @SerializedName("LocalDiskType")
    @Expose
    private String LocalDiskType;

    /**
    * Size of a single local disk
    */
    @SerializedName("LocalDiskSize")
    @Expose
    private Long LocalDiskSize;

    /**
    * Number of local disks
    */
    @SerializedName("LocalDiskCount")
    @Expose
    private Long LocalDiskCount;

    /**
     * Get Local disk type <li>LOCAL_SATA: big data </li><li>NVME_SSD: high IO</li> 
     * @return LocalDiskType Local disk type <li>LOCAL_SATA: big data </li><li>NVME_SSD: high IO</li>
     */
    public String getLocalDiskType() {
        return this.LocalDiskType;
    }

    /**
     * Set Local disk type <li>LOCAL_SATA: big data </li><li>NVME_SSD: high IO</li>
     * @param LocalDiskType Local disk type <li>LOCAL_SATA: big data </li><li>NVME_SSD: high IO</li>
     */
    public void setLocalDiskType(String LocalDiskType) {
        this.LocalDiskType = LocalDiskType;
    }

    /**
     * Get Size of a single local disk 
     * @return LocalDiskSize Size of a single local disk
     */
    public Long getLocalDiskSize() {
        return this.LocalDiskSize;
    }

    /**
     * Set Size of a single local disk
     * @param LocalDiskSize Size of a single local disk
     */
    public void setLocalDiskSize(Long LocalDiskSize) {
        this.LocalDiskSize = LocalDiskSize;
    }

    /**
     * Get Number of local disks 
     * @return LocalDiskCount Number of local disks
     */
    public Long getLocalDiskCount() {
        return this.LocalDiskCount;
    }

    /**
     * Set Number of local disks
     * @param LocalDiskCount Number of local disks
     */
    public void setLocalDiskCount(Long LocalDiskCount) {
        this.LocalDiskCount = LocalDiskCount;
    }

    public LocalDiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalDiskInfo(LocalDiskInfo source) {
        if (source.LocalDiskType != null) {
            this.LocalDiskType = new String(source.LocalDiskType);
        }
        if (source.LocalDiskSize != null) {
            this.LocalDiskSize = new Long(source.LocalDiskSize);
        }
        if (source.LocalDiskCount != null) {
            this.LocalDiskCount = new Long(source.LocalDiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalDiskType", this.LocalDiskType);
        this.setParamSimple(map, prefix + "LocalDiskSize", this.LocalDiskSize);
        this.setParamSimple(map, prefix + "LocalDiskCount", this.LocalDiskCount);

    }
}

