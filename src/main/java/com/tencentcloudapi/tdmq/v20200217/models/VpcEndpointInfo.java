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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcEndpointInfo extends AbstractModel {

    /**
    * <p>vpc id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>vpc access point information</p>
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

    /**
    * <p>vpc access point status OFF/ON/CREATING/DELETING</p>
    */
    @SerializedName("VpcDataStreamEndpointStatus")
    @Expose
    private String VpcDataStreamEndpointStatus;

    /**
    * <p>TLS encrypted data stream access point</p>
    */
    @SerializedName("VpcTlsEndpoint")
    @Expose
    private String VpcTlsEndpoint;

    /**
    * <p>Error information of VPC access point operation failure</p>
    */
    @SerializedName("VpcErrorMessage")
    @Expose
    private String VpcErrorMessage;

    /**
    * <p>Access point ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>vpc Stream access point</p>
    */
    @SerializedName("VpcStreamEndpoint")
    @Expose
    private String VpcStreamEndpoint;

    /**
     * Get <p>vpc id</p> 
     * @return VpcId <p>vpc id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc id</p>
     * @param VpcId <p>vpc id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet id</p> 
     * @return SubnetId <p>Subnet id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet id</p>
     * @param SubnetId <p>Subnet id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>vpc access point information</p> 
     * @return VpcEndpoint <p>vpc access point information</p>
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set <p>vpc access point information</p>
     * @param VpcEndpoint <p>vpc access point information</p>
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    /**
     * Get <p>vpc access point status OFF/ON/CREATING/DELETING</p> 
     * @return VpcDataStreamEndpointStatus <p>vpc access point status OFF/ON/CREATING/DELETING</p>
     */
    public String getVpcDataStreamEndpointStatus() {
        return this.VpcDataStreamEndpointStatus;
    }

    /**
     * Set <p>vpc access point status OFF/ON/CREATING/DELETING</p>
     * @param VpcDataStreamEndpointStatus <p>vpc access point status OFF/ON/CREATING/DELETING</p>
     */
    public void setVpcDataStreamEndpointStatus(String VpcDataStreamEndpointStatus) {
        this.VpcDataStreamEndpointStatus = VpcDataStreamEndpointStatus;
    }

    /**
     * Get <p>TLS encrypted data stream access point</p> 
     * @return VpcTlsEndpoint <p>TLS encrypted data stream access point</p>
     */
    public String getVpcTlsEndpoint() {
        return this.VpcTlsEndpoint;
    }

    /**
     * Set <p>TLS encrypted data stream access point</p>
     * @param VpcTlsEndpoint <p>TLS encrypted data stream access point</p>
     */
    public void setVpcTlsEndpoint(String VpcTlsEndpoint) {
        this.VpcTlsEndpoint = VpcTlsEndpoint;
    }

    /**
     * Get <p>Error information of VPC access point operation failure</p> 
     * @return VpcErrorMessage <p>Error information of VPC access point operation failure</p>
     */
    public String getVpcErrorMessage() {
        return this.VpcErrorMessage;
    }

    /**
     * Set <p>Error information of VPC access point operation failure</p>
     * @param VpcErrorMessage <p>Error information of VPC access point operation failure</p>
     */
    public void setVpcErrorMessage(String VpcErrorMessage) {
        this.VpcErrorMessage = VpcErrorMessage;
    }

    /**
     * Get <p>Access point ID</p> 
     * @return Id <p>Access point ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Access point ID</p>
     * @param Id <p>Access point ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>vpc Stream access point</p> 
     * @return VpcStreamEndpoint <p>vpc Stream access point</p>
     */
    public String getVpcStreamEndpoint() {
        return this.VpcStreamEndpoint;
    }

    /**
     * Set <p>vpc Stream access point</p>
     * @param VpcStreamEndpoint <p>vpc Stream access point</p>
     */
    public void setVpcStreamEndpoint(String VpcStreamEndpoint) {
        this.VpcStreamEndpoint = VpcStreamEndpoint;
    }

    public VpcEndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcEndpointInfo(VpcEndpointInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcEndpoint != null) {
            this.VpcEndpoint = new String(source.VpcEndpoint);
        }
        if (source.VpcDataStreamEndpointStatus != null) {
            this.VpcDataStreamEndpointStatus = new String(source.VpcDataStreamEndpointStatus);
        }
        if (source.VpcTlsEndpoint != null) {
            this.VpcTlsEndpoint = new String(source.VpcTlsEndpoint);
        }
        if (source.VpcErrorMessage != null) {
            this.VpcErrorMessage = new String(source.VpcErrorMessage);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.VpcStreamEndpoint != null) {
            this.VpcStreamEndpoint = new String(source.VpcStreamEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcEndpoint", this.VpcEndpoint);
        this.setParamSimple(map, prefix + "VpcDataStreamEndpointStatus", this.VpcDataStreamEndpointStatus);
        this.setParamSimple(map, prefix + "VpcTlsEndpoint", this.VpcTlsEndpoint);
        this.setParamSimple(map, prefix + "VpcErrorMessage", this.VpcErrorMessage);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "VpcStreamEndpoint", this.VpcStreamEndpoint);

    }
}

