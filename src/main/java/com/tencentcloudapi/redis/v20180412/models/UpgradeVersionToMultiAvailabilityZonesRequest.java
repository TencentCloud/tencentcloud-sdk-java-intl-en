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

public class UpgradeVersionToMultiAvailabilityZonesRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies whether the nearby access feature is supported after an upgrade to multi-AZ.
- true: support the nearby access feature. The upgrade process requires simultaneous upgrades of the proxy version and Redis kernel minor version, which involves data migration and may take several hours.
- false: no need to support the nearby access feature. Upgrade to multi-AZ only involves metadata migration management, with no impact on the service. The upgrade process is usually completed within 3 minutes, and the default value is false.
    */
    @SerializedName("UpgradeProxyAndRedisServer")
    @Expose
    private Boolean UpgradeProxyAndRedisServer;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies whether the nearby access feature is supported after an upgrade to multi-AZ.
- true: support the nearby access feature. The upgrade process requires simultaneous upgrades of the proxy version and Redis kernel minor version, which involves data migration and may take several hours.
- false: no need to support the nearby access feature. Upgrade to multi-AZ only involves metadata migration management, with no impact on the service. The upgrade process is usually completed within 3 minutes, and the default value is false. 
     * @return UpgradeProxyAndRedisServer Specifies whether the nearby access feature is supported after an upgrade to multi-AZ.
- true: support the nearby access feature. The upgrade process requires simultaneous upgrades of the proxy version and Redis kernel minor version, which involves data migration and may take several hours.
- false: no need to support the nearby access feature. Upgrade to multi-AZ only involves metadata migration management, with no impact on the service. The upgrade process is usually completed within 3 minutes, and the default value is false.
     */
    public Boolean getUpgradeProxyAndRedisServer() {
        return this.UpgradeProxyAndRedisServer;
    }

    /**
     * Set Specifies whether the nearby access feature is supported after an upgrade to multi-AZ.
- true: support the nearby access feature. The upgrade process requires simultaneous upgrades of the proxy version and Redis kernel minor version, which involves data migration and may take several hours.
- false: no need to support the nearby access feature. Upgrade to multi-AZ only involves metadata migration management, with no impact on the service. The upgrade process is usually completed within 3 minutes, and the default value is false.
     * @param UpgradeProxyAndRedisServer Specifies whether the nearby access feature is supported after an upgrade to multi-AZ.
- true: support the nearby access feature. The upgrade process requires simultaneous upgrades of the proxy version and Redis kernel minor version, which involves data migration and may take several hours.
- false: no need to support the nearby access feature. Upgrade to multi-AZ only involves metadata migration management, with no impact on the service. The upgrade process is usually completed within 3 minutes, and the default value is false.
     */
    public void setUpgradeProxyAndRedisServer(Boolean UpgradeProxyAndRedisServer) {
        this.UpgradeProxyAndRedisServer = UpgradeProxyAndRedisServer;
    }

    public UpgradeVersionToMultiAvailabilityZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeVersionToMultiAvailabilityZonesRequest(UpgradeVersionToMultiAvailabilityZonesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UpgradeProxyAndRedisServer != null) {
            this.UpgradeProxyAndRedisServer = new Boolean(source.UpgradeProxyAndRedisServer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UpgradeProxyAndRedisServer", this.UpgradeProxyAndRedisServer);

    }
}

