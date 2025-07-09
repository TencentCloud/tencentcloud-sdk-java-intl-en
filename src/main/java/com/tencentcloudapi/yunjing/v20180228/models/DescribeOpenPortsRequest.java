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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOpenPortsRequest extends AbstractModel {

    /**
    * CWP agent `Uuid`. Either `Port` or `Uuid` must be specified. If `Uuid` is specified, it indicates to query the information list under the specified server.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Open port number. Either `Port` or `Uuid` must be specified. If `Port` is specified, it indicates to query the information list under the specified port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Number of results to be returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter.
<li>Port - Uint64 - Required: No - Port number</li>
<li>ProcessName - String - Required: No - Process name</li>
<li>MachineIp - String - Required: No - Private IP of server</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get CWP agent `Uuid`. Either `Port` or `Uuid` must be specified. If `Uuid` is specified, it indicates to query the information list under the specified server. 
     * @return Uuid CWP agent `Uuid`. Either `Port` or `Uuid` must be specified. If `Uuid` is specified, it indicates to query the information list under the specified server.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `Uuid`. Either `Port` or `Uuid` must be specified. If `Uuid` is specified, it indicates to query the information list under the specified server.
     * @param Uuid CWP agent `Uuid`. Either `Port` or `Uuid` must be specified. If `Uuid` is specified, it indicates to query the information list under the specified server.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Open port number. Either `Port` or `Uuid` must be specified. If `Port` is specified, it indicates to query the information list under the specified port. 
     * @return Port Open port number. Either `Port` or `Uuid` must be specified. If `Port` is specified, it indicates to query the information list under the specified port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Open port number. Either `Port` or `Uuid` must be specified. If `Port` is specified, it indicates to query the information list under the specified port.
     * @param Port Open port number. Either `Port` or `Uuid` must be specified. If `Port` is specified, it indicates to query the information list under the specified port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Number of results to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of results to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of results to be returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter.
<li>Port - Uint64 - Required: No - Port number</li>
<li>ProcessName - String - Required: No - Process name</li>
<li>MachineIp - String - Required: No - Private IP of server</li> 
     * @return Filters Filter.
<li>Port - Uint64 - Required: No - Port number</li>
<li>ProcessName - String - Required: No - Process name</li>
<li>MachineIp - String - Required: No - Private IP of server</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
<li>Port - Uint64 - Required: No - Port number</li>
<li>ProcessName - String - Required: No - Process name</li>
<li>MachineIp - String - Required: No - Private IP of server</li>
     * @param Filters Filter.
<li>Port - Uint64 - Required: No - Port number</li>
<li>ProcessName - String - Required: No - Process name</li>
<li>MachineIp - String - Required: No - Private IP of server</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeOpenPortsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOpenPortsRequest(DescribeOpenPortsRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

