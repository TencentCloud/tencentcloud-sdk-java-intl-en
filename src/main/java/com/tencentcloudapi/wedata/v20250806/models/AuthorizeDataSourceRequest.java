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

public class AuthorizeDataSourceRequest extends AbstractModel {

    /**
    * Data source ID.
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * Authorize the target project id.
    */
    @SerializedName("AuthProjectId")
    @Expose
    private String AuthProjectId;

    /**
    * List of users in the authorized project, format: project id_user id.
Can only select either the AuthProjectId parameter.
Authorize multiple objects. the project id must be consistent.
    */
    @SerializedName("AuthUsers")
    @Expose
    private String [] AuthUsers;

    /**
     * Get Data source ID. 
     * @return DataSourceId Data source ID.
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set Data source ID.
     * @param DataSourceId Data source ID.
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get Authorize the target project id. 
     * @return AuthProjectId Authorize the target project id.
     */
    public String getAuthProjectId() {
        return this.AuthProjectId;
    }

    /**
     * Set Authorize the target project id.
     * @param AuthProjectId Authorize the target project id.
     */
    public void setAuthProjectId(String AuthProjectId) {
        this.AuthProjectId = AuthProjectId;
    }

    /**
     * Get List of users in the authorized project, format: project id_user id.
Can only select either the AuthProjectId parameter.
Authorize multiple objects. the project id must be consistent. 
     * @return AuthUsers List of users in the authorized project, format: project id_user id.
Can only select either the AuthProjectId parameter.
Authorize multiple objects. the project id must be consistent.
     */
    public String [] getAuthUsers() {
        return this.AuthUsers;
    }

    /**
     * Set List of users in the authorized project, format: project id_user id.
Can only select either the AuthProjectId parameter.
Authorize multiple objects. the project id must be consistent.
     * @param AuthUsers List of users in the authorized project, format: project id_user id.
Can only select either the AuthProjectId parameter.
Authorize multiple objects. the project id must be consistent.
     */
    public void setAuthUsers(String [] AuthUsers) {
        this.AuthUsers = AuthUsers;
    }

    public AuthorizeDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizeDataSourceRequest(AuthorizeDataSourceRequest source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.AuthProjectId != null) {
            this.AuthProjectId = new String(source.AuthProjectId);
        }
        if (source.AuthUsers != null) {
            this.AuthUsers = new String[source.AuthUsers.length];
            for (int i = 0; i < source.AuthUsers.length; i++) {
                this.AuthUsers[i] = new String(source.AuthUsers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "AuthProjectId", this.AuthProjectId);
        this.setParamArraySimple(map, prefix + "AuthUsers.", this.AuthUsers);

    }
}

