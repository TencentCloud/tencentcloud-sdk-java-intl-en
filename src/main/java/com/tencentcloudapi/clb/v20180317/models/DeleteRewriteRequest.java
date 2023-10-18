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

public class DeleteRewriteRequest extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Source listener ID
    */
    @SerializedName("SourceListenerId")
    @Expose
    private String SourceListenerId;

    /**
    * Target listener ID
    */
    @SerializedName("TargetListenerId")
    @Expose
    private String TargetListenerId;

    /**
    * Redirection relationship between forwarding rules
    */
    @SerializedName("RewriteInfos")
    @Expose
    private RewriteLocationMap [] RewriteInfos;

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
     * Get Source listener ID 
     * @return SourceListenerId Source listener ID
     */
    public String getSourceListenerId() {
        return this.SourceListenerId;
    }

    /**
     * Set Source listener ID
     * @param SourceListenerId Source listener ID
     */
    public void setSourceListenerId(String SourceListenerId) {
        this.SourceListenerId = SourceListenerId;
    }

    /**
     * Get Target listener ID 
     * @return TargetListenerId Target listener ID
     */
    public String getTargetListenerId() {
        return this.TargetListenerId;
    }

    /**
     * Set Target listener ID
     * @param TargetListenerId Target listener ID
     */
    public void setTargetListenerId(String TargetListenerId) {
        this.TargetListenerId = TargetListenerId;
    }

    /**
     * Get Redirection relationship between forwarding rules 
     * @return RewriteInfos Redirection relationship between forwarding rules
     */
    public RewriteLocationMap [] getRewriteInfos() {
        return this.RewriteInfos;
    }

    /**
     * Set Redirection relationship between forwarding rules
     * @param RewriteInfos Redirection relationship between forwarding rules
     */
    public void setRewriteInfos(RewriteLocationMap [] RewriteInfos) {
        this.RewriteInfos = RewriteInfos;
    }

    public DeleteRewriteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRewriteRequest(DeleteRewriteRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.SourceListenerId != null) {
            this.SourceListenerId = new String(source.SourceListenerId);
        }
        if (source.TargetListenerId != null) {
            this.TargetListenerId = new String(source.TargetListenerId);
        }
        if (source.RewriteInfos != null) {
            this.RewriteInfos = new RewriteLocationMap[source.RewriteInfos.length];
            for (int i = 0; i < source.RewriteInfos.length; i++) {
                this.RewriteInfos[i] = new RewriteLocationMap(source.RewriteInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "SourceListenerId", this.SourceListenerId);
        this.setParamSimple(map, prefix + "TargetListenerId", this.TargetListenerId);
        this.setParamArrayObj(map, prefix + "RewriteInfos.", this.RewriteInfos);

    }
}

