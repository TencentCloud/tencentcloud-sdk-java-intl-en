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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUDPListenersRequest extends AbstractModel {

    /**
    * Filter condition that filters by connection ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Filter condition. Exact query by listener IDs.
When ProxyId is specified, the listener will be checked whether it belongs to the connection.
When GroupId is specified, the listener will be checked whether it belongs to the connection group.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Filter condition. Exact query by listener names.
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Filter condition. Exact query by listener ports.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity limit. The default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter condition that filters by connection group ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Filter condition. It supports fuzzy query by ports or listener names. This parameter cannot be used with `ListenerName` or `Port`.
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * Get Filter condition that filters by connection ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time. 
     * @return ProxyId Filter condition that filters by connection ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Filter condition that filters by connection ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time.
     * @param ProxyId Filter condition that filters by connection ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Filter condition. Exact query by listener IDs.
When ProxyId is specified, the listener will be checked whether it belongs to the connection.
When GroupId is specified, the listener will be checked whether it belongs to the connection group. 
     * @return ListenerId Filter condition. Exact query by listener IDs.
When ProxyId is specified, the listener will be checked whether it belongs to the connection.
When GroupId is specified, the listener will be checked whether it belongs to the connection group.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Filter condition. Exact query by listener IDs.
When ProxyId is specified, the listener will be checked whether it belongs to the connection.
When GroupId is specified, the listener will be checked whether it belongs to the connection group.
     * @param ListenerId Filter condition. Exact query by listener IDs.
When ProxyId is specified, the listener will be checked whether it belongs to the connection.
When GroupId is specified, the listener will be checked whether it belongs to the connection group.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Filter condition. Exact query by listener names. 
     * @return ListenerName Filter condition. Exact query by listener names.
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Filter condition. Exact query by listener names.
     * @param ListenerName Filter condition. Exact query by listener names.
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Filter condition. Exact query by listener ports. 
     * @return Port Filter condition. Exact query by listener ports.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Filter condition. Exact query by listener ports.
     * @param Port Filter condition. Exact query by listener ports.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Offset. The default value is 0. 
     * @return Offset Offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0.
     * @param Offset Offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Quantity limit. The default value is 20. 
     * @return Limit Quantity limit. The default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity limit. The default value is 20.
     * @param Limit Quantity limit. The default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter condition that filters by connection group ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time. 
     * @return GroupId Filter condition that filters by connection group ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Filter condition that filters by connection group ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time.
     * @param GroupId Filter condition that filters by connection group ID. You must specify at least one filter condition (ProxyId/GroupId/ListenerId), but ProxyId and GroupId cannot be set at the same time.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Filter condition. It supports fuzzy query by ports or listener names. This parameter cannot be used with `ListenerName` or `Port`. 
     * @return SearchValue Filter condition. It supports fuzzy query by ports or listener names. This parameter cannot be used with `ListenerName` or `Port`.
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set Filter condition. It supports fuzzy query by ports or listener names. This parameter cannot be used with `ListenerName` or `Port`.
     * @param SearchValue Filter condition. It supports fuzzy query by ports or listener names. This parameter cannot be used with `ListenerName` or `Port`.
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    public DescribeUDPListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUDPListenersRequest(DescribeUDPListenersRequest source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

