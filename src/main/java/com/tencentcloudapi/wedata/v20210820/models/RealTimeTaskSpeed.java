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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealTimeTaskSpeed extends AbstractModel {

    /**
    * Synchronous Speed Bar/s List
    */
    @SerializedName("RecordsSpeedList")
    @Expose
    private RecordsSpeed [] RecordsSpeedList;

    /**
    * Synchronous Speed Bytes/s List
    */
    @SerializedName("BytesSpeedList")
    @Expose
    private BytesSpeed [] BytesSpeedList;

    /**
     * Get Synchronous Speed Bar/s List 
     * @return RecordsSpeedList Synchronous Speed Bar/s List
     */
    public RecordsSpeed [] getRecordsSpeedList() {
        return this.RecordsSpeedList;
    }

    /**
     * Set Synchronous Speed Bar/s List
     * @param RecordsSpeedList Synchronous Speed Bar/s List
     */
    public void setRecordsSpeedList(RecordsSpeed [] RecordsSpeedList) {
        this.RecordsSpeedList = RecordsSpeedList;
    }

    /**
     * Get Synchronous Speed Bytes/s List 
     * @return BytesSpeedList Synchronous Speed Bytes/s List
     */
    public BytesSpeed [] getBytesSpeedList() {
        return this.BytesSpeedList;
    }

    /**
     * Set Synchronous Speed Bytes/s List
     * @param BytesSpeedList Synchronous Speed Bytes/s List
     */
    public void setBytesSpeedList(BytesSpeed [] BytesSpeedList) {
        this.BytesSpeedList = BytesSpeedList;
    }

    public RealTimeTaskSpeed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealTimeTaskSpeed(RealTimeTaskSpeed source) {
        if (source.RecordsSpeedList != null) {
            this.RecordsSpeedList = new RecordsSpeed[source.RecordsSpeedList.length];
            for (int i = 0; i < source.RecordsSpeedList.length; i++) {
                this.RecordsSpeedList[i] = new RecordsSpeed(source.RecordsSpeedList[i]);
            }
        }
        if (source.BytesSpeedList != null) {
            this.BytesSpeedList = new BytesSpeed[source.BytesSpeedList.length];
            for (int i = 0; i < source.BytesSpeedList.length; i++) {
                this.BytesSpeedList[i] = new BytesSpeed(source.BytesSpeedList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordsSpeedList.", this.RecordsSpeedList);
        this.setParamArrayObj(map, prefix + "BytesSpeedList.", this.BytesSpeedList);

    }
}

