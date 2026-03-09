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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTriggerTaskBrief extends AbstractModel {

    /**
    * Task basic attributes.
    */
    @SerializedName("TriggerTaskBaseAttribute")
    @Expose
    private UpdateTriggerTaskBaseAttribute TriggerTaskBaseAttribute;

    /**
    * Task configurations.
    */
    @SerializedName("TriggerTaskConfiguration")
    @Expose
    private TriggerTaskConfiguration TriggerTaskConfiguration;

    /**
    * Task scheduling configuration.
    */
    @SerializedName("TriggerTaskSchedulerConfiguration")
    @Expose
    private TriggerTaskSchedulerConfiguration TriggerTaskSchedulerConfiguration;

    /**
     * Get Task basic attributes. 
     * @return TriggerTaskBaseAttribute Task basic attributes.
     */
    public UpdateTriggerTaskBaseAttribute getTriggerTaskBaseAttribute() {
        return this.TriggerTaskBaseAttribute;
    }

    /**
     * Set Task basic attributes.
     * @param TriggerTaskBaseAttribute Task basic attributes.
     */
    public void setTriggerTaskBaseAttribute(UpdateTriggerTaskBaseAttribute TriggerTaskBaseAttribute) {
        this.TriggerTaskBaseAttribute = TriggerTaskBaseAttribute;
    }

    /**
     * Get Task configurations. 
     * @return TriggerTaskConfiguration Task configurations.
     */
    public TriggerTaskConfiguration getTriggerTaskConfiguration() {
        return this.TriggerTaskConfiguration;
    }

    /**
     * Set Task configurations.
     * @param TriggerTaskConfiguration Task configurations.
     */
    public void setTriggerTaskConfiguration(TriggerTaskConfiguration TriggerTaskConfiguration) {
        this.TriggerTaskConfiguration = TriggerTaskConfiguration;
    }

    /**
     * Get Task scheduling configuration. 
     * @return TriggerTaskSchedulerConfiguration Task scheduling configuration.
     */
    public TriggerTaskSchedulerConfiguration getTriggerTaskSchedulerConfiguration() {
        return this.TriggerTaskSchedulerConfiguration;
    }

    /**
     * Set Task scheduling configuration.
     * @param TriggerTaskSchedulerConfiguration Task scheduling configuration.
     */
    public void setTriggerTaskSchedulerConfiguration(TriggerTaskSchedulerConfiguration TriggerTaskSchedulerConfiguration) {
        this.TriggerTaskSchedulerConfiguration = TriggerTaskSchedulerConfiguration;
    }

    public UpdateTriggerTaskBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerTaskBrief(UpdateTriggerTaskBrief source) {
        if (source.TriggerTaskBaseAttribute != null) {
            this.TriggerTaskBaseAttribute = new UpdateTriggerTaskBaseAttribute(source.TriggerTaskBaseAttribute);
        }
        if (source.TriggerTaskConfiguration != null) {
            this.TriggerTaskConfiguration = new TriggerTaskConfiguration(source.TriggerTaskConfiguration);
        }
        if (source.TriggerTaskSchedulerConfiguration != null) {
            this.TriggerTaskSchedulerConfiguration = new TriggerTaskSchedulerConfiguration(source.TriggerTaskSchedulerConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TriggerTaskBaseAttribute.", this.TriggerTaskBaseAttribute);
        this.setParamObj(map, prefix + "TriggerTaskConfiguration.", this.TriggerTaskConfiguration);
        this.setParamObj(map, prefix + "TriggerTaskSchedulerConfiguration.", this.TriggerTaskSchedulerConfiguration);

    }
}

