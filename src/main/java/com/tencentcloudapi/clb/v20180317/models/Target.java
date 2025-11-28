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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Target extends AbstractModel {

    /**
    * Specifies the listening port of the backend service.
Note: this parameter must be specified when binding to CVM (cloud virtual machine) or ENI (elastic network interface).
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Specifies the backend service type. valid values: CVM (cloud virtual machine), ENI (elastic network interface). as an input parameter, this parameter does not take effect currently.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This parameter must be passed in when binding to CVM. it represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances api. indicates binding the primary IPv4 address of the primary network interface. the InstanceId cannot be specified in the following scenarios: binding to non-CVM resources, binding to auxiliary network interface ips on CVM, binding to CVM through cross-domain 2.0, and binding to IPv6 addresses of CVM.
Note: you can only input one of the InstanceId parameter or the EniIp parameter.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The new forwarding weight of the real server. Value range: [0, 100]. Default: 10. This parameter takes priority over `Weight` in [`RsWeightRule`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). If it’s left empty, the value of `Weight` in `RsWeightRule` will be used.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * This parameter must be passed in for IP binding. it supports eni ips and other private IP addresses. if it is an eni, it must first be bound to a CVM before binding to a cloud load balancer instance.
Note: only one of the InstanceId parameter and EniIp parameter can be passed. if binding a dual-stack IPV6 instance, this parameter must be passed. if it is a cross-region binding, the parameter must be passed and the InstanceId parameter is not supported.
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get Specifies the listening port of the backend service.
Note: this parameter must be specified when binding to CVM (cloud virtual machine) or ENI (elastic network interface). 
     * @return Port Specifies the listening port of the backend service.
Note: this parameter must be specified when binding to CVM (cloud virtual machine) or ENI (elastic network interface).
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Specifies the listening port of the backend service.
Note: this parameter must be specified when binding to CVM (cloud virtual machine) or ENI (elastic network interface).
     * @param Port Specifies the listening port of the backend service.
Note: this parameter must be specified when binding to CVM (cloud virtual machine) or ENI (elastic network interface).
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Specifies the backend service type. valid values: CVM (cloud virtual machine), ENI (elastic network interface). as an input parameter, this parameter does not take effect currently. 
     * @return Type Specifies the backend service type. valid values: CVM (cloud virtual machine), ENI (elastic network interface). as an input parameter, this parameter does not take effect currently.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies the backend service type. valid values: CVM (cloud virtual machine), ENI (elastic network interface). as an input parameter, this parameter does not take effect currently.
     * @param Type Specifies the backend service type. valid values: CVM (cloud virtual machine), ENI (elastic network interface). as an input parameter, this parameter does not take effect currently.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This parameter must be passed in when binding to CVM. it represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances api. indicates binding the primary IPv4 address of the primary network interface. the InstanceId cannot be specified in the following scenarios: binding to non-CVM resources, binding to auxiliary network interface ips on CVM, binding to CVM through cross-domain 2.0, and binding to IPv6 addresses of CVM.
Note: you can only input one of the InstanceId parameter or the EniIp parameter. 
     * @return InstanceId This parameter must be passed in when binding to CVM. it represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances api. indicates binding the primary IPv4 address of the primary network interface. the InstanceId cannot be specified in the following scenarios: binding to non-CVM resources, binding to auxiliary network interface ips on CVM, binding to CVM through cross-domain 2.0, and binding to IPv6 addresses of CVM.
Note: you can only input one of the InstanceId parameter or the EniIp parameter.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set This parameter must be passed in when binding to CVM. it represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances api. indicates binding the primary IPv4 address of the primary network interface. the InstanceId cannot be specified in the following scenarios: binding to non-CVM resources, binding to auxiliary network interface ips on CVM, binding to CVM through cross-domain 2.0, and binding to IPv6 addresses of CVM.
Note: you can only input one of the InstanceId parameter or the EniIp parameter.
     * @param InstanceId This parameter must be passed in when binding to CVM. it represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances api. indicates binding the primary IPv4 address of the primary network interface. the InstanceId cannot be specified in the following scenarios: binding to non-CVM resources, binding to auxiliary network interface ips on CVM, binding to CVM through cross-domain 2.0, and binding to IPv6 addresses of CVM.
Note: you can only input one of the InstanceId parameter or the EniIp parameter.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The new forwarding weight of the real server. Value range: [0, 100]. Default: 10. This parameter takes priority over `Weight` in [`RsWeightRule`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). If it’s left empty, the value of `Weight` in `RsWeightRule` will be used. 
     * @return Weight The new forwarding weight of the real server. Value range: [0, 100]. Default: 10. This parameter takes priority over `Weight` in [`RsWeightRule`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). If it’s left empty, the value of `Weight` in `RsWeightRule` will be used.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set The new forwarding weight of the real server. Value range: [0, 100]. Default: 10. This parameter takes priority over `Weight` in [`RsWeightRule`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). If it’s left empty, the value of `Weight` in `RsWeightRule` will be used.
     * @param Weight The new forwarding weight of the real server. Value range: [0, 100]. Default: 10. This parameter takes priority over `Weight` in [`RsWeightRule`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). If it’s left empty, the value of `Weight` in `RsWeightRule` will be used.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get This parameter must be passed in for IP binding. it supports eni ips and other private IP addresses. if it is an eni, it must first be bound to a CVM before binding to a cloud load balancer instance.
Note: only one of the InstanceId parameter and EniIp parameter can be passed. if binding a dual-stack IPV6 instance, this parameter must be passed. if it is a cross-region binding, the parameter must be passed and the InstanceId parameter is not supported. 
     * @return EniIp This parameter must be passed in for IP binding. it supports eni ips and other private IP addresses. if it is an eni, it must first be bound to a CVM before binding to a cloud load balancer instance.
Note: only one of the InstanceId parameter and EniIp parameter can be passed. if binding a dual-stack IPV6 instance, this parameter must be passed. if it is a cross-region binding, the parameter must be passed and the InstanceId parameter is not supported.
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set This parameter must be passed in for IP binding. it supports eni ips and other private IP addresses. if it is an eni, it must first be bound to a CVM before binding to a cloud load balancer instance.
Note: only one of the InstanceId parameter and EniIp parameter can be passed. if binding a dual-stack IPV6 instance, this parameter must be passed. if it is a cross-region binding, the parameter must be passed and the InstanceId parameter is not supported.
     * @param EniIp This parameter must be passed in for IP binding. it supports eni ips and other private IP addresses. if it is an eni, it must first be bound to a CVM before binding to a cloud load balancer instance.
Note: only one of the InstanceId parameter and EniIp parameter can be passed. if binding a dual-stack IPV6 instance, this parameter must be passed. if it is a cross-region binding, the parameter must be passed and the InstanceId parameter is not supported.
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get Tag. 
     * @return Tag Tag.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Tag.
     * @param Tag Tag.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public Target() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Target(Target source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.EniIp != null) {
            this.EniIp = new String(source.EniIp);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

