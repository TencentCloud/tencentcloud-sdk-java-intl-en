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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineConfigInstanceInfo extends AbstractModel {

    /**
    * Engine ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * Collection of user-defined configuration items
    */
    @SerializedName("DataEngineConfigPairs")
    @Expose
    private DataEngineConfigPair [] DataEngineConfigPairs;

    /**
    * Template of the resource parameter configuration of the job cluster
    */
    @SerializedName("SessionResourceTemplate")
    @Expose
    private SessionResourceTemplate SessionResourceTemplate;

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
     * Get Collection of user-defined configuration items 
     * @return DataEngineConfigPairs Collection of user-defined configuration items
     */
    public DataEngineConfigPair [] getDataEngineConfigPairs() {
        return this.DataEngineConfigPairs;
    }

    /**
     * Set Collection of user-defined configuration items
     * @param DataEngineConfigPairs Collection of user-defined configuration items
     */
    public void setDataEngineConfigPairs(DataEngineConfigPair [] DataEngineConfigPairs) {
        this.DataEngineConfigPairs = DataEngineConfigPairs;
    }

    /**
     * Get Template of the resource parameter configuration of the job cluster 
     * @return SessionResourceTemplate Template of the resource parameter configuration of the job cluster
     */
    public SessionResourceTemplate getSessionResourceTemplate() {
        return this.SessionResourceTemplate;
    }

    /**
     * Set Template of the resource parameter configuration of the job cluster
     * @param SessionResourceTemplate Template of the resource parameter configuration of the job cluster
     */
    public void setSessionResourceTemplate(SessionResourceTemplate SessionResourceTemplate) {
        this.SessionResourceTemplate = SessionResourceTemplate;
    }

    public DataEngineConfigInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineConfigInstanceInfo(DataEngineConfigInstanceInfo source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.DataEngineConfigPairs != null) {
            this.DataEngineConfigPairs = new DataEngineConfigPair[source.DataEngineConfigPairs.length];
            for (int i = 0; i < source.DataEngineConfigPairs.length; i++) {
                this.DataEngineConfigPairs[i] = new DataEngineConfigPair(source.DataEngineConfigPairs[i]);
            }
        }
        if (source.SessionResourceTemplate != null) {
            this.SessionResourceTemplate = new SessionResourceTemplate(source.SessionResourceTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamArrayObj(map, prefix + "DataEngineConfigPairs.", this.DataEngineConfigPairs);
        this.setParamObj(map, prefix + "SessionResourceTemplate.", this.SessionResourceTemplate);

    }
}

