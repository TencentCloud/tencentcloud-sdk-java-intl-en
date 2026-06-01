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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCdbProxyAddressRequest extends AbstractModel {

    /**
    * Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`.
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`.
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * Least read-only instances. Minimum value:  `0`
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * Delay removal threshold, minimum value: 1, range: 1–10000. The value is an integer.
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * Whether to enable failover. Valid values: `true`, `false`.
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * Whether to automatically add newly created read-only instances. Valid values: `true`, `false`.
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * Whether it is read-only. Valid values: `true`, `false`.
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * Whether to enable transaction splitting. Valid values: `true`, `false`.
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * Assignment of read/write weights
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
    * VPC ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Private subnet ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Whether to enable connection pool. Off by default.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * IP. Leave it blank to default to a random supported IP in the selected VPC.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port. Default value 3306.
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Security group
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Connection pool type. Available values: transaction (transaction-level connection pool), connection (session-level connection pool). This parameter is valid only when ConnectionPool is true. Default value: connection.
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * Whether adaptive load balancing is enabled. Off by default.
    */
    @SerializedName("AutoLoadBalance")
    @Expose
    private Boolean AutoLoadBalance;

    /**
    * Access mode. nearBy - proximity access, balance - balanced allocation. Default value: nearBy.
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
     * Get Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API. 
     * @return ProxyGroupId Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     * @param ProxyGroupId Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`. 
     * @return WeightMode Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`.
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`.
     * @param WeightMode Assignment mode of weights. Valid values: `system` (auto-assigned), `custom`.
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`. 
     * @return IsKickOut Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`.
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`.
     * @param IsKickOut Whether to remove delayed read-only instances from the proxy group. Valid values: `true`, `false`.
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get Least read-only instances. Minimum value:  `0` 
     * @return MinCount Least read-only instances. Minimum value:  `0`
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set Least read-only instances. Minimum value:  `0`
     * @param MinCount Least read-only instances. Minimum value:  `0`
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get Delay removal threshold, minimum value: 1, range: 1–10000. The value is an integer. 
     * @return MaxDelay Delay removal threshold, minimum value: 1, range: 1–10000. The value is an integer.
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set Delay removal threshold, minimum value: 1, range: 1–10000. The value is an integer.
     * @param MaxDelay Delay removal threshold, minimum value: 1, range: 1–10000. The value is an integer.
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get Whether to enable failover. Valid values: `true`, `false`. 
     * @return FailOver Whether to enable failover. Valid values: `true`, `false`.
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set Whether to enable failover. Valid values: `true`, `false`.
     * @param FailOver Whether to enable failover. Valid values: `true`, `false`.
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get Whether to automatically add newly created read-only instances. Valid values: `true`, `false`. 
     * @return AutoAddRo Whether to automatically add newly created read-only instances. Valid values: `true`, `false`.
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Whether to automatically add newly created read-only instances. Valid values: `true`, `false`.
     * @param AutoAddRo Whether to automatically add newly created read-only instances. Valid values: `true`, `false`.
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Whether it is read-only. Valid values: `true`, `false`. 
     * @return ReadOnly Whether it is read-only. Valid values: `true`, `false`.
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Whether it is read-only. Valid values: `true`, `false`.
     * @param ReadOnly Whether it is read-only. Valid values: `true`, `false`.
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Whether to enable transaction splitting. Valid values: `true`, `false`. 
     * @return TransSplit Whether to enable transaction splitting. Valid values: `true`, `false`.
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set Whether to enable transaction splitting. Valid values: `true`, `false`.
     * @param TransSplit Whether to enable transaction splitting. Valid values: `true`, `false`.
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get Assignment of read/write weights 
     * @return ProxyAllocation Assignment of read/write weights
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set Assignment of read/write weights
     * @param ProxyAllocation Assignment of read/write weights
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    /**
     * Get VPC ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return UniqVpcId VPC ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param UniqVpcId VPC ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Private subnet ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return UniqSubnetId Private subnet ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Private subnet ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param UniqSubnetId Private subnet ID. Obtain through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Whether to enable connection pool. Off by default.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630. 
     * @return ConnectionPool Whether to enable connection pool. Off by default.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set Whether to enable connection pool. Off by default.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     * @param ConnectionPool Whether to enable connection pool. Off by default.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get Description 
     * @return Desc Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
     * @param Desc Description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get IP. Leave it blank to default to a random supported IP in the selected VPC. 
     * @return Vip IP. Leave it blank to default to a random supported IP in the selected VPC.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP. Leave it blank to default to a random supported IP in the selected VPC.
     * @param Vip IP. Leave it blank to default to a random supported IP in the selected VPC.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port. Default value 3306. 
     * @return VPort Port. Default value 3306.
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Port. Default value 3306.
     * @param VPort Port. Default value 3306.
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Security group 
     * @return SecurityGroup Security group
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group
     * @param SecurityGroup Security group
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Connection pool type. Available values: transaction (transaction-level connection pool), connection (session-level connection pool). This parameter is valid only when ConnectionPool is true. Default value: connection. 
     * @return ConnectionPoolType Connection pool type. Available values: transaction (transaction-level connection pool), connection (session-level connection pool). This parameter is valid only when ConnectionPool is true. Default value: connection.
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set Connection pool type. Available values: transaction (transaction-level connection pool), connection (session-level connection pool). This parameter is valid only when ConnectionPool is true. Default value: connection.
     * @param ConnectionPoolType Connection pool type. Available values: transaction (transaction-level connection pool), connection (session-level connection pool). This parameter is valid only when ConnectionPool is true. Default value: connection.
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get Whether adaptive load balancing is enabled. Off by default. 
     * @return AutoLoadBalance Whether adaptive load balancing is enabled. Off by default.
     */
    public Boolean getAutoLoadBalance() {
        return this.AutoLoadBalance;
    }

    /**
     * Set Whether adaptive load balancing is enabled. Off by default.
     * @param AutoLoadBalance Whether adaptive load balancing is enabled. Off by default.
     */
    public void setAutoLoadBalance(Boolean AutoLoadBalance) {
        this.AutoLoadBalance = AutoLoadBalance;
    }

    /**
     * Get Access mode. nearBy - proximity access, balance - balanced allocation. Default value: nearBy. 
     * @return AccessMode Access mode. nearBy - proximity access, balance - balanced allocation. Default value: nearBy.
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set Access mode. nearBy - proximity access, balance - balanced allocation. Default value: nearBy.
     * @param AccessMode Access mode. nearBy - proximity access, balance - balanced allocation. Default value: nearBy.
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    public CreateCdbProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCdbProxyAddressRequest(CreateCdbProxyAddressRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.IsKickOut != null) {
            this.IsKickOut = new Boolean(source.IsKickOut);
        }
        if (source.MinCount != null) {
            this.MinCount = new Long(source.MinCount);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.ProxyAllocation != null) {
            this.ProxyAllocation = new ProxyAllocation[source.ProxyAllocation.length];
            for (int i = 0; i < source.ProxyAllocation.length; i++) {
                this.ProxyAllocation[i] = new ProxyAllocation(source.ProxyAllocation[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.AutoLoadBalance != null) {
            this.AutoLoadBalance = new Boolean(source.AutoLoadBalance);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "AutoLoadBalance", this.AutoLoadBalance);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);

    }
}

