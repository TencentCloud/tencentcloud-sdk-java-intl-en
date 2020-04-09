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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAcl extends AbstractModel{

    /**
    * `ID` of the `VPC` instance.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `ID` of the network ACL instance.
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * Name of the network ACL. The maximum length is 60 bytes.
    */
    @SerializedName("NetworkAclName")
    @Expose
    private String NetworkAclName;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Array of subnets associated with the network ACL.
    */
    @SerializedName("SubnetSet")
    @Expose
    private Subnet [] SubnetSet;

    /**
    * Inbound rules of the network ACL.
    */
    @SerializedName("IngressEntries")
    @Expose
    private NetworkAclEntry [] IngressEntries;

    /**
    * Outbound rules of the network ACL.
    */
    @SerializedName("EgressEntries")
    @Expose
    private NetworkAclEntry [] EgressEntries;

    /**
     * Get `ID` of the `VPC` instance. 
     * @return VpcId `ID` of the `VPC` instance.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `ID` of the `VPC` instance.
     * @param VpcId `ID` of the `VPC` instance.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get `ID` of the network ACL instance. 
     * @return NetworkAclId `ID` of the network ACL instance.
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set `ID` of the network ACL instance.
     * @param NetworkAclId `ID` of the network ACL instance.
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get Name of the network ACL. The maximum length is 60 bytes. 
     * @return NetworkAclName Name of the network ACL. The maximum length is 60 bytes.
     */
    public String getNetworkAclName() {
        return this.NetworkAclName;
    }

    /**
     * Set Name of the network ACL. The maximum length is 60 bytes.
     * @param NetworkAclName Name of the network ACL. The maximum length is 60 bytes.
     */
    public void setNetworkAclName(String NetworkAclName) {
        this.NetworkAclName = NetworkAclName;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Array of subnets associated with the network ACL. 
     * @return SubnetSet Array of subnets associated with the network ACL.
     */
    public Subnet [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set Array of subnets associated with the network ACL.
     * @param SubnetSet Array of subnets associated with the network ACL.
     */
    public void setSubnetSet(Subnet [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    /**
     * Get Inbound rules of the network ACL. 
     * @return IngressEntries Inbound rules of the network ACL.
     */
    public NetworkAclEntry [] getIngressEntries() {
        return this.IngressEntries;
    }

    /**
     * Set Inbound rules of the network ACL.
     * @param IngressEntries Inbound rules of the network ACL.
     */
    public void setIngressEntries(NetworkAclEntry [] IngressEntries) {
        this.IngressEntries = IngressEntries;
    }

    /**
     * Get Outbound rules of the network ACL. 
     * @return EgressEntries Outbound rules of the network ACL.
     */
    public NetworkAclEntry [] getEgressEntries() {
        return this.EgressEntries;
    }

    /**
     * Set Outbound rules of the network ACL.
     * @param EgressEntries Outbound rules of the network ACL.
     */
    public void setEgressEntries(NetworkAclEntry [] EgressEntries) {
        this.EgressEntries = EgressEntries;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "NetworkAclName", this.NetworkAclName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "SubnetSet.", this.SubnetSet);
        this.setParamArrayObj(map, prefix + "IngressEntries.", this.IngressEntries);
        this.setParamArrayObj(map, prefix + "EgressEntries.", this.EgressEntries);

    }
}

