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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemDisk extends AbstractModel {

    /**
    * System disk type. for restrictions on the system disk type, see [cloud block storage types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1). valid values:.
<Li>LOCAL_BASIC: local hard disk.</li>.
<Li>LOCAL_SSD: local ssd.</li>.
<Li>CLOUD_BASIC: general cloud disk.</li>.
<Li>CLOUD_PREMIUM: high-performance cloud block storage</li>.
<Li>CLOUD_SSD: cloud ssd</li>.
<Li>CLOUD_BSSD: universal ssd cloud disk</li>.
<Li>CLOUD_HSSD: enhanced ssd cloud disk</li>.
<Li>CLOUD_TSSD: ultra ssd.</li>.
<li>Default value: CLOUD_PREMIUM.</li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * System disk size, in GB. Default value: 50.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get System disk type. for restrictions on the system disk type, see [cloud block storage types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1). valid values:.
<Li>LOCAL_BASIC: local hard disk.</li>.
<Li>LOCAL_SSD: local ssd.</li>.
<Li>CLOUD_BASIC: general cloud disk.</li>.
<Li>CLOUD_PREMIUM: high-performance cloud block storage</li>.
<Li>CLOUD_SSD: cloud ssd</li>.
<Li>CLOUD_BSSD: universal ssd cloud disk</li>.
<Li>CLOUD_HSSD: enhanced ssd cloud disk</li>.
<Li>CLOUD_TSSD: ultra ssd.</li>.
<li>Default value: CLOUD_PREMIUM.</li> 
     * @return DiskType System disk type. for restrictions on the system disk type, see [cloud block storage types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1). valid values:.
<Li>LOCAL_BASIC: local hard disk.</li>.
<Li>LOCAL_SSD: local ssd.</li>.
<Li>CLOUD_BASIC: general cloud disk.</li>.
<Li>CLOUD_PREMIUM: high-performance cloud block storage</li>.
<Li>CLOUD_SSD: cloud ssd</li>.
<Li>CLOUD_BSSD: universal ssd cloud disk</li>.
<Li>CLOUD_HSSD: enhanced ssd cloud disk</li>.
<Li>CLOUD_TSSD: ultra ssd.</li>.
<li>Default value: CLOUD_PREMIUM.</li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set System disk type. for restrictions on the system disk type, see [cloud block storage types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1). valid values:.
<Li>LOCAL_BASIC: local hard disk.</li>.
<Li>LOCAL_SSD: local ssd.</li>.
<Li>CLOUD_BASIC: general cloud disk.</li>.
<Li>CLOUD_PREMIUM: high-performance cloud block storage</li>.
<Li>CLOUD_SSD: cloud ssd</li>.
<Li>CLOUD_BSSD: universal ssd cloud disk</li>.
<Li>CLOUD_HSSD: enhanced ssd cloud disk</li>.
<Li>CLOUD_TSSD: ultra ssd.</li>.
<li>Default value: CLOUD_PREMIUM.</li>
     * @param DiskType System disk type. for restrictions on the system disk type, see [cloud block storage types](https://intl.cloud.tencent.com/document/product/362/2353?from_cn_redirect=1). valid values:.
<Li>LOCAL_BASIC: local hard disk.</li>.
<Li>LOCAL_SSD: local ssd.</li>.
<Li>CLOUD_BASIC: general cloud disk.</li>.
<Li>CLOUD_PREMIUM: high-performance cloud block storage</li>.
<Li>CLOUD_SSD: cloud ssd</li>.
<Li>CLOUD_BSSD: universal ssd cloud disk</li>.
<Li>CLOUD_HSSD: enhanced ssd cloud disk</li>.
<Li>CLOUD_TSSD: ultra ssd.</li>.
<li>Default value: CLOUD_PREMIUM.</li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get System disk size, in GB. Default value: 50. 
     * @return DiskSize System disk size, in GB. Default value: 50.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set System disk size, in GB. Default value: 50.
     * @param DiskSize System disk size, in GB. Default value: 50.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public SystemDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemDisk(SystemDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
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
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

