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

public class ProxyZone extends AbstractModel {

    /**
    * AZ of the proxy node
    */
    @SerializedName("ProxyNodeZone")
    @Expose
    private String ProxyNodeZone;

    /**
    * The number of proxy nodes
    */
    @SerializedName("ProxyNodeCount")
    @Expose
    private Long ProxyNodeCount;

    /**
     * Get AZ of the proxy node 
     * @return ProxyNodeZone AZ of the proxy node
     */
    public String getProxyNodeZone() {
        return this.ProxyNodeZone;
    }

    /**
     * Set AZ of the proxy node
     * @param ProxyNodeZone AZ of the proxy node
     */
    public void setProxyNodeZone(String ProxyNodeZone) {
        this.ProxyNodeZone = ProxyNodeZone;
    }

    /**
     * Get The number of proxy nodes 
     * @return ProxyNodeCount The number of proxy nodes
     */
    public Long getProxyNodeCount() {
        return this.ProxyNodeCount;
    }

    /**
     * Set The number of proxy nodes
     * @param ProxyNodeCount The number of proxy nodes
     */
    public void setProxyNodeCount(Long ProxyNodeCount) {
        this.ProxyNodeCount = ProxyNodeCount;
    }

    public ProxyZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyZone(ProxyZone source) {
        if (source.ProxyNodeZone != null) {
            this.ProxyNodeZone = new String(source.ProxyNodeZone);
        }
        if (source.ProxyNodeCount != null) {
            this.ProxyNodeCount = new Long(source.ProxyNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyNodeZone", this.ProxyNodeZone);
        this.setParamSimple(map, prefix + "ProxyNodeCount", this.ProxyNodeCount);

    }
}

