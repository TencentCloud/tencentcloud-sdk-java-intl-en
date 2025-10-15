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

public class InstanceLog extends AbstractModel {

    /**
    * Instance unique id.

    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Project ID.


    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Specifies the code content to run.

    */
    @SerializedName("CodeContent")
    @Expose
    private String CodeContent;

    /**
    * log information

    */
    @SerializedName("LogInfo")
    @Expose
    private String LogInfo;

    /**
    * Used for paginated log queries; has no specific business meaning.

For the first query, set the value to null.

For subsequent queries, use the NextCursor value returned from the previous query.
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
     * Get Instance unique id.
 
     * @return InstanceKey Instance unique id.

     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Instance unique id.

     * @param InstanceKey Instance unique id.

     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
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

    /**
     * Get Specifies the code content to run.
 
     * @return CodeContent Specifies the code content to run.

     */
    public String getCodeContent() {
        return this.CodeContent;
    }

    /**
     * Set Specifies the code content to run.

     * @param CodeContent Specifies the code content to run.

     */
    public void setCodeContent(String CodeContent) {
        this.CodeContent = CodeContent;
    }

    /**
     * Get log information
 
     * @return LogInfo log information

     */
    public String getLogInfo() {
        return this.LogInfo;
    }

    /**
     * Set log information

     * @param LogInfo log information

     */
    public void setLogInfo(String LogInfo) {
        this.LogInfo = LogInfo;
    }

    /**
     * Get Used for paginated log queries; has no specific business meaning.

For the first query, set the value to null.

For subsequent queries, use the NextCursor value returned from the previous query. 
     * @return NextCursor Used for paginated log queries; has no specific business meaning.

For the first query, set the value to null.

For subsequent queries, use the NextCursor value returned from the previous query.
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set Used for paginated log queries; has no specific business meaning.

For the first query, set the value to null.

For subsequent queries, use the NextCursor value returned from the previous query.
     * @param NextCursor Used for paginated log queries; has no specific business meaning.

For the first query, set the value to null.

For subsequent queries, use the NextCursor value returned from the previous query.
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    public InstanceLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLog(InstanceLog source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeContent != null) {
            this.CodeContent = new String(source.CodeContent);
        }
        if (source.LogInfo != null) {
            this.LogInfo = new String(source.LogInfo);
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeContent", this.CodeContent);
        this.setParamSimple(map, prefix + "LogInfo", this.LogInfo);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);

    }
}

