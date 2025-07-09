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

public class UpdateUserDataEngineConfigRequest extends AbstractModel {

    /**
    * Engine ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * Collection of user-defined engine configuration items. This parameter needs to input all the configuration items users should add. For example, if there is a configuration item named k1:v1 while k2:v2 needs to be added, [k1:v1,k2:v2] should be passed.
    */
    @SerializedName("DataEngineConfigPairs")
    @Expose
    private DataEngineConfigPair [] DataEngineConfigPairs;

    /**
    * Template of the resource configuration of the job engine
    */
    @SerializedName("SessionResourceTemplate")
    @Expose
    private SessionResourceTemplate SessionResourceTemplate;

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
     * Get Collection of user-defined engine configuration items. This parameter needs to input all the configuration items users should add. For example, if there is a configuration item named k1:v1 while k2:v2 needs to be added, [k1:v1,k2:v2] should be passed. 
     * @return DataEngineConfigPairs Collection of user-defined engine configuration items. This parameter needs to input all the configuration items users should add. For example, if there is a configuration item named k1:v1 while k2:v2 needs to be added, [k1:v1,k2:v2] should be passed.
     */
    public DataEngineConfigPair [] getDataEngineConfigPairs() {
        return this.DataEngineConfigPairs;
    }

    /**
     * Set Collection of user-defined engine configuration items. This parameter needs to input all the configuration items users should add. For example, if there is a configuration item named k1:v1 while k2:v2 needs to be added, [k1:v1,k2:v2] should be passed.
     * @param DataEngineConfigPairs Collection of user-defined engine configuration items. This parameter needs to input all the configuration items users should add. For example, if there is a configuration item named k1:v1 while k2:v2 needs to be added, [k1:v1,k2:v2] should be passed.
     */
    public void setDataEngineConfigPairs(DataEngineConfigPair [] DataEngineConfigPairs) {
        this.DataEngineConfigPairs = DataEngineConfigPairs;
    }

    /**
     * Get Template of the resource configuration of the job engine 
     * @return SessionResourceTemplate Template of the resource configuration of the job engine
     */
    public SessionResourceTemplate getSessionResourceTemplate() {
        return this.SessionResourceTemplate;
    }

    /**
     * Set Template of the resource configuration of the job engine
     * @param SessionResourceTemplate Template of the resource configuration of the job engine
     */
    public void setSessionResourceTemplate(SessionResourceTemplate SessionResourceTemplate) {
        this.SessionResourceTemplate = SessionResourceTemplate;
    }

    public UpdateUserDataEngineConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserDataEngineConfigRequest(UpdateUserDataEngineConfigRequest source) {
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

