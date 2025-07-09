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

public class CheckDataEngineConfigPairsValidityRequest extends AbstractModel {

    /**
    * ID of the minor version of the engine
    */
    @SerializedName("ChildImageVersionId")
    @Expose
    private String ChildImageVersionId;

    /**
    * User-defined parameters
    */
    @SerializedName("DataEngineConfigPairs")
    @Expose
    private DataEngineConfigPair [] DataEngineConfigPairs;

    /**
    * ID of the major version of the engine. If there is the ID of the minor version, only the ID of the minor version needs to be input. If not, the latest ID of the minor version under the major version will be acquired.
    */
    @SerializedName("ImageVersionId")
    @Expose
    private String ImageVersionId;

    /**
     * Get ID of the minor version of the engine 
     * @return ChildImageVersionId ID of the minor version of the engine
     */
    public String getChildImageVersionId() {
        return this.ChildImageVersionId;
    }

    /**
     * Set ID of the minor version of the engine
     * @param ChildImageVersionId ID of the minor version of the engine
     */
    public void setChildImageVersionId(String ChildImageVersionId) {
        this.ChildImageVersionId = ChildImageVersionId;
    }

    /**
     * Get User-defined parameters 
     * @return DataEngineConfigPairs User-defined parameters
     */
    public DataEngineConfigPair [] getDataEngineConfigPairs() {
        return this.DataEngineConfigPairs;
    }

    /**
     * Set User-defined parameters
     * @param DataEngineConfigPairs User-defined parameters
     */
    public void setDataEngineConfigPairs(DataEngineConfigPair [] DataEngineConfigPairs) {
        this.DataEngineConfigPairs = DataEngineConfigPairs;
    }

    /**
     * Get ID of the major version of the engine. If there is the ID of the minor version, only the ID of the minor version needs to be input. If not, the latest ID of the minor version under the major version will be acquired. 
     * @return ImageVersionId ID of the major version of the engine. If there is the ID of the minor version, only the ID of the minor version needs to be input. If not, the latest ID of the minor version under the major version will be acquired.
     */
    public String getImageVersionId() {
        return this.ImageVersionId;
    }

    /**
     * Set ID of the major version of the engine. If there is the ID of the minor version, only the ID of the minor version needs to be input. If not, the latest ID of the minor version under the major version will be acquired.
     * @param ImageVersionId ID of the major version of the engine. If there is the ID of the minor version, only the ID of the minor version needs to be input. If not, the latest ID of the minor version under the major version will be acquired.
     */
    public void setImageVersionId(String ImageVersionId) {
        this.ImageVersionId = ImageVersionId;
    }

    public CheckDataEngineConfigPairsValidityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckDataEngineConfigPairsValidityRequest(CheckDataEngineConfigPairsValidityRequest source) {
        if (source.ChildImageVersionId != null) {
            this.ChildImageVersionId = new String(source.ChildImageVersionId);
        }
        if (source.DataEngineConfigPairs != null) {
            this.DataEngineConfigPairs = new DataEngineConfigPair[source.DataEngineConfigPairs.length];
            for (int i = 0; i < source.DataEngineConfigPairs.length; i++) {
                this.DataEngineConfigPairs[i] = new DataEngineConfigPair(source.DataEngineConfigPairs[i]);
            }
        }
        if (source.ImageVersionId != null) {
            this.ImageVersionId = new String(source.ImageVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChildImageVersionId", this.ChildImageVersionId);
        this.setParamArrayObj(map, prefix + "DataEngineConfigPairs.", this.DataEngineConfigPairs);
        this.setParamSimple(map, prefix + "ImageVersionId", this.ImageVersionId);

    }
}

