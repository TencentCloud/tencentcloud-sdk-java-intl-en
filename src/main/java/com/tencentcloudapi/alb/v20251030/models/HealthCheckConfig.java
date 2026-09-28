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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckConfig extends AbstractModel {

    /**
    * Whether to enable the health check.
- **true**: enable.
- **false**: not enabled.
    */
    @SerializedName("HealthCheckEnabled")
    @Expose
    private Boolean HealthCheckEnabled;

    /**
    * Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **gRPC**: default value: 12, value range: 0-99. The input value can be a numerical value, multiple values, a range, or a composite of these, for example:
	- **"20"**
	- **"0-99"**
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
    */
    @SerializedName("HealthCheckCodes")
    @Expose
    private String [] HealthCheckCodes;

    /**
    * Threshold for determining backend service health. After the number of consecutive successful health checks reaches this value, the backend service status changes from **unhealthy** to **healthy**.
Value range: **2**-**10**.
Default value: **2**.
    */
    @SerializedName("HealthCheckHealthyThreshold")
    @Expose
    private Long HealthCheckHealthyThreshold;

    /**
    * Health check domain. If this parameter is not set, the intranet IP of the backend service is used as the health check address by default.
Domain restriction:
-Length limit: **1-255** characters.
- It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).
-At least one half-width period (.) is required, and it cannot appear at the beginning or end.
-The rightmost domain tag can only contain letters. It cannot contain digits or en dashes (-).
-En dash (-) cannot appear at the beginning or end.
>This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
    */
    @SerializedName("HealthCheckHost")
    @Expose
    private String HealthCheckHost;

    /**
    * HTTP version for health check.
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
    */
    @SerializedName("HealthCheckHttpVersion")
    @Expose
    private String HealthCheckHttpVersion;

    /**
    * Health check interval. Unit: second.
Valid values: **2**-**300**.
Default value: **5**.
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * Health check method. Valid values:
- **GET**
- **HEAD** (default value)
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
    */
    @SerializedName("HealthCheckMethod")
    @Expose
    private String HealthCheckMethod;

    /**
    * Forwarding rule path for health check.
Length: 1–80 characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!()*[]@$^:',+` can be used. The URL must start with a forward slash (/).
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
    */
    @SerializedName("HealthCheckPath")
    @Expose
    private String HealthCheckPath;

    /**
    * Health check accesses the backend server port.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port.
    */
    @SerializedName("HealthCheckPort")
    @Expose
    private Long HealthCheckPort;

    /**
    * Health check protocol. Valid values:
- **HTTP** (default): Simulate browser access requests by sending HEAD or GET requests to check whether the server application is healthy.
- **HTTPS**: Checks the health of a server application by sending HEAD or GET requests to simulate browser access requests. (Encrypts data and is more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST request.
- **GRPCS**: Send a POST request to check whether the server application is healthy.
    */
    @SerializedName("HealthCheckProtocol")
    @Expose
    private String HealthCheckProtocol;

    /**
    * timeout period for health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**.
    */
    @SerializedName("HealthCheckTimeout")
    @Expose
    private Long HealthCheckTimeout;

    /**
    * Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of consecutive times.
Value range: **2**-**10**.
Default value: **2**.
    */
    @SerializedName("HealthCheckUnhealthyThreshold")
    @Expose
    private Long HealthCheckUnhealthyThreshold;

    /**
     * Get Whether to enable the health check.
- **true**: enable.
- **false**: not enabled. 
     * @return HealthCheckEnabled Whether to enable the health check.
- **true**: enable.
- **false**: not enabled.
     */
    public Boolean getHealthCheckEnabled() {
        return this.HealthCheckEnabled;
    }

    /**
     * Set Whether to enable the health check.
- **true**: enable.
- **false**: not enabled.
     * @param HealthCheckEnabled Whether to enable the health check.
- **true**: enable.
- **false**: not enabled.
     */
    public void setHealthCheckEnabled(Boolean HealthCheckEnabled) {
        this.HealthCheckEnabled = HealthCheckEnabled;
    }

    /**
     * Get Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **gRPC**: default value: 12, value range: 0-99. The input value can be a numerical value, multiple values, a range, or a composite of these, for example:
	- **"20"**
	- **"0-99"**
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**. 
     * @return HealthCheckCodes Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **gRPC**: default value: 12, value range: 0-99. The input value can be a numerical value, multiple values, a range, or a composite of these, for example:
	- **"20"**
	- **"0-99"**
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     */
    public String [] getHealthCheckCodes() {
        return this.HealthCheckCodes;
    }

    /**
     * Set Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **gRPC**: default value: 12, value range: 0-99. The input value can be a numerical value, multiple values, a range, or a composite of these, for example:
	- **"20"**
	- **"0-99"**
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     * @param HealthCheckCodes Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **gRPC**: default value: 12, value range: 0-99. The input value can be a numerical value, multiple values, a range, or a composite of these, for example:
	- **"20"**
	- **"0-99"**
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     */
    public void setHealthCheckCodes(String [] HealthCheckCodes) {
        this.HealthCheckCodes = HealthCheckCodes;
    }

    /**
     * Get Threshold for determining backend service health. After the number of consecutive successful health checks reaches this value, the backend service status changes from **unhealthy** to **healthy**.
Value range: **2**-**10**.
Default value: **2**. 
     * @return HealthCheckHealthyThreshold Threshold for determining backend service health. After the number of consecutive successful health checks reaches this value, the backend service status changes from **unhealthy** to **healthy**.
Value range: **2**-**10**.
Default value: **2**.
     */
    public Long getHealthCheckHealthyThreshold() {
        return this.HealthCheckHealthyThreshold;
    }

    /**
     * Set Threshold for determining backend service health. After the number of consecutive successful health checks reaches this value, the backend service status changes from **unhealthy** to **healthy**.
Value range: **2**-**10**.
Default value: **2**.
     * @param HealthCheckHealthyThreshold Threshold for determining backend service health. After the number of consecutive successful health checks reaches this value, the backend service status changes from **unhealthy** to **healthy**.
Value range: **2**-**10**.
Default value: **2**.
     */
    public void setHealthCheckHealthyThreshold(Long HealthCheckHealthyThreshold) {
        this.HealthCheckHealthyThreshold = HealthCheckHealthyThreshold;
    }

    /**
     * Get Health check domain. If this parameter is not set, the intranet IP of the backend service is used as the health check address by default.
Domain restriction:
-Length limit: **1-255** characters.
- It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).
-At least one half-width period (.) is required, and it cannot appear at the beginning or end.
-The rightmost domain tag can only contain letters. It cannot contain digits or en dashes (-).
-En dash (-) cannot appear at the beginning or end.
>This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**. 
     * @return HealthCheckHost Health check domain. If this parameter is not set, the intranet IP of the backend service is used as the health check address by default.
Domain restriction:
-Length limit: **1-255** characters.
- It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).
-At least one half-width period (.) is required, and it cannot appear at the beginning or end.
-The rightmost domain tag can only contain letters. It cannot contain digits or en dashes (-).
-En dash (-) cannot appear at the beginning or end.
>This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     */
    public String getHealthCheckHost() {
        return this.HealthCheckHost;
    }

    /**
     * Set Health check domain. If this parameter is not set, the intranet IP of the backend service is used as the health check address by default.
Domain restriction:
-Length limit: **1-255** characters.
- It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).
-At least one half-width period (.) is required, and it cannot appear at the beginning or end.
-The rightmost domain tag can only contain letters. It cannot contain digits or en dashes (-).
-En dash (-) cannot appear at the beginning or end.
>This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     * @param HealthCheckHost Health check domain. If this parameter is not set, the intranet IP of the backend service is used as the health check address by default.
Domain restriction:
-Length limit: **1-255** characters.
- It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).
-At least one half-width period (.) is required, and it cannot appear at the beginning or end.
-The rightmost domain tag can only contain letters. It cannot contain digits or en dashes (-).
-En dash (-) cannot appear at the beginning or end.
>This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     */
    public void setHealthCheckHost(String HealthCheckHost) {
        this.HealthCheckHost = HealthCheckHost;
    }

    /**
     * Get HTTP version for health check.
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. 
     * @return HealthCheckHttpVersion HTTP version for health check.
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     */
    public String getHealthCheckHttpVersion() {
        return this.HealthCheckHttpVersion;
    }

    /**
     * Set HTTP version for health check.
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     * @param HealthCheckHttpVersion HTTP version for health check.
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     */
    public void setHealthCheckHttpVersion(String HealthCheckHttpVersion) {
        this.HealthCheckHttpVersion = HealthCheckHttpVersion;
    }

    /**
     * Get Health check interval. Unit: second.
Valid values: **2**-**300**.
Default value: **5**. 
     * @return HealthCheckInterval Health check interval. Unit: second.
Valid values: **2**-**300**.
Default value: **5**.
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set Health check interval. Unit: second.
Valid values: **2**-**300**.
Default value: **5**.
     * @param HealthCheckInterval Health check interval. Unit: second.
Valid values: **2**-**300**.
Default value: **5**.
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get Health check method. Valid values:
- **GET**
- **HEAD** (default value)
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. 
     * @return HealthCheckMethod Health check method. Valid values:
- **GET**
- **HEAD** (default value)
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     */
    public String getHealthCheckMethod() {
        return this.HealthCheckMethod;
    }

    /**
     * Set Health check method. Valid values:
- **GET**
- **HEAD** (default value)
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     * @param HealthCheckMethod Health check method. Valid values:
- **GET**
- **HEAD** (default value)
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     */
    public void setHealthCheckMethod(String HealthCheckMethod) {
        this.HealthCheckMethod = HealthCheckMethod;
    }

    /**
     * Get Forwarding rule path for health check.
Length: 1–80 characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!()*[]@$^:',+` can be used. The URL must start with a forward slash (/).
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**. 
     * @return HealthCheckPath Forwarding rule path for health check.
Length: 1–80 characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!()*[]@$^:',+` can be used. The URL must start with a forward slash (/).
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     */
    public String getHealthCheckPath() {
        return this.HealthCheckPath;
    }

    /**
     * Set Forwarding rule path for health check.
Length: 1–80 characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!()*[]@$^:',+` can be used. The URL must start with a forward slash (/).
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     * @param HealthCheckPath Forwarding rule path for health check.
Length: 1–80 characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!()*[]@$^:',+` can be used. The URL must start with a forward slash (/).
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP**, **HTTPS**, **GRPC**, or **GRPCS**.
     */
    public void setHealthCheckPath(String HealthCheckPath) {
        this.HealthCheckPath = HealthCheckPath;
    }

    /**
     * Get Health check accesses the backend server port.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port. 
     * @return HealthCheckPort Health check accesses the backend server port.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port.
     */
    public Long getHealthCheckPort() {
        return this.HealthCheckPort;
    }

    /**
     * Set Health check accesses the backend server port.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port.
     * @param HealthCheckPort Health check accesses the backend server port.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port.
     */
    public void setHealthCheckPort(Long HealthCheckPort) {
        this.HealthCheckPort = HealthCheckPort;
    }

    /**
     * Get Health check protocol. Valid values:
- **HTTP** (default): Simulate browser access requests by sending HEAD or GET requests to check whether the server application is healthy.
- **HTTPS**: Checks the health of a server application by sending HEAD or GET requests to simulate browser access requests. (Encrypts data and is more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST request.
- **GRPCS**: Send a POST request to check whether the server application is healthy. 
     * @return HealthCheckProtocol Health check protocol. Valid values:
- **HTTP** (default): Simulate browser access requests by sending HEAD or GET requests to check whether the server application is healthy.
- **HTTPS**: Checks the health of a server application by sending HEAD or GET requests to simulate browser access requests. (Encrypts data and is more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST request.
- **GRPCS**: Send a POST request to check whether the server application is healthy.
     */
    public String getHealthCheckProtocol() {
        return this.HealthCheckProtocol;
    }

    /**
     * Set Health check protocol. Valid values:
- **HTTP** (default): Simulate browser access requests by sending HEAD or GET requests to check whether the server application is healthy.
- **HTTPS**: Checks the health of a server application by sending HEAD or GET requests to simulate browser access requests. (Encrypts data and is more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST request.
- **GRPCS**: Send a POST request to check whether the server application is healthy.
     * @param HealthCheckProtocol Health check protocol. Valid values:
- **HTTP** (default): Simulate browser access requests by sending HEAD or GET requests to check whether the server application is healthy.
- **HTTPS**: Checks the health of a server application by sending HEAD or GET requests to simulate browser access requests. (Encrypts data and is more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST request.
- **GRPCS**: Send a POST request to check whether the server application is healthy.
     */
    public void setHealthCheckProtocol(String HealthCheckProtocol) {
        this.HealthCheckProtocol = HealthCheckProtocol;
    }

    /**
     * Get timeout period for health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**. 
     * @return HealthCheckTimeout timeout period for health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**.
     */
    public Long getHealthCheckTimeout() {
        return this.HealthCheckTimeout;
    }

    /**
     * Set timeout period for health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**.
     * @param HealthCheckTimeout timeout period for health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**.
     */
    public void setHealthCheckTimeout(Long HealthCheckTimeout) {
        this.HealthCheckTimeout = HealthCheckTimeout;
    }

    /**
     * Get Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of consecutive times.
Value range: **2**-**10**.
Default value: **2**. 
     * @return HealthCheckUnhealthyThreshold Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of consecutive times.
Value range: **2**-**10**.
Default value: **2**.
     */
    public Long getHealthCheckUnhealthyThreshold() {
        return this.HealthCheckUnhealthyThreshold;
    }

    /**
     * Set Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of consecutive times.
Value range: **2**-**10**.
Default value: **2**.
     * @param HealthCheckUnhealthyThreshold Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of consecutive times.
Value range: **2**-**10**.
Default value: **2**.
     */
    public void setHealthCheckUnhealthyThreshold(Long HealthCheckUnhealthyThreshold) {
        this.HealthCheckUnhealthyThreshold = HealthCheckUnhealthyThreshold;
    }

    public HealthCheckConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckConfig(HealthCheckConfig source) {
        if (source.HealthCheckEnabled != null) {
            this.HealthCheckEnabled = new Boolean(source.HealthCheckEnabled);
        }
        if (source.HealthCheckCodes != null) {
            this.HealthCheckCodes = new String[source.HealthCheckCodes.length];
            for (int i = 0; i < source.HealthCheckCodes.length; i++) {
                this.HealthCheckCodes[i] = new String(source.HealthCheckCodes[i]);
            }
        }
        if (source.HealthCheckHealthyThreshold != null) {
            this.HealthCheckHealthyThreshold = new Long(source.HealthCheckHealthyThreshold);
        }
        if (source.HealthCheckHost != null) {
            this.HealthCheckHost = new String(source.HealthCheckHost);
        }
        if (source.HealthCheckHttpVersion != null) {
            this.HealthCheckHttpVersion = new String(source.HealthCheckHttpVersion);
        }
        if (source.HealthCheckInterval != null) {
            this.HealthCheckInterval = new Long(source.HealthCheckInterval);
        }
        if (source.HealthCheckMethod != null) {
            this.HealthCheckMethod = new String(source.HealthCheckMethod);
        }
        if (source.HealthCheckPath != null) {
            this.HealthCheckPath = new String(source.HealthCheckPath);
        }
        if (source.HealthCheckPort != null) {
            this.HealthCheckPort = new Long(source.HealthCheckPort);
        }
        if (source.HealthCheckProtocol != null) {
            this.HealthCheckProtocol = new String(source.HealthCheckProtocol);
        }
        if (source.HealthCheckTimeout != null) {
            this.HealthCheckTimeout = new Long(source.HealthCheckTimeout);
        }
        if (source.HealthCheckUnhealthyThreshold != null) {
            this.HealthCheckUnhealthyThreshold = new Long(source.HealthCheckUnhealthyThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckEnabled", this.HealthCheckEnabled);
        this.setParamArraySimple(map, prefix + "HealthCheckCodes.", this.HealthCheckCodes);
        this.setParamSimple(map, prefix + "HealthCheckHealthyThreshold", this.HealthCheckHealthyThreshold);
        this.setParamSimple(map, prefix + "HealthCheckHost", this.HealthCheckHost);
        this.setParamSimple(map, prefix + "HealthCheckHttpVersion", this.HealthCheckHttpVersion);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "HealthCheckMethod", this.HealthCheckMethod);
        this.setParamSimple(map, prefix + "HealthCheckPath", this.HealthCheckPath);
        this.setParamSimple(map, prefix + "HealthCheckPort", this.HealthCheckPort);
        this.setParamSimple(map, prefix + "HealthCheckProtocol", this.HealthCheckProtocol);
        this.setParamSimple(map, prefix + "HealthCheckTimeout", this.HealthCheckTimeout);
        this.setParamSimple(map, prefix + "HealthCheckUnhealthyThreshold", this.HealthCheckUnhealthyThreshold);

    }
}

