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

public class DescribePaymentDataLineChartRequest extends AbstractModel {

    /**
    * Tenant ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Fixed value: payment_data_analysis
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * IndexId (optional):
order_user_num: Number of users placing orders
order_num: Total orders
total_amount: Total amount
order_unpaid_num: Total unpaid orders
unpaid_amount: Unpaid amount
order_paid_num: Total paid orders
paid_amount: Amount paid
order_refund_num: Total refunded orders
refund_amount: Total amount refunded
    */
    @SerializedName("IndexId")
    @Expose
    private String IndexId;

    /**
    * Input parameter base64 string: {"Platform":0,"MnpIds":["mp9e7qluz4i3z3km"],"BeginDate":20251031,"EndDate":20251129,"DataType":"1","PaymentType":1}
    */
    @SerializedName("QueryData")
    @Expose
    private String QueryData;

    /**
     * Get Tenant ID 
     * @return PlatformId Tenant ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Tenant ID
     * @param PlatformId Tenant ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Fixed value: payment_data_analysis 
     * @return ReportId Fixed value: payment_data_analysis
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set Fixed value: payment_data_analysis
     * @param ReportId Fixed value: payment_data_analysis
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get IndexId (optional):
order_user_num: Number of users placing orders
order_num: Total orders
total_amount: Total amount
order_unpaid_num: Total unpaid orders
unpaid_amount: Unpaid amount
order_paid_num: Total paid orders
paid_amount: Amount paid
order_refund_num: Total refunded orders
refund_amount: Total amount refunded 
     * @return IndexId IndexId (optional):
order_user_num: Number of users placing orders
order_num: Total orders
total_amount: Total amount
order_unpaid_num: Total unpaid orders
unpaid_amount: Unpaid amount
order_paid_num: Total paid orders
paid_amount: Amount paid
order_refund_num: Total refunded orders
refund_amount: Total amount refunded
     */
    public String getIndexId() {
        return this.IndexId;
    }

    /**
     * Set IndexId (optional):
order_user_num: Number of users placing orders
order_num: Total orders
total_amount: Total amount
order_unpaid_num: Total unpaid orders
unpaid_amount: Unpaid amount
order_paid_num: Total paid orders
paid_amount: Amount paid
order_refund_num: Total refunded orders
refund_amount: Total amount refunded
     * @param IndexId IndexId (optional):
order_user_num: Number of users placing orders
order_num: Total orders
total_amount: Total amount
order_unpaid_num: Total unpaid orders
unpaid_amount: Unpaid amount
order_paid_num: Total paid orders
paid_amount: Amount paid
order_refund_num: Total refunded orders
refund_amount: Total amount refunded
     */
    public void setIndexId(String IndexId) {
        this.IndexId = IndexId;
    }

    /**
     * Get Input parameter base64 string: {"Platform":0,"MnpIds":["mp9e7qluz4i3z3km"],"BeginDate":20251031,"EndDate":20251129,"DataType":"1","PaymentType":1} 
     * @return QueryData Input parameter base64 string: {"Platform":0,"MnpIds":["mp9e7qluz4i3z3km"],"BeginDate":20251031,"EndDate":20251129,"DataType":"1","PaymentType":1}
     */
    public String getQueryData() {
        return this.QueryData;
    }

    /**
     * Set Input parameter base64 string: {"Platform":0,"MnpIds":["mp9e7qluz4i3z3km"],"BeginDate":20251031,"EndDate":20251129,"DataType":"1","PaymentType":1}
     * @param QueryData Input parameter base64 string: {"Platform":0,"MnpIds":["mp9e7qluz4i3z3km"],"BeginDate":20251031,"EndDate":20251129,"DataType":"1","PaymentType":1}
     */
    public void setQueryData(String QueryData) {
        this.QueryData = QueryData;
    }

    public DescribePaymentDataLineChartRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePaymentDataLineChartRequest(DescribePaymentDataLineChartRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.IndexId != null) {
            this.IndexId = new String(source.IndexId);
        }
        if (source.QueryData != null) {
            this.QueryData = new String(source.QueryData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "IndexId", this.IndexId);
        this.setParamSimple(map, prefix + "QueryData", this.QueryData);

    }
}

