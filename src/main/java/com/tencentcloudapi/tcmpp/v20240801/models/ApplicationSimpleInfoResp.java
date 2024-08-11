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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationSimpleInfoResp extends AbstractModel {

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationID")
    @Expose
    private String ApplicationID;

    /**
    * Product ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppIdentityID")
    @Expose
    private Long AppIdentityID;

    /**
    * The application name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
     * Get Application ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationID Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationID() {
        return this.ApplicationID;
    }

    /**
     * Set Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationID Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationID(String ApplicationID) {
        this.ApplicationID = ApplicationID;
    }

    /**
     * Get Product ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppIdentityID Product ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppIdentityID() {
        return this.AppIdentityID;
    }

    /**
     * Set Product ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppIdentityID Product ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppIdentityID(Long AppIdentityID) {
        this.AppIdentityID = AppIdentityID;
    }

    /**
     * Get The application name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName The application name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set The application name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName The application name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public ApplicationSimpleInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationSimpleInfoResp(ApplicationSimpleInfoResp source) {
        if (source.ApplicationID != null) {
            this.ApplicationID = new String(source.ApplicationID);
        }
        if (source.AppIdentityID != null) {
            this.AppIdentityID = new Long(source.AppIdentityID);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationID", this.ApplicationID);
        this.setParamSimple(map, prefix + "AppIdentityID", this.AppIdentityID);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);

    }
}

