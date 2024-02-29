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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResumeInstanceRefreshRequest extends AbstractModel {

    /**
    * Scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Refresh activity ID.
    */
    @SerializedName("RefreshActivityId")
    @Expose
    private String RefreshActivityId;

    /**
    * The recovery method for the current batch's failed instances. If there are no failed instances, this parameter becomes invalid. Default value: RETRY. Valid values: <br><li>RETRY: Retry refreshing failed instances in the current batch.</li> <li>CONTINUE: Skip failed instances in the current batch.
    */
    @SerializedName("ResumeMode")
    @Expose
    private String ResumeMode;

    /**
     * Get Scaling group ID. 
     * @return AutoScalingGroupId Scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID.
     * @param AutoScalingGroupId Scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Refresh activity ID. 
     * @return RefreshActivityId Refresh activity ID.
     */
    public String getRefreshActivityId() {
        return this.RefreshActivityId;
    }

    /**
     * Set Refresh activity ID.
     * @param RefreshActivityId Refresh activity ID.
     */
    public void setRefreshActivityId(String RefreshActivityId) {
        this.RefreshActivityId = RefreshActivityId;
    }

    /**
     * Get The recovery method for the current batch's failed instances. If there are no failed instances, this parameter becomes invalid. Default value: RETRY. Valid values: <br><li>RETRY: Retry refreshing failed instances in the current batch.</li> <li>CONTINUE: Skip failed instances in the current batch. 
     * @return ResumeMode The recovery method for the current batch's failed instances. If there are no failed instances, this parameter becomes invalid. Default value: RETRY. Valid values: <br><li>RETRY: Retry refreshing failed instances in the current batch.</li> <li>CONTINUE: Skip failed instances in the current batch.
     */
    public String getResumeMode() {
        return this.ResumeMode;
    }

    /**
     * Set The recovery method for the current batch's failed instances. If there are no failed instances, this parameter becomes invalid. Default value: RETRY. Valid values: <br><li>RETRY: Retry refreshing failed instances in the current batch.</li> <li>CONTINUE: Skip failed instances in the current batch.
     * @param ResumeMode The recovery method for the current batch's failed instances. If there are no failed instances, this parameter becomes invalid. Default value: RETRY. Valid values: <br><li>RETRY: Retry refreshing failed instances in the current batch.</li> <li>CONTINUE: Skip failed instances in the current batch.
     */
    public void setResumeMode(String ResumeMode) {
        this.ResumeMode = ResumeMode;
    }

    public ResumeInstanceRefreshRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResumeInstanceRefreshRequest(ResumeInstanceRefreshRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.RefreshActivityId != null) {
            this.RefreshActivityId = new String(source.RefreshActivityId);
        }
        if (source.ResumeMode != null) {
            this.ResumeMode = new String(source.ResumeMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "RefreshActivityId", this.RefreshActivityId);
        this.setParamSimple(map, prefix + "ResumeMode", this.ResumeMode);

    }
}

