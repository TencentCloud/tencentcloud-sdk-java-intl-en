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

public class ResizeDisksRequest extends AbstractModel {

    /**
    * Cloud disk ID list, which can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/api/1207/66093?from_cn_redirect=1) API. The maximum length of the list is 15.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Size of the cloud disk after scale-out, in GB. The value range of the Premium Disk size is [10, 4000], and that of the Cloud SSD size is [20, 4000]. The cloud disk size after scale-out must be greater than the current disk size.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get Cloud disk ID list, which can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/api/1207/66093?from_cn_redirect=1) API. The maximum length of the list is 15. 
     * @return DiskIds Cloud disk ID list, which can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/api/1207/66093?from_cn_redirect=1) API. The maximum length of the list is 15.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set Cloud disk ID list, which can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/api/1207/66093?from_cn_redirect=1) API. The maximum length of the list is 15.
     * @param DiskIds Cloud disk ID list, which can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/api/1207/66093?from_cn_redirect=1) API. The maximum length of the list is 15.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Size of the cloud disk after scale-out, in GB. The value range of the Premium Disk size is [10, 4000], and that of the Cloud SSD size is [20, 4000]. The cloud disk size after scale-out must be greater than the current disk size. 
     * @return DiskSize Size of the cloud disk after scale-out, in GB. The value range of the Premium Disk size is [10, 4000], and that of the Cloud SSD size is [20, 4000]. The cloud disk size after scale-out must be greater than the current disk size.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Size of the cloud disk after scale-out, in GB. The value range of the Premium Disk size is [10, 4000], and that of the Cloud SSD size is [20, 4000]. The cloud disk size after scale-out must be greater than the current disk size.
     * @param DiskSize Size of the cloud disk after scale-out, in GB. The value range of the Premium Disk size is [10, 4000], and that of the Cloud SSD size is [20, 4000]. The cloud disk size after scale-out must be greater than the current disk size.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public ResizeDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResizeDisksRequest(ResizeDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

