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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBVersionsRequest extends AbstractModel {

    /**
    * <p>Instance storage type. The supported versions are returned based on the disk type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>Instance storage type. The supported versions are returned based on the disk type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p> 
     * @return StorageType <p>Instance storage type. The supported versions are returned based on the disk type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Instance storage type. The supported versions are returned based on the disk type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p>
     * @param StorageType <p>Instance storage type. The supported versions are returned based on the disk type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public DescribeDBVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBVersionsRequest(DescribeDBVersionsRequest source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

