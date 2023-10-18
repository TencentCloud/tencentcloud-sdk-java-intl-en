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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancerTrafficRequest extends AbstractModel {

    /**
    * CLB instance region. If this parameter is not passed in, CLB instances in all regions will be returned.
    */
    @SerializedName("LoadBalancerRegion")
    @Expose
    private String LoadBalancerRegion;

    /**
     * Get CLB instance region. If this parameter is not passed in, CLB instances in all regions will be returned. 
     * @return LoadBalancerRegion CLB instance region. If this parameter is not passed in, CLB instances in all regions will be returned.
     */
    public String getLoadBalancerRegion() {
        return this.LoadBalancerRegion;
    }

    /**
     * Set CLB instance region. If this parameter is not passed in, CLB instances in all regions will be returned.
     * @param LoadBalancerRegion CLB instance region. If this parameter is not passed in, CLB instances in all regions will be returned.
     */
    public void setLoadBalancerRegion(String LoadBalancerRegion) {
        this.LoadBalancerRegion = LoadBalancerRegion;
    }

    public DescribeLoadBalancerTrafficRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancerTrafficRequest(DescribeLoadBalancerTrafficRequest source) {
        if (source.LoadBalancerRegion != null) {
            this.LoadBalancerRegion = new String(source.LoadBalancerRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerRegion", this.LoadBalancerRegion);

    }
}

