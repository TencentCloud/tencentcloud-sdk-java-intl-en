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

public class DescribeMNGPaymentLineChartRequest extends AbstractModel {

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
    * Valid values:
mng_paid_amount: Virtual payment amount,
paid_user_num: Number of paying users,
new_paid_user_num: Number of new paying users,
new_paid_user_amount: Revenue from new paying users,
new_paid_user_ratio: Percentage of new users who made payments,
arppu: Average revenue per paying user (ARPPU),
mng_refund_num: Number of refund orders
mng_refund_amount: Refund amount
    */
    @SerializedName("IndexId")
    @Expose
    private String IndexId;

    /**
    * Input parameter base64 string: {"Platform":0,"MnpId":"mgcp5xc2yzw8aixv","BeginDate":20251028,"EndDate":20251126,"DataType":"1","PaymentType":2}
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
     * Get Valid values:
mng_paid_amount: Virtual payment amount,
paid_user_num: Number of paying users,
new_paid_user_num: Number of new paying users,
new_paid_user_amount: Revenue from new paying users,
new_paid_user_ratio: Percentage of new users who made payments,
arppu: Average revenue per paying user (ARPPU),
mng_refund_num: Number of refund orders
mng_refund_amount: Refund amount 
     * @return IndexId Valid values:
mng_paid_amount: Virtual payment amount,
paid_user_num: Number of paying users,
new_paid_user_num: Number of new paying users,
new_paid_user_amount: Revenue from new paying users,
new_paid_user_ratio: Percentage of new users who made payments,
arppu: Average revenue per paying user (ARPPU),
mng_refund_num: Number of refund orders
mng_refund_amount: Refund amount
     */
    public String getIndexId() {
        return this.IndexId;
    }

    /**
     * Set Valid values:
mng_paid_amount: Virtual payment amount,
paid_user_num: Number of paying users,
new_paid_user_num: Number of new paying users,
new_paid_user_amount: Revenue from new paying users,
new_paid_user_ratio: Percentage of new users who made payments,
arppu: Average revenue per paying user (ARPPU),
mng_refund_num: Number of refund orders
mng_refund_amount: Refund amount
     * @param IndexId Valid values:
mng_paid_amount: Virtual payment amount,
paid_user_num: Number of paying users,
new_paid_user_num: Number of new paying users,
new_paid_user_amount: Revenue from new paying users,
new_paid_user_ratio: Percentage of new users who made payments,
arppu: Average revenue per paying user (ARPPU),
mng_refund_num: Number of refund orders
mng_refund_amount: Refund amount
     */
    public void setIndexId(String IndexId) {
        this.IndexId = IndexId;
    }

    /**
     * Get Input parameter base64 string: {"Platform":0,"MnpId":"mgcp5xc2yzw8aixv","BeginDate":20251028,"EndDate":20251126,"DataType":"1","PaymentType":2} 
     * @return QueryData Input parameter base64 string: {"Platform":0,"MnpId":"mgcp5xc2yzw8aixv","BeginDate":20251028,"EndDate":20251126,"DataType":"1","PaymentType":2}
     */
    public String getQueryData() {
        return this.QueryData;
    }

    /**
     * Set Input parameter base64 string: {"Platform":0,"MnpId":"mgcp5xc2yzw8aixv","BeginDate":20251028,"EndDate":20251126,"DataType":"1","PaymentType":2}
     * @param QueryData Input parameter base64 string: {"Platform":0,"MnpId":"mgcp5xc2yzw8aixv","BeginDate":20251028,"EndDate":20251126,"DataType":"1","PaymentType":2}
     */
    public void setQueryData(String QueryData) {
        this.QueryData = QueryData;
    }

    public DescribeMNGPaymentLineChartRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGPaymentLineChartRequest(DescribeMNGPaymentLineChartRequest source) {
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

