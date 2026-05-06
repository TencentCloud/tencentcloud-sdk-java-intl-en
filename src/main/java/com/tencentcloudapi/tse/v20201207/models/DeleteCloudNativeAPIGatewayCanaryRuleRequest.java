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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCloudNativeAPIGatewayCanaryRuleRequest extends AbstractModel {

    /**
    * Gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Priority list. If configured, this parameter takes precedence and the Priority parameter is ignored.
    */
    @SerializedName("PriorityList")
    @Expose
    private Long [] PriorityList;

    /**
     * Get Gateway ID 
     * @return GatewayId Gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID
     * @param GatewayId Gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Priority 
     * @return Priority Priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority
     * @param Priority Priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Priority list. If configured, this parameter takes precedence and the Priority parameter is ignored. 
     * @return PriorityList Priority list. If configured, this parameter takes precedence and the Priority parameter is ignored.
     */
    public Long [] getPriorityList() {
        return this.PriorityList;
    }

    /**
     * Set Priority list. If configured, this parameter takes precedence and the Priority parameter is ignored.
     * @param PriorityList Priority list. If configured, this parameter takes precedence and the Priority parameter is ignored.
     */
    public void setPriorityList(Long [] PriorityList) {
        this.PriorityList = PriorityList;
    }

    public DeleteCloudNativeAPIGatewayCanaryRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudNativeAPIGatewayCanaryRuleRequest(DeleteCloudNativeAPIGatewayCanaryRuleRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.PriorityList != null) {
            this.PriorityList = new Long[source.PriorityList.length];
            for (int i = 0; i < source.PriorityList.length; i++) {
                this.PriorityList[i] = new Long(source.PriorityList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArraySimple(map, prefix + "PriorityList.", this.PriorityList);

    }
}

