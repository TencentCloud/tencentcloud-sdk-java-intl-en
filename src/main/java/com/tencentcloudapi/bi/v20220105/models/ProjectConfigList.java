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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectConfigList extends AbstractModel {

    /**
    * Module group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModuleGroup")
    @Expose
    private String ModuleGroup;

    /**
    * Content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Components")
    @Expose
    private ProjectConfigResult [] Components;

    /**
     * Get Module group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModuleGroup Module group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModuleGroup() {
        return this.ModuleGroup;
    }

    /**
     * Set Module group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModuleGroup Module group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModuleGroup(String ModuleGroup) {
        this.ModuleGroup = ModuleGroup;
    }

    /**
     * Get Content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Components Content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProjectConfigResult [] getComponents() {
        return this.Components;
    }

    /**
     * Set Content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Components Content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponents(ProjectConfigResult [] Components) {
        this.Components = Components;
    }

    public ProjectConfigList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectConfigList(ProjectConfigList source) {
        if (source.ModuleGroup != null) {
            this.ModuleGroup = new String(source.ModuleGroup);
        }
        if (source.Components != null) {
            this.Components = new ProjectConfigResult[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new ProjectConfigResult(source.Components[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleGroup", this.ModuleGroup);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);

    }
}

