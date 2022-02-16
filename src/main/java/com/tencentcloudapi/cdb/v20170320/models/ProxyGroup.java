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

public class ProxyGroup extends AbstractModel{

    /**
    * Basic information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("BaseGroup")
    @Expose
    private BaseGroupInfo BaseGroup;

    /**
    * Address information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Address")
    @Expose
    private Address [] Address;

    /**
    * Connection pool information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ConnectionPoolInfo")
    @Expose
    private ConnectionPoolInfo ConnectionPoolInfo;

    /**
    * Node information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyNode")
    @Expose
    private ProxyNodeInfo [] ProxyNode;

    /**
    * Routing information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("RWInstInfo")
    @Expose
    private RWInfo RWInstInfo;

    /**
     * Get Basic information of the proxy
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return BaseGroup Basic information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public BaseGroupInfo getBaseGroup() {
        return this.BaseGroup;
    }

    /**
     * Set Basic information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     * @param BaseGroup Basic information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setBaseGroup(BaseGroupInfo BaseGroup) {
        this.BaseGroup = BaseGroup;
    }

    /**
     * Get Address information of the proxy
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Address Address information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Address [] getAddress() {
        return this.Address;
    }

    /**
     * Set Address information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Address Address information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setAddress(Address [] Address) {
        this.Address = Address;
    }

    /**
     * Get Connection pool information of the proxy
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ConnectionPoolInfo Connection pool information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public ConnectionPoolInfo getConnectionPoolInfo() {
        return this.ConnectionPoolInfo;
    }

    /**
     * Set Connection pool information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ConnectionPoolInfo Connection pool information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setConnectionPoolInfo(ConnectionPoolInfo ConnectionPoolInfo) {
        this.ConnectionPoolInfo = ConnectionPoolInfo;
    }

    /**
     * Get Node information of the proxy
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyNode Node information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public ProxyNodeInfo [] getProxyNode() {
        return this.ProxyNode;
    }

    /**
     * Set Node information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyNode Node information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyNode(ProxyNodeInfo [] ProxyNode) {
        this.ProxyNode = ProxyNode;
    }

    /**
     * Get Routing information of the proxy
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return RWInstInfo Routing information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public RWInfo getRWInstInfo() {
        return this.RWInstInfo;
    }

    /**
     * Set Routing information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     * @param RWInstInfo Routing information of the proxy
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setRWInstInfo(RWInfo RWInstInfo) {
        this.RWInstInfo = RWInstInfo;
    }

    public ProxyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroup(ProxyGroup source) {
        if (source.BaseGroup != null) {
            this.BaseGroup = new BaseGroupInfo(source.BaseGroup);
        }
        if (source.Address != null) {
            this.Address = new Address[source.Address.length];
            for (int i = 0; i < source.Address.length; i++) {
                this.Address[i] = new Address(source.Address[i]);
            }
        }
        if (source.ConnectionPoolInfo != null) {
            this.ConnectionPoolInfo = new ConnectionPoolInfo(source.ConnectionPoolInfo);
        }
        if (source.ProxyNode != null) {
            this.ProxyNode = new ProxyNodeInfo[source.ProxyNode.length];
            for (int i = 0; i < source.ProxyNode.length; i++) {
                this.ProxyNode[i] = new ProxyNodeInfo(source.ProxyNode[i]);
            }
        }
        if (source.RWInstInfo != null) {
            this.RWInstInfo = new RWInfo(source.RWInstInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseGroup.", this.BaseGroup);
        this.setParamArrayObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "ConnectionPoolInfo.", this.ConnectionPoolInfo);
        this.setParamArrayObj(map, prefix + "ProxyNode.", this.ProxyNode);
        this.setParamObj(map, prefix + "RWInstInfo.", this.RWInstInfo);

    }
}

