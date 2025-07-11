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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLaunchConfigurationsResponse extends AbstractModel {

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
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
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
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLaunchConfigurationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLaunchConfigurationsResponse(DescribeLaunchConfigurationsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.LaunchConfigurationSet != null) {
            this.LaunchConfigurationSet = new LaunchConfiguration[source.LaunchConfigurationSet.length];
            for (int i = 0; i < source.LaunchConfigurationSet.length; i++) {
                this.LaunchConfigurationSet[i] = new LaunchConfiguration(source.LaunchConfigurationSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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

