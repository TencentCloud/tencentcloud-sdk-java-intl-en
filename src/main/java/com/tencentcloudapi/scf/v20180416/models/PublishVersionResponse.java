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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishVersionResponse extends AbstractModel {

    /**
    * Function version
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * Code size
    */
    @SerializedName("CodeSize")
    @Expose
    private Long CodeSize;

    /**
    * Maximum available memory
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * Function description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Function entry
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * Function timeout
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Function running environment 
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * Function namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Function version 
     * @return FunctionVersion Function version
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set Function version
     * @param FunctionVersion Function version
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get Code size 
     * @return CodeSize Code size
     */
    public Long getCodeSize() {
        return this.CodeSize;
    }

    /**
     * Set Code size
     * @param CodeSize Code size
     */
    public void setCodeSize(Long CodeSize) {
        this.CodeSize = CodeSize;
    }

    /**
     * Get Maximum available memory 
     * @return MemorySize Maximum available memory
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set Maximum available memory
     * @param MemorySize Maximum available memory
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get Function description 
     * @return Description Function description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function description
     * @param Description Function description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Function entry 
     * @return Handler Function entry
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set Function entry
     * @param Handler Function entry
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get Function timeout 
     * @return Timeout Function timeout
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Function timeout
     * @param Timeout Function timeout
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Function running environment 
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Runtime Function running environment 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Function running environment 
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Runtime Function running environment 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Function namespace 
     * @return Namespace Function namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace
     * @param Namespace Function namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
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

    public PublishVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishVersionResponse(PublishVersionResponse source) {
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
        if (source.CodeSize != null) {
            this.CodeSize = new Long(source.CodeSize);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new Long(source.MemorySize);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Handler != null) {
            this.Handler = new String(source.Handler);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "CodeSize", this.CodeSize);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

