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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineScaleInfo extends AbstractModel {

    /**
    * Engine ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * Engine name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Engine specification details
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScaleDetail")
    @Expose
    private DataEngineScaleInfoDetail [] ScaleDetail;

    /**
     * Get Engine ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineId Engine ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set Engine ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineId Engine ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get Engine name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineName Engine name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Engine name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineName Engine name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Engine specification details
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScaleDetail Engine specification details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DataEngineScaleInfoDetail [] getScaleDetail() {
        return this.ScaleDetail;
    }

    /**
     * Set Engine specification details
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScaleDetail Engine specification details
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScaleDetail(DataEngineScaleInfoDetail [] ScaleDetail) {
        this.ScaleDetail = ScaleDetail;
    }

    public DataEngineScaleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineScaleInfo(DataEngineScaleInfo source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.ScaleDetail != null) {
            this.ScaleDetail = new DataEngineScaleInfoDetail[source.ScaleDetail.length];
            for (int i = 0; i < source.ScaleDetail.length; i++) {
                this.ScaleDetail[i] = new DataEngineScaleInfoDetail(source.ScaleDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamArrayObj(map, prefix + "ScaleDetail.", this.ScaleDetail);

    }
}

