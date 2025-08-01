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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindPrometheusManagedGrafanaRequest extends AbstractModel {

    /**
    * Prometheus instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Grafana instance ID
    */
    @SerializedName("GrafanaId")
    @Expose
    private String GrafanaId;

    /**
     * Get Prometheus instance ID 
     * @return InstanceId Prometheus instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus instance ID
     * @param InstanceId Prometheus instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Grafana instance ID 
     * @return GrafanaId Grafana instance ID
     */
    public String getGrafanaId() {
        return this.GrafanaId;
    }

    /**
     * Set Grafana instance ID
     * @param GrafanaId Grafana instance ID
     */
    public void setGrafanaId(String GrafanaId) {
        this.GrafanaId = GrafanaId;
    }

    public UnbindPrometheusManagedGrafanaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindPrometheusManagedGrafanaRequest(UnbindPrometheusManagedGrafanaRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GrafanaId != null) {
            this.GrafanaId = new String(source.GrafanaId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GrafanaId", this.GrafanaId);

    }
}

