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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Target extends AbstractModel {

    /**
    * Listening port of the backend service.
Note: This parameter must be specified when binding to CVM (Cloud Virtual Machine) or ENI (Elastic Network Interface).
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Backend service type, optional: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). As an input parameter, this parameter does not take effect.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This parameter must be passed in when binding to CVM. It represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances API. It indicates binding to the primary IPv4 address of the primary network interface. The following scenarios do not support specifying InstanceId: binding to non-CVM resources, binding to auxiliary network interface IPs on CVM, binding to CVM through cross-region 2.0, and binding to IPv6 addresses of CVM.
Note: You can only input one of the InstanceId or EniIp parameter.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The forwarding weight of the backend service after modification, with a value range of [0, 100], defaults to 10. This parameter has a higher priority than the Weight parameter in [RsWeightRule](https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). The final weight value is based on this Weight parameter. Only when this Weight parameter is empty, the Weight parameter in RsWeightRule will be used.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * This parameter must be passed in for IP binding. It supports ENI IPs and other private IP addresses. If it is an ENI, it must first bind to a CVM before binding to a CLB instance.
Note: You can only input one of the InstanceId or EniIp parameter. If it is binding a dual-stack IPV6 instance, you must pass this parameter. If it is cross-region binding, you must pass the parameter, and the InstanceId parameter is not supported.
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
     * Get Listening port of the backend service.
Note: This parameter must be specified when binding to CVM (Cloud Virtual Machine) or ENI (Elastic Network Interface). 
     * @return Port Listening port of the backend service.
Note: This parameter must be specified when binding to CVM (Cloud Virtual Machine) or ENI (Elastic Network Interface).
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listening port of the backend service.
Note: This parameter must be specified when binding to CVM (Cloud Virtual Machine) or ENI (Elastic Network Interface).
     * @param Port Listening port of the backend service.
Note: This parameter must be specified when binding to CVM (Cloud Virtual Machine) or ENI (Elastic Network Interface).
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Backend service type, optional: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). As an input parameter, this parameter does not take effect. 
     * @return Type Backend service type, optional: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). As an input parameter, this parameter does not take effect.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Backend service type, optional: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). As an input parameter, this parameter does not take effect.
     * @param Type Backend service type, optional: CVM (Cloud Virtual Machine), ENI (Elastic Network Interface). As an input parameter, this parameter does not take effect.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This parameter must be passed in when binding to CVM. It represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances API. It indicates binding to the primary IPv4 address of the primary network interface. The following scenarios do not support specifying InstanceId: binding to non-CVM resources, binding to auxiliary network interface IPs on CVM, binding to CVM through cross-region 2.0, and binding to IPv6 addresses of CVM.
Note: You can only input one of the InstanceId or EniIp parameter. 
     * @return InstanceId This parameter must be passed in when binding to CVM. It represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances API. It indicates binding to the primary IPv4 address of the primary network interface. The following scenarios do not support specifying InstanceId: binding to non-CVM resources, binding to auxiliary network interface IPs on CVM, binding to CVM through cross-region 2.0, and binding to IPv6 addresses of CVM.
Note: You can only input one of the InstanceId or EniIp parameter.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set This parameter must be passed in when binding to CVM. It represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances API. It indicates binding to the primary IPv4 address of the primary network interface. The following scenarios do not support specifying InstanceId: binding to non-CVM resources, binding to auxiliary network interface IPs on CVM, binding to CVM through cross-region 2.0, and binding to IPv6 addresses of CVM.
Note: You can only input one of the InstanceId or EniIp parameter.
     * @param InstanceId This parameter must be passed in when binding to CVM. It represents the unique ID of the CVM and can be obtained from the InstanceId field in the response of the DescribeInstances API. It indicates binding to the primary IPv4 address of the primary network interface. The following scenarios do not support specifying InstanceId: binding to non-CVM resources, binding to auxiliary network interface IPs on CVM, binding to CVM through cross-region 2.0, and binding to IPv6 addresses of CVM.
Note: You can only input one of the InstanceId or EniIp parameter.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The forwarding weight of the backend service after modification, with a value range of [0, 100], defaults to 10. This parameter has a higher priority than the Weight parameter in [RsWeightRule](https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). The final weight value is based on this Weight parameter. Only when this Weight parameter is empty, the Weight parameter in RsWeightRule will be used. 
     * @return Weight The forwarding weight of the backend service after modification, with a value range of [0, 100], defaults to 10. This parameter has a higher priority than the Weight parameter in [RsWeightRule](https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). The final weight value is based on this Weight parameter. Only when this Weight parameter is empty, the Weight parameter in RsWeightRule will be used.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set The forwarding weight of the backend service after modification, with a value range of [0, 100], defaults to 10. This parameter has a higher priority than the Weight parameter in [RsWeightRule](https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). The final weight value is based on this Weight parameter. Only when this Weight parameter is empty, the Weight parameter in RsWeightRule will be used.
     * @param Weight The forwarding weight of the backend service after modification, with a value range of [0, 100], defaults to 10. This parameter has a higher priority than the Weight parameter in [RsWeightRule](https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#RsWeightRule). The final weight value is based on this Weight parameter. Only when this Weight parameter is empty, the Weight parameter in RsWeightRule will be used.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get This parameter must be passed in for IP binding. It supports ENI IPs and other private IP addresses. If it is an ENI, it must first bind to a CVM before binding to a CLB instance.
Note: You can only input one of the InstanceId or EniIp parameter. If it is binding a dual-stack IPV6 instance, you must pass this parameter. If it is cross-region binding, you must pass the parameter, and the InstanceId parameter is not supported. 
     * @return EniIp This parameter must be passed in for IP binding. It supports ENI IPs and other private IP addresses. If it is an ENI, it must first bind to a CVM before binding to a CLB instance.
Note: You can only input one of the InstanceId or EniIp parameter. If it is binding a dual-stack IPV6 instance, you must pass this parameter. If it is cross-region binding, you must pass the parameter, and the InstanceId parameter is not supported.
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set This parameter must be passed in for IP binding. It supports ENI IPs and other private IP addresses. If it is an ENI, it must first bind to a CVM before binding to a CLB instance.
Note: You can only input one of the InstanceId or EniIp parameter. If it is binding a dual-stack IPV6 instance, you must pass this parameter. If it is cross-region binding, you must pass the parameter, and the InstanceId parameter is not supported.
     * @param EniIp This parameter must be passed in for IP binding. It supports ENI IPs and other private IP addresses. If it is an ENI, it must first bind to a CVM before binding to a CLB instance.
Note: You can only input one of the InstanceId or EniIp parameter. If it is binding a dual-stack IPV6 instance, you must pass this parameter. If it is cross-region binding, you must pass the parameter, and the InstanceId parameter is not supported.
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
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

    }
}

