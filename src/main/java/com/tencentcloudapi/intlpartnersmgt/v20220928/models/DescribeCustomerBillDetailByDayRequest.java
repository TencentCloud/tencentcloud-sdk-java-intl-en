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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerBillDetailByDayRequest extends AbstractModel {

    /**
    * Sub-account UIN.
Such as "10000000001"
    */
    @SerializedName("CustomerUin")
    @Expose
    private Long CustomerUin;

    /**
    * Date.
Such as" 2025-06-25"
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get Sub-account UIN.
Such as "10000000001" 
     * @return CustomerUin Sub-account UIN.
Such as "10000000001"
     */
    public Long getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set Sub-account UIN.
Such as "10000000001"
     * @param CustomerUin Sub-account UIN.
Such as "10000000001"
     */
    public void setCustomerUin(Long CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get Date.
Such as" 2025-06-25" 
     * @return Date Date.
Such as" 2025-06-25"
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date.
Such as" 2025-06-25"
     * @param Date Date.
Such as" 2025-06-25"
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public DescribeCustomerBillDetailByDayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerBillDetailByDayRequest(DescribeCustomerBillDetailByDayRequest source) {
        if (source.CustomerUin != null) {
            this.CustomerUin = new Long(source.CustomerUin);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

