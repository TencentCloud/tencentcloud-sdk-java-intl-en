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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo extends AbstractModel {

    /**
    * Log category.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogComponent")
    @Expose
    private String LogComponent;

    /**
    * Log level.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * Log generation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogTime")
    @Expose
    private String LogTime;

    /**
    * Log details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogDetail")
    @Expose
    private String LogDetail;

    /**
    * Log connection information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogConnection")
    @Expose
    private String LogConnection;

    /**
    * Log ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
     * Get Log category.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogComponent Log category.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogComponent() {
        return this.LogComponent;
    }

    /**
     * Set Log category.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogComponent Log category.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogComponent(String LogComponent) {
        this.LogComponent = LogComponent;
    }

    /**
     * Get Log level.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogLevel Log level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set Log level.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogLevel Log level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get Log generation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogTime Log generation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogTime() {
        return this.LogTime;
    }

    /**
     * Set Log generation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogTime Log generation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogTime(String LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get Log details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogDetail Log details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogDetail() {
        return this.LogDetail;
    }

    /**
     * Set Log details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogDetail Log details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogDetail(String LogDetail) {
        this.LogDetail = LogDetail;
    }

    /**
     * Get Log connection information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogConnection Log connection information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogConnection() {
        return this.LogConnection;
    }

    /**
     * Set Log connection information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogConnection Log connection information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogConnection(String LogConnection) {
        this.LogConnection = LogConnection;
    }

    /**
     * Get Log ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogId Log ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set Log ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogId Log ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    public LogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInfo(LogInfo source) {
        if (source.LogComponent != null) {
            this.LogComponent = new String(source.LogComponent);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.LogTime != null) {
            this.LogTime = new String(source.LogTime);
        }
        if (source.LogDetail != null) {
            this.LogDetail = new String(source.LogDetail);
        }
        if (source.LogConnection != null) {
            this.LogConnection = new String(source.LogConnection);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogComponent", this.LogComponent);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "LogDetail", this.LogDetail);
        this.setParamSimple(map, prefix + "LogConnection", this.LogConnection);
        this.setParamSimple(map, prefix + "LogId", this.LogId);

    }
}

