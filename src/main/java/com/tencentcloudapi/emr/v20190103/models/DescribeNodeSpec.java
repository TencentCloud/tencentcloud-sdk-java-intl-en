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

public class DescribeNodeSpec extends AbstractModel {

    /**
    * Node type.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node type name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Types array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Types")
    @Expose
    private NodeSpecType [] Types;

    /**
    * Cloud Managed Node (M Node) model specifications list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CmnTypes")
    @Expose
    private NodeSpecType [] CmnTypes;

    /**
     * Get Node type. 
     * @return NodeType Node type.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type.
     * @param NodeType Node type.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node type name. 
     * @return NodeName Node type name.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node type name.
     * @param NodeName Node type name.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Types array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Types Types array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeSpecType [] getTypes() {
        return this.Types;
    }

    /**
     * Set Types array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Types Types array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTypes(NodeSpecType [] Types) {
        this.Types = Types;
    }

    /**
     * Get Cloud Managed Node (M Node) model specifications list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CmnTypes Cloud Managed Node (M Node) model specifications list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeSpecType [] getCmnTypes() {
        return this.CmnTypes;
    }

    /**
     * Set Cloud Managed Node (M Node) model specifications list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CmnTypes Cloud Managed Node (M Node) model specifications list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCmnTypes(NodeSpecType [] CmnTypes) {
        this.CmnTypes = CmnTypes;
    }

    public DescribeNodeSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeSpec(DescribeNodeSpec source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Types != null) {
            this.Types = new NodeSpecType[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new NodeSpecType(source.Types[i]);
            }
        }
        if (source.CmnTypes != null) {
            this.CmnTypes = new NodeSpecType[source.CmnTypes.length];
            for (int i = 0; i < source.CmnTypes.length; i++) {
                this.CmnTypes[i] = new NodeSpecType(source.CmnTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamArrayObj(map, prefix + "Types.", this.Types);
        this.setParamArrayObj(map, prefix + "CmnTypes.", this.CmnTypes);

    }
}

