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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeriodItemDetail extends AbstractModel {

    /**
    * <p>Date</p>
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * <p>Fee</p>
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
     * Get <p>Date</p> 
     * @return Period <p>Date</p>
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Date</p>
     * @param Period <p>Date</p>
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Fee</p> 
     * @return Cost <p>Fee</p>
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set <p>Fee</p>
     * @param Cost <p>Fee</p>
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    public PeriodItemDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeriodItemDetail(PeriodItemDetail source) {
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.Cost != null) {
            this.Cost = new String(source.Cost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Cost", this.Cost);

    }
}

