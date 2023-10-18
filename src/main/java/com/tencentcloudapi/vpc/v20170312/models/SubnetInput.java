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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubnetInput extends AbstractModel {

    /**
    * The `CIDR` of the subnet.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Subnet name.
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * The availability zone, such as `ap-guangzhou-2`.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The specified associated route table, such as `rtb-3ryrwzuu`.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
     * Get The `CIDR` of the subnet. 
     * @return CidrBlock The `CIDR` of the subnet.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set The `CIDR` of the subnet.
     * @param CidrBlock The `CIDR` of the subnet.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Subnet name. 
     * @return SubnetName Subnet name.
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet name.
     * @param SubnetName Subnet name.
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get The availability zone, such as `ap-guangzhou-2`. 
     * @return Zone The availability zone, such as `ap-guangzhou-2`.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone, such as `ap-guangzhou-2`.
     * @param Zone The availability zone, such as `ap-guangzhou-2`.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The specified associated route table, such as `rtb-3ryrwzuu`. 
     * @return RouteTableId The specified associated route table, such as `rtb-3ryrwzuu`.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set The specified associated route table, such as `rtb-3ryrwzuu`.
     * @param RouteTableId The specified associated route table, such as `rtb-3ryrwzuu`.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    public SubnetInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubnetInput(SubnetInput source) {
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

