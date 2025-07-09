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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCommonDBInstancesRequest extends AbstractModel {

    /**
    * List of VPC IDs
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
    * List of billing modes. 0: monthly subscription; 1: pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance ID filter information list, with a maximum array length of 100.
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
    * Sorting field
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order
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
    * List of VPC IDs
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
    * Quantity limit. Recommended default value: 100.
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
     * Get List of VPC IDs 
     * @return VpcIds List of VPC IDs
     */
    public Long [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set List of VPC IDs
     * @param VpcIds List of VPC IDs
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
     * Get List of billing modes. 0: monthly subscription; 1: pay-as-you-go 
     * @return PayMode List of billing modes. 0: monthly subscription; 1: pay-as-you-go
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set List of billing modes. 0: monthly subscription; 1: pay-as-you-go
     * @param PayMode List of billing modes. 0: monthly subscription; 1: pay-as-you-go
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance ID filter information list, with a maximum array length of 100. 
     * @return InstanceIds Instance ID filter information list, with a maximum array length of 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID filter information list, with a maximum array length of 100.
     * @param InstanceIds Instance ID filter information list, with a maximum array length of 100.
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
     * Get Sorting field 
     * @return OrderBy Sorting field
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field
     * @param OrderBy Sorting field
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order 
     * @return OrderByType Sorting order
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order
     * @param OrderByType Sorting order
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
     * Get List of VPC IDs 
     * @return UniqVpcIds List of VPC IDs
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set List of VPC IDs
     * @param UniqVpcIds List of VPC IDs
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
     * Get Quantity limit. Recommended default value: 100. 
     * @return Limit Quantity limit. Recommended default value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity limit. Recommended default value: 100.
     * @param Limit Quantity limit. Recommended default value: 100.
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

    public DescribeCommonDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCommonDBInstancesRequest(DescribeCommonDBInstancesRequest source) {
        if (source.VpcIds != null) {
            this.VpcIds = new Long[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new Long(source.VpcIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new Long[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new Long(source.SubnetIds[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.UniqVpcIds != null) {
            this.UniqVpcIds = new String[source.UniqVpcIds.length];
            for (int i = 0; i < source.UniqVpcIds.length; i++) {
                this.UniqVpcIds[i] = new String(source.UniqVpcIds[i]);
            }
        }
        if (source.UniqSubnetIds != null) {
            this.UniqSubnetIds = new String[source.UniqSubnetIds.length];
            for (int i = 0; i < source.UniqSubnetIds.length; i++) {
                this.UniqSubnetIds[i] = new String(source.UniqSubnetIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
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

