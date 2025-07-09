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

public class NetworkAclQuintupleEntry extends AbstractModel {

    /**
    * Protocol. Valid values: `TCP`, `UDP`, `ICMP`, `ALL`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Source port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified.
    */
    @SerializedName("SourcePort")
    @Expose
    private String SourcePort;

    /**
    * Source CIDR block.
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * Destination port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified.
    */
    @SerializedName("DestinationPort")
    @Expose
    private String DestinationPort;

    /**
    * Destination CIDR block.
    */
    @SerializedName("DestinationCidr")
    @Expose
    private String DestinationCidr;

    /**
    * Action. Valid values: `ACCEPT` and `DROP`.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Unique ID of a network ACL entry.
    */
    @SerializedName("NetworkAclQuintupleEntryId")
    @Expose
    private String NetworkAclQuintupleEntryId;

    /**
    * Priority. `1` refers to the highest priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Creation time. It’s returned by `DescribeNetworkAclQuintupleEntries`.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Direction of the rule. It’s returned by `DescribeNetworkAclQuintupleEntries`. Valid values: `INGRESS` and `EGRESS`.
    */
    @SerializedName("NetworkAclDirection")
    @Expose
    private String NetworkAclDirection;

    /**
     * Get Protocol. Valid values: `TCP`, `UDP`, `ICMP`, `ALL`. 
     * @return Protocol Protocol. Valid values: `TCP`, `UDP`, `ICMP`, `ALL`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: `TCP`, `UDP`, `ICMP`, `ALL`.
     * @param Protocol Protocol. Valid values: `TCP`, `UDP`, `ICMP`, `ALL`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Source port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified. 
     * @return SourcePort Source port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified.
     */
    public String getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set Source port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified.
     * @param SourcePort Source port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified.
     */
    public void setSourcePort(String SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get Source CIDR block. 
     * @return SourceCidr Source CIDR block.
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set Source CIDR block.
     * @param SourceCidr Source CIDR block.
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get Destination port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified. 
     * @return DestinationPort Destination port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified.
     */
    public String getDestinationPort() {
        return this.DestinationPort;
    }

    /**
     * Set Destination port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified.
     * @param DestinationPort Destination port. Valid values: all, single port, range. When `Protocol` is `ALL` or `ICMP`, `Port` cannot be specified.
     */
    public void setDestinationPort(String DestinationPort) {
        this.DestinationPort = DestinationPort;
    }

    /**
     * Get Destination CIDR block. 
     * @return DestinationCidr Destination CIDR block.
     */
    public String getDestinationCidr() {
        return this.DestinationCidr;
    }

    /**
     * Set Destination CIDR block.
     * @param DestinationCidr Destination CIDR block.
     */
    public void setDestinationCidr(String DestinationCidr) {
        this.DestinationCidr = DestinationCidr;
    }

    /**
     * Get Action. Valid values: `ACCEPT` and `DROP`. 
     * @return Action Action. Valid values: `ACCEPT` and `DROP`.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Valid values: `ACCEPT` and `DROP`.
     * @param Action Action. Valid values: `ACCEPT` and `DROP`.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Unique ID of a network ACL entry. 
     * @return NetworkAclQuintupleEntryId Unique ID of a network ACL entry.
     */
    public String getNetworkAclQuintupleEntryId() {
        return this.NetworkAclQuintupleEntryId;
    }

    /**
     * Set Unique ID of a network ACL entry.
     * @param NetworkAclQuintupleEntryId Unique ID of a network ACL entry.
     */
    public void setNetworkAclQuintupleEntryId(String NetworkAclQuintupleEntryId) {
        this.NetworkAclQuintupleEntryId = NetworkAclQuintupleEntryId;
    }

    /**
     * Get Priority. `1` refers to the highest priority. 
     * @return Priority Priority. `1` refers to the highest priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority. `1` refers to the highest priority.
     * @param Priority Priority. `1` refers to the highest priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Creation time. It’s returned by `DescribeNetworkAclQuintupleEntries`. 
     * @return CreateTime Creation time. It’s returned by `DescribeNetworkAclQuintupleEntries`.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. It’s returned by `DescribeNetworkAclQuintupleEntries`.
     * @param CreateTime Creation time. It’s returned by `DescribeNetworkAclQuintupleEntries`.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Direction of the rule. It’s returned by `DescribeNetworkAclQuintupleEntries`. Valid values: `INGRESS` and `EGRESS`. 
     * @return NetworkAclDirection Direction of the rule. It’s returned by `DescribeNetworkAclQuintupleEntries`. Valid values: `INGRESS` and `EGRESS`.
     */
    public String getNetworkAclDirection() {
        return this.NetworkAclDirection;
    }

    /**
     * Set Direction of the rule. It’s returned by `DescribeNetworkAclQuintupleEntries`. Valid values: `INGRESS` and `EGRESS`.
     * @param NetworkAclDirection Direction of the rule. It’s returned by `DescribeNetworkAclQuintupleEntries`. Valid values: `INGRESS` and `EGRESS`.
     */
    public void setNetworkAclDirection(String NetworkAclDirection) {
        this.NetworkAclDirection = NetworkAclDirection;
    }

    public NetworkAclQuintupleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAclQuintupleEntry(NetworkAclQuintupleEntry source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new String(source.SourcePort);
        }
        if (source.SourceCidr != null) {
            this.SourceCidr = new String(source.SourceCidr);
        }
        if (source.DestinationPort != null) {
            this.DestinationPort = new String(source.DestinationPort);
        }
        if (source.DestinationCidr != null) {
            this.DestinationCidr = new String(source.DestinationCidr);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.NetworkAclQuintupleEntryId != null) {
            this.NetworkAclQuintupleEntryId = new String(source.NetworkAclQuintupleEntryId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.NetworkAclDirection != null) {
            this.NetworkAclDirection = new String(source.NetworkAclDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourcePort", this.SourcePort);
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "DestinationPort", this.DestinationPort);
        this.setParamSimple(map, prefix + "DestinationCidr", this.DestinationCidr);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "NetworkAclQuintupleEntryId", this.NetworkAclQuintupleEntryId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "NetworkAclDirection", this.NetworkAclDirection);

    }
}

