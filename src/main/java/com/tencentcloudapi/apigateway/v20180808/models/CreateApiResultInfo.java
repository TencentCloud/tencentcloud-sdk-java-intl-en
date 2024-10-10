/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class CreateApiResultInfo extends AbstractModel {

    /**
    * API ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * Path
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Request method
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Creation time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get API ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiId API ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiId API ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get Path
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Path Path
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Path Path
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Request method
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Method Request method
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Request method
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Method Request method
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Creation time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public CreateApiResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiResultInfo(CreateApiResultInfo source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

