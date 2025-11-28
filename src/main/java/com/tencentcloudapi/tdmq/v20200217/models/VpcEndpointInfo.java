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
    * 
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

    /**
    * Access point status. valid values: OFF, ON, CREATING, DELETING.
    */
    @SerializedName("VpcDataStreamEndpointStatus")
    @Expose
    private String VpcDataStreamEndpointStatus;

    /**
    * Encrypted TLS data stream access point.
    */
    @SerializedName("VpcTlsEndpoint")
    @Expose
    private String VpcTlsEndpoint;

    /**
     * Get  
     * @return VpcId 
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 
     * @param VpcId 
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * @return VpcEndpoint 
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set 
     * @param VpcEndpoint 
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    /**
     * Get Access point status. valid values: OFF, ON, CREATING, DELETING. 
     * @return VpcDataStreamEndpointStatus Access point status. valid values: OFF, ON, CREATING, DELETING.
     */
    public String getVpcDataStreamEndpointStatus() {
        return this.VpcDataStreamEndpointStatus;
    }

    /**
     * Set Access point status. valid values: OFF, ON, CREATING, DELETING.
     * @param VpcDataStreamEndpointStatus Access point status. valid values: OFF, ON, CREATING, DELETING.
     */
    public void setVpcDataStreamEndpointStatus(String VpcDataStreamEndpointStatus) {
        this.VpcDataStreamEndpointStatus = VpcDataStreamEndpointStatus;
    }

    /**
     * Get Encrypted TLS data stream access point. 
     * @return VpcTlsEndpoint Encrypted TLS data stream access point.
     */
    public String getVpcTlsEndpoint() {
        return this.VpcTlsEndpoint;
    }

    /**
     * Set Encrypted TLS data stream access point.
     * @param VpcTlsEndpoint Encrypted TLS data stream access point.
     */
    public void setVpcTlsEndpoint(String VpcTlsEndpoint) {
        this.VpcTlsEndpoint = VpcTlsEndpoint;
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

    }
}

