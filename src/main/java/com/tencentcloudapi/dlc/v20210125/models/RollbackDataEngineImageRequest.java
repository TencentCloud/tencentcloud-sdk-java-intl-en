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

public class RollbackDataEngineImageRequest extends AbstractModel {

    /**
    * Engine ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * FromRecordId parameters returned by the API for checking the availability of rolling back
    */
    @SerializedName("FromRecordId")
    @Expose
    private String FromRecordId;

    /**
    * ToRecordId parameters returned by the API for checking the availability of rolling back
    */
    @SerializedName("ToRecordId")
    @Expose
    private String ToRecordId;

    /**
     * Get Engine ID 
     * @return DataEngineId Engine ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set Engine ID
     * @param DataEngineId Engine ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get FromRecordId parameters returned by the API for checking the availability of rolling back 
     * @return FromRecordId FromRecordId parameters returned by the API for checking the availability of rolling back
     */
    public String getFromRecordId() {
        return this.FromRecordId;
    }

    /**
     * Set FromRecordId parameters returned by the API for checking the availability of rolling back
     * @param FromRecordId FromRecordId parameters returned by the API for checking the availability of rolling back
     */
    public void setFromRecordId(String FromRecordId) {
        this.FromRecordId = FromRecordId;
    }

    /**
     * Get ToRecordId parameters returned by the API for checking the availability of rolling back 
     * @return ToRecordId ToRecordId parameters returned by the API for checking the availability of rolling back
     */
    public String getToRecordId() {
        return this.ToRecordId;
    }

    /**
     * Set ToRecordId parameters returned by the API for checking the availability of rolling back
     * @param ToRecordId ToRecordId parameters returned by the API for checking the availability of rolling back
     */
    public void setToRecordId(String ToRecordId) {
        this.ToRecordId = ToRecordId;
    }

    public RollbackDataEngineImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackDataEngineImageRequest(RollbackDataEngineImageRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.FromRecordId != null) {
            this.FromRecordId = new String(source.FromRecordId);
        }
        if (source.ToRecordId != null) {
            this.ToRecordId = new String(source.ToRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "FromRecordId", this.FromRecordId);
        this.setParamSimple(map, prefix + "ToRecordId", this.ToRecordId);

    }
}

