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

public class HealthCheckTemplate extends AbstractModel {

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **GRPC/GRPCS**: default value is **12**, value range is **0-99**, input value can be numerical, multiple values or ranges, as well as combinations, for example:
	- **"20"**
	- **"0-99"**
    */
    @SerializedName("HealthCheckCodes")
    @Expose
    private String [] HealthCheckCodes;

    /**
    * Threshold for determining backend service health. The backend service status changes from **unhealthy** to **healthy** after this number of consecutive successful health checks.
Value range: **2**-**10**.
Default value: **2**.
    */
    @SerializedName("HealthCheckHealthyThreshold")
    @Expose
    private Long HealthCheckHealthyThreshold;

    /**
    * Health check domain name.
Length limit: **1-255** characters.
It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).

> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**.
    */
    @SerializedName("HealthCheckHost")
    @Expose
    private String HealthCheckHost;

    /**
    * HTTP version for health check. Parameter Value:
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
    */
    @SerializedName("HealthCheckHttpVersion")
    @Expose
    private String HealthCheckHttpVersion;

    /**
    * The interval of health check. Unit: second.
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
    * Health check forwarding rule path. Length: **1-80** characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!（)*[]@$^:',+` can be used. The URL must start with a forward slash (/). 
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**.
    */
    @SerializedName("HealthCheckPath")
    @Expose
    private String HealthCheckPath;

    /**
    * Port for health check to access the backend server.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port.
    */
    @SerializedName("HealthCheckPort")
    @Expose
    private Long HealthCheckPort;

    /**
    * Health check protocol. Valid values:
- **HTTP** (default): Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests.
- **HTTPS**: Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests. (Encrypt data, more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST or GET request.
- **GRPCS**: Check whether the server application is healthy by sending a POST or GET request.
    */
    @SerializedName("HealthCheckProtocol")
    @Expose
    private String HealthCheckProtocol;

    /**
    * Health check template ID, in the format of hct- followed by alphanumeric characters. All APIs (creation, querying, modification, deletion) use the hct- prefix.
    */
    @SerializedName("HealthCheckTemplateId")
    @Expose
    private String HealthCheckTemplateId;

    /**
    * Health check template name. It must contain **1-255** characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).
    */
    @SerializedName("HealthCheckTemplateName")
    @Expose
    private String HealthCheckTemplateName;

    /**
    * timeout period for the health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**.
    */
    @SerializedName("HealthCheckTimeout")
    @Expose
    private Long HealthCheckTimeout;

    /**
    * Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of times consecutively.
Value range: **2**-**10**.
Default value: **2**.
    */
    @SerializedName("HealthCheckUnhealthyThreshold")
    @Expose
    private Long HealthCheckUnhealthyThreshold;

    /**
    * Modify the time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **GRPC/GRPCS**: default value is **12**, value range is **0-99**, input value can be numerical, multiple values or ranges, as well as combinations, for example:
	- **"20"**
	- **"0-99"** 
     * @return HealthCheckCodes Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **GRPC/GRPCS**: default value is **12**, value range is **0-99**, input value can be numerical, multiple values or ranges, as well as combinations, for example:
	- **"20"**
	- **"0-99"**
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
- When the health check protocol is **GRPC/GRPCS**: default value is **12**, value range is **0-99**, input value can be numerical, multiple values or ranges, as well as combinations, for example:
	- **"20"**
	- **"0-99"**
     * @param HealthCheckCodes Health check status code. Value:
- When the health check protocol is **HTTP/HTTPS**:
	- **http_1xx**
	- **http_2xx** (default value)
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- When the health check protocol is **GRPC/GRPCS**: default value is **12**, value range is **0-99**, input value can be numerical, multiple values or ranges, as well as combinations, for example:
	- **"20"**
	- **"0-99"**
     */
    public void setHealthCheckCodes(String [] HealthCheckCodes) {
        this.HealthCheckCodes = HealthCheckCodes;
    }

    /**
     * Get Threshold for determining backend service health. The backend service status changes from **unhealthy** to **healthy** after this number of consecutive successful health checks.
Value range: **2**-**10**.
Default value: **2**. 
     * @return HealthCheckHealthyThreshold Threshold for determining backend service health. The backend service status changes from **unhealthy** to **healthy** after this number of consecutive successful health checks.
Value range: **2**-**10**.
Default value: **2**.
     */
    public Long getHealthCheckHealthyThreshold() {
        return this.HealthCheckHealthyThreshold;
    }

    /**
     * Set Threshold for determining backend service health. The backend service status changes from **unhealthy** to **healthy** after this number of consecutive successful health checks.
Value range: **2**-**10**.
Default value: **2**.
     * @param HealthCheckHealthyThreshold Threshold for determining backend service health. The backend service status changes from **unhealthy** to **healthy** after this number of consecutive successful health checks.
Value range: **2**-**10**.
Default value: **2**.
     */
    public void setHealthCheckHealthyThreshold(Long HealthCheckHealthyThreshold) {
        this.HealthCheckHealthyThreshold = HealthCheckHealthyThreshold;
    }

