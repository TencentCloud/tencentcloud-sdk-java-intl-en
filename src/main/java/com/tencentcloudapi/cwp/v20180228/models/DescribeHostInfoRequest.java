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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostInfoRequest extends AbstractModel {

    /**
    * Host QUUID array
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * UUIDs for querying. Leave this parameter blank if QUUIDs are used for querying.
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
     * Get Host QUUID array 
     * @return QuuidList Host QUUID array
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set Host QUUID array
     * @param QuuidList Host QUUID array
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get UUIDs for querying. Leave this parameter blank if QUUIDs are used for querying. 
     * @return Uuids UUIDs for querying. Leave this parameter blank if QUUIDs are used for querying.
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set UUIDs for querying. Leave this parameter blank if QUUIDs are used for querying.
     * @param Uuids UUIDs for querying. Leave this parameter blank if QUUIDs are used for querying.
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    public DescribeHostInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostInfoRequest(DescribeHostInfoRequest source) {
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
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
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);

    }
}

