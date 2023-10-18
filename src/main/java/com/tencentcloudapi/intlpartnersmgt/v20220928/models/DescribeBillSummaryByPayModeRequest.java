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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryByPayModeRequest extends AbstractModel {

    /**
    * Bill month in the format of "yyyy-MM"
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * Customer UIN
    */
    @SerializedName("CustomerUin")
    @Expose
    private Long CustomerUin;

    /**
     * Get Bill month in the format of "yyyy-MM" 
     * @return BillMonth Bill month in the format of "yyyy-MM"
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set Bill month in the format of "yyyy-MM"
     * @param BillMonth Bill month in the format of "yyyy-MM"
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    /**
     * Get Customer UIN 
     * @return CustomerUin Customer UIN
     */
    public Long getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set Customer UIN
     * @param CustomerUin Customer UIN
     */
    public void setCustomerUin(Long CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    public DescribeBillSummaryByPayModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryByPayModeRequest(DescribeBillSummaryByPayModeRequest source) {
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
        if (source.CustomerUin != null) {
            this.CustomerUin = new Long(source.CustomerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);

    }
}

