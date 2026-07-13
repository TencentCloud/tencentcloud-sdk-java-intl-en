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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessConnectionRequest extends AbstractModel {

    /**
    * instance ID		
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the vhost name.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Sort by which field. Supported values: channel (number of channels), incoming_bytes (inbound traffic volume), outgoing_bytes (outbound traffic volume).
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * Sorting method: ASC, DESC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * Pagination parameters, started from which data entry
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Connection name fuzzy search
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get instance ID		 
     * @return InstanceId instance ID		
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instance ID		
     * @param InstanceId instance ID		
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the vhost name. 
     * @return VirtualHost Specifies the vhost name.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Specifies the vhost name.
     * @param VirtualHost Specifies the vhost name.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Sort by which field. Supported values: channel (number of channels), incoming_bytes (inbound traffic volume), outgoing_bytes (outbound traffic volume). 
     * @return SortElement Sort by which field. Supported values: channel (number of channels), incoming_bytes (inbound traffic volume), outgoing_bytes (outbound traffic volume).
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set Sort by which field. Supported values: channel (number of channels), incoming_bytes (inbound traffic volume), outgoing_bytes (outbound traffic volume).
     * @param SortElement Sort by which field. Supported values: channel (number of channels), incoming_bytes (inbound traffic volume), outgoing_bytes (outbound traffic volume).
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get Sorting method: ASC, DESC 
     * @return SortType Sorting method: ASC, DESC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Sorting method: ASC, DESC
     * @param SortType Sorting method: ASC, DESC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get Pagination parameters, started from which data entry 
     * @return Offset Pagination parameters, started from which data entry
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameters, started from which data entry
     * @param Offset Pagination parameters, started from which data entry
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page size. 
     * @return Limit Page size.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size.
     * @param Limit Page size.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Connection name fuzzy search 
     * @return Name Connection name fuzzy search
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Connection name fuzzy search
     * @param Name Connection name fuzzy search
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeRabbitMQServerlessConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessConnectionRequest(DescribeRabbitMQServerlessConnectionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.SortElement != null) {
            this.SortElement = new String(source.SortElement);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

