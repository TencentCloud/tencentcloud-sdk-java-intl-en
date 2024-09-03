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

public class CreateApplicationVersionRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application file name (desktop applications should be files in zip/rar/7z format, and mobile applications should be files in apk format).
    */
    @SerializedName("ApplicationFileName")
    @Expose
    private String ApplicationFileName;

    /**
    * Region for application version distribution.
    */
    @SerializedName("ApplicationVersionRegions")
    @Expose
    private String [] ApplicationVersionRegions;

    /**
    * Application update method.
    */
    @SerializedName("ApplicationVersionUpdateMode")
    @Expose
    private String ApplicationVersionUpdateMode;

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
     * Get Application file name (desktop applications should be files in zip/rar/7z format, and mobile applications should be files in apk format). 
     * @return ApplicationFileName Application file name (desktop applications should be files in zip/rar/7z format, and mobile applications should be files in apk format).
     */
    public String getApplicationFileName() {
        return this.ApplicationFileName;
    }

    /**
     * Set Application file name (desktop applications should be files in zip/rar/7z format, and mobile applications should be files in apk format).
     * @param ApplicationFileName Application file name (desktop applications should be files in zip/rar/7z format, and mobile applications should be files in apk format).
     */
    public void setApplicationFileName(String ApplicationFileName) {
        this.ApplicationFileName = ApplicationFileName;
    }

    /**
     * Get Region for application version distribution. 
     * @return ApplicationVersionRegions Region for application version distribution.
     */
    public String [] getApplicationVersionRegions() {
        return this.ApplicationVersionRegions;
    }

    /**
     * Set Region for application version distribution.
     * @param ApplicationVersionRegions Region for application version distribution.
     */
    public void setApplicationVersionRegions(String [] ApplicationVersionRegions) {
        this.ApplicationVersionRegions = ApplicationVersionRegions;
    }

    /**
     * Get Application update method. 
     * @return ApplicationVersionUpdateMode Application update method.
     */
    public String getApplicationVersionUpdateMode() {
        return this.ApplicationVersionUpdateMode;
    }

    /**
     * Set Application update method.
     * @param ApplicationVersionUpdateMode Application update method.
     */
    public void setApplicationVersionUpdateMode(String ApplicationVersionUpdateMode) {
        this.ApplicationVersionUpdateMode = ApplicationVersionUpdateMode;
    }

    public CreateApplicationVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationVersionRequest(CreateApplicationVersionRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationFileName != null) {
            this.ApplicationFileName = new String(source.ApplicationFileName);
        }
        if (source.ApplicationVersionRegions != null) {
            this.ApplicationVersionRegions = new String[source.ApplicationVersionRegions.length];
            for (int i = 0; i < source.ApplicationVersionRegions.length; i++) {
                this.ApplicationVersionRegions[i] = new String(source.ApplicationVersionRegions[i]);
            }
        }
        if (source.ApplicationVersionUpdateMode != null) {
            this.ApplicationVersionUpdateMode = new String(source.ApplicationVersionUpdateMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationFileName", this.ApplicationFileName);
        this.setParamArraySimple(map, prefix + "ApplicationVersionRegions.", this.ApplicationVersionRegions);
        this.setParamSimple(map, prefix + "ApplicationVersionUpdateMode", this.ApplicationVersionUpdateMode);

    }
}

