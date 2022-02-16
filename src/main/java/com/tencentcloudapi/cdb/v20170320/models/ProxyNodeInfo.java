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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodeInfo extends AbstractModel{

    /**
    * Proxy node ID
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyNodeId")
    @Expose
    private String ProxyNodeId;

    /**
    * Current number of connections to the node
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyNodeConnections")
    @Expose
    private Long ProxyNodeConnections;

    /**
    * CPU
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyNodeCpu")
    @Expose
    private Long ProxyNodeCpu;

    /**
    * Memory
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyNodeMem")
    @Expose
    private Long ProxyNodeMem;

    /**
    * Node status:
init (applying)
online (active)
offline (inactive)
destroy (destroyed)
recovering (recovering from fault)
error (failed)
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyStatus")
    @Expose
    private String ProxyStatus;

    /**
     * Get Proxy node ID
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyNodeId Proxy node ID
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getProxyNodeId() {
        return this.ProxyNodeId;
    }

    /**
     * Set Proxy node ID
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyNodeId Proxy node ID
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyNodeId(String ProxyNodeId) {
        this.ProxyNodeId = ProxyNodeId;
    }

    /**
     * Get Current number of connections to the node
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyNodeConnections Current number of connections to the node
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getProxyNodeConnections() {
        return this.ProxyNodeConnections;
    }

    /**
     * Set Current number of connections to the node
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyNodeConnections Current number of connections to the node
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyNodeConnections(Long ProxyNodeConnections) {
        this.ProxyNodeConnections = ProxyNodeConnections;
    }

    /**
     * Get CPU
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyNodeCpu CPU
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getProxyNodeCpu() {
        return this.ProxyNodeCpu;
    }

    /**
     * Set CPU
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyNodeCpu CPU
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyNodeCpu(Long ProxyNodeCpu) {
        this.ProxyNodeCpu = ProxyNodeCpu;
    }

    /**
     * Get Memory
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyNodeMem Memory
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getProxyNodeMem() {
        return this.ProxyNodeMem;
    }

    /**
     * Set Memory
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyNodeMem Memory
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyNodeMem(Long ProxyNodeMem) {
        this.ProxyNodeMem = ProxyNodeMem;
    }

    /**
     * Get Node status:
init (applying)
online (active)
offline (inactive)
destroy (destroyed)
recovering (recovering from fault)
error (failed)
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyStatus Node status:
init (applying)
online (active)
offline (inactive)
destroy (destroyed)
recovering (recovering from fault)
error (failed)
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getProxyStatus() {
        return this.ProxyStatus;
    }

    /**
     * Set Node status:
init (applying)
online (active)
offline (inactive)
destroy (destroyed)
recovering (recovering from fault)
error (failed)
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyStatus Node status:
init (applying)
online (active)
offline (inactive)
destroy (destroyed)
recovering (recovering from fault)
error (failed)
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyStatus(String ProxyStatus) {
        this.ProxyStatus = ProxyStatus;
    }

    public ProxyNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNodeInfo(ProxyNodeInfo source) {
        if (source.ProxyNodeId != null) {
            this.ProxyNodeId = new String(source.ProxyNodeId);
        }
        if (source.ProxyNodeConnections != null) {
            this.ProxyNodeConnections = new Long(source.ProxyNodeConnections);
        }
        if (source.ProxyNodeCpu != null) {
            this.ProxyNodeCpu = new Long(source.ProxyNodeCpu);
        }
        if (source.ProxyNodeMem != null) {
            this.ProxyNodeMem = new Long(source.ProxyNodeMem);
        }
        if (source.ProxyStatus != null) {
            this.ProxyStatus = new String(source.ProxyStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyNodeId", this.ProxyNodeId);
        this.setParamSimple(map, prefix + "ProxyNodeConnections", this.ProxyNodeConnections);
        this.setParamSimple(map, prefix + "ProxyNodeCpu", this.ProxyNodeCpu);
        this.setParamSimple(map, prefix + "ProxyNodeMem", this.ProxyNodeMem);
        this.setParamSimple(map, prefix + "ProxyStatus", this.ProxyStatus);

    }
}

