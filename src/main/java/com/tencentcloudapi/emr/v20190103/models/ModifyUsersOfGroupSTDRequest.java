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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUsersOfGroupSTDRequest extends AbstractModel {

    /**
    * Cluster name.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * User group name.
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * User list.
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * User group description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Enumeration class. Valid values: ADD, DELETE, SYNC.


Enumeration class description.
- ADD: Batched users to add. Adding the same user multiple times will not trigger an error.
- DELETE: Batched users to remove from the user group. Deleting non-existing users will not trigger an error.
- SYNC: Overwrites the entire user group. An empty list clears all existing members.
Defaults to SYNC.

    */
    @SerializedName("OperateAction")
    @Expose
    private String OperateAction;

    /**
     * Get Cluster name. 
     * @return InstanceId Cluster name.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster name.
     * @param InstanceId Cluster name.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get User group name. 
     * @return Group User group name.
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set User group name.
     * @param Group User group name.
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get User list. 
     * @return Users User list.
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set User list.
     * @param Users User list.
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get User group description. 
     * @return Description User group description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User group description.
     * @param Description User group description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Enumeration class. Valid values: ADD, DELETE, SYNC.


Enumeration class description.
- ADD: Batched users to add. Adding the same user multiple times will not trigger an error.
- DELETE: Batched users to remove from the user group. Deleting non-existing users will not trigger an error.
- SYNC: Overwrites the entire user group. An empty list clears all existing members.
Defaults to SYNC.
 
     * @return OperateAction Enumeration class. Valid values: ADD, DELETE, SYNC.


Enumeration class description.
- ADD: Batched users to add. Adding the same user multiple times will not trigger an error.
- DELETE: Batched users to remove from the user group. Deleting non-existing users will not trigger an error.
- SYNC: Overwrites the entire user group. An empty list clears all existing members.
Defaults to SYNC.

     */
    public String getOperateAction() {
        return this.OperateAction;
    }

    /**
     * Set Enumeration class. Valid values: ADD, DELETE, SYNC.


Enumeration class description.
- ADD: Batched users to add. Adding the same user multiple times will not trigger an error.
- DELETE: Batched users to remove from the user group. Deleting non-existing users will not trigger an error.
- SYNC: Overwrites the entire user group. An empty list clears all existing members.
Defaults to SYNC.

     * @param OperateAction Enumeration class. Valid values: ADD, DELETE, SYNC.


Enumeration class description.
- ADD: Batched users to add. Adding the same user multiple times will not trigger an error.
- DELETE: Batched users to remove from the user group. Deleting non-existing users will not trigger an error.
- SYNC: Overwrites the entire user group. An empty list clears all existing members.
Defaults to SYNC.

     */
    public void setOperateAction(String OperateAction) {
        this.OperateAction = OperateAction;
    }

    public ModifyUsersOfGroupSTDRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUsersOfGroupSTDRequest(ModifyUsersOfGroupSTDRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OperateAction != null) {
            this.OperateAction = new String(source.OperateAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OperateAction", this.OperateAction);

    }
}

