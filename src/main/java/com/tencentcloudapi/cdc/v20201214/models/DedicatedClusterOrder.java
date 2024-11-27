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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterOrder extends AbstractModel {

    /**
    * CDC id
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * CDC type id (moved to the next level, obsolete and will be deleted later)
    */
    @SerializedName("DedicatedClusterTypeId")
    @Expose
    private String DedicatedClusterTypeId;

    /**
    * List of supported storage types (moved to the next level, obsolete and will be deleted later)
    */
    @SerializedName("SupportedStorageType")
    @Expose
    private String [] SupportedStorageType;

    /**
    * Supported uplink switch transmission rate (GiB) (moved to the next level, obsolete and will be deleted later)
    */
    @SerializedName("SupportedUplinkSpeed")
    @Expose
    private Long [] SupportedUplinkSpeed;

    /**
    * List of supported instance families (moved to the next level, obsolete and will be deleted later)
    */
    @SerializedName("SupportedInstanceFamily")
    @Expose
    private String [] SupportedInstanceFamily;

    /**
    * Floor weight capacity (KG)
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Power requirements (KW)
    */
    @SerializedName("PowerDraw")
    @Expose
    private Float PowerDraw;

    /**
    * Order status
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
    * Order creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Large order ID
    */
    @SerializedName("DedicatedClusterOrderId")
    @Expose
    private String DedicatedClusterOrderId;

    /**
    * Order type, CREATE or EXTEND
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * List of sub-order details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("DedicatedClusterOrderItems")
    @Expose
    private DedicatedClusterOrderItem [] DedicatedClusterOrderItems;

    /**
    * CPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * MEM value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * GPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("PayStatus")
    @Expose
    private Long PayStatus;

    /**
    * Payment method: lump-sum, monthly, and annually 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * Unit of purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Order type 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 
    */
    @SerializedName("DeliverExpectTime")
    @Expose
    private String DeliverExpectTime;

    /**
    * 
    */
    @SerializedName("DeliverFinishTime")
    @Expose
    private String DeliverFinishTime;

    /**
    * 
    */
    @SerializedName("CheckExpectTime")
    @Expose
    private String CheckExpectTime;

    /**
    * 
    */
    @SerializedName("CheckFinishTime")
    @Expose
    private String CheckFinishTime;

    /**
    * 
    */
    @SerializedName("OrderSLA")
    @Expose
    private String OrderSLA;

    /**
    * 
    */
    @SerializedName("OrderPayPlan")
    @Expose
    private String OrderPayPlan;

    /**
     * Get CDC id 
     * @return DedicatedClusterId CDC id
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC id
     * @param DedicatedClusterId CDC id
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get CDC type id (moved to the next level, obsolete and will be deleted later) 
     * @return DedicatedClusterTypeId CDC type id (moved to the next level, obsolete and will be deleted later)
     */
    public String getDedicatedClusterTypeId() {
        return this.DedicatedClusterTypeId;
    }

    /**
     * Set CDC type id (moved to the next level, obsolete and will be deleted later)
     * @param DedicatedClusterTypeId CDC type id (moved to the next level, obsolete and will be deleted later)
     */
    public void setDedicatedClusterTypeId(String DedicatedClusterTypeId) {
        this.DedicatedClusterTypeId = DedicatedClusterTypeId;
    }

    /**
     * Get List of supported storage types (moved to the next level, obsolete and will be deleted later) 
     * @return SupportedStorageType List of supported storage types (moved to the next level, obsolete and will be deleted later)
     */
    public String [] getSupportedStorageType() {
        return this.SupportedStorageType;
    }

    /**
     * Set List of supported storage types (moved to the next level, obsolete and will be deleted later)
     * @param SupportedStorageType List of supported storage types (moved to the next level, obsolete and will be deleted later)
     */
    public void setSupportedStorageType(String [] SupportedStorageType) {
        this.SupportedStorageType = SupportedStorageType;
    }

    /**
     * Get Supported uplink switch transmission rate (GiB) (moved to the next level, obsolete and will be deleted later) 
     * @return SupportedUplinkSpeed Supported uplink switch transmission rate (GiB) (moved to the next level, obsolete and will be deleted later)
     */
    public Long [] getSupportedUplinkSpeed() {
        return this.SupportedUplinkSpeed;
    }

    /**
     * Set Supported uplink switch transmission rate (GiB) (moved to the next level, obsolete and will be deleted later)
     * @param SupportedUplinkSpeed Supported uplink switch transmission rate (GiB) (moved to the next level, obsolete and will be deleted later)
     */
    public void setSupportedUplinkSpeed(Long [] SupportedUplinkSpeed) {
        this.SupportedUplinkSpeed = SupportedUplinkSpeed;
    }

    /**
     * Get List of supported instance families (moved to the next level, obsolete and will be deleted later) 
     * @return SupportedInstanceFamily List of supported instance families (moved to the next level, obsolete and will be deleted later)
     */
    public String [] getSupportedInstanceFamily() {
        return this.SupportedInstanceFamily;
    }

    /**
     * Set List of supported instance families (moved to the next level, obsolete and will be deleted later)
     * @param SupportedInstanceFamily List of supported instance families (moved to the next level, obsolete and will be deleted later)
     */
    public void setSupportedInstanceFamily(String [] SupportedInstanceFamily) {
        this.SupportedInstanceFamily = SupportedInstanceFamily;
    }

    /**
     * Get Floor weight capacity (KG) 
     * @return Weight Floor weight capacity (KG)
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Floor weight capacity (KG)
     * @param Weight Floor weight capacity (KG)
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Power requirements (KW) 
     * @return PowerDraw Power requirements (KW)
     */
    public Float getPowerDraw() {
        return this.PowerDraw;
    }

    /**
     * Set Power requirements (KW)
     * @param PowerDraw Power requirements (KW)
     */
    public void setPowerDraw(Float PowerDraw) {
        this.PowerDraw = PowerDraw;
    }

    /**
     * Get Order status 
     * @return OrderStatus Order status
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set Order status
     * @param OrderStatus Order status
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get Order creation time 
     * @return CreateTime Order creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Order creation time
     * @param CreateTime Order creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Large order ID 
     * @return DedicatedClusterOrderId Large order ID
     */
    public String getDedicatedClusterOrderId() {
        return this.DedicatedClusterOrderId;
    }

    /**
     * Set Large order ID
     * @param DedicatedClusterOrderId Large order ID
     */
    public void setDedicatedClusterOrderId(String DedicatedClusterOrderId) {
        this.DedicatedClusterOrderId = DedicatedClusterOrderId;
    }

    /**
     * Get Order type, CREATE or EXTEND 
     * @return Action Order type, CREATE or EXTEND
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Order type, CREATE or EXTEND
     * @param Action Order type, CREATE or EXTEND
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get List of sub-order details 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return DedicatedClusterOrderItems List of sub-order details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public DedicatedClusterOrderItem [] getDedicatedClusterOrderItems() {
        return this.DedicatedClusterOrderItems;
    }

    /**
     * Set List of sub-order details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param DedicatedClusterOrderItems List of sub-order details 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setDedicatedClusterOrderItems(DedicatedClusterOrderItem [] DedicatedClusterOrderItems) {
        this.DedicatedClusterOrderItems = DedicatedClusterOrderItems;
    }

    /**
     * Get CPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Cpu CPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Cpu CPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get MEM value 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Mem MEM value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set MEM value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Mem MEM value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get GPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Gpu GPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Gpu GPU value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return PayStatus 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getPayStatus() {
        return this.PayStatus;
    }

    /**
     * Set 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param PayStatus 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setPayStatus(Long PayStatus) {
        this.PayStatus = PayStatus;
    }

    /**
     * Get Payment method: lump-sum, monthly, and annually 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return PayType Payment method: lump-sum, monthly, and annually 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set Payment method: lump-sum, monthly, and annually 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param PayType Payment method: lump-sum, monthly, and annually 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Unit of purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return TimeUnit Unit of purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Unit of purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param TimeUnit Unit of purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return TimeSpan Purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param TimeSpan Purchased period 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Order type 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return OrderType Order type 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Order type 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param OrderType Order type 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get  
     * @return CheckStatus 
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 
     * @param CheckStatus 
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get  
     * @return DeliverExpectTime 
     */
    public String getDeliverExpectTime() {
        return this.DeliverExpectTime;
    }

    /**
     * Set 
     * @param DeliverExpectTime 
     */
    public void setDeliverExpectTime(String DeliverExpectTime) {
        this.DeliverExpectTime = DeliverExpectTime;
    }

    /**
     * Get  
     * @return DeliverFinishTime 
     */
    public String getDeliverFinishTime() {
        return this.DeliverFinishTime;
    }

    /**
     * Set 
     * @param DeliverFinishTime 
     */
    public void setDeliverFinishTime(String DeliverFinishTime) {
        this.DeliverFinishTime = DeliverFinishTime;
    }

    /**
     * Get  
     * @return CheckExpectTime 
     */
    public String getCheckExpectTime() {
        return this.CheckExpectTime;
    }

    /**
     * Set 
     * @param CheckExpectTime 
     */
    public void setCheckExpectTime(String CheckExpectTime) {
        this.CheckExpectTime = CheckExpectTime;
    }

    /**
     * Get  
     * @return CheckFinishTime 
     */
    public String getCheckFinishTime() {
        return this.CheckFinishTime;
    }

    /**
     * Set 
     * @param CheckFinishTime 
     */
    public void setCheckFinishTime(String CheckFinishTime) {
        this.CheckFinishTime = CheckFinishTime;
    }

    /**
     * Get  
     * @return OrderSLA 
     */
    public String getOrderSLA() {
        return this.OrderSLA;
    }

    /**
     * Set 
     * @param OrderSLA 
     */
    public void setOrderSLA(String OrderSLA) {
        this.OrderSLA = OrderSLA;
    }

    /**
     * Get  
     * @return OrderPayPlan 
     */
    public String getOrderPayPlan() {
        return this.OrderPayPlan;
    }

    /**
     * Set 
     * @param OrderPayPlan 
     */
    public void setOrderPayPlan(String OrderPayPlan) {
        this.OrderPayPlan = OrderPayPlan;
    }

    public DedicatedClusterOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterOrder(DedicatedClusterOrder source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.DedicatedClusterTypeId != null) {
            this.DedicatedClusterTypeId = new String(source.DedicatedClusterTypeId);
        }
        if (source.SupportedStorageType != null) {
            this.SupportedStorageType = new String[source.SupportedStorageType.length];
            for (int i = 0; i < source.SupportedStorageType.length; i++) {
                this.SupportedStorageType[i] = new String(source.SupportedStorageType[i]);
            }
        }
        if (source.SupportedUplinkSpeed != null) {
            this.SupportedUplinkSpeed = new Long[source.SupportedUplinkSpeed.length];
            for (int i = 0; i < source.SupportedUplinkSpeed.length; i++) {
                this.SupportedUplinkSpeed[i] = new Long(source.SupportedUplinkSpeed[i]);
            }
        }
        if (source.SupportedInstanceFamily != null) {
            this.SupportedInstanceFamily = new String[source.SupportedInstanceFamily.length];
            for (int i = 0; i < source.SupportedInstanceFamily.length; i++) {
                this.SupportedInstanceFamily[i] = new String(source.SupportedInstanceFamily[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.PowerDraw != null) {
            this.PowerDraw = new Float(source.PowerDraw);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new String(source.OrderStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DedicatedClusterOrderId != null) {
            this.DedicatedClusterOrderId = new String(source.DedicatedClusterOrderId);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.DedicatedClusterOrderItems != null) {
            this.DedicatedClusterOrderItems = new DedicatedClusterOrderItem[source.DedicatedClusterOrderItems.length];
            for (int i = 0; i < source.DedicatedClusterOrderItems.length; i++) {
                this.DedicatedClusterOrderItems[i] = new DedicatedClusterOrderItem(source.DedicatedClusterOrderItems[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.PayStatus != null) {
            this.PayStatus = new Long(source.PayStatus);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.DeliverExpectTime != null) {
            this.DeliverExpectTime = new String(source.DeliverExpectTime);
        }
        if (source.DeliverFinishTime != null) {
            this.DeliverFinishTime = new String(source.DeliverFinishTime);
        }
        if (source.CheckExpectTime != null) {
            this.CheckExpectTime = new String(source.CheckExpectTime);
        }
        if (source.CheckFinishTime != null) {
            this.CheckFinishTime = new String(source.CheckFinishTime);
        }
        if (source.OrderSLA != null) {
            this.OrderSLA = new String(source.OrderSLA);
        }
        if (source.OrderPayPlan != null) {
            this.OrderPayPlan = new String(source.OrderPayPlan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "DedicatedClusterTypeId", this.DedicatedClusterTypeId);
        this.setParamArraySimple(map, prefix + "SupportedStorageType.", this.SupportedStorageType);
        this.setParamArraySimple(map, prefix + "SupportedUplinkSpeed.", this.SupportedUplinkSpeed);
        this.setParamArraySimple(map, prefix + "SupportedInstanceFamily.", this.SupportedInstanceFamily);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "PowerDraw", this.PowerDraw);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DedicatedClusterOrderId", this.DedicatedClusterOrderId);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArrayObj(map, prefix + "DedicatedClusterOrderItems.", this.DedicatedClusterOrderItems);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "PayStatus", this.PayStatus);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "DeliverExpectTime", this.DeliverExpectTime);
        this.setParamSimple(map, prefix + "DeliverFinishTime", this.DeliverFinishTime);
        this.setParamSimple(map, prefix + "CheckExpectTime", this.CheckExpectTime);
        this.setParamSimple(map, prefix + "CheckFinishTime", this.CheckFinishTime);
        this.setParamSimple(map, prefix + "OrderSLA", this.OrderSLA);
        this.setParamSimple(map, prefix + "OrderPayPlan", this.OrderPayPlan);

    }
}

