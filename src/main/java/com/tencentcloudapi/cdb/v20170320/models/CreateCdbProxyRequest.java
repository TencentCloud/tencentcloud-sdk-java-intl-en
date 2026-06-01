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

public class CreateCdbProxyRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
    * Node specification configuration.
Parameter description in the example.
NodeCount: Number of nodes.
Region: Node region.
Zone: Node availability zone.
Cpu: Number of cores per proxy node (unit: core).
Mem: Memory size of each proxy node (unit: MB).
Remarks:
1. Database proxy supported node specifications are: 2C4000MB, 4C8000MB, 8C16000MB.
2. The above parameters (such as number of nodes, availability zone) are required. When calling the API, if incomplete, creation may fail.
    */
    @SerializedName("ProxyNodeCustom")
    @Expose
    private ProxyNodeCustom [] ProxyNodeCustom;

    /**
    * Security group
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Connection pool threshold
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
    * Specify the Linux kernel version of the purchased proxy. Leave it blank to ship the latest version by default.
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get Node specification configuration.
Parameter description in the example.
NodeCount: Number of nodes.
Region: Node region.
Zone: Node availability zone.
Cpu: Number of cores per proxy node (unit: core).
Mem: Memory size of each proxy node (unit: MB).
Remarks:
1. Database proxy supported node specifications are: 2C4000MB, 4C8000MB, 8C16000MB.
2. The above parameters (such as number of nodes, availability zone) are required. When calling the API, if incomplete, creation may fail. 
     * @return ProxyNodeCustom Node specification configuration.
Parameter description in the example.
NodeCount: Number of nodes.
Region: Node region.
Zone: Node availability zone.
Cpu: Number of cores per proxy node (unit: core).
Mem: Memory size of each proxy node (unit: MB).
Remarks:
1. Database proxy supported node specifications are: 2C4000MB, 4C8000MB, 8C16000MB.
2. The above parameters (such as number of nodes, availability zone) are required. When calling the API, if incomplete, creation may fail.
     */
    public ProxyNodeCustom [] getProxyNodeCustom() {
        return this.ProxyNodeCustom;
    }

    /**
     * Set Node specification configuration.
Parameter description in the example.
NodeCount: Number of nodes.
Region: Node region.
Zone: Node availability zone.
Cpu: Number of cores per proxy node (unit: core).
Mem: Memory size of each proxy node (unit: MB).
Remarks:
1. Database proxy supported node specifications are: 2C4000MB, 4C8000MB, 8C16000MB.
2. The above parameters (such as number of nodes, availability zone) are required. When calling the API, if incomplete, creation may fail.
     * @param ProxyNodeCustom Node specification configuration.
Parameter description in the example.
NodeCount: Number of nodes.
Region: Node region.
Zone: Node availability zone.
Cpu: Number of cores per proxy node (unit: core).
Mem: Memory size of each proxy node (unit: MB).
Remarks:
1. Database proxy supported node specifications are: 2C4000MB, 4C8000MB, 8C16000MB.
2. The above parameters (such as number of nodes, availability zone) are required. When calling the API, if incomplete, creation may fail.
     */
    public void setProxyNodeCustom(ProxyNodeCustom [] ProxyNodeCustom) {
        this.ProxyNodeCustom = ProxyNodeCustom;
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
     * Get Connection pool threshold
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630. 
     * @return ConnectionPoolLimit Connection pool threshold
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set Connection pool threshold
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     * @param ConnectionPoolLimit Connection pool threshold
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    /**
     * Get Specify the Linux kernel version of the purchased proxy. Leave it blank to ship the latest version by default. 
     * @return ProxyVersion Specify the Linux kernel version of the purchased proxy. Leave it blank to ship the latest version by default.
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set Specify the Linux kernel version of the purchased proxy. Leave it blank to ship the latest version by default.
     * @param ProxyVersion Specify the Linux kernel version of the purchased proxy. Leave it blank to ship the latest version by default.
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    public CreateCdbProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCdbProxyRequest(CreateCdbProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ProxyNodeCustom != null) {
            this.ProxyNodeCustom = new ProxyNodeCustom[source.ProxyNodeCustom.length];
            for (int i = 0; i < source.ProxyNodeCustom.length; i++) {
                this.ProxyNodeCustom[i] = new ProxyNodeCustom(source.ProxyNodeCustom[i]);
            }
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamArrayObj(map, prefix + "ProxyNodeCustom.", this.ProxyNodeCustom);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);

    }
}

