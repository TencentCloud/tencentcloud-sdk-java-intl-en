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
    * Cron expression for description of scheduled scaling trigger time. Use 5-field standard cron format: minute hour date month week. No support for second and year fields.
    */
    @SerializedName("CronExpression")
    @Expose
    private String CronExpression;

    /**
    * After hitting the scheduled scaling action, the minimum number of instances to which the inference service can be adjusted. If multiple scheduled scaling actions hit at the same time within the identical evaluation window, use the maximum MinInstanceCount.
    */
    @SerializedName("MinInstanceCount")
    @Expose
    private Long MinInstanceCount;

    /**
     * Get Cron expression for description of scheduled scaling trigger time. Use 5-field standard cron format: minute hour date month week. No support for second and year fields. 
     * @return CronExpression Cron expression for description of scheduled scaling trigger time. Use 5-field standard cron format: minute hour date month week. No support for second and year fields.
     */
    public String getCronExpression() {
        return this.CronExpression;
    }

    /**
     * Set Cron expression for description of scheduled scaling trigger time. Use 5-field standard cron format: minute hour date month week. No support for second and year fields.
     * @param CronExpression Cron expression for description of scheduled scaling trigger time. Use 5-field standard cron format: minute hour date month week. No support for second and year fields.
     */
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    /**
     * Get After hitting the scheduled scaling action, the minimum number of instances to which the inference service can be adjusted. If multiple scheduled scaling actions hit at the same time within the identical evaluation window, use the maximum MinInstanceCount. 
     * @return MinInstanceCount After hitting the scheduled scaling action, the minimum number of instances to which the inference service can be adjusted. If multiple scheduled scaling actions hit at the same time within the identical evaluation window, use the maximum MinInstanceCount.
     */
    public Long getMinInstanceCount() {
        return this.MinInstanceCount;
    }

    /**
     * Set After hitting the scheduled scaling action, the minimum number of instances to which the inference service can be adjusted. If multiple scheduled scaling actions hit at the same time within the identical evaluation window, use the maximum MinInstanceCount.
     * @param MinInstanceCount After hitting the scheduled scaling action, the minimum number of instances to which the inference service can be adjusted. If multiple scheduled scaling actions hit at the same time within the identical evaluation window, use the maximum MinInstanceCount.
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

