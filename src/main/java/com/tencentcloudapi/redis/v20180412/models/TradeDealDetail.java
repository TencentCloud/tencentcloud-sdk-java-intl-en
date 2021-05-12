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

public class TradeDealDetail extends AbstractModel{

    /**
    * Order ID, which is used when a TencentCloud API is called
    */
    @SerializedName("DealId")
    @Expose
    private String DealId;

    /**
    * Long order ID, which is used when an order issue is submitted for assistance
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Number of instances associated with an order
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Creates a user uin
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * Order creation time
    */
    @SerializedName("CreatTime")
    @Expose
    private String CreatTime;

    /**
    * Order timeout period
    */
    @SerializedName("OverdueTime")
    @Expose
    private String OverdueTime;

    /**
    * Order completion time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Order status. 1: unpaid; 2: paid but not delivered; 3: In delivery; 4: successfully delivered; 5: delivery failed; 6: refunded; 7: order closed; 8: order expired; 9: order invalidated; 10: product invalidated; 11: requested payment rejected; 12: paying
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Order status description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Actual total price of an order in 0.01 CNY
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * Instance ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get Order ID, which is used when a TencentCloud API is called 
     * @return DealId Order ID, which is used when a TencentCloud API is called
     */
    public String getDealId() {
        return this.DealId;
    }

    /**
     * Set Order ID, which is used when a TencentCloud API is called
     * @param DealId Order ID, which is used when a TencentCloud API is called
     */
    public void setDealId(String DealId) {
        this.DealId = DealId;
    }

    /**
     * Get Long order ID, which is used when an order issue is submitted for assistance 
     * @return DealName Long order ID, which is used when an order issue is submitted for assistance
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Long order ID, which is used when an order issue is submitted for assistance
     * @param DealName Long order ID, which is used when an order issue is submitted for assistance
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get AZ ID 
     * @return ZoneId AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
     * @param ZoneId AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Number of instances associated with an order 
     * @return GoodsNum Number of instances associated with an order
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances associated with an order
     * @param GoodsNum Number of instances associated with an order
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Creates a user uin 
     * @return Creater Creates a user uin
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * Set Creates a user uin
     * @param Creater Creates a user uin
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * Get Order creation time 
     * @return CreatTime Order creation time
     */
    public String getCreatTime() {
        return this.CreatTime;
    }

    /**
     * Set Order creation time
     * @param CreatTime Order creation time
     */
    public void setCreatTime(String CreatTime) {
        this.CreatTime = CreatTime;
    }

    /**
     * Get Order timeout period 
     * @return OverdueTime Order timeout period
     */
    public String getOverdueTime() {
        return this.OverdueTime;
    }

    /**
     * Set Order timeout period
     * @param OverdueTime Order timeout period
     */
    public void setOverdueTime(String OverdueTime) {
        this.OverdueTime = OverdueTime;
    }

    /**
     * Get Order completion time 
     * @return EndTime Order completion time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Order completion time
     * @param EndTime Order completion time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Order status. 1: unpaid; 2: paid but not delivered; 3: In delivery; 4: successfully delivered; 5: delivery failed; 6: refunded; 7: order closed; 8: order expired; 9: order invalidated; 10: product invalidated; 11: requested payment rejected; 12: paying 
     * @return Status Order status. 1: unpaid; 2: paid but not delivered; 3: In delivery; 4: successfully delivered; 5: delivery failed; 6: refunded; 7: order closed; 8: order expired; 9: order invalidated; 10: product invalidated; 11: requested payment rejected; 12: paying
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Order status. 1: unpaid; 2: paid but not delivered; 3: In delivery; 4: successfully delivered; 5: delivery failed; 6: refunded; 7: order closed; 8: order expired; 9: order invalidated; 10: product invalidated; 11: requested payment rejected; 12: paying
     * @param Status Order status. 1: unpaid; 2: paid but not delivered; 3: In delivery; 4: successfully delivered; 5: delivery failed; 6: refunded; 7: order closed; 8: order expired; 9: order invalidated; 10: product invalidated; 11: requested payment rejected; 12: paying
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Order status description 
     * @return Description Order status description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Order status description
     * @param Description Order status description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Actual total price of an order in 0.01 CNY 
     * @return Price Actual total price of an order in 0.01 CNY
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set Actual total price of an order in 0.01 CNY
     * @param Price Actual total price of an order in 0.01 CNY
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get Instance ID 
     * @return InstanceIds Instance ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID
     * @param InstanceIds Instance ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public TradeDealDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TradeDealDetail(TradeDealDetail source) {
        if (source.DealId != null) {
            this.DealId = new String(source.DealId);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Creater != null) {
            this.Creater = new String(source.Creater);
        }
        if (source.CreatTime != null) {
            this.CreatTime = new String(source.CreatTime);
        }
        if (source.OverdueTime != null) {
            this.OverdueTime = new String(source.OverdueTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealId", this.DealId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "CreatTime", this.CreatTime);
        this.setParamSimple(map, prefix + "OverdueTime", this.OverdueTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

