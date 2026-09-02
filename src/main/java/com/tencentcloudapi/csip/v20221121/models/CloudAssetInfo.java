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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAssetInfo extends AbstractModel {

    /**
    * Cloud vendor type
Enumeration values:
tencent: tencent Cloud
aliyun: Alibaba Cloud
aws:AWS
huawei: Huawei Cloud
azure:Azure
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * Number of assets of the cloud service provider
Valid values: [0, +∞)
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Cloud vendor type
Enumeration values:
tencent: tencent Cloud
aliyun: Alibaba Cloud
aws:AWS
huawei: Huawei Cloud
azure:Azure 
     * @return CloudType Cloud vendor type
Enumeration values:
tencent: tencent Cloud
aliyun: Alibaba Cloud
aws:AWS
huawei: Huawei Cloud
azure:Azure
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud vendor type
Enumeration values:
tencent: tencent Cloud
aliyun: Alibaba Cloud
aws:AWS
huawei: Huawei Cloud
azure:Azure
     * @param CloudType Cloud vendor type
Enumeration values:
tencent: tencent Cloud
aliyun: Alibaba Cloud
aws:AWS
huawei: Huawei Cloud
azure:Azure
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get Number of assets of the cloud service provider
Valid values: [0, +∞) 
     * @return Count Number of assets of the cloud service provider
Valid values: [0, +∞)
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of assets of the cloud service provider
Valid values: [0, +∞)
     * @param Count Number of assets of the cloud service provider
Valid values: [0, +∞)
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public CloudAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAssetInfo(CloudAssetInfo source) {
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

