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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportConfMeta extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
    * 
    */
    @SerializedName("ServiceVersion")
    @Expose
    private String ServiceVersion;

    /**
    * 
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
     * Get  
     * @return ServiceName 
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 
     * @param ServiceName 
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get  
     * @return Classification 
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set 
     * @param Classification 
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    /**
     * Get  
     * @return ServiceVersion 
     */
    public String getServiceVersion() {
        return this.ServiceVersion;
    }

    /**
     * Set 
     * @param ServiceVersion 
     */
    public void setServiceVersion(String ServiceVersion) {
        this.ServiceVersion = ServiceVersion;
    }

    /**
     * Get  
     * @return Properties 
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 
     * @param Properties 
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    public ExportConfMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportConfMeta(ExportConfMeta source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Classification != null) {
            this.Classification = new String(source.Classification);
        }
        if (source.ServiceVersion != null) {
            this.ServiceVersion = new String(source.ServiceVersion);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Classification", this.Classification);
        this.setParamSimple(map, prefix + "ServiceVersion", this.ServiceVersion);
        this.setParamSimple(map, prefix + "Properties", this.Properties);

    }
}

