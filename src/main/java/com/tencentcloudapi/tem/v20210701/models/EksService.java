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
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Version name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Private IP
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterIp")
    @Expose
    private String [] ClusterIp;

    /**
    * Public IP
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExternalIp")
    @Expose
    private String ExternalIp;

    /**
    * The access type. Valid values:
- EXTERNAL (internet access)
- VPC (Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadBalanceId")
    @Expose
    private String LoadBalanceId;

    /**
    * Port mapping
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PortMappings")
    @Expose
    private PortMapping [] PortMappings;

    /**
    * Details of each type of access configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ServicePortMappingList")
    @Expose
    private ServicePortMapping [] ServicePortMappingList;

    /**
    * Flush all types
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FlushAll")
    @Expose
    private Boolean FlushAll;

    /**
    * `0`: Do not inject. `1`: Inject registry information automatically for the next deployment
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableRegistryNextDeploy")
    @Expose
    private Long EnableRegistryNextDeploy;

    /**
    * The application ID returned.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Whether all the application IPs are ready
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AllIpDone")
    @Expose
    private Boolean AllIpDone;

    /**
    * CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExternalDomain")
    @Expose
    private String ExternalDomain;

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
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationName Service name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Service name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationName Service name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Version name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return VersionName Version name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Version name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param VersionName Version name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Private IP
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterIp Private IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set Private IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterIp Private IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterIp(String [] ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get Public IP
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ExternalIp Public IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getExternalIp() {
        return this.ExternalIp;
    }

    /**
     * Set Public IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ExternalIp Public IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExternalIp(String ExternalIp) {
        this.ExternalIp = ExternalIp;
    }

    /**
     * Get The access type. Valid values:
- EXTERNAL (internet access)
- VPC (Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Type The access type. Valid values:
- EXTERNAL (internet access)
- VPC (Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The access type. Valid values:
- EXTERNAL (internet access)
- VPC (Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Type The access type. Valid values:
- EXTERNAL (internet access)
- VPC (Intra-VPC access)
- CLUSTER (Intra-cluster access)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SubnetId Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SubnetId Subnet ID. It is filled when the access type is `VPC`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LoadBalanceId Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLoadBalanceId() {
        return this.LoadBalanceId;
    }

    /**
     * Set Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LoadBalanceId Load balancer ID. It is filled when the access type is `EXTERNAL` or `CLUSTER`. It’s created automatically by default.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLoadBalanceId(String LoadBalanceId) {
        this.LoadBalanceId = LoadBalanceId;
    }

    /**
     * Get Port mapping
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return PortMappings Port mapping
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public PortMapping [] getPortMappings() {
        return this.PortMappings;
    }

    /**
     * Set Port mapping
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param PortMappings Port mapping
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPortMappings(PortMapping [] PortMappings) {
        this.PortMappings = PortMappings;
    }

    /**
     * Get Details of each type of access configuration
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ServicePortMappingList Details of each type of access configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ServicePortMapping [] getServicePortMappingList() {
        return this.ServicePortMappingList;
    }

    /**
     * Set Details of each type of access configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ServicePortMappingList Details of each type of access configuration
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setServicePortMappingList(ServicePortMapping [] ServicePortMappingList) {
        this.ServicePortMappingList = ServicePortMappingList;
    }

    /**
     * Get Flush all types
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return FlushAll Flush all types
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getFlushAll() {
        return this.FlushAll;
    }

    /**
     * Set Flush all types
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param FlushAll Flush all types
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFlushAll(Boolean FlushAll) {
        this.FlushAll = FlushAll;
    }

    /**
     * Get `0`: Do not inject. `1`: Inject registry information automatically for the next deployment
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnableRegistryNextDeploy `0`: Do not inject. `1`: Inject registry information automatically for the next deployment
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEnableRegistryNextDeploy() {
        return this.EnableRegistryNextDeploy;
    }

    /**
     * Set `0`: Do not inject. `1`: Inject registry information automatically for the next deployment
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnableRegistryNextDeploy `0`: Do not inject. `1`: Inject registry information automatically for the next deployment
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnableRegistryNextDeploy(Long EnableRegistryNextDeploy) {
        this.EnableRegistryNextDeploy = EnableRegistryNextDeploy;
    }

    /**
     * Get The application ID returned.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationId The application ID returned.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set The application ID returned.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationId The application ID returned.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Whether all the application IPs are ready
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AllIpDone Whether all the application IPs are ready
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getAllIpDone() {
        return this.AllIpDone;
    }

    /**
     * Set Whether all the application IPs are ready
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AllIpDone Whether all the application IPs are ready
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAllIpDone(Boolean AllIpDone) {
        this.AllIpDone = AllIpDone;
    }

    /**
     * Get CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExternalDomain CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getExternalDomain() {
        return this.ExternalDomain;
    }

    /**
     * Set CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExternalDomain CLB domain name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExternalDomain(String ExternalDomain) {
        this.ExternalDomain = ExternalDomain;
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
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
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
        if (source.ServicePortMappingList != null) {
            this.ServicePortMappingList = new ServicePortMapping[source.ServicePortMappingList.length];
            for (int i = 0; i < source.ServicePortMappingList.length; i++) {
                this.ServicePortMappingList[i] = new ServicePortMapping(source.ServicePortMappingList[i]);
            }
        }
        if (source.FlushAll != null) {
            this.FlushAll = new Boolean(source.FlushAll);
        }
        if (source.EnableRegistryNextDeploy != null) {
            this.EnableRegistryNextDeploy = new Long(source.EnableRegistryNextDeploy);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.AllIpDone != null) {
            this.AllIpDone = new Boolean(source.AllIpDone);
        }
        if (source.ExternalDomain != null) {
            this.ExternalDomain = new String(source.ExternalDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamArraySimple(map, prefix + "ClusterIp.", this.ClusterIp);
        this.setParamSimple(map, prefix + "ExternalIp", this.ExternalIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LoadBalanceId", this.LoadBalanceId);
        this.setParamArrayObj(map, prefix + "PortMappings.", this.PortMappings);
        this.setParamArrayObj(map, prefix + "ServicePortMappingList.", this.ServicePortMappingList);
        this.setParamSimple(map, prefix + "FlushAll", this.FlushAll);
        this.setParamSimple(map, prefix + "EnableRegistryNextDeploy", this.EnableRegistryNextDeploy);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "AllIpDone", this.AllIpDone);
        this.setParamSimple(map, prefix + "ExternalDomain", this.ExternalDomain);

    }
}

