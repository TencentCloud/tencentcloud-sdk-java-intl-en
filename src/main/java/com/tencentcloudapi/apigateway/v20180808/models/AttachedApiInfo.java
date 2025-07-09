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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachedApiInfo extends AbstractModel {

    /**
    * ID of the service to which the API belongs
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Name of the service to which the API belongs
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Description of the service to which the API belongs
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * API ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API name
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * Environment of the API bound with the plugin
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Time when the plugin was bound to the API
    */
    @SerializedName("AttachedTime")
    @Expose
    private String AttachedTime;

    /**
     * Get ID of the service to which the API belongs 
     * @return ServiceId ID of the service to which the API belongs
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set ID of the service to which the API belongs
     * @param ServiceId ID of the service to which the API belongs
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Name of the service to which the API belongs 
     * @return ServiceName Name of the service to which the API belongs
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Name of the service to which the API belongs
     * @param ServiceName Name of the service to which the API belongs
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Description of the service to which the API belongs
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDesc Description of the service to which the API belongs
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set Description of the service to which the API belongs
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceDesc Description of the service to which the API belongs
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get API ID 
     * @return ApiId API ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
     * @param ApiId API ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API name 
     * @return ApiName API name
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name
     * @param ApiName API name
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiDesc API description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiDesc API description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get Environment of the API bound with the plugin 
     * @return Environment Environment of the API bound with the plugin
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Environment of the API bound with the plugin
     * @param Environment Environment of the API bound with the plugin
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Time when the plugin was bound to the API 
     * @return AttachedTime Time when the plugin was bound to the API
     */
    public String getAttachedTime() {
        return this.AttachedTime;
    }

    /**
     * Set Time when the plugin was bound to the API
     * @param AttachedTime Time when the plugin was bound to the API
     */
    public void setAttachedTime(String AttachedTime) {
        this.AttachedTime = AttachedTime;
    }

    public AttachedApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedApiInfo(AttachedApiInfo source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.AttachedTime != null) {
            this.AttachedTime = new String(source.AttachedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "AttachedTime", this.AttachedTime);

    }
}

