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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationSnapshotRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application download address (if the version is created by file upload, this parameter is an empty string).
    */
    @SerializedName("ApplicationDownloadUrl")
    @Expose
    private String ApplicationDownloadUrl;

    /**
     * Get Application ID. 
     * @return ApplicationId Application ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID.
     * @param ApplicationId Application ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application download address (if the version is created by file upload, this parameter is an empty string). 
     * @return ApplicationDownloadUrl Application download address (if the version is created by file upload, this parameter is an empty string).
     */
    public String getApplicationDownloadUrl() {
        return this.ApplicationDownloadUrl;
    }

    /**
     * Set Application download address (if the version is created by file upload, this parameter is an empty string).
     * @param ApplicationDownloadUrl Application download address (if the version is created by file upload, this parameter is an empty string).
     */
    public void setApplicationDownloadUrl(String ApplicationDownloadUrl) {
        this.ApplicationDownloadUrl = ApplicationDownloadUrl;
    }

    public CreateApplicationSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationSnapshotRequest(CreateApplicationSnapshotRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationDownloadUrl != null) {
            this.ApplicationDownloadUrl = new String(source.ApplicationDownloadUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationDownloadUrl", this.ApplicationDownloadUrl);

    }
}

