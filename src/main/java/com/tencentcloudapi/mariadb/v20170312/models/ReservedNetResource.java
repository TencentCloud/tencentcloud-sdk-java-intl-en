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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedNetResource extends AbstractModel {

    /**
    * VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Reserved private network IP under `VpcId` and `SubnetId`
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port under `Vip`
    */
    @SerializedName("Vports")
    @Expose
    private Long [] Vports;

    /**
    * Valid hours of VIP
    */
    @SerializedName("RecycleTime")
    @Expose
    private String RecycleTime;

    /**
     * Get VPC 
     * @return VpcId VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC
     * @param VpcId VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet 
     * @return SubnetId Subnet
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet
     * @param SubnetId Subnet
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Reserved private network IP under `VpcId` and `SubnetId` 
     * @return Vip Reserved private network IP under `VpcId` and `SubnetId`
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Reserved private network IP under `VpcId` and `SubnetId`
     * @param Vip Reserved private network IP under `VpcId` and `SubnetId`
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port under `Vip` 
     * @return Vports Port under `Vip`
     */
    public Long [] getVports() {
        return this.Vports;
    }

    /**
     * Set Port under `Vip`
     * @param Vports Port under `Vip`
     */
    public void setVports(Long [] Vports) {
        this.Vports = Vports;
    }

    /**
     * Get Valid hours of VIP 
     * @return RecycleTime Valid hours of VIP
     */
    public String getRecycleTime() {
        return this.RecycleTime;
    }

    /**
     * Set Valid hours of VIP
     * @param RecycleTime Valid hours of VIP
     */
    public void setRecycleTime(String RecycleTime) {
        this.RecycleTime = RecycleTime;
    }

    public ReservedNetResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedNetResource(ReservedNetResource source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vports != null) {
            this.Vports = new Long[source.Vports.length];
            for (int i = 0; i < source.Vports.length; i++) {
                this.Vports[i] = new Long(source.Vports[i]);
            }
        }
        if (source.RecycleTime != null) {
            this.RecycleTime = new String(source.RecycleTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamArraySimple(map, prefix + "Vports.", this.Vports);
        this.setParamSimple(map, prefix + "RecycleTime", this.RecycleTime);

    }
}

