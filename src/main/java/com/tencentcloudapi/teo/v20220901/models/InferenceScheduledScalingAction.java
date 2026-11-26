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

public class InferenceScheduledScalingAction extends AbstractModel {

    /**
    * Cron expression for description of the trigger time of a scheduled scaling action. It uses the standard 5-field cron format: minute hour date month week. The second and year fields are not supported.
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
    * Minimum number of instances required for the inference service after this scheduled scaling action is hit. If multiple scheduled scaling actions are hit at the same time within the same estimation window, use the maximum MinInstanceCount.
    */
    @SerializedName("MinInstanceCount")
    @Expose
    private Long MinInstanceCount;

    /**
     * Get Cron expression for description of the trigger time of a scheduled scaling action. It uses the standard 5-field cron format: minute hour date month week. The second and year fields are not supported. 
     * @return CronExpression Cron expression for description of the trigger time of a scheduled scaling action. It uses the standard 5-field cron format: minute hour date month week. The second and year fields are not supported.
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set Cron expression for description of the trigger time of a scheduled scaling action. It uses the standard 5-field cron format: minute hour date month week. The second and year fields are not supported.
     * @param CronExpression Cron expression for description of the trigger time of a scheduled scaling action. It uses the standard 5-field cron format: minute hour date month week. The second and year fields are not supported.
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    /**
     * Get Minimum number of instances required for the inference service after this scheduled scaling action is hit. If multiple scheduled scaling actions are hit at the same time within the same estimation window, use the maximum MinInstanceCount. 
     * @return MinInstanceCount Minimum number of instances required for the inference service after this scheduled scaling action is hit. If multiple scheduled scaling actions are hit at the same time within the same estimation window, use the maximum MinInstanceCount.
     */
    public Long getMinInstanceCount() {
        return this.MinInstanceCount;
    }

    /**
     * Set Minimum number of instances required for the inference service after this scheduled scaling action is hit. If multiple scheduled scaling actions are hit at the same time within the same estimation window, use the maximum MinInstanceCount.
     * @param MinInstanceCount Minimum number of instances required for the inference service after this scheduled scaling action is hit. If multiple scheduled scaling actions are hit at the same time within the same estimation window, use the maximum MinInstanceCount.
     */
    public void setMinInstanceCount(Long MinInstanceCount) {
        this.MinInstanceCount = MinInstanceCount;
    }

    public InferenceScheduledScalingAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceScheduledScalingAction(InferenceScheduledScalingAction source) {
        if (source.CronExpression != null) {
            this.CronExpression = new String(source.CronExpression);
        }
        if (source.MinInstanceCount != null) {
            this.MinInstanceCount = new Long(source.MinInstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CronExpression", this.CronExpression);
        this.setParamSimple(map, prefix + "MinInstanceCount", this.MinInstanceCount);

    }
}

