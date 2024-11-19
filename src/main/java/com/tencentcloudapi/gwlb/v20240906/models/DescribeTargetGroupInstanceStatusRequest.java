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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupInstanceStatusRequest extends AbstractModel {

    /**
    * Unique target group ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * List of backend service IPs bound to the target group
    */
    @SerializedName("TargetGroupInstanceIps")
    @Expose
    private String [] TargetGroupInstanceIps;

    /**
     * Get Unique target group ID 
     * @return TargetGroupId Unique target group ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Unique target group ID
     * @param TargetGroupId Unique target group ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get List of backend service IPs bound to the target group 
     * @return TargetGroupInstanceIps List of backend service IPs bound to the target group
     */
    public String [] getTargetGroupInstanceIps() {
        return this.TargetGroupInstanceIps;
    }

    /**
     * Set List of backend service IPs bound to the target group
     * @param TargetGroupInstanceIps List of backend service IPs bound to the target group
     */
    public void setTargetGroupInstanceIps(String [] TargetGroupInstanceIps) {
        this.TargetGroupInstanceIps = TargetGroupInstanceIps;
    }

    public DescribeTargetGroupInstanceStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupInstanceStatusRequest(DescribeTargetGroupInstanceStatusRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupInstanceIps != null) {
            this.TargetGroupInstanceIps = new String[source.TargetGroupInstanceIps.length];
            for (int i = 0; i < source.TargetGroupInstanceIps.length; i++) {
                this.TargetGroupInstanceIps[i] = new String(source.TargetGroupInstanceIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamArraySimple(map, prefix + "TargetGroupInstanceIps.", this.TargetGroupInstanceIps);

    }
}

