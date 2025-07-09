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

public class APIDocInfo extends AbstractModel {

    /**
    * API document ID
    */
    @SerializedName("ApiDocId")
    @Expose
    private String ApiDocId;

    /**
    * API document name
    */
    @SerializedName("ApiDocName")
    @Expose
    private String ApiDocName;

    /**
    * API document build status
    */
    @SerializedName("ApiDocStatus")
    @Expose
    private String ApiDocStatus;

    /**
    * Number of APIs with API documents
    */
    @SerializedName("ApiCount")
    @Expose
    private Long ApiCount;

    /**
    * Number of views of API document
    */
    @SerializedName("ViewCount")
    @Expose
    private Long ViewCount;

    /**
    * Number of releases of API document
    */
    @SerializedName("ReleaseCount")
    @Expose
    private Long ReleaseCount;

    /**
    * API document access URI
    */
    @SerializedName("ApiDocUri")
    @Expose
    private String ApiDocUri;

    /**
    * API document password for sharing
    */
    @SerializedName("SharePassword")
    @Expose
    private String SharePassword;

    /**
    * API document update time
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Environment information
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * ID of the API for which to generate the API document
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

    /**
    * Service name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Name of the API for which to generate the API document
    */
    @SerializedName("ApiNames")
    @Expose
    private String [] ApiNames;

    /**
     * Get API document ID 
     * @return ApiDocId API document ID
     */
    public String getApiDocId() {
        return this.ApiDocId;
    }

    /**
     * Set API document ID
     * @param ApiDocId API document ID
     */
    public void setApiDocId(String ApiDocId) {
        this.ApiDocId = ApiDocId;
    }

    /**
     * Get API document name 
     * @return ApiDocName API document name
     */
    public String getApiDocName() {
        return this.ApiDocName;
    }

    /**
     * Set API document name
     * @param ApiDocName API document name
     */
    public void setApiDocName(String ApiDocName) {
        this.ApiDocName = ApiDocName;
    }

    /**
     * Get API document build status 
     * @return ApiDocStatus API document build status
     */
    public String getApiDocStatus() {
        return this.ApiDocStatus;
    }

    /**
     * Set API document build status
     * @param ApiDocStatus API document build status
     */
    public void setApiDocStatus(String ApiDocStatus) {
        this.ApiDocStatus = ApiDocStatus;
    }

    /**
     * Get Number of APIs with API documents 
     * @return ApiCount Number of APIs with API documents
     */
    public Long getApiCount() {
        return this.ApiCount;
    }

    /**
     * Set Number of APIs with API documents
     * @param ApiCount Number of APIs with API documents
     */
    public void setApiCount(Long ApiCount) {
        this.ApiCount = ApiCount;
    }

    /**
     * Get Number of views of API document 
     * @return ViewCount Number of views of API document
     */
    public Long getViewCount() {
        return this.ViewCount;
    }

    /**
     * Set Number of views of API document
     * @param ViewCount Number of views of API document
     */
    public void setViewCount(Long ViewCount) {
        this.ViewCount = ViewCount;
    }

    /**
     * Get Number of releases of API document 
     * @return ReleaseCount Number of releases of API document
     */
    public Long getReleaseCount() {
        return this.ReleaseCount;
    }

    /**
     * Set Number of releases of API document
     * @param ReleaseCount Number of releases of API document
     */
    public void setReleaseCount(Long ReleaseCount) {
        this.ReleaseCount = ReleaseCount;
    }

    /**
     * Get API document access URI 
     * @return ApiDocUri API document access URI
     */
    public String getApiDocUri() {
        return this.ApiDocUri;
    }

    /**
     * Set API document access URI
     * @param ApiDocUri API document access URI
     */
    public void setApiDocUri(String ApiDocUri) {
        this.ApiDocUri = ApiDocUri;
    }

    /**
     * Get API document password for sharing 
     * @return SharePassword API document password for sharing
     */
    public String getSharePassword() {
        return this.SharePassword;
    }

    /**
     * Set API document password for sharing
     * @param SharePassword API document password for sharing
     */
    public void setSharePassword(String SharePassword) {
        this.SharePassword = SharePassword;
    }

    /**
     * Get API document update time 
     * @return UpdatedTime API document update time
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set API document update time
     * @param UpdatedTime API document update time
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Environment information 
     * @return Environment Environment information
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Environment information
     * @param Environment Environment information
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get ID of the API for which to generate the API document 
     * @return ApiIds ID of the API for which to generate the API document
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set ID of the API for which to generate the API document
     * @param ApiIds ID of the API for which to generate the API document
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    /**
     * Get Service name 
     * @return ServiceName Service name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name
     * @param ServiceName Service name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Name of the API for which to generate the API document 
     * @return ApiNames Name of the API for which to generate the API document
     */
    public String [] getApiNames() {
        return this.ApiNames;
    }

    /**
     * Set Name of the API for which to generate the API document
     * @param ApiNames Name of the API for which to generate the API document
     */
    public void setApiNames(String [] ApiNames) {
        this.ApiNames = ApiNames;
    }

    public APIDocInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIDocInfo(APIDocInfo source) {
        if (source.ApiDocId != null) {
            this.ApiDocId = new String(source.ApiDocId);
        }
        if (source.ApiDocName != null) {
            this.ApiDocName = new String(source.ApiDocName);
        }
        if (source.ApiDocStatus != null) {
            this.ApiDocStatus = new String(source.ApiDocStatus);
        }
        if (source.ApiCount != null) {
            this.ApiCount = new Long(source.ApiCount);
        }
        if (source.ViewCount != null) {
            this.ViewCount = new Long(source.ViewCount);
        }
        if (source.ReleaseCount != null) {
            this.ReleaseCount = new Long(source.ReleaseCount);
        }
        if (source.ApiDocUri != null) {
            this.ApiDocUri = new String(source.ApiDocUri);
        }
        if (source.SharePassword != null) {
            this.SharePassword = new String(source.SharePassword);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ApiIds != null) {
            this.ApiIds = new String[source.ApiIds.length];
            for (int i = 0; i < source.ApiIds.length; i++) {
                this.ApiIds[i] = new String(source.ApiIds[i]);
            }
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ApiNames != null) {
            this.ApiNames = new String[source.ApiNames.length];
            for (int i = 0; i < source.ApiNames.length; i++) {
                this.ApiNames[i] = new String(source.ApiNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiDocId", this.ApiDocId);
        this.setParamSimple(map, prefix + "ApiDocName", this.ApiDocName);
        this.setParamSimple(map, prefix + "ApiDocStatus", this.ApiDocStatus);
        this.setParamSimple(map, prefix + "ApiCount", this.ApiCount);
        this.setParamSimple(map, prefix + "ViewCount", this.ViewCount);
        this.setParamSimple(map, prefix + "ReleaseCount", this.ReleaseCount);
        this.setParamSimple(map, prefix + "ApiDocUri", this.ApiDocUri);
        this.setParamSimple(map, prefix + "SharePassword", this.SharePassword);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArraySimple(map, prefix + "ApiNames.", this.ApiNames);

    }
}

