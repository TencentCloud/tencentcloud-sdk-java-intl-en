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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillAdjustInfoRequest extends AbstractModel {

    /**
    * Format: yyyy-MM.
Billing month. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If the TimeFrom and TimeTo are passed, the Month field is invalid.
Example: 2024-10.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Format: yyyy-MM-dd.
Start date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-01.
    */
    @SerializedName("TimeFrom")
    @Expose
    private String TimeFrom;

    /**
    * Format: yyyy-MM-dd.
End date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-02.
    */
    @SerializedName("TimeTo")
    @Expose
    private String TimeTo;

    /**
     * Get Format: yyyy-MM.
Billing month. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If the TimeFrom and TimeTo are passed, the Month field is invalid.
Example: 2024-10. 
     * @return Month Format: yyyy-MM.
Billing month. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If the TimeFrom and TimeTo are passed, the Month field is invalid.
Example: 2024-10.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Format: yyyy-MM.
Billing month. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If the TimeFrom and TimeTo are passed, the Month field is invalid.
Example: 2024-10.
     * @param Month Format: yyyy-MM.
Billing month. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If the TimeFrom and TimeTo are passed, the Month field is invalid.
Example: 2024-10.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Format: yyyy-MM-dd.
Start date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-01. 
     * @return TimeFrom Format: yyyy-MM-dd.
Start date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-01.
     */
    public String getTimeFrom() {
        return this.TimeFrom;
    }

    /**
     * Set Format: yyyy-MM-dd.
Start date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-01.
     * @param TimeFrom Format: yyyy-MM-dd.
Start date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-01.
     */
    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    /**
     * Get Format: yyyy-MM-dd.
End date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-02. 
     * @return TimeTo Format: yyyy-MM-dd.
End date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-02.
     */
    public String getTimeTo() {
        return this.TimeTo;
    }

    /**
     * Set Format: yyyy-MM-dd.
End date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-02.
     * @param TimeTo Format: yyyy-MM-dd.
End date. Either Month or the combination of TimeFrom and TimeTo needs to be passed. If TimeFrom and TimeTo are passed, the Month field is invalid. TimeFrom and TimeTo should represent the same month and be passed in together. Cross-month queries are not supported. The result will include the full month's data.
Example: 2024-10-02.
     */
    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }

    public DescribeBillAdjustInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillAdjustInfoRequest(DescribeBillAdjustInfoRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TimeFrom != null) {
            this.TimeFrom = new String(source.TimeFrom);
        }
        if (source.TimeTo != null) {
            this.TimeTo = new String(source.TimeTo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "TimeFrom", this.TimeFrom);
        this.setParamSimple(map, prefix + "TimeTo", this.TimeTo);

    }
}

