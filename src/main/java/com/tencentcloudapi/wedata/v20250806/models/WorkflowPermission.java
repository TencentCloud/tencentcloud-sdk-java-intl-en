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

public class WorkflowPermission extends AbstractModel {

    /**
    * Target type (user: user, role: role).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PermissionTargetType")
    @Expose
    private String PermissionTargetType;

    /**
    * id array of the authorization target (userId/roleId).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PermissionTargetId")
    @Expose
    private String PermissionTargetId;

    /**
    * Authorization permission type array (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PermissionTypeList")
    @Expose
    private String [] PermissionTypeList;

    /**
     * Get Target type (user: user, role: role).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PermissionTargetType Target type (user: user, role: role).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPermissionTargetType() {
        return this.PermissionTargetType;
    }

    /**
     * Set Target type (user: user, role: role).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PermissionTargetType Target type (user: user, role: role).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermissionTargetType(String PermissionTargetType) {
        this.PermissionTargetType = PermissionTargetType;
    }

    /**
     * Get id array of the authorization target (userId/roleId).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PermissionTargetId id array of the authorization target (userId/roleId).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPermissionTargetId() {
        return this.PermissionTargetId;
    }

    /**
     * Set id array of the authorization target (userId/roleId).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PermissionTargetId id array of the authorization target (userId/roleId).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermissionTargetId(String PermissionTargetId) {
        this.PermissionTargetId = PermissionTargetId;
    }

    /**
     * Get Authorization permission type array (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PermissionTypeList Authorization permission type array (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPermissionTypeList() {
        return this.PermissionTypeList;
    }

    /**
     * Set Authorization permission type array (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PermissionTypeList Authorization permission type array (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermissionTypeList(String [] PermissionTypeList) {
        this.PermissionTypeList = PermissionTypeList;
    }

    public WorkflowPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowPermission(WorkflowPermission source) {
        if (source.PermissionTargetType != null) {
            this.PermissionTargetType = new String(source.PermissionTargetType);
        }
        if (source.PermissionTargetId != null) {
            this.PermissionTargetId = new String(source.PermissionTargetId);
        }
        if (source.PermissionTypeList != null) {
            this.PermissionTypeList = new String[source.PermissionTypeList.length];
            for (int i = 0; i < source.PermissionTypeList.length; i++) {
                this.PermissionTypeList[i] = new String(source.PermissionTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PermissionTargetType", this.PermissionTargetType);
        this.setParamSimple(map, prefix + "PermissionTargetId", this.PermissionTargetId);
        this.setParamArraySimple(map, prefix + "PermissionTypeList.", this.PermissionTypeList);

    }
}

