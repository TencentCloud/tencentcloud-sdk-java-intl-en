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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Attributes extends AbstractModel {

    /**
    * Response status code.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Response result code.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Request service.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Request method.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Request duration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get Response status code.

Note: This field may return null, indicating that no valid value is found. 
     * @return Status Response status code.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Response status code.

Note: This field may return null, indicating that no valid value is found.
     * @param Status Response status code.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Response result code.

Note: This field may return null, indicating that no valid value is found. 
     * @return Result Response result code.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Response result code.

Note: This field may return null, indicating that no valid value is found.
     * @param Result Response result code.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Request service.

Note: This field may return null, indicating that no valid value is found. 
     * @return Service Request service.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Request service.

Note: This field may return null, indicating that no valid value is found.
     * @param Service Request service.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Request method.

Note: This field may return null, indicating that no valid value is found. 
     * @return Method Request method.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Request method.

Note: This field may return null, indicating that no valid value is found.
     * @param Method Request method.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Request duration.

Note: This field may return null, indicating that no valid value is found. 
     * @return Duration Request duration.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set Request duration.

Note: This field may return null, indicating that no valid value is found.
     * @param Duration Request duration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public Attributes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Attributes(Attributes source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

