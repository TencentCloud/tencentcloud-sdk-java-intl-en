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

public class DescribeAutoScalingGroupLastActivitiesRequest extends AbstractModel {

    /**
    * Auto scaling group ID list. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving AutoScalingGroupId from the returned information.
    */
    @SerializedName("AutoScalingGroupIds")
    @Expose
    private String [] AutoScalingGroupIds;

    /**
    * Excludes cancelled type activities when querying. Default value is false, which means cancelled type activities are not excluded.
    */
    @SerializedName("ExcludeCancelledActivity")
    @Expose
    private Boolean ExcludeCancelledActivity;

    /**
     * Get Auto scaling group ID list. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving AutoScalingGroupId from the returned information. 
     * @return AutoScalingGroupIds Auto scaling group ID list. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving AutoScalingGroupId from the returned information.
     */
    public String [] getAutoScalingGroupIds() {
        return this.AutoScalingGroupIds;
    }

    /**
     * Set Auto scaling group ID list. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving AutoScalingGroupId from the returned information.
     * @param AutoScalingGroupIds Auto scaling group ID list. obtain the scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api DescribeAutoScalingGroups (https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving AutoScalingGroupId from the returned information.
     */
    public void setAutoScalingGroupIds(String [] AutoScalingGroupIds) {
        this.AutoScalingGroupIds = AutoScalingGroupIds;
    }

    /**
     * Get Excludes cancelled type activities when querying. Default value is false, which means cancelled type activities are not excluded. 
     * @return ExcludeCancelledActivity Excludes cancelled type activities when querying. Default value is false, which means cancelled type activities are not excluded.
     */
    public Boolean getExcludeCancelledActivity() {
        return this.ExcludeCancelledActivity;
    }

    /**
     * Set Excludes cancelled type activities when querying. Default value is false, which means cancelled type activities are not excluded.
     * @param ExcludeCancelledActivity Excludes cancelled type activities when querying. Default value is false, which means cancelled type activities are not excluded.
     */
    public void setExcludeCancelledActivity(Boolean ExcludeCancelledActivity) {
        this.ExcludeCancelledActivity = ExcludeCancelledActivity;
    }

    public DescribeAutoScalingGroupLastActivitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingGroupLastActivitiesRequest(DescribeAutoScalingGroupLastActivitiesRequest source) {
        if (source.AutoScalingGroupIds != null) {
            this.AutoScalingGroupIds = new String[source.AutoScalingGroupIds.length];
            for (int i = 0; i < source.AutoScalingGroupIds.length; i++) {
                this.AutoScalingGroupIds[i] = new String(source.AutoScalingGroupIds[i]);
            }
        }
        if (source.ExcludeCancelledActivity != null) {
            this.ExcludeCancelledActivity = new Boolean(source.ExcludeCancelledActivity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoScalingGroupIds.", this.AutoScalingGroupIds);
        this.setParamSimple(map, prefix + "ExcludeCancelledActivity", this.ExcludeCancelledActivity);

    }
}

