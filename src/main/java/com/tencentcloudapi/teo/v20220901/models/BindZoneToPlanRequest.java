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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindZoneToPlanRequest extends AbstractModel {

    /**
    * Site ID of the selected site that is not bound to a package.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Target package ID to be bound.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
     * Get Site ID of the selected site that is not bound to a package. 
     * @return ZoneId Site ID of the selected site that is not bound to a package.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID of the selected site that is not bound to a package.
     * @param ZoneId Site ID of the selected site that is not bound to a package.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Target package ID to be bound. 
     * @return PlanId Target package ID to be bound.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Target package ID to be bound.
     * @param PlanId Target package ID to be bound.
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

