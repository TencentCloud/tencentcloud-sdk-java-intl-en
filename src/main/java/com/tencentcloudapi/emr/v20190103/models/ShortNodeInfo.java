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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShortNodeInfo extends AbstractModel{

    /**
    * Node type: Master/Core/Task/Router/Common
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Number of nodes
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeSize")
    @Expose
    private Long NodeSize;

    /**
     * Get Node type: Master/Core/Task/Router/Common
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return NodeType Node type: Master/Core/Task/Router/Common
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type: Master/Core/Task/Router/Common
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param NodeType Node type: Master/Core/Task/Router/Common
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Number of nodes
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return NodeSize Number of nodes
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getNodeSize() {
        return this.NodeSize;
    }

    /**
     * Set Number of nodes
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param NodeSize Number of nodes
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNodeSize(Long NodeSize) {
        this.NodeSize = NodeSize;
    }

    public ShortNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShortNodeInfo(ShortNodeInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeSize != null) {
            this.NodeSize = new Long(source.NodeSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeSize", this.NodeSize);

    }
}

