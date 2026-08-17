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
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Whether nearest access is supported after upgrading to multiple availability zones. - true: Supports nearest access. The upgrade process involves upgrading the Proxy version and Redis kernel minor version simultaneously, which may require data migration and take up to several hours. - false: No need to support nearest access. Upgrading to multiple availability zones only involves metadata management migration, with no impact on the service. The upgrade process is usually completed within 3 minutes. Defaults to false.</p>
    */
    @SerializedName("UpgradeProxyAndRedisServer")
    @Expose
    private Boolean UpgradeProxyAndRedisServer;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis/instance/list">Redis console</a> and copy it from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Whether nearest access is supported after upgrading to multiple availability zones. - true: Supports nearest access. The upgrade process involves upgrading the Proxy version and Redis kernel minor version simultaneously, which may require data migration and take up to several hours. - false: No need to support nearest access. Upgrading to multiple availability zones only involves metadata management migration, with no impact on the service. The upgrade process is usually completed within 3 minutes. Defaults to false.</p> 
     * @return UpgradeProxyAndRedisServer <p>Whether nearest access is supported after upgrading to multiple availability zones. - true: Supports nearest access. The upgrade process involves upgrading the Proxy version and Redis kernel minor version simultaneously, which may require data migration and take up to several hours. - false: No need to support nearest access. Upgrading to multiple availability zones only involves metadata management migration, with no impact on the service. The upgrade process is usually completed within 3 minutes. Defaults to false.</p>
     */
    public Boolean getUpgradeProxyAndRedisServer() {
        return this.UpgradeProxyAndRedisServer;
    }

    /**
     * Set <p>Whether nearest access is supported after upgrading to multiple availability zones. - true: Supports nearest access. The upgrade process involves upgrading the Proxy version and Redis kernel minor version simultaneously, which may require data migration and take up to several hours. - false: No need to support nearest access. Upgrading to multiple availability zones only involves metadata management migration, with no impact on the service. The upgrade process is usually completed within 3 minutes. Defaults to false.</p>
     * @param UpgradeProxyAndRedisServer <p>Whether nearest access is supported after upgrading to multiple availability zones. - true: Supports nearest access. The upgrade process involves upgrading the Proxy version and Redis kernel minor version simultaneously, which may require data migration and take up to several hours. - false: No need to support nearest access. Upgrading to multiple availability zones only involves metadata management migration, with no impact on the service. The upgrade process is usually completed within 3 minutes. Defaults to false.</p>
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

