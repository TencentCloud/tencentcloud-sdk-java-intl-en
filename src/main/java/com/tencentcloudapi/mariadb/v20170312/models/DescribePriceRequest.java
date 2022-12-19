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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePriceRequest extends AbstractModel{

    /**
    * AZ ID of the purchased instance.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Number of instance nodes, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage capacity in GB. The maximum and minimum storage space can be obtained 
 by querying instance specification through the `DescribeDBInstanceSpecs` API.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Purchase period in months
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * The number of instances to be purchased. Only one instance is queried for price by default.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

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
     * Get Number of instance nodes, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API. 
     * @return NodeCount Number of instance nodes, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of instance nodes, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     * @param NodeCount Number of instance nodes, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API. 
     * @return Memory Memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     * @param Memory Memory size in GB, which can be obtained 
 by querying the instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage capacity in GB. The maximum and minimum storage space can be obtained 
 by querying instance specification through the `DescribeDBInstanceSpecs` API. 
     * @return Storage Storage capacity in GB. The maximum and minimum storage space can be obtained 
 by querying instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity in GB. The maximum and minimum storage space can be obtained 
 by querying instance specification through the `DescribeDBInstanceSpecs` API.
     * @param Storage Storage capacity in GB. The maximum and minimum storage space can be obtained 
 by querying instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Purchase period in months 
     * @return Period Purchase period in months
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase period in months
     * @param Period Purchase period in months
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get The number of instances to be purchased. Only one instance is queried for price by default. 
     * @return Count The number of instances to be purchased. Only one instance is queried for price by default.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of instances to be purchased. Only one instance is queried for price by default.
     * @param Count The number of instances to be purchased. Only one instance is queried for price by default.
     */
    public void setCount(Long Count) {
        this.Count = Count;
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

    public DescribePriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePriceRequest(DescribePriceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "AmountUnit", this.AmountUnit);

    }
}

