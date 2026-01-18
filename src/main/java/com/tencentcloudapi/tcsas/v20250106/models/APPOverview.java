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

public class APPOverview extends AbstractModel {

    /**
    * No data available
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BaseData")
    @Expose
    private APPOverviewData BaseData;

    /**
    * Superapp overview summary data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Overview")
    @Expose
    private APPOverviewData Overview;

    /**
    * No data available
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageData")
    @Expose
    private APPOverviewData PageData;

    /**
    * No data available
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Payment")
    @Expose
    private APPOverviewData Payment;

    /**
     * Get No data available
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BaseData No data available
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public APPOverviewData getBaseData() {
        return this.BaseData;
    }

    /**
     * Set No data available
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BaseData No data available
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBaseData(APPOverviewData BaseData) {
        this.BaseData = BaseData;
    }

    /**
     * Get Superapp overview summary data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Overview Superapp overview summary data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public APPOverviewData getOverview() {
        return this.Overview;
    }

    /**
     * Set Superapp overview summary data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Overview Superapp overview summary data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOverview(APPOverviewData Overview) {
        this.Overview = Overview;
    }

    /**
     * Get No data available
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageData No data available
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public APPOverviewData getPageData() {
        return this.PageData;
    }

    /**
     * Set No data available
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageData No data available
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageData(APPOverviewData PageData) {
        this.PageData = PageData;
    }

    /**
     * Get No data available
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Payment No data available
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public APPOverviewData getPayment() {
        return this.Payment;
    }

    /**
     * Set No data available
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Payment No data available
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayment(APPOverviewData Payment) {
        this.Payment = Payment;
    }

    public APPOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APPOverview(APPOverview source) {
        if (source.BaseData != null) {
            this.BaseData = new APPOverviewData(source.BaseData);
        }
        if (source.Overview != null) {
            this.Overview = new APPOverviewData(source.Overview);
        }
        if (source.PageData != null) {
            this.PageData = new APPOverviewData(source.PageData);
        }
        if (source.Payment != null) {
            this.Payment = new APPOverviewData(source.Payment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseData.", this.BaseData);
        this.setParamObj(map, prefix + "Overview.", this.Overview);
        this.setParamObj(map, prefix + "PageData.", this.PageData);
        this.setParamObj(map, prefix + "Payment.", this.Payment);

    }
}

