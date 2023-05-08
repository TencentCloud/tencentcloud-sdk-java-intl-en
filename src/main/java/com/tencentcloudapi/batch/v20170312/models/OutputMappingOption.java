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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputMappingOption extends AbstractModel{

    /**
    * The mapped output workspace on the container side for the instance.
`BATCH_WORKSPACE` (Default): The workspace is the workspace defined for the usage of Batch Compute. Batch Compute ensures the isolation between jobs.
`GLOBAL_WORKSPACE`: The workspace is the instance OS space..
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Workspace")
    @Expose
    private String Workspace;

    /**
     * Get The mapped output workspace on the container side for the instance.
`BATCH_WORKSPACE` (Default): The workspace is the workspace defined for the usage of Batch Compute. Batch Compute ensures the isolation between jobs.
`GLOBAL_WORKSPACE`: The workspace is the instance OS space..
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Workspace The mapped output workspace on the container side for the instance.
`BATCH_WORKSPACE` (Default): The workspace is the workspace defined for the usage of Batch Compute. Batch Compute ensures the isolation between jobs.
`GLOBAL_WORKSPACE`: The workspace is the instance OS space..
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getWorkspace() {
        return this.Workspace;
    }

    /**
     * Set The mapped output workspace on the container side for the instance.
`BATCH_WORKSPACE` (Default): The workspace is the workspace defined for the usage of Batch Compute. Batch Compute ensures the isolation between jobs.
`GLOBAL_WORKSPACE`: The workspace is the instance OS space..
Note: This field may return `null`, indicating that no valid value was found.
     * @param Workspace The mapped output workspace on the container side for the instance.
`BATCH_WORKSPACE` (Default): The workspace is the workspace defined for the usage of Batch Compute. Batch Compute ensures the isolation between jobs.
`GLOBAL_WORKSPACE`: The workspace is the instance OS space..
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setWorkspace(String Workspace) {
        this.Workspace = Workspace;
    }

    public OutputMappingOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputMappingOption(OutputMappingOption source) {
        if (source.Workspace != null) {
            this.Workspace = new String(source.Workspace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Workspace", this.Workspace);

    }
}

