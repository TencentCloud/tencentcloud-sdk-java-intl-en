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

public class AccessAnalysisOverview extends AbstractModel {

    /**
    * Overview of visit analysis data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BaseData")
    @Expose
    private AccessAnalysisDetail BaseData;

    /**
    * This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Overview")
    @Expose
    private Overview Overview;

    /**
    * This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageData")
    @Expose
    private AccessAnalysisDetail PageData;

    /**
    * This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Payment")
    @Expose
    private AccessAnalysisDetail Payment;

    /**
     * Get Overview of visit analysis data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BaseData Overview of visit analysis data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AccessAnalysisDetail getBaseData() {
        return this.BaseData;
    }

    /**
     * Set Overview of visit analysis data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BaseData Overview of visit analysis data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBaseData(AccessAnalysisDetail BaseData) {
        this.BaseData = BaseData;
    }

    /**
     * Get This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Overview This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Overview getOverview() {
        return this.Overview;
    }

    /**
     * Set This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Overview This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOverview(Overview Overview) {
        this.Overview = Overview;
    }

    /**
     * Get This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageData This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AccessAnalysisDetail getPageData() {
        return this.PageData;
    }

    /**
     * Set This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageData This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageData(AccessAnalysisDetail PageData) {
        this.PageData = PageData;
    }

    /**
     * Get This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Payment This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AccessAnalysisDetail getPayment() {
        return this.Payment;
    }

    /**
     * Set This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Payment This API does not respond.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayment(AccessAnalysisDetail Payment) {
        this.Payment = Payment;
    }

    public AccessAnalysisOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessAnalysisOverview(AccessAnalysisOverview source) {
        if (source.BaseData != null) {
            this.BaseData = new AccessAnalysisDetail(source.BaseData);
        }
        if (source.Overview != null) {
            this.Overview = new Overview(source.Overview);
        }
        if (source.PageData != null) {
            this.PageData = new AccessAnalysisDetail(source.PageData);
        }
        if (source.Payment != null) {
            this.Payment = new AccessAnalysisDetail(source.Payment);
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

