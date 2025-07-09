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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddProjectRequest extends AbstractModel {

    /**
    * Project name.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Project description.
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get Project name. 
     * @return ProjectName Project name.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.
     * @param ProjectName Project name.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Project description. 
     * @return Info Project description.
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Project description.
     * @param Info Project description.
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    public AddProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddProjectRequest(AddProjectRequest source) {
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

