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

public class CreateHaVipRequest extends AbstractModel{

    /**
    * The `ID` of the VPC to which the `HAVIP` belongs.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The `ID` of the subnet to which the `HAVIP` belongs.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The name of the `HAVIP`.
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * The specified virtual IP address, which must be within the IP range of the `VPC` and not in use. It will be automatically assigned if not specified.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get The `ID` of the VPC to which the `HAVIP` belongs. 
     * @return VpcId The `ID` of the VPC to which the `HAVIP` belongs.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The `ID` of the VPC to which the `HAVIP` belongs.
     * @param VpcId The `ID` of the VPC to which the `HAVIP` belongs.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The `ID` of the subnet to which the `HAVIP` belongs. 
     * @return SubnetId The `ID` of the subnet to which the `HAVIP` belongs.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The `ID` of the subnet to which the `HAVIP` belongs.
     * @param SubnetId The `ID` of the subnet to which the `HAVIP` belongs.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The name of the `HAVIP`. 
     * @return HaVipName The name of the `HAVIP`.
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set The name of the `HAVIP`.
     * @param HaVipName The name of the `HAVIP`.
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get The specified virtual IP address, which must be within the IP range of the `VPC` and not in use. It will be automatically assigned if not specified. 
     * @return Vip The specified virtual IP address, which must be within the IP range of the `VPC` and not in use. It will be automatically assigned if not specified.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set The specified virtual IP address, which must be within the IP range of the `VPC` and not in use. It will be automatically assigned if not specified.
     * @param Vip The specified virtual IP address, which must be within the IP range of the `VPC` and not in use. It will be automatically assigned if not specified.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

