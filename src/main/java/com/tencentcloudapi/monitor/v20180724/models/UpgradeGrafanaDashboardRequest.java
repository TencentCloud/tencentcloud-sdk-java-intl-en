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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeGrafanaDashboardRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Prometheus integration code, indicating to upgrade to the corresponding dashboard. Valid values:
<li>spring_mvc</li>
<li>mysql</li>
<li>go</li>
<li>redis</li>
<li>jvm</li>
<li>pgsql</li>
<li>mongo</li>
<li>kafka</li>
<li>es</li>
<li>flink</li>
<li>blackbox</li>
<li>consule</li>
<li>memcached</li>
<li>zk</li>
<li>tps</li>
<li>istio</li>
<li>etcd</li>
    */
    @SerializedName("IntegrationCodes")
    @Expose
    private String [] IntegrationCodes;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Prometheus integration code, indicating to upgrade to the corresponding dashboard. Valid values:
<li>spring_mvc</li>
<li>mysql</li>
<li>go</li>
<li>redis</li>
<li>jvm</li>
<li>pgsql</li>
<li>mongo</li>
<li>kafka</li>
<li>es</li>
<li>flink</li>
<li>blackbox</li>
<li>consule</li>
<li>memcached</li>
<li>zk</li>
<li>tps</li>
<li>istio</li>
<li>etcd</li> 
     * @return IntegrationCodes Prometheus integration code, indicating to upgrade to the corresponding dashboard. Valid values:
<li>spring_mvc</li>
<li>mysql</li>
<li>go</li>
<li>redis</li>
<li>jvm</li>
<li>pgsql</li>
<li>mongo</li>
<li>kafka</li>
<li>es</li>
<li>flink</li>
<li>blackbox</li>
<li>consule</li>
<li>memcached</li>
<li>zk</li>
<li>tps</li>
<li>istio</li>
<li>etcd</li>
     */
    public String [] getIntegrationCodes() {
        return this.IntegrationCodes;
    }

    /**
     * Set Prometheus integration code, indicating to upgrade to the corresponding dashboard. Valid values:
<li>spring_mvc</li>
<li>mysql</li>
<li>go</li>
<li>redis</li>
<li>jvm</li>
<li>pgsql</li>
<li>mongo</li>
<li>kafka</li>
<li>es</li>
<li>flink</li>
<li>blackbox</li>
<li>consule</li>
<li>memcached</li>
<li>zk</li>
<li>tps</li>
<li>istio</li>
<li>etcd</li>
     * @param IntegrationCodes Prometheus integration code, indicating to upgrade to the corresponding dashboard. Valid values:
<li>spring_mvc</li>
<li>mysql</li>
<li>go</li>
<li>redis</li>
<li>jvm</li>
<li>pgsql</li>
<li>mongo</li>
<li>kafka</li>
<li>es</li>
<li>flink</li>
<li>blackbox</li>
<li>consule</li>
<li>memcached</li>
<li>zk</li>
<li>tps</li>
<li>istio</li>
<li>etcd</li>
     */
    public void setIntegrationCodes(String [] IntegrationCodes) {
        this.IntegrationCodes = IntegrationCodes;
    }

    public UpgradeGrafanaDashboardRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeGrafanaDashboardRequest(UpgradeGrafanaDashboardRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IntegrationCodes != null) {
            this.IntegrationCodes = new String[source.IntegrationCodes.length];
            for (int i = 0; i < source.IntegrationCodes.length; i++) {
                this.IntegrationCodes[i] = new String(source.IntegrationCodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "IntegrationCodes.", this.IntegrationCodes);

    }
}

