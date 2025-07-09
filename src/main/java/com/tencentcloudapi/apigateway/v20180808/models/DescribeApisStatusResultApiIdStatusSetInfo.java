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

public class DescribeApisStatusResultApiIdStatusSetInfo extends AbstractModel {

    /**
    * Unique service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Unique API ID.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * Custom API description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * Creation time. u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last modification time u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * API name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * API type API type. Valid values: `NORMAL` (general API), `TSF` (microservice API).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API protocol.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Whether to enable debugging after purchase. (This field is reserved for Marketplace
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDebugAfterCharge")
    @Expose
    private Boolean IsDebugAfterCharge;

    /**
    * API authentication type. Valid values: `SECRET` (key pair authentication), `NONE` (no authentication), `OAUTH`, and `EIAM`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * OAuth API type. Valid values: u200d`NORMAL` (service API), `OAUTH` (authorization API). It is only applicable when `AuthType` is `OAUTH`. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiBusinessType")
    @Expose
    private String ApiBusinessType;

    /**
    * Unique ID of associated authorization API. It is applicable when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the service API.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthRelationApiId")
    @Expose
    private String AuthRelationApiId;

    /**
    * OAUTH configuration information. It is applicable when `AuthType` is `OAUTH`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OauthConfig")
    @Expose
    private OauthConfig OauthConfig;

    /**
    * List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelationBuniessApiIds")
    @Expose
    private String [] RelationBuniessApiIds;

    /**
    * Information of tags associated with API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private ApigatewayTags [] Tags;

    /**
    * API path, such as `/path`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API request method, such as `GET`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get Unique service ID. 
     * @return ServiceId Unique service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
     * @param ServiceId Unique service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Unique API ID. 
     * @return ApiId Unique API ID.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Unique API ID.
     * @param ApiId Unique API ID.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get Custom API description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiDesc Custom API description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set Custom API description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiDesc Custom API description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get Creation time. u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time. u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time. u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time. u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Last modification time u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Last modification time u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Last modification time u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Last modification time u200dIt is the UTC time in ISO-8601 format. Format: YYYY-MM-DDThh:mm:ssZ.
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get API name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiName API name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiName API name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get VPC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UniqVpcId Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UniqVpcId Unique VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get API type API type. Valid values: `NORMAL` (general API), `TSF` (microservice API).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiType API type API type. Valid values: `NORMAL` (general API), `TSF` (microservice API).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type API type. Valid values: `NORMAL` (general API), `TSF` (microservice API).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiType API type API type. Valid values: `NORMAL` (general API), `TSF` (microservice API).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API protocol.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol API protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set API protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol API protocol.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Whether to enable debugging after purchase. (This field is reserved for Marketplace
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDebugAfterCharge Whether to enable debugging after purchase. (This field is reserved for Marketplace
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDebugAfterCharge() {
        return this.IsDebugAfterCharge;
    }

    /**
     * Set Whether to enable debugging after purchase. (This field is reserved for Marketplace
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDebugAfterCharge Whether to enable debugging after purchase. (This field is reserved for Marketplace
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDebugAfterCharge(Boolean IsDebugAfterCharge) {
        this.IsDebugAfterCharge = IsDebugAfterCharge;
    }

    /**
     * Get API authentication type. Valid values: `SECRET` (key pair authentication), `NONE` (no authentication), `OAUTH`, and `EIAM`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthType API authentication type. Valid values: `SECRET` (key pair authentication), `NONE` (no authentication), `OAUTH`, and `EIAM`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set API authentication type. Valid values: `SECRET` (key pair authentication), `NONE` (no authentication), `OAUTH`, and `EIAM`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthType API authentication type. Valid values: `SECRET` (key pair authentication), `NONE` (no authentication), `OAUTH`, and `EIAM`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get OAuth API type. Valid values: u200d`NORMAL` (service API), `OAUTH` (authorization API). It is only applicable when `AuthType` is `OAUTH`. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiBusinessType OAuth API type. Valid values: u200d`NORMAL` (service API), `OAUTH` (authorization API). It is only applicable when `AuthType` is `OAUTH`. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiBusinessType() {
        return this.ApiBusinessType;
    }

    /**
     * Set OAuth API type. Valid values: u200d`NORMAL` (service API), `OAUTH` (authorization API). It is only applicable when `AuthType` is `OAUTH`. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiBusinessType OAuth API type. Valid values: u200d`NORMAL` (service API), `OAUTH` (authorization API). It is only applicable when `AuthType` is `OAUTH`. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiBusinessType(String ApiBusinessType) {
        this.ApiBusinessType = ApiBusinessType;
    }

    /**
     * Get Unique ID of associated authorization API. It is applicable when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the service API.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthRelationApiId Unique ID of associated authorization API. It is applicable when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the service API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthRelationApiId() {
        return this.AuthRelationApiId;
    }

    /**
     * Set Unique ID of associated authorization API. It is applicable when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the service API.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthRelationApiId Unique ID of associated authorization API. It is applicable when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the service API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthRelationApiId(String AuthRelationApiId) {
        this.AuthRelationApiId = AuthRelationApiId;
    }

    /**
     * Get OAUTH configuration information. It is applicable when `AuthType` is `OAUTH`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OauthConfig OAUTH configuration information. It is applicable when `AuthType` is `OAUTH`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OauthConfig getOauthConfig() {
        return this.OauthConfig;
    }

    /**
     * Set OAUTH configuration information. It is applicable when `AuthType` is `OAUTH`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OauthConfig OAUTH configuration information. It is applicable when `AuthType` is `OAUTH`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOauthConfig(OauthConfig OauthConfig) {
        this.OauthConfig = OauthConfig;
    }

    /**
     * Get List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RelationBuniessApiIds List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String [] getRelationBuniessApiIds() {
        return this.RelationBuniessApiIds;
    }

    /**
     * Set List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RelationBuniessApiIds List of business APIs associated with authorization API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setRelationBuniessApiIds(String [] RelationBuniessApiIds) {
        this.RelationBuniessApiIds = RelationBuniessApiIds;
    }

    /**
     * Get Information of tags associated with API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Information of tags associated with API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ApigatewayTags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Information of tags associated with API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Information of tags associated with API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(ApigatewayTags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get API path, such as `/path`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Path API path, such as `/path`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API path, such as `/path`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Path API path, such as `/path`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API request method, such as `GET`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Method API request method, such as `GET`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API request method, such as `GET`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Method API request method, such as `GET`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    public DescribeApisStatusResultApiIdStatusSetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApisStatusResultApiIdStatusSetInfo(DescribeApisStatusResultApiIdStatusSetInfo source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IsDebugAfterCharge != null) {
            this.IsDebugAfterCharge = new Boolean(source.IsDebugAfterCharge);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.ApiBusinessType != null) {
            this.ApiBusinessType = new String(source.ApiBusinessType);
        }
        if (source.AuthRelationApiId != null) {
            this.AuthRelationApiId = new String(source.AuthRelationApiId);
        }
        if (source.OauthConfig != null) {
            this.OauthConfig = new OauthConfig(source.OauthConfig);
        }
        if (source.RelationBuniessApiIds != null) {
            this.RelationBuniessApiIds = new String[source.RelationBuniessApiIds.length];
            for (int i = 0; i < source.RelationBuniessApiIds.length; i++) {
                this.RelationBuniessApiIds[i] = new String(source.RelationBuniessApiIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new ApigatewayTags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApigatewayTags(source.Tags[i]);
            }
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IsDebugAfterCharge", this.IsDebugAfterCharge);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ApiBusinessType", this.ApiBusinessType);
        this.setParamSimple(map, prefix + "AuthRelationApiId", this.AuthRelationApiId);
        this.setParamObj(map, prefix + "OauthConfig.", this.OauthConfig);
        this.setParamArraySimple(map, prefix + "RelationBuniessApiIds.", this.RelationBuniessApiIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

