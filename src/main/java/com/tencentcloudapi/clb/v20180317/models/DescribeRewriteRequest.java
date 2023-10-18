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

public class DescribeRewriteRequest extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Array of CLB listener IDs
    */
    @SerializedName("SourceListenerIds")
    @Expose
    private String [] SourceListenerIds;

    /**
    * Array of CLB forwarding rule IDs
    */
    @SerializedName("SourceLocationIds")
    @Expose
    private String [] SourceLocationIds;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Array of CLB listener IDs 
     * @return SourceListenerIds Array of CLB listener IDs
     */
    public String [] getSourceListenerIds() {
        return this.SourceListenerIds;
    }

    /**
     * Set Array of CLB listener IDs
     * @param SourceListenerIds Array of CLB listener IDs
     */
    public void setSourceListenerIds(String [] SourceListenerIds) {
        this.SourceListenerIds = SourceListenerIds;
    }

    /**
     * Get Array of CLB forwarding rule IDs 
     * @return SourceLocationIds Array of CLB forwarding rule IDs
     */
    public String [] getSourceLocationIds() {
        return this.SourceLocationIds;
    }

    /**
     * Set Array of CLB forwarding rule IDs
     * @param SourceLocationIds Array of CLB forwarding rule IDs
     */
    public void setSourceLocationIds(String [] SourceLocationIds) {
        this.SourceLocationIds = SourceLocationIds;
    }

    public DescribeRewriteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRewriteRequest(DescribeRewriteRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.SourceListenerIds != null) {
            this.SourceListenerIds = new String[source.SourceListenerIds.length];
            for (int i = 0; i < source.SourceListenerIds.length; i++) {
                this.SourceListenerIds[i] = new String(source.SourceListenerIds[i]);
            }
        }
        if (source.SourceLocationIds != null) {
            this.SourceLocationIds = new String[source.SourceLocationIds.length];
            for (int i = 0; i < source.SourceLocationIds.length; i++) {
                this.SourceLocationIds[i] = new String(source.SourceLocationIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "SourceListenerIds.", this.SourceListenerIds);
        this.setParamArraySimple(map, prefix + "SourceLocationIds.", this.SourceLocationIds);

    }
}

