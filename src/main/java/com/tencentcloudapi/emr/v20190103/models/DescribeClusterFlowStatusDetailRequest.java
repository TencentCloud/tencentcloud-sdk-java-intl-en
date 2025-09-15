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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterFlowStatusDetailRequest extends AbstractModel {

    /**
    * EMR instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Process-related parameters.
    */
    @SerializedName("FlowParam")
    @Expose
    private FlowParam FlowParam;

    /**
    * Whether to return additional task information.
The default value is false.
    */
    @SerializedName("NeedExtraDetail")
    @Expose
    private Boolean NeedExtraDetail;

    /**
     * Get EMR instance ID 
     * @return InstanceId EMR instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR instance ID
     * @param InstanceId EMR instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Process-related parameters. 
     * @return FlowParam Process-related parameters.
     */
    public FlowParam getFlowParam() {
        return this.FlowParam;
    }

    /**
     * Set Process-related parameters.
     * @param FlowParam Process-related parameters.
     */
    public void setFlowParam(FlowParam FlowParam) {
        this.FlowParam = FlowParam;
    }

    /**
     * Get Whether to return additional task information.
The default value is false. 
     * @return NeedExtraDetail Whether to return additional task information.
The default value is false.
     */
    public Boolean getNeedExtraDetail() {
        return this.NeedExtraDetail;
    }

    /**
     * Set Whether to return additional task information.
The default value is false.
     * @param NeedExtraDetail Whether to return additional task information.
The default value is false.
     */
    public void setNeedExtraDetail(Boolean NeedExtraDetail) {
        this.NeedExtraDetail = NeedExtraDetail;
    }

    public DescribeClusterFlowStatusDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterFlowStatusDetailRequest(DescribeClusterFlowStatusDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FlowParam != null) {
            this.FlowParam = new FlowParam(source.FlowParam);
        }
        if (source.NeedExtraDetail != null) {
            this.NeedExtraDetail = new Boolean(source.NeedExtraDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "FlowParam.", this.FlowParam);
        this.setParamSimple(map, prefix + "NeedExtraDetail", this.NeedExtraDetail);

    }
}

