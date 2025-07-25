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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyValueRecord extends AbstractModel {

    /**
    * Key-Value array of a record
    */
    @SerializedName("Record")
    @Expose
    private KeyValue [] Record;

    /**
     * Get Key-Value array of a record 
     * @return Record Key-Value array of a record
     */
    public KeyValue [] getRecord() {
        return this.Record;
    }

    /**
     * Set Key-Value array of a record
     * @param Record Key-Value array of a record
     */
    public void setRecord(KeyValue [] Record) {
        this.Record = Record;
    }

    public KeyValueRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyValueRecord(KeyValueRecord source) {
        if (source.Record != null) {
            this.Record = new KeyValue[source.Record.length];
            for (int i = 0; i < source.Record.length; i++) {
                this.Record[i] = new KeyValue(source.Record[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Record.", this.Record);

    }
}

