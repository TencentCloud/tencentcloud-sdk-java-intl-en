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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamLivePlanRequest extends AbstractModel{

    /**
    * ID of the channel for which you want to configure an event
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Event configuration
    */
    @SerializedName("Plan")
    @Expose
    private PlanReq Plan;

    /**
     * Get ID of the channel for which you want to configure an event 
     * @return ChannelId ID of the channel for which you want to configure an event
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set ID of the channel for which you want to configure an event
     * @param ChannelId ID of the channel for which you want to configure an event
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Event configuration 
     * @return Plan Event configuration
     */
    public PlanReq getPlan() {
        return this.Plan;
    }

    /**
     * Set Event configuration
     * @param Plan Event configuration
     */
    public void setPlan(PlanReq Plan) {
        this.Plan = Plan;
    }

    public CreateStreamLivePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLivePlanRequest(CreateStreamLivePlanRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Plan != null) {
            this.Plan = new PlanReq(source.Plan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamObj(map, prefix + "Plan.", this.Plan);

    }
}

