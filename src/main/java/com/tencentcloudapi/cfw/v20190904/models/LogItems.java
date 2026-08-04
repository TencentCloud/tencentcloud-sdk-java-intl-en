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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogItems extends AbstractModel {

    /**
    * Key-Value Data Pair returned from analysis results
    */
    @SerializedName("Data")
    @Expose
    private LogItem [] Data;

    /**
     * Get Key-Value Data Pair returned from analysis results 
     * @return Data Key-Value Data Pair returned from analysis results
     */
    public LogItem [] getData() {
        return this.Data;
    }

    /**
     * Set Key-Value Data Pair returned from analysis results
     * @param Data Key-Value Data Pair returned from analysis results
     */
    public void setData(LogItem [] Data) {
        this.Data = Data;
    }

    public LogItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogItems(LogItems source) {
        if (source.Data != null) {
            this.Data = new LogItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new LogItem(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

