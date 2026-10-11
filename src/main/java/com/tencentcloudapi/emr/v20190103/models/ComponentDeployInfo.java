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

public class ComponentDeployInfo extends AbstractModel {

    /**
    * Role name.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * List of UUIDs of nodes to be installed.
    */
    @SerializedName("DeployHostUuidList")
    @Expose
    private String [] DeployHostUuidList;

    /**
     * Get Role name. 
     * @return ComponentName Role name.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Role name.
     * @param ComponentName Role name.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get List of UUIDs of nodes to be installed. 
     * @return DeployHostUuidList List of UUIDs of nodes to be installed.
     */
    public String [] getDeployHostUuidList() {
        return this.DeployHostUuidList;
    }

    /**
     * Set List of UUIDs of nodes to be installed.
     * @param DeployHostUuidList List of UUIDs of nodes to be installed.
     */
    public void setDeployHostUuidList(String [] DeployHostUuidList) {
        this.DeployHostUuidList = DeployHostUuidList;
    }

    public ComponentDeployInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentDeployInfo(ComponentDeployInfo source) {
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.DeployHostUuidList != null) {
            this.DeployHostUuidList = new String[source.DeployHostUuidList.length];
            for (int i = 0; i < source.DeployHostUuidList.length; i++) {
                this.DeployHostUuidList[i] = new String(source.DeployHostUuidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamArraySimple(map, prefix + "DeployHostUuidList.", this.DeployHostUuidList);

    }
}

