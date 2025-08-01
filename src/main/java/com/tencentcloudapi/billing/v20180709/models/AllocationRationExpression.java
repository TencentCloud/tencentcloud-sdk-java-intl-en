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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationRationExpression extends AbstractModel {

    /**
    * Cost allocation unit ID that the sharing rule belongs to.
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * Sharing proportion occupied by allocation unit, pass 0 for allocation by proportion.
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
     * Get Cost allocation unit ID that the sharing rule belongs to. 
     * @return NodeId Cost allocation unit ID that the sharing rule belongs to.
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Cost allocation unit ID that the sharing rule belongs to.
     * @param NodeId Cost allocation unit ID that the sharing rule belongs to.
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Sharing proportion occupied by allocation unit, pass 0 for allocation by proportion. 
     * @return Ratio Sharing proportion occupied by allocation unit, pass 0 for allocation by proportion.
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set Sharing proportion occupied by allocation unit, pass 0 for allocation by proportion.
     * @param Ratio Sharing proportion occupied by allocation unit, pass 0 for allocation by proportion.
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    public AllocationRationExpression() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationRationExpression(AllocationRationExpression source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

