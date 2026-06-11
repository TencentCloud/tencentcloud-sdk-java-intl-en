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

public class ScaleOutInstancesRequest extends AbstractModel {

    /**
    * Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Specifies the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://www.tencentcloud.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Number of resource instances to scale out. the static value range of this parameter is [1,2000]. this parameter must not be larger than the difference between the expected number and the maximum value. for example, if the expected number of the scaling group is 20 and the maximum value is 100, the valid values are [1,80].
    */
    @SerializedName("ScaleOutNumber")
    @Expose
    private Long ScaleOutNumber;

    /**
     * Get Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Specifies the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://www.tencentcloud.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>. 
     * @return AutoScalingGroupId Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Specifies the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://www.tencentcloud.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Specifies the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://www.tencentcloud.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
     * @param AutoScalingGroupId Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Specifies the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Obtain the scaling group ID by calling the api [DescribeAutoScalingGroups](https://www.tencentcloud.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the returned information.</li>.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Number of resource instances to scale out. the static value range of this parameter is [1,2000]. this parameter must not be larger than the difference between the expected number and the maximum value. for example, if the expected number of the scaling group is 20 and the maximum value is 100, the valid values are [1,80]. 
     * @return ScaleOutNumber Number of resource instances to scale out. the static value range of this parameter is [1,2000]. this parameter must not be larger than the difference between the expected number and the maximum value. for example, if the expected number of the scaling group is 20 and the maximum value is 100, the valid values are [1,80].
     */
    public Long getScaleOutNumber() {
        return this.ScaleOutNumber;
    }

    /**
     * Set Number of resource instances to scale out. the static value range of this parameter is [1,2000]. this parameter must not be larger than the difference between the expected number and the maximum value. for example, if the expected number of the scaling group is 20 and the maximum value is 100, the valid values are [1,80].
     * @param ScaleOutNumber Number of resource instances to scale out. the static value range of this parameter is [1,2000]. this parameter must not be larger than the difference between the expected number and the maximum value. for example, if the expected number of the scaling group is 20 and the maximum value is 100, the valid values are [1,80].
     */
    public void setScaleOutNumber(Long ScaleOutNumber) {
        this.ScaleOutNumber = ScaleOutNumber;
    }

    public ScaleOutInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutInstancesRequest(ScaleOutInstancesRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.ScaleOutNumber != null) {
            this.ScaleOutNumber = new Long(source.ScaleOutNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ScaleOutNumber", this.ScaleOutNumber);

    }
}

