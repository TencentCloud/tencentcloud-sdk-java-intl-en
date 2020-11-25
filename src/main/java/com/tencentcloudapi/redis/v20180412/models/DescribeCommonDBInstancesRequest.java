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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCommonDBInstancesRequest extends AbstractModel{

    /**
    * List of instance VIPs
    */
    @SerializedName("VpcIds")
    @Expose
    private Long [] VpcIds;

    /**
    * List of subnet IDs
    */
    @SerializedName("SubnetIds")
    @Expose
    private Long [] SubnetIds;

    /**
    * List of billing modes. Valid values: `0` (monthly subscription), `1` (pay-as-you-go)
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * List of instance IDs
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * List of instance names
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * List of instance status
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Sort field
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sort order
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * List of instance VIPs
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * List of unique VPC IDs
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * List of unique subnet IDs
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * Quantity limit. The default value `100` is recommended.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get List of instance VIPs 
     * @return VpcIds List of instance VIPs
     */
    public Long [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set List of instance VIPs
     * @param VpcIds List of instance VIPs
     */
    public void setVpcIds(Long [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get List of subnet IDs 
     * @return SubnetIds List of subnet IDs
     */
    public Long [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set List of subnet IDs
     * @param SubnetIds List of subnet IDs
     */
    public void setSubnetIds(Long [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get List of billing modes. Valid values: `0` (monthly subscription), `1` (pay-as-you-go) 
     * @return PayMode List of billing modes. Valid values: `0` (monthly subscription), `1` (pay-as-you-go)
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set List of billing modes. Valid values: `0` (monthly subscription), `1` (pay-as-you-go)
     * @param PayMode List of billing modes. Valid values: `0` (monthly subscription), `1` (pay-as-you-go)
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get List of instance IDs 
     * @return InstanceIds List of instance IDs
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of instance IDs
     * @param InstanceIds List of instance IDs
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get List of instance names 
     * @return InstanceNames List of instance names
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set List of instance names
     * @param InstanceNames List of instance names
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get List of instance status 
     * @return Status List of instance status
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set List of instance status
     * @param Status List of instance status
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Sort field 
     * @return OrderBy Sort field
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort field
     * @param OrderBy Sort field
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sort order 
     * @return OrderByType Sort order
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sort order
     * @param OrderByType Sort order
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get List of instance VIPs 
     * @return Vips List of instance VIPs
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set List of instance VIPs
     * @param Vips List of instance VIPs
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get List of unique VPC IDs 
     * @return UniqVpcIds List of unique VPC IDs
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set List of unique VPC IDs
     * @param UniqVpcIds List of unique VPC IDs
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get List of unique subnet IDs 
     * @return UniqSubnetIds List of unique subnet IDs
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set List of unique subnet IDs
     * @param UniqSubnetIds List of unique subnet IDs
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get Quantity limit. The default value `100` is recommended. 
     * @return Limit Quantity limit. The default value `100` is recommended.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity limit. The default value `100` is recommended.
     * @param Limit Quantity limit. The default value `100` is recommended.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

