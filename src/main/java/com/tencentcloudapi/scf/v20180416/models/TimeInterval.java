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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeInterval extends AbstractModel {

    /**
    * Start time (inclusive) in the format of "%Y-%m-%d %H:%M:%S"
    */
    @SerializedName("Start")
    @Expose
    private String Start;

    /**
    * End time (exclusive) in the format of "%Y-%m-%d %H:%M:%S"
    */
    @SerializedName("End")
    @Expose
    private String End;

    /**
     * Get Start time (inclusive) in the format of "%Y-%m-%d %H:%M:%S" 
     * @return Start Start time (inclusive) in the format of "%Y-%m-%d %H:%M:%S"
     */
    public String getStart() {
        return this.Start;
    }

    /**
     * Set Start time (inclusive) in the format of "%Y-%m-%d %H:%M:%S"
     * @param Start Start time (inclusive) in the format of "%Y-%m-%d %H:%M:%S"
     */
    public void setStart(String Start) {
        this.Start = Start;
    }

    /**
     * Get End time (exclusive) in the format of "%Y-%m-%d %H:%M:%S" 
     * @return End End time (exclusive) in the format of "%Y-%m-%d %H:%M:%S"
     */
    public String getEnd() {
        return this.End;
    }

    /**
     * Set End time (exclusive) in the format of "%Y-%m-%d %H:%M:%S"
     * @param End End time (exclusive) in the format of "%Y-%m-%d %H:%M:%S"
     */
    public void setEnd(String End) {
        this.End = End;
    }

    public TimeInterval() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeInterval(TimeInterval source) {
        if (source.Start != null) {
            this.Start = new String(source.Start);
        }
        if (source.End != null) {
            this.End = new String(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

