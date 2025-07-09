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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeriesInfos extends AbstractModel {

    /**
    * Data columns
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
    * Data values
    */
    @SerializedName("Values")
    @Expose
    private RowValues [] Values;

    /**
     * Get Data columns 
     * @return Columns Data columns
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set Data columns
     * @param Columns Data columns
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get Data values 
     * @return Values Data values
     */
    public RowValues [] getValues() {
        return this.Values;
    }

    /**
     * Set Data values
     * @param Values Data values
     */
    public void setValues(RowValues [] Values) {
        this.Values = Values;
    }

    public SeriesInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeriesInfos(SeriesInfos source) {
        if (source.Columns != null) {
            this.Columns = new String[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new String(source.Columns[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new RowValues[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new RowValues(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);

    }
}

