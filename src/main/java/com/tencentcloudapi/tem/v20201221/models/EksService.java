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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EksService extends AbstractModel{

    /**
    * service name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * 
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 
    */
    @SerializedName("ClusterIp")
    @Expose
    private String [] ClusterIp;

    /**
    * 
    */
    @SerializedName("ExternalIp")
    @Expose
    private String ExternalIp;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 
    */
    @SerializedName("LoadBalanceId")
    @Expose
    private String LoadBalanceId;

    /**
    * 
    */
    @SerializedName("PortMappings")
    @Expose
    private PortMapping [] PortMappings;

    /**
     * Get service name 
     * @return Name service name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set service name
     * @param Name service name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Ports 
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 
     * @param Ports 
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get  
     * @return Yaml 
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set 
     * @param Yaml 
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get  
     * @return ServiceName 
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 
     * @param ServiceName 
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get  
     * @return VersionName 
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 
     * @param VersionName 
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get  
     * @return ClusterIp 
     */
    public String [] getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set 
     * @param ClusterIp 
     */
    public void setClusterIp(String [] ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get  
     * @return ExternalIp 
     */
    public String getExternalIp() {
        return this.ExternalIp;
    }

    /**
     * Set 
     * @param ExternalIp 
     */
    public void setExternalIp(String ExternalIp) {
        this.ExternalIp = ExternalIp;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return SubnetId 
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 
     * @param SubnetId 
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get  
     * @return LoadBalanceId 
     */
    public String getLoadBalanceId() {
        return this.LoadBalanceId;
    }

    /**
     * Set 
     * @param LoadBalanceId 
     */
    public void setLoadBalanceId(String LoadBalanceId) {
        this.LoadBalanceId = LoadBalanceId;
    }

    /**
     * Get  
     * @return PortMappings 
     */
    public PortMapping [] getPortMappings() {
        return this.PortMappings;
    }

    /**
     * Set 
     * @param PortMappings 
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

