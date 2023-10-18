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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopDataRecord extends AbstractModel {

    /**
    * Query dimension value
    */
    @SerializedName("TypeKey")
    @Expose
    private String TypeKey;

    /**
    * Top data rankings
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetailData")
    @Expose
    private TopDetailData [] DetailData;

    /**
     * Get Query dimension value 
     * @return TypeKey Query dimension value
     */
    public String getTypeKey() {
        return this.TypeKey;
    }

    /**
     * Set Query dimension value
     * @param TypeKey Query dimension value
     */
    public void setTypeKey(String TypeKey) {
        this.TypeKey = TypeKey;
    }

    /**
     * Get Top data rankings
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetailData Top data rankings
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TopDetailData [] getDetailData() {
        return this.DetailData;
    }

    /**
     * Set Top data rankings
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetailData Top data rankings
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetailData(TopDetailData [] DetailData) {
        this.DetailData = DetailData;
    }

    public TopDataRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopDataRecord(TopDataRecord source) {
        if (source.TypeKey != null) {
            this.TypeKey = new String(source.TypeKey);
        }
        if (source.DetailData != null) {
            this.DetailData = new TopDetailData[source.DetailData.length];
            for (int i = 0; i < source.DetailData.length; i++) {
                this.DetailData[i] = new TopDetailData(source.DetailData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeKey", this.TypeKey);
        this.setParamArrayObj(map, prefix + "DetailData.", this.DetailData);

    }
}

