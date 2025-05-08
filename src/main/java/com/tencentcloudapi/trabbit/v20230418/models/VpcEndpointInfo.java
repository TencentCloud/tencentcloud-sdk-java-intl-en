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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcEndpointInfo extends AbstractModel {

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * vpc access point information.
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

    /**
    * vpc access point status.
OFF/ON/CREATING/DELETING
    */
    @SerializedName("VpcDataStreamEndpointStatus")
    @Expose
    private String VpcDataStreamEndpointStatus;

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get vpc access point information. 
     * @return VpcEndpoint vpc access point information.
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set vpc access point information.
     * @param VpcEndpoint vpc access point information.
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    /**
     * Get vpc access point status.
OFF/ON/CREATING/DELETING 
     * @return VpcDataStreamEndpointStatus vpc access point status.
OFF/ON/CREATING/DELETING
     */
    public String getVpcDataStreamEndpointStatus() {
        return this.VpcDataStreamEndpointStatus;
    }

    /**
     * Set vpc access point status.
OFF/ON/CREATING/DELETING
     * @param VpcDataStreamEndpointStatus vpc access point status.
OFF/ON/CREATING/DELETING
     */
    public void setVpcDataStreamEndpointStatus(String VpcDataStreamEndpointStatus) {
        this.VpcDataStreamEndpointStatus = VpcDataStreamEndpointStatus;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcEndpoint", this.VpcEndpoint);
        this.setParamSimple(map, prefix + "VpcDataStreamEndpointStatus", this.VpcDataStreamEndpointStatus);

    }
}

