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
    * Instance type.

- 2: Redis 2.8 memory edition (standard architecture).
- 6: Redis 4.0 memory edition (standard architecture).
- 7: Redis 4.0 memory edition (cluster architecture).
- 8: Redis 5.0 memory edition (standard architecture).
- 9: Redis 5.0 memory edition (cluster architecture).
- 15: Redis 6.2 memory edition (standard architecture).
- 16: Redis 6.2 memory edition (cluster architecture).
- 17: Redis 7.0 memory edition (standard architecture).
- 18: Redis 7.0 memory edition (cluster architecture).
- 200: Memcached 1.6 memory edition (cluster architecture).
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Memory capacity in MB, which must be a multiple of 1,024. It is subject to the purchasable specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
If `TypeId` indicates the standard architecture, `MemSize` indicates the total memory capacity of an instance; if `TypeId` indicates the cluster architecture, `MemSize` indicates the memory capacity per shard.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Length of purchase in months, which is required when creating a monthly-subscribed instance. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, set the parameter to `1`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Billing mode.
- 0: pay-as-you-go.
- 1: monthly subscription.
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * ID of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Number of instance shards. For the standard architecture of 2.8, the number of shards does not need to be configured. For the standard architecture of other versions, the number of shards should be set to 1. For the cluster architecture, the number of shards to be purchased needs to be specified.
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Number of instance replicas. For the standard architecture of 2.8, the number of replicas does not need to be configured.
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Whether replica read-only is supported. For the standard architecture of Redis 2.8 and CKV, this parameter does not need to be configured.
- true: Replica read-only is not required.
- false: Replica read-only is required.
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * Name of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Deployment mode.
- local: local disk. This is the default value.
- cloud: cloud disk.
- cdc: CDC.
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
     * Get Instance type.

- 2: Redis 2.8 memory edition (standard architecture).
- 6: Redis 4.0 memory edition (standard architecture).
- 7: Redis 4.0 memory edition (cluster architecture).
- 8: Redis 5.0 memory edition (standard architecture).
- 9: Redis 5.0 memory edition (cluster architecture).
- 15: Redis 6.2 memory edition (standard architecture).
- 16: Redis 6.2 memory edition (cluster architecture).
- 17: Redis 7.0 memory edition (standard architecture).
- 18: Redis 7.0 memory edition (cluster architecture).
- 200: Memcached 1.6 memory edition (cluster architecture). 
     * @return TypeId Instance type.

- 2: Redis 2.8 memory edition (standard architecture).
- 6: Redis 4.0 memory edition (standard architecture).
- 7: Redis 4.0 memory edition (cluster architecture).
- 8: Redis 5.0 memory edition (standard architecture).
- 9: Redis 5.0 memory edition (cluster architecture).
- 15: Redis 6.2 memory edition (standard architecture).
- 16: Redis 6.2 memory edition (cluster architecture).
- 17: Redis 7.0 memory edition (standard architecture).
- 18: Redis 7.0 memory edition (cluster architecture).
- 200: Memcached 1.6 memory edition (cluster architecture).
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set Instance type.

- 2: Redis 2.8 memory edition (standard architecture).
- 6: Redis 4.0 memory edition (standard architecture).
- 7: Redis 4.0 memory edition (cluster architecture).
- 8: Redis 5.0 memory edition (standard architecture).
- 9: Redis 5.0 memory edition (cluster architecture).
- 15: Redis 6.2 memory edition (standard architecture).
- 16: Redis 6.2 memory edition (cluster architecture).
- 17: Redis 7.0 memory edition (standard architecture).
- 18: Redis 7.0 memory edition (cluster architecture).
- 200: Memcached 1.6 memory edition (cluster architecture).
     * @param TypeId Instance type.

- 2: Redis 2.8 memory edition (standard architecture).
- 6: Redis 4.0 memory edition (standard architecture).
- 7: Redis 4.0 memory edition (cluster architecture).
- 8: Redis 5.0 memory edition (standard architecture).
- 9: Redis 5.0 memory edition (cluster architecture).
- 15: Redis 6.2 memory edition (standard architecture).
- 16: Redis 6.2 memory edition (cluster architecture).
- 17: Redis 7.0 memory edition (standard architecture).
- 18: Redis 7.0 memory edition (cluster architecture).
- 200: Memcached 1.6 memory edition (cluster architecture).
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Memory capacity in MB, which must be a multiple of 1,024. It is subject to the purchasable specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
If `TypeId` indicates the standard architecture, `MemSize` indicates the total memory capacity of an instance; if `TypeId` indicates the cluster architecture, `MemSize` indicates the memory capacity per shard. 
     * @return MemSize Memory capacity in MB, which must be a multiple of 1,024. It is subject to the purchasable specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
