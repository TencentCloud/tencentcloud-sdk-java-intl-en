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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGatewayLoadBalancerRequest extends AbstractModel {

    /**
    * ID of the VPC to which the backend target device of the GWLB belongs, such as vpc-12345678. It can be obtained through the DescribeVpcEx interface. If left blank, it defaults to DefaultVPC. This parameter is required when a private network CLB instance is created.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID of the VPC to which the backend target device of the GWLB belongs.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * GWLB instance name. It supports input of 1 to 60 characters. If not filled in, it will be generated automatically by default.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Number of GWLBs to create, with a default of 1. The maximum batch creation quantity is 10.
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * While the GWLB is purchased, it is tagged, with a maximum of 20 tag key-value pairs.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * GWLB instance billing type, which currently supports POSTPAID_BY_HOUR only. The default is POSTPAID_BY_HOUR.
    */
    @SerializedName("LBChargeType")
    @Expose
    private String LBChargeType;

    /**
     * Get ID of the VPC to which the backend target device of the GWLB belongs, such as vpc-12345678. It can be obtained through the DescribeVpcEx interface. If left blank, it defaults to DefaultVPC. This parameter is required when a private network CLB instance is created. 
     * @return VpcId ID of the VPC to which the backend target device of the GWLB belongs, such as vpc-12345678. It can be obtained through the DescribeVpcEx interface. If left blank, it defaults to DefaultVPC. This parameter is required when a private network CLB instance is created.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC to which the backend target device of the GWLB belongs, such as vpc-12345678. It can be obtained through the DescribeVpcEx interface. If left blank, it defaults to DefaultVPC. This parameter is required when a private network CLB instance is created.
     * @param VpcId ID of the VPC to which the backend target device of the GWLB belongs, such as vpc-12345678. It can be obtained through the DescribeVpcEx interface. If left blank, it defaults to DefaultVPC. This parameter is required when a private network CLB instance is created.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID of the VPC to which the backend target device of the GWLB belongs. 
     * @return SubnetId Subnet ID of the VPC to which the backend target device of the GWLB belongs.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID of the VPC to which the backend target device of the GWLB belongs.
     * @param SubnetId Subnet ID of the VPC to which the backend target device of the GWLB belongs.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get GWLB instance name. It supports input of 1 to 60 characters. If not filled in, it will be generated automatically by default. 
     * @return LoadBalancerName GWLB instance name. It supports input of 1 to 60 characters. If not filled in, it will be generated automatically by default.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set GWLB instance name. It supports input of 1 to 60 characters. If not filled in, it will be generated automatically by default.
     * @param LoadBalancerName GWLB instance name. It supports input of 1 to 60 characters. If not filled in, it will be generated automatically by default.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Number of GWLBs to create, with a default of 1. The maximum batch creation quantity is 10. 
     * @return Number Number of GWLBs to create, with a default of 1. The maximum batch creation quantity is 10.
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set Number of GWLBs to create, with a default of 1. The maximum batch creation quantity is 10.
     * @param Number Number of GWLBs to create, with a default of 1. The maximum batch creation quantity is 10.
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get While the GWLB is purchased, it is tagged, with a maximum of 20 tag key-value pairs. 
     * @return Tags While the GWLB is purchased, it is tagged, with a maximum of 20 tag key-value pairs.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set While the GWLB is purchased, it is tagged, with a maximum of 20 tag key-value pairs.
     * @param Tags While the GWLB is purchased, it is tagged, with a maximum of 20 tag key-value pairs.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get GWLB instance billing type, which currently supports POSTPAID_BY_HOUR only. The default is POSTPAID_BY_HOUR. 
     * @return LBChargeType GWLB instance billing type, which currently supports POSTPAID_BY_HOUR only. The default is POSTPAID_BY_HOUR.
     */
    public String getLBChargeType() {
        return this.LBChargeType;
    }

    /**
     * Set GWLB instance billing type, which currently supports POSTPAID_BY_HOUR only. The default is POSTPAID_BY_HOUR.
     * @param LBChargeType GWLB instance billing type, which currently supports POSTPAID_BY_HOUR only. The default is POSTPAID_BY_HOUR.
     */
    public void setLBChargeType(String LBChargeType) {
        this.LBChargeType = LBChargeType;
    }

    public CreateGatewayLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGatewayLoadBalancerRequest(CreateGatewayLoadBalancerRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.LBChargeType != null) {
            this.LBChargeType = new String(source.LBChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LBChargeType", this.LBChargeType);

    }
}

