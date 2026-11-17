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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMHourBillTrendItem extends AbstractModel {

    /**
    * Hour. Valid values: 00 to 23.
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * Total bill amount for the hour (in CNY, net cost)
    */
    @SerializedName("Fee")
    @Expose
    private String Fee;

    /**
     * Get Hour. Valid values: 00 to 23. 
     * @return Hour Hour. Valid values: 00 to 23.
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set Hour. Valid values: 00 to 23.
     * @param Hour Hour. Valid values: 00 to 23.
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Total bill amount for the hour (in CNY, net cost) 
     * @return Fee Total bill amount for the hour (in CNY, net cost)
     */
    public String getFee() {
        return this.Fee;
    }

    /**
     * Set Total bill amount for the hour (in CNY, net cost)
     * @param Fee Total bill amount for the hour (in CNY, net cost)
     */
    public void setFee(String Fee) {
        this.Fee = Fee;
    }

    public LLMHourBillTrendItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMHourBillTrendItem(LLMHourBillTrendItem source) {
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.Fee != null) {
            this.Fee = new String(source.Fee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "Fee", this.Fee);

    }
}

