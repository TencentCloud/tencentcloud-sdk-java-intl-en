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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ABTestConfig extends AbstractModel {

    /**
    * Greyscale project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * true: grayscale release in progress; false: grayscale release not in progress.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get Greyscale project name 
     * @return ProjectName Greyscale project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Greyscale project name
     * @param ProjectName Greyscale project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get true: grayscale release in progress; false: grayscale release not in progress. 
     * @return Status true: grayscale release in progress; false: grayscale release not in progress.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set true: grayscale release in progress; false: grayscale release not in progress.
     * @param Status true: grayscale release in progress; false: grayscale release not in progress.
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

