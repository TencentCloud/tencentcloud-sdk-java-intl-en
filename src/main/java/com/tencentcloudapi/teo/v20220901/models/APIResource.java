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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APIResource extends AbstractModel {

    /**
    * Specifies the resource ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Specifies the resource name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the API service ID list associated with the API resource.
    */
    @SerializedName("APIServiceIds")
    @Expose
    private String [] APIServiceIds;

    /**
    * Specifies the resource path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Request method list. valid values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE.
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * Specifies the specific content of the request content match rule, which must comply with the expression grammar. please refer to the product document for detailed requirements.
    */
    @SerializedName("RequestConstraint")
    @Expose
    private String RequestConstraint;

    /**
     * Get Specifies the resource ID. 
     * @return Id Specifies the resource ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Specifies the resource ID.
     * @param Id Specifies the resource ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Specifies the resource name. 
     * @return Name Specifies the resource name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the resource name.
     * @param Name Specifies the resource name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the API service ID list associated with the API resource. 
     * @return APIServiceIds Specifies the API service ID list associated with the API resource.
     */
    public String [] getAPIServiceIds() {
        return this.APIServiceIds;
    }

    /**
     * Set Specifies the API service ID list associated with the API resource.
     * @param APIServiceIds Specifies the API service ID list associated with the API resource.
     */
    public void setAPIServiceIds(String [] APIServiceIds) {
        this.APIServiceIds = APIServiceIds;
    }

    /**
     * Get Specifies the resource path. 
     * @return Path Specifies the resource path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Specifies the resource path.
     * @param Path Specifies the resource path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Request method list. valid values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE. 
     * @return Methods Request method list. valid values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE.
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set Request method list. valid values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE.
     * @param Methods Request method list. valid values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE.
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get Specifies the specific content of the request content match rule, which must comply with the expression grammar. please refer to the product document for detailed requirements. 
     * @return RequestConstraint Specifies the specific content of the request content match rule, which must comply with the expression grammar. please refer to the product document for detailed requirements.
     */
    public String getRequestConstraint() {
        return this.RequestConstraint;
    }

    /**
     * Set Specifies the specific content of the request content match rule, which must comply with the expression grammar. please refer to the product document for detailed requirements.
     * @param RequestConstraint Specifies the specific content of the request content match rule, which must comply with the expression grammar. please refer to the product document for detailed requirements.
     */
    public void setRequestConstraint(String RequestConstraint) {
        this.RequestConstraint = RequestConstraint;
    }

    public APIResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIResource(APIResource source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.APIServiceIds != null) {
            this.APIServiceIds = new String[source.APIServiceIds.length];
            for (int i = 0; i < source.APIServiceIds.length; i++) {
                this.APIServiceIds[i] = new String(source.APIServiceIds[i]);
            }
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.RequestConstraint != null) {
            this.RequestConstraint = new String(source.RequestConstraint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "APIServiceIds.", this.APIServiceIds);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamSimple(map, prefix + "RequestConstraint", this.RequestConstraint);

    }
}

