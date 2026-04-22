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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationConfigFileRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Application platform. 2: Android; 3: iOS
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Application platform. 2: Android; 3: iOS 
     * @return AppType Application platform. 2: Android; 3: iOS
     * @deprecated
     */
    @Deprecated
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set Application platform. 2: Android; 3: iOS
     * @param AppType Application platform. 2: Android; 3: iOS
     * @deprecated
     */
    @Deprecated
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    public DescribeApplicationConfigFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationConfigFileRequest(DescribeApplicationConfigFileRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.AppType != null) {
            this.AppType = new Long(source.AppType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);

    }
}

