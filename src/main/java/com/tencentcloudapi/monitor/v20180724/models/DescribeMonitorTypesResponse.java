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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMonitorTypesResponse extends AbstractModel {

    /**
    * Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * Monitoring type details
    */
    @SerializedName("MonitorTypeInfos")
    @Expose
    private MonitorTypeInfo [] MonitorTypeInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring) 
     * @return MonitorTypes Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
     */
    public String [] getMonitorTypes() {
        return this.MonitorTypes;
    }

    /**
     * Set Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
     * @param MonitorTypes Monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring)
     */
    public void setMonitorTypes(String [] MonitorTypes) {
        this.MonitorTypes = MonitorTypes;
    }

    /**
     * Get Monitoring type details 
     * @return MonitorTypeInfos Monitoring type details
     */
    public MonitorTypeInfo [] getMonitorTypeInfos() {
        return this.MonitorTypeInfos;
    }

    /**
     * Set Monitoring type details
     * @param MonitorTypeInfos Monitoring type details
     */
    public void setMonitorTypeInfos(MonitorTypeInfo [] MonitorTypeInfos) {
        this.MonitorTypeInfos = MonitorTypeInfos;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMonitorTypesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonitorTypesResponse(DescribeMonitorTypesResponse source) {
        if (source.MonitorTypes != null) {
            this.MonitorTypes = new String[source.MonitorTypes.length];
            for (int i = 0; i < source.MonitorTypes.length; i++) {
                this.MonitorTypes[i] = new String(source.MonitorTypes[i]);
            }
        }
        if (source.MonitorTypeInfos != null) {
            this.MonitorTypeInfos = new MonitorTypeInfo[source.MonitorTypeInfos.length];
            for (int i = 0; i < source.MonitorTypeInfos.length; i++) {
                this.MonitorTypeInfos[i] = new MonitorTypeInfo(source.MonitorTypeInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MonitorTypes.", this.MonitorTypes);
        this.setParamArrayObj(map, prefix + "MonitorTypeInfos.", this.MonitorTypeInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

