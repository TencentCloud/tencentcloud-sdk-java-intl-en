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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubAccountsRequest extends AbstractModel{

    /**
    * List of sub-user UINs. Up to 50 UINs are supported.
    */
    @SerializedName("FilterSubAccountUin")
    @Expose
    private Long [] FilterSubAccountUin;

    /**
     * Get List of sub-user UINs. Up to 50 UINs are supported. 
     * @return FilterSubAccountUin List of sub-user UINs. Up to 50 UINs are supported.
     */
    public Long [] getFilterSubAccountUin() {
        return this.FilterSubAccountUin;
    }

    /**
     * Set List of sub-user UINs. Up to 50 UINs are supported.
     * @param FilterSubAccountUin List of sub-user UINs. Up to 50 UINs are supported.
     */
    public void setFilterSubAccountUin(Long [] FilterSubAccountUin) {
        this.FilterSubAccountUin = FilterSubAccountUin;
    }

    public DescribeSubAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubAccountsRequest(DescribeSubAccountsRequest source) {
        if (source.FilterSubAccountUin != null) {
            this.FilterSubAccountUin = new Long[source.FilterSubAccountUin.length];
            for (int i = 0; i < source.FilterSubAccountUin.length; i++) {
                this.FilterSubAccountUin[i] = new Long(source.FilterSubAccountUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FilterSubAccountUin.", this.FilterSubAccountUin);

    }
}

