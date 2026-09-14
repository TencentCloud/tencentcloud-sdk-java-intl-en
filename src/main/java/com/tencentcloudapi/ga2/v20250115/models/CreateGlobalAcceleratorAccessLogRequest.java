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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGlobalAcceleratorAccessLogRequest extends AbstractModel {

    /**
    * <p>Unique Id of the sample GA</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Listener Id</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>Terminal node group Id</p>
    */
    @SerializedName("EndpointGroupId")
    @Expose
    private String EndpointGroupId;

    /**
    * <p>Logset region</p>
    */
    @SerializedName("CloudRegion")
    @Expose
    private String CloudRegion;

    /**
    * <p>Log topic Id</p>
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * <p>Log Set Id</p>
    */
    @SerializedName("CloudLogSetId")
    @Expose
    private String CloudLogSetId;

    /**
    * <p>Specify data collection fields</p><p>Enumeration values:</p><ul><li>session_time: Layer 4, session duration</li><li>upstream_bytes_received: Layer 4 and Layer 7, number of bytes received from the terminal node</li><li>upstream_bytes_sent: Layer 4 and Layer 7, number of bytes sent to the terminal node</li><li>request_method: Layer 7, GET/POST</li><li>scheme: Layer 7, http/https</li><li>request_uri: Layer 7, uri of the client's raw request</li><li>uri: Layer 7, uri of the current request</li><li>host: Layer 7, domain name accessed by the client (Layer 7)</li><li>remote_user: Layer 7, userName for basic authentication ("-" when unauthenticated)</li><li>http_user_agent: Layer 7, client browser identification</li><li>http_referer: Layer 7, request source URL ("-" when accessed directly from the address bar)</li><li>http_x_forwarded_for: Layer 7, records the client's original IP and the proxy server IP chain it transited</li><li>content_type: Layer 7, content_type</li><li>body_bytes_sent: Layer 7, http body size sent to the client, excluding the header</li><li>request_time: Layer 7, total time from receiving the first byte of the client request to sending the last byte of the response (unit: seconds)</li><li>sent_http_content_type: Layer 7, response content type</li><li>upstream_header_time: Layer 7, arrival time of the terminal node's response header</li><li>upstream_response_length: Layer 7, length of the response body returned by the terminal node</li><li>upstream_response_time: Layer 7, complete response time of the terminal node</li><li>upstream_status: Layer 7, http status code returned by the terminal node</li></ul>
    */
    @SerializedName("FieldKeys")
    @Expose
    private String [] FieldKeys;

    /**
    * <p>Log description</p>
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
     * Get <p>Unique Id of the sample GA</p> 
     * @return GlobalAcceleratorId <p>Unique Id of the sample GA</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Unique Id of the sample GA</p>
     * @param GlobalAcceleratorId <p>Unique Id of the sample GA</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Listener Id</p> 
     * @return ListenerId <p>Listener Id</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>Listener Id</p>
     * @param ListenerId <p>Listener Id</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>Terminal node group Id</p> 
     * @return EndpointGroupId <p>Terminal node group Id</p>
     */
    public String getEndpointGroupId() {
        return this.EndpointGroupId;
    }

    /**
     * Set <p>Terminal node group Id</p>
     * @param EndpointGroupId <p>Terminal node group Id</p>
     */
    public void setEndpointGroupId(String EndpointGroupId) {
        this.EndpointGroupId = EndpointGroupId;
    }

    /**
     * Get <p>Logset region</p> 
     * @return CloudRegion <p>Logset region</p>
     */
    public String getCloudRegion() {
        return this.CloudRegion;
    }

    /**
     * Set <p>Logset region</p>
     * @param CloudRegion <p>Logset region</p>
     */
    public void setCloudRegion(String CloudRegion) {
        this.CloudRegion = CloudRegion;
    }

    /**
     * Get <p>Log topic Id</p> 
     * @return CloudLogId <p>Log topic Id</p>
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set <p>Log topic Id</p>
     * @param CloudLogId <p>Log topic Id</p>
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get <p>Log Set Id</p> 
     * @return CloudLogSetId <p>Log Set Id</p>
     */
    public String getCloudLogSetId() {
        return this.CloudLogSetId;
    }

    /**
     * Set <p>Log Set Id</p>
     * @param CloudLogSetId <p>Log Set Id</p>
     */
    public void setCloudLogSetId(String CloudLogSetId) {
        this.CloudLogSetId = CloudLogSetId;
    }

    /**
     * Get <p>Specify data collection fields</p><p>Enumeration values:</p><ul><li>session_time: Layer 4, session duration</li><li>upstream_bytes_received: Layer 4 and Layer 7, number of bytes received from the terminal node</li><li>upstream_bytes_sent: Layer 4 and Layer 7, number of bytes sent to the terminal node</li><li>request_method: Layer 7, GET/POST</li><li>scheme: Layer 7, http/https</li><li>request_uri: Layer 7, uri of the client's raw request</li><li>uri: Layer 7, uri of the current request</li><li>host: Layer 7, domain name accessed by the client (Layer 7)</li><li>remote_user: Layer 7, userName for basic authentication ("-" when unauthenticated)</li><li>http_user_agent: Layer 7, client browser identification</li><li>http_referer: Layer 7, request source URL ("-" when accessed directly from the address bar)</li><li>http_x_forwarded_for: Layer 7, records the client's original IP and the proxy server IP chain it transited</li><li>content_type: Layer 7, content_type</li><li>body_bytes_sent: Layer 7, http body size sent to the client, excluding the header</li><li>request_time: Layer 7, total time from receiving the first byte of the client request to sending the last byte of the response (unit: seconds)</li><li>sent_http_content_type: Layer 7, response content type</li><li>upstream_header_time: Layer 7, arrival time of the terminal node's response header</li><li>upstream_response_length: Layer 7, length of the response body returned by the terminal node</li><li>upstream_response_time: Layer 7, complete response time of the terminal node</li><li>upstream_status: Layer 7, http status code returned by the terminal node</li></ul> 
     * @return FieldKeys <p>Specify data collection fields</p><p>Enumeration values:</p><ul><li>session_time: Layer 4, session duration</li><li>upstream_bytes_received: Layer 4 and Layer 7, number of bytes received from the terminal node</li><li>upstream_bytes_sent: Layer 4 and Layer 7, number of bytes sent to the terminal node</li><li>request_method: Layer 7, GET/POST</li><li>scheme: Layer 7, http/https</li><li>request_uri: Layer 7, uri of the client's raw request</li><li>uri: Layer 7, uri of the current request</li><li>host: Layer 7, domain name accessed by the client (Layer 7)</li><li>remote_user: Layer 7, userName for basic authentication ("-" when unauthenticated)</li><li>http_user_agent: Layer 7, client browser identification</li><li>http_referer: Layer 7, request source URL ("-" when accessed directly from the address bar)</li><li>http_x_forwarded_for: Layer 7, records the client's original IP and the proxy server IP chain it transited</li><li>content_type: Layer 7, content_type</li><li>body_bytes_sent: Layer 7, http body size sent to the client, excluding the header</li><li>request_time: Layer 7, total time from receiving the first byte of the client request to sending the last byte of the response (unit: seconds)</li><li>sent_http_content_type: Layer 7, response content type</li><li>upstream_header_time: Layer 7, arrival time of the terminal node's response header</li><li>upstream_response_length: Layer 7, length of the response body returned by the terminal node</li><li>upstream_response_time: Layer 7, complete response time of the terminal node</li><li>upstream_status: Layer 7, http status code returned by the terminal node</li></ul>
     */
    public String [] getFieldKeys() {
        return this.FieldKeys;
    }

    /**
     * Set <p>Specify data collection fields</p><p>Enumeration values:</p><ul><li>session_time: Layer 4, session duration</li><li>upstream_bytes_received: Layer 4 and Layer 7, number of bytes received from the terminal node</li><li>upstream_bytes_sent: Layer 4 and Layer 7, number of bytes sent to the terminal node</li><li>request_method: Layer 7, GET/POST</li><li>scheme: Layer 7, http/https</li><li>request_uri: Layer 7, uri of the client's raw request</li><li>uri: Layer 7, uri of the current request</li><li>host: Layer 7, domain name accessed by the client (Layer 7)</li><li>remote_user: Layer 7, userName for basic authentication ("-" when unauthenticated)</li><li>http_user_agent: Layer 7, client browser identification</li><li>http_referer: Layer 7, request source URL ("-" when accessed directly from the address bar)</li><li>http_x_forwarded_for: Layer 7, records the client's original IP and the proxy server IP chain it transited</li><li>content_type: Layer 7, content_type</li><li>body_bytes_sent: Layer 7, http body size sent to the client, excluding the header</li><li>request_time: Layer 7, total time from receiving the first byte of the client request to sending the last byte of the response (unit: seconds)</li><li>sent_http_content_type: Layer 7, response content type</li><li>upstream_header_time: Layer 7, arrival time of the terminal node's response header</li><li>upstream_response_length: Layer 7, length of the response body returned by the terminal node</li><li>upstream_response_time: Layer 7, complete response time of the terminal node</li><li>upstream_status: Layer 7, http status code returned by the terminal node</li></ul>
     * @param FieldKeys <p>Specify data collection fields</p><p>Enumeration values:</p><ul><li>session_time: Layer 4, session duration</li><li>upstream_bytes_received: Layer 4 and Layer 7, number of bytes received from the terminal node</li><li>upstream_bytes_sent: Layer 4 and Layer 7, number of bytes sent to the terminal node</li><li>request_method: Layer 7, GET/POST</li><li>scheme: Layer 7, http/https</li><li>request_uri: Layer 7, uri of the client's raw request</li><li>uri: Layer 7, uri of the current request</li><li>host: Layer 7, domain name accessed by the client (Layer 7)</li><li>remote_user: Layer 7, userName for basic authentication ("-" when unauthenticated)</li><li>http_user_agent: Layer 7, client browser identification</li><li>http_referer: Layer 7, request source URL ("-" when accessed directly from the address bar)</li><li>http_x_forwarded_for: Layer 7, records the client's original IP and the proxy server IP chain it transited</li><li>content_type: Layer 7, content_type</li><li>body_bytes_sent: Layer 7, http body size sent to the client, excluding the header</li><li>request_time: Layer 7, total time from receiving the first byte of the client request to sending the last byte of the response (unit: seconds)</li><li>sent_http_content_type: Layer 7, response content type</li><li>upstream_header_time: Layer 7, arrival time of the terminal node's response header</li><li>upstream_response_length: Layer 7, length of the response body returned by the terminal node</li><li>upstream_response_time: Layer 7, complete response time of the terminal node</li><li>upstream_status: Layer 7, http status code returned by the terminal node</li></ul>
     */
    public void setFieldKeys(String [] FieldKeys) {
        this.FieldKeys = FieldKeys;
    }

    /**
     * Get <p>Log description</p> 
     * @return FlowLogDescription <p>Log description</p>
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set <p>Log description</p>
     * @param FlowLogDescription <p>Log description</p>
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    public CreateGlobalAcceleratorAccessLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlobalAcceleratorAccessLogRequest(CreateGlobalAcceleratorAccessLogRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.EndpointGroupId != null) {
            this.EndpointGroupId = new String(source.EndpointGroupId);
        }
        if (source.CloudRegion != null) {
            this.CloudRegion = new String(source.CloudRegion);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.CloudLogSetId != null) {
            this.CloudLogSetId = new String(source.CloudLogSetId);
        }
        if (source.FieldKeys != null) {
            this.FieldKeys = new String[source.FieldKeys.length];
            for (int i = 0; i < source.FieldKeys.length; i++) {
                this.FieldKeys[i] = new String(source.FieldKeys[i]);
            }
        }
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "EndpointGroupId", this.EndpointGroupId);
        this.setParamSimple(map, prefix + "CloudRegion", this.CloudRegion);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamSimple(map, prefix + "CloudLogSetId", this.CloudLogSetId);
        this.setParamArraySimple(map, prefix + "FieldKeys.", this.FieldKeys);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);

    }
}

