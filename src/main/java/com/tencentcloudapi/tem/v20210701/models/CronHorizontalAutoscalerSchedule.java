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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronHorizontalAutoscalerSchedule extends AbstractModel {

    /**
    * Triggering time, in the format of HH:MM
Example:
00:00 (Trigger at midnight)
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * Number of target pods (less than 50)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetReplicas")
    @Expose
    private Long TargetReplicas;

    /**
     * Get Triggering time, in the format of HH:MM
Example:
00:00 (Trigger at midnight) 
     * @return StartAt Triggering time, in the format of HH:MM
Example:
00:00 (Trigger at midnight)
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set Triggering time, in the format of HH:MM
Example:
00:00 (Trigger at midnight)
     * @param StartAt Triggering time, in the format of HH:MM
Example:
00:00 (Trigger at midnight)
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get Number of target pods (less than 50)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TargetReplicas Number of target pods (less than 50)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTargetReplicas() {
        return this.TargetReplicas;
    }

    /**
     * Set Number of target pods (less than 50)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TargetReplicas Number of target pods (less than 50)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTargetReplicas(Long TargetReplicas) {
        this.TargetReplicas = TargetReplicas;
    }

    public CronHorizontalAutoscalerSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronHorizontalAutoscalerSchedule(CronHorizontalAutoscalerSchedule source) {
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.TargetReplicas != null) {
            this.TargetReplicas = new Long(source.TargetReplicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "TargetReplicas", this.TargetReplicas);

    }
}

