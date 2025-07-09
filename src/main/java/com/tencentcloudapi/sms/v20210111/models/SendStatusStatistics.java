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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendStatusStatistics extends AbstractModel {

    /**
    * Billable SMS message quantity; for example, in 100 successfully submitted SMS messages, if 20 ones are long messages (over 80 characters) and split into two messages each, then the billable quantity will be 80 * 1 + 20 * 2 = 120.
    */
    @SerializedName("FeeCount")
    @Expose
    private Long FeeCount;

    /**
    * Submitted SMS messages.
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * Successfully submitted SMS messages.
    */
    @SerializedName("RequestSuccessCount")
    @Expose
    private Long RequestSuccessCount;

    /**
     * Get Billable SMS message quantity; for example, in 100 successfully submitted SMS messages, if 20 ones are long messages (over 80 characters) and split into two messages each, then the billable quantity will be 80 * 1 + 20 * 2 = 120. 
     * @return FeeCount Billable SMS message quantity; for example, in 100 successfully submitted SMS messages, if 20 ones are long messages (over 80 characters) and split into two messages each, then the billable quantity will be 80 * 1 + 20 * 2 = 120.
     */
    public Long getFeeCount() {
        return this.FeeCount;
    }

    /**
     * Set Billable SMS message quantity; for example, in 100 successfully submitted SMS messages, if 20 ones are long messages (over 80 characters) and split into two messages each, then the billable quantity will be 80 * 1 + 20 * 2 = 120.
     * @param FeeCount Billable SMS message quantity; for example, in 100 successfully submitted SMS messages, if 20 ones are long messages (over 80 characters) and split into two messages each, then the billable quantity will be 80 * 1 + 20 * 2 = 120.
     */
    public void setFeeCount(Long FeeCount) {
        this.FeeCount = FeeCount;
    }

    /**
     * Get Submitted SMS messages. 
     * @return RequestCount Submitted SMS messages.
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set Submitted SMS messages.
     * @param RequestCount Submitted SMS messages.
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get Successfully submitted SMS messages. 
     * @return RequestSuccessCount Successfully submitted SMS messages.
     */
    public Long getRequestSuccessCount() {
        return this.RequestSuccessCount;
    }

    /**
     * Set Successfully submitted SMS messages.
     * @param RequestSuccessCount Successfully submitted SMS messages.
     */
    public void setRequestSuccessCount(Long RequestSuccessCount) {
        this.RequestSuccessCount = RequestSuccessCount;
    }

    public SendStatusStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendStatusStatistics(SendStatusStatistics source) {
        if (source.FeeCount != null) {
            this.FeeCount = new Long(source.FeeCount);
        }
        if (source.RequestCount != null) {
            this.RequestCount = new Long(source.RequestCount);
        }
        if (source.RequestSuccessCount != null) {
            this.RequestSuccessCount = new Long(source.RequestSuccessCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FeeCount", this.FeeCount);
        this.setParamSimple(map, prefix + "RequestCount", this.RequestCount);
        this.setParamSimple(map, prefix + "RequestSuccessCount", this.RequestSuccessCount);

    }
}

