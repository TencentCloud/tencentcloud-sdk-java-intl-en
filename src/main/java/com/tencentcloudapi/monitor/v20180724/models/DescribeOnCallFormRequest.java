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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOnCallFormRequest extends AbstractModel {

    /**
    * The fixed value is monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * On-call schedule ID.
    */
    @SerializedName("OnCallFormID")
    @Expose
    private String OnCallFormID;

    /**
     * Get The fixed value is monitor. 
     * @return Module The fixed value is monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The fixed value is monitor.
     * @param Module The fixed value is monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get On-call schedule ID. 
     * @return OnCallFormID On-call schedule ID.
     */
    public String getOnCallFormID() {
        return this.OnCallFormID;
    }

    /**
     * Set On-call schedule ID.
     * @param OnCallFormID On-call schedule ID.
     */
    public void setOnCallFormID(String OnCallFormID) {
        this.OnCallFormID = OnCallFormID;
    }

    public DescribeOnCallFormRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOnCallFormRequest(DescribeOnCallFormRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.OnCallFormID != null) {
            this.OnCallFormID = new String(source.OnCallFormID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "OnCallFormID", this.OnCallFormID);

    }
}

