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

public class ServiceBasicRestartInfo extends AbstractModel {

    /**
    * Service name, required. Example: HDFS.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * If not provided, it indicates all processes.
    */
    @SerializedName("ComponentInfoList")
    @Expose
    private ComponentBasicRestartInfo [] ComponentInfoList;

    /**
     * Get Service name, required. Example: HDFS. 
     * @return ServiceName Service name, required. Example: HDFS.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name, required. Example: HDFS.
     * @param ServiceName Service name, required. Example: HDFS.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get If not provided, it indicates all processes. 
     * @return ComponentInfoList If not provided, it indicates all processes.
     */
    public ComponentBasicRestartInfo [] getComponentInfoList() {
        return this.ComponentInfoList;
    }

    /**
     * Set If not provided, it indicates all processes.
     * @param ComponentInfoList If not provided, it indicates all processes.
     */
    public void setComponentInfoList(ComponentBasicRestartInfo [] ComponentInfoList) {
        this.ComponentInfoList = ComponentInfoList;
    }

    public ServiceBasicRestartInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceBasicRestartInfo(ServiceBasicRestartInfo source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ComponentInfoList != null) {
            this.ComponentInfoList = new ComponentBasicRestartInfo[source.ComponentInfoList.length];
            for (int i = 0; i < source.ComponentInfoList.length; i++) {
                this.ComponentInfoList[i] = new ComponentBasicRestartInfo(source.ComponentInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArrayObj(map, prefix + "ComponentInfoList.", this.ComponentInfoList);

    }
}

