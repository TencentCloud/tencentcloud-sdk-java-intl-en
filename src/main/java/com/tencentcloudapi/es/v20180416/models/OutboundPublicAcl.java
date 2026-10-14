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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutboundPublicAcl extends AbstractModel {

    /**
    * Node types with permission for node outbound access
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Allowlist for outbound access from nodes
    */
    @SerializedName("WhiteHostList")
    @Expose
    private String [] WhiteHostList;

    /**
     * Get Node types with permission for node outbound access 
     * @return NodeType Node types with permission for node outbound access
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node types with permission for node outbound access
     * @param NodeType Node types with permission for node outbound access
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Allowlist for outbound access from nodes 
     * @return WhiteHostList Allowlist for outbound access from nodes
     */
    public String [] getWhiteHostList() {
        return this.WhiteHostList;
    }

    /**
     * Set Allowlist for outbound access from nodes
     * @param WhiteHostList Allowlist for outbound access from nodes
     */
    public void setWhiteHostList(String [] WhiteHostList) {
        this.WhiteHostList = WhiteHostList;
    }

    public OutboundPublicAcl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutboundPublicAcl(OutboundPublicAcl source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.WhiteHostList != null) {
            this.WhiteHostList = new String[source.WhiteHostList.length];
            for (int i = 0; i < source.WhiteHostList.length; i++) {
                this.WhiteHostList[i] = new String(source.WhiteHostList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArraySimple(map, prefix + "WhiteHostList.", this.WhiteHostList);

    }
}

