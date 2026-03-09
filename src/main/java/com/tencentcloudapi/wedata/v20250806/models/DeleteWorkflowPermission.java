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

public class DeleteWorkflowPermission extends AbstractModel {

    /**
    * Target type to delete (user: user, role: role, group: group).
    */
    @SerializedName("PermissionTargetType")
    @Expose
    private String PermissionTargetType;

    /**
    * Authorization target id (userId/roleId) to delete.
    */
    @SerializedName("PermissionTargetId")
    @Expose
    private String PermissionTargetId;

    /**
    * Type array of authorization permissions to delete (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
    */
    @SerializedName("PermissionTypeList")
    @Expose
    private String [] PermissionTypeList;

    /**
     * Get Target type to delete (user: user, role: role, group: group). 
     * @return PermissionTargetType Target type to delete (user: user, role: role, group: group).
     */
    public String getPermissionTargetType() {
        return this.PermissionTargetType;
    }

    /**
     * Set Target type to delete (user: user, role: role, group: group).
     * @param PermissionTargetType Target type to delete (user: user, role: role, group: group).
     */
    public void setPermissionTargetType(String PermissionTargetType) {
        this.PermissionTargetType = PermissionTargetType;
    }

    /**
     * Get Authorization target id (userId/roleId) to delete. 
     * @return PermissionTargetId Authorization target id (userId/roleId) to delete.
     */
    public String getPermissionTargetId() {
        return this.PermissionTargetId;
    }

    /**
     * Set Authorization target id (userId/roleId) to delete.
     * @param PermissionTargetId Authorization target id (userId/roleId) to delete.
     */
    public void setPermissionTargetId(String PermissionTargetId) {
        this.PermissionTargetId = PermissionTargetId;
    }

    /**
     * Get Type array of authorization permissions to delete (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE). 
     * @return PermissionTypeList Type array of authorization permissions to delete (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
     */
    public String [] getPermissionTypeList() {
        return this.PermissionTypeList;
    }

    /**
     * Set Type array of authorization permissions to delete (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
     * @param PermissionTypeList Type array of authorization permissions to delete (CAN_VIEW/CAN_RUN/CAN_EDIT/CAN_MANAGE, currently only support CAN_MANAGE).
     */
    public void setPermissionTypeList(String [] PermissionTypeList) {
        this.PermissionTypeList = PermissionTypeList;
    }

    public DeleteWorkflowPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWorkflowPermission(DeleteWorkflowPermission source) {
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

