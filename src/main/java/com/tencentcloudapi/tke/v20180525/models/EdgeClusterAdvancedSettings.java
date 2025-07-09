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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeClusterAdvancedSettings extends AbstractModel {

    /**
    * Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraArgs")
    @Expose
    private EdgeClusterExtraArgs ExtraArgs;

    /**
    * Runtime type. Valid values: "docker" (default), "containerd".
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * Forwarding mode of kube-proxy. Valid values: "iptables" (default), "ipvs".
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyMode")
    @Expose
    private String ProxyMode;

    /**
     * Get Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExtraArgs Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public EdgeClusterExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExtraArgs Custom parameters of the cluster
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExtraArgs(EdgeClusterExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get Runtime type. Valid values: "docker" (default), "containerd".
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Runtime Runtime type. Valid values: "docker" (default), "containerd".
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Runtime type. Valid values: "docker" (default), "containerd".
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Runtime Runtime type. Valid values: "docker" (default), "containerd".
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Forwarding mode of kube-proxy. Valid values: "iptables" (default), "ipvs".
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ProxyMode Forwarding mode of kube-proxy. Valid values: "iptables" (default), "ipvs".
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getProxyMode() {
        return this.ProxyMode;
    }

    /**
     * Set Forwarding mode of kube-proxy. Valid values: "iptables" (default), "ipvs".
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ProxyMode Forwarding mode of kube-proxy. Valid values: "iptables" (default), "ipvs".
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProxyMode(String ProxyMode) {
        this.ProxyMode = ProxyMode;
    }

    public EdgeClusterAdvancedSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeClusterAdvancedSettings(EdgeClusterAdvancedSettings source) {
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new EdgeClusterExtraArgs(source.ExtraArgs);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.ProxyMode != null) {
            this.ProxyMode = new String(source.ProxyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "ProxyMode", this.ProxyMode);

    }
}

