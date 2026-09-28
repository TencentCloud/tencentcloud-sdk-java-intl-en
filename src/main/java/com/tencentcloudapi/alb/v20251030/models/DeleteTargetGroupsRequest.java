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

public class DeleteTargetGroupsRequest extends AbstractModel {

    /**
    * Whether to preview this request.
- **false** (default): Send a normal request to directly delete the target group.
- **true**: Send a preview request to check whether the parameters, format, and service limits for deleting the target group meet the requirements.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Target group ID list. The ID format is lbtg- followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetGroupIds")
    @Expose
    private String [] TargetGroupIds;

    /**
     * Get Whether to preview this request.
- **false** (default): Send a normal request to directly delete the target group.
- **true**: Send a preview request to check whether the parameters, format, and service limits for deleting the target group meet the requirements. 
     * @return DryRun Whether to preview this request.
- **false** (default): Send a normal request to directly delete the target group.
- **true**: Send a preview request to check whether the parameters, format, and service limits for deleting the target group meet the requirements.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to preview this request.
- **false** (default): Send a normal request to directly delete the target group.
- **true**: Send a preview request to check whether the parameters, format, and service limits for deleting the target group meet the requirements.
     * @param DryRun Whether to preview this request.
- **false** (default): Send a normal request to directly delete the target group.
- **true**: Send a preview request to check whether the parameters, format, and service limits for deleting the target group meet the requirements.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Target group ID list. The ID format is lbtg- followed by 8 alphanumeric characters. 
     * @return TargetGroupIds Target group ID list. The ID format is lbtg- followed by 8 alphanumeric characters.
     */
    public String [] getTargetGroupIds() {
        return this.TargetGroupIds;
    }

    /**
     * Set Target group ID list. The ID format is lbtg- followed by 8 alphanumeric characters.
     * @param TargetGroupIds Target group ID list. The ID format is lbtg- followed by 8 alphanumeric characters.
     */
    public void setTargetGroupIds(String [] TargetGroupIds) {
        this.TargetGroupIds = TargetGroupIds;
    }

    public DeleteTargetGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTargetGroupsRequest(DeleteTargetGroupsRequest source) {
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.TargetGroupIds != null) {
            this.TargetGroupIds = new String[source.TargetGroupIds.length];
            for (int i = 0; i < source.TargetGroupIds.length; i++) {
                this.TargetGroupIds[i] = new String(source.TargetGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamArraySimple(map, prefix + "TargetGroupIds.", this.TargetGroupIds);

    }
}

