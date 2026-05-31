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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PipelineInputSettingsInfo extends AbstractModel {

    /**
    * Pipeline disaster recovery configuration. Value: PIPELINE_FAILOVER (mutual disaster recovery for channels if unable), PIPELINE_FILLING (channel fill automatically).
Default value: PIPELINE_FAILOVER. If failover between channels fails, auto-execute PIPELINE_FILLING. Specific content is specified by InputLossBehavior.
    */
    @SerializedName("FaultBehavior")
    @Expose
    private String FaultBehavior;

    /**
     * Get Pipeline disaster recovery configuration. Value: PIPELINE_FAILOVER (mutual disaster recovery for channels if unable), PIPELINE_FILLING (channel fill automatically).
Default value: PIPELINE_FAILOVER. If failover between channels fails, auto-execute PIPELINE_FILLING. Specific content is specified by InputLossBehavior. 
     * @return FaultBehavior Pipeline disaster recovery configuration. Value: PIPELINE_FAILOVER (mutual disaster recovery for channels if unable), PIPELINE_FILLING (channel fill automatically).
Default value: PIPELINE_FAILOVER. If failover between channels fails, auto-execute PIPELINE_FILLING. Specific content is specified by InputLossBehavior.
     */
    public String getFaultBehavior() {
        return this.FaultBehavior;
    }

    /**
     * Set Pipeline disaster recovery configuration. Value: PIPELINE_FAILOVER (mutual disaster recovery for channels if unable), PIPELINE_FILLING (channel fill automatically).
Default value: PIPELINE_FAILOVER. If failover between channels fails, auto-execute PIPELINE_FILLING. Specific content is specified by InputLossBehavior.
     * @param FaultBehavior Pipeline disaster recovery configuration. Value: PIPELINE_FAILOVER (mutual disaster recovery for channels if unable), PIPELINE_FILLING (channel fill automatically).
Default value: PIPELINE_FAILOVER. If failover between channels fails, auto-execute PIPELINE_FILLING. Specific content is specified by InputLossBehavior.
     */
    public void setFaultBehavior(String FaultBehavior) {
        this.FaultBehavior = FaultBehavior;
    }

    public PipelineInputSettingsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PipelineInputSettingsInfo(PipelineInputSettingsInfo source) {
        if (source.FaultBehavior != null) {
            this.FaultBehavior = new String(source.FaultBehavior);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaultBehavior", this.FaultBehavior);

    }
}

