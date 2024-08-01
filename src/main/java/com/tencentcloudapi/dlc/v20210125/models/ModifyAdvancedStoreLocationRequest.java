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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAdvancedStoreLocationRequest extends AbstractModel {

    /**
    * COS path for saving querying results
    */
    @SerializedName("StoreLocation")
    @Expose
    private String StoreLocation;

    /**
    * Whether to enable advanced settings. 0 means no while 1 means yes.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get COS path for saving querying results 
     * @return StoreLocation COS path for saving querying results
     */
    public String getStoreLocation() {
        return this.StoreLocation;
    }

    /**
     * Set COS path for saving querying results
     * @param StoreLocation COS path for saving querying results
     */
    public void setStoreLocation(String StoreLocation) {
        this.StoreLocation = StoreLocation;
    }

    /**
     * Get Whether to enable advanced settings. 0 means no while 1 means yes. 
     * @return Enable Whether to enable advanced settings. 0 means no while 1 means yes.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable advanced settings. 0 means no while 1 means yes.
     * @param Enable Whether to enable advanced settings. 0 means no while 1 means yes.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyAdvancedStoreLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAdvancedStoreLocationRequest(ModifyAdvancedStoreLocationRequest source) {
        if (source.StoreLocation != null) {
            this.StoreLocation = new String(source.StoreLocation);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StoreLocation", this.StoreLocation);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

