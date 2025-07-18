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

public class CreateReserveIpAddressesRequest extends AbstractModel {

    /**
    * Unique ID of the VPC.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Reserved private IP address to be applied for.
    */
    @SerializedName("IpAddresses")
    @Expose
    private String [] IpAddresses;

    /**
    * Number of reserved private IP addresses that can be automatically assigned with no IP address specified.
    */
    @SerializedName("IpAddressCount")
    @Expose
    private Long IpAddressCount;

    /**
    * Unique ID of the subnet.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Name of the reserved private IP address.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of the reserved private IP address.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get Unique ID of the VPC. 
     * @return VpcId Unique ID of the VPC.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of the VPC.
     * @param VpcId Unique ID of the VPC.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Reserved private IP address to be applied for. 
     * @return IpAddresses Reserved private IP address to be applied for.
     */
    public String [] getIpAddresses() {
        return this.IpAddresses;
    }

    /**
     * Set Reserved private IP address to be applied for.
     * @param IpAddresses Reserved private IP address to be applied for.
     */
    public void setIpAddresses(String [] IpAddresses) {
        this.IpAddresses = IpAddresses;
    }

    /**
     * Get Number of reserved private IP addresses that can be automatically assigned with no IP address specified. 
     * @return IpAddressCount Number of reserved private IP addresses that can be automatically assigned with no IP address specified.
     */
    public Long getIpAddressCount() {
        return this.IpAddressCount;
    }

    /**
     * Set Number of reserved private IP addresses that can be automatically assigned with no IP address specified.
     * @param IpAddressCount Number of reserved private IP addresses that can be automatically assigned with no IP address specified.
     */
    public void setIpAddressCount(Long IpAddressCount) {
        this.IpAddressCount = IpAddressCount;
    }

    /**
     * Get Unique ID of the subnet. 
     * @return SubnetId Unique ID of the subnet.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Unique ID of the subnet.
     * @param SubnetId Unique ID of the subnet.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Name of the reserved private IP address. 
     * @return Name Name of the reserved private IP address.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the reserved private IP address.
     * @param Name Name of the reserved private IP address.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of the reserved private IP address. 
     * @return Description Description of the reserved private IP address.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the reserved private IP address.
     * @param Description Description of the reserved private IP address.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}].
     * @param Tags List of tags to be bound, for example, [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed. 
     * @return ClientToken A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed.
     * @param ClientToken A string used to ensure the idempotence of the request. This string is generated by the customer and should be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotence of the request cannot be guaranteed.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateReserveIpAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReserveIpAddressesRequest(CreateReserveIpAddressesRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.IpAddresses != null) {
            this.IpAddresses = new String[source.IpAddresses.length];
            for (int i = 0; i < source.IpAddresses.length; i++) {
                this.IpAddresses[i] = new String(source.IpAddresses[i]);
            }
        }
        if (source.IpAddressCount != null) {
            this.IpAddressCount = new Long(source.IpAddressCount);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "IpAddresses.", this.IpAddresses);
        this.setParamSimple(map, prefix + "IpAddressCount", this.IpAddressCount);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

