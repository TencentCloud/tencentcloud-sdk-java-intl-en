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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddTargetsToTargetGroupRequest extends AbstractModel {

    /**
    * Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * List of backend services to be added to the target group. A single request can add up to **50** backend services.
    */
    @SerializedName("Targets")
    @Expose
    private TargetToAdd [] Targets;

    /**
    * Whether to preview this request. 
- **false** (default): Send a normal request and add the backend service directly to the target group. 
- **true**: Send a preview request to check whether the parameters, format, and service limits for adding the backend service meet the requirements.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters. 
     * @return TargetGroupId Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters.
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters.
     * @param TargetGroupId Target group ID. The format is `lbtg-` followed by 8 alphanumeric characters.
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get List of backend services to be added to the target group. A single request can add up to **50** backend services. 
     * @return Targets List of backend services to be added to the target group. A single request can add up to **50** backend services.
     */
    public TargetToAdd [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of backend services to be added to the target group. A single request can add up to **50** backend services.
     * @param Targets List of backend services to be added to the target group. A single request can add up to **50** backend services.
     */
    public void setTargets(TargetToAdd [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Whether to preview this request. 
- **false** (default): Send a normal request and add the backend service directly to the target group. 
- **true**: Send a preview request to check whether the parameters, format, and service limits for adding the backend service meet the requirements. 
     * @return DryRun Whether to preview this request. 
- **false** (default): Send a normal request and add the backend service directly to the target group. 
- **true**: Send a preview request to check whether the parameters, format, and service limits for adding the backend service meet the requirements.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to preview this request. 
- **false** (default): Send a normal request and add the backend service directly to the target group. 
- **true**: Send a preview request to check whether the parameters, format, and service limits for adding the backend service meet the requirements.
     * @param DryRun Whether to preview this request. 
- **false** (default): Send a normal request and add the backend service directly to the target group. 
- **true**: Send a preview request to check whether the parameters, format, and service limits for adding the backend service meet the requirements.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public AddTargetsToTargetGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddTargetsToTargetGroupRequest(AddTargetsToTargetGroupRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.Targets != null) {
            this.Targets = new TargetToAdd[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new TargetToAdd(source.Targets[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

