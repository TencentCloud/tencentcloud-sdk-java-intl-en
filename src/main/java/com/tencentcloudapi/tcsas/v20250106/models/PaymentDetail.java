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

public class PaymentDetail extends AbstractModel {

    /**
    * Date in YYYYMMDD format
    */
    @SerializedName("DataTime")
    @Expose
    private String DataTime;

    /**
    * Number of mini programs involved in the order
    */
    @SerializedName("OrderMNPNum")
    @Expose
    private Long OrderMNPNum;

    /**
    * Total orders
    */
    @SerializedName("OrderNum")
    @Expose
    private Long OrderNum;

    /**
    * Paid orders
    */
    @SerializedName("OrderPaidNum")
    @Expose
    private Long OrderPaidNum;

    /**
    * Total refunded orders
    */
    @SerializedName("OrderRefundNum")
    @Expose
    private Long OrderRefundNum;

    /**
    * Unpaid orders
    */
    @SerializedName("OrderUnpaidNum")
    @Expose
    private Long OrderUnpaidNum;

    /**
    * Number of users placing orders (openid)
    */
    @SerializedName("OrderUserNum")
    @Expose
    private Long OrderUserNum;

    /**
    * Amount paid
    */
    @SerializedName("PaidAmount")
    @Expose
    private String PaidAmount;

    /**
    * Amount refunded
    */
    @SerializedName("RefundAmount")
    @Expose
    private String RefundAmount;

    /**
    * Total order amount
    */
    @SerializedName("TotalAmount")
    @Expose
    private String TotalAmount;

    /**
    * Unpaid amount
    */
    @SerializedName("UnpaidAmount")
    @Expose
    private String UnpaidAmount;

    /**
    * Data update timestamp
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Date in YYYYMMDD format 
     * @return DataTime Date in YYYYMMDD format
     */
    public String getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Date in YYYYMMDD format
     * @param DataTime Date in YYYYMMDD format
     */
    public void setDataTime(String DataTime) {
        this.DataTime = DataTime;
    }

    /**
     * Get Number of mini programs involved in the order 
     * @return OrderMNPNum Number of mini programs involved in the order
     */
    public Long getOrderMNPNum() {
        return this.OrderMNPNum;
    }

    /**
     * Set Number of mini programs involved in the order
     * @param OrderMNPNum Number of mini programs involved in the order
     */
    public void setOrderMNPNum(Long OrderMNPNum) {
        this.OrderMNPNum = OrderMNPNum;
    }

    /**
     * Get Total orders 
     * @return OrderNum Total orders
     */
    public Long getOrderNum() {
        return this.OrderNum;
    }

    /**
     * Set Total orders
     * @param OrderNum Total orders
     */
    public void setOrderNum(Long OrderNum) {
        this.OrderNum = OrderNum;
    }

    /**
     * Get Paid orders 
     * @return OrderPaidNum Paid orders
     */
    public Long getOrderPaidNum() {
        return this.OrderPaidNum;
    }

    /**
     * Set Paid orders
     * @param OrderPaidNum Paid orders
     */
    public void setOrderPaidNum(Long OrderPaidNum) {
        this.OrderPaidNum = OrderPaidNum;
    }

    /**
     * Get Total refunded orders 
     * @return OrderRefundNum Total refunded orders
     */
    public Long getOrderRefundNum() {
        return this.OrderRefundNum;
    }

    /**
     * Set Total refunded orders
     * @param OrderRefundNum Total refunded orders
     */
    public void setOrderRefundNum(Long OrderRefundNum) {
        this.OrderRefundNum = OrderRefundNum;
    }

    /**
     * Get Unpaid orders 
     * @return OrderUnpaidNum Unpaid orders
     */
    public Long getOrderUnpaidNum() {
        return this.OrderUnpaidNum;
    }

    /**
     * Set Unpaid orders
     * @param OrderUnpaidNum Unpaid orders
     */
    public void setOrderUnpaidNum(Long OrderUnpaidNum) {
        this.OrderUnpaidNum = OrderUnpaidNum;
    }

    /**
     * Get Number of users placing orders (openid) 
     * @return OrderUserNum Number of users placing orders (openid)
     */
    public Long getOrderUserNum() {
        return this.OrderUserNum;
    }

    /**
     * Set Number of users placing orders (openid)
     * @param OrderUserNum Number of users placing orders (openid)
     */
    public void setOrderUserNum(Long OrderUserNum) {
        this.OrderUserNum = OrderUserNum;
    }

    /**
     * Get Amount paid 
     * @return PaidAmount Amount paid
     */
    public String getPaidAmount() {
        return this.PaidAmount;
    }

    /**
     * Set Amount paid
     * @param PaidAmount Amount paid
     */
    public void setPaidAmount(String PaidAmount) {
        this.PaidAmount = PaidAmount;
    }

    /**
     * Get Amount refunded 
     * @return RefundAmount Amount refunded
     */
    public String getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set Amount refunded
     * @param RefundAmount Amount refunded
     */
    public void setRefundAmount(String RefundAmount) {
        this.RefundAmount = RefundAmount;
    }

    /**
     * Get Total order amount 
     * @return TotalAmount Total order amount
     */
    public String getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set Total order amount
     * @param TotalAmount Total order amount
     */
    public void setTotalAmount(String TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get Unpaid amount 
     * @return UnpaidAmount Unpaid amount
     */
    public String getUnpaidAmount() {
        return this.UnpaidAmount;
    }

    /**
     * Set Unpaid amount
     * @param UnpaidAmount Unpaid amount
     */
    public void setUnpaidAmount(String UnpaidAmount) {
        this.UnpaidAmount = UnpaidAmount;
    }

    /**
     * Get Data update timestamp 
     * @return UpdateTime Data update timestamp
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Data update timestamp
     * @param UpdateTime Data update timestamp
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public PaymentDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaymentDetail(PaymentDetail source) {
        if (source.DataTime != null) {
            this.DataTime = new String(source.DataTime);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);
        this.setParamSimple(map, prefix + "OrderMNPNum", this.OrderMNPNum);
        this.setParamSimple(map, prefix + "OrderNum", this.OrderNum);
        this.setParamSimple(map, prefix + "OrderPaidNum", this.OrderPaidNum);
        this.setParamSimple(map, prefix + "OrderRefundNum", this.OrderRefundNum);
        this.setParamSimple(map, prefix + "OrderUnpaidNum", this.OrderUnpaidNum);
        this.setParamSimple(map, prefix + "OrderUserNum", this.OrderUserNum);
        this.setParamSimple(map, prefix + "PaidAmount", this.PaidAmount);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "UnpaidAmount", this.UnpaidAmount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

