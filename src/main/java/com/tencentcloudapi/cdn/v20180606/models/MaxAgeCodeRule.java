/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAgeCodeRule extends AbstractModel {

    /**
    * Action to execute.
`clear`: Clear the cache-control header.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Specifies the HTTP status code in the range 400-599.
    */
    @SerializedName("StatusCodes")
    @Expose
    private String [] StatusCodes;

    /**
     * Get Action to execute.
`clear`: Clear the cache-control header. 
     * @return Action Action to execute.
`clear`: Clear the cache-control header.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to execute.
`clear`: Clear the cache-control header.
     * @param Action Action to execute.
`clear`: Clear the cache-control header.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Specifies the HTTP status code in the range 400-599. 
     * @return StatusCodes Specifies the HTTP status code in the range 400-599.
     */
    public String [] getStatusCodes() {
        return this.StatusCodes;
    }

    /**
     * Set Specifies the HTTP status code in the range 400-599.
     * @param StatusCodes Specifies the HTTP status code in the range 400-599.
     */
    public void setStatusCodes(String [] StatusCodes) {
        this.StatusCodes = StatusCodes;
    }

    public MaxAgeCodeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxAgeCodeRule(MaxAgeCodeRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.StatusCodes != null) {
            this.StatusCodes = new String[source.StatusCodes.length];
            for (int i = 0; i < source.StatusCodes.length; i++) {
                this.StatusCodes[i] = new String(source.StatusCodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "StatusCodes.", this.StatusCodes);

    }
}

