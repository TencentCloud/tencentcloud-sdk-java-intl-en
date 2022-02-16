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

public class DescribeCDBProxyResponse extends AbstractModel{

    /**
    * Basic information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("BaseGroup")
    @Expose
    private BaseGroupInfo BaseGroup;

    /**
    * Address information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * Node information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyNode")
    @Expose
    private ProxyNodeInfo ProxyNode;

    /**
    * Read/Write separation information
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("RWInstInfo")
    @Expose
    private RWInfo RWInstInfo;

    /**
    * Connection pool information
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ConnectionPoolInfo")
    @Expose
    private ConnectionPoolInfo ConnectionPoolInfo;

    /**
    * Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Proxy information
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyGroup")
    @Expose
    private ProxyGroup [] ProxyGroup;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Basic information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return BaseGroup Basic information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public BaseGroupInfo getBaseGroup() {
        return this.BaseGroup;
    }

    /**
     * Set Basic information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param BaseGroup Basic information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setBaseGroup(BaseGroupInfo BaseGroup) {
        this.BaseGroup = BaseGroup;
    }

    /**
     * Get Address information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Address Address information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set Address information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Address Address information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get Node information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyNode Node information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public ProxyNodeInfo getProxyNode() {
        return this.ProxyNode;
    }

    /**
     * Set Node information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyNode Node information of the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyNode(ProxyNodeInfo ProxyNode) {
        this.ProxyNode = ProxyNode;
    }

    /**
     * Get Read/Write separation information
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return RWInstInfo Read/Write separation information
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public RWInfo getRWInstInfo() {
        return this.RWInstInfo;
    }

    /**
     * Set Read/Write separation information
Note: this field may return `null`, indicating that no valid value can be found.
     * @param RWInstInfo Read/Write separation information
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setRWInstInfo(RWInfo RWInstInfo) {
        this.RWInstInfo = RWInstInfo;
    }

    /**
     * Get Connection pool information
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ConnectionPoolInfo Connection pool information
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public ConnectionPoolInfo getConnectionPoolInfo() {
        return this.ConnectionPoolInfo;
    }

    /**
     * Set Connection pool information
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ConnectionPoolInfo Connection pool information
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setConnectionPoolInfo(ConnectionPoolInfo ConnectionPoolInfo) {
        this.ConnectionPoolInfo = ConnectionPoolInfo;
    }

    /**
     * Get Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Count Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Count Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Proxy information
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyGroup Proxy information
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public ProxyGroup [] getProxyGroup() {
        return this.ProxyGroup;
    }

    /**
     * Set Proxy information
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyGroup Proxy information
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyGroup(ProxyGroup [] ProxyGroup) {
        this.ProxyGroup = ProxyGroup;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCDBProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCDBProxyResponse(DescribeCDBProxyResponse source) {
        if (source.BaseGroup != null) {
            this.BaseGroup = new BaseGroupInfo(source.BaseGroup);
        }
        if (source.Address != null) {
            this.Address = new Address(source.Address);
        }
        if (source.ProxyNode != null) {
            this.ProxyNode = new ProxyNodeInfo(source.ProxyNode);
        }
        if (source.RWInstInfo != null) {
            this.RWInstInfo = new RWInfo(source.RWInstInfo);
        }
        if (source.ConnectionPoolInfo != null) {
            this.ConnectionPoolInfo = new ConnectionPoolInfo(source.ConnectionPoolInfo);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ProxyGroup != null) {
            this.ProxyGroup = new ProxyGroup[source.ProxyGroup.length];
            for (int i = 0; i < source.ProxyGroup.length; i++) {
                this.ProxyGroup[i] = new ProxyGroup(source.ProxyGroup[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseGroup.", this.BaseGroup);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "ProxyNode.", this.ProxyNode);
        this.setParamObj(map, prefix + "RWInstInfo.", this.RWInstInfo);
        this.setParamObj(map, prefix + "ConnectionPoolInfo.", this.ConnectionPoolInfo);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "ProxyGroup.", this.ProxyGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

