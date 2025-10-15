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

public class CodeFile extends AbstractModel {

    /**
    * Script ID


    */
    @SerializedName("CodeFileId")
    @Expose
    private String CodeFileId;

    /**
    * Script name.

    */
    @SerializedName("CodeFileName")
    @Expose
    private String CodeFileName;

    /**
    * Specifies the script owner uin.

    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Specifies the script configuration.

    */
    @SerializedName("CodeFileConfig")
    @Expose
    private CodeFileConfig CodeFileConfig;

    /**
    * Specifies the script content.

    */
    @SerializedName("CodeFileContent")
    @Expose
    private String CodeFileContent;

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
Note: This field may return null, indicating that no valid 
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
     * Get Script ID

 
     * @return CodeFileId Script ID


     */
    public String getCodeFileId() {
        return this.CodeFileId;
    }

    /**
     * Set Script ID


     * @param CodeFileId Script ID


     */
    public void setCodeFileId(String CodeFileId) {
        this.CodeFileId = CodeFileId;
    }

    /**
     * Get Script name.
 
     * @return CodeFileName Script name.

     */
    public String getCodeFileName() {
        return this.CodeFileName;
    }

    /**
     * Set Script name.

     * @param CodeFileName Script name.

     */
    public void setCodeFileName(String CodeFileName) {
        this.CodeFileName = CodeFileName;
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
     * Get Specifies the script configuration.
 
     * @return CodeFileConfig Specifies the script configuration.

     */
    public CodeFileConfig getCodeFileConfig() {
        return this.CodeFileConfig;
    }

    /**
     * Set Specifies the script configuration.

     * @param CodeFileConfig Specifies the script configuration.

     */
    public void setCodeFileConfig(CodeFileConfig CodeFileConfig) {
        this.CodeFileConfig = CodeFileConfig;
    }

    /**
     * Get Specifies the script content.
 
     * @return CodeFileContent Specifies the script content.

     */
    public String getCodeFileContent() {
        return this.CodeFileContent;
    }

    /**
     * Set Specifies the script content.

     * @param CodeFileContent Specifies the script content.

     */
    public void setCodeFileContent(String CodeFileContent) {
        this.CodeFileContent = CodeFileContent;
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
Note: This field may return null, indicating that no valid  
     * @return UpdateTime Update time. format: yyyy-MM-dd hh:MM:ss.
Note: This field may return null, indicating that no valid 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. format: yyyy-MM-dd hh:MM:ss.
Note: This field may return null, indicating that no valid 
     * @param UpdateTime Update time. format: yyyy-MM-dd hh:MM:ss.
Note: This field may return null, indicating that no valid 
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

    public CodeFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeFile(CodeFile source) {
        if (source.CodeFileId != null) {
            this.CodeFileId = new String(source.CodeFileId);
        }
        if (source.CodeFileName != null) {
            this.CodeFileName = new String(source.CodeFileName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CodeFileConfig != null) {
            this.CodeFileConfig = new CodeFileConfig(source.CodeFileConfig);
        }
        if (source.CodeFileContent != null) {
            this.CodeFileContent = new String(source.CodeFileContent);
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
        this.setParamSimple(map, prefix + "CodeFileId", this.CodeFileId);
        this.setParamSimple(map, prefix + "CodeFileName", this.CodeFileName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamObj(map, prefix + "CodeFileConfig.", this.CodeFileConfig);
        this.setParamSimple(map, prefix + "CodeFileContent", this.CodeFileContent);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

