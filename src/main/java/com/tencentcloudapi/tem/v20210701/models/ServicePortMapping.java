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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServicePortMapping extends AbstractModel{

    /**
    * Specifies how a layer-4 proxy is created.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * VIP for access within the environment
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterIp")
    @Expose
    private String ClusterIp;

    /**
    * Cluster external IP
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExternalIp")
    @Expose
    private String ExternalIp;

    /**
    * Subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Load balancer ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalanceId")
    @Expose
    private String LoadBalanceId;

    /**
    * YAML contents
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * List of exposed ports
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * Port mapping array 
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PortMappingItemList")
    @Expose
    private ServicePortMappingItem [] PortMappingItemList;

    /**
     * Get Specifies how a layer-4 proxy is created.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Type Specifies how a layer-4 proxy is created.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies how a layer-4 proxy is created.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Type Specifies how a layer-4 proxy is created.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Application name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ServiceName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ServiceName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get VIP for access within the environment
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterIp VIP for access within the environment
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set VIP for access within the environment
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterIp VIP for access within the environment
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterIp(String ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get Cluster external IP
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExternalIp Cluster external IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getExternalIp() {
        return this.ExternalIp;
    }

    /**
     * Set Cluster external IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExternalIp Cluster external IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExternalIp(String ExternalIp) {
        this.ExternalIp = ExternalIp;
    }

    /**
     * Get Subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param VpcId VPC ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Load balancer ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LoadBalanceId Load balancer ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLoadBalanceId() {
        return this.LoadBalanceId;
    }

    /**
     * Set Load balancer ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LoadBalanceId Load balancer ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLoadBalanceId(String LoadBalanceId) {
        this.LoadBalanceId = LoadBalanceId;
    }

    /**
     * Get YAML contents
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Yaml YAML contents
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set YAML contents
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Yaml YAML contents
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get List of exposed ports
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Ports List of exposed ports
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set List of exposed ports
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Ports List of exposed ports
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get Port mapping array 
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PortMappingItemList Port mapping array 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ServicePortMappingItem [] getPortMappingItemList() {
        return this.PortMappingItemList;
    }

    /**
     * Set Port mapping array 
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PortMappingItemList Port mapping array 
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPortMappingItemList(ServicePortMappingItem [] PortMappingItemList) {
        this.PortMappingItemList = PortMappingItemList;
    }

    public ServicePortMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServicePortMapping(ServicePortMapping source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ClusterIp != null) {
            this.ClusterIp = new String(source.ClusterIp);
        }
        if (source.ExternalIp != null) {
            this.ExternalIp = new String(source.ExternalIp);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.LoadBalanceId != null) {
            this.LoadBalanceId = new String(source.LoadBalanceId);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.PortMappingItemList != null) {
            this.PortMappingItemList = new ServicePortMappingItem[source.PortMappingItemList.length];
            for (int i = 0; i < source.PortMappingItemList.length; i++) {
                this.PortMappingItemList[i] = new ServicePortMappingItem(source.PortMappingItemList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ClusterIp", this.ClusterIp);
        this.setParamSimple(map, prefix + "ExternalIp", this.ExternalIp);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "LoadBalanceId", this.LoadBalanceId);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamArrayObj(map, prefix + "PortMappingItemList.", this.PortMappingItemList);

    }
}

