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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchDashboardSubscribeRequest extends AbstractModel {

    /**
    * Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) API.
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * Dashboard subscription data.
    */
    @SerializedName("SubscribeData")
    @Expose
    private DashboardSubscribeData SubscribeData;

    /**
    * Dashboard subscription Id. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1).
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Dashboard subscription Name. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) API. 
     * @return DashboardId Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) API.
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) API.
     * @param DashboardId Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) API.
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get Dashboard subscription data. 
     * @return SubscribeData Dashboard subscription data.
     */
    public DashboardSubscribeData getSubscribeData() {
        return this.SubscribeData;
    }

    /**
     * Set Dashboard subscription data.
     * @param SubscribeData Dashboard subscription data.
     */
    public void setSubscribeData(DashboardSubscribeData SubscribeData) {
        this.SubscribeData = SubscribeData;
    }

    /**
     * Get Dashboard subscription Id. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1). 
     * @return Id Dashboard subscription Id. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1).
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Dashboard subscription Id. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1).
     * @param Id Dashboard subscription Id. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1).
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Dashboard subscription Name. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1). 
     * @return Name Dashboard subscription Name. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dashboard subscription Name. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1).
     * @param Name Dashboard subscription Name. Obtain through the api [Dashboard subscription list](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public SearchDashboardSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchDashboardSubscribeRequest(SearchDashboardSubscribeRequest source) {
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
        if (source.SubscribeData != null) {
            this.SubscribeData = new DashboardSubscribeData(source.SubscribeData);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamObj(map, prefix + "SubscribeData.", this.SubscribeData);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

