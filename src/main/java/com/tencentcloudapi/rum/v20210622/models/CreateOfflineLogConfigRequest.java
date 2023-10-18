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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOfflineLogConfigRequest extends AbstractModel {

    /**
    * Unique project key for reporting
    */
    @SerializedName("ProjectKey")
    @Expose
    private String ProjectKey;

    /**
    * Unique identifier of the user to be listened on (`aid` or `uin`)
    */
    @SerializedName("UniqueID")
    @Expose
    private String UniqueID;

    /**
     * Get Unique project key for reporting 
     * @return ProjectKey Unique project key for reporting
     */
    public String getProjectKey() {
        return this.ProjectKey;
    }

    /**
     * Set Unique project key for reporting
     * @param ProjectKey Unique project key for reporting
     */
    public void setProjectKey(String ProjectKey) {
        this.ProjectKey = ProjectKey;
    }

    /**
     * Get Unique identifier of the user to be listened on (`aid` or `uin`) 
     * @return UniqueID Unique identifier of the user to be listened on (`aid` or `uin`)
     */
    public String getUniqueID() {
        return this.UniqueID;
    }

    /**
     * Set Unique identifier of the user to be listened on (`aid` or `uin`)
     * @param UniqueID Unique identifier of the user to be listened on (`aid` or `uin`)
     */
    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }

    public CreateOfflineLogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOfflineLogConfigRequest(CreateOfflineLogConfigRequest source) {
        if (source.ProjectKey != null) {
            this.ProjectKey = new String(source.ProjectKey);
        }
        if (source.UniqueID != null) {
            this.UniqueID = new String(source.UniqueID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectKey", this.ProjectKey);
        this.setParamSimple(map, prefix + "UniqueID", this.UniqueID);

    }
}

