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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRouteRequest extends AbstractModel {

    /**
    * ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Route id, obtain through the API [DescribeRoute](https://www.tencentcloud.com/document/product/597/45484?from_cn_redirect=1).
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * AppId of the caller.
    */
    @SerializedName("CallerAppid")
    @Expose
    private Long CallerAppid;

    /**
    * Sets the scheduled deletion time for routes. only public network routes support scheduled deletion. available for any time within the next 24 hours.
    */
    @SerializedName("DeleteRouteTime")
    @Expose
    private String DeleteRouteTime;

    /**
     * Get ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1). 
     * @return InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     * @param InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Route id, obtain through the API [DescribeRoute](https://www.tencentcloud.com/document/product/597/45484?from_cn_redirect=1). 
     * @return RouteId Route id, obtain through the API [DescribeRoute](https://www.tencentcloud.com/document/product/597/45484?from_cn_redirect=1).
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Route id, obtain through the API [DescribeRoute](https://www.tencentcloud.com/document/product/597/45484?from_cn_redirect=1).
     * @param RouteId Route id, obtain through the API [DescribeRoute](https://www.tencentcloud.com/document/product/597/45484?from_cn_redirect=1).
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get AppId of the caller. 
     * @return CallerAppid AppId of the caller.
     */
    public Long getCallerAppid() {
        return this.CallerAppid;
    }

    /**
     * Set AppId of the caller.
     * @param CallerAppid AppId of the caller.
     */
    public void setCallerAppid(Long CallerAppid) {
        this.CallerAppid = CallerAppid;
    }

    /**
     * Get Sets the scheduled deletion time for routes. only public network routes support scheduled deletion. available for any time within the next 24 hours. 
     * @return DeleteRouteTime Sets the scheduled deletion time for routes. only public network routes support scheduled deletion. available for any time within the next 24 hours.
     */
    public String getDeleteRouteTime() {
        return this.DeleteRouteTime;
    }

    /**
     * Set Sets the scheduled deletion time for routes. only public network routes support scheduled deletion. available for any time within the next 24 hours.
     * @param DeleteRouteTime Sets the scheduled deletion time for routes. only public network routes support scheduled deletion. available for any time within the next 24 hours.
     */
    public void setDeleteRouteTime(String DeleteRouteTime) {
        this.DeleteRouteTime = DeleteRouteTime;
    }

    public DeleteRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRouteRequest(DeleteRouteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.CallerAppid != null) {
            this.CallerAppid = new Long(source.CallerAppid);
        }
        if (source.DeleteRouteTime != null) {
            this.DeleteRouteTime = new String(source.DeleteRouteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "CallerAppid", this.CallerAppid);
        this.setParamSimple(map, prefix + "DeleteRouteTime", this.DeleteRouteTime);

    }
}

