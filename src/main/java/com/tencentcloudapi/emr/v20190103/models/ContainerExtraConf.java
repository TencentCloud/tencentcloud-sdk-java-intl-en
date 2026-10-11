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

public class ContainerExtraConf extends AbstractModel {

    /**
    * <p>Proxy access type for computing jobs, such as Spark jobs and the RayCluster UI. If not specified, Internal is used by default.</p><p>Enumeration values:</p><ul><li>Internal: access through the private network LB proxy.</li><li>Public: access through the public network LB proxy.</li><li>None: No LB proxy access is created.</li></ul>
    */
    @SerializedName("JobAccessProxyType")
    @Expose
    private String JobAccessProxyType;

    /**
     * Get <p>Proxy access type for computing jobs, such as Spark jobs and the RayCluster UI. If not specified, Internal is used by default.</p><p>Enumeration values:</p><ul><li>Internal: access through the private network LB proxy.</li><li>Public: access through the public network LB proxy.</li><li>None: No LB proxy access is created.</li></ul> 
     * @return JobAccessProxyType <p>Proxy access type for computing jobs, such as Spark jobs and the RayCluster UI. If not specified, Internal is used by default.</p><p>Enumeration values:</p><ul><li>Internal: access through the private network LB proxy.</li><li>Public: access through the public network LB proxy.</li><li>None: No LB proxy access is created.</li></ul>
     */
    public String getJobAccessProxyType() {
        return this.JobAccessProxyType;
    }

    /**
     * Set <p>Proxy access type for computing jobs, such as Spark jobs and the RayCluster UI. If not specified, Internal is used by default.</p><p>Enumeration values:</p><ul><li>Internal: access through the private network LB proxy.</li><li>Public: access through the public network LB proxy.</li><li>None: No LB proxy access is created.</li></ul>
     * @param JobAccessProxyType <p>Proxy access type for computing jobs, such as Spark jobs and the RayCluster UI. If not specified, Internal is used by default.</p><p>Enumeration values:</p><ul><li>Internal: access through the private network LB proxy.</li><li>Public: access through the public network LB proxy.</li><li>None: No LB proxy access is created.</li></ul>
     */
    public void setJobAccessProxyType(String JobAccessProxyType) {
        this.JobAccessProxyType = JobAccessProxyType;
    }

    public ContainerExtraConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerExtraConf(ContainerExtraConf source) {
        if (source.JobAccessProxyType != null) {
            this.JobAccessProxyType = new String(source.JobAccessProxyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobAccessProxyType", this.JobAccessProxyType);

    }
}

