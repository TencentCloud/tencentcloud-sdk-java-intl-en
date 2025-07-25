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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportPropertyMap extends AbstractModel {

    /**
    * User attribute code
    */
    @SerializedName("UserPropertyCode")
    @Expose
    private String UserPropertyCode;

    /**
    * User attribute mapping name
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
     * Get User attribute code 
     * @return UserPropertyCode User attribute code
     */
    public String getUserPropertyCode() {
        return this.UserPropertyCode;
    }

    /**
     * Set User attribute code
     * @param UserPropertyCode User attribute code
     */
    public void setUserPropertyCode(String UserPropertyCode) {
        this.UserPropertyCode = UserPropertyCode;
    }

    /**
     * Get User attribute mapping name 
     * @return ColumnName User attribute mapping name
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set User attribute mapping name
     * @param ColumnName User attribute mapping name
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    public ExportPropertyMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportPropertyMap(ExportPropertyMap source) {
        if (source.UserPropertyCode != null) {
            this.UserPropertyCode = new String(source.UserPropertyCode);
        }
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserPropertyCode", this.UserPropertyCode);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);

    }
}

