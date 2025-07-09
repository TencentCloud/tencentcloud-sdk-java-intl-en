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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAcl extends AbstractModel {

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
    * Network ACL type. Valid values: `TRIPLE` and `QUINTUPLE`.
    */
    @SerializedName("NetworkAclType")
    @Expose
    private String NetworkAclType;

    /**
    * Tag key-value pairs
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

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
     * Get Network ACL type. Valid values: `TRIPLE` and `QUINTUPLE`. 
     * @return NetworkAclType Network ACL type. Valid values: `TRIPLE` and `QUINTUPLE`.
     */
    public String getNetworkAclType() {
        return this.NetworkAclType;
    }

    /**
     * Set Network ACL type. Valid values: `TRIPLE` and `QUINTUPLE`.
     * @param NetworkAclType Network ACL type. Valid values: `TRIPLE` and `QUINTUPLE`.
     */
    public void setNetworkAclType(String NetworkAclType) {
        this.NetworkAclType = NetworkAclType;
    }

    /**
     * Get Tag key-value pairs 
     * @return TagSet Tag key-value pairs
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pairs
     * @param TagSet Tag key-value pairs
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public NetworkAcl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAcl(NetworkAcl source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
        }
        if (source.NetworkAclName != null) {
            this.NetworkAclName = new String(source.NetworkAclName);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.SubnetSet != null) {
            this.SubnetSet = new Subnet[source.SubnetSet.length];
            for (int i = 0; i < source.SubnetSet.length; i++) {
                this.SubnetSet[i] = new Subnet(source.SubnetSet[i]);
            }
        }
        if (source.IngressEntries != null) {
            this.IngressEntries = new NetworkAclEntry[source.IngressEntries.length];
            for (int i = 0; i < source.IngressEntries.length; i++) {
                this.IngressEntries[i] = new NetworkAclEntry(source.IngressEntries[i]);
            }
        }
        if (source.EgressEntries != null) {
            this.EgressEntries = new NetworkAclEntry[source.EgressEntries.length];
            for (int i = 0; i < source.EgressEntries.length; i++) {
                this.EgressEntries[i] = new NetworkAclEntry(source.EgressEntries[i]);
            }
        }
        if (source.NetworkAclType != null) {
            this.NetworkAclType = new String(source.NetworkAclType);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "NetworkAclType", this.NetworkAclType);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

