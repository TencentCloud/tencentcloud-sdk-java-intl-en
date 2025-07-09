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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsagePlansStatus extends AbstractModel {

    /**
    * Number of eligible usage plans.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Usage plan list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsagePlanStatusSet")
    @Expose
    private UsagePlanStatusInfo [] UsagePlanStatusSet;

    /**
     * Get Number of eligible usage plans.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of eligible usage plans.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible usage plans.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of eligible usage plans.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Usage plan list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UsagePlanStatusSet Usage plan list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UsagePlanStatusInfo [] getUsagePlanStatusSet() {
        return this.UsagePlanStatusSet;
    }

    /**
     * Set Usage plan list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UsagePlanStatusSet Usage plan list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsagePlanStatusSet(UsagePlanStatusInfo [] UsagePlanStatusSet) {
        this.UsagePlanStatusSet = UsagePlanStatusSet;
    }

    public UsagePlansStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlansStatus(UsagePlansStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.UsagePlanStatusSet != null) {
            this.UsagePlanStatusSet = new UsagePlanStatusInfo[source.UsagePlanStatusSet.length];
            for (int i = 0; i < source.UsagePlanStatusSet.length; i++) {
                this.UsagePlanStatusSet[i] = new UsagePlanStatusInfo(source.UsagePlanStatusSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "UsagePlanStatusSet.", this.UsagePlanStatusSet);

    }
}

