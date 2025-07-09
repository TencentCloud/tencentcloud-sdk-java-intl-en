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

public class DeleteDataEngineRequest extends AbstractModel {

    /**
    * Delete the name array of virtual clusters.
    */
    @SerializedName("DataEngineNames")
    @Expose
    private String [] DataEngineNames;

    /**
     * Get Delete the name array of virtual clusters. 
     * @return DataEngineNames Delete the name array of virtual clusters.
     */
    public String [] getDataEngineNames() {
        return this.DataEngineNames;
    }

    /**
     * Set Delete the name array of virtual clusters.
     * @param DataEngineNames Delete the name array of virtual clusters.
     */
    public void setDataEngineNames(String [] DataEngineNames) {
        this.DataEngineNames = DataEngineNames;
    }

    public DeleteDataEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDataEngineRequest(DeleteDataEngineRequest source) {
        if (source.DataEngineNames != null) {
            this.DataEngineNames = new String[source.DataEngineNames.length];
            for (int i = 0; i < source.DataEngineNames.length; i++) {
                this.DataEngineNames[i] = new String(source.DataEngineNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataEngineNames.", this.DataEngineNames);

    }
}

