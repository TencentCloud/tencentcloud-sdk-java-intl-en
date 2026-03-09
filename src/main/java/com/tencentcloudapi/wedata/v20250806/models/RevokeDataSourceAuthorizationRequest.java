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

public class RevokeDataSourceAuthorizationRequest extends AbstractModel {

    /**
    * Data source ID.
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * Reclaim the project id or the UserUin parameter. only one can be filled in.
    */
    @SerializedName("RevokeProjectId")
    @Expose
    private String RevokeProjectId;

    /**
    * Reclaim the list of users under the project in the format: project id_user id.
Specifies that only one of the parameters can be filled in with RevokeProjectId.


    */
    @SerializedName("RevokeUser")
    @Expose
    private String RevokeUser;

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
     * Get Reclaim the project id or the UserUin parameter. only one can be filled in. 
     * @return RevokeProjectId Reclaim the project id or the UserUin parameter. only one can be filled in.
     */
    public String getRevokeProjectId() {
        return this.RevokeProjectId;
    }

    /**
     * Set Reclaim the project id or the UserUin parameter. only one can be filled in.
     * @param RevokeProjectId Reclaim the project id or the UserUin parameter. only one can be filled in.
     */
    public void setRevokeProjectId(String RevokeProjectId) {
        this.RevokeProjectId = RevokeProjectId;
    }

    /**
     * Get Reclaim the list of users under the project in the format: project id_user id.
Specifies that only one of the parameters can be filled in with RevokeProjectId.

 
     * @return RevokeUser Reclaim the list of users under the project in the format: project id_user id.
Specifies that only one of the parameters can be filled in with RevokeProjectId.


     */
    public String getRevokeUser() {
        return this.RevokeUser;
    }

    /**
     * Set Reclaim the list of users under the project in the format: project id_user id.
Specifies that only one of the parameters can be filled in with RevokeProjectId.


     * @param RevokeUser Reclaim the list of users under the project in the format: project id_user id.
Specifies that only one of the parameters can be filled in with RevokeProjectId.


     */
    public void setRevokeUser(String RevokeUser) {
        this.RevokeUser = RevokeUser;
    }

    public RevokeDataSourceAuthorizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokeDataSourceAuthorizationRequest(RevokeDataSourceAuthorizationRequest source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.RevokeProjectId != null) {
            this.RevokeProjectId = new String(source.RevokeProjectId);
        }
        if (source.RevokeUser != null) {
            this.RevokeUser = new String(source.RevokeUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "RevokeProjectId", this.RevokeProjectId);
        this.setParamSimple(map, prefix + "RevokeUser", this.RevokeUser);

    }
}

