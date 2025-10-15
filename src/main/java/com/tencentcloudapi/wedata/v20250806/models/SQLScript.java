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

public class SQLScript extends AbstractModel {

    /**
    * Script id.

    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * Script name.

    */
    @SerializedName("ScriptName")
    @Expose
    private String ScriptName;

    /**
    * Specifies the script owner uin.

    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Parent folder path, /aaa/bbb/ccc.

    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Specifies the script configuration.

    */
    @SerializedName("ScriptConfig")
    @Expose
    private SQLScriptConfig ScriptConfig;

    /**
    * Specifies the script content.

    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Latest operator.

    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * Project ID.


    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Update time. format: yyyy-MM-dd hh:MM:ss.

    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Creation time. format: yyyy-MM-dd hh:MM:ss.

    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Access permission: SHARED, PRIVATE.

    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

    /**
    * Full path of the node, /aaa/bbb/ccc.ipynb, consists of the name of each node.

    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get Script id.
 
     * @return ScriptId Script id.

     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set Script id.

     * @param ScriptId Script id.

     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get Script name.
 
     * @return ScriptName Script name.

     */
    public String getScriptName() {
        return this.ScriptName;
    }

    /**
     * Set Script name.

     * @param ScriptName Script name.

     */
    public void setScriptName(String ScriptName) {
        this.ScriptName = ScriptName;
    }

    /**
     * Get Specifies the script owner uin.
 
     * @return OwnerUin Specifies the script owner uin.

     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Specifies the script owner uin.

     * @param OwnerUin Specifies the script owner uin.

     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Parent folder path, /aaa/bbb/ccc.
 
     * @return ParentFolderPath Parent folder path, /aaa/bbb/ccc.

     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Parent folder path, /aaa/bbb/ccc.

     * @param ParentFolderPath Parent folder path, /aaa/bbb/ccc.

     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Specifies the script configuration.
 
     * @return ScriptConfig Specifies the script configuration.

     */
    public SQLScriptConfig getScriptConfig() {
        return this.ScriptConfig;
    }

    /**
     * Set Specifies the script configuration.

     * @param ScriptConfig Specifies the script configuration.

     */
    public void setScriptConfig(SQLScriptConfig ScriptConfig) {
        this.ScriptConfig = ScriptConfig;
    }

    /**
     * Get Specifies the script content.
 
     * @return ScriptContent Specifies the script content.

     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Specifies the script content.

     * @param ScriptContent Specifies the script content.

     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Latest operator.
 
     * @return UpdateUserUin Latest operator.

     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set Latest operator.

     * @param UpdateUserUin Latest operator.

     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
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
     * Get Update time. format: yyyy-MM-dd hh:MM:ss.
 
     * @return UpdateTime Update time. format: yyyy-MM-dd hh:MM:ss.

     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. format: yyyy-MM-dd hh:MM:ss.

     * @param UpdateTime Update time. format: yyyy-MM-dd hh:MM:ss.

     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creation time. format: yyyy-MM-dd hh:MM:ss.
 
     * @return CreateTime Creation time. format: yyyy-MM-dd hh:MM:ss.

     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. format: yyyy-MM-dd hh:MM:ss.

     * @param CreateTime Creation time. format: yyyy-MM-dd hh:MM:ss.

     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Access permission: SHARED, PRIVATE.
 
     * @return AccessScope Access permission: SHARED, PRIVATE.

     */
    public String getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set Access permission: SHARED, PRIVATE.

     * @param AccessScope Access permission: SHARED, PRIVATE.

     */
    public void setAccessScope(String AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get Full path of the node, /aaa/bbb/ccc.ipynb, consists of the name of each node.
 
     * @return Path Full path of the node, /aaa/bbb/ccc.ipynb, consists of the name of each node.

     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Full path of the node, /aaa/bbb/ccc.ipynb, consists of the name of each node.

     * @param Path Full path of the node, /aaa/bbb/ccc.ipynb, consists of the name of each node.

     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public SQLScript() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLScript(SQLScript source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ScriptName != null) {
            this.ScriptName = new String(source.ScriptName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.ScriptConfig != null) {
            this.ScriptConfig = new SQLScriptConfig(source.ScriptConfig);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ScriptName", this.ScriptName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamObj(map, prefix + "ScriptConfig.", this.ScriptConfig);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

