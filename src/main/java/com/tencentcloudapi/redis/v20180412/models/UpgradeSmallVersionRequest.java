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

public class UpgradeSmallVersionRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Current Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710).
    */
    @SerializedName("CurrentRedisVersion")
    @Expose
    private String CurrentRedisVersion;

    /**
    * Upgraded Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710).
    */
    @SerializedName("UpgradeRedisVersion")
    @Expose
    private String UpgradeRedisVersion;

    /**
    * Whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window.
    */
    @SerializedName("InstanceTypeUpgradeNow")
    @Expose
    private Long InstanceTypeUpgradeNow;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Current Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710). 
     * @return CurrentRedisVersion Current Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710).
     */
    public String getCurrentRedisVersion() {
        return this.CurrentRedisVersion;
    }

    /**
     * Set Current Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710).
     * @param CurrentRedisVersion Current Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710).
     */
    public void setCurrentRedisVersion(String CurrentRedisVersion) {
        this.CurrentRedisVersion = CurrentRedisVersion;
    }

    /**
     * Get Upgraded Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710). 
     * @return UpgradeRedisVersion Upgraded Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710).
     */
    public String getUpgradeRedisVersion() {
        return this.UpgradeRedisVersion;
    }

    /**
     * Set Upgraded Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710).
     * @param UpgradeRedisVersion Upgraded Redis minor version. For minor version information, see [Upgrading Instance Version](https://www.tencentcloud.com/document/product/239/37710).
     */
    public void setUpgradeRedisVersion(String UpgradeRedisVersion) {
        this.UpgradeRedisVersion = UpgradeRedisVersion;
    }

    /**
     * Get Whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window. 
     * @return InstanceTypeUpgradeNow Whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window.
     */
    public Long getInstanceTypeUpgradeNow() {
        return this.InstanceTypeUpgradeNow;
    }

    /**
     * Set Whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window.
     * @param InstanceTypeUpgradeNow Whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window.
     */
    public void setInstanceTypeUpgradeNow(Long InstanceTypeUpgradeNow) {
        this.InstanceTypeUpgradeNow = InstanceTypeUpgradeNow;
    }

    public UpgradeSmallVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeSmallVersionRequest(UpgradeSmallVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CurrentRedisVersion != null) {
            this.CurrentRedisVersion = new String(source.CurrentRedisVersion);
        }
        if (source.UpgradeRedisVersion != null) {
            this.UpgradeRedisVersion = new String(source.UpgradeRedisVersion);
        }
        if (source.InstanceTypeUpgradeNow != null) {
            this.InstanceTypeUpgradeNow = new Long(source.InstanceTypeUpgradeNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CurrentRedisVersion", this.CurrentRedisVersion);
        this.setParamSimple(map, prefix + "UpgradeRedisVersion", this.UpgradeRedisVersion);
        this.setParamSimple(map, prefix + "InstanceTypeUpgradeNow", this.InstanceTypeUpgradeNow);

    }
}

