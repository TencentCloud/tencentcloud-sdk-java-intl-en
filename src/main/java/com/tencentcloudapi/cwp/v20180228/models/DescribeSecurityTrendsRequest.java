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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityTrendsRequest extends AbstractModel {

    /**
    * Start time. Example: 2021-07-10
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * End time. Example: 2021-07-10
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get Start time. Example: 2021-07-10 
     * @return BeginDate Start time. Example: 2021-07-10
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set Start time. Example: 2021-07-10
     * @param BeginDate Start time. Example: 2021-07-10
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get End time. Example: 2021-07-10 
     * @return EndDate End time. Example: 2021-07-10
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End time. Example: 2021-07-10
     * @param EndDate End time. Example: 2021-07-10
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public DescribeSecurityTrendsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityTrendsRequest(DescribeSecurityTrendsRequest source) {
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}

