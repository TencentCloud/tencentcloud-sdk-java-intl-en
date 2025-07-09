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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateResponseData extends AbstractModel {

    /**
    * FlowId11
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * RouteIdDto Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouteDTO")
    @Expose
    private RouteDTO RouteDTO;

    /**
     * Get FlowId11
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FlowId FlowId11
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set FlowId11
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FlowId FlowId11
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get RouteIdDto Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RouteDTO RouteIdDto Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RouteDTO getRouteDTO() {
        return this.RouteDTO;
    }

    /**
     * Set RouteIdDto Note: This field may return null, indicating that no valid values can be obtained.
     * @param RouteDTO RouteIdDto Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRouteDTO(RouteDTO RouteDTO) {
        this.RouteDTO = RouteDTO;
    }

    public OperateResponseData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateResponseData(OperateResponseData source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.RouteDTO != null) {
            this.RouteDTO = new RouteDTO(source.RouteDTO);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "RouteDTO.", this.RouteDTO);

    }
}

