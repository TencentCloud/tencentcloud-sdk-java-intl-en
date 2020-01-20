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

public class VpcPrivateIpAddress extends AbstractModel{

    /**
    * `VPC` private `IP`.
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * The `CIDR` belonging to the subnet.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Private `IP` type.
    */
    @SerializedName("PrivateIpAddressType")
    @Expose
    private String PrivateIpAddressType;

    /**
    * `IP` application time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get `VPC` private `IP`. 
     * @return PrivateIpAddress `VPC` private `IP`.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set `VPC` private `IP`.
     * @param PrivateIpAddress `VPC` private `IP`.
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get The `CIDR` belonging to the subnet. 
     * @return CidrBlock The `CIDR` belonging to the subnet.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set The `CIDR` belonging to the subnet.
     * @param CidrBlock The `CIDR` belonging to the subnet.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Private `IP` type. 
     * @return PrivateIpAddressType Private `IP` type.
     */
    public String getPrivateIpAddressType() {
        return this.PrivateIpAddressType;
    }

    /**
     * Set Private `IP` type.
     * @param PrivateIpAddressType Private `IP` type.
     */
    public void setPrivateIpAddressType(String PrivateIpAddressType) {
        this.PrivateIpAddressType = PrivateIpAddressType;
    }

    /**
     * Get `IP` application time. 
     * @return CreatedTime `IP` application time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set `IP` application time.
     * @param CreatedTime `IP` application time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "PrivateIpAddressType", this.PrivateIpAddressType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

