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

public class DescribeBillSummaryByTagRequest extends AbstractModel{

    /**
    * Payer UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Currently the period to be queried must start from a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-01 00:00:00.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Currently the period to be queried must end at a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-30 23:59:59.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Cost allocation tag key
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
     * Get Payer UIN 
     * @return PayerUin Payer UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer UIN
     * @param PayerUin Payer UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get Currently the period to be queried must start from a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-01 00:00:00. 
     * @return BeginTime Currently the period to be queried must start from a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-01 00:00:00.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Currently the period to be queried must start from a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-01 00:00:00.
     * @param BeginTime Currently the period to be queried must start from a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-01 00:00:00.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Currently the period to be queried must end at a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-30 23:59:59. 
     * @return EndTime Currently the period to be queried must end at a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-30 23:59:59.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Currently the period to be queried must end at a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-30 23:59:59.
     * @param EndTime Currently the period to be queried must end at a time point in the current month, and the starting time and the end time must be in the same month. Example: 2018-09-30 23:59:59.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Cost allocation tag key 
     * @return TagKey Cost allocation tag key
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Cost allocation tag key
     * @param TagKey Cost allocation tag key
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);

    }
}

