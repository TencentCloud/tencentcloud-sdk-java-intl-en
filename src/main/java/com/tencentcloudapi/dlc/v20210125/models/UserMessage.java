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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserMessage extends AbstractModel {

    /**
    * User Id which matches the sub-user UIN on the CAM side
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User description
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
    * The creator of the current user
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * The creation time of the current user, e.g. 16:19:32, July 28, 2021
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * User alias
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
     * Get User Id which matches the sub-user UIN on the CAM side 
     * @return UserId User Id which matches the sub-user UIN on the CAM side
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User Id which matches the sub-user UIN on the CAM side
     * @param UserId User Id which matches the sub-user UIN on the CAM side
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User description
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return UserDescription User description
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set User description
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param UserDescription User description
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    /**
     * Get The creator of the current user 
     * @return Creator The creator of the current user
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set The creator of the current user
     * @param Creator The creator of the current user
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get The creation time of the current user, e.g. 16:19:32, July 28, 2021 
     * @return CreateTime The creation time of the current user, e.g. 16:19:32, July 28, 2021
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time of the current user, e.g. 16:19:32, July 28, 2021
     * @param CreateTime The creation time of the current user, e.g. 16:19:32, July 28, 2021
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get User alias 
     * @return UserAlias User alias
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set User alias
     * @param UserAlias User alias
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    public UserMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserMessage(UserMessage source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);

    }
}

