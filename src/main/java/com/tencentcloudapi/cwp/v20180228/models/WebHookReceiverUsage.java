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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebHookReceiverUsage extends AbstractModel {

    /**
    * Recipient ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * Recipient name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverName")
    @Expose
    private String ReceiverName;

    /**
    * Policy name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
     * Get Recipient ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReceiverId Recipient ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set Recipient ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReceiverId Recipient ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get Recipient name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReceiverName Recipient name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReceiverName() {
        return this.ReceiverName;
    }

    /**
     * Set Recipient name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReceiverName Recipient name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceiverName(String ReceiverName) {
        this.ReceiverName = ReceiverName;
    }

    /**
     * Get Policy name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyName Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyName Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    public WebHookReceiverUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebHookReceiverUsage(WebHookReceiverUsage source) {
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.ReceiverName != null) {
            this.ReceiverName = new String(source.ReceiverName);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "ReceiverName", this.ReceiverName);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);

    }
}

