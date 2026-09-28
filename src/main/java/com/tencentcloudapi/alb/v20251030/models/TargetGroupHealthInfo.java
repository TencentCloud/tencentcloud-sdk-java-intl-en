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

public class TargetGroupHealthInfo extends AbstractModel {

    /**
    * Whether to enable the health check.
    */
    @SerializedName("HealthCheckEnabled")
    @Expose
    private Boolean HealthCheckEnabled;

    /**
    * Target group ID in the format of lbtg- followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * List of service health check statuses.
    */
    @SerializedName("TargetHealthStatusInfos")
    @Expose
    private TargetHealthStatusInfo [] TargetHealthStatusInfos;

    /**
    * Forward action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to an HTTP header.
RemoveHeader: Delete HTTP Header.
Forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order is placed last.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Whether to enable the health check. 
     * @return HealthCheckEnabled Whether to enable the health check.
     */
    public Boolean getHealthCheckEnabled() {
        return this.HealthCheckEnabled;
    }

    /**
     * Set Whether to enable the health check.
     * @param HealthCheckEnabled Whether to enable the health check.
     */
    public void setHealthCheckEnabled(Boolean HealthCheckEnabled) {
        this.HealthCheckEnabled = HealthCheckEnabled;
    }

    /**
     * Get Target group ID in the format of lbtg- followed by 8 alphanumeric characters. 
     * @return TargetGroupId Target group ID in the format of lbtg- followed by 8 alphanumeric characters.
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group ID in the format of lbtg- followed by 8 alphanumeric characters.
     * @param TargetGroupId Target group ID in the format of lbtg- followed by 8 alphanumeric characters.
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get List of service health check statuses. 
     * @return TargetHealthStatusInfos List of service health check statuses.
     */
    public TargetHealthStatusInfo [] getTargetHealthStatusInfos() {
        return this.TargetHealthStatusInfos;
    }

    /**
     * Set List of service health check statuses.
     * @param TargetHealthStatusInfos List of service health check statuses.
     */
    public void setTargetHealthStatusInfos(TargetHealthStatusInfo [] TargetHealthStatusInfos) {
        this.TargetHealthStatusInfos = TargetHealthStatusInfos;
    }

    /**
     * Get Forward action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to an HTTP header.
RemoveHeader: Delete HTTP Header.
Forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order is placed last. 
     * @return Type Forward action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to an HTTP header.
RemoveHeader: Delete HTTP Header.
Forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order is placed last.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Forward action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to an HTTP header.
RemoveHeader: Delete HTTP Header.
Forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order is placed last.
     * @param Type Forward action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to an HTTP header.
RemoveHeader: Delete HTTP Header.
Forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order is placed last.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public TargetGroupHealthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupHealthInfo(TargetGroupHealthInfo source) {
        if (source.HealthCheckEnabled != null) {
            this.HealthCheckEnabled = new Boolean(source.HealthCheckEnabled);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetHealthStatusInfos != null) {
            this.TargetHealthStatusInfos = new TargetHealthStatusInfo[source.TargetHealthStatusInfos.length];
            for (int i = 0; i < source.TargetHealthStatusInfos.length; i++) {
                this.TargetHealthStatusInfos[i] = new TargetHealthStatusInfo(source.TargetHealthStatusInfos[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckEnabled", this.HealthCheckEnabled);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamArrayObj(map, prefix + "TargetHealthStatusInfos.", this.TargetHealthStatusInfos);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

