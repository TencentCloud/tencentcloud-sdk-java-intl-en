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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceRenewInstancesResponse extends AbstractModel{

    /**
    * Price information. It defaults to the price information of the first instance in the list.
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * List of data disk price information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDiskPriceSet")
    @Expose
    private DataDiskPrice [] DataDiskPriceSet;

    /**
    * Price list of the instances to be renewed.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("InstancePriceDetailSet")
    @Expose
    private InstancePriceDetail [] InstancePriceDetailSet;

    /**
    * Total price
    */
    @SerializedName("TotalPrice")
    @Expose
    private TotalPrice TotalPrice;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Price information. It defaults to the price information of the first instance in the list. 
     * @return Price Price information. It defaults to the price information of the first instance in the list.
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set Price information. It defaults to the price information of the first instance in the list.
     * @param Price Price information. It defaults to the price information of the first instance in the list.
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get List of data disk price information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataDiskPriceSet List of data disk price information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DataDiskPrice [] getDataDiskPriceSet() {
        return this.DataDiskPriceSet;
    }

    /**
     * Set List of data disk price information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataDiskPriceSet List of data disk price information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDiskPriceSet(DataDiskPrice [] DataDiskPriceSet) {
        this.DataDiskPriceSet = DataDiskPriceSet;
    }

    /**
     * Get Price list of the instances to be renewed.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return InstancePriceDetailSet Price list of the instances to be renewed.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public InstancePriceDetail [] getInstancePriceDetailSet() {
        return this.InstancePriceDetailSet;
    }

    /**
     * Set Price list of the instances to be renewed.
Note: This field may return `null`, indicating that no valid value was found.
     * @param InstancePriceDetailSet Price list of the instances to be renewed.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setInstancePriceDetailSet(InstancePriceDetail [] InstancePriceDetailSet) {
        this.InstancePriceDetailSet = InstancePriceDetailSet;
    }

    /**
     * Get Total price 
     * @return TotalPrice Total price
     */
    public TotalPrice getTotalPrice() {
        return this.TotalPrice;
    }

    /**
     * Set Total price
     * @param TotalPrice Total price
     */
    public void setTotalPrice(TotalPrice TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public InquirePriceRenewInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewInstancesResponse(InquirePriceRenewInstancesResponse source) {
        if (source.Price != null) {
            this.Price = new Price(source.Price);
        }
        if (source.DataDiskPriceSet != null) {
            this.DataDiskPriceSet = new DataDiskPrice[source.DataDiskPriceSet.length];
            for (int i = 0; i < source.DataDiskPriceSet.length; i++) {
                this.DataDiskPriceSet[i] = new DataDiskPrice(source.DataDiskPriceSet[i]);
            }
        }
        if (source.InstancePriceDetailSet != null) {
            this.InstancePriceDetailSet = new InstancePriceDetail[source.InstancePriceDetailSet.length];
            for (int i = 0; i < source.InstancePriceDetailSet.length; i++) {
                this.InstancePriceDetailSet[i] = new InstancePriceDetail(source.InstancePriceDetailSet[i]);
            }
        }
        if (source.TotalPrice != null) {
            this.TotalPrice = new TotalPrice(source.TotalPrice);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamArrayObj(map, prefix + "DataDiskPriceSet.", this.DataDiskPriceSet);
        this.setParamArrayObj(map, prefix + "InstancePriceDetailSet.", this.InstancePriceDetailSet);
        this.setParamObj(map, prefix + "TotalPrice.", this.TotalPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

