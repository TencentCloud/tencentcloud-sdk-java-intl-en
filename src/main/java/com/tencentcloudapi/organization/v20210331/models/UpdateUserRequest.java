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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * User ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * First name of the user.
    */
    @SerializedName("NewFirstName")
    @Expose
    private String NewFirstName;

    /**
    * Last name of the user.
    */
    @SerializedName("NewLastName")
    @Expose
    private String NewLastName;

    /**
    * Display name of the user.
    */
    @SerializedName("NewDisplayName")
    @Expose
    private String NewDisplayName;

    /**
    * User description.
    */
    @SerializedName("NewDescription")
    @Expose
    private String NewDescription;

    /**
    * Email address of the user.
    */
    @SerializedName("NewEmail")
    @Expose
    private String NewEmail;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get User ID. 
     * @return UserId User ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID.
     * @param UserId User ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get First name of the user. 
     * @return NewFirstName First name of the user.
     */
    public String getNewFirstName() {
        return this.NewFirstName;
    }

    /**
     * Set First name of the user.
     * @param NewFirstName First name of the user.
     */
    public void setNewFirstName(String NewFirstName) {
        this.NewFirstName = NewFirstName;
    }

    /**
     * Get Last name of the user. 
     * @return NewLastName Last name of the user.
     */
    public String getNewLastName() {
        return this.NewLastName;
    }

    /**
     * Set Last name of the user.
     * @param NewLastName Last name of the user.
     */
    public void setNewLastName(String NewLastName) {
        this.NewLastName = NewLastName;
    }

    /**
     * Get Display name of the user. 
     * @return NewDisplayName Display name of the user.
     */
    public String getNewDisplayName() {
        return this.NewDisplayName;
    }

    /**
     * Set Display name of the user.
     * @param NewDisplayName Display name of the user.
     */
    public void setNewDisplayName(String NewDisplayName) {
        this.NewDisplayName = NewDisplayName;
    }

    /**
     * Get User description. 
     * @return NewDescription User description.
     */
    public String getNewDescription() {
        return this.NewDescription;
    }

    /**
     * Set User description.
     * @param NewDescription User description.
     */
    public void setNewDescription(String NewDescription) {
        this.NewDescription = NewDescription;
    }

    /**
     * Get Email address of the user. 
     * @return NewEmail Email address of the user.
     */
    public String getNewEmail() {
        return this.NewEmail;
    }

    /**
     * Set Email address of the user.
     * @param NewEmail Email address of the user.
     */
    public void setNewEmail(String NewEmail) {
        this.NewEmail = NewEmail;
    }

    public UpdateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserRequest(UpdateUserRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.NewFirstName != null) {
            this.NewFirstName = new String(source.NewFirstName);
        }
        if (source.NewLastName != null) {
            this.NewLastName = new String(source.NewLastName);
        }
        if (source.NewDisplayName != null) {
            this.NewDisplayName = new String(source.NewDisplayName);
        }
        if (source.NewDescription != null) {
            this.NewDescription = new String(source.NewDescription);
        }
        if (source.NewEmail != null) {
            this.NewEmail = new String(source.NewEmail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "NewFirstName", this.NewFirstName);
        this.setParamSimple(map, prefix + "NewLastName", this.NewLastName);
        this.setParamSimple(map, prefix + "NewDisplayName", this.NewDisplayName);
        this.setParamSimple(map, prefix + "NewDescription", this.NewDescription);
        this.setParamSimple(map, prefix + "NewEmail", this.NewEmail);

    }
}

