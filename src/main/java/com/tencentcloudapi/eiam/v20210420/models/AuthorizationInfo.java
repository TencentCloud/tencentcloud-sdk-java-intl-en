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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizationInfo extends AbstractModel{

    /**
    * Unique application ID.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Type name.
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * Unique type ID.
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * Last update time in ISO 8601 format.
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
    * Unique authorization type ID.
    */
    @SerializedName("AuthorizationId")
    @Expose
    private String AuthorizationId;

    /**
     * Get Unique application ID. 
     * @return AppId Unique application ID.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Unique application ID.
     * @param AppId Unique application ID.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Application name. 
     * @return AppName Application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name.
     * @param AppName Application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Type name. 
     * @return EntityName Type name.
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set Type name.
     * @param EntityName Type name.
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get Unique type ID. 
     * @return EntityId Unique type ID.
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set Unique type ID.
     * @param EntityId Unique type ID.
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get Last update time in ISO 8601 format. 
     * @return LastModifiedDate Last update time in ISO 8601 format.
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set Last update time in ISO 8601 format.
     * @param LastModifiedDate Last update time in ISO 8601 format.
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get Unique authorization type ID. 
     * @return AuthorizationId Unique authorization type ID.
     */
    public String getAuthorizationId() {
        return this.AuthorizationId;
    }

    /**
     * Set Unique authorization type ID.
     * @param AuthorizationId Unique authorization type ID.
     */
    public void setAuthorizationId(String AuthorizationId) {
        this.AuthorizationId = AuthorizationId;
    }

    public AuthorizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizationInfo(AuthorizationInfo source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.EntityName != null) {
            this.EntityName = new String(source.EntityName);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
        if (source.AuthorizationId != null) {
            this.AuthorizationId = new String(source.AuthorizationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "EntityName", this.EntityName);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamSimple(map, prefix + "AuthorizationId", this.AuthorizationId);

    }
}

