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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNameOrDescByDpIdRequest extends AbstractModel{

    /**
    * Placement group ID
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * Name of a placement group, which can contain up to 60 characters. The placement group name and description can’t be empty.
    */
    @SerializedName("DeployGroupName")
    @Expose
    private String DeployGroupName;

    /**
    * Description of a placement group, which can contain up to 200 characters. The placement group name and description can’t be empty.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Placement group ID 
     * @return DeployGroupId Placement group ID
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set Placement group ID
     * @param DeployGroupId Placement group ID
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get Name of a placement group, which can contain up to 60 characters. The placement group name and description can’t be empty. 
     * @return DeployGroupName Name of a placement group, which can contain up to 60 characters. The placement group name and description can’t be empty.
     */
    public String getDeployGroupName() {
        return this.DeployGroupName;
    }

    /**
     * Set Name of a placement group, which can contain up to 60 characters. The placement group name and description can’t be empty.
     * @param DeployGroupName Name of a placement group, which can contain up to 60 characters. The placement group name and description can’t be empty.
     */
    public void setDeployGroupName(String DeployGroupName) {
        this.DeployGroupName = DeployGroupName;
    }

    /**
     * Get Description of a placement group, which can contain up to 200 characters. The placement group name and description can’t be empty. 
     * @return Description Description of a placement group, which can contain up to 200 characters. The placement group name and description can’t be empty.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of a placement group, which can contain up to 200 characters. The placement group name and description can’t be empty.
     * @param Description Description of a placement group, which can contain up to 200 characters. The placement group name and description can’t be empty.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyNameOrDescByDpIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNameOrDescByDpIdRequest(ModifyNameOrDescByDpIdRequest source) {
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.DeployGroupName != null) {
            this.DeployGroupName = new String(source.DeployGroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "DeployGroupName", this.DeployGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

