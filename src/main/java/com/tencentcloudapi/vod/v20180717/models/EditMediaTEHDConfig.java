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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaTEHDConfig extends AbstractModel {

    /**
    * TSC Transcoding type, optional values: <li>TEHD-100 means TSC Transcoding-definition-100;</li> <li>OFF means turning off TSC Transcoding-definition. </li>Leave it blank to indicate OFF.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get TSC Transcoding type, optional values: <li>TEHD-100 means TSC Transcoding-definition-100;</li> <li>OFF means turning off TSC Transcoding-definition. </li>Leave it blank to indicate OFF. 
     * @return Type TSC Transcoding type, optional values: <li>TEHD-100 means TSC Transcoding-definition-100;</li> <li>OFF means turning off TSC Transcoding-definition. </li>Leave it blank to indicate OFF.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set TSC Transcoding type, optional values: <li>TEHD-100 means TSC Transcoding-definition-100;</li> <li>OFF means turning off TSC Transcoding-definition. </li>Leave it blank to indicate OFF.
     * @param Type TSC Transcoding type, optional values: <li>TEHD-100 means TSC Transcoding-definition-100;</li> <li>OFF means turning off TSC Transcoding-definition. </li>Leave it blank to indicate OFF.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public EditMediaTEHDConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaTEHDConfig(EditMediaTEHDConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

