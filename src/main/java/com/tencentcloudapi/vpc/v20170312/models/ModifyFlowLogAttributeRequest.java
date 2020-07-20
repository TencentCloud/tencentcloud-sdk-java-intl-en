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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFlowLogAttributeRequest extends AbstractModel{

    /**
    * The VPC ID or the unified ID. We recommend you use the unified ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The unique ID of the flow log collector.
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * The name of the flow log collector.
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * The description of the flow log collector.
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
     * Get The VPC ID or the unified ID. We recommend you use the unified ID. 
     * @return VpcId The VPC ID or the unified ID. We recommend you use the unified ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The VPC ID or the unified ID. We recommend you use the unified ID.
     * @param VpcId The VPC ID or the unified ID. We recommend you use the unified ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The unique ID of the flow log collector. 
     * @return FlowLogId The unique ID of the flow log collector.
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set The unique ID of the flow log collector.
     * @param FlowLogId The unique ID of the flow log collector.
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Get The name of the flow log collector. 
     * @return FlowLogName The name of the flow log collector.
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * Set The name of the flow log collector.
     * @param FlowLogName The name of the flow log collector.
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * Get The description of the flow log collector. 
     * @return FlowLogDescription The description of the flow log collector.
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set The description of the flow log collector.
     * @param FlowLogDescription The description of the flow log collector.
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);

    }
}

