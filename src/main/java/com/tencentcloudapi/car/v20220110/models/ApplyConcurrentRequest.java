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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyConcurrentRequest extends AbstractModel{

    /**
    * The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The user’s IP address.
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * The project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * The application version ID.
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

    /**
     * Get The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application. 
     * @return UserId The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application.
     * @param UserId The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The user’s IP address. 
     * @return UserIp The user’s IP address.
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set The user’s IP address.
     * @param UserIp The user’s IP address.
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get The project ID. 
     * @return ProjectId The project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The project ID.
     * @param ProjectId The project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The application version ID. 
     * @return ApplicationVersionId The application version ID.
     */
    public String getApplicationVersionId() {
        return this.ApplicationVersionId;
    }

    /**
     * Set The application version ID.
     * @param ApplicationVersionId The application version ID.
     */
    public void setApplicationVersionId(String ApplicationVersionId) {
        this.ApplicationVersionId = ApplicationVersionId;
    }

    public ApplyConcurrentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyConcurrentRequest(ApplyConcurrentRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ApplicationVersionId != null) {
            this.ApplicationVersionId = new String(source.ApplicationVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ApplicationVersionId", this.ApplicationVersionId);

    }
}

