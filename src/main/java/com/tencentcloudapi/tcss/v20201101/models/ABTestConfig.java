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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ABTestConfig extends AbstractModel {

    /**
    * Canary project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Valid values: `true` (in canary upgrade); `false` (not in canary upgrade).
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get Canary project name 
     * @return ProjectName Canary project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Canary project name
     * @param ProjectName Canary project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Valid values: `true` (in canary upgrade); `false` (not in canary upgrade). 
     * @return Status Valid values: `true` (in canary upgrade); `false` (not in canary upgrade).
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Valid values: `true` (in canary upgrade); `false` (not in canary upgrade).
     * @param Status Valid values: `true` (in canary upgrade); `false` (not in canary upgrade).
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public ABTestConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ABTestConfig(ABTestConfig source) {
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

