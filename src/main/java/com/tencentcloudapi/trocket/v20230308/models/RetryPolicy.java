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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryPolicy extends AbstractModel {

    /**
    * Retry policy type. The enumeration values are as follows:

-EXPONENTIAL: Fixed interval
-CUSTOMIZED: Tier backoff
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Fixed retry interval. This parameter takes effect when a fixed interval-based retry policy is configured.
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
     * Get Retry policy type. The enumeration values are as follows:

-EXPONENTIAL: Fixed interval
-CUSTOMIZED: Tier backoff 
     * @return PolicyType Retry policy type. The enumeration values are as follows:

-EXPONENTIAL: Fixed interval
-CUSTOMIZED: Tier backoff
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Retry policy type. The enumeration values are as follows:

-EXPONENTIAL: Fixed interval
-CUSTOMIZED: Tier backoff
     * @param PolicyType Retry policy type. The enumeration values are as follows:

-EXPONENTIAL: Fixed interval
-CUSTOMIZED: Tier backoff
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Fixed retry interval. This parameter takes effect when a fixed interval-based retry policy is configured. 
     * @return RetryInterval Fixed retry interval. This parameter takes effect when a fixed interval-based retry policy is configured.
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set Fixed retry interval. This parameter takes effect when a fixed interval-based retry policy is configured.
     * @param RetryInterval Fixed retry interval. This parameter takes effect when a fixed interval-based retry policy is configured.
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    public RetryPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryPolicy(RetryPolicy source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);

    }
}

