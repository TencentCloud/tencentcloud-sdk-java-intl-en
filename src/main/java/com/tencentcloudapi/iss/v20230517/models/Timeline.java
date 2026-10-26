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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Timeline extends AbstractModel {

    /**
    * Fragment start time
    */
    @SerializedName("Begin")
    @Expose
    private Long Begin;

    /**
    * Shard end time
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get Fragment start time 
     * @return Begin Fragment start time
     */
    public Long getBegin() {
        return this.Begin;
    }

    /**
     * Set Fragment start time
     * @param Begin Fragment start time
     */
    public void setBegin(Long Begin) {
        this.Begin = Begin;
    }

    /**
     * Get Shard end time 
     * @return End Shard end time
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set Shard end time
     * @param End Shard end time
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    public Timeline() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Timeline(Timeline source) {
        if (source.Begin != null) {
            this.Begin = new Long(source.Begin);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Begin", this.Begin);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

