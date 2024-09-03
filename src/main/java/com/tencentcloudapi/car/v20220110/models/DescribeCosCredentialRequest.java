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

public class DescribeCosCredentialRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application file name (the file must be a compressed package with a zip/rar/7z file name extension).
    */
    @SerializedName("ApplicationFileName")
    @Expose
    private String ApplicationFileName;

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
     * Get Application file name (the file must be a compressed package with a zip/rar/7z file name extension). 
     * @return ApplicationFileName Application file name (the file must be a compressed package with a zip/rar/7z file name extension).
     */
    public String getApplicationFileName() {
        return this.ApplicationFileName;
    }

    /**
     * Set Application file name (the file must be a compressed package with a zip/rar/7z file name extension).
     * @param ApplicationFileName Application file name (the file must be a compressed package with a zip/rar/7z file name extension).
     */
    public void setApplicationFileName(String ApplicationFileName) {
        this.ApplicationFileName = ApplicationFileName;
    }

    public DescribeCosCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosCredentialRequest(DescribeCosCredentialRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationFileName != null) {
            this.ApplicationFileName = new String(source.ApplicationFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationFileName", this.ApplicationFileName);

    }
}