    /**
     * Get Health check domain name.
Length limit: **1-255** characters.
It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).

> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**. 
     * @return HealthCheckHost Health check domain name.
Length limit: **1-255** characters.
It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).

> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**.
     */
    public String getHealthCheckHost() {
        return this.HealthCheckHost;
    }

    /**
     * Set Health check domain name.
Length limit: **1-255** characters.
It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).

> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**.
     * @param HealthCheckHost Health check domain name.
Length limit: **1-255** characters.
It can contain lowercase letters, digits, hyphens (-), and half-width periods (.).

> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**.
     */
    public void setHealthCheckHost(String HealthCheckHost) {
        this.HealthCheckHost = HealthCheckHost;
    }

    /**
     * Get HTTP version for health check. Parameter Value:
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**. 
     * @return HealthCheckHttpVersion HTTP version for health check. Parameter Value:
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     */
    public String getHealthCheckHttpVersion() {
        return this.HealthCheckHttpVersion;
    }

    /**
     * Set HTTP version for health check. Parameter Value:
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     * @param HealthCheckHttpVersion HTTP version for health check. Parameter Value:
- **HTTP1.1** (default)
- **HTTP1.0** 
> This parameter takes effect only when **HealthCheckProtocol** is set to **HTTP** or **HTTPS**.
     */
    public void setHealthCheckHttpVersion(String HealthCheckHttpVersion) {
        this.HealthCheckHttpVersion = HealthCheckHttpVersion;
    }

    /**
     * Get The interval of health check. Unit: second.
Valid values: **2**-**300**.
Default value: **5**. 
     * @return HealthCheckInterval The interval of health check. Unit: second.
Valid values: **2**-**300**.
Default value: **5**.
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set The interval of health check. Unit: second.
Valid values: **2**-**300**.
Default value: **5**.
     * @param HealthCheckInterval The interval of health check. Unit: second.
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
     * Get Health check forwarding rule path. Length: **1-80** characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!（)*[]@$^:',+` can be used. The URL must start with a forward slash (/). 
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**. 
     * @return HealthCheckPath Health check forwarding rule path. Length: **1-80** characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!（)*[]@$^:',+` can be used. The URL must start with a forward slash (/). 
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**.
     */
    public String getHealthCheckPath() {
        return this.HealthCheckPath;
    }

    /**
     * Set Health check forwarding rule path. Length: **1-80** characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!（)*[]@$^:',+` can be used. The URL must start with a forward slash (/). 
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**.
     * @param HealthCheckPath Health check forwarding rule path. Length: **1-80** characters. Only letters, digits, characters `-/.%?#&=` and extended characters `_;~!（)*[]@$^:',+` can be used. The URL must start with a forward slash (/). 
> The forwarding rule path parameter takes effect only when **HealthCheckProtocol** is set to **HTTP/HTTPS/GRPC/GRPCS**.
     */
    public void setHealthCheckPath(String HealthCheckPath) {
        this.HealthCheckPath = HealthCheckPath;
    }

    /**
     * Get Port for health check to access the backend server.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port. 
     * @return HealthCheckPort Port for health check to access the backend server.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port.
     */
    public Long getHealthCheckPort() {
        return this.HealthCheckPort;
    }

    /**
     * Set Port for health check to access the backend server.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port.
     * @param HealthCheckPort Port for health check to access the backend server.

Valid values: **0-65535**.

Default value: **0**, which indicates the backend server port.
     */
    public void setHealthCheckPort(Long HealthCheckPort) {
        this.HealthCheckPort = HealthCheckPort;
    }

    /**
     * Get Health check protocol. Valid values:
- **HTTP** (default): Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests.
- **HTTPS**: Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests. (Encrypt data, more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST or GET request.
- **GRPCS**: Check whether the server application is healthy by sending a POST or GET request. 
     * @return HealthCheckProtocol Health check protocol. Valid values:
- **HTTP** (default): Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests.
- **HTTPS**: Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests. (Encrypt data, more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST or GET request.
- **GRPCS**: Check whether the server application is healthy by sending a POST or GET request.
     */
    public String getHealthCheckProtocol() {
        return this.HealthCheckProtocol;
    }

    /**
     * Set Health check protocol. Valid values:
- **HTTP** (default): Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests.
- **HTTPS**: Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests. (Encrypt data, more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST or GET request.
- **GRPCS**: Check whether the server application is healthy by sending a POST or GET request.
     * @param HealthCheckProtocol Health check protocol. Valid values:
- **HTTP** (default): Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests.
- **HTTPS**: Check whether the server application is healthy by sending HEAD or GET requests to simulate browser access requests. (Encrypt data, more secure compared with HTTP.)
- **TCP**: Detect whether the server port is alive by sending SYN handshake messages.
- **GRPC**: Check whether the server application is healthy by sending a POST or GET request.
- **GRPCS**: Check whether the server application is healthy by sending a POST or GET request.
     */
    public void setHealthCheckProtocol(String HealthCheckProtocol) {
        this.HealthCheckProtocol = HealthCheckProtocol;
    }

