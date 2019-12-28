/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLaunchConfigurationsResponse extends AbstractModel{

    /**
    * Number of eligible launch configurations.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of launch configuration details.
    */
    @SerializedName("LaunchConfigurationSet")
    @Expose
    private LaunchConfiguration [] LaunchConfigurationSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible launch configurations. 
     * @return TotalCount Number of eligible launch configurations.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible launch configurations.
     * @param TotalCount Number of eligible launch configurations.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of launch configuration details. 
     * @return LaunchConfigurationSet List of launch configuration details.
     */
    public LaunchConfiguration [] getLaunchConfigurationSet() {
        return this.LaunchConfigurationSet;
    }

    /**
     * Set List of launch configuration details.
     * @param LaunchConfigurationSet List of launch configuration details.
     */
    public void setLaunchConfigurationSet(LaunchConfiguration [] LaunchConfigurationSet) {
        this.LaunchConfigurationSet = LaunchConfigurationSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "LaunchConfigurationSet.", this.LaunchConfigurationSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

