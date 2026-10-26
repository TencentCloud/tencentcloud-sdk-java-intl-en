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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordPlanRequest extends AbstractModel {

    /**
    * Plan ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Modify the content of the plan
    */
    @SerializedName("Mod")
    @Expose
    private UpdateRecordPlanData Mod;

    /**
     * Get Plan ID 
     * @return PlanId Plan ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Plan ID
     * @param PlanId Plan ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Modify the content of the plan 
     * @return Mod Modify the content of the plan
     */
    public UpdateRecordPlanData getMod() {
        return this.Mod;
    }

    /**
     * Set Modify the content of the plan
     * @param Mod Modify the content of the plan
     */
    public void setMod(UpdateRecordPlanData Mod) {
        this.Mod = Mod;
    }

    public UpdateRecordPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordPlanRequest(UpdateRecordPlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Mod != null) {
            this.Mod = new UpdateRecordPlanData(source.Mod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamObj(map, prefix + "Mod.", this.Mod);

    }
}

