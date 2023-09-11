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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbInstanceDetail extends AbstractModel{

    /**
    * The CLB instance ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * The CLB instance name.
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * The list of CLB listeners.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Listeners")
    @Expose
    private ClbListener [] Listeners;

    /**
     * Get The CLB instance ID. 
     * @return LoadBalancerId The CLB instance ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set The CLB instance ID.
     * @param LoadBalancerId The CLB instance ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get The CLB instance name. 
     * @return LoadBalancerName The CLB instance name.
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set The CLB instance name.
     * @param LoadBalancerName The CLB instance name.
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get The list of CLB listeners.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Listeners The list of CLB listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClbListener [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set The list of CLB listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Listeners The list of CLB listeners.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setListeners(ClbListener [] Listeners) {
        this.Listeners = Listeners;
    }

    public ClbInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbInstanceDetail(ClbInstanceDetail source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Listeners != null) {
            this.Listeners = new ClbListener[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new ClbListener(source.Listeners[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);

    }
}

