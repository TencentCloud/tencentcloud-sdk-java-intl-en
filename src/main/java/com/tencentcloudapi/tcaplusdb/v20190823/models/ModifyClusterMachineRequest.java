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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterMachineRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Information of the machines at the storage layer (tcapsvr)
    */
    @SerializedName("ServerList")
    @Expose
    private MachineInfo [] ServerList;

    /**
    * Information of the machines at the access layer (tcaproxy)
    */
    @SerializedName("ProxyList")
    @Expose
    private MachineInfo [] ProxyList;

    /**
    * Cluster type. Valid values: `1` (standard), `2` (dedicated)
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Information of the machines at the storage layer (tcapsvr) 
     * @return ServerList Information of the machines at the storage layer (tcapsvr)
     */
    public MachineInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set Information of the machines at the storage layer (tcapsvr)
     * @param ServerList Information of the machines at the storage layer (tcapsvr)
     */
    public void setServerList(MachineInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get Information of the machines at the access layer (tcaproxy) 
     * @return ProxyList Information of the machines at the access layer (tcaproxy)
     */
    public MachineInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set Information of the machines at the access layer (tcaproxy)
     * @param ProxyList Information of the machines at the access layer (tcaproxy)
     */
    public void setProxyList(MachineInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get Cluster type. Valid values: `1` (standard), `2` (dedicated) 
     * @return ClusterType Cluster type. Valid values: `1` (standard), `2` (dedicated)
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Valid values: `1` (standard), `2` (dedicated)
     * @param ClusterType Cluster type. Valid values: `1` (standard), `2` (dedicated)
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    public ModifyClusterMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterMachineRequest(ModifyClusterMachineRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ServerList != null) {
            this.ServerList = new MachineInfo[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new MachineInfo(source.ServerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new MachineInfo[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new MachineInfo(source.ProxyList[i]);
            }
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

