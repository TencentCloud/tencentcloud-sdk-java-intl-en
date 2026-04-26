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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillPayMode extends AbstractModel {

    /**
    * Billing mode code
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go.
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
     * Get Billing mode code 
     * @return PayMode Billing mode code
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode code
     * @param PayMode Billing mode code
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go. 
     * @return PayModeName Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go.
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go.
     * @param PayModeName Billing mode: Resource billing mode, which can be monthly subscription or pay-as-you-go.
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    public BillPayMode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillPayMode(BillPayMode source) {
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);

    }
}

