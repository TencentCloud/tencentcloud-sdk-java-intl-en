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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSQLScriptRequest extends AbstractModel {

    /**
    * Script Id.
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Script Id. 
     * @return ScriptId Script Id.
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set Script Id.
     * @param ScriptId Script Id.
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get Project ID.
 
     * @return ProjectId Project ID.

     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

     * @param ProjectId Project ID.

     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DeleteSQLScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSQLScriptRequest(DeleteSQLScriptRequest source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

