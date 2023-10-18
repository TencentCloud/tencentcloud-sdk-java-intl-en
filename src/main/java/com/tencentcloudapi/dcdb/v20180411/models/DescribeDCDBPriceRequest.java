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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDCDBPriceRequest extends AbstractModel {

    /**
    * AZ ID of the purchased instance.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The number of instances to be purchased. You can purchase 1-10 instances.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Validity period in months
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Number of nodes in a single shard, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
    */
    @SerializedName("ShardNodeCount")
    @Expose
    private Long ShardNodeCount;

    /**
    * Shard memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * Shard storage size in GB, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more.
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * Billing type. Valid values: `postpaid` (pay-as-you-go), `prepaid` (monthly subscription).
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * Price unit. Valid values:   
`* pent` (cent), 
`* microPent` (microcent).
    */
    @SerializedName("AmountUnit")
    @Expose
    private String AmountUnit;

    /**
     * Get AZ ID of the purchased instance. 
     * @return Zone AZ ID of the purchased instance.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ ID of the purchased instance.
     * @param Zone AZ ID of the purchased instance.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The number of instances to be purchased. You can purchase 1-10 instances. 
     * @return Count The number of instances to be purchased. You can purchase 1-10 instances.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of instances to be purchased. You can purchase 1-10 instances.
     * @param Count The number of instances to be purchased. You can purchase 1-10 instances.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Validity period in months 
     * @return Period Validity period in months
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Validity period in months
     * @param Period Validity period in months
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Number of nodes in a single shard, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API. 
     * @return ShardNodeCount Number of nodes in a single shard, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public Long getShardNodeCount() {
        return this.ShardNodeCount;
    }

    /**
     * Set Number of nodes in a single shard, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     * @param ShardNodeCount Number of nodes in a single shard, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public void setShardNodeCount(Long ShardNodeCount) {
        this.ShardNodeCount = ShardNodeCount;
    }

    /**
     * Get Shard memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API. 
     * @return ShardMemory Shard memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set Shard memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     * @param ShardMemory Shard memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get Shard storage size in GB, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API. 
     * @return ShardStorage Shard storage size in GB, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set Shard storage size in GB, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     * @param ShardStorage Shard storage size in GB, which can be obtained
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more. 
     * @return ShardCount The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more.
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more.
     * @param ShardCount The number of shards in the instance. Value range: 2-8. Upgrade your instance to have up to 64 shards if you require more.
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get Billing type. Valid values: `postpaid` (pay-as-you-go), `prepaid` (monthly subscription). 
     * @return Paymode Billing type. Valid values: `postpaid` (pay-as-you-go), `prepaid` (monthly subscription).
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set Billing type. Valid values: `postpaid` (pay-as-you-go), `prepaid` (monthly subscription).
     * @param Paymode Billing type. Valid values: `postpaid` (pay-as-you-go), `prepaid` (monthly subscription).
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get Price unit. Valid values:   
`* pent` (cent), 
`* microPent` (microcent). 
     * @return AmountUnit Price unit. Valid values:   
`* pent` (cent), 
`* microPent` (microcent).
     */
    public String getAmountUnit() {
        return this.AmountUnit;
    }

    /**
     * Set Price unit. Valid values:   
`* pent` (cent), 
`* microPent` (microcent).
     * @param AmountUnit Price unit. Valid values:   
`* pent` (cent), 
`* microPent` (microcent).
     */
    public void setAmountUnit(String AmountUnit) {
        this.AmountUnit = AmountUnit;
    }

    public DescribeDCDBPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDCDBPriceRequest(DescribeDCDBPriceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ShardNodeCount != null) {
            this.ShardNodeCount = new Long(source.ShardNodeCount);
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.Paymode != null) {
            this.Paymode = new String(source.Paymode);
        }
        if (source.AmountUnit != null) {
            this.AmountUnit = new String(source.AmountUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ShardNodeCount", this.ShardNodeCount);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "AmountUnit", this.AmountUnit);

    }
}

