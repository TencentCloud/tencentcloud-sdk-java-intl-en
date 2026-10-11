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
    * <p>Cluster name.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>User group name.</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>User list.</p>
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * <p>User group description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Enumeration class. Valid values: ADD, DELETE, and SYNC.</p><p>Enumeration class description:</p><ul><li>ADD: Users added in batches. Adding the same user for multiple times does not trigger an error.</li><li>DELETE: Users deleted from the user group in batches. Deleting a non-existing user does not trigger an error.</li><li>SYNC: Used to synchronize the entire user group. If the list is empty, the entire user group is cleared.<br>Default value: SYNC.</li></ul>
    */
    @SerializedName("OperateAction")
    @Expose
    private String OperateAction;

    /**
     * Get <p>Cluster name.</p> 
     * @return InstanceId <p>Cluster name.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param InstanceId <p>Cluster name.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>User group name.</p> 
     * @return Group <p>User group name.</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>User group name.</p>
     * @param Group <p>User group name.</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>User list.</p> 
     * @return Users <p>User list.</p>
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>User list.</p>
     * @param Users <p>User list.</p>
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get <p>User group description.</p> 
     * @return Description <p>User group description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>User group description.</p>
     * @param Description <p>User group description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Enumeration class. Valid values: ADD, DELETE, and SYNC.</p><p>Enumeration class description:</p><ul><li>ADD: Users added in batches. Adding the same user for multiple times does not trigger an error.</li><li>DELETE: Users deleted from the user group in batches. Deleting a non-existing user does not trigger an error.</li><li>SYNC: Used to synchronize the entire user group. If the list is empty, the entire user group is cleared.<br>Default value: SYNC.</li></ul> 
     * @return OperateAction <p>Enumeration class. Valid values: ADD, DELETE, and SYNC.</p><p>Enumeration class description:</p><ul><li>ADD: Users added in batches. Adding the same user for multiple times does not trigger an error.</li><li>DELETE: Users deleted from the user group in batches. Deleting a non-existing user does not trigger an error.</li><li>SYNC: Used to synchronize the entire user group. If the list is empty, the entire user group is cleared.<br>Default value: SYNC.</li></ul>
     */
    public String getOperateAction() {
        return this.OperateAction;
    }

    /**
     * Set <p>Enumeration class. Valid values: ADD, DELETE, and SYNC.</p><p>Enumeration class description:</p><ul><li>ADD: Users added in batches. Adding the same user for multiple times does not trigger an error.</li><li>DELETE: Users deleted from the user group in batches. Deleting a non-existing user does not trigger an error.</li><li>SYNC: Used to synchronize the entire user group. If the list is empty, the entire user group is cleared.<br>Default value: SYNC.</li></ul>
     * @param OperateAction <p>Enumeration class. Valid values: ADD, DELETE, and SYNC.</p><p>Enumeration class description:</p><ul><li>ADD: Users added in batches. Adding the same user for multiple times does not trigger an error.</li><li>DELETE: Users deleted from the user group in batches. Deleting a non-existing user does not trigger an error.</li><li>SYNC: Used to synchronize the entire user group. If the list is empty, the entire user group is cleared.<br>Default value: SYNC.</li></ul>
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

