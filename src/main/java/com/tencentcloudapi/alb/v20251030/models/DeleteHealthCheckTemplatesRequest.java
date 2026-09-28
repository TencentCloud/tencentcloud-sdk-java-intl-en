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

public class DeleteHealthCheckTemplatesRequest extends AbstractModel {

    /**
    * Health check template ID list. The ID format is `hct-` followed by alphanumeric characters.
    */
    @SerializedName("HealthCheckTemplateIds")
    @Expose
    private String [] HealthCheckTemplateIds;

    /**
    * Whether to preview this request.
- **false** (default): Send a normal request to directly delete the template.
- **true**: Send a preview request to check whether the parameters, format, and service limits of the template to delete meet the requirements.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Health check template ID list. The ID format is `hct-` followed by alphanumeric characters. 
     * @return HealthCheckTemplateIds Health check template ID list. The ID format is `hct-` followed by alphanumeric characters.
     */
    public String [] getHealthCheckTemplateIds() {
        return this.HealthCheckTemplateIds;
    }

    /**
     * Set Health check template ID list. The ID format is `hct-` followed by alphanumeric characters.
     * @param HealthCheckTemplateIds Health check template ID list. The ID format is `hct-` followed by alphanumeric characters.
     */
    public void setHealthCheckTemplateIds(String [] HealthCheckTemplateIds) {
        this.HealthCheckTemplateIds = HealthCheckTemplateIds;
    }

    /**
     * Get Whether to preview this request.
- **false** (default): Send a normal request to directly delete the template.
- **true**: Send a preview request to check whether the parameters, format, and service limits of the template to delete meet the requirements. 
     * @return DryRun Whether to preview this request.
- **false** (default): Send a normal request to directly delete the template.
- **true**: Send a preview request to check whether the parameters, format, and service limits of the template to delete meet the requirements.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to preview this request.
- **false** (default): Send a normal request to directly delete the template.
- **true**: Send a preview request to check whether the parameters, format, and service limits of the template to delete meet the requirements.
     * @param DryRun Whether to preview this request.
- **false** (default): Send a normal request to directly delete the template.
- **true**: Send a preview request to check whether the parameters, format, and service limits of the template to delete meet the requirements.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public DeleteHealthCheckTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteHealthCheckTemplatesRequest(DeleteHealthCheckTemplatesRequest source) {
        if (source.HealthCheckTemplateIds != null) {
            this.HealthCheckTemplateIds = new String[source.HealthCheckTemplateIds.length];
            for (int i = 0; i < source.HealthCheckTemplateIds.length; i++) {
                this.HealthCheckTemplateIds[i] = new String(source.HealthCheckTemplateIds[i]);
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
        this.setParamArraySimple(map, prefix + "HealthCheckTemplateIds.", this.HealthCheckTemplateIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

