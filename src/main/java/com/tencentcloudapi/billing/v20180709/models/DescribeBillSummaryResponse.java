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

public class DescribeBillSummaryResponse extends AbstractModel{

    /**
    * Indicates whether the data is ready. `0`: Not ready. `1`: Ready.  If `Ready` is `0`, it indicates the current UIN is initializing for the first billing. Wait for 5-10 minutes and try again.
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * Detailed summary of costs by multiple dimensions
    */
    @SerializedName("SummaryDetail")
    @Expose
    private SummaryDetail [] SummaryDetail;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Indicates whether the data is ready. `0`: Not ready. `1`: Ready.  If `Ready` is `0`, it indicates the current UIN is initializing for the first billing. Wait for 5-10 minutes and try again. 
     * @return Ready Indicates whether the data is ready. `0`: Not ready. `1`: Ready.  If `Ready` is `0`, it indicates the current UIN is initializing for the first billing. Wait for 5-10 minutes and try again.
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set Indicates whether the data is ready. `0`: Not ready. `1`: Ready.  If `Ready` is `0`, it indicates the current UIN is initializing for the first billing. Wait for 5-10 minutes and try again.
     * @param Ready Indicates whether the data is ready. `0`: Not ready. `1`: Ready.  If `Ready` is `0`, it indicates the current UIN is initializing for the first billing. Wait for 5-10 minutes and try again.
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get Detailed summary of costs by multiple dimensions 
     * @return SummaryDetail Detailed summary of costs by multiple dimensions
     */
    public SummaryDetail [] getSummaryDetail() {
        return this.SummaryDetail;
    }

    /**
     * Set Detailed summary of costs by multiple dimensions
     * @param SummaryDetail Detailed summary of costs by multiple dimensions
     */
    public void setSummaryDetail(SummaryDetail [] SummaryDetail) {
        this.SummaryDetail = SummaryDetail;
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

    public DescribeBillSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryResponse(DescribeBillSummaryResponse source) {
        if (source.Ready != null) {
            this.Ready = new Long(source.Ready);
        }
        if (source.SummaryDetail != null) {
            this.SummaryDetail = new SummaryDetail[source.SummaryDetail.length];
            for (int i = 0; i < source.SummaryDetail.length; i++) {
                this.SummaryDetail[i] = new SummaryDetail(source.SummaryDetail[i]);
            }
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
        this.setParamArrayObj(map, prefix + "SummaryDetail.", this.SummaryDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

