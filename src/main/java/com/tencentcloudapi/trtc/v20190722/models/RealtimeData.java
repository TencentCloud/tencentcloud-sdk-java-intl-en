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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealtimeData extends AbstractModel{

    /**
    * Returned data
    */
    @SerializedName("Content")
    @Expose
    private TimeValue [] Content;

    /**
    * Data type field
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
     * Get Returned data 
     * @return Content Returned data
     */
    public TimeValue [] getContent() {
        return this.Content;
    }

    /**
     * Set Returned data
     * @param Content Returned data
     */
    public void setContent(TimeValue [] Content) {
        this.Content = Content;
    }

    /**
     * Get Data type field 
     * @return DataType Data type field
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set Data type field
     * @param DataType Data type field
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    public RealtimeData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealtimeData(RealtimeData source) {
        if (source.Content != null) {
            this.Content = new TimeValue[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new TimeValue(source.Content[i]);
            }
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

