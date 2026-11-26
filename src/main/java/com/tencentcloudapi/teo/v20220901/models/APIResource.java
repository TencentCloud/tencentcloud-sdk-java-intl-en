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
    * Resource ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Resource name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of API service IDs associated with the API resource.
    */
    @SerializedName("APIServiceIds")
    @Expose
    private String [] APIServiceIds;

    /**
    * Resource path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Request method list. Supports the following values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE.
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * Specific content of the request content matching rule. It must comply with the expression syntax. For detailed specifications, see the product document.
    */
    @SerializedName("RequestConstraint")
    @Expose
    private String RequestConstraint;

    /**
     * Get Resource ID. 
     * @return Id Resource ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource ID.
     * @param Id Resource ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Resource name. 
     * @return Name Resource name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Resource name.
     * @param Name Resource name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of API service IDs associated with the API resource. 
     * @return APIServiceIds List of API service IDs associated with the API resource.
     */
    public String [] getAPIServiceIds() {
        return this.APIServiceIds;
    }

    /**
     * Set List of API service IDs associated with the API resource.
     * @param APIServiceIds List of API service IDs associated with the API resource.
     */
    public void setAPIServiceIds(String [] APIServiceIds) {
        this.APIServiceIds = APIServiceIds;
    }

    /**
     * Get Resource path. 
     * @return Path Resource path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Resource path.
     * @param Path Resource path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Request method list. Supports the following values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE. 
     * @return Methods Request method list. Supports the following values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE.
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set Request method list. Supports the following values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE.
     * @param Methods Request method list. Supports the following values: GET, POST, PUT, HEAD, PATCH, OPTIONS, DELETE.
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get Specific content of the request content matching rule. It must comply with the expression syntax. For detailed specifications, see the product document. 
     * @return RequestConstraint Specific content of the request content matching rule. It must comply with the expression syntax. For detailed specifications, see the product document.
     */
    public String getRequestConstraint() {
        return this.RequestConstraint;
    }

    /**
     * Set Specific content of the request content matching rule. It must comply with the expression syntax. For detailed specifications, see the product document.
     * @param RequestConstraint Specific content of the request content matching rule. It must comply with the expression syntax. For detailed specifications, see the product document.
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

