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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindZoneToPlanRequest extends AbstractModel {

    /**
    * ID of the site to be bound.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * ID of the target plan.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
     * Get ID of the site to be bound. 
     * @return ZoneId ID of the site to be bound.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site to be bound.
     * @param ZoneId ID of the site to be bound.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get ID of the target plan. 
     * @return PlanId ID of the target plan.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set ID of the target plan.
     * @param PlanId ID of the target plan.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    public BindZoneToPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindZoneToPlanRequest(BindZoneToPlanRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);

    }
}

