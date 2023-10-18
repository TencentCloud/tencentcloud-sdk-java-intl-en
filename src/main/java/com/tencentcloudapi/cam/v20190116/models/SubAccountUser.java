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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubAccountUser extends AbstractModel {

    /**
    * Sub-user ID
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-user name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sub-user UID. UID is the unique identifier of a user who is a message recipient, while UIN is a unique identifier of a user.
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Sub-user remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * User type (1: root account; 2: sub-user; 3: WeCom sub-user; 4: collaborator; 5: message recipient)
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * 
    */
    @SerializedName("LastLoginIp")
    @Expose
    private String LastLoginIp;

    /**
    * 
    */
    @SerializedName("LastLoginTime")
    @Expose
    private String LastLoginTime;

    /**
     * Get Sub-user ID 
     * @return Uin Sub-user ID
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Sub-user ID
     * @param Uin Sub-user ID
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-user name 
     * @return Name Sub-user name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sub-user name
     * @param Name Sub-user name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sub-user UID. UID is the unique identifier of a user who is a message recipient, while UIN is a unique identifier of a user. 
     * @return Uid Sub-user UID. UID is the unique identifier of a user who is a message recipient, while UIN is a unique identifier of a user.
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Sub-user UID. UID is the unique identifier of a user who is a message recipient, while UIN is a unique identifier of a user.
     * @param Uid Sub-user UID. UID is the unique identifier of a user who is a message recipient, while UIN is a unique identifier of a user.
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Sub-user remarks 
     * @return Remark Sub-user remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sub-user remarks
     * @param Remark Sub-user remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get User type (1: root account; 2: sub-user; 3: WeCom sub-user; 4: collaborator; 5: message recipient) 
     * @return UserType User type (1: root account; 2: sub-user; 3: WeCom sub-user; 4: collaborator; 5: message recipient)
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set User type (1: root account; 2: sub-user; 3: WeCom sub-user; 4: collaborator; 5: message recipient)
     * @param UserType User type (1: root account; 2: sub-user; 3: WeCom sub-user; 4: collaborator; 5: message recipient)
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get  
     * @return LastLoginIp 
     */
    public String getLastLoginIp() {
        return this.LastLoginIp;
    }

    /**
     * Set 
     * @param LastLoginIp 
     */
    public void setLastLoginIp(String LastLoginIp) {
        this.LastLoginIp = LastLoginIp;
    }

    /**
     * Get  
     * @return LastLoginTime 
     */
    public String getLastLoginTime() {
        return this.LastLoginTime;
    }

    /**
     * Set 
     * @param LastLoginTime 
     */
    public void setLastLoginTime(String LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    public SubAccountUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubAccountUser(SubAccountUser source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.LastLoginIp != null) {
            this.LastLoginIp = new String(source.LastLoginIp);
        }
        if (source.LastLoginTime != null) {
            this.LastLoginTime = new String(source.LastLoginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "LastLoginIp", this.LastLoginIp);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);

    }
}

