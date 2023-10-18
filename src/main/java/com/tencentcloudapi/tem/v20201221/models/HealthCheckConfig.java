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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckConfig extends AbstractModel {

    /**
    * Health check type. Valid values: `HttpGet`，`TcpSocket`，`Exec`
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The protocol type. It’s only valid when the health check type is `HttpGet`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The request path. It’s only valid when the health check type is `HttpGet`.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * The script to be executed. It’s only valid when the health check type is `Exec`.
    */
    @SerializedName("Exec")
    @Expose
    private String Exec;

    /**
    * The request port. It’s only valid when the health check type is `HttpGet` or `TcpSocket `.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * The initial delay for health check in seconds. Default: `0`
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * Timeout period in seconds. Default: `1`
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * Interval period in seconds. Default: `10`
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
     * Get Health check type. Valid values: `HttpGet`，`TcpSocket`，`Exec` 
     * @return Type Health check type. Valid values: `HttpGet`，`TcpSocket`，`Exec`
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Health check type. Valid values: `HttpGet`，`TcpSocket`，`Exec`
     * @param Type Health check type. Valid values: `HttpGet`，`TcpSocket`，`Exec`
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The protocol type. It’s only valid when the health check type is `HttpGet`. 
     * @return Protocol The protocol type. It’s only valid when the health check type is `HttpGet`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol type. It’s only valid when the health check type is `HttpGet`.
     * @param Protocol The protocol type. It’s only valid when the health check type is `HttpGet`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The request path. It’s only valid when the health check type is `HttpGet`. 
     * @return Path The request path. It’s only valid when the health check type is `HttpGet`.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set The request path. It’s only valid when the health check type is `HttpGet`.
     * @param Path The request path. It’s only valid when the health check type is `HttpGet`.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get The script to be executed. It’s only valid when the health check type is `Exec`. 
     * @return Exec The script to be executed. It’s only valid when the health check type is `Exec`.
     */
    public String getExec() {
        return this.Exec;
    }

    /**
     * Set The script to be executed. It’s only valid when the health check type is `Exec`.
     * @param Exec The script to be executed. It’s only valid when the health check type is `Exec`.
     */
    public void setExec(String Exec) {
        this.Exec = Exec;
    }

    /**
     * Get The request port. It’s only valid when the health check type is `HttpGet` or `TcpSocket `. 
     * @return Port The request port. It’s only valid when the health check type is `HttpGet` or `TcpSocket `.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set The request port. It’s only valid when the health check type is `HttpGet` or `TcpSocket `.
     * @param Port The request port. It’s only valid when the health check type is `HttpGet` or `TcpSocket `.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get The initial delay for health check in seconds. Default: `0` 
     * @return InitialDelaySeconds The initial delay for health check in seconds. Default: `0`
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set The initial delay for health check in seconds. Default: `0`
     * @param InitialDelaySeconds The initial delay for health check in seconds. Default: `0`
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get Timeout period in seconds. Default: `1` 
     * @return TimeoutSeconds Timeout period in seconds. Default: `1`
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set Timeout period in seconds. Default: `1`
     * @param TimeoutSeconds Timeout period in seconds. Default: `1`
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get Interval period in seconds. Default: `10` 
     * @return PeriodSeconds Interval period in seconds. Default: `10`
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set Interval period in seconds. Default: `10`
     * @param PeriodSeconds Interval period in seconds. Default: `10`
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    public HealthCheckConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckConfig(HealthCheckConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Exec != null) {
            this.Exec = new String(source.Exec);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Long(source.TimeoutSeconds);
        }
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Exec", this.Exec);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);

    }
}

