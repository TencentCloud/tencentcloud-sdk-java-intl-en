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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LBItem extends AbstractModel{

    /**
    * String ID of the CLB instance.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * VIP of the CLB instance.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Listener rule.
    */
    @SerializedName("Listeners")
    @Expose
    private ListenerItem [] Listeners;

    /**
    * Region of the CLB instance
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get String ID of the CLB instance. 
     * @return LoadBalancerId String ID of the CLB instance.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set String ID of the CLB instance.
     * @param LoadBalancerId String ID of the CLB instance.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get VIP of the CLB instance. 
     * @return Vip VIP of the CLB instance.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP of the CLB instance.
     * @param Vip VIP of the CLB instance.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Listener rule. 
     * @return Listeners Listener rule.
     */
    public ListenerItem [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set Listener rule.
     * @param Listeners Listener rule.
     */
    public void setListeners(ListenerItem [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Get Region of the CLB instance 
     * @return Region Region of the CLB instance
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the CLB instance
     * @param Region Region of the CLB instance
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public LBItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LBItem(LBItem source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Listeners != null) {
            this.Listeners = new ListenerItem[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new ListenerItem(source.Listeners[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

