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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadContentRequest extends AbstractModel {

    /**
    * Script Upload Information
    */
    @SerializedName("ScriptRequestInfo")
    @Expose
    private ScriptRequestInfo ScriptRequestInfo;

    /**
    * Request Source, WEB frontend; CLIENT client
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Script Upload Information 
     * @return ScriptRequestInfo Script Upload Information
     */
    public ScriptRequestInfo getScriptRequestInfo() {
        return this.ScriptRequestInfo;
    }

    /**
     * Set Script Upload Information
     * @param ScriptRequestInfo Script Upload Information
     */
    public void setScriptRequestInfo(ScriptRequestInfo ScriptRequestInfo) {
        this.ScriptRequestInfo = ScriptRequestInfo;
    }

    /**
     * Get Request Source, WEB frontend; CLIENT client 
     * @return RequestFromSource Request Source, WEB frontend; CLIENT client
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set Request Source, WEB frontend; CLIENT client
     * @param RequestFromSource Request Source, WEB frontend; CLIENT client
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public UploadContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadContentRequest(UploadContentRequest source) {
        if (source.ScriptRequestInfo != null) {
            this.ScriptRequestInfo = new ScriptRequestInfo(source.ScriptRequestInfo);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ScriptRequestInfo.", this.ScriptRequestInfo);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

