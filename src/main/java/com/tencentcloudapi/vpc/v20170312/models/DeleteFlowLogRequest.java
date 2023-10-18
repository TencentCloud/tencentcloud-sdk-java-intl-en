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

public class DeleteFlowLogRequest extends AbstractModel {

    /**
    * The unique ID of the flow log.
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless a CCN flow log is deleted.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

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
     * Get The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless a CCN flow log is deleted. 
     * @return VpcId The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless a CCN flow log is deleted.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless a CCN flow log is deleted.
     * @param VpcId The VPC ID or unique ID of the resource. We recommend using the unique ID. This parameter is required unless a CCN flow log is deleted.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public DeleteFlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFlowLogRequest(DeleteFlowLogRequest source) {
        if (source.FlowLogId != null) {
            this.FlowLogId = new String(source.FlowLogId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

