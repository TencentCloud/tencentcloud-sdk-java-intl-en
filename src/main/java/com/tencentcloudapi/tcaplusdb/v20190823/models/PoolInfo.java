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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PoolInfo extends AbstractModel {

    /**
    * Unique ID
    */
    @SerializedName("PoolUid")
    @Expose
    private Long PoolUid;

    /**
    * Whether IPv6 is supported
    */
    @SerializedName("Ipv6Enable")
    @Expose
    private Long Ipv6Enable;

    /**
    * Remaining available cluster resources
    */
    @SerializedName("AvailableAppCount")
    @Expose
    private Long AvailableAppCount;

    /**
    * The list of machines at the storage layer (tcapsvr)
    */
    @SerializedName("ServerList")
    @Expose
    private ServerMachineInfo [] ServerList;

    /**
    * The list of machines at the access layer (tcaproxy)
    */
    @SerializedName("ProxyList")
    @Expose
    private ProxyMachineInfo [] ProxyList;

    /**
     * Get Unique ID 
     * @return PoolUid Unique ID
     */
    public Long getPoolUid() {
        return this.PoolUid;
    }

    /**
     * Set Unique ID
     * @param PoolUid Unique ID
     */
    public void setPoolUid(Long PoolUid) {
        this.PoolUid = PoolUid;
    }

    /**
     * Get Whether IPv6 is supported 
     * @return Ipv6Enable Whether IPv6 is supported
     */
    public Long getIpv6Enable() {
        return this.Ipv6Enable;
    }

    /**
     * Set Whether IPv6 is supported
     * @param Ipv6Enable Whether IPv6 is supported
     */
    public void setIpv6Enable(Long Ipv6Enable) {
        this.Ipv6Enable = Ipv6Enable;
    }

    /**
     * Get Remaining available cluster resources 
     * @return AvailableAppCount Remaining available cluster resources
     */
    public Long getAvailableAppCount() {
        return this.AvailableAppCount;
    }

    /**
     * Set Remaining available cluster resources
     * @param AvailableAppCount Remaining available cluster resources
     */
    public void setAvailableAppCount(Long AvailableAppCount) {
        this.AvailableAppCount = AvailableAppCount;
    }

    /**
     * Get The list of machines at the storage layer (tcapsvr) 
     * @return ServerList The list of machines at the storage layer (tcapsvr)
     */
    public ServerMachineInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set The list of machines at the storage layer (tcapsvr)
     * @param ServerList The list of machines at the storage layer (tcapsvr)
     */
    public void setServerList(ServerMachineInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get The list of machines at the access layer (tcaproxy) 
     * @return ProxyList The list of machines at the access layer (tcaproxy)
     */
    public ProxyMachineInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set The list of machines at the access layer (tcaproxy)
     * @param ProxyList The list of machines at the access layer (tcaproxy)
     */
    public void setProxyList(ProxyMachineInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    public PoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoolInfo(PoolInfo source) {
        if (source.PoolUid != null) {
            this.PoolUid = new Long(source.PoolUid);
        }
        if (source.Ipv6Enable != null) {
            this.Ipv6Enable = new Long(source.Ipv6Enable);
        }
        if (source.AvailableAppCount != null) {
            this.AvailableAppCount = new Long(source.AvailableAppCount);
        }
        if (source.ServerList != null) {
            this.ServerList = new ServerMachineInfo[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new ServerMachineInfo(source.ServerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new ProxyMachineInfo[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new ProxyMachineInfo(source.ProxyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PoolUid", this.PoolUid);
        this.setParamSimple(map, prefix + "Ipv6Enable", this.Ipv6Enable);
        this.setParamSimple(map, prefix + "AvailableAppCount", this.AvailableAppCount);
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);

    }
}

