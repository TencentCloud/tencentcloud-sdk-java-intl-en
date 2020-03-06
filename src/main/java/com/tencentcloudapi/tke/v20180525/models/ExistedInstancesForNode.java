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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExistedInstancesForNode extends AbstractModel{

    /**
    * Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER).
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * Reinstallation parameter of existing instances
    */
    @SerializedName("ExistedInstancesPara")
    @Expose
    private ExistedInstancesPara ExistedInstancesPara;

    /**
     * Get Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER). 
     * @return NodeRole Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER).
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER).
     * @param NodeRole Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER).
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get Reinstallation parameter of existing instances 
     * @return ExistedInstancesPara Reinstallation parameter of existing instances
     */
    public ExistedInstancesPara getExistedInstancesPara() {
        return this.ExistedInstancesPara;
    }

    /**
     * Set Reinstallation parameter of existing instances
     * @param ExistedInstancesPara Reinstallation parameter of existing instances
     */
    public void setExistedInstancesPara(ExistedInstancesPara ExistedInstancesPara) {
        this.ExistedInstancesPara = ExistedInstancesPara;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamObj(map, prefix + "ExistedInstancesPara.", this.ExistedInstancesPara);

    }
}

