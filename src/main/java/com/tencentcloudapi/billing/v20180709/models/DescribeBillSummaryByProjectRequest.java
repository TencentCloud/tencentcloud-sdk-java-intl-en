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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryByProjectRequest extends AbstractModel{

    /**
    * Queries bill data user’s UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Only beginning in the current month is supported, and it must be the same month as the EndTime. For example, 2018-09-01 00:00:00.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Only ending in the current month is supported, and it must be the same month as the BeginTime. For example, 2018-09-30 23:59:59.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Queries bill data user’s UIN 
     * @return PayerUin Queries bill data user’s UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Queries bill data user’s UIN
     * @param PayerUin Queries bill data user’s UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get Only beginning in the current month is supported, and it must be the same month as the EndTime. For example, 2018-09-01 00:00:00. 
     * @return BeginTime Only beginning in the current month is supported, and it must be the same month as the EndTime. For example, 2018-09-01 00:00:00.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Only beginning in the current month is supported, and it must be the same month as the EndTime. For example, 2018-09-01 00:00:00.
     * @param BeginTime Only beginning in the current month is supported, and it must be the same month as the EndTime. For example, 2018-09-01 00:00:00.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Only ending in the current month is supported, and it must be the same month as the BeginTime. For example, 2018-09-30 23:59:59. 
     * @return EndTime Only ending in the current month is supported, and it must be the same month as the BeginTime. For example, 2018-09-30 23:59:59.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Only ending in the current month is supported, and it must be the same month as the BeginTime. For example, 2018-09-30 23:59:59.
     * @param EndTime Only ending in the current month is supported, and it must be the same month as the BeginTime. For example, 2018-09-30 23:59:59.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

