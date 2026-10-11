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

public class ExportConfContext extends AbstractModel {

    /**
    * <p>Service configuration.</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private Long ServiceType;

    /**
    * <p>File name.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>Service name.</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
     * Get <p>Service configuration.</p> 
     * @return ServiceType <p>Service configuration.</p>
     */
    public Long getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>Service configuration.</p>
     * @param ServiceType <p>Service configuration.</p>
     */
    public void setServiceType(Long ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>File name.</p> 
     * @return FileName <p>File name.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name.</p>
     * @param FileName <p>File name.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>Service name.</p> 
     * @return ServiceName <p>Service name.</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>Service name.</p>
     * @param ServiceName <p>Service name.</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public ExportConfContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportConfContext(ExportConfContext source) {
        if (source.ServiceType != null) {
            this.ServiceType = new Long(source.ServiceType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);

    }
}

