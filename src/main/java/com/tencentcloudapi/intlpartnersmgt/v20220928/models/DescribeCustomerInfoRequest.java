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

public class DescribeCustomerInfoRequest extends AbstractModel {

    /**
    * List of customer UIN. Array length value: 1-20.
    */
    @SerializedName("CustomerUin")
    @Expose
    private Long [] CustomerUin;

    /**
     * Get List of customer UIN. Array length value: 1-20. 
     * @return CustomerUin List of customer UIN. Array length value: 1-20.
     */
    public Long [] getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set List of customer UIN. Array length value: 1-20.
     * @param CustomerUin List of customer UIN. Array length value: 1-20.
     */
    public void setCustomerUin(Long [] CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    public DescribeCustomerInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerInfoRequest(DescribeCustomerInfoRequest source) {
        if (source.CustomerUin != null) {
            this.CustomerUin = new Long[source.CustomerUin.length];
            for (int i = 0; i < source.CustomerUin.length; i++) {
                this.CustomerUin[i] = new Long(source.CustomerUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CustomerUin.", this.CustomerUin);

    }
}

