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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewTokenPlanTeamOrderRequest extends AbstractModel {

    /**
    * Package ID, which can be obtained through the DescribeTokenPlanList API.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Renewal duration. Unit: month. Must be greater than 0.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
     * Get Package ID, which can be obtained through the DescribeTokenPlanList API. 
     * @return TeamId Package ID, which can be obtained through the DescribeTokenPlanList API.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Package ID, which can be obtained through the DescribeTokenPlanList API.
     * @param TeamId Package ID, which can be obtained through the DescribeTokenPlanList API.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Renewal duration. Unit: month. Must be greater than 0. 
     * @return TimeSpan Renewal duration. Unit: month. Must be greater than 0.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Renewal duration. Unit: month. Must be greater than 0.
     * @param TimeSpan Renewal duration. Unit: month. Must be greater than 0.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    public RenewTokenPlanTeamOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewTokenPlanTeamOrderRequest(RenewTokenPlanTeamOrderRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}

