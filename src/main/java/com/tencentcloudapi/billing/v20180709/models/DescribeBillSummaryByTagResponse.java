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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryByTagResponse extends AbstractModel{

    /**
    * Indicates whether or not the data is ready. `0`: not ready; `1`: ready.
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * Details about cost distribution over different tags
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SummaryOverview")
    @Expose
    private TagSummaryOverviewItem [] SummaryOverview;

    /**
    * Total cost
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SummaryTotal")
    @Expose
    private SummaryTotal SummaryTotal;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Indicates whether or not the data is ready. `0`: not ready; `1`: ready. 
     * @return Ready Indicates whether or not the data is ready. `0`: not ready; `1`: ready.
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set Indicates whether or not the data is ready. `0`: not ready; `1`: ready.
     * @param Ready Indicates whether or not the data is ready. `0`: not ready; `1`: ready.
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get Details about cost distribution over different tags
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SummaryOverview Details about cost distribution over different tags
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagSummaryOverviewItem [] getSummaryOverview() {
        return this.SummaryOverview;
    }

    /**
     * Set Details about cost distribution over different tags
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SummaryOverview Details about cost distribution over different tags
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSummaryOverview(TagSummaryOverviewItem [] SummaryOverview) {
        this.SummaryOverview = SummaryOverview;
    }

    /**
     * Get Total cost
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SummaryTotal Total cost
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public SummaryTotal getSummaryTotal() {
        return this.SummaryTotal;
    }

    /**
     * Set Total cost
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SummaryTotal Total cost
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSummaryTotal(SummaryTotal SummaryTotal) {
        this.SummaryTotal = SummaryTotal;
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

    public DescribeBillSummaryByTagResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryByTagResponse(DescribeBillSummaryByTagResponse source) {
        if (source.Ready != null) {
            this.Ready = new Long(source.Ready);
        }
        if (source.SummaryOverview != null) {
            this.SummaryOverview = new TagSummaryOverviewItem[source.SummaryOverview.length];
            for (int i = 0; i < source.SummaryOverview.length; i++) {
                this.SummaryOverview[i] = new TagSummaryOverviewItem(source.SummaryOverview[i]);
            }
        }
        if (source.SummaryTotal != null) {
            this.SummaryTotal = new SummaryTotal(source.SummaryTotal);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamArrayObj(map, prefix + "SummaryOverview.", this.SummaryOverview);
        this.setParamObj(map, prefix + "SummaryTotal.", this.SummaryTotal);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

