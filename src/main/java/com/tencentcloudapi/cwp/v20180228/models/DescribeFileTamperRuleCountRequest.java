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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileTamperRuleCountRequest extends AbstractModel {

    /**
    * Query Host UUIDs, up to 100 queries at a time
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
     * Get Query Host UUIDs, up to 100 queries at a time 
     * @return Uuids Query Host UUIDs, up to 100 queries at a time
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Query Host UUIDs, up to 100 queries at a time
     * @param Uuids Query Host UUIDs, up to 100 queries at a time
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    public DescribeFileTamperRuleCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileTamperRuleCountRequest(DescribeFileTamperRuleCountRequest source) {
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);

    }
}
