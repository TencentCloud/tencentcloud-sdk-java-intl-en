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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntlDomainPriceNewListRequest extends AbstractModel {

    /**
    * The list of domain suffixes for which you want to query prices. This parameter defaults to all suffixes.
    */
    @SerializedName("TldList")
    @Expose
    private String [] TldList;

    /**
    * The purchase year of the domains for which you want to query prices. This parameter defaults to all years.
    */
    @SerializedName("Year")
    @Expose
    private Long [] Year;

    /**
    * The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in).
    */
    @SerializedName("Operation")
    @Expose
    private String [] Operation;

    /**
     * Get The list of domain suffixes for which you want to query prices. This parameter defaults to all suffixes. 
     * @return TldList The list of domain suffixes for which you want to query prices. This parameter defaults to all suffixes.
     */
    public String [] getTldList() {
        return this.TldList;
    }

    /**
     * Set The list of domain suffixes for which you want to query prices. This parameter defaults to all suffixes.
     * @param TldList The list of domain suffixes for which you want to query prices. This parameter defaults to all suffixes.
     */
    public void setTldList(String [] TldList) {
        this.TldList = TldList;
    }

    /**
     * Get The purchase year of the domains for which you want to query prices. This parameter defaults to all years. 
     * @return Year The purchase year of the domains for which you want to query prices. This parameter defaults to all years.
     */
    public Long [] getYear() {
        return this.Year;
    }

    /**
     * Set The purchase year of the domains for which you want to query prices. This parameter defaults to all years.
     * @param Year The purchase year of the domains for which you want to query prices. This parameter defaults to all years.
     */
    public void setYear(Long [] Year) {
        this.Year = Year;
    }

    /**
     * Get The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in). 
     * @return Operation The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in).
     */
    public String [] getOperation() {
        return this.Operation;
    }

    /**
     * Set The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in).
     * @param Operation The domain purchase type. Valid values: `new`, `renew`, `redem` (redeem), `tran` (transfer in).
     */
    public void setOperation(String [] Operation) {
        this.Operation = Operation;
    }

    public DescribeIntlDomainPriceNewListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntlDomainPriceNewListRequest(DescribeIntlDomainPriceNewListRequest source) {
        if (source.TldList != null) {
            this.TldList = new String[source.TldList.length];
            for (int i = 0; i < source.TldList.length; i++) {
                this.TldList[i] = new String(source.TldList[i]);
            }
        }
        if (source.Year != null) {
            this.Year = new Long[source.Year.length];
            for (int i = 0; i < source.Year.length; i++) {
                this.Year[i] = new Long(source.Year[i]);
            }
        }
        if (source.Operation != null) {
            this.Operation = new String[source.Operation.length];
            for (int i = 0; i < source.Operation.length; i++) {
                this.Operation[i] = new String(source.Operation[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TldList.", this.TldList);
        this.setParamArraySimple(map, prefix + "Year.", this.Year);
        this.setParamArraySimple(map, prefix + "Operation.", this.Operation);

    }
}

