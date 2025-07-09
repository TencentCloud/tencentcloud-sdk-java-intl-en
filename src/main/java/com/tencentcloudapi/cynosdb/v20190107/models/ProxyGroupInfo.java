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

public class ProxyGroupInfo extends AbstractModel {

    /**
    * Database proxy group.
    */
    @SerializedName("ProxyGroup")
    @Expose
    private ProxyGroup ProxyGroup;

    /**
    * Database proxy group read-write separation information.
    */
    @SerializedName("ProxyGroupRwInfo")
    @Expose
    private ProxyGroupRwInfo ProxyGroupRwInfo;

    /**
    * Node information of the database proxy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyNodes")
    @Expose
    private ProxyNodeInfo [] ProxyNodes;

    /**
    * Database proxy connection pool information.
    */
    @SerializedName("ConnectionPool")
    @Expose
    private ProxyConnectionPoolInfo ConnectionPool;

    /**
    * Network information for database proxy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetAddrInfos")
    @Expose
    private NetAddr [] NetAddrInfos;

    /**
    * Database proxy task set.
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
     * Get Database proxy group. 
     * @return ProxyGroup Database proxy group.
     */
    public ProxyGroup getProxyGroup() {
        return this.ProxyGroup;
    }

    /**
     * Set Database proxy group.
     * @param ProxyGroup Database proxy group.
     */
    public void setProxyGroup(ProxyGroup ProxyGroup) {
        this.ProxyGroup = ProxyGroup;
    }

    /**
     * Get Database proxy group read-write separation information. 
     * @return ProxyGroupRwInfo Database proxy group read-write separation information.
     */
    public ProxyGroupRwInfo getProxyGroupRwInfo() {
        return this.ProxyGroupRwInfo;
    }

    /**
     * Set Database proxy group read-write separation information.
     * @param ProxyGroupRwInfo Database proxy group read-write separation information.
     */
    public void setProxyGroupRwInfo(ProxyGroupRwInfo ProxyGroupRwInfo) {
        this.ProxyGroupRwInfo = ProxyGroupRwInfo;
    }

    /**
     * Get Node information of the database proxy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyNodes Node information of the database proxy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProxyNodeInfo [] getProxyNodes() {
        return this.ProxyNodes;
    }

    /**
     * Set Node information of the database proxy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyNodes Node information of the database proxy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyNodes(ProxyNodeInfo [] ProxyNodes) {
        this.ProxyNodes = ProxyNodes;
    }

    /**
     * Get Database proxy connection pool information. 
     * @return ConnectionPool Database proxy connection pool information.
     */
    public ProxyConnectionPoolInfo getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set Database proxy connection pool information.
     * @param ConnectionPool Database proxy connection pool information.
     */
    public void setConnectionPool(ProxyConnectionPoolInfo ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get Network information for database proxy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetAddrInfos Network information for database proxy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NetAddr [] getNetAddrInfos() {
        return this.NetAddrInfos;
    }

    /**
     * Set Network information for database proxy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetAddrInfos Network information for database proxy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetAddrInfos(NetAddr [] NetAddrInfos) {
        this.NetAddrInfos = NetAddrInfos;
    }

    /**
     * Get Database proxy task set. 
     * @return Tasks Database proxy task set.
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Database proxy task set.
     * @param Tasks Database proxy task set.
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    public ProxyGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupInfo(ProxyGroupInfo source) {
        if (source.ProxyGroup != null) {
            this.ProxyGroup = new ProxyGroup(source.ProxyGroup);
        }
        if (source.ProxyGroupRwInfo != null) {
            this.ProxyGroupRwInfo = new ProxyGroupRwInfo(source.ProxyGroupRwInfo);
        }
        if (source.ProxyNodes != null) {
            this.ProxyNodes = new ProxyNodeInfo[source.ProxyNodes.length];
            for (int i = 0; i < source.ProxyNodes.length; i++) {
                this.ProxyNodes[i] = new ProxyNodeInfo(source.ProxyNodes[i]);
            }
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new ProxyConnectionPoolInfo(source.ConnectionPool);
        }
        if (source.NetAddrInfos != null) {
            this.NetAddrInfos = new NetAddr[source.NetAddrInfos.length];
            for (int i = 0; i < source.NetAddrInfos.length; i++) {
                this.NetAddrInfos[i] = new NetAddr(source.NetAddrInfos[i]);
            }
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProxyGroup.", this.ProxyGroup);
        this.setParamObj(map, prefix + "ProxyGroupRwInfo.", this.ProxyGroupRwInfo);
        this.setParamArrayObj(map, prefix + "ProxyNodes.", this.ProxyNodes);
        this.setParamObj(map, prefix + "ConnectionPool.", this.ConnectionPool);
        this.setParamArrayObj(map, prefix + "NetAddrInfos.", this.NetAddrInfos);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);

    }
}

