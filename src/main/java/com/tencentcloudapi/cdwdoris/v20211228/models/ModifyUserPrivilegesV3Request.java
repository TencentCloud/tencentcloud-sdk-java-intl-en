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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserPrivilegesV3Request extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * User permission
    */
    @SerializedName("UserPrivileges")
    @Expose
    private UpdateUserPrivileges UserPrivileges;

    /**
    * The IP address of the user link	
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get User permission 
     * @return UserPrivileges User permission
     */
    public UpdateUserPrivileges getUserPrivileges() {
        return this.UserPrivileges;
    }

    /**
     * Set User permission
     * @param UserPrivileges User permission
     */
    public void setUserPrivileges(UpdateUserPrivileges UserPrivileges) {
        this.UserPrivileges = UserPrivileges;
    }

    /**
     * Get The IP address of the user link	 
     * @return WhiteHost The IP address of the user link	
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set The IP address of the user link	
     * @param WhiteHost The IP address of the user link	
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    public ModifyUserPrivilegesV3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserPrivilegesV3Request(ModifyUserPrivilegesV3Request source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserPrivileges != null) {
            this.UserPrivileges = new UpdateUserPrivileges(source.UserPrivileges);
        }
        if (source.WhiteHost != null) {
            this.WhiteHost = new String(source.WhiteHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamObj(map, prefix + "UserPrivileges.", this.UserPrivileges);
        this.setParamSimple(map, prefix + "WhiteHost", this.WhiteHost);

    }
}

