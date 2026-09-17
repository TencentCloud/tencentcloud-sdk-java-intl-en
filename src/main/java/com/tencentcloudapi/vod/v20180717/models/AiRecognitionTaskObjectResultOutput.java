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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskObjectResultOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ResultSet")
    @Expose
    private AiRecognitionTaskObjectResultItem [] ResultSet;

    /**
    * 
    */
    @SerializedName("ResultSetFileUrl")
    @Expose
    private String ResultSetFileUrl;

    /**
    * 
    */
    @SerializedName("ResultSetFileUrlExpireTime")
    @Expose
    private String ResultSetFileUrlExpireTime;

    /**
     * Get  
     * @return ResultSet 
     */
    public AiRecognitionTaskObjectResultItem [] getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set 
     * @param ResultSet 
     */
    public void setResultSet(AiRecognitionTaskObjectResultItem [] ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get  
     * @return ResultSetFileUrl 
     */
    public String getResultSetFileUrl() {
        return this.ResultSetFileUrl;
    }

    /**
     * Set 
     * @param ResultSetFileUrl 
     */
    public void setResultSetFileUrl(String ResultSetFileUrl) {
        this.ResultSetFileUrl = ResultSetFileUrl;
    }

    /**
     * Get  
     * @return ResultSetFileUrlExpireTime 
     */
    public String getResultSetFileUrlExpireTime() {
        return this.ResultSetFileUrlExpireTime;
    }

    /**
     * Set 
     * @param ResultSetFileUrlExpireTime 
     */
    public void setResultSetFileUrlExpireTime(String ResultSetFileUrlExpireTime) {
        this.ResultSetFileUrlExpireTime = ResultSetFileUrlExpireTime;
    }

    public AiRecognitionTaskObjectResultOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskObjectResultOutput(AiRecognitionTaskObjectResultOutput source) {
        if (source.ResultSet != null) {
            this.ResultSet = new AiRecognitionTaskObjectResultItem[source.ResultSet.length];
            for (int i = 0; i < source.ResultSet.length; i++) {
                this.ResultSet[i] = new AiRecognitionTaskObjectResultItem(source.ResultSet[i]);
            }
        }
        if (source.ResultSetFileUrl != null) {
            this.ResultSetFileUrl = new String(source.ResultSetFileUrl);
        }
        if (source.ResultSetFileUrlExpireTime != null) {
            this.ResultSetFileUrlExpireTime = new String(source.ResultSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResultSet.", this.ResultSet);
        this.setParamSimple(map, prefix + "ResultSetFileUrl", this.ResultSetFileUrl);
        this.setParamSimple(map, prefix + "ResultSetFileUrlExpireTime", this.ResultSetFileUrlExpireTime);

    }
}