    /**
     * Get Health check template ID, in the format of hct- followed by alphanumeric characters. All APIs (creation, querying, modification, deletion) use the hct- prefix. 
     * @return HealthCheckTemplateId Health check template ID, in the format of hct- followed by alphanumeric characters. All APIs (creation, querying, modification, deletion) use the hct- prefix.
     */
    public String getHealthCheckTemplateId() {
        return this.HealthCheckTemplateId;
    }

    /**
     * Set Health check template ID, in the format of hct- followed by alphanumeric characters. All APIs (creation, querying, modification, deletion) use the hct- prefix.
     * @param HealthCheckTemplateId Health check template ID, in the format of hct- followed by alphanumeric characters. All APIs (creation, querying, modification, deletion) use the hct- prefix.
     */
    public void setHealthCheckTemplateId(String HealthCheckTemplateId) {
        this.HealthCheckTemplateId = HealthCheckTemplateId;
    }

    /**
     * Get Health check template name. It must contain **1-255** characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-). 
     * @return HealthCheckTemplateName Health check template name. It must contain **1-255** characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).
     */
    public String getHealthCheckTemplateName() {
        return this.HealthCheckTemplateName;
    }

    /**
     * Set Health check template name. It must contain **1-255** characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).
     * @param HealthCheckTemplateName Health check template name. It must contain **1-255** characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).
     */
    public void setHealthCheckTemplateName(String HealthCheckTemplateName) {
        this.HealthCheckTemplateName = HealthCheckTemplateName;
    }

    /**
     * Get timeout period for the health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**. 
     * @return HealthCheckTimeout timeout period for the health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**.
     */
    public Long getHealthCheckTimeout() {
        return this.HealthCheckTimeout;
    }

    /**
     * Set timeout period for the health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**.
     * @param HealthCheckTimeout timeout period for the health check. Unit: seconds.
Valid values: **2**-**60**.
Default value: **2**.
     */
    public void setHealthCheckTimeout(Long HealthCheckTimeout) {
        this.HealthCheckTimeout = HealthCheckTimeout;
    }

    /**
     * Get Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of times consecutively.
Value range: **2**-**10**.
Default value: **2**. 
     * @return HealthCheckUnhealthyThreshold Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of times consecutively.
Value range: **2**-**10**.
Default value: **2**.
     */
    public Long getHealthCheckUnhealthyThreshold() {
        return this.HealthCheckUnhealthyThreshold;
    }

    /**
     * Set Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of times consecutively.
Value range: **2**-**10**.
Default value: **2**.
     * @param HealthCheckUnhealthyThreshold Threshold for determining an unhealthy backend service. The backend service status changes from **healthy** to **unhealthy** after the health check fails this number of times consecutively.
Value range: **2**-**10**.
Default value: **2**.
     */
    public void setHealthCheckUnhealthyThreshold(Long HealthCheckUnhealthyThreshold) {
        this.HealthCheckUnhealthyThreshold = HealthCheckUnhealthyThreshold;
    }

    /**
     * Get Modify the time. 
     * @return ModifyTime Modify the time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modify the time.
     * @param ModifyTime Modify the time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public HealthCheckTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckTemplate(HealthCheckTemplate source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.HealthCheckTemplateId != null) {
            this.HealthCheckTemplateId = new String(source.HealthCheckTemplateId);
        }
        if (source.HealthCheckTemplateName != null) {
            this.HealthCheckTemplateName = new String(source.HealthCheckTemplateName);
        }
        if (source.HealthCheckTimeout != null) {
            this.HealthCheckTimeout = new Long(source.HealthCheckTimeout);
        }
        if (source.HealthCheckUnhealthyThreshold != null) {
            this.HealthCheckUnhealthyThreshold = new Long(source.HealthCheckUnhealthyThreshold);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "HealthCheckCodes.", this.HealthCheckCodes);
        this.setParamSimple(map, prefix + "HealthCheckHealthyThreshold", this.HealthCheckHealthyThreshold);
        this.setParamSimple(map, prefix + "HealthCheckHost", this.HealthCheckHost);
        this.setParamSimple(map, prefix + "HealthCheckHttpVersion", this.HealthCheckHttpVersion);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "HealthCheckMethod", this.HealthCheckMethod);
        this.setParamSimple(map, prefix + "HealthCheckPath", this.HealthCheckPath);
        this.setParamSimple(map, prefix + "HealthCheckPort", this.HealthCheckPort);
        this.setParamSimple(map, prefix + "HealthCheckProtocol", this.HealthCheckProtocol);
        this.setParamSimple(map, prefix + "HealthCheckTemplateId", this.HealthCheckTemplateId);
        this.setParamSimple(map, prefix + "HealthCheckTemplateName", this.HealthCheckTemplateName);
        this.setParamSimple(map, prefix + "HealthCheckTimeout", this.HealthCheckTimeout);
        this.setParamSimple(map, prefix + "HealthCheckUnhealthyThreshold", this.HealthCheckUnhealthyThreshold);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

