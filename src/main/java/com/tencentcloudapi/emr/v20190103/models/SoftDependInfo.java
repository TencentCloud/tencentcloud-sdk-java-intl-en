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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SoftDependInfo extends AbstractModel {

    /**
    * The component name.
    */
    @SerializedName("SoftName")
    @Expose
    private String SoftName;

    /**
    * Whether the component is required.
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
     * Get The component name. 
     * @return SoftName The component name.
     */
    public String getSoftName() {
        return this.SoftName;
    }

    /**
     * Set The component name.
     * @param SoftName The component name.
     */
    public void setSoftName(String SoftName) {
        this.SoftName = SoftName;
    }

    /**
     * Get Whether the component is required. 
     * @return Required Whether the component is required.
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set Whether the component is required.
     * @param Required Whether the component is required.
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    public SoftDependInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SoftDependInfo(SoftDependInfo source) {
        if (source.SoftName != null) {
            this.SoftName = new String(source.SoftName);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SoftName", this.SoftName);
        this.setParamSimple(map, prefix + "Required", this.Required);

    }
}

