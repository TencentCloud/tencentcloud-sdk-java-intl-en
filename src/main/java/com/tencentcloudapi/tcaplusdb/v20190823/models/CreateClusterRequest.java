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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel{

    /**
    * Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
    */
    @SerializedName("IdlType")
    @Expose
    private String IdlType;

    /**
    * Cluster name, which can contain up to 32 letters and digits
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * ID of the VPC instance bound to a cluster in the format of `vpc-f49l6u0z`
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the subnet instance bound to a cluster in the format of `subnet-pxir56ns`
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Cluster access password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Cluster tag list
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfoUnit [] ResourceTags;

    /**
    * Whether to enable IPv6 address access for clusters
    */
    @SerializedName("Ipv6Enable")
    @Expose
    private Long Ipv6Enable;

    /**
    * Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
    */
    @SerializedName("ServerList")
    @Expose
    private MachineInfo [] ServerList;

    /**
    * Information of the machine at the access layer (tcaproxy) in a dedicated cluster
    */
    @SerializedName("ProxyList")
    @Expose
    private MachineInfo [] ProxyList;

    /**
    * Cluster type. Valid values: `1` (standard), `2` (dedicated)
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
     * Get Cluster data description language type, such as `PROTO`, `TDR`, or `MIX` 
     * @return IdlType Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     */
    public String getIdlType() {
        return this.IdlType;
    }

    /**
     * Set Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     * @param IdlType Cluster data description language type, such as `PROTO`, `TDR`, or `MIX`
     */
    public void setIdlType(String IdlType) {
        this.IdlType = IdlType;
    }

    /**
     * Get Cluster name, which can contain up to 32 letters and digits 
     * @return ClusterName Cluster name, which can contain up to 32 letters and digits
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name, which can contain up to 32 letters and digits
     * @param ClusterName Cluster name, which can contain up to 32 letters and digits
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get ID of the VPC instance bound to a cluster in the format of `vpc-f49l6u0z` 
     * @return VpcId ID of the VPC instance bound to a cluster in the format of `vpc-f49l6u0z`
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC instance bound to a cluster in the format of `vpc-f49l6u0z`
     * @param VpcId ID of the VPC instance bound to a cluster in the format of `vpc-f49l6u0z`
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet instance bound to a cluster in the format of `subnet-pxir56ns` 
     * @return SubnetId ID of the subnet instance bound to a cluster in the format of `subnet-pxir56ns`
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet instance bound to a cluster in the format of `subnet-pxir56ns`
     * @param SubnetId ID of the subnet instance bound to a cluster in the format of `subnet-pxir56ns`
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Cluster access password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9). 
     * @return Password Cluster access password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Cluster access password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9).
     * @param Password Cluster access password, which must contain lowercase letters (a-z), uppercase letters (A-Z), and digits (0-9).
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Cluster tag list 
     * @return ResourceTags Cluster tag list
     */
    public TagInfoUnit [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Cluster tag list
     * @param ResourceTags Cluster tag list
     */
    public void setResourceTags(TagInfoUnit [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Whether to enable IPv6 address access for clusters 
     * @return Ipv6Enable Whether to enable IPv6 address access for clusters
     */
    public Long getIpv6Enable() {
        return this.Ipv6Enable;
    }

    /**
     * Set Whether to enable IPv6 address access for clusters
     * @param Ipv6Enable Whether to enable IPv6 address access for clusters
     */
    public void setIpv6Enable(Long Ipv6Enable) {
        this.Ipv6Enable = Ipv6Enable;
    }

    /**
     * Get Information of the machine at the storage layer (tcapsvr) in a dedicated cluster 
     * @return ServerList Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
     */
    public MachineInfo [] getServerList() {
        return this.ServerList;
    }

    /**
     * Set Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
     * @param ServerList Information of the machine at the storage layer (tcapsvr) in a dedicated cluster
     */
    public void setServerList(MachineInfo [] ServerList) {
        this.ServerList = ServerList;
    }

    /**
     * Get Information of the machine at the access layer (tcaproxy) in a dedicated cluster 
     * @return ProxyList Information of the machine at the access layer (tcaproxy) in a dedicated cluster
     */
    public MachineInfo [] getProxyList() {
        return this.ProxyList;
    }

    /**
     * Set Information of the machine at the access layer (tcaproxy) in a dedicated cluster
     * @param ProxyList Information of the machine at the access layer (tcaproxy) in a dedicated cluster
     */
    public void setProxyList(MachineInfo [] ProxyList) {
        this.ProxyList = ProxyList;
    }

    /**
     * Get Cluster type. Valid values: `1` (standard), `2` (dedicated) 
     * @return ClusterType Cluster type. Valid values: `1` (standard), `2` (dedicated)
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Valid values: `1` (standard), `2` (dedicated)
     * @param ClusterType Cluster type. Valid values: `1` (standard), `2` (dedicated)
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.IdlType != null) {
            this.IdlType = new String(source.IdlType);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfoUnit[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfoUnit(source.ResourceTags[i]);
            }
        }
        if (source.Ipv6Enable != null) {
            this.Ipv6Enable = new Long(source.Ipv6Enable);
        }
        if (source.ServerList != null) {
            this.ServerList = new MachineInfo[source.ServerList.length];
            for (int i = 0; i < source.ServerList.length; i++) {
                this.ServerList[i] = new MachineInfo(source.ServerList[i]);
            }
        }
        if (source.ProxyList != null) {
            this.ProxyList = new MachineInfo[source.ProxyList.length];
            for (int i = 0; i < source.ProxyList.length; i++) {
                this.ProxyList[i] = new MachineInfo(source.ProxyList[i]);
            }
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdlType", this.IdlType);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Ipv6Enable", this.Ipv6Enable);
        this.setParamArrayObj(map, prefix + "ServerList.", this.ServerList);
        this.setParamArrayObj(map, prefix + "ProxyList.", this.ProxyList);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

