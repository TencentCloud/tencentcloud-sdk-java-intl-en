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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModuleItem extends AbstractModel {

    /**
    * Instance statistics of the node
    */
    @SerializedName("NodeInstanceNum")
    @Expose
    private NodeInstanceNum NodeInstanceNum;

    /**
    * Module information
    */
    @SerializedName("Module")
    @Expose
    private Module Module;

    /**
     * Get Instance statistics of the node 
     * @return NodeInstanceNum Instance statistics of the node
     */
    public NodeInstanceNum getNodeInstanceNum() {
        return this.NodeInstanceNum;
    }

    /**
     * Set Instance statistics of the node
     * @param NodeInstanceNum Instance statistics of the node
     */
    public void setNodeInstanceNum(NodeInstanceNum NodeInstanceNum) {
        this.NodeInstanceNum = NodeInstanceNum;
    }

    /**
     * Get Module information 
     * @return Module Module information
     */
    public Module getModule() {
        return this.Module;
    }

    /**
     * Set Module information
     * @param Module Module information
     */
    public void setModule(Module Module) {
        this.Module = Module;
    }

    public ModuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModuleItem(ModuleItem source) {
        if (source.NodeInstanceNum != null) {
            this.NodeInstanceNum = new NodeInstanceNum(source.NodeInstanceNum);
        }
        if (source.Module != null) {
            this.Module = new Module(source.Module);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NodeInstanceNum.", this.NodeInstanceNum);
        this.setParamObj(map, prefix + "Module.", this.Module);

    }
}

