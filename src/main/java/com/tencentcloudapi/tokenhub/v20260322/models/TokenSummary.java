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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenSummary extends AbstractModel {

    /**
    * Package serial number of the current billing cycle
    */
    @SerializedName("CycleSeq")
    @Expose
    private Long CycleSeq;

    /**
    * Package billing cycle start time (RFC3339)
    */
    @SerializedName("CycleStartTime")
    @Expose
    private String CycleStartTime;

    /**
    * Package billing cycle end time (RFC3339)
    */
    @SerializedName("CycleEndTime")
    @Expose
    private String CycleEndTime;

    /**
    * Summary list of tokens grouped by billing item
    */
    @SerializedName("BillingItems")
    @Expose
    private TokenSummaryBillingItem [] BillingItems;

    /**
     * Get Package serial number of the current billing cycle 
     * @return CycleSeq Package serial number of the current billing cycle
     */
    public Long getCycleSeq() {
        return this.CycleSeq;
    }

    /**
     * Set Package serial number of the current billing cycle
     * @param CycleSeq Package serial number of the current billing cycle
     */
    public void setCycleSeq(Long CycleSeq) {
        this.CycleSeq = CycleSeq;
    }

    /**
     * Get Package billing cycle start time (RFC3339) 
     * @return CycleStartTime Package billing cycle start time (RFC3339)
     */
    public String getCycleStartTime() {
        return this.CycleStartTime;
    }

    /**
     * Set Package billing cycle start time (RFC3339)
     * @param CycleStartTime Package billing cycle start time (RFC3339)
     */
    public void setCycleStartTime(String CycleStartTime) {
        this.CycleStartTime = CycleStartTime;
    }

    /**
     * Get Package billing cycle end time (RFC3339) 
     * @return CycleEndTime Package billing cycle end time (RFC3339)
     */
    public String getCycleEndTime() {
        return this.CycleEndTime;
    }

    /**
     * Set Package billing cycle end time (RFC3339)
     * @param CycleEndTime Package billing cycle end time (RFC3339)
     */
    public void setCycleEndTime(String CycleEndTime) {
        this.CycleEndTime = CycleEndTime;
    }

    /**
     * Get Summary list of tokens grouped by billing item 
     * @return BillingItems Summary list of tokens grouped by billing item
     */
    public TokenSummaryBillingItem [] getBillingItems() {
        return this.BillingItems;
    }

    /**
     * Set Summary list of tokens grouped by billing item
     * @param BillingItems Summary list of tokens grouped by billing item
     */
    public void setBillingItems(TokenSummaryBillingItem [] BillingItems) {
        this.BillingItems = BillingItems;
    }

    public TokenSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenSummary(TokenSummary source) {
        if (source.CycleSeq != null) {
            this.CycleSeq = new Long(source.CycleSeq);
        }
        if (source.CycleStartTime != null) {
            this.CycleStartTime = new String(source.CycleStartTime);
        }
        if (source.CycleEndTime != null) {
            this.CycleEndTime = new String(source.CycleEndTime);
        }
        if (source.BillingItems != null) {
            this.BillingItems = new TokenSummaryBillingItem[source.BillingItems.length];
            for (int i = 0; i < source.BillingItems.length; i++) {
                this.BillingItems[i] = new TokenSummaryBillingItem(source.BillingItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CycleSeq", this.CycleSeq);
        this.setParamSimple(map, prefix + "CycleStartTime", this.CycleStartTime);
        this.setParamSimple(map, prefix + "CycleEndTime", this.CycleEndTime);
        this.setParamArrayObj(map, prefix + "BillingItems.", this.BillingItems);

    }
}

