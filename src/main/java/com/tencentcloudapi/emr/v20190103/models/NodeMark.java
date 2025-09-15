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

public class NodeMark extends AbstractModel {

    /**
    * Node type: master, core, task, router.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node tag information: currently used only in the Terraform. It serves as an input parameter to differentiate information of nodes with the same type.
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * Availability zone name.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Node type: master, core, task, router. 
     * @return NodeType Node type: master, core, task, router.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type: master, core, task, router.
     * @param NodeType Node type: master, core, task, router.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node tag information: currently used only in the Terraform. It serves as an input parameter to differentiate information of nodes with the same type. 
     * @return NodeNames Node tag information: currently used only in the Terraform. It serves as an input parameter to differentiate information of nodes with the same type.
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set Node tag information: currently used only in the Terraform. It serves as an input parameter to differentiate information of nodes with the same type.
     * @param NodeNames Node tag information: currently used only in the Terraform. It serves as an input parameter to differentiate information of nodes with the same type.
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get Availability zone name. 
     * @return Zone Availability zone name.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone name.
     * @param Zone Availability zone name.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public NodeMark() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeMark(NodeMark source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

