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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceProjectRequest extends AbstractModel{

    /**
    * Array of instance IDs in the format of mssql-j8kv137v
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Project ID. If this parameter is 0, the default project will be used
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get Array of instance IDs in the format of mssql-j8kv137v 
     * @return InstanceIdSet Array of instance IDs in the format of mssql-j8kv137v
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set Array of instance IDs in the format of mssql-j8kv137v
     * @param InstanceIdSet Array of instance IDs in the format of mssql-j8kv137v
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Project ID. If this parameter is 0, the default project will be used 
     * @return ProjectId Project ID. If this parameter is 0, the default project will be used
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. If this parameter is 0, the default project will be used
     * @param ProjectId Project ID. If this parameter is 0, the default project will be used
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

