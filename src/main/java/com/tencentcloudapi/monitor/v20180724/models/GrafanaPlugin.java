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

public class GrafanaPlugin extends AbstractModel {

    /**
    * Grafana plugin ID
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * Grafana plugin version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get Grafana plugin ID 
     * @return PluginId Grafana plugin ID
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set Grafana plugin ID
     * @param PluginId Grafana plugin ID
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get Grafana plugin version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Grafana plugin version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Grafana plugin version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Grafana plugin version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public GrafanaPlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaPlugin(GrafanaPlugin source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

