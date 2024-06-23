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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationalFunctionsRequest extends AbstractModel {

    /**
    * Scenario Type: Development, In Use
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Function Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Display Name
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Standard Mode Development Environment: DEV
Standard Mode Production Environment: PROD
Simple Mode: ALL

    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
     * Get Scenario Type: Development, In Use 
     * @return Type Scenario Type: Development, In Use
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Scenario Type: Development, In Use
     * @param Type Scenario Type: Development, In Use
     */
    public void setType(String Type) {
        this.Type = Type;
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

    /**
     * Get Function Name 
     * @return Name Function Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Function Name
     * @param Name Function Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Display Name 
     * @return DisplayName Display Name
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Display Name
     * @param DisplayName Display Name
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Standard Mode Development Environment: DEV
Standard Mode Production Environment: PROD
Simple Mode: ALL
 
     * @return EnvType Standard Mode Development Environment: DEV
Standard Mode Production Environment: PROD
Simple Mode: ALL

     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Standard Mode Development Environment: DEV
Standard Mode Production Environment: PROD
Simple Mode: ALL

     * @param EnvType Standard Mode Development Environment: DEV
Standard Mode Production Environment: PROD
Simple Mode: ALL

     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    public DescribeOrganizationalFunctionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationalFunctionsRequest(DescribeOrganizationalFunctionsRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);

    }
}

