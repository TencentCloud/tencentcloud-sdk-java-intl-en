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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceVersionRequest extends AbstractModel {

    /**
    * Target instance type, same as **TypeId** in [CreateInstances](https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1), which is the target type to change the instance to.
- For Redis 4.0 or higher, instances of the same version support upgrading from standard architecture to cluster architecture. For example, Redis 4.0 standard architecture can be upgraded to Redis 4.0 cluster architecture.
-Cross-version architecture upgrade is not supported, for example, upgrading from Redis 4.0 standard architecture to Redis 5.0 cluster architecture.
-Architecture upgrade from Redis 2.8 is not supported.
-Downgrade from cluster architecture to standard architecture is not supported.

    */
    @SerializedName("TargetInstanceType")
    @Expose
    private String TargetInstanceType;

    /**
    * Switch time. Valid values:
- `1`: Switch in the maintenance time.
- `2` (default value): Switch now.
    */
    @SerializedName("SwitchOption")
    @Expose
    private Long SwitchOption;

    /**
    * ID of the specified instance, such as `crs-xjhsdj****`. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Target instance type, same as **TypeId** in [CreateInstances](https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1), which is the target type to change the instance to.
- For Redis 4.0 or higher, instances of the same version support upgrading from standard architecture to cluster architecture. For example, Redis 4.0 standard architecture can be upgraded to Redis 4.0 cluster architecture.
-Cross-version architecture upgrade is not supported, for example, upgrading from Redis 4.0 standard architecture to Redis 5.0 cluster architecture.
-Architecture upgrade from Redis 2.8 is not supported.
-Downgrade from cluster architecture to standard architecture is not supported.
 
     * @return TargetInstanceType Target instance type, same as **TypeId** in [CreateInstances](https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1), which is the target type to change the instance to.
- For Redis 4.0 or higher, instances of the same version support upgrading from standard architecture to cluster architecture. For example, Redis 4.0 standard architecture can be upgraded to Redis 4.0 cluster architecture.
-Cross-version architecture upgrade is not supported, for example, upgrading from Redis 4.0 standard architecture to Redis 5.0 cluster architecture.
-Architecture upgrade from Redis 2.8 is not supported.
-Downgrade from cluster architecture to standard architecture is not supported.

     */
    public String getTargetInstanceType() {
        return this.TargetInstanceType;
    }

    /**
     * Set Target instance type, same as **TypeId** in [CreateInstances](https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1), which is the target type to change the instance to.
- For Redis 4.0 or higher, instances of the same version support upgrading from standard architecture to cluster architecture. For example, Redis 4.0 standard architecture can be upgraded to Redis 4.0 cluster architecture.
-Cross-version architecture upgrade is not supported, for example, upgrading from Redis 4.0 standard architecture to Redis 5.0 cluster architecture.
-Architecture upgrade from Redis 2.8 is not supported.
-Downgrade from cluster architecture to standard architecture is not supported.

     * @param TargetInstanceType Target instance type, same as **TypeId** in [CreateInstances](https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1), which is the target type to change the instance to.
- For Redis 4.0 or higher, instances of the same version support upgrading from standard architecture to cluster architecture. For example, Redis 4.0 standard architecture can be upgraded to Redis 4.0 cluster architecture.
-Cross-version architecture upgrade is not supported, for example, upgrading from Redis 4.0 standard architecture to Redis 5.0 cluster architecture.
-Architecture upgrade from Redis 2.8 is not supported.
-Downgrade from cluster architecture to standard architecture is not supported.

     */
    public void setTargetInstanceType(String TargetInstanceType) {
        this.TargetInstanceType = TargetInstanceType;
    }

    /**
     * Get Switch time. Valid values:
- `1`: Switch in the maintenance time.
- `2` (default value): Switch now. 
     * @return SwitchOption Switch time. Valid values:
- `1`: Switch in the maintenance time.
- `2` (default value): Switch now.
     */
    public Long getSwitchOption() {
        return this.SwitchOption;
    }

    /**
     * Set Switch time. Valid values:
- `1`: Switch in the maintenance time.
- `2` (default value): Switch now.
     * @param SwitchOption Switch time. Valid values:
- `1`: Switch in the maintenance time.
- `2` (default value): Switch now.
     */
    public void setSwitchOption(Long SwitchOption) {
        this.SwitchOption = SwitchOption;
    }

    /**
     * Get ID of the specified instance, such as `crs-xjhsdj****`. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it in the instance list. 
     * @return InstanceId ID of the specified instance, such as `crs-xjhsdj****`. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the specified instance, such as `crs-xjhsdj****`. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it in the instance list.
     * @param InstanceId ID of the specified instance, such as `crs-xjhsdj****`. Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public UpgradeInstanceVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceVersionRequest(UpgradeInstanceVersionRequest source) {
        if (source.TargetInstanceType != null) {
            this.TargetInstanceType = new String(source.TargetInstanceType);
        }
        if (source.SwitchOption != null) {
            this.SwitchOption = new Long(source.SwitchOption);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetInstanceType", this.TargetInstanceType);
        this.setParamSimple(map, prefix + "SwitchOption", this.SwitchOption);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

