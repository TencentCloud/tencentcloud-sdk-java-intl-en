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

public class UsagePlanEnvironmentStatus extends AbstractModel {

    /**
    * Number of environments of the service bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Environment status of services bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentList")
    @Expose
    private UsagePlanEnvironment [] EnvironmentList;

    /**
     * Get Number of environments of the service bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of environments of the service bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of environments of the service bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of environments of the service bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Environment status of services bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentList Environment status of services bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public UsagePlanEnvironment [] getEnvironmentList() {
        return this.EnvironmentList;
    }

    /**
     * Set Environment status of services bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentList Environment status of services bound to usage plan.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentList(UsagePlanEnvironment [] EnvironmentList) {
        this.EnvironmentList = EnvironmentList;
    }

    public UsagePlanEnvironmentStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanEnvironmentStatus(UsagePlanEnvironmentStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.EnvironmentList != null) {
            this.EnvironmentList = new UsagePlanEnvironment[source.EnvironmentList.length];
            for (int i = 0; i < source.EnvironmentList.length; i++) {
                this.EnvironmentList[i] = new UsagePlanEnvironment(source.EnvironmentList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "EnvironmentList.", this.EnvironmentList);

    }
}

