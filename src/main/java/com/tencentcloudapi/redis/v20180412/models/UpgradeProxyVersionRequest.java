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

public class UpgradeProxyVersionRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Current proxy version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the current proxy version for the instance.
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * Upgradable Redis version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the upgradable Redis version for the instance.
    */
    @SerializedName("UpgradeProxyVersion")
    @Expose
    private String UpgradeProxyVersion;

    /**
    * Specifies whether to upgrade immediately.
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
     * Get Current proxy version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the current proxy version for the instance. 
     * @return CurrentProxyVersion Current proxy version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the current proxy version for the instance.
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set Current proxy version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the current proxy version for the instance.
     * @param CurrentProxyVersion Current proxy version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the current proxy version for the instance.
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get Upgradable Redis version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the upgradable Redis version for the instance. 
     * @return UpgradeProxyVersion Upgradable Redis version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the upgradable Redis version for the instance.
     */
    public String getUpgradeProxyVersion() {
        return this.UpgradeProxyVersion;
    }

    /**
     * Set Upgradable Redis version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the upgradable Redis version for the instance.
     * @param UpgradeProxyVersion Upgradable Redis version. Call the [DescribeInstances](https://www.tencentcloud.comom/document/product/239/20018?from_cn_redirect=1) API to obtain the upgradable Redis version for the instance.
     */
    public void setUpgradeProxyVersion(String UpgradeProxyVersion) {
        this.UpgradeProxyVersion = UpgradeProxyVersion;
    }

    /**
     * Get Specifies whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window. 
     * @return InstanceTypeUpgradeNow Specifies whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window.
     */
    public Long getInstanceTypeUpgradeNow() {
        return this.InstanceTypeUpgradeNow;
    }

    /**
     * Set Specifies whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window.
     * @param InstanceTypeUpgradeNow Specifies whether to upgrade immediately.
- 1: Upgrade immediately.
- 0: Upgrade during the maintenance window.
     */
    public void setInstanceTypeUpgradeNow(Long InstanceTypeUpgradeNow) {
        this.InstanceTypeUpgradeNow = InstanceTypeUpgradeNow;
    }

    public UpgradeProxyVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeProxyVersionRequest(UpgradeProxyVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.UpgradeProxyVersion != null) {
            this.UpgradeProxyVersion = new String(source.UpgradeProxyVersion);
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
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "UpgradeProxyVersion", this.UpgradeProxyVersion);
        this.setParamSimple(map, prefix + "InstanceTypeUpgradeNow", this.InstanceTypeUpgradeNow);

    }
}