If `TypeId` indicates the standard architecture, `MemSize` indicates the total memory capacity of an instance; if `TypeId` indicates the cluster architecture, `MemSize` indicates the memory capacity per shard.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory capacity in MB, which must be a multiple of 1,024. It is subject to the purchasable specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
If `TypeId` indicates the standard architecture, `MemSize` indicates the total memory capacity of an instance; if `TypeId` indicates the cluster architecture, `MemSize` indicates the memory capacity per shard.
     * @param MemSize Memory capacity in MB, which must be a multiple of 1,024. It is subject to the purchasable specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
If `TypeId` indicates the standard architecture, `MemSize` indicates the total memory capacity of an instance; if `TypeId` indicates the cluster architecture, `MemSize` indicates the memory capacity per shard.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1). 
     * @return GoodsNum Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
     * @param GoodsNum Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the [DescribeProductInfo API](https://intl.cloud.tencent.com/document/api/239/30600?from_cn_redirect=1).
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Length of purchase in months, which is required when creating a monthly-subscribed instance. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, set the parameter to `1`. 
     * @return Period Length of purchase in months, which is required when creating a monthly-subscribed instance. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, set the parameter to `1`.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Length of purchase in months, which is required when creating a monthly-subscribed instance. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, set the parameter to `1`.
     * @param Period Length of purchase in months, which is required when creating a monthly-subscribed instance. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, set the parameter to `1`.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Billing mode.
- 0: pay-as-you-go.
- 1: monthly subscription. 
     * @return BillingMode Billing mode.
- 0: pay-as-you-go.
- 1: monthly subscription.
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing mode.
- 0: pay-as-you-go.
- 1: monthly subscription.
     * @param BillingMode Billing mode.
- 0: pay-as-you-go.
- 1: monthly subscription.
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get ID of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1). 
     * @return ZoneId ID of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     * @param ZoneId ID of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Number of instance shards. For the standard architecture of 2.8, the number of shards does not need to be configured. For the standard architecture of other versions, the number of shards should be set to 1. For the cluster architecture, the number of shards to be purchased needs to be specified. 
     * @return RedisShardNum Number of instance shards. For the standard architecture of 2.8, the number of shards does not need to be configured. For the standard architecture of other versions, the number of shards should be set to 1. For the cluster architecture, the number of shards to be purchased needs to be specified.
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of instance shards. For the standard architecture of 2.8, the number of shards does not need to be configured. For the standard architecture of other versions, the number of shards should be set to 1. For the cluster architecture, the number of shards to be purchased needs to be specified.
     * @param RedisShardNum Number of instance shards. For the standard architecture of 2.8, the number of shards does not need to be configured. For the standard architecture of other versions, the number of shards should be set to 1. For the cluster architecture, the number of shards to be purchased needs to be specified.
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Number of instance replicas. For the standard architecture of 2.8, the number of replicas does not need to be configured. 
     * @return RedisReplicasNum Number of instance replicas. For the standard architecture of 2.8, the number of replicas does not need to be configured.
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of instance replicas. For the standard architecture of 2.8, the number of replicas does not need to be configured.
     * @param RedisReplicasNum Number of instance replicas. For the standard architecture of 2.8, the number of replicas does not need to be configured.
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Whether replica read-only is supported. For the standard architecture of Redis 2.8 and CKV, this parameter does not need to be configured.
- true: Replica read-only is not required.
- false: Replica read-only is required. 
     * @return ReplicasReadonly Whether replica read-only is supported. For the standard architecture of Redis 2.8 and CKV, this parameter does not need to be configured.
- true: Replica read-only is not required.
- false: Replica read-only is required.
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set Whether replica read-only is supported. For the standard architecture of Redis 2.8 and CKV, this parameter does not need to be configured.
- true: Replica read-only is not required.
- false: Replica read-only is required.
     * @param ReplicasReadonly Whether replica read-only is supported. For the standard architecture of Redis 2.8 and CKV, this parameter does not need to be configured.
- true: Replica read-only is not required.
- false: Replica read-only is required.
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get Name of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1). 
     * @return ZoneName Name of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Name of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     * @param ZoneName Name of the AZ where the instance resides. For more information, see [Regions and AZs](https://intl.cloud.tencent.com/document/product/239/4106?from_cn_redirect=1).
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Deployment mode.
- local: local disk. This is the default value.
- cloud: cloud disk.
- cdc: CDC. 
     * @return ProductVersion Deployment mode.
- local: local disk. This is the default value.
- cloud: cloud disk.
- cdc: CDC.
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set Deployment mode.
- local: local disk. This is the default value.
- cloud: cloud disk.
- cdc: CDC.
     * @param ProductVersion Deployment mode.
- local: local disk. This is the default value.
- cloud: cloud disk.
- cdc: CDC.
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

