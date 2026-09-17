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

public class TimeRange extends AbstractModel {

    /**
    * 
    */
    @SerializedName("After")
    @Expose
    private String After;

    /**
    * 
    */
    @SerializedName("Before")
    @Expose
    private String Before;

    /**
     * Get  
     * @return After 
     */
    public String getAfter() {
        return this.After;
    }

    /**
     * Set 
     * @param After 
     */
    public void setAfter(String After) {
        this.After = After;
    }

    /**
     * Get  
     * @return Before 
     */
    public String getBefore() {
        return this.Before;
    }

    /**
     * Set 
     * @param Before 
     */
    public void setBefore(String Before) {
        this.Before = Before;
    }

    public TimeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeRange(TimeRange source) {
        if (source.After != null) {
            this.After = new String(source.After);
        }
        if (source.Before != null) {
            this.Before = new String(source.Before);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "After", this.After);
        this.setParamSimple(map, prefix + "Before", this.Before);

    }
}

