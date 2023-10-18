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

public class ResourceStatistics extends AbstractModel {

    /**
    * VPC instance ID, such as vpc-f1xjkw1b.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet instance ID, such as `subnet-bthucmmy`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The total number of used IP addresses.
    */
    @SerializedName("Ip")
    @Expose
    private Long Ip;

    /**
    * Information of associated resources
    */
    @SerializedName("ResourceStatisticsItemSet")
    @Expose
    private ResourceStatisticsItem [] ResourceStatisticsItemSet;

    /**
     * Get VPC instance ID, such as vpc-f1xjkw1b. 
     * @return VpcId VPC instance ID, such as vpc-f1xjkw1b.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID, such as vpc-f1xjkw1b.
     * @param VpcId VPC instance ID, such as vpc-f1xjkw1b.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet instance ID, such as `subnet-bthucmmy`. 
     * @return SubnetId Subnet instance ID, such as `subnet-bthucmmy`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID, such as `subnet-bthucmmy`.
     * @param SubnetId Subnet instance ID, such as `subnet-bthucmmy`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The total number of used IP addresses. 
     * @return Ip The total number of used IP addresses.
     */
    public Long getIp() {
        return this.Ip;
    }

    /**
     * Set The total number of used IP addresses.
     * @param Ip The total number of used IP addresses.
     */
    public void setIp(Long Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Information of associated resources 
     * @return ResourceStatisticsItemSet Information of associated resources
     */
    public ResourceStatisticsItem [] getResourceStatisticsItemSet() {
        return this.ResourceStatisticsItemSet;
    }

    /**
     * Set Information of associated resources
     * @param ResourceStatisticsItemSet Information of associated resources
     */
    public void setResourceStatisticsItemSet(ResourceStatisticsItem [] ResourceStatisticsItemSet) {
        this.ResourceStatisticsItemSet = ResourceStatisticsItemSet;
    }

    public ResourceStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceStatistics(ResourceStatistics source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Ip != null) {
            this.Ip = new Long(source.Ip);
        }
        if (source.ResourceStatisticsItemSet != null) {
            this.ResourceStatisticsItemSet = new ResourceStatisticsItem[source.ResourceStatisticsItemSet.length];
            for (int i = 0; i < source.ResourceStatisticsItemSet.length; i++) {
                this.ResourceStatisticsItemSet[i] = new ResourceStatisticsItem(source.ResourceStatisticsItemSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamArrayObj(map, prefix + "ResourceStatisticsItemSet.", this.ResourceStatisticsItemSet);

    }
}

