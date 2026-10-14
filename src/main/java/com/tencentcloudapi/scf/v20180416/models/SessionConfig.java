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

public class SessionConfig extends AbstractModel {

    /**
    * session source. Valid values: 'HEADER', 'COOKIE', 'QUERY_STRING'
    */
    @SerializedName("SessionSource")
    @Expose
    private String SessionSource;

    /**
    * session name. It must start with a letter. Other characters can consist of digits, letters, underscores, and hyphens. Length: 5-40 characters.
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * Maximum concurrent sessions
    */
    @SerializedName("MaximumConcurrencySessionPerInstance")
    @Expose
    private Long MaximumConcurrencySessionPerInstance;

    /**
    * Lifecycle
    */
    @SerializedName("MaximumTTLInSeconds")
    @Expose
    private Long MaximumTTLInSeconds;

    /**
    * Idle duration
    */
    @SerializedName("MaximumIdleTimeInSeconds")
    @Expose
    private Long MaximumIdleTimeInSeconds;

    /**
    * Path information corresponding to the session
    */
    @SerializedName("SessionPath")
    @Expose
    private String SessionPath;

    /**
    * Automatically destroy FATAL and auto-pause PAUSE. This only occurs when security isolation is started.
    */
    @SerializedName("IdleTimeoutStrategy")
    @Expose
    private String IdleTimeoutStrategy;

    /**
     * Get session source. Valid values: 'HEADER', 'COOKIE', 'QUERY_STRING' 
     * @return SessionSource session source. Valid values: 'HEADER', 'COOKIE', 'QUERY_STRING'
     */
    public String getSessionSource() {
        return this.SessionSource;
    }

    /**
     * Set session source. Valid values: 'HEADER', 'COOKIE', 'QUERY_STRING'
     * @param SessionSource session source. Valid values: 'HEADER', 'COOKIE', 'QUERY_STRING'
     */
    public void setSessionSource(String SessionSource) {
        this.SessionSource = SessionSource;
    }

    /**
     * Get session name. It must start with a letter. Other characters can consist of digits, letters, underscores, and hyphens. Length: 5-40 characters. 
     * @return SessionName session name. It must start with a letter. Other characters can consist of digits, letters, underscores, and hyphens. Length: 5-40 characters.
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set session name. It must start with a letter. Other characters can consist of digits, letters, underscores, and hyphens. Length: 5-40 characters.
     * @param SessionName session name. It must start with a letter. Other characters can consist of digits, letters, underscores, and hyphens. Length: 5-40 characters.
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get Maximum concurrent sessions 
     * @return MaximumConcurrencySessionPerInstance Maximum concurrent sessions
     */
    public Long getMaximumConcurrencySessionPerInstance() {
        return this.MaximumConcurrencySessionPerInstance;
    }

    /**
     * Set Maximum concurrent sessions
     * @param MaximumConcurrencySessionPerInstance Maximum concurrent sessions
     */
    public void setMaximumConcurrencySessionPerInstance(Long MaximumConcurrencySessionPerInstance) {
        this.MaximumConcurrencySessionPerInstance = MaximumConcurrencySessionPerInstance;
    }

    /**
     * Get Lifecycle 
     * @return MaximumTTLInSeconds Lifecycle
     */
    public Long getMaximumTTLInSeconds() {
        return this.MaximumTTLInSeconds;
    }

    /**
     * Set Lifecycle
     * @param MaximumTTLInSeconds Lifecycle
     */
    public void setMaximumTTLInSeconds(Long MaximumTTLInSeconds) {
        this.MaximumTTLInSeconds = MaximumTTLInSeconds;
    }

    /**
     * Get Idle duration 
     * @return MaximumIdleTimeInSeconds Idle duration
     */
    public Long getMaximumIdleTimeInSeconds() {
        return this.MaximumIdleTimeInSeconds;
    }

    /**
     * Set Idle duration
     * @param MaximumIdleTimeInSeconds Idle duration
     */
    public void setMaximumIdleTimeInSeconds(Long MaximumIdleTimeInSeconds) {
        this.MaximumIdleTimeInSeconds = MaximumIdleTimeInSeconds;
    }

    /**
     * Get Path information corresponding to the session 
     * @return SessionPath Path information corresponding to the session
     */
    public String getSessionPath() {
        return this.SessionPath;
    }

    /**
     * Set Path information corresponding to the session
     * @param SessionPath Path information corresponding to the session
     */
    public void setSessionPath(String SessionPath) {
        this.SessionPath = SessionPath;
    }

    /**
     * Get Automatically destroy FATAL and auto-pause PAUSE. This only occurs when security isolation is started. 
     * @return IdleTimeoutStrategy Automatically destroy FATAL and auto-pause PAUSE. This only occurs when security isolation is started.
     */
    public String getIdleTimeoutStrategy() {
        return this.IdleTimeoutStrategy;
    }

    /**
     * Set Automatically destroy FATAL and auto-pause PAUSE. This only occurs when security isolation is started.
     * @param IdleTimeoutStrategy Automatically destroy FATAL and auto-pause PAUSE. This only occurs when security isolation is started.
     */
    public void setIdleTimeoutStrategy(String IdleTimeoutStrategy) {
        this.IdleTimeoutStrategy = IdleTimeoutStrategy;
    }

    public SessionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionConfig(SessionConfig source) {
        if (source.SessionSource != null) {
            this.SessionSource = new String(source.SessionSource);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.MaximumConcurrencySessionPerInstance != null) {
            this.MaximumConcurrencySessionPerInstance = new Long(source.MaximumConcurrencySessionPerInstance);
        }
        if (source.MaximumTTLInSeconds != null) {
            this.MaximumTTLInSeconds = new Long(source.MaximumTTLInSeconds);
        }
        if (source.MaximumIdleTimeInSeconds != null) {
            this.MaximumIdleTimeInSeconds = new Long(source.MaximumIdleTimeInSeconds);
        }
        if (source.SessionPath != null) {
            this.SessionPath = new String(source.SessionPath);
        }
        if (source.IdleTimeoutStrategy != null) {
            this.IdleTimeoutStrategy = new String(source.IdleTimeoutStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionSource", this.SessionSource);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "MaximumConcurrencySessionPerInstance", this.MaximumConcurrencySessionPerInstance);
        this.setParamSimple(map, prefix + "MaximumTTLInSeconds", this.MaximumTTLInSeconds);
        this.setParamSimple(map, prefix + "MaximumIdleTimeInSeconds", this.MaximumIdleTimeInSeconds);
        this.setParamSimple(map, prefix + "SessionPath", this.SessionPath);
        this.setParamSimple(map, prefix + "IdleTimeoutStrategy", this.IdleTimeoutStrategy);

    }
}

