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

public class DescribeMandatoryVulSetRequest extends AbstractModel {

    /**
    * Year of vulnerability disclosure
    */
    @SerializedName("Year")
    @Expose
    private Long Year;

    /**
    * Vulnerability disclosure month
    */
    @SerializedName("Month")
    @Expose
    private Long Month;

    /**
     * Get Year of vulnerability disclosure 
     * @return Year Year of vulnerability disclosure
     */
    public Long getYear() {
        return this.Year;
    }

    /**
     * Set Year of vulnerability disclosure
     * @param Year Year of vulnerability disclosure
     */
    public void setYear(Long Year) {
        this.Year = Year;
    }

    /**
     * Get Vulnerability disclosure month 
     * @return Month Vulnerability disclosure month
     */
    public Long getMonth() {
        return this.Month;
    }

    /**
     * Set Vulnerability disclosure month
     * @param Month Vulnerability disclosure month
     */
    public void setMonth(Long Month) {
        this.Month = Month;
    }

    public DescribeMandatoryVulSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMandatoryVulSetRequest(DescribeMandatoryVulSetRequest source) {
        if (source.Year != null) {
            this.Year = new Long(source.Year);
        }
        if (source.Month != null) {
            this.Month = new Long(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Year", this.Year);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

