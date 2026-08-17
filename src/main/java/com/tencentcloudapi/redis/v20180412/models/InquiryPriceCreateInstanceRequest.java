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

public class InquiryPriceCreateInstanceRequest extends AbstractModel {

    /**
    * <p>Instance type. - 2: Redis 2.8 memory edition (standard architecture). - 6: Redis 4.0 memory edition (standard architecture). - 7: Redis 4.0 memory edition (cluster architecture). - 8: Redis 5.0 memory edition (standard architecture). - 9: Redis 5.0 memory edition (cluster architecture). - 15: Redis 6.2 memory edition (standard architecture). - 16: Redis 6.2 memory edition (cluster architecture). - 17: Redis 7.0 memory edition (standard architecture). - 18: Redis 7.0 memory edition (cluster architecture). - 200: Memcached 1.6 memory edition (cluster architecture).</p>
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, refer to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>. When TypeId is standard architecture, MemSize is the total memory capacity of the instance. When TypeId is cluster architecture, MemSize is the sharded memory capacity.</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>Instance count. The number of instances to purchase at a time is subject to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>.</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>Purchase period needs to be filled in when creating an annual and monthly subscription instance. For pay-as-you-go instances, just fill in 1. Unit: month. Value ranges from 1 to 36 [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Payment method. - 0: Pay-As-You-Go. - 1: Monthly Subscription.</p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.<strong>Note</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>Number of instance shards. - The shard number should be set to 1 for the standard architecture. - The number of shards can be set to 1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, or 128 for the cluster architecture.</p>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * <p>Number of instance replicas. Valid values: 1, 2, 3, 4, and 5.</p>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * <p>Whether replica read-only is supported. For Redis 2.8 standard architecture and CKV standard architecture, this parameter is not required. - true: replica read-only not required. - false: read-only replica supported.</p>
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * <p>Name of the availability zone to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>. <strong>Description</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>Deployment method. - local: local disk, defaults to local. - cloud: cloud disk. - cdc: dedicated cluster edition.</p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
     * Get <p>Instance type. - 2: Redis 2.8 memory edition (standard architecture). - 6: Redis 4.0 memory edition (standard architecture). - 7: Redis 4.0 memory edition (cluster architecture). - 8: Redis 5.0 memory edition (standard architecture). - 9: Redis 5.0 memory edition (cluster architecture). - 15: Redis 6.2 memory edition (standard architecture). - 16: Redis 6.2 memory edition (cluster architecture). - 17: Redis 7.0 memory edition (standard architecture). - 18: Redis 7.0 memory edition (cluster architecture). - 200: Memcached 1.6 memory edition (cluster architecture).</p> 
     * @return TypeId <p>Instance type. - 2: Redis 2.8 memory edition (standard architecture). - 6: Redis 4.0 memory edition (standard architecture). - 7: Redis 4.0 memory edition (cluster architecture). - 8: Redis 5.0 memory edition (standard architecture). - 9: Redis 5.0 memory edition (cluster architecture). - 15: Redis 6.2 memory edition (standard architecture). - 16: Redis 6.2 memory edition (cluster architecture). - 17: Redis 7.0 memory edition (standard architecture). - 18: Redis 7.0 memory edition (cluster architecture). - 200: Memcached 1.6 memory edition (cluster architecture).</p>
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set <p>Instance type. - 2: Redis 2.8 memory edition (standard architecture). - 6: Redis 4.0 memory edition (standard architecture). - 7: Redis 4.0 memory edition (cluster architecture). - 8: Redis 5.0 memory edition (standard architecture). - 9: Redis 5.0 memory edition (cluster architecture). - 15: Redis 6.2 memory edition (standard architecture). - 16: Redis 6.2 memory edition (cluster architecture). - 17: Redis 7.0 memory edition (standard architecture). - 18: Redis 7.0 memory edition (cluster architecture). - 200: Memcached 1.6 memory edition (cluster architecture).</p>
     * @param TypeId <p>Instance type. - 2: Redis 2.8 memory edition (standard architecture). - 6: Redis 4.0 memory edition (standard architecture). - 7: Redis 4.0 memory edition (cluster architecture). - 8: Redis 5.0 memory edition (standard architecture). - 9: Redis 5.0 memory edition (cluster architecture). - 15: Redis 6.2 memory edition (standard architecture). - 16: Redis 6.2 memory edition (cluster architecture). - 17: Redis 7.0 memory edition (standard architecture). - 18: Redis 7.0 memory edition (cluster architecture). - 200: Memcached 1.6 memory edition (cluster architecture).</p>
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, refer to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>. When TypeId is standard architecture, MemSize is the total memory capacity of the instance. When TypeId is cluster architecture, MemSize is the sharded memory capacity.</p> 
     * @return MemSize <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, refer to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>. When TypeId is standard architecture, MemSize is the total memory capacity of the instance. When TypeId is cluster architecture, MemSize is the sharded memory capacity.</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, refer to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>. When TypeId is standard architecture, MemSize is the total memory capacity of the instance. When TypeId is cluster architecture, MemSize is the sharded memory capacity.</p>
     * @param MemSize <p>Memory capacity, measured in MB, must be a multiple of 1024. For specific specifications, refer to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>. When TypeId is standard architecture, MemSize is the total memory capacity of the instance. When TypeId is cluster architecture, MemSize is the sharded memory capacity.</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>Instance count. The number of instances to purchase at a time is subject to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>.</p> 
     * @return GoodsNum <p>Instance count. The number of instances to purchase at a time is subject to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>.</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>Instance count. The number of instances to purchase at a time is subject to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>.</p>
     * @param GoodsNum <p>Instance count. The number of instances to purchase at a time is subject to the specifications returned by <a href="https://www.tencentcloud.com/document/api/239/30600?from_cn_redirect=1">query product sales specifications</a>.</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>Purchase period needs to be filled in when creating an annual and monthly subscription instance. For pay-as-you-go instances, just fill in 1. Unit: month. Value ranges from 1 to 36 [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p> 
     * @return Period <p>Purchase period needs to be filled in when creating an annual and monthly subscription instance. For pay-as-you-go instances, just fill in 1. Unit: month. Value ranges from 1 to 36 [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Purchase period needs to be filled in when creating an annual and monthly subscription instance. For pay-as-you-go instances, just fill in 1. Unit: month. Value ranges from 1 to 36 [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     * @param Period <p>Purchase period needs to be filled in when creating an annual and monthly subscription instance. For pay-as-you-go instances, just fill in 1. Unit: month. Value ranges from 1 to 36 [1,2,3,4,5,6,7,8,9,10,11,12,24,36].</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Payment method. - 0: Pay-As-You-Go. - 1: Monthly Subscription.</p> 
     * @return BillingMode <p>Payment method. - 0: Pay-As-You-Go. - 1: Monthly Subscription.</p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Payment method. - 0: Pay-As-You-Go. - 1: Monthly Subscription.</p>
     * @param BillingMode <p>Payment method. - 0: Pay-As-You-Go. - 1: Monthly Subscription.</p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.<strong>Note</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p> 
     * @return ZoneId <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.<strong>Note</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.<strong>Note</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p>
     * @param ZoneId <p>ID of the AZ to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and AZs</a>.<strong>Note</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Number of instance shards. - The shard number should be set to 1 for the standard architecture. - The number of shards can be set to 1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, or 128 for the cluster architecture.</p> 
     * @return RedisShardNum <p>Number of instance shards. - The shard number should be set to 1 for the standard architecture. - The number of shards can be set to 1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, or 128 for the cluster architecture.</p>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set <p>Number of instance shards. - The shard number should be set to 1 for the standard architecture. - The number of shards can be set to 1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, or 128 for the cluster architecture.</p>
     * @param RedisShardNum <p>Number of instance shards. - The shard number should be set to 1 for the standard architecture. - The number of shards can be set to 1, 3, 5, 8, 12, 16, 24, 32, 40, 48, 64, 80, 96, or 128 for the cluster architecture.</p>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get <p>Number of instance replicas. Valid values: 1, 2, 3, 4, and 5.</p> 
     * @return RedisReplicasNum <p>Number of instance replicas. Valid values: 1, 2, 3, 4, and 5.</p>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set <p>Number of instance replicas. Valid values: 1, 2, 3, 4, and 5.</p>
     * @param RedisReplicasNum <p>Number of instance replicas. Valid values: 1, 2, 3, 4, and 5.</p>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get <p>Whether replica read-only is supported. For Redis 2.8 standard architecture and CKV standard architecture, this parameter is not required. - true: replica read-only not required. - false: read-only replica supported.</p> 
     * @return ReplicasReadonly <p>Whether replica read-only is supported. For Redis 2.8 standard architecture and CKV standard architecture, this parameter is not required. - true: replica read-only not required. - false: read-only replica supported.</p>
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set <p>Whether replica read-only is supported. For Redis 2.8 standard architecture and CKV standard architecture, this parameter is not required. - true: replica read-only not required. - false: read-only replica supported.</p>
     * @param ReplicasReadonly <p>Whether replica read-only is supported. For Redis 2.8 standard architecture and CKV standard architecture, this parameter is not required. - true: replica read-only not required. - false: read-only replica supported.</p>
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get <p>Name of the availability zone to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>. <strong>Description</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p> 
     * @return ZoneName <p>Name of the availability zone to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>. <strong>Description</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>Name of the availability zone to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>. <strong>Description</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p>
     * @param ZoneName <p>Name of the availability zone to which the instance belongs. See <a href="https://www.tencentcloud.com/document/product/239/4106?from_cn_redirect=1">Regions and Availability Zones</a>. <strong>Description</strong>: Please specify at least one parameter in <strong>ZoneId</strong> and <strong>ZoneName</strong>.</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>Deployment method. - local: local disk, defaults to local. - cloud: cloud disk. - cdc: dedicated cluster edition.</p> 
     * @return ProductVersion <p>Deployment method. - local: local disk, defaults to local. - cloud: cloud disk. - cdc: dedicated cluster edition.</p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>Deployment method. - local: local disk, defaults to local. - cloud: cloud disk. - cdc: dedicated cluster edition.</p>
     * @param ProductVersion <p>Deployment method. - local: local disk, defaults to local. - cloud: cloud disk. - cdc: dedicated cluster edition.</p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    public InquiryPriceCreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateInstanceRequest(InquiryPriceCreateInstanceRequest source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.ReplicasReadonly != null) {
            this.ReplicasReadonly = new Boolean(source.ReplicasReadonly);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "ReplicasReadonly", this.ReplicasReadonly);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);

    }
}

