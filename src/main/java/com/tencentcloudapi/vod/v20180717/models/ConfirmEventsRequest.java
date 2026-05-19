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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfirmEventsRequest extends AbstractModel {

    /**
    * Event handler, i.e., the EventSet.EventHandle field in the output parameter of the [event notification pull](https://www.tencentcloud.com/document/product/266/33433?from_cn_redirect=1) API.
Array length limit: 16.
    */
    @SerializedName("EventHandles")
    @Expose
    private String [] EventHandles;

    /**
    * Reserved field, used when special purpose.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Event handler, i.e., the EventSet.EventHandle field in the output parameter of the [event notification pull](https://www.tencentcloud.com/document/product/266/33433?from_cn_redirect=1) API.
Array length limit: 16. 
     * @return EventHandles Event handler, i.e., the EventSet.EventHandle field in the output parameter of the [event notification pull](https://www.tencentcloud.com/document/product/266/33433?from_cn_redirect=1) API.
Array length limit: 16.
     */
    public String [] getEventHandles() {
        return this.EventHandles;
    }

    /**
     * Set Event handler, i.e., the EventSet.EventHandle field in the output parameter of the [event notification pull](https://www.tencentcloud.com/document/product/266/33433?from_cn_redirect=1) API.
Array length limit: 16.
     * @param EventHandles Event handler, i.e., the EventSet.EventHandle field in the output parameter of the [event notification pull](https://www.tencentcloud.com/document/product/266/33433?from_cn_redirect=1) API.
Array length limit: 16.
     */
    public void setEventHandles(String [] EventHandles) {
        this.EventHandles = EventHandles;
    }

    /**
     * Get Reserved field, used when special purpose. 
     * @return ExtInfo Reserved field, used when special purpose.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used when special purpose.
     * @param ExtInfo Reserved field, used when special purpose.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public ConfirmEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfirmEventsRequest(ConfirmEventsRequest source) {
        if (source.EventHandles != null) {
            this.EventHandles = new String[source.EventHandles.length];
            for (int i = 0; i < source.EventHandles.length; i++) {
                this.EventHandles[i] = new String(source.EventHandles[i]);
            }
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventHandles.", this.EventHandles);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

