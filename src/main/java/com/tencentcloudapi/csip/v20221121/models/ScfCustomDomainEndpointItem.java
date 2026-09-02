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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScfCustomDomainEndpointItem extends AbstractModel {

    /**
    * <p>Matching path</p>
    */
    @SerializedName("PathMatch")
    @Expose
    private String PathMatch;

    /**
    * <p>Namespace.</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Function name</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>Function version</p>
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get <p>Matching path</p> 
     * @return PathMatch <p>Matching path</p>
     */
    public String getPathMatch() {
        return this.PathMatch;
    }

    /**
     * Set <p>Matching path</p>
     * @param PathMatch <p>Matching path</p>
     */
    public void setPathMatch(String PathMatch) {
        this.PathMatch = PathMatch;
    }

    /**
     * Get <p>Namespace.</p> 
     * @return Namespace <p>Namespace.</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Namespace.</p>
     * @param Namespace <p>Namespace.</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>Function name</p> 
     * @return FunctionName <p>Function name</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>Function name</p>
     * @param FunctionName <p>Function name</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>Function version</p> 
     * @return Qualifier <p>Function version</p>
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set <p>Function version</p>
     * @param Qualifier <p>Function version</p>
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public ScfCustomDomainEndpointItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScfCustomDomainEndpointItem(ScfCustomDomainEndpointItem source) {
        if (source.PathMatch != null) {
            this.PathMatch = new String(source.PathMatch);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PathMatch", this.PathMatch);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

