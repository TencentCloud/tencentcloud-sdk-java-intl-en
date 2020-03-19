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
    * Cluster access password, which must contain lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9).
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
     * Get Cluster access password, which must contain lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9). 
     * @return Password Cluster access password, which must contain lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9).
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Cluster access password, which must contain lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9).
     * @param Password Cluster access password, which must contain lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9).
     */
    public void setPassword(String Password) {
        this.Password = Password;
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

    }
}

