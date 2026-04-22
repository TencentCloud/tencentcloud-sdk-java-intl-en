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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MNPPaymentOverview extends AbstractModel {

    /**
    * Number of mini programs involved in the order
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderMNPNum")
    @Expose
    private Long OrderMNPNum;

    /**
    * Total orders

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderNum")
    @Expose
    private Long OrderNum;

    /**
    * Total paid orders

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderPaidNum")
    @Expose
    private Long OrderPaidNum;

    /**
    * Total refunded orders

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderRefundNum")
    @Expose
    private Long OrderRefundNum;

    /**
    * Total unpaid orders
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderUnpaidNum")
    @Expose
    private Long OrderUnpaidNum;

    /**
    * Total order users
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrderUserNum")
    @Expose
    private Long OrderUserNum;

    /**
    * Total paying users
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PaidUserNum")
    @Expose
    private Long PaidUserNum;

    /**
    * Amount paid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PaidAmount")
    @Expose
    private String PaidAmount;

    /**
    * Total amount refunded
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RefundAmount")
    @Expose
    private String RefundAmount;

    /**
    * Total order amount
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalAmount")
    @Expose
    private String TotalAmount;

    /**
    * Unpaid amount
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnpaidAmount")
    @Expose
    private String UnpaidAmount;

    /**
    * Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Data date
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataTime")
    @Expose
    private String DataTime;

    /**
     * Get Number of mini programs involved in the order
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrderMNPNum Number of mini programs involved in the order
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrderMNPNum() {
        return this.OrderMNPNum;
    }

    /**
     * Set Number of mini programs involved in the order
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrderMNPNum Number of mini programs involved in the order
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderMNPNum(Long OrderMNPNum) {
        this.OrderMNPNum = OrderMNPNum;
    }

    /**
     * Get Total orders

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrderNum Total orders

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrderNum() {
        return this.OrderNum;
    }

    /**
     * Set Total orders

Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrderNum Total orders

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderNum(Long OrderNum) {
        this.OrderNum = OrderNum;
    }

    /**
     * Get Total paid orders

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrderPaidNum Total paid orders

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrderPaidNum() {
        return this.OrderPaidNum;
    }

    /**
     * Set Total paid orders

Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrderPaidNum Total paid orders

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderPaidNum(Long OrderPaidNum) {
        this.OrderPaidNum = OrderPaidNum;
    }

    /**
     * Get Total refunded orders

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrderRefundNum Total refunded orders

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrderRefundNum() {
        return this.OrderRefundNum;
    }

    /**
     * Set Total refunded orders

Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrderRefundNum Total refunded orders

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderRefundNum(Long OrderRefundNum) {
        this.OrderRefundNum = OrderRefundNum;
    }

    /**
     * Get Total unpaid orders
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrderUnpaidNum Total unpaid orders
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrderUnpaidNum() {
        return this.OrderUnpaidNum;
    }

    /**
     * Set Total unpaid orders
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrderUnpaidNum Total unpaid orders
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderUnpaidNum(Long OrderUnpaidNum) {
        this.OrderUnpaidNum = OrderUnpaidNum;
    }

    /**
     * Get Total order users
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrderUserNum Total order users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrderUserNum() {
        return this.OrderUserNum;
    }

    /**
     * Set Total order users
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrderUserNum Total order users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrderUserNum(Long OrderUserNum) {
        this.OrderUserNum = OrderUserNum;
    }

    /**
     * Get Total paying users
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PaidUserNum Total paying users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPaidUserNum() {
        return this.PaidUserNum;
    }

    /**
     * Set Total paying users
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PaidUserNum Total paying users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPaidUserNum(Long PaidUserNum) {
        this.PaidUserNum = PaidUserNum;
    }

    /**
     * Get Amount paid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PaidAmount Amount paid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPaidAmount() {
        return this.PaidAmount;
    }

    /**
     * Set Amount paid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PaidAmount Amount paid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPaidAmount(String PaidAmount) {
        this.PaidAmount = PaidAmount;
    }

    /**
     * Get Total amount refunded
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RefundAmount Total amount refunded
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set Total amount refunded
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RefundAmount Total amount refunded
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRefundAmount(String RefundAmount) {
        this.RefundAmount = RefundAmount;
    }

    /**
     * Get Total order amount
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalAmount Total order amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set Total order amount
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalAmount Total order amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalAmount(String TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get Unpaid amount
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnpaidAmount Unpaid amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnpaidAmount() {
        return this.UnpaidAmount;
    }

    /**
     * Set Unpaid amount
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnpaidAmount Unpaid amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnpaidAmount(String UnpaidAmount) {
        this.UnpaidAmount = UnpaidAmount;
    }

    /**
     * Get Timestamp
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Data date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataTime Data date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Data date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataTime Data date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataTime(String DataTime) {
        this.DataTime = DataTime;
    }

    public MNPPaymentOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNPPaymentOverview(MNPPaymentOverview source) {
        if (source.OrderMNPNum != null) {
            this.OrderMNPNum = new Long(source.OrderMNPNum);
        }
        if (source.OrderNum != null) {
            this.OrderNum = new Long(source.OrderNum);
        }
        if (source.OrderPaidNum != null) {
            this.OrderPaidNum = new Long(source.OrderPaidNum);
        }
        if (source.OrderRefundNum != null) {
            this.OrderRefundNum = new Long(source.OrderRefundNum);
        }
        if (source.OrderUnpaidNum != null) {
            this.OrderUnpaidNum = new Long(source.OrderUnpaidNum);
        }
        if (source.OrderUserNum != null) {
            this.OrderUserNum = new Long(source.OrderUserNum);
        }
        if (source.PaidUserNum != null) {
            this.PaidUserNum = new Long(source.PaidUserNum);
        }
        if (source.PaidAmount != null) {
            this.PaidAmount = new String(source.PaidAmount);
        }
        if (source.RefundAmount != null) {
            this.RefundAmount = new String(source.RefundAmount);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new String(source.TotalAmount);
        }
        if (source.UnpaidAmount != null) {
            this.UnpaidAmount = new String(source.UnpaidAmount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.DataTime != null) {
            this.DataTime = new String(source.DataTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderMNPNum", this.OrderMNPNum);
        this.setParamSimple(map, prefix + "OrderNum", this.OrderNum);
        this.setParamSimple(map, prefix + "OrderPaidNum", this.OrderPaidNum);
        this.setParamSimple(map, prefix + "OrderRefundNum", this.OrderRefundNum);
        this.setParamSimple(map, prefix + "OrderUnpaidNum", this.OrderUnpaidNum);
        this.setParamSimple(map, prefix + "OrderUserNum", this.OrderUserNum);
        this.setParamSimple(map, prefix + "PaidUserNum", this.PaidUserNum);
        this.setParamSimple(map, prefix + "PaidAmount", this.PaidAmount);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "UnpaidAmount", this.UnpaidAmount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);

    }
}

