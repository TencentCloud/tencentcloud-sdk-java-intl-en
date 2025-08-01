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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectionBrief extends AbstractModel {

    /**
    * Connector type
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Connector status
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Connector type
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Type Connector type
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Connector type
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Type Connector type
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Connector status
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Status Connector status
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Connector status
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Status Connector status
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ConnectionBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectionBrief(ConnectionBrief source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

