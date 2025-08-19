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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Data extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * url
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EditUrl")
    @Expose
    private String EditUrl;

    /**
     * Get Project ID.
 
     * @return Id Project ID.

     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Project ID.

     * @param Id Project ID.

     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get url
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EditUrl url
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEditUrl() {
        return this.EditUrl;
    }

    /**
     * Set url
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EditUrl url
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEditUrl(String EditUrl) {
        this.EditUrl = EditUrl;
    }

    public Data() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Data(Data source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.EditUrl != null) {
            this.EditUrl = new String(source.EditUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "EditUrl", this.EditUrl);

    }
}

