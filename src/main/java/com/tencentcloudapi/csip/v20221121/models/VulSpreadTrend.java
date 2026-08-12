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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulSpreadTrend extends AbstractModel {

    /**
    * <p>Date<br>Parameter format: YYYY-MM-DD</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>Propagation trend numeric value of the date</p>
    */
    @SerializedName("Trend")
    @Expose
    private Float Trend;

    /**
     * Get <p>Date<br>Parameter format: YYYY-MM-DD</p> 
     * @return Date <p>Date<br>Parameter format: YYYY-MM-DD</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>Date<br>Parameter format: YYYY-MM-DD</p>
     * @param Date <p>Date<br>Parameter format: YYYY-MM-DD</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>Propagation trend numeric value of the date</p> 
     * @return Trend <p>Propagation trend numeric value of the date</p>
     */
    public Float getTrend() {
        return this.Trend;
    }

    /**
     * Set <p>Propagation trend numeric value of the date</p>
     * @param Trend <p>Propagation trend numeric value of the date</p>
     */
    public void setTrend(Float Trend) {
        this.Trend = Trend;
    }

    public VulSpreadTrend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulSpreadTrend(VulSpreadTrend source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Trend != null) {
            this.Trend = new Float(source.Trend);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Trend", this.Trend);

    }
}

