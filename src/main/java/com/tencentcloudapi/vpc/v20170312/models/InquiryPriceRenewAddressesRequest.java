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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewAddressesRequest extends AbstractModel {

    /**
    * Indicates the renewal resource instance ID.
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH", this parameter is required. For other scenarios, it can be ignored.
    */
    @SerializedName("AddressChargePrepaid")
    @Expose
    private AddressChargePrepaid AddressChargePrepaid;

    /**
     * Get Indicates the renewal resource instance ID. 
     * @return AddressIds Indicates the renewal resource instance ID.
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set Indicates the renewal resource instance ID.
     * @param AddressIds Indicates the renewal resource instance ID.
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH", this parameter is required. For other scenarios, it can be ignored. 
     * @return AddressChargePrepaid A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH", this parameter is required. For other scenarios, it can be ignored.
     */
    public AddressChargePrepaid getAddressChargePrepaid() {
        return this.AddressChargePrepaid;
    }

    /**
     * Set A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH", this parameter is required. For other scenarios, it can be ignored.
     * @param AddressChargePrepaid A required billing parameter for an EIP billed by "BANDWIDTH_PREPAID_BY_MONTH". When the EIP is billed by "BANDWIDTH_PREPAID_BY_MONTH", this parameter is required. For other scenarios, it can be ignored.
     */
    public void setAddressChargePrepaid(AddressChargePrepaid AddressChargePrepaid) {
        this.AddressChargePrepaid = AddressChargePrepaid;
    }

    public InquiryPriceRenewAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewAddressesRequest(InquiryPriceRenewAddressesRequest source) {
        if (source.AddressIds != null) {
            this.AddressIds = new String[source.AddressIds.length];
            for (int i = 0; i < source.AddressIds.length; i++) {
                this.AddressIds[i] = new String(source.AddressIds[i]);
            }
        }
        if (source.AddressChargePrepaid != null) {
            this.AddressChargePrepaid = new AddressChargePrepaid(source.AddressChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamObj(map, prefix + "AddressChargePrepaid.", this.AddressChargePrepaid);

    }
}

