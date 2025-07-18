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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDataEngineRequest extends AbstractModel {

    /**
    * The name of the primary cluster.
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Whether to start the standby cluster.
    */
    @SerializedName("StartStandbyCluster")
    @Expose
    private Boolean StartStandbyCluster;

    /**
     * Get The name of the primary cluster. 
     * @return DataEngineName The name of the primary cluster.
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set The name of the primary cluster.
     * @param DataEngineName The name of the primary cluster.
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Whether to start the standby cluster. 
     * @return StartStandbyCluster Whether to start the standby cluster.
     */
    public Boolean getStartStandbyCluster() {
        return this.StartStandbyCluster;
    }

    /**
     * Set Whether to start the standby cluster.
     * @param StartStandbyCluster Whether to start the standby cluster.
     */
    public void setStartStandbyCluster(Boolean StartStandbyCluster) {
        this.StartStandbyCluster = StartStandbyCluster;
    }

    public SwitchDataEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDataEngineRequest(SwitchDataEngineRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.StartStandbyCluster != null) {
            this.StartStandbyCluster = new Boolean(source.StartStandbyCluster);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "StartStandbyCluster", this.StartStandbyCluster);

    }
}

