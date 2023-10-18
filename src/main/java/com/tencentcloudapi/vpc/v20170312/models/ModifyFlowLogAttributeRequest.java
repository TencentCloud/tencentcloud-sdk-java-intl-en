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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFlowLogAttributeRequest extends AbstractModel {

    /**
    * The unique ID of the flow log.
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the attributes of a CCN flow log is modified.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The name of the flow log instance.
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * The description of the flow log.
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
     * Get The unique ID of the flow log. 
     * @return FlowLogId The unique ID of the flow log.
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set The unique ID of the flow log.
     * @param FlowLogId The unique ID of the flow log.
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Get The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the attributes of a CCN flow log is modified. 
     * @return VpcId The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the attributes of a CCN flow log is modified.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the attributes of a CCN flow log is modified.
     * @param VpcId The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless the attributes of a CCN flow log is modified.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The name of the flow log instance. 
     * @return FlowLogName The name of the flow log instance.
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * Set The name of the flow log instance.
     * @param FlowLogName The name of the flow log instance.
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * Get The description of the flow log. 
     * @return FlowLogDescription The description of the flow log.
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set The description of the flow log.
     * @param FlowLogDescription The description of the flow log.
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    public ModifyFlowLogAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFlowLogAttributeRequest(ModifyFlowLogAttributeRequest source) {
        if (source.FlowLogId != null) {
            this.FlowLogId = new String(source.FlowLogId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.FlowLogName != null) {
            this.FlowLogName = new String(source.FlowLogName);
        }
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);

    }
}

