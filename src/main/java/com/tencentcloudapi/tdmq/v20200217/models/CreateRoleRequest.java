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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoleRequest extends AbstractModel {

    /**
    * Role name, which can contain up to 32 letters, digits, hyphens, and underscores.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Remarks (up to 128 characters).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Cluster ID (required)
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Role name, which can contain up to 32 letters, digits, hyphens, and underscores. 
     * @return RoleName Role name, which can contain up to 32 letters, digits, hyphens, and underscores.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name, which can contain up to 32 letters, digits, hyphens, and underscores.
     * @param RoleName Role name, which can contain up to 32 letters, digits, hyphens, and underscores.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Remarks (up to 128 characters). 
     * @return Remark Remarks (up to 128 characters).
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
     * @param Remark Remarks (up to 128 characters).
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Cluster ID (required) 
     * @return ClusterId Cluster ID (required)
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID (required)
     * @param ClusterId Cluster ID (required)
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public CreateRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleRequest(CreateRoleRequest source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

