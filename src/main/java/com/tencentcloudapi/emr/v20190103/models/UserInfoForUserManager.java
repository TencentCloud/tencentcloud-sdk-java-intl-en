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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfoForUserManager extends AbstractModel{

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * The group to which the user belongs
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * 
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * 
    */
    @SerializedName("ReMark")
    @Expose
    private String ReMark;

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
     * Get The group to which the user belongs 
     * @return UserGroup The group to which the user belongs
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set The group to which the user belongs
     * @param UserGroup The group to which the user belongs
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get  
     * @return PassWord 
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set 
     * @param PassWord 
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get  
     * @return ReMark 
     */
    public String getReMark() {
        return this.ReMark;
    }

    /**
     * Set 
     * @param ReMark 
     */
    public void setReMark(String ReMark) {
        this.ReMark = ReMark;
    }

    public UserInfoForUserManager() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfoForUserManager(UserInfoForUserManager source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.ReMark != null) {
            this.ReMark = new String(source.ReMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "ReMark", this.ReMark);

    }
}

