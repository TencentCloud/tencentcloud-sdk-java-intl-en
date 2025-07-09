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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EksService extends AbstractModel {

    /**
    * Service name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Available ports
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * Yaml contents
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * Service name
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Version name
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Private IP
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ClusterIp")
    @Expose
    private String [] ClusterIp;

    /**
    * Public IP
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ExternalIp")
    @Expose
    private String ExternalIp;

    /**
    * The access type. Valid values:
- EXTERNAL (internet access)
- VPC（Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LoadBalanceId")
    @Expose
    private String LoadBalanceId;

    /**
    * Port Mapping
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PortMappings")
    @Expose
    private PortMapping [] PortMappings;

    /**
     * Get Service name 
     * @return Name Service name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service name
     * @param Name Service name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Available ports 
     * @return Ports Available ports
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set Available ports
     * @param Ports Available ports
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get Yaml contents 
     * @return Yaml Yaml contents
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set Yaml contents
     * @param Yaml Yaml contents
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get Service name
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return ServiceName Service name
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param ServiceName Service name
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Version name
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return VersionName Version name
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Version name
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param VersionName Version name
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Private IP
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return ClusterIp Private IP
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set Private IP
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param ClusterIp Private IP
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setClusterIp(String [] ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get Public IP
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return ExternalIp Public IP
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getExternalIp() {
        return this.ExternalIp;
    }

    /**
     * Set Public IP
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param ExternalIp Public IP
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setExternalIp(String ExternalIp) {
        this.ExternalIp = ExternalIp;
    }

    /**
     * Get The access type. Valid values:
- EXTERNAL (internet access)
- VPC（Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Type The access type. Valid values:
- EXTERNAL (internet access)
- VPC（Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The access type. Valid values:
- EXTERNAL (internet access)
- VPC（Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Type The access type. Valid values:
- EXTERNAL (internet access)
- VPC（Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return SubnetId Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param SubnetId Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LoadBalanceId Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getLoadBalanceId() {
        return this.LoadBalanceId;
    }

    /**
     * Set Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LoadBalanceId Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLoadBalanceId(String LoadBalanceId) {
        this.LoadBalanceId = LoadBalanceId;
    }

    /**
     * Get Port Mapping
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PortMappings Port Mapping
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public PortMapping [] getPortMappings() {
        return this.PortMappings;
    }

    /**
     * Set Port Mapping
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PortMappings Port Mapping
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPortMappings(PortMapping [] PortMappings) {
        this.PortMappings = PortMappings;
    }

    public EksService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EksService(EksService source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.ClusterIp != null) {
            this.ClusterIp = new String[source.ClusterIp.length];
            for (int i = 0; i < source.ClusterIp.length; i++) {
                this.ClusterIp[i] = new String(source.ClusterIp[i]);
            }
        }
        if (source.ExternalIp != null) {
            this.ExternalIp = new String(source.ExternalIp);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.LoadBalanceId != null) {
            this.LoadBalanceId = new String(source.LoadBalanceId);
        }
        if (source.PortMappings != null) {
            this.PortMappings = new PortMapping[source.PortMappings.length];
            for (int i = 0; i < source.PortMappings.length; i++) {
                this.PortMappings[i] = new PortMapping(source.PortMappings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamArraySimple(map, prefix + "ClusterIp.", this.ClusterIp);
        this.setParamSimple(map, prefix + "ExternalIp", this.ExternalIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LoadBalanceId", this.LoadBalanceId);
        this.setParamArrayObj(map, prefix + "PortMappings.", this.PortMappings);

    }
}

