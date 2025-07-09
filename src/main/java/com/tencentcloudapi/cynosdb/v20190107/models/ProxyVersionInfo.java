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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyVersionInfo extends AbstractModel {

    /**
    * proxy version number.
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * Version description: GA: stable version. BETA: BETA version. DEPRECATED: outdated.
    */
    @SerializedName("ProxyVersionType")
    @Expose
    private String ProxyVersionType;

    /**
     * Get proxy version number. 
     * @return ProxyVersion proxy version number.
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set proxy version number.
     * @param ProxyVersion proxy version number.
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get Version description: GA: stable version. BETA: BETA version. DEPRECATED: outdated. 
     * @return ProxyVersionType Version description: GA: stable version. BETA: BETA version. DEPRECATED: outdated.
     */
    public String getProxyVersionType() {
        return this.ProxyVersionType;
    }

    /**
     * Set Version description: GA: stable version. BETA: BETA version. DEPRECATED: outdated.
     * @param ProxyVersionType Version description: GA: stable version. BETA: BETA version. DEPRECATED: outdated.
     */
    public void setProxyVersionType(String ProxyVersionType) {
        this.ProxyVersionType = ProxyVersionType;
    }

    public ProxyVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyVersionInfo(ProxyVersionInfo source) {
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.ProxyVersionType != null) {
            this.ProxyVersionType = new String(source.ProxyVersionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "ProxyVersionType", this.ProxyVersionType);

    }
}

