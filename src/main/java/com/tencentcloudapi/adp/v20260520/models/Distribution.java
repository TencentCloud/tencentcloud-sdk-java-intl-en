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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Distribution extends AbstractModel {

    /**
    * <p>Count of calls for this reply method</p>
    */
    @SerializedName("CallCount")
    @Expose
    private String CallCount;

    /**
    * <p>Percentage of this reply method in the total number of calls (percentage, 0–100, rounded to two decimal places; all 0 when no data is available, and the sum of all items is 100 when there is data)</p>
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
    * <p>Reply method name (internationalized according to the request language; falls back to the Enumeration Name of reply_method when i18n is missing)</p>
    */
    @SerializedName("ReplyName")
    @Expose
    private String ReplyName;

    /**
     * Get <p>Count of calls for this reply method</p> 
     * @return CallCount <p>Count of calls for this reply method</p>
     */
    public String getCallCount() {
        return this.CallCount;
    }

    /**
     * Set <p>Count of calls for this reply method</p>
     * @param CallCount <p>Count of calls for this reply method</p>
     */
    public void setCallCount(String CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get <p>Percentage of this reply method in the total number of calls (percentage, 0–100, rounded to two decimal places; all 0 when no data is available, and the sum of all items is 100 when there is data)</p> 
     * @return Percentage <p>Percentage of this reply method in the total number of calls (percentage, 0–100, rounded to two decimal places; all 0 when no data is available, and the sum of all items is 100 when there is data)</p>
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * Set <p>Percentage of this reply method in the total number of calls (percentage, 0–100, rounded to two decimal places; all 0 when no data is available, and the sum of all items is 100 when there is data)</p>
     * @param Percentage <p>Percentage of this reply method in the total number of calls (percentage, 0–100, rounded to two decimal places; all 0 when no data is available, and the sum of all items is 100 when there is data)</p>
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get <p>Reply method name (internationalized according to the request language; falls back to the Enumeration Name of reply_method when i18n is missing)</p> 
     * @return ReplyName <p>Reply method name (internationalized according to the request language; falls back to the Enumeration Name of reply_method when i18n is missing)</p>
     */
    public String getReplyName() {
        return this.ReplyName;
    }

    /**
     * Set <p>Reply method name (internationalized according to the request language; falls back to the Enumeration Name of reply_method when i18n is missing)</p>
     * @param ReplyName <p>Reply method name (internationalized according to the request language; falls back to the Enumeration Name of reply_method when i18n is missing)</p>
     */
    public void setReplyName(String ReplyName) {
        this.ReplyName = ReplyName;
    }

    public Distribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Distribution(Distribution source) {
        if (source.CallCount != null) {
            this.CallCount = new String(source.CallCount);
        }
        if (source.Percentage != null) {
            this.Percentage = new Float(source.Percentage);
        }
        if (source.ReplyName != null) {
            this.ReplyName = new String(source.ReplyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "ReplyName", this.ReplyName);

    }
}

