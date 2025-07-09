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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStoreLocationRequest extends AbstractModel {

    /**
    * COS path for calculation results storage, such as cosn://bucketname/
    */
    @SerializedName("StoreLocation")
    @Expose
    private String StoreLocation;

    /**
     * Get COS path for calculation results storage, such as cosn://bucketname/ 
     * @return StoreLocation COS path for calculation results storage, such as cosn://bucketname/
     */
    public String getStoreLocation() {
        return this.StoreLocation;
    }

    /**
     * Set COS path for calculation results storage, such as cosn://bucketname/
     * @param StoreLocation COS path for calculation results storage, such as cosn://bucketname/
     */
    public void setStoreLocation(String StoreLocation) {
        this.StoreLocation = StoreLocation;
    }

    public CreateStoreLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStoreLocationRequest(CreateStoreLocationRequest source) {
        if (source.StoreLocation != null) {
            this.StoreLocation = new String(source.StoreLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StoreLocation", this.StoreLocation);

    }
}

