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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceProcessFunctionInfo extends AbstractModel {

    /**
    * Detection alarm level.
    */
    @SerializedName("DetectAlert")
    @Expose
    private String DetectAlert;

    /**
    * Detection feature description

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetetcFunctionKey")
    @Expose
    private String DetetcFunctionKey;

    /**
    * Detection feature result

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetetcFunctionValue")
    @Expose
    private String DetetcFunctionValue;

    /**
    * Detection results.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetetcTime")
    @Expose
    private String DetetcTime;

    /**
    * Detection feature description.
    */
    @SerializedName("DetectFunctionKey")
    @Expose
    private String DetectFunctionKey;

    /**
    * Detection feature result.
    */
    @SerializedName("DetectFunctionValue")
    @Expose
    private String DetectFunctionValue;

    /**
    * Detection result.
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
     * Get Detection alarm level. 
     * @return DetectAlert Detection alarm level.
     */
    public String getDetectAlert() {
        return this.DetectAlert;
    }

    /**
     * Set Detection alarm level.
     * @param DetectAlert Detection alarm level.
     */
    public void setDetectAlert(String DetectAlert) {
        this.DetectAlert = DetectAlert;
    }

    /**
     * Get Detection feature description

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetetcFunctionKey Detection feature description

Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getDetetcFunctionKey() {
        return this.DetetcFunctionKey;
    }

    /**
     * Set Detection feature description

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetetcFunctionKey Detection feature description

Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setDetetcFunctionKey(String DetetcFunctionKey) {
        this.DetetcFunctionKey = DetetcFunctionKey;
    }

    /**
     * Get Detection feature result

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetetcFunctionValue Detection feature result

Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getDetetcFunctionValue() {
        return this.DetetcFunctionValue;
    }

    /**
     * Set Detection feature result

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetetcFunctionValue Detection feature result

Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setDetetcFunctionValue(String DetetcFunctionValue) {
        this.DetetcFunctionValue = DetetcFunctionValue;
    }

    /**
     * Get Detection results.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetetcTime Detection results.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getDetetcTime() {
        return this.DetetcTime;
    }

    /**
     * Set Detection results.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetetcTime Detection results.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setDetetcTime(String DetetcTime) {
        this.DetetcTime = DetetcTime;
    }

    /**
     * Get Detection feature description. 
     * @return DetectFunctionKey Detection feature description.
     */
    public String getDetectFunctionKey() {
        return this.DetectFunctionKey;
    }

    /**
     * Set Detection feature description.
     * @param DetectFunctionKey Detection feature description.
     */
    public void setDetectFunctionKey(String DetectFunctionKey) {
        this.DetectFunctionKey = DetectFunctionKey;
    }

    /**
     * Get Detection feature result. 
     * @return DetectFunctionValue Detection feature result.
     */
    public String getDetectFunctionValue() {
        return this.DetectFunctionValue;
    }

    /**
     * Set Detection feature result.
     * @param DetectFunctionValue Detection feature result.
     */
    public void setDetectFunctionValue(String DetectFunctionValue) {
        this.DetectFunctionValue = DetectFunctionValue;
    }

    /**
     * Get Detection result. 
     * @return DetectTime Detection result.
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set Detection result.
     * @param DetectTime Detection result.
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    public ServiceProcessFunctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceProcessFunctionInfo(ServiceProcessFunctionInfo source) {
        if (source.DetectAlert != null) {
            this.DetectAlert = new String(source.DetectAlert);
        }
        if (source.DetetcFunctionKey != null) {
            this.DetetcFunctionKey = new String(source.DetetcFunctionKey);
        }
        if (source.DetetcFunctionValue != null) {
            this.DetetcFunctionValue = new String(source.DetetcFunctionValue);
        }
        if (source.DetetcTime != null) {
            this.DetetcTime = new String(source.DetetcTime);
        }
        if (source.DetectFunctionKey != null) {
            this.DetectFunctionKey = new String(source.DetectFunctionKey);
        }
        if (source.DetectFunctionValue != null) {
            this.DetectFunctionValue = new String(source.DetectFunctionValue);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectAlert", this.DetectAlert);
        this.setParamSimple(map, prefix + "DetetcFunctionKey", this.DetetcFunctionKey);
        this.setParamSimple(map, prefix + "DetetcFunctionValue", this.DetetcFunctionValue);
        this.setParamSimple(map, prefix + "DetetcTime", this.DetetcTime);
        this.setParamSimple(map, prefix + "DetectFunctionKey", this.DetectFunctionKey);
        this.setParamSimple(map, prefix + "DetectFunctionValue", this.DetectFunctionValue);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);

    }
}

