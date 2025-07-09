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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneCnameSpeedUpRequest extends AbstractModel {

    /**
    * Site ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * CNAME acceleration status.
- `enabled`: Enabled
- `disabled`: Disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Site ID 
     * @return Id Site ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Site ID
     * @param Id Site ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get CNAME acceleration status.
- `enabled`: Enabled
- `disabled`: Disabled 
     * @return Status CNAME acceleration status.
- `enabled`: Enabled
- `disabled`: Disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set CNAME acceleration status.
- `enabled`: Enabled
- `disabled`: Disabled
     * @param Status CNAME acceleration status.
- `enabled`: Enabled
- `disabled`: Disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyZoneCnameSpeedUpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneCnameSpeedUpRequest(ModifyZoneCnameSpeedUpRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

