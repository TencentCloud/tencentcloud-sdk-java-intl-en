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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SoftQuotaDayInfo extends AbstractModel {

    /**
    * Deduction time
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * Number of billed cores
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
     * Get Deduction time 
     * @return PayTime Deduction time
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set Deduction time
     * @param PayTime Deduction time
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get Number of billed cores 
     * @return CoresCnt Number of billed cores
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set Number of billed cores
     * @param CoresCnt Number of billed cores
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    public SoftQuotaDayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SoftQuotaDayInfo(SoftQuotaDayInfo source) {
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);

    }
}

