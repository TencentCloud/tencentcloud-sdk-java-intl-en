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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PipelineInputSettingsInfo extends AbstractModel {

    /**
    * Pipeline failover configuration, the valid value is: 1.PIPELINE_FAILOVER (channels are mutually failover); 2.PIPELINE_FILLING (channels fill in themselves). Default value: PIPELINE_FILLING. The specific content is specified by FaultBehavior.
    */
    @SerializedName("FaultBehavior")
    @Expose
    private String FaultBehavior;

    /**
     * Get Pipeline failover configuration, the valid value is: 1.PIPELINE_FAILOVER (channels are mutually failover); 2.PIPELINE_FILLING (channels fill in themselves). Default value: PIPELINE_FILLING. The specific content is specified by FaultBehavior. 
     * @return FaultBehavior Pipeline failover configuration, the valid value is: 1.PIPELINE_FAILOVER (channels are mutually failover); 2.PIPELINE_FILLING (channels fill in themselves). Default value: PIPELINE_FILLING. The specific content is specified by FaultBehavior.
     */
    public String getFaultBehavior() {
        return this.FaultBehavior;
    }

    /**
     * Set Pipeline failover configuration, the valid value is: 1.PIPELINE_FAILOVER (channels are mutually failover); 2.PIPELINE_FILLING (channels fill in themselves). Default value: PIPELINE_FILLING. The specific content is specified by FaultBehavior.
     * @param FaultBehavior Pipeline failover configuration, the valid value is: 1.PIPELINE_FAILOVER (channels are mutually failover); 2.PIPELINE_FILLING (channels fill in themselves). Default value: PIPELINE_FILLING. The specific content is specified by FaultBehavior.
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

