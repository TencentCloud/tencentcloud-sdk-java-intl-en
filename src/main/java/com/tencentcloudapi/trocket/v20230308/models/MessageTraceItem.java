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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageTraceItem extends AbstractModel {

    /**
    * Message handling phase. valid values are as follows:.

-Produces messages.

-Persists message storage.

-Consumes messages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * Track details

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get Message handling phase. valid values are as follows:.

-Produces messages.

-Persists message storage.

-Consumes messages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Stage Message handling phase. valid values are as follows:.

-Produces messages.

-Persists message storage.

-Consumes messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set Message handling phase. valid values are as follows:.

-Produces messages.

-Persists message storage.

-Consumes messages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Stage Message handling phase. valid values are as follows:.

-Produces messages.

-Persists message storage.

-Consumes messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get Track details

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Data Track details

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Track details

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Data Track details

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public MessageTraceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageTraceItem(MessageTraceItem source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

