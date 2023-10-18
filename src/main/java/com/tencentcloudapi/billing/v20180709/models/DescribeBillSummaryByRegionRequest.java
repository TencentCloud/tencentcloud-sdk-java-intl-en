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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryByRegionRequest extends AbstractModel {

    /**
    * The value must be of the same month as `EndTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The value must be of the same month as `BeginTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Queries bill data user's UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
     * Get The value must be of the same month as `EndTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018. 
     * @return BeginTime The value must be of the same month as `EndTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The value must be of the same month as `EndTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018.
     * @param BeginTime The value must be of the same month as `EndTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The value must be of the same month as `BeginTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018. 
     * @return EndTime The value must be of the same month as `BeginTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The value must be of the same month as `BeginTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018.
     * @param EndTime The value must be of the same month as `BeginTime`. Query period must start and end on the same month and the query result returned will be of the entire month. For example, if both `BeginTime` and `EndTime` are `2018-09`, the data returned will be for the entire month of September 2018.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Queries bill data user's UIN 
     * @return PayerUin Queries bill data user's UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Queries bill data user's UIN
     * @param PayerUin Queries bill data user's UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    public DescribeBillSummaryByRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryByRegionRequest(DescribeBillSummaryByRegionRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);

    }
}

